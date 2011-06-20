/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy.davenport@cropinformatics.com) under contract by
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

import org.cropinformatics.sql.properties.SqlFile;
import org.cropinformatics.sql.properties.impl.SqlFileImpl;

public class SQLFile extends SqlFileImpl implements SQL
{
	private String groupId ;
	
	public SQLFile(String groupId, SqlFile sqlFile)
  {
	  setGroupId(groupId) ;
	  setHqlQuery(sqlFile.isHqlQuery()) ;
	  setId(sqlFile.getId()) ;
	  setFilePath(sqlFile.getFilePath()) ;
	  getParameters().addAll(sqlFile.getParameters()) ;
  }
	
	public String getGroupId()
	{
		return groupId;
	}

	public void setGroupId(String groupId)
	{
		this.groupId = groupId ;
	}

}
