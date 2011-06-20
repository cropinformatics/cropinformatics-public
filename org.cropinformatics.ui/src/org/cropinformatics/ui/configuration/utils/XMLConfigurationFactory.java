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
package org.cropinformatics.ui.configuration.utils;

import java.io.File;
import java.net.URL;
import java.util.Iterator;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.configuration.Configuration;
import org.cropinformatics.ui.configuration.ConfigurationListType;
import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.DocumentRoot;
import org.cropinformatics.ui.configuration.util.ConfigurationResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class XMLConfigurationFactory implements ConfigurationFactory
{
  private static final String DEFAULT_FILE = "/config/configuration.xml";
  private File configurationFile ;
  private URL configurationURL;
  private String pluginId;

  /**
   * 
   */
  public XMLConfigurationFactory()
  {
    this((URL)null, null);
  }
  
  public XMLConfigurationFactory(String configurationFile)
  {
    this(configurationFile, null);
  }
  
  public XMLConfigurationFactory(String configurationFile, String pluginId)
  {
    this(new File(configurationFile), pluginId);
  }

  public XMLConfigurationFactory(File configurationFile)
  {
    this(configurationFile, null);
  }

  public XMLConfigurationFactory(File configurationFile, String pluginId)
  {
    super();
    
    this.configurationFile = configurationFile ;
    this.configurationURL = null ;
    
    this.pluginId = pluginId ;
  }
  
  public XMLConfigurationFactory(URL configurationURL)
  {
    this(configurationURL, null);
  }
  
  public XMLConfigurationFactory(URL configurationURL, String pluginId)
  {
    this.configurationURL = configurationURL ;
    this.configurationFile = null ;
    
    this.pluginId = pluginId ;
  }
  
  public Configuration[] getConfigurations()
  {    
    Configuration[] configurations = null ;
    
    ConfigurationListType configurationList = null;

    // Create a resource set to hold the resources.
    //
    ResourceSet resourceSet = new ResourceSetImpl();

    // Register the appropriate resource factory to handle all file
    // extensions.
    //
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
        Resource.Factory.Registry.DEFAULT_EXTENSION,
        new ConfigurationResourceFactoryImpl());

    // Register the package to ensure it is available during loading.
    //
    resourceSet.getPackageRegistry().put(ConfigurationPackage.eNS_URI,
        ConfigurationPackage.eINSTANCE);
    
    URI uri = getConfigurationURL() ;

    if (uri == null)
    {
      Activator.getDefault().warn("Was unable to read resource: " + uri);
    }
    else
    {  
      // Demand load resource for this file.
      //
      Resource resource = resourceSet.getResource(uri, true);
  
      configurationList = ((DocumentRoot) resource.getContents().get(0)).getConfigurationList() ;
        
      configurations = new Configuration[configurationList.getConfiguration().size()] ;
      
      Iterator<Configuration> iterator = configurationList.getConfiguration().iterator() ;
      
      int i = 0 ;
      while (iterator.hasNext())
      {
      	configurations[i] = iterator.next() ;
      	configurations[i].setPluginId(pluginId) ;
      	++i ;
      }
      
      configurations = configurationList.getConfiguration().toArray(configurations) ;
    }
    
    return configurations;
  }
  
  public final String getPluginId()
  {
    return pluginId;
  }

  protected URI getConfigurationURL()
  {
    if (configurationFile != null)
    {
      if (configurationFile.canRead())
        return URI.createURI(configurationFile.toURI().toString()) ;
      else
        return null ;
    }
    else
    {
      if (configurationURL != null)
      {
        return URI.createURI(configurationURL.toString()) ;
      }
      else
      {
        URL url = this.getClass().getResource(DEFAULT_FILE) ;
        
        if (url != null)
          return URI.createURI(url.toString()) ;
        else
          return null ;
      }
    }
  }

}
