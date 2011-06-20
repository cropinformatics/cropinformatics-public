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

import java.util.List;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class BooleanEditComponent extends LabelledEditComponent<Boolean>
{
  public static final String BOOLEAN_BUTTON_COMPONENT_ID = "booleanButton";
  
  private static final boolean DEFAULT_VALUE = false ;
  
  private Button button ;
  
  public BooleanEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, null, DEFAULT_VALUE) ;
  }

  public BooleanEditComponent(Composite parent, ContainerConfiguration containerConfiguration, boolean value)
  {
    this(parent, containerConfiguration, null, value) ;
  }
  
  public BooleanEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, boolean value)
  {
    super(parent, containerConfiguration, labelValue, value);
  }
  
  public void setValue(Boolean value)
  {
    super.setValue(value) ;
    if (button != null)
      button.setSelection(value) ;
  }
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
    ControlConfiguration controlConfiguration = null ;
    
    if (configuration instanceof ControlConfiguration)
      controlConfiguration = (ControlConfiguration)configuration ;
    
    if (component == null && BOOLEAN_BUTTON_COMPONENT_ID.equals(id))
    {
    	component = createButtonComponent(parent, controlConfiguration, SWT.CHECK) ;
    	
    	button = (Button)component.getControl() ;
      
      button.setSelection(getValue()) ;
      
      button.addSelectionListener(new SelectionListener()
      {
        public void widgetDefaultSelected(SelectionEvent e)
        {
          setValueInternalWithEvent(button.getSelection()) ;
        }

        public void widgetSelected(SelectionEvent e)
        {
          setValueInternalWithEvent(button.getSelection()) ;
        }
  
      }) ;
    }
    
    return component ;
  }
  
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(BOOLEAN_BUTTON_COMPONENT_ID) ;
    
    return list ;
  }
}
