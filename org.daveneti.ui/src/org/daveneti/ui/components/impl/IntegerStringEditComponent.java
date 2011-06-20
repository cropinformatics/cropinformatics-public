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
package org.daveneti.ui.components.impl;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class IntegerStringEditComponent extends StringEditComponent<Integer>
{
  private Integer maximum;
  private Integer minimum;
  
  public IntegerStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, "", null) ;
  }
  
  public IntegerStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, Integer value)
  {
    this(parent, containerConfiguration, null, value) ;
  }
  
  public IntegerStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Integer value)
  {
  	this(parent, containerConfiguration, labelValue, value, null, null);
  }
  
  public IntegerStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Integer value, Integer minimum, Integer maximum)
  {
    super(parent, containerConfiguration, labelValue, value);
    
    this.minimum = minimum ;
    this.maximum = maximum ;
  }

  @Override
  protected String parseValue(Integer value) 
  {
  	if (value != null)
  		return value.toString();
  	else
  		return "" ;
  }

  @Override
  protected Integer parseString(String string) 
  {
  	try
    {
  		Integer integer = Integer.valueOf(string);
  		
  		if (minimum != null && integer < minimum)
  			integer = null ;
  		else
    		if (maximum != null && integer > maximum)
    			integer = null ;
  		
  		return integer ;
    }
    catch (NumberFormatException e)
    {
	    return null ;
    }
  }
}
