/*******************************************************************************
 * Copyright 2010 Guy Davenport
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
package org.daveneti.common;

import java.rmi.server.UID;

public class LSID
{
	public static final String PREFIX = "URN_LSID_" ;
	public static final String DELIMITER = "_" ;
	public static final String NAMESPACE_DELIMITER = "." ;
	
	public static final String create(String authority, String namespace, String objectId)
  {
	  return PREFIX + authority + DELIMITER + namespace + DELIMITER + objectId ;
  }
	
	public static final String create(String authority, String namespace, String objectId, int version)
  {
	  return PREFIX + authority + DELIMITER + namespace + DELIMITER + objectId + DELIMITER + version;
  }
	
	public static final String[] resolve(String string)
  {
		if (isLSID(string))
			return string.substring(PREFIX.length()).split(DELIMITER) ;
		else
			return null ;
  }

	public static final String resolvedAuthority(String string)
  {
		if (isLSID(string))
			return resolve(string)[0] ;
		else
			return null ;
  }
	
	public static final String resolvedNamespace(String string)
  {
		if (isLSID(string))
			return resolve(string)[1] ;
		else
			return null ;
  }
	
	public static final String resolvedLocalID(String string)
  {
		if (isLSID(string))
			return resolve(string)[2] ;
		else
			return null ;
  }
	
	public static final int resolvedVersion(String string)
  {
		try
    {
	    if (isLSID(string))
	    	return Integer.valueOf(resolve(string)[3])  ;
	    else
	    	return 0 ;
    }
    catch (NumberFormatException e)
    {
	    return 0 ;
    }
  }
	
	public static final boolean isLSID(String string)
  {
		if (string.startsWith(PREFIX))
		{
			String[] tokens = string.substring(PREFIX.length()).split(DELIMITER) ;
			
			try
			{
				return tokens.length == 3 || (tokens.length == 4 && Integer.valueOf(tokens[3]) >=0) ;
	    }
	    catch (NumberFormatException e)
	    {
				return false ;
	    }
		}
		else
		{
			return false ;
		}
  }

	public static final String createLocalId()
  {
	  return new UID().toString().replace(":", "");
  }
}
