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
import java.util.List;

import org.cropinformatics.sql.properties.SqlParameter;


public interface SQLPropertyUtilities
{
	public boolean hasSQLGroup(String id);

	public SQLGroup getSQLGroup(String id) throws SQLUtilitiesException;
	
  public String readSQLFile(SQLFile sqlFile) throws IOException, SQLUtilitiesException ;
  
	public List<String> parseSQLFile(SQLFile sqlFile, boolean ignoreComments) throws SQLUtilitiesException  ;

	public String getSQLString(SQL query) throws SQLUtilitiesException ;

	public String getSQLString(SQL query, Object[] arguments) throws SQLUtilitiesException ;
	
	public String getSQLString(SQL query, SqlParameter[] parameters, Object[] arguments) throws SQLUtilitiesException ;
	
	public String getSQLString(SQL query, SqlParameter sqlParameter, Object argument) throws SQLUtilitiesException ;

	public PreparedStatement prepareStatement(Connection connection, SQL query) throws SQLUtilitiesException;
	
	public PreparedStatement prepareStatement(Connection connection, SQL query, Object[] arguments) throws SQLUtilitiesException;
	
	public PreparedStatement prepareStatement(Connection connection, SQL query, SqlParameter[] parameters, Object[] arguments) throws SQLUtilitiesException;

	public PreparedStatement prepareStatement(Connection connection, SQL query, SqlParameter sqlParameter, Object argument) throws SQLUtilitiesException;
}