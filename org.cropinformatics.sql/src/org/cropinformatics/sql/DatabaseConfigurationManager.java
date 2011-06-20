/*******************************************************************************
 * Copyright 2008 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original authors Jeffrey Morales and Kevin L. Manansala under contract by
 * IRRI, and Guy Davenport (guy@daveneti.com) under contract by
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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.sql.properties.DatabaseAlias;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.DatabasePropertiesListType;
import org.cropinformatics.sql.properties.DocumentRoot;
import org.cropinformatics.sql.properties.PropertiesFactory;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.util.PropertiesResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class DatabaseConfigurationManager
{
	private HashMap<String, DatabaseProperties> databasePropertiesMap;
	private HashMap<String, String> databaseAliasMap;
	
	private DatabasePropertiesListType dataSourcePropertiesList;
	private List<DatabaseConfigurationManagerListener> listeners;

	public DatabaseConfigurationManager()
	{
		databasePropertiesMap = new HashMap<String, DatabaseProperties>();
		databaseAliasMap = new HashMap<String, String>();
		
		dataSourcePropertiesList = PropertiesFactory.eINSTANCE.createDatabasePropertiesListType() ;
	}

	public DatabaseConfigurationManager(String propertiesFile)
	    throws SQLUtilitiesException
	{
		this();

		if (propertiesFile != null)
		{
			if (!load(propertiesFile))
				throw new SQLUtilitiesException("Properties file invalid!");
		}
		else
		{
			throw new NullPointerException("File not defined!");
		}
	}

	public DatabaseConfigurationManager(File propertiesFile)
	    throws SQLUtilitiesException
	{
		this();

		if (propertiesFile != null)
		{
			if (!load(propertiesFile))
				throw new SQLUtilitiesException("Properties file invalid!");
		}
		else
		{
			throw new NullPointerException("File not defined!");
		}
	}

	public DatabaseConfigurationManager(InputStream propertiesInputStream) throws IOException, SQLUtilitiesException
	{
		this();

		if (propertiesInputStream != null)
		{
			if (!load(propertiesInputStream))
				throw new SQLUtilitiesException("Properties file invalid!");
		}
		else
		{
			throw new NullPointerException("Input Stream not defined!");
		}
	}

	public final boolean hasDatabaseProperties(String propertiesId)
	{
		return databasePropertiesMap.containsKey(propertiesId);
	}

	public final DatabaseProperties getDatabaseProperties(String propertiesId)
	{
		return databasePropertiesMap.get(propertiesId);
	}

	public final synchronized boolean load(String propertiesFile) 
	{
		if (propertiesFile != null)
		{
	  	return load(URI.createFileURI(propertiesFile)) ;
		}
		else
		{
			return false;
		}
	}

	public final synchronized boolean load(File propertiesFile) 
	{
		if (propertiesFile != null)
		{
	  	return load(URI.createFileURI(propertiesFile.getAbsolutePath())) ;
		}
		else
		{
			return false;
		}
	}
	
	public final synchronized boolean load(URI uri) 
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
	  	
	  	if (!resource.getContents().isEmpty())
	  		return load(((DocumentRoot) resource.getContents().get(0)).getDatabasePropertiesList()) ;
	  	else
	  		return true ;
		}
		else
		{
			return false;
		}
	}

	public final synchronized boolean load(InputStream inputStream) throws IOException 
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

	  	Resource resource = resourceSet.createResource(URI.createURI("http:///My.properties")) ;
	  	resource.load(inputStream, null) ;
	  	
	  	if (!resource.getContents().isEmpty())
	  		return load(((DocumentRoot) resource.getContents().get(0)).getDatabasePropertiesList()) ;
	  	else
	  		return true ;
		}
		else
		{
			return false;
		}
	}
	
	public final synchronized boolean load(DatabasePropertiesListType dataSourcePropertiesList)
  {
		boolean valid = true ;
		
		HashMap<String, DatabaseProperties> databasePropertiesMap = new HashMap<String, DatabaseProperties>() ;
		HashMap<String, String> databaseAliasMap = new HashMap<String, String>();
		
		Iterator<DatabaseProperties> iterator = dataSourcePropertiesList.getDatabaseProperties().iterator() ;
		
		DatabaseProperties databaseProperties = null ;
		
		while (valid && iterator.hasNext())
		{
			databaseProperties = iterator.next() ;
			
			valid = isValid(databaseProperties) ;
				
			if (valid)
				databasePropertiesMap.put(databaseProperties.getId(), databaseProperties) ;
		}
		
		Iterator<DatabaseAlias> iterator2 = dataSourcePropertiesList.getDatabaseAlias().iterator() ;
		
		DatabaseAlias databaseAlias = null ;
		
		while (valid && iterator2.hasNext())
		{
			databaseAlias = iterator2.next() ;
			
			if (databasePropertiesMap.containsKey(databaseAlias.getId()))
				databasePropertiesMap.put(databaseAlias.getAlias(), databasePropertiesMap.get(databaseAlias.getId())) ;
		}
		
		if (valid)
		{
			this.dataSourcePropertiesList = dataSourcePropertiesList ;
			this.databasePropertiesMap = databasePropertiesMap ;
			this.databaseAliasMap = databaseAliasMap ;
			
			// TODO fire all add
			//fireDatabasePropertiesAdded(databaseProperties);
		}
		
		return valid ;
  }

	public final synchronized boolean save(String propertiesFile) throws IOException 
	{
		if (propertiesFile != null)
			return save(URI.createFileURI(propertiesFile)) ;
		else
			return false ;
	}

	public final synchronized boolean save(File propertiesFile) throws IOException 
	{
		if (propertiesFile != null)
			return save(URI.createFileURI(propertiesFile.getAbsolutePath())) ;
		else
			return false ;
	}
	
	public final synchronized boolean save(URI uri) throws IOException 
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
	
			Resource resource = resourceSet.createResource(uri);
			DocumentRoot documentRoot = PropertiesFactory.eINSTANCE.createDocumentRoot();
			
			documentRoot.setDatabasePropertiesList(dataSourcePropertiesList) ;
			
			resource.getContents().add((EObject)documentRoot);
			resource.save(null) ;
			
			return true ;
		}
		else
		{
			return false ;
		}
	}
	
	public final boolean save(OutputStream outputStream) throws IOException 
	{
		if (outputStream != null)
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
					new PropertiesResourceFactoryImpl());
	
			resourceSet.getPackageRegistry().put
			(PropertiesPackage.eNS_URI, 
					PropertiesPackage.eINSTANCE);
	
			Resource resource = resourceSet.createResource(URI.createURI("http:///My.definition"));
			DocumentRoot documentRoot = PropertiesFactory.eINSTANCE.createDocumentRoot();
			
			documentRoot.setDatabasePropertiesList(dataSourcePropertiesList) ;
			
			resource.getContents().add((EObject)documentRoot);
			resource.save(outputStream, null);
			
			return true ;
		}
		else
		{
			return false ;
		}
	}
	
	public final boolean addDatabaseProperties(DatabaseProperties databaseProperties)
	{
		boolean success = false;

		if (databaseProperties != null)
		{
			synchronized (databasePropertiesMap)
			{
				if (!databasePropertiesMap.containsKey(databaseProperties.getId()))
				{
					databasePropertiesMap.put(databaseProperties.getId(),
					    databaseProperties);
					dataSourcePropertiesList.getDatabaseProperties().add(
					    databaseProperties);

					fireDatabasePropertiesAdded(databaseProperties);

					success = true;
				}
			}
		}

		return success;
	}

	public final boolean removeDatabaseProperties(DatabaseProperties databaseProperties)
	{
		boolean success = false;

		if (databaseProperties != null)
		{
			synchronized (databasePropertiesMap)
			{
				if (databasePropertiesMap.containsKey(databaseProperties.getId())
				    && !isInUse(databaseProperties))
				{
					databasePropertiesMap.remove(databaseProperties.getId());
					dataSourcePropertiesList.getDatabaseProperties().remove(
					    databaseProperties);

					fireDatabasePropertiesRemoved(databaseProperties);

					success = true;
				}
			}
		}

		return success;
	}

	public final boolean updateDatabaseProperties(DatabaseProperties databaseProperties)
	{
		boolean success = false;

		if (databaseProperties != null)
		{
			synchronized (databasePropertiesMap)
			{
				if (databasePropertiesMap.containsKey(databaseProperties.getId()))
				{
					DatabaseProperties oldDatabaseProperties = databasePropertiesMap.put(
					    databaseProperties.getId(), databaseProperties);
					dataSourcePropertiesList.getDatabaseProperties().remove(
					    oldDatabaseProperties);
					dataSourcePropertiesList.getDatabaseProperties().add(
					    databaseProperties);

					fireDatabasePropertiesUpdated(databaseProperties);

					success = true;
				}
			}
		}

		return success;
	}
	
	public void addDataSourcePropertiesManagerListener(
			DatabaseConfigurationManagerListener listener)
	{
		if (listeners != null)
			listeners = new LinkedList<DatabaseConfigurationManagerListener>();

		if (listener != null)
			listeners.add(listener);
	}

	public void removeDataSourcePropertiesManagerListener(
			DatabaseConfigurationManagerListener listener)
	{
		if (listeners != null && listener != null)
			listeners.remove(listener);
	}
	
	public boolean isAlias(String id)
  {
	  return databaseAliasMap.containsKey(id);
  }
	
	public String getIdByAlias(String id)
  {
	  return databaseAliasMap.get(id);
  }

	private void fireDatabasePropertiesAdded(DatabaseProperties databaseProperties)
	{
		if (listeners != null)
		{
			synchronized (listeners)
			{
				Iterator<DatabaseConfigurationManagerListener> iterator = listeners
				    .iterator();

				while (iterator.hasNext())
					iterator.next().databasePropertiesAdded(databaseProperties);
			}
		}
	}

	private void fireDatabasePropertiesRemoved(
	    DatabaseProperties databaseProperties)
	{
		if (listeners != null)
		{
			synchronized (listeners)
			{
				Iterator<DatabaseConfigurationManagerListener> iterator = listeners
				    .iterator();

				while (iterator.hasNext())
					iterator.next().databasePropertiesRemoved(databaseProperties);
			}
		}
	}

	private void fireDatabasePropertiesUpdated(
	    DatabaseProperties databaseProperties)
	{
		if (listeners != null)
		{
			synchronized (listeners)
			{
				Iterator<DatabaseConfigurationManagerListener> iterator = listeners
				    .iterator();

				while (iterator.hasNext())
					iterator.next().databasePropertiesUpdated(databaseProperties);
			}
		}
	}

	private boolean isValid(DatabaseProperties databaseProperties)
	{
		boolean valid = false;

		if (databaseProperties.getId() != null
		    && databaseProperties.getDatabaseName() != null
		    && databaseProperties.getServerURL() != null)
		{
			valid = true;
		}
		else
		{
			valid = false;
		}

		return valid;
	}

	private boolean isInUse(DatabaseProperties databaseProperties)
  {
	  // TODO Auto-generated method stub
	  return false;
  }


}
