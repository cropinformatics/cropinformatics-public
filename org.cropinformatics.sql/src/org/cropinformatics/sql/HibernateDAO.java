/*******************************************************************************
 * Copyright 2008 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original authors Jeffrey Morales and Kevin L. Manansala under contract by
 * IRRI, and Guy Davenport (guy.davenport@cropinformatics.com) under contract by
 * CIMMYT. Additional modifications by Guy Davenport after 21 November 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cropinformatics.sql;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cropinformatics.sql.properties.DBMS;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.Property;
import org.cropinformatics.sql.properties.SqlParameter;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.criterion.DetachedCriteria;

/**
 * This class will create 
 * a SessionFactory which will manage sessions for different connections to the database.
 * 
 * @author Guy Davenport
 * @author <A HREF="mailto:j.b.morales@cgiar.org">Jeffrey Morales</A>
 * @author <A HREF="mailto:k.manansala@cgiar.org">Kevin L. Manansala</A>
 * 
 * @version $Id: HibernateDaoImpl.java 20068 2010-10-11 04:54:53Z jbmorales $
 * 
 */
public class HibernateDAO
{
	private final static Log log = LogFactory.getLog(HibernateDAO.class);

	//retry mechanism is used as workaround for the java.io.EOFException on mysql drivers
	private final static int MAXRETRY = 3;

	private SessionFactory sessionFactory;

	private StringBuffer sb = new StringBuffer();

	private DatabaseProperties databaseProperties ;

	private SQLPropertyUtilities sqlUtilities ;

	public HibernateDAO(DatabaseProperties databaseProperties) throws SQLUtilitiesException
	{
		this(databaseProperties, null) ;
	}

	public HibernateDAO(DatabaseProperties databaseProperties, SQLPropertyUtilities sqlUtilities) throws SQLUtilitiesException
	{
		setDatabaseProperties(databaseProperties);

		this.sessionFactory = createSessionFactory(createDatabaseProperties(databaseProperties));

		//Persistence.createEntityManagerFactory(databaseProperties.getPersistenceUnitName(), createDataSourceConfiguration(databaseProperties));

		//this.threadSession = new ThreadLocal<EntityManager>();
		if (sqlUtilities == null)
		{
			try
			{
				this.sqlUtilities = new SimpleSQLPropertyUtilities(databaseProperties.getSqlProperties()) ;
			}
			catch (IOException e)
			{
				log.warn("SQL Utilities not defined! Creating an empty version.") ;
				this.sqlUtilities = new SimpleSQLPropertyUtilities() ;
			}
		}
		else
		{
			this.sqlUtilities = sqlUtilities ;
		}
	}

	public final SQLPropertyUtilities getSqlUtitlites()
	{
		return sqlUtilities;
	}

