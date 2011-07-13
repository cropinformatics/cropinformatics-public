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
package org.cropinformatics.ui.components.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractIdentificationEditComponent<T> extends AbstractConfigurableEditComponent<T>
{
  public static final String UNIQUE_IDENTIFIER_COMPONENT_ID = "uniqueIdenitfierComponent";
  public static final String NAME_COMPONENT_ID = "nameComponent";
  public static final String DESCRIPTION_COMPONENT_ID = "descriptionComponent";

  private static final String UNIQUE_IDENTIFIER_COMPONENT_LABEL = AbstractIdentificationEditComponent.class.getName() + ".uniqueIdenitfierLabel";
  private static final String NAME_COMPONENT_LABEL = AbstractIdentificationEditComponent.class.getName() + ".nameLabel";
  private static final String DESCRIPTION_COMPONENT_LABEL = AbstractIdentificationEditComponent.class.getName() + ".descriptionLabel";
	
  public AbstractIdentificationEditComponent(Composite parent,
      ContainerConfiguration configuration)
  {
    super(parent, configuration);
  }
  
  public AbstractIdentificationEditComponent(Composite parent,
      ContainerConfiguration configuration, T value)
  {
    super(parent, configuration, value);
  }
  
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public void setValue(T value)
  {
    if (getValue() != value)
    {
      super.setValue(value) ;
      
      if (hasChildComponent(UNIQUE_IDENTIFIER_COMPONENT_ID))
        ((StringEditComponent)getChildComponent(UNIQUE_IDENTIFIER_COMPONENT_ID)).setValue(getUniqueIdentifier()) ;
      
      if (hasChildComponent(NAME_COMPONENT_ID))
        ((StringEditComponent)getChildComponent(NAME_COMPONENT_ID)).setValue(getName()) ;

      if (hasChildComponent(DESCRIPTION_COMPONENT_ID))
        ((TextEditComponent)getChildComponent(DESCRIPTION_COMPONENT_ID)).setValue(getDescription()) ;
    }
  }

  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = null ;
    ContainerConfiguration containerConfiguration = null ;
    
    if (configuration instanceof ContainerConfiguration)
      containerConfiguration = (ContainerConfiguration)configuration ;
    
    if (NAME_COMPONENT_ID.equals(id))
    {
      component = new TextEditComponent(parent, containerConfiguration, Activator.getDefault().getString(NAME_COMPONENT_LABEL), getName()) ;

      component.addPropertyChangeListener(new PropertyChangeListener()
      {
        public void propertyChange(PropertyChangeEvent event)
        {
        	handleNameChanged(event) ;
        }
      }) ;
    }
    else
    {
      if (UNIQUE_IDENTIFIER_COMPONENT_ID.equals(id))
      {
        component = new TextEditComponent(parent, containerConfiguration, Activator.getDefault().getString(UNIQUE_IDENTIFIER_COMPONENT_LABEL), getUniqueIdentifier()) ;
        
        component.addPropertyChangeListener(new PropertyChangeListener()
        {
          public void propertyChange(PropertyChangeEvent event)
          {
          	handleUniqueIdentifierChanged(event) ;
          }
        }) ;
      }
      else
      {
        if (DESCRIPTION_COMPONENT_ID.equals(id))
        {
          component = new TextEditComponent(parent, containerConfiguration, Activator.getDefault().getString(DESCRIPTION_COMPONENT_LABEL), getDescription()) ;
          
          component.addPropertyChangeListener(new PropertyChangeListener()
          {
            public void propertyChange(PropertyChangeEvent event)
            {
            	handleDescriptionChanged(event) ;
            }
          }) ;
        }
      }
    }
    
    return component;
  }
  
  protected void handleUniqueIdentifierChanged(PropertyChangeEvent event)
  {
		if (EditComponent.VALUE_CHANGED.equals(event.getPropertyName()))
		{
      if (getValue() == null)
        intialiseDefaultValue() ;
      
      setUniqueIdentifier(((TextEditComponent)getChildComponent(UNIQUE_IDENTIFIER_COMPONENT_ID)).getValue()) ;
      // TODO perhaps should be handled as a new separate event
      getPropertyChangeSupport().firePropertyChange(event) ;
		}
		else
		{
	  	if (Component.FOCUS.equals(event.getPropertyName()))
	  	{
	  		if (event.getSource() instanceof Component && event.getNewValue() instanceof Boolean)
	  			focusChanged(event.getSource(), (Boolean)event.getNewValue()) ;
	  	}
		}
  }
  
  protected void handleNameChanged(PropertyChangeEvent event)
  {
		if (EditComponent.VALUE_CHANGED.equals(event.getPropertyName()))
		{
      if (getValue() == null)
        intialiseDefaultValue() ;
      
      setName(((TextEditComponent)getChildComponent(NAME_COMPONENT_ID)).getValue()) ;
      // TODO perhaps should be handled as a new separate event
      getPropertyChangeSupport().firePropertyChange(event) ;
		}
		else
		{
	  	if (Component.FOCUS.equals(event.getPropertyName()))
	  	{
	  		if (event.getSource() instanceof Component && event.getNewValue() instanceof Boolean)
	  			focusChanged(event.getSource(), (Boolean)event.getNewValue()) ;
	  	}
		}
  }
  
  protected void handleDescriptionChanged(PropertyChangeEvent event)
  {
		if (EditComponent.VALUE_CHANGED.equals(event.getPropertyName()))
		{
      if (getValue() == null)
        intialiseDefaultValue() ;
      
      setDescription(((TextEditComponent)getChildComponent(DESCRIPTION_COMPONENT_ID)).getValue()) ;
      // TODO perhaps should be handled as a new separate event
      getPropertyChangeSupport().firePropertyChange(event) ;
		}
		else
		{
	  	if (Component.FOCUS.equals(event.getPropertyName()))
	  	{
	  		if (event.getSource() instanceof Component && event.getNewValue() instanceof Boolean)
	  			focusChanged(event.getSource(), (Boolean)event.getNewValue()) ;
	  	}
		}
  }

	protected void focusChanged(Object source, boolean gainedFocus)
  {

  }
	
	@Override
  protected List<String> getChildConpomentIds()
  {
	  List<String> childConpomentIds = super.getChildConpomentIds();
	  
	  childConpomentIds.add(UNIQUE_IDENTIFIER_COMPONENT_ID) ;
	  childConpomentIds.add(NAME_COMPONENT_ID) ;
	  childConpomentIds.add(DESCRIPTION_COMPONENT_ID) ;
	  
	  return childConpomentIds ;
  }

	protected final void intialiseDefaultValue()
  {
    setValue(createDefaultValue()) ;
  }
  
  protected abstract T createDefaultValue() ;
  
  protected abstract String getUniqueIdentifier() ;

  protected abstract String getName() ;
  
  protected abstract String getDescription() ;

  protected abstract void setUniqueIdentifier(String uniqueIdentifier) ;
  
  protected abstract void setName(String name) ;

  protected abstract void setDescription(String description) ;

}
