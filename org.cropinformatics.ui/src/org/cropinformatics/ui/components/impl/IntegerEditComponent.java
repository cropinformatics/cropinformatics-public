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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Spinner;

public class IntegerEditComponent extends LabelledEditComponent<Integer>
{
  public static final String INTEGER_SPINNER_COMPONENT_ID = "integerSpinner";
  
  private static final int DEFAULT_VALUE = 0;
  private static final int DEFAULT_MINIMUM = 0;
  private static final int DEFAULT_MAXIMUM = 100;
  private static final int DEFAULT_INCREMENT = 1;
  private static final int DEFAULT_PAGE_INCREMENT = 10;
  
  private Spinner spinner ;
  private int maximum;
  private int minimum;
  private int increment;
  private int pageIncrement;

  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, null, DEFAULT_VALUE, DEFAULT_MINIMUM, DEFAULT_MAXIMUM, DEFAULT_INCREMENT, DEFAULT_PAGE_INCREMENT) ;
  }

  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, int value)
  {
    this(parent, containerConfiguration, null, value, DEFAULT_MINIMUM, DEFAULT_MAXIMUM, DEFAULT_INCREMENT, DEFAULT_PAGE_INCREMENT) ;
  }
  
  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, int value)
  {
    this(parent, containerConfiguration, labelValue, value, DEFAULT_MINIMUM, DEFAULT_MAXIMUM, DEFAULT_INCREMENT, DEFAULT_PAGE_INCREMENT) ;
  }
  
  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, int value, int minimum, int maximum)
  {
    this(parent, containerConfiguration, null, value, minimum, maximum, DEFAULT_INCREMENT, DEFAULT_PAGE_INCREMENT) ;
  }
  
  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, int value, int minimum, int maximum)
  {
    this(parent, containerConfiguration, labelValue, value, minimum, maximum, DEFAULT_INCREMENT, DEFAULT_PAGE_INCREMENT) ;
  }

  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, int value, int minimum, int maximum, int increment)
  {
    this(parent, containerConfiguration, null, value, minimum, maximum, increment, DEFAULT_PAGE_INCREMENT) ;
  }
  
  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, int value, int minimum, int maximum, int increment)
  {
    this(parent, containerConfiguration, labelValue, value, minimum, maximum, increment, DEFAULT_PAGE_INCREMENT) ;
  }
  
  public IntegerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, int value, int minimum, int maximum, int increment, int pageIncrement)
  {
    super(parent, containerConfiguration, labelValue);

    this.minimum = minimum ;
    this.maximum = maximum ;
    this.increment = increment ;
    this.pageIncrement = pageIncrement ;
    
    setValue(value) ;
  }

  public void setValue(Integer value)
  {
  	if (value != null && value >= minimum && value <= minimum)
  	{
	    super.setValue(value) ;
  	}
  	else
  	{
	    super.setValue(minimum) ;
  	}
  	
    if (spinner != null)
      spinner.setSelection(getValue());
  }
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
    ControlConfiguration controlConfiguration = null ;
    
    if (configuration instanceof ControlConfiguration)
      controlConfiguration = (ControlConfiguration)configuration ;
    
    if (component == null && INTEGER_SPINNER_COMPONENT_ID.equals(id))
    {
    	component = createSpinnerComponent(parent, controlConfiguration) ;
      
      spinner = (Spinner)component.getControl() ;

      if (minimum <= maximum)
      {
        spinner.setMinimum(minimum);
        spinner.setMaximum(maximum);
      }
      else
      {
        spinner.setMinimum(DEFAULT_MINIMUM);
        spinner.setMaximum(DEFAULT_MAXIMUM);
      }
      
      spinner.setSelection(getValue());

      if (increment > 0)
        spinner.setIncrement(increment);
      else
        spinner.setIncrement(DEFAULT_INCREMENT);
      
      if (pageIncrement > 0)
        spinner.setPageIncrement(pageIncrement);
      else
        spinner.setPageIncrement(DEFAULT_PAGE_INCREMENT);
      
      spinner.setPageIncrement(100);

      spinner.addModifyListener(new ModifyListener()
      {
        public void modifyText(ModifyEvent e)
        {
          setValueInternalWithEvent(spinner.getSelection()) ;
        }
  
      }) ;
    }
    
    return component ;
  }
  
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(INTEGER_SPINNER_COMPONENT_ID) ;
    
    return list ;
  }
}
