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

import static org.cropinformatics.sql.SQLSyntaxConstants.COMMENT_END;
import static org.cropinformatics.sql.SQLSyntaxConstants.COMMENT_START;
import static org.cropinformatics.sql.SQLSyntaxConstants.DASH_COMMENT;
import static org.cropinformatics.sql.SQLSyntaxConstants.NULL;
import static org.cropinformatics.sql.SQLSyntaxConstants.SEMI_COLON;
import static org.cropinformatics.sql.SQLSyntaxConstants.SINGLE_QUOTE;
import static org.cropinformatics.sql.SQLSyntaxConstants.SPACE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.sql.properties.DocumentRoot;
import org.cropinformatics.sql.properties.ParameterType;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.SqlParameter;
import org.cropinformatics.sql.properties.SqlProperties;
import org.cropinformatics.sql.properties.util.PropertiesResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public abstract class AbstractSQLPropertyUtilities implements SQLPropertyUtilities
{
	private static final String PARAMETER_PREFIX = ":" ;
	
	@Override
  public final String getSQLString(SQL query, Object[] arguments) throws SQLUtilitiesException
  {
	  return getSQLString(query, query.getParameters().toArray(new SqlParameter[query.getParameters().size()]), arguments);
  }
	
	@Override
  public final String getSQLString(SQL query, SqlParameter[] parameters, Object[] arguments) throws SQLUtilitiesException
  {
	  return parameterise(getSQLString(query), parameters, arguments);
  }
	
	public String getSQLString(SQL query, SqlParameter sqlParameter, Object argument) throws SQLUtilitiesException
	{
	  return parameterise(getSQLString(query), sqlParameter, argument);
	}
  
	@Override
  public PreparedStatement prepareStatement(Connection connection, SQL query) throws SQLUtilitiesException
  {
		try
    {
	    return connection.prepareStatement(parameterise(getSQLString(query), query.getParameters())) ;
    }
    catch (Exception e)
    {
      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
    }
  }
	
	public final PreparedStatement prepareStatement(Connection connection, SQL query, Object[] arguments) throws SQLUtilitiesException
	{
		try
    {
	    return connection.prepareStatement(parameterise(getSQLString(query), getParameterArray(query.getParameters()), arguments)) ;
    }
    catch (Exception e)
    {
      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
    }
	}
	
	public final PreparedStatement prepareStatement(Connection connection, SQL query, SqlParameter[] parameters, Object[] arguments) throws SQLUtilitiesException
	{
		try
    {
	    return connection.prepareStatement(parameterise(parameterise(getSQLString(query), parameters, arguments), query.getParameters())) ;
    }
    catch (Exception e)
    {
      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
    }
	}
	
	public PreparedStatement prepareStatement(Connection connection, SQL query, SqlParameter sqlParameter, Object argument) throws SQLUtilitiesException
	{
		try
    {
	    return connection.prepareStatement(parameterise(parameterise(getSQLString(query), sqlParameter, argument), query.getParameters())) ;
    }
    catch (Exception e)
    {
      throw new SQLUtilitiesException(e.getLocalizedMessage(), e) ;
    }
	}

	public static final InputStream createInputStream(String filePath, @SuppressWarnings("rawtypes") Class classObject) throws FileNotFoundException
  {
  	if (classObject == null)
  			classObject = AbstractSQLPropertyUtilities.class ;
  	
  	InputStream inputStream = classObject.getResourceAsStream(filePath) ;
  	
  	if (inputStream == null) 
  		throw new FileNotFoundException("Can not load sql properties") ;

	  return inputStream ;
  }

  public static final String readSQLFile(String filePath, @SuppressWarnings("rawtypes") Class classObject) throws IOException, IllegalArgumentException
  {
  	InputStream inputStream = classObject.getResourceAsStream(filePath) ;
  	
	  if (inputStream == null)
	    inputStream = new FileInputStream(filePath) ;

	  return readSQLFile(inputStream);
  }
  
  public static final String readSQLFile(InputStream inputStream) throws IOException, IllegalArgumentException 
  {
    if (inputStream != null)
    {
      	StringBuffer query = new StringBuffer();
        String line ;
        boolean inComment = false ;

        BufferedReader reader = new BufferedReader(new InputStreamReader(
            inputStream));

        while (reader.ready())
        {
          line = reader.readLine().trim() ;
          
          if (line.length() > 0) 
          {
            if (!line.startsWith(DASH_COMMENT))
            {
            	if (line.startsWith(COMMENT_START))
              {
                inComment = true ;
              }
              else
              {
                if (line.endsWith(COMMENT_END))
                {
                  inComment = false ;
                }
                else
                {
                  if (!inComment)
                  {
                    query.append(line);
                    
                    if (line.endsWith(SEMI_COLON))
                    {
                    	query.append('\n'); 
                    }
                    else
                    {
                      query.append(SPACE);
                    }
                  }
                }
              }
            }
          }
        }
        
        return query.toString() ;

    }
    else
    {
      throw new IllegalArgumentException("Input stream is not defined");
    }  
  }

	public static final List<String> parseSQLFile(String filePath, boolean ignoreComments, @SuppressWarnings("rawtypes") Class classObject) throws IOException 
  {
  	InputStream inputStream = classObject.getResourceAsStream(filePath) ;
  	
  	if (inputStream == null)
	    inputStream = new FileInputStream(filePath) ;

	  return parseSQLFile(inputStream, ignoreComments);
  }
  
  public static final List<String> parseSQLFile(InputStream inputStream, boolean ignoreComments) throws IOException
  {
    List<String> sql = new LinkedList<String>() ;
    
    if (inputStream != null)
    {       

    	StringBuffer query = new StringBuffer();
    	String line ;
    	boolean inComment = false ;

    	BufferedReader reader = new BufferedReader(new InputStreamReader(
    			inputStream));

    	while (reader.ready())
    	{
    		line = reader.readLine().trim() ;

    		if (line.length() > 0) 
    		{
    			if (line.startsWith(DASH_COMMENT))
    			{
    				if (!ignoreComments && !inComment)
    				{
    					query.append(line);

    					sql.add(query.toString());
    					query = new StringBuffer(); 
    				}
    			}
    			else
    			{
    				if (line.startsWith(COMMENT_START))
    				{
    					inComment = true ;
    				}
    				else
    				{
    					if (line.endsWith(COMMENT_END))
    					{
    						inComment = false ;
    					}
    					else
    					{
    						if (!inComment)
    						{
    							query.append(line);

    							if (line.endsWith(SEMI_COLON))
    							{
    								sql.add(query.toString());
    								query = new StringBuffer(); 
    							}
    							else
    							{
    								query.append(SPACE);
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    }
    else
    {
      throw new IllegalArgumentException("Input stream is not defined");
    }  
    
    return sql ;
  }
  

  public static final int getSQLStepCount(List<String> queries)
  {
    int totalSteps = 0 ;
    
    if (queries != null)
    {
      Iterator<String> iterator = queries.iterator() ;
      while (iterator.hasNext())
        if(iterator.next().startsWith(DASH_COMMENT))
           ++totalSteps ; 
    }
    
    return totalSteps;
  }
  
  public static final String[] getParameterNames(SQL query)
  {
  	String[] parameterNames ;
  	
  	if (query != null)
  	{
  		parameterNames = new String[query.getParameters().size()] ;
  		
  		Iterator<SqlParameter> iterator = query.getParameters().iterator() ;
  		
  		int i = 0 ;
  		
  		while (iterator.hasNext())
  		{
  			parameterNames[i] = iterator.next().getName() ;
  			
  			++i ;
  		}
  	}
  	else
  	{
  		parameterNames = new String[0] ;
  	}
  	
	  return parameterNames;
  }
  
  public static final String[] getParameterNames(SqlParameter[] parameters)
  {
  	String[] parameterNames ;
  	
  	if (parameters != null)
  	{
  		parameterNames = new String[parameters.length] ;
  		
  		for (int i = 0 ; i < parameters.length ; ++i)
  		{
  			parameterNames[i] = parameters[i].getName() ;
  			
  			++i ;
  		}
  	}
  	else
  	{
  		parameterNames = new String[0] ;
  	}
  	
	  return parameterNames;
  }

	public static final String parameterise(String queryString, List<SqlParameter> parameters) throws IllegalArgumentException
  {
		return parameterise(queryString, getParameterArray(parameters)) ;
  }
	
	public static final String parameterise(String queryString, SqlParameter[] parameters) throws IllegalArgumentException
  {
  	String parameterisedString = queryString ;
  	
  	for (int i = 0; i < parameters.length ; ++i)
  			parameterisedString = parameterisedString.replace(PARAMETER_PREFIX + parameters[i].getName(), "?") ;

  	return parameterisedString ;
  }

  public static final String parameterise(SQLQuery query, Object[] arguments) throws IllegalArgumentException
  {
  	return parameterise(query.getQueryString(), getParameterArray(query.getParameters()), arguments) ;
  }
  
	public static final String parameterise(String queryString, List<SqlParameter> parameters, Object[] arguments) throws IllegalArgumentException
  {
		return parameterise(queryString, getParameterArray(parameters), arguments) ;
  }

  public static final String parameterise(String string, SqlParameter[] parameters, Object[] arguments) throws IllegalArgumentException
  {
  	String parameterisedString = string ;
  	
  	if (parameters != null && arguments != null)
  	{
  		if (parameters.length != arguments.length)
  			throw new IllegalArgumentException("Number of parameters mmust match the number of arguments") ;
  		
  		for (int i = 0 ; i < parameters.length; ++i)
  			parameterisedString = parameterise(parameterisedString, parameters[i], arguments[i]) ;
  	}
  	
  	return parameterisedString ;
  }

	public static final String parameterise(String queryString, SqlParameter parameter,
      Object argument) throws IllegalArgumentException
  {
	  return queryString.replace(PARAMETER_PREFIX + parameter.getName(), convertToString(parameter, argument));
  }

	public static final String convertToString(SqlParameter parameter, Object argument) throws IllegalArgumentException
  {
		if (parameter != null)
		{
			if (argument != null)
			{
				if (parameter.getType() == ParameterType.BIG_DECIMAL ||
						parameter.getType() == ParameterType.BOOLEAN ||
						parameter.getType() == ParameterType.DOUBLE ||
						parameter.getType() == ParameterType.FLOAT ||
						parameter.getType() == ParameterType.INT ||
						parameter.getType() == ParameterType.LONG ||
						parameter.getType() == ParameterType.SHORT ||
						parameter.getType() == ParameterType.TOKEN)
				{
					return argument.toString() ;
				}
				else
				{
					if (parameter.getType() == ParameterType.STRING ||
							parameter.getType() == ParameterType.URL)
					{
						return SINGLE_QUOTE + argument.toString() + SINGLE_QUOTE ;
					}
					else
					{
						if (parameter.getType() == ParameterType.DATE ||
								parameter.getType() == ParameterType.DATE_CALENDAR ||
								parameter.getType() == ParameterType.TIME ||
								parameter.getType() == ParameterType.TIMESTAMP ||
								parameter.getType() == ParameterType.TIME_CALENDAR ||
								parameter.getType() == ParameterType.TIME_STAMP_CALENDAR)
						{
							return argument.toString() ;
						}
						else
						{
							throw new IllegalArgumentException("Parameter type not supported for simple string subsitution! : " + parameter.getType()) ;
						}
					}
				}
			}
			else
			{
				return NULL ;
			}
		}
		else
		{
			throw new IllegalArgumentException("Parameter or argument not defined!") ;
		}
  }

	public static final SqlParameter[] getParameters(SQL query)
  {
	  return query.getParameters().toArray(new SqlParameter[query.getParameters().size()]);
  }
	
	public static final SqlProperties load(String propertiesFile) throws IOException
	{
		if (propertiesFile != null)
			return load(URI.createFileURI(propertiesFile)) ;
		else
			return null ;
	}
	
	public static final SqlProperties load(File propertiesFile) throws IOException
	{
		if (propertiesFile != null)
			return load(URI.createFileURI(propertiesFile.getAbsolutePath())) ;
		else
			return null ;
	}
  		
	public static final SqlProperties load(InputStream inputStream) throws IOException
	{
		if (inputStream != null)
		{
			ResourceSet resourceSet = new ResourceSetImpl();
		  
		  resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
		     new PropertiesResourceFactoryImpl());
	
		  resourceSet.getPackageRegistry().put
		    (PropertiesPackage.eNS_URI, 
		    		PropertiesPackage.eINSTANCE);
	
			Resource resource = resourceSet.createResource(URI.createURI("http:///My.properties"));
			resource.load(inputStream, null) ;
			
			if (resource.getContents() != null && !resource.getContents().isEmpty())
				return ((DocumentRoot) resource.getContents().get(0)).getSqlProperties() ;
		}
		
		return null ;
	}
	
	public static final SqlProperties load(URI uri) throws IOException
	{
		if (uri != null)
		{
	    ResourceSet resourceSet = new ResourceSetImpl();
	    
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
	      (Resource.Factory.Registry.DEFAULT_EXTENSION, 
	       new PropertiesResourceFactoryImpl());
	
	    resourceSet.getPackageRegistry().put
	      (PropertiesPackage.eNS_URI, 
	      		PropertiesPackage.eINSTANCE);
	
	  	Resource resource = resourceSet.createResource(uri) ;
	  	
	  	resource.load(null) ;

	  	if (resource.getContents() != null && !resource.getContents().isEmpty())
				return ((DocumentRoot) resource.getContents().get(0)).getSqlProperties() ;
		}
			
		return null ;
	}
	
	public static final SqlProperties load(Class<?> classObject,
      String propertiesFile)
  {
	  try
    {
	    return load(classObject.getResourceAsStream(propertiesFile));
    }
    catch (IOException e)
    {
  		return null ;
    }
  }

  private static SqlParameter[] getParameterArray(List<SqlParameter> parameters)
  {
	  return parameters.toArray(new SqlParameter[parameters.size()]);
  }
}
