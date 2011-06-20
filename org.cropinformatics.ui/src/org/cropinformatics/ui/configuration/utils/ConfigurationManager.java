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

import java.net.URL;
import java.util.HashMap;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.configuration.Configuration;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class ConfigurationManager
{
  private static ConfigurationManager instance;

  private static final String CONFIGURATION_FACTORY_EXTENSION_POINT_ID = "org.daveneti.ui.ConfigurationFactory";

  private static final String CLASS_ATTRIBUTE_NAME = "class";
  
  private static final String FILE_ATTRIBUTE_NAME = "file";

  private HashMap<String, Configuration> configurations;

  /*****************************************************************************
   * The only way how to create a ConfigurationManager instance (because there are
   * no public constructors in this class).
   * <p>
   * 
   * @return a singleton instance of a ConfigurationManager that is aware of all
   *         available data sources
   ****************************************************************************/
  public static synchronized ConfigurationManager instance()
  {
    if (instance == null)
    {
      instance = new ConfigurationManager();
      instance.loadConfigurations();
    }
    return instance;
  }

  public boolean hasConfiguration(String id)
  {
    return id != null && configurations.containsKey(id) ;
  }

  public Configuration getConfiguration(String id)
  {
    if (id != null && configurations.containsKey(id))
    {
      Configuration configuration = configurations.get(id) ;
      
      // TODO does not detect cycles!
      if (configuration.getExtends() != null && !configuration.getExtends().equals(id) && configurations.containsKey(configuration.getExtends()))
        configuration = ConfigurationUtils.mergeConfiguration(ConfigurationUtils.copyConfiguration(getConfiguration(configuration.getExtends())), configuration) ;
      
      return configuration ;
    }
    else
    {
      return null ;
    }
  }

  public boolean addConfiguration(Configuration configuration)
  {
    if (configuration != null && configuration.getId() != null)
    {
      String name = configuration.getName() != null && configuration.getName().length() >0 ? configuration.getName() : configuration.getId() ;
      if (configurations.containsKey(configuration.getId()))
        Activator.getDefault().info("Overriding configuration : " + name) ;
      return configurations.put(configuration.getId(), configuration) != null ;
    }
    else
    {
      return false ;
    }
  }

  public boolean removeConfiguration(Configuration configuration)
  {
    if (configuration != null && configuration.getId() != null && configurations.containsKey(configuration.getId()))
    {
      return configurations.remove(configuration) != null ;
    }
    else
    {
      return false ;
    }
  }

  public boolean updateConfiguration(Configuration configuration)
  {
    if (configuration != null && configuration.getId() != null)
    {
      if (configurations.containsKey(configuration.getId()))
      {
        String name = configuration.getName() != null && configuration.getName().length() >0 ? configuration.getName() : configuration.getId() ;

        Configuration oldConfiguration = configurations.get(configuration.getId()) ;

        Configuration mergedConfiguration = ConfigurationUtils.mergeConfiguration(ConfigurationUtils.copyConfiguration(oldConfiguration), configuration) ;
        
        if (mergedConfiguration != null)
        {
          if (mergedConfiguration != oldConfiguration)
          {
            // merged configuration must have the same id as the old one, so this should replace it.
            configurations.put(mergedConfiguration.getId(), mergedConfiguration) ;
            Activator.getDefault().warn("Overriding configuration : " + name) ;
          }
          
          return true ;
        }
        else
        {
        	Activator.getDefault().warn("Can not update configuration : " + oldConfiguration.getId()) ;
          return false ;
        }
      }
      else
      {
        return configurations.put(configuration.getId(), configuration) != null ;
      }
    }
    else
    {
      return false ;
    }
  }

  /*****************************************************************************
   * A protected constructor, used by sub-classes and by the instance() method.
   ****************************************************************************/
  protected ConfigurationManager()
  {
    super();

    configurations = new HashMap<String, Configuration>() ;
  }

  /*****************************************************************************
   * Load available configurations from available configurations factories
   ****************************************************************************/
  protected void loadConfigurations()
  {
    IConfigurationElement[] configurationElements = Platform
    .getExtensionRegistry().getConfigurationElementsFor(
        CONFIGURATION_FACTORY_EXTENSION_POINT_ID);
    int i = 0;

    while (i < configurationElements.length)
    {
      try
      {
        if (configurationElements[i].getAttribute(CLASS_ATTRIBUTE_NAME) != null)
        {
          loadConfigurations((ConfigurationFactory) configurationElements[i].createExecutableExtension(CLASS_ATTRIBUTE_NAME), configurationElements[i].getNamespaceIdentifier());
          Activator.getDefault().info("Loaded configuration factory :" + configurationElements[i].getAttribute(CLASS_ATTRIBUTE_NAME) + " from plugin : " + configurationElements[i].getNamespaceIdentifier()) ;
        }
        else
        {
          if (configurationElements[i].getAttribute(FILE_ATTRIBUTE_NAME) != null)
          {
            Bundle bundle = Platform.getBundle(configurationElements[i].getNamespaceIdentifier());
            URL url = bundle.getResource(configurationElements[i].getAttribute(FILE_ATTRIBUTE_NAME));
            
            loadConfigurations(new XMLConfigurationFactory(url, configurationElements[i].getNamespaceIdentifier()), configurationElements[i].getNamespaceIdentifier());
            
            //Activator.getDefault().info("Loaded configuration file :" + configurationElements[i].getAttribute(FILE_ATTRIBUTE_NAME) + " from plugin : " + configurationElements[i].getNamespaceIdentifier()) ;
          }
        }
      }
      catch (Throwable e)
      {
      	Activator.getDefault().warn("Unable to load configuration file :" + configurationElements[i].getAttribute(FILE_ATTRIBUTE_NAME) + " from plugin : " + configurationElements[i].getNamespaceIdentifier(), e) ;
      }

      ++i;
    }
  }
  
  /*****************************************************************************
   * Load available configurations from configurations factories
   ****************************************************************************/
  protected void loadConfigurations(ConfigurationFactory factory, String pluginId)
  {
    if (factory != null)
    {
      Configuration[] configurations = factory.getConfigurations() ;
      String name = null ;

      if (configurations != null)
      {
        for (int i = 0; i < configurations.length; i++)
        {
          if (configurations[i].getId() != null && configurations[i].getId().length() > 0)
          {
            name = configurations[i].getName() != null && configurations[i].getName().length() >0 ? configurations[i].getName() : configurations[i].getId() ;
            if (!this.configurations.containsKey(configurations[i].getId()))
            {
              this.configurations.put(configurations[i].getId(), configurations[i]);
              // TODO configurations[i].setPlugin(pluginId) ;

              //Activator.getDefault().info("Loaded configuration: " + name + " from plugin : " + pluginId);
            }
            else
            {
            	Activator.getDefault().warn("Existing configuration: " + name + " New configuration ignored in from plugin : " + pluginId);    
            }
          }
          else
          {
          	Activator.getDefault().warn("Configuration has no id in plugin : " + pluginId);
          }
        }
      }
      else
      {
      	Activator.getDefault().warn("No configurations in factory, plugin : " + pluginId);
      }
    }
  }
}