	/**
	 * Executes a hql query against the persistent store and returns the results.
	 * @param queryString the query to execute.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeQuery(String queryString) throws SQLUtilitiesException 
	{
		try 
		{
			return invokeQuery(queryString, true) ;
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeQuery(String queryString, String[] params, Object[] values) throws SQLUtilitiesException
	{
		try 
		{
			return invokeQuery(queryString, params, values, true);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * Delegates to an internal method.
	 * @param queryString the query to execute.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeQuery(String queryString, Integer startRow, Integer endRow)  throws SQLUtilitiesException
	{
		try 
		{
			return invokeQuery(queryString, startRow, endRow, true);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeQuery(String queryString, String[] params, Object[] values, Integer startRow, Integer endRow) throws SQLUtilitiesException
	{
		try 
		{
			return invokeQuery(queryString, params, values, startRow, endRow, true);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * @param queryString the query to execute.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeSQLQuery(String queryString) throws SQLUtilitiesException 
	{
		try 
		{
			return invokeQuery(queryString, false);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeSQLQuery(String queryString, String[] params, Object[] values) throws SQLUtilitiesException
	{
		try 
		{
			return invokeQuery(queryString, params, values, false);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * Delegates to an internal method.
	 * @param queryString the query to execute.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeSQLQuery(String queryString, Integer startRow, Integer endRow)  throws SQLUtilitiesException
	{
		try 
		{
			return invokeQuery(queryString, startRow, endRow, false);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	/**
	 * Executes a query against the persistent store and returns the results.
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	public List executeSQLQuery(String queryString, String[] params, Object[] values, Integer startRow, Integer endRow) throws SQLUtilitiesException
	{
		try 
		{
			return invokeQuery(queryString, params, values, startRow, endRow, false);
		} 
		catch (final Exception ex) 
		{
			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}
	}

	@SuppressWarnings("rawtypes")
	public final synchronized List executeQuery(SQL query) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query not defined!") ;

		if (!query.getParameters().isEmpty())
			throw new SQLUtilitiesException("Number of arguments must match number of parameters") ;

		try
		{    
			List result = null ;

			String queryString = sqlUtilities.getSQLString(query) ;

			if (queryString != null)
			{
				if (query.isHqlQuery())
					result = executeQuery(queryString) ;
				else
					result = executeSQLQuery(queryString) ;
			}

			return result ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	@SuppressWarnings("rawtypes")
	public final synchronized List executeQuery(SQL query, Object argument) throws SQLUtilitiesException
	{
		return executeQuery(query, argument, true) ;
	}

	@SuppressWarnings("rawtypes")
	public final synchronized List executeQuery(SQL query, Object[] arguments) throws SQLUtilitiesException
	{
		return executeQuery(query, arguments, true) ;
	}

	@SuppressWarnings("rawtypes")
	public final synchronized List executeQuery(SQL query, Object argument, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		return executeQuery(query, new Object[] {argument}, usingStringReplacement) ;
	}

	@SuppressWarnings("rawtypes")
	public final synchronized List executeQuery(SQL query, Object[] arguments, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query not defined!") ;

		try
		{   
			List result = null ;

			String queryString = sqlUtilities.getSQLString(query, arguments) ;

			if (queryString != null)
			{
				if (usingStringReplacement)
				{
					if (query.isHqlQuery())
						result = executeQuery(queryString) ;
					else
						result = executeSQLQuery(queryString) ;
				}
				else
				{
					String[] parameterNames = SimpleSQLPropertyUtilities.getParameterNames(query) ;

					if (arguments == null || parameterNames.length != arguments.length)
						throw new SQLUtilitiesException("Number of arguments must match number of parameters") ;

					result = invokeQuery(queryString, parameterNames, arguments, query.isHqlQuery()) ;
				}
			}

			return result ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	@SuppressWarnings("rawtypes")
	public List executeQuery(SQL query, Integer startRow, Integer endRow) throws SQLUtilitiesException
	{
		try
		{
			List result = null;

			String queryString = getQueryString(query) ;

			if (queryString != null)
			{
				result = invokeQuery(queryString, startRow, endRow, query.isHqlQuery());
			}

			return result;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public List executeQuery(SQL query, Object argument, Integer startRow,
			Integer endRow) throws SQLUtilitiesException
	{
		return executeQuery(query, argument, startRow, endRow, true) ;
	}

	@SuppressWarnings("rawtypes")
	public List executeQuery(SQL query, Object[] arguments, Integer startRow,
			Integer endRow) throws SQLUtilitiesException
	{
		return executeQuery(query, arguments, startRow, endRow, true) ;
	}

	@SuppressWarnings("rawtypes")
	public List executeQuery(SQL query, Object argument, Integer startRow,
			Integer endRow, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		return executeQuery(query, new Object[] {argument}, startRow, endRow, usingStringReplacement) ;
	}

	@SuppressWarnings("rawtypes")
	public List executeQuery(SQL query, Object[] arguments, Integer startRow,Integer endRow, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query not defined!") ;

		try
		{   
			List result = null ;

			String queryString = null ;

			if (query instanceof SQLQuery)
			{
				queryString = ((SQLQuery)query).getQueryString() ;
			}
			else
			{
				if (query instanceof SQLFile)
				{
					queryString = sqlUtilities.readSQLFile(((SQLFile)query)) ;
				}
			}

			if (queryString != null)
			{
				if (usingStringReplacement)
				{
					SqlParameter[] parameters = query.getParameters().toArray(new SqlParameter[query.getParameters().size()]) ;

					queryString = SimpleSQLPropertyUtilities.parameterise(queryString, parameters, arguments) ;

					result = invokeQuery(queryString, startRow, endRow, query.isHqlQuery()) ;
				}
				else
				{
					String[] parameterNames = SimpleSQLPropertyUtilities.getParameterNames(query) ;

					if (arguments == null || parameterNames.length != arguments.length)
						throw new SQLUtilitiesException("Number of arguments must match number of parameters") ;

					result = invokeQuery(queryString, parameterNames, arguments, startRow, endRow, query.isHqlQuery()) ;
				}

			}

			return result ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public synchronized void executeUpdate(String queryString) throws SQLUtilitiesException
	{
		if (queryString != null && queryString.length() > 0)
		{
			try
			{
				invokeUpdate(queryString, true) ;
			}
			catch (Exception e)
			{
				throw new SQLUtilitiesException(e.getMessage(), e) ;
			}
		}
		else
		{
			throw new SQLUtilitiesException("Query string not defined!") ;
		}
	}

	public synchronized void executeUpdate(String queryString, String[] parameterNames, Object[] arguments) throws SQLUtilitiesException
	{
		if (queryString != null && queryString.length() > 0)
		{
			try
			{
				invokeUpdate(queryString, parameterNames, arguments, true) ;
			}
			catch (Exception e)
			{
				throw new SQLUtilitiesException(e.getMessage(), e) ;
			}
		}
		else
		{
			throw new SQLUtilitiesException("Query string not defined!") ;
		}
	}

	public synchronized void executeUpdate(String queryString, SqlParameter[] parameters, Object[] arguments, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		if (queryString != null && queryString.length() > 0)
		{
			try
			{
				if (usingStringReplacement)
				{
					queryString = SimpleSQLPropertyUtilities.parameterise(queryString, parameters, arguments) ;

					invokeUpdate(queryString, true) ;
				}
				else
				{
					String[] parameterNames = SimpleSQLPropertyUtilities.getParameterNames(parameters) ;

					invokeUpdate(queryString, parameterNames, arguments, true) ;
				}
			}
			catch (Exception e)
			{
				throw new SQLUtilitiesException(e.getMessage(), e) ;
			}
		}
		else
		{
			throw new SQLUtilitiesException("Query string not defined!") ;
		}
	}

	public synchronized void executeSQLUpdate(String queryString) throws SQLUtilitiesException
	{
		if (queryString != null && queryString.length() > 0)
		{
			try
			{
				invokeUpdate(queryString, false) ;
			}
			catch (Exception e)
			{
				throw new SQLUtilitiesException(e.getMessage(), e) ;
			}
		}
		else
		{
			throw new SQLUtilitiesException("Query string not defined!") ;
		}
	}

	public synchronized void executeSQLUpdate(String queryString, String[] parameterNames, Object[] arguments) throws SQLUtilitiesException
	{
		if (queryString != null && queryString.length() > 0)
		{
			try
			{
				invokeUpdate(queryString, parameterNames, arguments, false) ;
			}
			catch (Exception e)
			{
				throw new SQLUtilitiesException(e.getMessage(), e) ;
			}
		}
		else
		{
			throw new SQLUtilitiesException("Query string not defined!") ;
		}
	}

	public synchronized void executeSQLUpdate(String queryString, SqlParameter[] parameters, Object[] arguments, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		if (queryString != null && queryString.length() > 0)
		{
			try
			{
				if (usingStringReplacement)
				{
					queryString = SimpleSQLPropertyUtilities.parameterise(queryString, parameters, arguments) ;

					invokeUpdate(queryString, true) ;
				}
				else
				{
					String[] parameterNames = SimpleSQLPropertyUtilities.getParameterNames(parameters) ;

					invokeUpdate(queryString, parameterNames, arguments, false) ;
				}
			}
			catch (Exception e)
			{
				throw new SQLUtilitiesException(e.getMessage(), e) ;
			}
		}
		else
		{
			throw new SQLUtilitiesException("Query string not defined!") ;
		}
	}

	public synchronized final void executeUpdate(SQL query) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query not defined!") ;

		if (!query.getParameters().isEmpty())
			throw new SQLUtilitiesException("Number of arguments must match number of parameters") ;

		try
		{    
			String queryString = null ;

			if (query instanceof SQLQuery)
			{
				queryString = ((SQLQuery)query).getQueryString() ;
			}
			else
			{
				if (query instanceof SQLFile)
				{
					queryString = sqlUtilities.readSQLFile(((SQLFile)query)) ;
				}
			}

			if (queryString != null)
			{   		
				invokeUpdate(queryString, query.isHqlQuery()) ;
			}
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public synchronized final void executeUpdate(SQL query, Object argument, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		executeUpdate(query, new Object[] {argument}, usingStringReplacement) ;
	}

	public synchronized final void executeUpdate(SQL query, Object[] arguments, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		try
		{    
			if (query == null)
				throw new SQLUtilitiesException("Query not defined!") ;

			String queryString = null ;
			String[] parameterNames = SimpleSQLPropertyUtilities.getParameterNames(query) ;

			if (arguments == null || parameterNames.length != arguments.length)
				throw new SQLUtilitiesException("Number of arguments must match number of parameters") ;

			if (query instanceof SQLQuery)
			{
				queryString = ((SQLQuery)query).getQueryString() ;
			}
			else
			{
				if (query instanceof SQLFile)
				{
					queryString = sqlUtilities.readSQLFile(((SQLFile)query)) ;
				}
			}

			if (usingStringReplacement)
			{
				SqlParameter[] parameters = query.getParameters().toArray(new SqlParameter[query.getParameters().size()]) ;

				queryString = SimpleSQLPropertyUtilities.parameterise(queryString, parameters, arguments) ;

				invokeUpdate(queryString, query.isHqlQuery()) ;
			}
			else
			{
				invokeUpdate(queryString, parameterNames, arguments, query.isHqlQuery()) ;
			}
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public synchronized final void executeUpdates(SQLFile query) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query file not defined!") ;

		try
		{
			List<String> updates = sqlUtilities.parseSQLFile(query, false) ;
			Iterator<String> iterator = updates.iterator() ;

			while (iterator.hasNext())
				invokeUpdate(iterator.next(), query.isHqlQuery()) ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public synchronized final void executeUpdates(SQLFile query, Object argument, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		executeUpdates(query, new Object[] {argument}, usingStringReplacement) ;
	}

	public synchronized final void executeUpdates(SQLFile query, Object[] arguments, boolean usingStringReplacement) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query file not defined!") ;

		try
		{
			Iterator<String> iterator = sqlUtilities.parseSQLFile(query, false).iterator() ;

			SqlParameter[] parameterArray = SimpleSQLPropertyUtilities.getParameters(query) ;

			while (iterator.hasNext())
				executeUpdate(iterator.next(), parameterArray, arguments, usingStringReplacement) ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public String getQueryString(SQL query) throws SQLUtilitiesException 
	{
		if (query == null)
			throw new SQLUtilitiesException("Query not defined!");

		if (!query.getParameters().isEmpty())
			throw new SQLUtilitiesException(
			"Number of arguments must match number of parameters");

		try
		{
			@SuppressWarnings({ "rawtypes", "unused" })
			List result = null;

			String queryString = null;

			if (query instanceof SQLQuery)
			{
				queryString = ((SQLQuery) query).getQueryString();
			}
			else
			{
				if (query instanceof SQLFile)
				{
					queryString = sqlUtilities.readSQLFile((SQLFile) query);
				}
			}

			return queryString;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e);
		}	
	}

	/**
	 * Gets a query from the internal SQL Properties associated with this DAO, and swaps 
	 * in any arguments
	 * @param query the query.
	 * @param argument argument in the query.
	 * @return the query string.
	 */
	public String getQueryString(SQL query, Object argument) throws SQLUtilitiesException
	{
		return getQueryString(query, new Object[] {argument}) ;
	}

