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

import java.util.HashMap;
import java.util.Iterator;

public abstract class AbstractDAOManager implements DAOManager
{
	private HashMap<String, HibernateDAO> daos;

	public AbstractDAOManager()
  {
	  super();
	  
	  daos = new HashMap<String, HibernateDAO>() ; 
  }

	public final HibernateDAO getDAO(String id) throws SQLUtilitiesException
  {
		if (!daos.containsKey(id))
		{
			try
      {
				HibernateDAO dao = createDao(id) ;
				
				daos.put(id, dao) ;
				
				return dao ;
      }
      catch (SQLUtilitiesException e)
      {
	      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
      }
		}
		else
		{
			return daos.get(id) ;
		}
  }
	
	public final void close()
	{
		Iterator<HibernateDAO> iterator = daos.values().iterator() ;
		
		while(iterator.hasNext())
			iterator.next().close() ;
	}

	protected abstract HibernateDAO createDao(String id) throws SQLUtilitiesException ;
	
}
