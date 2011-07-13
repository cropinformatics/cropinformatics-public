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
package org.cropinformatics.ui.components.impl;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractConfigurableEditComponent<T> extends
  AbstractConfigurableContainer<ContainerConfiguration> implements EditComponent<ContainerConfiguration, T>
{
  private T value ;

  public AbstractConfigurableEditComponent(Composite parent,
      ContainerConfiguration configuration)
  {
    super(parent, configuration);
  }
  
  public AbstractConfigurableEditComponent(Composite parent,
      ContainerConfiguration configuration, T value)
  {
    super(parent, configuration);
    setValue(value) ;
  }
  
	public boolean isValid()
  {
  	boolean valid = super.isValid() ;
  	
  	if (valid && ConfigurationUtils.isMandatory(getConfiguration()))
  	{
  		valid = getValue() != null ;
  	}
  	
    return valid ;
  }

  public T getValue()
  {
    return value;
  }

  public void setValue(T value)
  {
    if (this.value != value)
    {
      T oldValue = this.value ;
      
      this.value = value ;
      
      if (isValid())
      	updateErrorMessage() ;
      
      this.getPropertyChangeSupport().firePropertyChange(VALUE_CHANGED, oldValue, this.value) ;
    }
  }
  
	protected void updateErrorMessage()
	{
  	if (ConfigurationUtils.isMandatory(getConfiguration()))
  		setErrorMessage(Activator.getDefault().getString(MANDATORY_VALUE_NOT_DEFINED)) ;
  	else
  		setErrorMessage(null) ;
	}
	
	@Override
  protected final ContainerConfiguration getDefaultConfiguration()
  {
    return ConfigurationUtils.getContainerConfiguration(this);
  }
}
