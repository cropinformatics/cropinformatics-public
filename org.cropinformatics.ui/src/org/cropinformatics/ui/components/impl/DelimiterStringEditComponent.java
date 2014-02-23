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

import java.util.List;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class DelimiterStringEditComponent extends TextEditComponent
{
  public static final String DELIMITER_PROPERTY = DelimiterStringEditComponent.class.getName() + ".string";
  
  public static final String TAB_BUTTON_COMPONENT_ID = "tabButton";
  public static final String COMMA_BUTTON_COMPONENT_ID = "commaButton";
  //public static final String SPECIAL_CHARACTERS_BUTTON_COMPONENT_ID = "specialCharactersButton";
  
  private static final String TAB_BUTTON_LABEL = DelimiterStringEditComponent.class.getName() + ".tabButtonLabel";
  private static final String COMMA_BUTTON_LABEL = DelimiterStringEditComponent.class.getName() + ".commaButtonLabel";
  
  protected static final Character TAB_VALUE = '\t' ;
  protected static final Character COMMA_VALUE = ',' ;
  
  private Button tabButton;

  private Button commaButton;

  public DelimiterStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, null, null) ;
  }
  
  public DelimiterStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String value)
  {
    this(parent, containerConfiguration, value, null) ;
  }
  
  public DelimiterStringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String value)
  {
    super(parent, containerConfiguration, labelValue, value);
  }
  
	@Override
  protected void updateInternalComponents()
  {
    if (String.valueOf(TAB_VALUE).equals(getValue()))
    {
      if (tabButton != null) 
        tabButton.setSelection(true) ;
      if (commaButton != null)
        commaButton.setSelection(false) ;
      if (getText() != null)
        commaButton.setEnabled(false) ;
    }
    else
    {
      if (String.valueOf(COMMA_VALUE).equals(getValue()))
      {
        if (tabButton != null)
          tabButton.setSelection(false) ;
        if (commaButton != null)
          commaButton.setSelection(true) ;
        if (getText() != null)
          commaButton.setEnabled(false) ;
      }
      else
      {
        if (tabButton != null)
          tabButton.setSelection(false) ;
        if (commaButton != null)
          commaButton.setSelection(false) ;
        if (getText() != null)
          getText().setEnabled(true) ;
      }
    }
  }
  
  @Override
  public void updateComponent()
  {
    if ((tabButton == null || !String.valueOf(TAB_VALUE).equals(getValue())) && 
        (commaButton == null || !String.valueOf(COMMA_VALUE).equals(getValue())))
    {
      super.updateComponent() ;
    }
  }

  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
    ControlConfiguration controlConfiguration = null ;
    
    if (configuration instanceof ControlConfiguration)
      controlConfiguration = (ControlConfiguration)configuration ;
    
    if (component == null)
    {
      if (TAB_BUTTON_COMPONENT_ID.equals(id))
      {
      	component = createButtonComponent(parent, controlConfiguration, SWT.CHECK) ;
        
        tabButton = (Button)component.getControl() ;
        
        tabButton.setText(Activator.getDefault().getString(TAB_BUTTON_LABEL)) ;
        
        if (String.valueOf(TAB_VALUE).equals(getValue()))
          tabButton.setSelection(true) ;
  
        tabButton.addSelectionListener(new SelectionListener()
        {
          public void widgetDefaultSelected(SelectionEvent e)
          {
            handleTabButtonSelected() ;  
          }

          public void widgetSelected(SelectionEvent e)
          {
            handleTabButtonSelected() ;  
          }
    
        }) ;
      }
      else
      {
        if (COMMA_BUTTON_COMPONENT_ID.equals(id))
        {
        	component = createButtonComponent(parent, controlConfiguration, SWT.CHECK) ;
          
        	commaButton = (Button)component.getControl() ;

          commaButton.setText(Activator.getDefault().getString(COMMA_BUTTON_LABEL)) ;
          
          if (String.valueOf(COMMA_VALUE).equals(getValue()))
            commaButton.setSelection(true) ;
    
          commaButton.addSelectionListener(new SelectionListener()
          {
            public void widgetDefaultSelected(SelectionEvent e)
            {
              handleCommaButtonSelected() ;  
            }

            public void widgetSelected(SelectionEvent e)
            {
              handleCommaButtonSelected() ;  
            }
      
          }) ;
             
          component = new SimpleControlComponent<Button>(commaButton) ;
        }
      }
    }
    
    return component ;
  }

  protected void handleTabButtonSelected()
  {
    if (tabButton.getSelection())
    {
    	setValueInternalWithEvent(String.valueOf(TAB_VALUE)) ;
      diasbleText() ;
      if (commaButton != null)
        commaButton.setSelection(false) ;
    }
    else
    {
      enableText() ;
    }
  }

  protected void handleCommaButtonSelected()
  {
    if (commaButton.getSelection())
    {
    	setValueInternalWithEvent(String.valueOf(COMMA_VALUE)) ;
      diasbleText() ;
      if (tabButton != null) 
        tabButton.setSelection(false) ;
    }
    else
    {
      enableText() ;
    }
  }
  
  private void enableText()
  {
    if (getText() != null)
    {
      if (getText().getText() != null && getText().getText().trim().length() > 0)
      	setValueInternalWithEvent(getText().getText().trim()) ;
      else
      	setValueInternalWithEvent(null) ;
      getText().setEnabled(true) ;
    }
    else
    {
    	setValueInternalWithEvent(null) ;
    }  
  }

  protected void diasbleText()
  {
    if (getText() != null)
    {
      getText().setEnabled(false) ;
    }
  }
 
	@Override
  protected void registerChildComponentIDs()
  {
		super.registerChildComponentIDs(); 
		
  	registerChildComponentID(TAB_BUTTON_COMPONENT_ID) ;
  	registerChildComponentID(COMMA_BUTTON_COMPONENT_ID) ;
  }
}
