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

import java.util.Date;
import java.util.List;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractDateEditComponent extends LabelledEditComponent<Date> implements DateEditComponent 
{
  public AbstractDateEditComponent(Composite parent)
  {
    this(parent, null, null, null) ;
  }
  
  public AbstractDateEditComponent(Composite parent, Date value)
  {
    this(parent, null, null, value) ;
  }
  
  public AbstractDateEditComponent(Composite parent, String labelValue, Date value)
  {
    super(parent, null, labelValue, value);
  }
  
  public AbstractDateEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, null, null) ;
  }
  
  public AbstractDateEditComponent(Composite parent, ContainerConfiguration containerConfiguration, Date value)
  {
    this(parent, containerConfiguration, null, value) ;
  }
  
  public AbstractDateEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Date value)
  {
    super(parent, containerConfiguration, labelValue, value);
  }
  
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(DATE_CHOOSER_COMPONENT_ID) ;
    
    return list ;
  }
}
