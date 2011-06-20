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

import java.util.HashMap;
import java.util.Iterator;

import org.cropinformatics.sql.properties.DBMS;
import org.cropinformatics.sql.properties.SpecificDBMSProperties;
import org.cropinformatics.sql.properties.SqlFile;
import org.cropinformatics.sql.properties.SqlGroup;
import org.cropinformatics.sql.properties.SqlQuery;

public class SQLGroup
{
	private String id ;
	private HashMap<String, SQLQuery> defaultSQLQueriesMap;
	private HashMap<String, SQLFile> defaultQLFilesMap ;
	private HashMap<String, HashMap<String, SQLQuery>> specificSQLQueriesMap ;
	private HashMap<String, HashMap<String, SQLFile>> specificSQLFilesMap ; 
	
	public SQLGroup(SqlGroup group)
	{
		id = group.getId() ;
		defaultSQLQueriesMap = new HashMap<String, SQLQuery>() ;
		defaultQLFilesMap = new HashMap<String, SQLFile>() ;
		specificSQLQueriesMap = new HashMap<String, HashMap<String, SQLQuery>>() ;
		specificSQLFilesMap = new HashMap<String, HashMap<String, SQLFile>>() ;
		
		cacheSqlGroup(group) ;
	}
	
	public final synchronized boolean hasSQLQuery(String id)
	{
		return defaultSQLQueriesMap.containsKey(id) ;
	}
	
	public final synchronized SQLQuery getSQLQuery(String id, String dbmsID) throws SQLUtilitiesException
	{
		if (specificSQLQueriesMap.containsKey(dbmsID) && specificSQLQueriesMap.get(dbmsID).containsKey(id))
			return specificSQLQueriesMap.get(dbmsID).get(id) ;
		else
			if (defaultSQLQueriesMap.containsKey(id))
				return defaultSQLQueriesMap.get(id) ;
			else
				throw new SQLUtilitiesException ("Unknown sql query :" + id + " in group : " + getId()) ;
	}
	
	public final synchronized boolean hasSQLFile(String id)
	{
		return defaultQLFilesMap.containsKey(id) ;
	}
	
	public final synchronized SQLFile getSQLFile(String id, String dbmsID) throws SQLUtilitiesException
	{
		if (specificSQLFilesMap.containsKey(dbmsID) && specificSQLFilesMap.get(dbmsID).containsKey(id))
			return specificSQLFilesMap.get(dbmsID).get(id) ;
		else
			if (defaultQLFilesMap.containsKey(id))
				return defaultQLFilesMap.get(id) ;
			else
				throw new SQLUtilitiesException ("Unknwon sql file :" + id + " in group : " + getId()) ;
	}

	public final String getId()
  {
  	return id;
  }
  
	private void cacheSqlGroup(SqlGroup group)
  {
		Iterator<SqlQuery> queries = group.getSqlQuery().iterator() ;
		
		while (queries.hasNext())
			cacheSQLQuery(new SQLQuery(group.getId(), queries.next())) ;
		
		Iterator<SqlFile> files = group.getSqlFile().iterator() ;
		
		while (files.hasNext())
			cacheSQLFile(new SQLFile(group.getId(), files.next())) ;
		
	  Iterator<SpecificDBMSProperties> iterator2 = group.getSpecificDBMSProperties().iterator() ;
			
		SpecificDBMSProperties specificDBMSProperties ;
			
		while (iterator2.hasNext())
		{
			specificDBMSProperties = iterator2.next() ;
				
			queries = specificDBMSProperties.getSqlQuery().iterator() ;

			while (queries.hasNext())
				overrideSQLQuery(specificDBMSProperties.getDBMS(), new SQLQuery(group.getId(), queries.next())) ;
	
			files = specificDBMSProperties.getSqlFile().iterator() ;
	
			while (files.hasNext())
				overrideSQLFile(specificDBMSProperties.getDBMS(), new SQLFile(group.getId(), files.next())) ;
	  }
  }

	private void cacheSQLQuery(SQLQuery sqlQuery)
  {
	  defaultSQLQueriesMap.put(sqlQuery.getId(), sqlQuery) ;
  }
	
	private void cacheSQLFile(SQLFile sqlFile)
  {
	  defaultQLFilesMap.put(sqlFile.getId(), sqlFile) ;
  }
	
	private void overrideSQLQuery(DBMS dbms, SQLQuery sqlQuery)
  {
		HashMap<String, SQLQuery> map = null ;
		
		if (defaultQLFilesMap.containsKey(dbms))
		{
			map = specificSQLQueriesMap.get(dbms) ;
		}
		else
		{
			map = new HashMap<String, SQLQuery>() ;
			specificSQLQueriesMap.put(dbms.getName(), map) ;
		}
		
		map.put(sqlQuery.getId(), sqlQuery) ;
  }
	
	private void overrideSQLFile(DBMS dbms, SQLFile sqlFile)
  {
		HashMap<String, SQLFile> map = null ;
		
		if (specificSQLFilesMap.containsKey(dbms))
		{
			map = specificSQLFilesMap.get(dbms) ;
			
		}
		else
		{
			map = new HashMap<String, SQLFile>() ;
			specificSQLFilesMap.put(dbms.getName(), map) ;
		}
		
		map.put(sqlFile.getId(), sqlFile) ;
  }
}
