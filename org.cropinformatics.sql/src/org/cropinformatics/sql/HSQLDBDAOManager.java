/*******************************************************************************
 * Copyright 2011 Guy Davenport
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

import org.cropinformatics.sql.properties.DBMS;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.PropertiesFactory;
import org.cropinformatics.sql.properties.SqlProperties;

public class HSQLDBDAOManager extends AbstractDAOManager
{
	private static final String DEFAULT_SQL_PROPERTIES_FILE = "/sqlProperties.xml" ;
	private String databasePath ;
	private SqlProperties sqlProperties;
	
	public HSQLDBDAOManager(String databasePath) throws IOException
  {
	  this(databasePath, SimpleSQLPropertyUtilities.load(HSQLDBDAOManager.class.getResourceAsStream(DEFAULT_SQL_PROPERTIES_FILE))) ;
  }
	
	public HSQLDBDAOManager(String databasePath, SqlProperties sqlProperties)
  {
	  this.databasePath = databasePath ;
	  this.sqlProperties = sqlProperties ;
  }

	@Override
  protected HibernateDAO createDao(String id) throws SQLUtilitiesException
  {
	  return createDao(createDatabaseProperties(id));
  }
	
	protected HibernateDAO createDao(DatabaseProperties databaseProperties) throws SQLUtilitiesException
  {
	  return new HibernateDAO(databaseProperties);
  }

	protected DatabaseProperties createDatabaseProperties(String id) throws SQLUtilitiesException
  {
		DatabaseProperties databaseProperties = PropertiesFactory.eINSTANCE.createDatabaseProperties() ;
		
		databaseProperties.setId(id) ;
		databaseProperties.setDatabaseName(id) ;
		databaseProperties.setServerURL(databasePath) ;
		databaseProperties.setDBMS(DBMS.HSQLDB) ;
		databaseProperties.setUsername("sa") ;
		databaseProperties.setPassword("") ;
		databaseProperties.setSqlProperties(sqlProperties) ;
 
	  return databaseProperties;
  }
}