	/**
	 * Gets a query from the internal SQL Properties associated with this DAO, and swaps 
	 * in any arguments
	 * @param query the query to execute.
	 * @param arguments array of arguments in the query.
	 * @return List result of the query.
	 */
	public String getQueryString(SQL query, Object[] arguments) throws SQLUtilitiesException
	{
		if (query == null)
			throw new SQLUtilitiesException("Query not defined!") ;

		try
		{   
			String queryString = null ;

			if (query instanceof SQLQuery)
			{
				queryString = ((SQLQuery)query).getQueryString() ;
			}
			else
			{
				if (query instanceof SQLFile)
				{
					queryString = sqlUtilities.readSQLFile(((SQLFile)query)) ;
				}
			}

			if (queryString != null)
			{
				SqlParameter[] parameters = query.getParameters().toArray(new SqlParameter[query.getParameters().size()]) ;

				queryString = SimpleSQLPropertyUtilities.parameterise(queryString, parameters, arguments) ;
			}

			return queryString ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	/**
	 * Gets the Current Entity Manager and then begins a transaction
	 * @return 
	 */
	public synchronized Transaction beginTransaction() throws HibernateException
	{
		return getCurrentSession().beginTransaction() ;
	}

	/**
	 * Gets the Current Entity Manager and then commits a transaction
	 */
	public synchronized void commitTransaction() throws HibernateException
	{
		if (getCurrentSession().getTransaction().isActive())
			getCurrentSession().getTransaction().commit() ;
	}

	/**
	 * Gets the Current Entity Manager and then rollbacks a transaction
	 */
	public synchronized void rollbackTransaction() throws HibernateException
	{
		getCurrentSession().getTransaction().rollback() ;
	}

	private void setDatabaseProperties(DatabaseProperties databaseProperties) 
	{
		this.databaseProperties = databaseProperties;
	}

	public DatabaseProperties getDatabaseProperties()
	{
		return databaseProperties;
	}
	
	public Object get(@SuppressWarnings("rawtypes") Class clazz, String uniqueIdentifer) throws HibernateException
	{
		return getCurrentSession().get(clazz.getSimpleName(), uniqueIdentifer) ;
	}

	public void persist(Object transientEntity) throws HibernateException
	{
		getCurrentSession().persist(transientEntity) ;
	}

	public void update(Object detachedEntity) throws HibernateException
	{
		getCurrentSession().update(detachedEntity) ;
	}	

	public void saveOrUpdate(Object attachedEntity) throws HibernateException
	{
		getCurrentSession().saveOrUpdate(attachedEntity);
	}	

	public Object merge(Object detachedEntity) throws HibernateException
	{
		return getCurrentSession().merge(detachedEntity) ;
	}		

	public void delete(Object attachedEntity) throws HibernateException 
	{
		getCurrentSession().delete(attachedEntity) ;
	}
	
	public void evict(Object attachedEntity) throws HibernateException 
	{
		getCurrentSession().evict(attachedEntity) ;
	}
	
	public Object read(@SuppressWarnings("rawtypes") Class type, Serializable id) throws HibernateException
	{
		return getCurrentSession().get(type, id);
	}

	public Object readWithLock(@SuppressWarnings("rawtypes") Class type, Serializable id, LockOptions lockOptions) throws HibernateException
	{
		return getCurrentSession().get(type, id, lockOptions);
	}

	public Criteria createCriteria(@SuppressWarnings("rawtypes") Class classObject) 
	{
		return getCurrentSession().createCriteria(classObject) ;
	}
	
	public Criteria createCriteria(DetachedCriteria query) 
	{
		return query.getExecutableCriteria(getCurrentSession()) ;
	}

	public final Object persistQueryWithTransaction(String object) throws HibernateException
	{			
		Serializable returnedEntity = null ;

		if (object != null)
		{
			try
			{
				beginTransaction() ;

				persist(object) ;

				commitTransaction() ;
			}
			catch (HibernateException e)
			{
				rollbackTransaction() ;

				throw e ; 
			}
		}

		return returnedEntity ;
	}


	public final void updateWithTransaction(Object object) throws HibernateException
	{
		if (object != null)
		{
			try
			{
				beginTransaction() ;

				update(object) ;

				commitTransaction() ;
			}
			catch (HibernateException e)
			{
				rollbackTransaction() ;

				throw e ;
			}
		}
	}

	public final void saveOrUpdateWithTransaction(Object object) throws HibernateException
	{
		if (object != null)
		{
			try
			{
				beginTransaction() ;

				saveOrUpdate(object) ;

				commitTransaction() ;
			}
			catch (HibernateException e)
			{
				rollbackTransaction() ;

				throw e ;
			}
		}
	}

	public final void mergeWithTransaction(Object object) throws HibernateException
	{
		if (object != null)
		{
			try
			{
				beginTransaction() ;

				merge(object) ;

				commitTransaction() ;
			}
			catch (HibernateException e)
			{
				rollbackTransaction() ;

				throw e ;
			}
		}
	}

	public final void deleteWithTransaction(Object object) throws HibernateException
	{
		if (object != null)
		{
			try
			{
				beginTransaction() ;

				delete(object) ;

				commitTransaction() ;
			}
			catch (HibernateException e)
			{
				rollbackTransaction() ;

				throw e ;
			}
		}
	}


	public static final Properties createDatabaseProperties(DatabaseProperties databaseProperties) throws SQLUtilitiesException 
	{
		boolean usernameRequired = true ;
		boolean passwordRequired = true ;

		String host = databaseProperties.getServerURL();
		Integer port = databaseProperties.getPort();
		String name = databaseProperties.getDatabaseName();
		String username = databaseProperties.getUsername();
		String password = databaseProperties.getPassword();

		// create jpa database dao
		Properties databasePropertiesMap = new Properties();

		Iterator<Property> additionalProperties = databaseProperties.getAdditionalProperties().iterator() ;

		Property property ;

		while (additionalProperties.hasNext())
		{
			property = additionalProperties.next() ;
			databasePropertiesMap.put(property.getKey(), property.getValue()) ;
		}

		if (databaseProperties != null)
		{
			if (databaseProperties.getDBMS().equals(DBMS.HSQLDB))
			{
				if (port == null)
					port = 9001 ;

				databasePropertiesMap.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "org.hibernate.context.ThreadLocalSessionContext");

				databasePropertiesMap.setProperty(Environment.URL, "jdbc:hsqldb:file:" + host + "/" + name);

				// DBC connection pool (use the built-in)
				databasePropertiesMap.setProperty(Environment.POOL_SIZE,"1") ;

				// Disable the second-level cache
				databasePropertiesMap.setProperty(Environment.CACHE_PROVIDER, "org.hibernate.cache.NoCacheProvider") ;

				// Drop and re-create the database schema on startup
				//databasePropertiesMap.put("hbm2ddl.auto", "update") ;

				// Defaults for hsqldb
				databasePropertiesMap.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
				databasePropertiesMap.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());
				databasePropertiesMap.setProperty(Environment.USER, "sa");
				databasePropertiesMap.setProperty(Environment.PASS, "");
			}
			else 
			{
				if (databaseProperties.getDBMS().equals(DBMS.MY_SQL))
				{
					if (port == null)
						port = 3306 ;

					databasePropertiesMap.setProperty(Environment.TRANSACTION_STRATEGY, "org.hibernate.transaction.JDBCTransactionFactory");

					databasePropertiesMap.setProperty(Environment.URL, "jdbc:mysql://" + host + ":" + port + "/" + name + "?autoReconnect=true");

					databasePropertiesMap.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

					// Defaults for MySQL
					databasePropertiesMap.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
					databasePropertiesMap.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver") ;
				}
				else
				{
					if (databaseProperties.getDBMS().equals(DBMS.PG_SQL))
					{
						if (port == null)
							port = 3306 ;

						databasePropertiesMap.put(Environment.TRANSACTION_STRATEGY, "org.hibernate.transaction.JDBCTransactionFactory");

						databasePropertiesMap.put(Environment.URL, "jdbc:postgresql://" + host + ":" + port + "/" + name);

						databasePropertiesMap.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

						// Defaults for PgSQL
						databasePropertiesMap.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
						databasePropertiesMap.put(Environment.DRIVER, "org.postgresql.Driver") ;
					}
					else
					{
						if (databaseProperties.getDBMS().equals(DBMS.SQ_LITE))
						{
							if (port == null)
								port = 3306 ;

							usernameRequired = false ;
							passwordRequired = false ;

							//databasePropertiesMap.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "org.hibernate.context.ThreadLocalSessionContext");

							databasePropertiesMap.setProperty(Environment.URL, "jdbc:sqlite:" + host + "/" + name);

							// DBC connection pool (use the built-in)
							//databasePropertiesMap.setProperty(Environment.POOL_SIZE,"1") ;

							// Disable the second-level cache
							//databasePropertiesMap.setProperty(Environment.CACHE_PROVIDER, "org.hibernate.cache.NoCacheProvider") ;

							// Drop and re-create the database schema on startup
							//databasePropertiesMap.put("hbm2ddl.auto", "update") ;

							// Defaults for hsqldb
							databasePropertiesMap.setProperty(Environment.DRIVER, "org.sqlite.JDBC");
							//databasePropertiesMap.setProperty(Environment.DIALECT, org.hibernate.dialect..class.getName());
							//databasePropertiesMap.setProperty(Environment.USER, "sa");
							//databasePropertiesMap.setProperty(Environment.PASS, "");
						}
						else
						{
							throw new IllegalArgumentException("DBMS was not provided or is not supported.");
						}
					}
				}
			}

			// override if necessary
			if (databaseProperties.getDriverClassName() != null)
				databasePropertiesMap.put(Environment.DRIVER, databaseProperties.getDriverClassName());

			if (databaseProperties.getDialect() != null)
				databasePropertiesMap.put(Environment.DIALECT, databaseProperties.getDialect()) ;

			if (usernameRequired)
				if (usernameRequired && username != null && username.trim().length() > 0)
					databasePropertiesMap.put(Environment.USER, username);
				else
					throw new IllegalArgumentException("Database username was not provided.") ;

			if (passwordRequired)
				if (password != null)
					databasePropertiesMap.put(Environment.PASS, password);
				else
					throw new IllegalArgumentException("Database password was not provided.");

			databasePropertiesMap.put(Environment.AUTO_CLOSE_SESSION, "false");

			// to turn off logging of sql statements
			//databasePropertiesMap.put(Environment.SHOW_SQL, "true");
			//databasePropertiesMap.put(Environment.FORMAT_SQL, "true");
			//databasePropertiesMap.put(Environment.USE_SQL_COMMENTS, "true");
			databasePropertiesMap.put("hibernate.jdbc.batch_size", 0) ;
		}

		return databasePropertiesMap;

	}

