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
package org.cropinformatics.ui.components.impl;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;

public abstract class AbstractComponent<T extends ComponentConfiguration> extends AbstractConfigurable implements Component<T>
{
  protected static final int UNNOWN = 0;
  protected static final int UNDEFINED = 1;
  protected static final int DEFAULT = 2;
  protected static final int DEFINED = 3;
  protected static final int MERGED_WITH_DEFAULT = 4;

  private T configuration ;

  private int configurationStatus = UNNOWN ;
  
  public AbstractComponent(T configuration)
  {
  	super() ;
  	
    setConfiguration(configuration) ;
    
    setEditable(ConfigurationUtils.isEditable(getConfiguration())) ;
  }


  public final T getConfiguration()
  {
    return configuration ;
  }
  
	public String getId()
  {
    return getClass().getName() ;
  }
  
  public void updateComponent()
  {
    
  }
  
  @SuppressWarnings("unchecked")
  private final void setConfiguration(T configuration)
  {
    T defaultConfiguration = getDefaultConfiguration() ;
    
    if (configuration != null)
    {
      if (defaultConfiguration != null)
      {
        configurationStatus = MERGED_WITH_DEFAULT ;
        this.configuration = (T)ConfigurationUtils.mergeConfiguration(defaultConfiguration, configuration) ;
      }
      else
      {
        configurationStatus = DEFINED ;
        this.configuration = configuration ;
      }
    }
    else
    {
	    if (defaultConfiguration != null)
	    {
	      this.configuration = defaultConfiguration ;
	      configurationStatus = DEFAULT ;
	    }
	    else
	    {
	      configurationStatus = UNDEFINED ;
	    }
    }
    
    Activator.saveConfiguration(this.configuration) ;
  }
  
  protected final int getConfigurationStatus()
  {
    return configurationStatus;
  }
  
  protected abstract T getDefaultConfiguration() ;
}
