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

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.sql.properties.SqlProperties;

public class CombinedSQLUtilities extends AbstractSQLPropertyUtilities
{
	private List<SQLPropertyUtilities> sqlUtilitiesList ;

	/**
   * @param sqlUtilitiesList
   */
  public CombinedSQLUtilities(SQLPropertyUtilities... sqlUtilitiesArray)
  {
	  super();
	  
	  List<SQLPropertyUtilities> sqlUtilitiesList = new LinkedList<SQLPropertyUtilities>() ;
	  
	  if (sqlUtilitiesArray != null)
	  {
	  	for (int i = 0 ; i < sqlUtilitiesArray.length ; ++i)
	  		sqlUtilitiesList.add(sqlUtilitiesArray[i]) ;
	  }
	  setSQLUtilitiesList(sqlUtilitiesList) ;
  }

	/**
   * @param sqlUtilitiesList
   */
  public CombinedSQLUtilities(List<SQLPropertyUtilities> sqlUtilitiesList)
  {
	  super();
	  setSQLUtilitiesList(sqlUtilitiesList) ;
  }

  public final List<SQLPropertyUtilities> getSQLUtilitiesList()
  {
  	return sqlUtilitiesList;
  }

	protected final void setSQLUtilitiesList(List<SQLPropertyUtilities> sqlUtilitiesList)
  {
		if (sqlUtilitiesList != null)
			this.sqlUtilitiesList = sqlUtilitiesList;
		else
			sqlUtilitiesList = new LinkedList<SQLPropertyUtilities>() ;
  }

	public List<SqlProperties> getPropertiesList()
	{
		List<SqlProperties> propertiesList = new LinkedList<SqlProperties>() ;

		SQLPropertyUtilities sqlUtilities = null ;

		Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 

		while (iterator.hasNext())
		{
			sqlUtilities = iterator.next() ;

			if (sqlUtilities instanceof CombinedSQLUtilities)
				propertiesList.addAll(((CombinedSQLUtilities)sqlUtilities).getPropertiesList()) ;
			else
				if (sqlUtilities instanceof SimpleSQLPropertyUtilities)
					propertiesList.add(((SimpleSQLPropertyUtilities)sqlUtilities).getProperties()) ;
		}

		return propertiesList;
	}

	public SQLGroup getSQLGroup(String id) throws SQLUtilitiesException
	{
		SQLGroup group = null ;
		SQLPropertyUtilities sqlUtilities = null ;
		Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 

		while (group == null && iterator.hasNext())
		{
			sqlUtilities = iterator.next() ;

			if (sqlUtilities.hasSQLGroup(id))
				group = sqlUtilities.getSQLGroup(id) ;
		}

		return group ;
	}

	public boolean hasSQLGroup(String id)
	{
		boolean found = false ;

		Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 

		while (found && iterator.hasNext())
		{
			found = iterator.next().hasSQLGroup(id) ;
		}

		return found ;
	}

	public String readSQLFile(SQLFile sqlFile) throws IOException, SQLUtilitiesException
  {
		String string = null ;
		
		if (sqlFile != null)
		{
			SQLPropertyUtilities sqlUtilities = null ;
			Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 
	
			while (string == null && iterator.hasNext())
			{
				sqlUtilities = iterator.next() ;
	
				if (sqlUtilities.hasSQLGroup(sqlFile.getGroupId()))
					string = sqlUtilities.readSQLFile(sqlFile) ;
			}
		}

	  return string;
  }
	
	public List<String> parseSQLFile(SQLFile sqlFile, boolean ignoreComments)
      throws SQLUtilitiesException
  {
		List<String> list = null ;
		
		if (sqlFile != null)
		{
			SQLPropertyUtilities sqlUtilities = null ;
			Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 
	
			while (list == null && iterator.hasNext())
			{
				sqlUtilities = iterator.next() ;
	
				if (sqlUtilities.hasSQLGroup(sqlFile.getGroupId()))
					list = sqlUtilities.parseSQLFile(sqlFile, ignoreComments) ;
			}
		}

	  return list;
  }

	@Override
  public String getSQLString(SQL query) throws SQLUtilitiesException
  {
		String queryString = null ;
		
		SQLPropertyUtilities sqlUtilities = null ;
		Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 

		while (queryString == null && iterator.hasNext())
		{
			sqlUtilities = iterator.next() ;

			if (sqlUtilities.hasSQLGroup(query.getGroupId()))
				queryString = sqlUtilities.getSQLString(query) ;
		}
		
		return queryString ;
  }

	@Override
  public PreparedStatement prepareStatement(Connection connection,
      SQL query) throws SQLUtilitiesException
  {
		PreparedStatement preparedStatement = null ;
		
		SQLPropertyUtilities sqlUtilities = null ;
		Iterator<SQLPropertyUtilities> iterator = sqlUtilitiesList.iterator() ; 

		while (preparedStatement == null && iterator.hasNext())
		{
			sqlUtilities = iterator.next() ;

			if (sqlUtilities.hasSQLGroup(query.getGroupId()))
				preparedStatement = sqlUtilities.prepareStatement(connection, query) ;
		}
		
		return preparedStatement ;
  }
	
	
}