	public void close()
	{
		try
		{
			if (!sessionFactory.isClosed())
			{
				if (databaseProperties.getDBMS().equals(DBMS.PG_SQL))
				{
					Transaction transaction = null ;
					try
					{
						transaction = this.beginTransaction() ;

						invokeQuery("SHUTDOWN", false) ;

						transaction.commit() ;
					}
					catch (Exception e)
					{
						if (transaction != null)
							transaction.rollback() ;

						e.printStackTrace();
					}
				}
				this.sessionFactory.close();
			}
		}
		catch(IllegalStateException ex)
		{
			log.error(ex) ;
		}
	}

	public List<String> parseSQLFile(SQLFile sqlFile) throws IOException, SQLUtilitiesException
	{
		return sqlUtilities.parseSQLFile(sqlFile, true);
	}

	public final boolean hasSQLGroup(String id)
	{
		return sqlUtilities.hasSQLGroup(id) ;
	}

	public final SQLGroup getSQLGroup(String id) throws SQLUtilitiesException
	{
		try
		{
			return sqlUtilities.getSQLGroup(id) ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public boolean hasSQLQuery(String groupId, String id) 
	{
		try
		{
			if (hasSQLGroup(groupId))
				return sqlUtilities.getSQLGroup(groupId).hasSQLQuery(id) ;
			else
				return false ;
		}
		catch (Exception e)
		{
			return false ;
		}
	}

	public SQLQuery getSQLQuery(String groupId, String id) throws SQLUtilitiesException 
	{
		try
		{
			return getSQLGroup(groupId).getSQLQuery(id, getDatabaseProperties().getDBMS().name()) ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	public boolean hasSQLFile(String groupId, String id)
	{
		try
		{
			if (hasSQLGroup(groupId))
				return sqlUtilities.getSQLGroup(groupId).hasSQLFile(id) ;
			else
				return false ;
		}
		catch (Exception e)
		{
			return false ;
		}
	}

	public SQLFile getSQLFile(String groupId, String id) throws SQLUtilitiesException
	{
		try
		{
			return getSQLGroup(groupId).getSQLFile(id, getDatabaseProperties().getDBMS().name()) ;
		}
		catch (Exception e)
		{
			throw new SQLUtilitiesException(e.getMessage(), e) ;
		}
	}

	protected SessionFactory createSessionFactory(Properties properties)
	{
		return new Configuration().addProperties(properties).buildSessionFactory() ;
		//return new Configuration().configure().setProperties(properties).buildSessionFactory() ;
	}

	private Integer getEndRow(Integer endRow) 
	{
		return (endRow >= 0 ? (endRow <= Integer.MAX_VALUE - 1 ? endRow : Integer.MAX_VALUE - 1) : 0);
	}

	private Integer getNumberOfRows(Integer startRow, Integer endRow) 
	{
		final Integer newStartRow = getStartRow(startRow);
		final Integer newEndRow = getEndRow(endRow);
		Integer numberOfRows = (newEndRow >= 0 ? (newEndRow+1) - newStartRow : 0);
		//return (numberOfRows < maxRows ? numberOfRows : maxRows);
		return (numberOfRows);
	}

	private Integer getStartRow(Integer startRow) 
	{
		//make sure no negative integer is returned
		return (startRow >= 0 ? startRow : 0);
	}

	/**
	 * Executes a query against the persistent store and returns the results.  This is where the call
	 * to the database happens (through EntityManager).  This method is called by the methods which names
	 * start with "execute".
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @param hqlQuery boolean - true if queryString is native sql; false if hql/jpa .
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	private List invokeQuery(final String queryString, final String[] params, final Object[] values, final boolean hqlQuery) throws Exception
	{
		List toreturn = null;
		Integer newStartRow = 0;
		Integer newEndRow = 0;
		int retry = 0;

		//retry queries in case mysql exception (bug) is encountered 
		while (retry <= MAXRETRY)
		{
			try
			{

				this.sessionFactory.getCurrentSession().beginTransaction();

				Query query = null;

				if (hqlQuery)
				{
					query = this.sessionFactory.getCurrentSession().createQuery(queryString);
				}
				else
				{
					query = this.sessionFactory.getCurrentSession().createSQLQuery(queryString);
				}

				if (params!=null)
				{
					//for setting named parameters
					int length = params.length;
					for (int index = 0; index < length; index++) 
					{
						if (!(values[index] instanceof Set || values[index] instanceof List || values[index] instanceof Map)) 
						{
							query.setParameter(params[index], values[index]);
						}
					}
				}
				else
				{
					//for setting parameters by order
					int length = values.length;
					for (int index = 0; index < length; index++) 
					{
						if (!(values[index] instanceof Set || values[index] instanceof List || values[index] instanceof Map)) 
						{
							query.setParameter(index, values[index]);
						}
					}
				}

				query.setFirstResult(newStartRow);
				query.setMaxResults(getNumberOfRows(newStartRow, newEndRow));

				if (log.isInfoEnabled()) 
				{
					sb.setLength(0);
					sb.append("Executing query: ");
					sb.append(queryString);
					sb.append("; for rows: ");
					log.debug(sb.toString());
				}

				toreturn = query.list();
				break;
			}
			catch (Exception e)
			{
				retry++;
				if (retry > MAXRETRY)
				{
					if (log.isErrorEnabled()) 
					{
						sb.setLength(0);
						sb.append("Unable to execute query: ");
						sb.append(queryString);
						sb.append("; with params = ");
						sb.append(params);
						sb.append(", and values = ");
						sb.append(values);
						sb.append("; for rows: ");
						sb.append("; error: ");
						sb.append(e.getMessage());
						log.error(sb.toString());
					}
					throw e;
				}

				log.error("Will do retry #" + retry + "; reason:" + e.getMessage());
			}
		}

		return toreturn;
	}

	/**
	 * Executes a query against the persistent store and returns the results.  This is where the call
	 * to the database happens (through EntityManager).  This method is called by the methods which names
	 * start with "execute".
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @param hqlQuery boolean - true if queryString is native sql; false if hql/jpa .
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	private List invokeQuery(final String queryString, final String[] params, final Object[] values, final Integer startRow, final Integer endRow, final boolean hqlQuery) throws Exception
	{
		List toreturn = null;
		Integer newStartRow = 0;
		Integer newEndRow = 0;
		int retry = 0;

		//retry queries in case mysql exception (bug) is encountered 
		while (retry <= MAXRETRY)
		{
			try
			{

				this.sessionFactory.getCurrentSession().beginTransaction();

				Query query = null;

				newStartRow = getStartRow(startRow);
				newEndRow = getEndRow(endRow);

				if (hqlQuery)
				{
					query = this.sessionFactory.getCurrentSession().createQuery(queryString);
				}
				else
				{
					query = this.sessionFactory.getCurrentSession().createSQLQuery(queryString);
				}

				if (params!=null)
				{
					//for setting named parameters
					int length = params.length;
					for (int index = 0; index < length; index++) 
					{
						if (!(values[index] instanceof Set || values[index] instanceof List || values[index] instanceof Map)) 
						{
							query.setParameter(params[index], values[index]);
						}
					}
				}
				else
				{
					//for setting parameters by order
					int length = values.length;
					for (int index = 0; index < length; index++) 
					{
						if (!(values[index] instanceof Set || values[index] instanceof List || values[index] instanceof Map)) 
						{
							query.setParameter(index, values[index]);
						}
					}
				}

				query.setFirstResult(newStartRow);
				query.setMaxResults(getNumberOfRows(newStartRow, newEndRow));

				if (log.isInfoEnabled()) 
				{
					sb.setLength(0);
					sb.append("Executing query: ");
					sb.append(queryString);
					sb.append("; for rows: ");
					sb.append(startRow);
					sb.append(" to ");
					sb.append(endRow);
					log.debug(sb.toString());
				}

				toreturn = query.list();
				break;
			}
			catch (Exception e)
			{
				retry++;
				if (retry > MAXRETRY)
				{
					if (log.isErrorEnabled()) 
					{
						sb.setLength(0);
						sb.append("Unable to execute query: ");
						sb.append(queryString);
						sb.append("; with params = ");
						sb.append(params);
						sb.append(", and values = ");
						sb.append(values);
						sb.append("; for rows: ");
						sb.append(startRow);
						sb.append(" to ");
						sb.append(endRow);
						sb.append("; error: ");
						sb.append(e.getMessage());
						log.error(sb.toString());
					}
					throw e;
				}

				log.error("Will do retry #" + retry + "; reason:" + e.getMessage());
			}
		}

		return toreturn;
	}

	/**
	 * Executes a query against the persistent store and returns the results.  This is for queries
	 * that don't have parameters
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @param hqlQuery boolean - true if queryString is native sql; false if hql/jpa .
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	private List invokeQuery(final String queryString, final Integer startRow, final Integer endRow, final boolean hqlQuery)
	throws Exception
	{
		List toreturn = null;
		Integer newStartRow = 0;
		Integer newEndRow = 0;
		int retry = 0;

		while (retry<MAXRETRY)
		{
			try
			{
				Query query = null;
				newStartRow = getStartRow(startRow);
				newEndRow = getEndRow(endRow);

				if (hqlQuery)
				{
					query = this.sessionFactory.getCurrentSession().createQuery(queryString);
				}
				else
				{
					query = this.sessionFactory.getCurrentSession().createSQLQuery(queryString);

				}

				query.setFirstResult(newStartRow);
				query.setMaxResults(getNumberOfRows(newStartRow, newEndRow));

				if (log.isInfoEnabled()) 
				{
					sb.setLength(0);
					sb.append("Executing query: ");
					sb.append(queryString);
					sb.append("; for rows: ");
					sb.append(startRow);
					sb.append(" to ");
					sb.append(endRow);
					log.debug(sb.toString());
				}

				toreturn =  query.list();
				break;
			}
			catch (Exception e)
			{
				retry++;
				log.error("Will do retry #"+retry+"; reason:"+e.getMessage());
				if (retry>MAXRETRY)
				{
					if (log.isErrorEnabled()) 
					{
						sb.setLength(0);
						sb.append("Unable to execute query: ");
						sb.append(queryString);
						sb.append("; for rows: ");
						sb.append(startRow);
						sb.append(" to ");
						sb.append(endRow);
						sb.append("; error: ");
						sb.append(e.getMessage());
						log.error(sb.toString());
					}

					throw e;
				}
			}
		}

		return toreturn;
	}

	/**
	 * Executes a query against the persistent store and returns the results.  This is for queries
	 * that don't have parameters
	 * @param queryString the query to execute.
	 * @param params array of parameter names in the query.
	 * @param values array of values corresponding to the parameters.
	 * @param startRow start row to retrieve.
	 * @param endRow end row to retrieve.
	 * @param hqlQuery boolean - true if queryString is native sql; false if hql/jpa .
	 * @return List result of the query.
	 */
	@SuppressWarnings("rawtypes")
	private List invokeQuery(final String queryString, final boolean hqlQuery)
	throws Exception
	{
		List toreturn = null;

		int retry = 0;

		while (retry<MAXRETRY)
		{
			try
			{
				Query query = null;

				if (hqlQuery)
				{
					query = this.sessionFactory.getCurrentSession().createQuery(queryString);
				}
				else
				{

					query = this.sessionFactory.getCurrentSession().createSQLQuery(queryString);

				}

				if (log.isInfoEnabled()) 
				{
					sb.setLength(0);
					sb.append("Executing query: ");
					sb.append(queryString);
					log.debug(sb.toString());
				}

				toreturn =  query.list();
				break;
			}
			catch (Exception e)
			{
				retry++;
				log.error("Will do retry #"+retry+"; reason:"+e.getMessage());
				if (retry>MAXRETRY)
				{
					throw e;
				}
			}
		}

		return toreturn;
	}

	private synchronized int invokeUpdate(final String queryString, final boolean hqlQuery) throws Exception
	{
		int toreturn = 0;

		try
		{
			Query query = null;

			if (hqlQuery)
			{
				query = getCurrentSession().createQuery(queryString);
			}
			else
			{
				query = getCurrentSession().createSQLQuery(queryString);
			}

			if (log.isInfoEnabled()) 
			{
				sb.setLength(0);
				sb.append("Executing query: ");
				sb.append(queryString);
				log.debug(sb.toString());
			}

			toreturn =  query.executeUpdate();  

		}
		catch (final Exception ex) 
		{
			if (log.isErrorEnabled()) 
			{
				sb.setLength(0);
				sb.append("Unable to execute query: ");
				sb.append(queryString);
				sb.append("; error: ");
				sb.append(ex.getMessage());
				log.error(sb.toString());
			}

			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}

		return toreturn;
	}

	private synchronized int invokeUpdate(final String queryString, final String[] params, final Object[] values, final boolean hqlQuery) throws Exception
	{
		int toreturn = 0;

		try
		{
			Query query = null;

			if (hqlQuery)
			{
				query = getCurrentSession().createQuery(queryString);
			}
			else
			{
				query = getCurrentSession().createSQLQuery(queryString);
			}

			if (params!=null)
			{
				//for setting named parameters
				int length = params.length;
				for (int index = 0; index < length; index++) 
				{
					if (!(values[index] instanceof Set || values[index] instanceof List || values[index] instanceof Map)) 
					{
						query.setParameter(params[index], values[index]);
					}
				}
			}
			else
			{
				//for setting parameters by order
				int length = values.length;
				for (int index = 0; index < length; index++) 
				{
					if (!(values[index] instanceof Set || values[index] instanceof List || values[index] instanceof Map)) 
					{
						query.setParameter(index+1, values[index]);
					}
				}
			}

			if (log.isInfoEnabled()) 
			{
				sb.setLength(0);
				sb.append("Executing query: ");
				sb.append(queryString);
				log.debug(sb.toString());
			}

			toreturn = query.executeUpdate();
		}
		catch (final Exception ex) 
		{
			if (log.isErrorEnabled()) 
			{
				sb.setLength(0);
				sb.append("Unable to execute query: ");
				sb.append(queryString);
				sb.append("; with params = ");
				sb.append(params);
				sb.append(", and values = ");
				sb.append(values);
				sb.append("; error: ");
				sb.append(ex.getMessage());
				log.error(sb.toString());
			}

			throw new SQLUtilitiesException("Unable to execute query: " + queryString, ex);
		}

		return toreturn;
	}

	private Session getCurrentSession()
	{
		Session session = this.sessionFactory.getCurrentSession();

		if (session == null)
		{
			session = this.sessionFactory.openSession() ;	
		}

		return session;
	}
}
