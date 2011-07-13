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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.Container;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractContainer<T extends ContainerConfiguration> extends AbstractConfigurableControl<T> implements Container<T>
{
  private HashMap<String, Component<? extends ComponentConfiguration>> childComponents;
	private PropertyChangeListener propertyChangeListener;
	private boolean childComponentsValid = true ;

  public AbstractContainer(Composite parent,
      T configuration)
  {
    super(parent, configuration);
    childComponents = new HashMap<String, Component<? extends ComponentConfiguration>>() ;
    
	  propertyChangeListener = new PropertyChangeListener()
		{
			@Override
      public void propertyChange(PropertyChangeEvent event)
      {
				if (VALID.equals(event.getPropertyName()))
					checkChildValidation() ;
      }
		} ;
  }

	@Override
  public final void setEnabled(boolean enabled)
  {
  	if (childComponents != null)
  	{
	    boolean oldValue = isEnabled() ;
	    
	    if (oldValue != enabled)
	    {
		    super.setEnabled(enabled);
		    
		    Iterator<Component<? extends ComponentConfiguration>> components = childComponents.values().iterator() ;
		    
		    while (components.hasNext())
		      components.next().setEnabled(enabled) ;
	    }
  	}
  	else
  	{
  		super.setEnabled(enabled);
  	}
  }

  @Override
  public final void setVisible(boolean visible)
  {
  	if (childComponents != null)
  	{
	    boolean oldValue = isVisible() ;
	    
	    if (oldValue != visible)
	    {
	      super.setVisible(visible);
	        
	      Iterator<Component<? extends ComponentConfiguration>> components = childComponents.values().iterator() ;
	      
	      while (components.hasNext())
	        components.next().setVisible(visible) ;
	    }
  	}
  	else
  	{
  		super.setVisible(visible);
  	}
  }
  
  @Override
  public final void setEditable(boolean editable)
  {
  	if (childComponents != null)
  	{
	    boolean oldValue = isEditable() ;
	    
	    if (oldValue != editable)
	    {
		    super.setEditable(editable);
		    
		    Iterator<Component<? extends ComponentConfiguration>> components = childComponents.values().iterator() ;
		    
		    while (components.hasNext())
		      components.next().setEditable(editable) ;
	    }
  	}
  	else
  	{
  		super.setEditable(editable);
  	}
  }
 
  @Override
  public final void dispose()
  {
  	disposeChildComponents() ;

    super.dispose();
    
    disposeContainer() ;
  }
  
  public boolean isValid()
  { 
    return childComponentsValid ;
  }

	/**
   * Gets a list of all child component ids that that are used by this components
   * 
   * @return a list child component ids that that are used by this components
   */
  protected List<String> getChildConpomentIds()
  {
    return new LinkedList<String>() ;
  }
  
  /**
   * Determines if a component has be initialised
   * 
   * @param id the id of the component
   * @return <code>true</code> if the component has be initialised, <code>false</code> otherwise
   */
  public final boolean hasChildComponent(String id)
  {
    return childComponents.containsKey(id) ;
  }

  /**
   * Gets the child component of the given id, if has been initialised
   * @param id the id of the component
   * @return he child component of the given id, if has been initialised
   */
  public final Component<? extends ComponentConfiguration> getChildComponent(String id)
  {
    return childComponents.get(id) ;
  }
  
  /**
   * Updates the child component of the given id, if has been initialised
   * @param id the id of the component
   */
  public final void updateChildComponent(String id)
  {
  	Component<? extends ComponentConfiguration> childComponent = childComponents.get(id) ;
  	
  	if (childComponent != null)
  		childComponent.updateComponent() ;
  }

  /**
   * Gets all of the child components
   * @return all of the child components
   */
  public final Collection<Component<? extends ComponentConfiguration>> getChildComponents()
  {
    return childComponents.values() ;
  }
  
  /**
   * Add a component to this parent component
   * @param id the id of the component
   * @param component the component to added
   * @return the component added
   */
  protected final Component<? extends ComponentConfiguration> addChildComponent(String id, Component<? extends ComponentConfiguration> component)
  {
		component.addPropertyChangeListener(propertyChangeListener) ;
		
		if (childComponentsValid)
			childComponentsValid = component.isValid() ;
		
    return childComponents.put(id, component) ;
  }
  
  protected void postInitialiseComponent()
  {
  	checkChildValidation() ;
  }

  protected final void disposeChildComponents()
  {
  	if (childComponents != null)
  	{
	    Iterator<Component<? extends ComponentConfiguration>> components = childComponents.values().iterator() ;
	    
	    while (components.hasNext())
	    	disposeChildComponent(components.next()) ;
	    
	    childComponents.clear() ;
  	}
  }

  /**
   * Dispose the component of the given id.
   * 
   * @param parent the parent composite in which the component will be laid out
   * @param configuration the configuration of the component
   * @param id the id of the configuration which is used to identified which component to the initialised
   * @return
   */
  protected void disposeChildComponent(Component <? extends ComponentConfiguration> component)
  {
  	component.removePropertyChangeListener(propertyChangeListener) ;
  	component.dispose() ;
  }
  
  protected void disposeContainer()
  {
  	
  }

	protected final void checkChildValidation()
  {
		boolean oldValue = isValid() ;
		
		childComponentsValid = true ;
		
    Iterator<Entry<String, Component<? extends ComponentConfiguration>>> components = childComponents.entrySet().iterator() ;
    
    Entry<String, Component<? extends ComponentConfiguration>> entry ;
    
    String childErrorMessage = null ;
    
    while (childComponentsValid && components.hasNext())
    {
    	entry = components.next() ;
    	
    	childComponentsValid = entry.getValue() != null && isChildValid(entry.getKey(), entry.getValue()) ;
    	
    	if (!childComponentsValid && childErrorMessage == null)
    		childErrorMessage = getChildErrorMessage(entry.getKey(), entry.getValue()) ;
    }
    
    if (childComponentsValid)
    	childErrorMessage = null ;
    
    setErrorMessage(childErrorMessage) ;
    
		if (oldValue != isValid())
			getPropertyChangeSupport().firePropertyChange(VALID, oldValue, isValid()) ;
  }

	protected boolean isChildValid(String id,
      Component<? extends ComponentConfiguration> component)
  {
	  return component.isValid() ;
  }
  
  protected String getChildErrorMessage(String id,
      Component<? extends ComponentConfiguration> component)
  {
  	if (component instanceof AbstractConfigurableControl)
  		return ((AbstractConfigurableControl)component).getErrorMessage() ;  
  	else
  		return null ;
  }
}
