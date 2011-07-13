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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class TextEditComponent extends StringEditComponent<String>
{
  private boolean isPasswordField;
	private Integer maxLength;
  
  public TextEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, "", null) ;
  }
  
  public TextEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String value)
  {
    this(parent, containerConfiguration, null, value) ;
  }
  
  public TextEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String value)
  {
    this(parent, containerConfiguration, labelValue, value, false, null);
  }
  
  public TextEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String value, boolean isPasswordField)
  {
    this(parent, containerConfiguration, labelValue, value, isPasswordField, null);
  }
  
  public TextEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String value, Integer maxLength)
  {
    this(parent, containerConfiguration, labelValue, value, false, maxLength);
  }
  
  public TextEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String value, boolean isPasswordField, Integer maxLength)
  {
    super(parent, containerConfiguration, labelValue, value);
    
    this.isPasswordField = isPasswordField ;
    this.maxLength = maxLength ;
  }
 
	@Override
  protected int createStyle()
  {
    if (isPasswordField)
      return SWT.PASSWORD ;
    else
      return super.createStyle();
  }

  @Override
  protected String parseString(String string) 
  {
  	if (string != null)
  	{
    	String trimmedString = string.trim() ; // TODO not sure if this is appropriate
    	if (trimmedString.trim().length() == 0)
    		return null ;
    	else
      	if (maxLength != null && trimmedString != null && trimmedString.length() > maxLength)
      		return null ;
      	else
      		return string;
  	}
  	else
  	{
  		return null ;
  	}
  }

	@Override
  protected String parseValue(String value)
  {
		if (value != null)
			return value ;
		else
			return "" ;
  }
}
