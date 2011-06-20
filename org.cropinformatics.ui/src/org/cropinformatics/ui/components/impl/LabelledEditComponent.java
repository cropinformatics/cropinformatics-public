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

import org.apache.commons.lang.ObjectUtils;
import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;

public abstract class LabelledEditComponent<T> extends LabelledComponent implements EditComponent<ContainerConfiguration, T>
{
	private T value ;

  public LabelledEditComponent(Composite parent)
  {
    this(parent, null, null, null) ;
  }
  
  public LabelledEditComponent(Composite parent, String labelValue)
  {
    this(parent, null, labelValue, null);
  }
  
  public LabelledEditComponent(Composite parent, T value)
  {
    this(parent, null, null, value) ;
  }
  
  public LabelledEditComponent(Composite parent, String labelValue, T value)
  {
  	this(parent, null, labelValue, value);
  }
  
  public LabelledEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, null, null) ;
  }
  
  public LabelledEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue)
  {
    this(parent, containerConfiguration, labelValue, null);
  }
  
  public LabelledEditComponent(Composite parent, ContainerConfiguration containerConfiguration, T value)
  {
    this(parent, containerConfiguration, null, value) ;
  }
  
  public LabelledEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, T value)
  {
    super(parent, containerConfiguration, labelValue);
    setValue(value) ;
  }

	public boolean isValid()
  {
    if (ConfigurationUtils.isMandatory(getConfiguration()))
    {
    	return value != null ;
    }
    else
    {
    	return true ;
    }
  }
  
  public final T getValue()
  {
    return value;
  }

  public void setValue(T value)
  {
    if (this.value != value)
    {
      this.value = value ;
    }
  }  

	protected void setValueInternalWithEvent(T value)
  {
  	if (!ObjectUtils.equals(this.value, value))
  	{
	    T oldValue = this.value ;
	    this.value = value ;
	    
      validateValue() ;
	    
	    getPropertyChangeSupport().firePropertyChange(VALUE_CHANGED, oldValue, this.value) ;
  	} 
  }
  
  protected void validateValue()
  {
  	if (isValid())
  		setErrorMessage(Activator.getDefault().getString(MANDATORY_VALUE_NOT_DEFINED)) ;
  	else
  		setErrorMessage(null) ;
  }

	protected void setValueInternal(T value)
  {
    this.value = value ;
  }
}
