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
package org.daveneti.ui.components.impl;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class LongStringEditComponent extends StringEditComponent<Long>
{
  private Long minimum;
	private Long maximum;

	public LongStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, "", null, null, null) ;
  }
  
  public LongStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, Long value)
  {
    this(parent, containerConfiguration, null, value, null, null) ;
  }
  
  public LongStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Long value)
  {
    this(parent, containerConfiguration, labelValue, value, null, null);
  }
  
  public LongStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Long value, Long minimum, Long maximum)
  {
    super(parent, containerConfiguration, labelValue, value);
    
    this.minimum = minimum ;
    this.maximum = maximum ;
  }

	@Override
  protected String parseValue(Long value) 
  {
  	if (value != null)
  		return value.toString();
  	else
  		return "" ;
  }

  @Override
  protected Long parseString(String string) 
  {
  	try
    {
  		Long longObject = Long.valueOf(string);
  		
  		if (minimum != null && longObject < minimum)
  			longObject = null ;
  		else
    		if (maximum != null && longObject > maximum)
    			longObject = null ;
  		
  		return longObject ;
    }
    catch (NumberFormatException e)
    {
	    return null ;
    }
  }
}
