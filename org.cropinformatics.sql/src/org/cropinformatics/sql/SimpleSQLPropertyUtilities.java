/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy@daveneti.com) under contract by
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.cropinformatics.sql.properties.PropertiesFactory;
import org.cropinformatics.sql.properties.SqlGroup;
import org.cropinformatics.sql.properties.SqlProperties;
import org.eclipse.emf.common.util.URI;

public class SimpleSQLPropertyUtilities extends AbstractSQLPropertyUtilities
{
	private HashMap<String, SQLGroup> sqlGroups;
	private SqlProperties properties;
	@SuppressWarnings("rawtypes")
  private Class classObject ;
	
	/**
   * @param propertiesFile
	 * @throws FileNotFoundException 
   */
  private SimpleSQLPropertyUtilities(@SuppressWarnings("rawtypes") Class classObject)
  {
  	sqlGroups = new HashMap<String, SQLGroup>() ;
  	this.classObject = classObject != null ? classObject : SimpleSQLPropertyUtilities.class ;
  	properties = PropertiesFactory.eINSTANCE.createSqlProperties() ;
  }
	
	/**
   * @param propertiesFile
	 * @throws FileNotFoundException 
   */
  public SimpleSQLPropertyUtilities()
  {
  	this(SimpleSQLPropertyUtilities.class) ;
  }
  
	/**
   * @param propertiesFile
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(String propertiesFile) throws IOException
  {
	  this(URI.createFileURI(propertiesFile), SimpleSQLPropertyUtilities.class);
  }
  
	/**
	 * @param propertiesFile
	 * @param objectClass
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(String propertiesFile, @SuppressWarnings("rawtypes") Class classObject) throws IOException
  {
	  this(URI.createFileURI(propertiesFile), classObject);
  }
  
	/**
   * @param propertiesFile
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(File propertiesFile) throws IOException
  {
	  this(URI.createFileURI(propertiesFile.getAbsolutePath()), SimpleSQLPropertyUtilities.class);
  }
  
	/**
	 * 
	 * @param propertiesFile
	 * @param objectClass
	 * @throws IOException 
	 */
  public SimpleSQLPropertyUtilities(File propertiesFile, @SuppressWarnings("rawtypes") Class classObject) throws IOException
  {
	  this(URI.createFileURI(propertiesFile.getAbsolutePath()), classObject);
  }
  
	/**
   * @param propertiesFile
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(URI uri) throws IOException
  {
	  this(uri, SimpleSQLPropertyUtilities.class);
  }
  
	/**
	 * 
	 * @param propertiesFile
	 * @param objectClass
	 * @throws IOException 
	 */
  public SimpleSQLPropertyUtilities(URI uri, @SuppressWarnings("rawtypes") Class classObject) throws IOException
  {
	  this(classObject) ;
	  
  	load(load(uri)) ;
  }


	/**
   * @param inputStream
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(InputStream inputStream) throws IOException
  {
	  this(inputStream, SimpleSQLPropertyUtilities.class);
  }
  
	/**
   * @param inputStream
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(InputStream inputStream, @SuppressWarnings("rawtypes") Class classObject) throws IOException
  {
	  this(classObject);

  	load(load(inputStream)) ;
	}
  
	/**
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(SqlProperties properties) throws IOException
  {
	  this(properties, SimpleSQLPropertyUtilities.class);
  }
  
	/**
	 * @throws IOException 
   */
  public SimpleSQLPropertyUtilities(SqlProperties properties, @SuppressWarnings("rawtypes") Class classObject) throws IOException
  {
	  this();
	  
	  this.classObject = classObject ;
	  
	  sqlGroups = new HashMap<String, SQLGroup>()  ;
	  
		if (properties != null)
		{
	  	load(properties) ;
	  }
	}
  
	public final boolean hasSQLGroup(String id)
	{
		return sqlGroups.containsKey(id) ;
	}
	
	public final SQLGroup getSQLGroup(String id) throws SQLUtilitiesException
	{
		if (hasSQLGroup(id))
			return sqlGroups.get(id) ;
		else
			throw new SQLUtilitiesException ("Unknown group : " + id) ;
	}
	
	public final SqlProperties getProperties()
  {
  	return properties;
  }

  public String readSQLFile(SQLFile sqlFile) throws IOException
  {
	  return readSQLFile(sqlFile.getFilePath(), classObject);
  }
  
	public List<String> parseSQLFile(SQLFile sqlFile, boolean ignoreComments) throws SQLUtilitiesException 
  {
	  try
    {
	    return parseSQLFile(sqlFile.getFilePath(), ignoreComments, classObject);
    }
    catch (Exception e)
    {
      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
    }
  }

	@Override
  public String getSQLString(SQL query) throws SQLUtilitiesException
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
				try
        {
	        queryString = readSQLFile(((SQLFile)query)) ;
        }
		    catch (Exception e)
		    {
		      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
		    }
			}
		}

	  return queryString;
  }	

	private void load(SqlProperties properties)
  {
	  sqlGroups = new HashMap<String, SQLGroup>()  ;
	  
		if (properties != null)
		{
			Iterator<SqlGroup> iterator = properties.getSqlGroup().iterator() ;
			
			while (iterator.hasNext())
				cacheSqlGroup(iterator.next()) ;
			
			this.properties = properties ;
	  }
  }

	private void cacheSqlGroup(SqlGroup group)
  {
		sqlGroups.put(group.getId(), new SQLGroup(group)) ;
  }
}
