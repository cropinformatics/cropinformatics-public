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

import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class DoubleStringEditComponent extends StringEditComponent<Double>
{
  private Double minimum;
	private Double maximum;

	public DoubleStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, "", null, null, null) ;
  }
  
  public DoubleStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, Double value)
  {
    this(parent, containerConfiguration, null, value, null, null) ;
  }
  
  public DoubleStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Double value)
  {
    this(parent, containerConfiguration, labelValue, value, null, null);
  }
  
  public DoubleStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Double value, Double minimum, Double maximum)
  {
    super(parent, containerConfiguration, labelValue, value);
    
    this.minimum = minimum ;
    this.maximum = maximum ;
  }

	@Override
  protected String parseValue(Double value) 
  {
  	if (value != null)
  		return value.toString();
  	else
  		return "" ;
  }

  @Override
  protected Double parseString(String string) 
  {
  	try
    {
  		Double doubleObject = Double.valueOf(string);
  		
  		if (minimum != null && doubleObject < minimum)
  			doubleObject = null ;
  		else
    		if (maximum != null && doubleObject > maximum)
    			doubleObject = null ;
  		
  		return doubleObject ;
    }
    catch (NumberFormatException e)
    {
	    return null ;
    }
  }
}
