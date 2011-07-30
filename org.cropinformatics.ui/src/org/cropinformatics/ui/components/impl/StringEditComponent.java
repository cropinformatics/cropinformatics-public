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

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public abstract class StringEditComponent<T> extends LabelledEditComponent<T> 
{
	public static final String TEXT_COMPONENT_ID = "text";
  
  private Text text ;

  public StringEditComponent(Composite parent)
  {
    super(parent) ;
  }
  
  public StringEditComponent(Composite parent, T value)
  {
  	super(parent, value) ;
  }
  
  public StringEditComponent(Composite parent, String labelValue, T value)
  {
  	super(parent, labelValue, value);
  }

  public StringEditComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    super(parent, containerConfiguration) ;
  }
  
  public StringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, T value)
  {
  	super(parent, containerConfiguration, value) ;
  }
  
  public StringEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, T value)
  {
    super(parent, containerConfiguration, labelValue, value);
  }
     
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
    ControlConfiguration controlConfiguration = null ;
    
    if (configuration instanceof ControlConfiguration)
      controlConfiguration = (ControlConfiguration)configuration ;
    
    if (component == null && TEXT_COMPONENT_ID.equals(id))
    {
    	component = createTextComponent(parent, controlConfiguration, createDefaultStyle()) ;
      
      text = (Text)component.getControl() ;
      
      if (getValue() != null)
        text.setText(parseValue(getValue())) ;
      else
      	text.setText("") ;
      
    	text.addVerifyListener(new VerifyListener()
    	{
				@Override
        public void verifyText(VerifyEvent event)
        {
	        handleVerifyText(event) ;
        }
    	});
    	
      text.addModifyListener(new ModifyListener()
      {
        public void modifyText(ModifyEvent event)
        {
        	handleModifyText(event) ;
        }
  
      }) ;
      
      text.addFocusListener(new FocusListener()
      {
				@Override
        public void focusGained(FocusEvent e)
        {
	        handleFocusChanged(e, true) ;
        }

				@Override
        public void focusLost(FocusEvent e)
        {
	        handleFocusChanged(e, false) ; 
        }
  
      }) ;
    }
    
    return component ;
  }

	protected void handleModifyText(ModifyEvent event)
  {
  	boolean oldValid = isValid() ;
  
  	setValueInternalWithEvent(parseString(text.getText())) ;
  	
    getPropertyChangeSupport().firePropertyChange(VALID, oldValid, isValid()) ;
  }
  
  protected void handleVerifyText(VerifyEvent event)
  {

  }
  
  protected void handleFocusChanged(FocusEvent event, boolean gainedFocus)
  {    
  	getPropertyChangeSupport().firePropertyChange(FOCUS, !gainedFocus, gainedFocus) ;
  }

  protected int createDefaultStyle()
  {
    return SWT.NONE ;
  }

  protected final Text getText()
  {
    return text;
  }
  
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(TEXT_COMPONENT_ID) ;
    
    return list ;
  }
  
  @Override
  protected void updateInternalComponents()
  {
  	if (text != null)
	    if (getValue() != null)
	      text.setText(parseValue(getValue())) ;
	    else
	    	text.setText("") ;
  }
  
  protected abstract String parseValue(T value) ;
  
  protected abstract T parseString(String value) ;
}
