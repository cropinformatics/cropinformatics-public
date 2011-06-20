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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.daveneti.ui.components.Component;
import org.daveneti.ui.components.ComponentProvider;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractConfigurableComponentProvider extends AbstractConfigurable implements ComponentProvider
{
  private HashMap<String, Component<? extends ComponentConfiguration>> childComponents;

  private List<String> childConpomentIds;

  public AbstractConfigurableComponentProvider()
  {
    childComponents = new HashMap<String, Component<? extends ComponentConfiguration>>() ;
  }
 
  @Override
  public void dispose()
  {
    Iterator<Component<? extends ComponentConfiguration>> components = childComponents.values().iterator() ;
    
    while (components.hasNext())
    	disposeChildComponent(components.next()) ;
    
    childComponents.clear() ;
    
    super.dispose();
  }

	@Override
	public Component<? extends ComponentConfiguration> 
		createComponent(Composite parent, ComponentConfiguration configuration)
  {
		Component<? extends ComponentConfiguration> component = null ;
		
    if (configuration != null)
    {
      if (configuration.isVisible())
      {
        if (configuration.getId() != null && canProvideChildComponent(configuration.getId()))
        {
          createAndInitialiseChildComponent(parent, null, configuration) ;
        }
        else
        {
        	if (configuration instanceof ContainerConfiguration)
        	{
        		initialiseChildComponents(parent, (ContainerConfiguration)configuration) ;
        	}
        }
      }
    }
    
    return component ;
  }

  /** 
   * Tests if the container can provide the child component with the
   * given id. If this method returns <code>true</code> the 
   * {@link #initialiseChildComponent(Composite, ComponentConfiguration, String)}
   * method must return non-null for the given id.
   * 
   * @param id the id to be tested
   * @return <code>true</code> if the container can provide the component, <code>false</code>
   */
  protected boolean canProvideChildComponent(String id)
  {
    if (childConpomentIds == null)
      childConpomentIds = getChildConpomentIds() ;
    return childConpomentIds.contains(id) ;
  }

  /**
   * Creates and initialises a child component of the given id and registers it to the container
   * so that it can be later retrieved using the {@link #getChildComponent(String)} method
   * 
   * @param parent the parent for any newly created controls
   * @param parentConfiguration the configuration of the parent component
   * @param configuration the configuration of the newly created component. If set to null
   * the component default will be used exclusively
   * @return the newly created component
   */
  protected Component<? extends ComponentConfiguration> createAndInitialiseChildComponent(Composite parent, 
  		ContainerConfiguration parentConfiguration, ComponentConfiguration configuration)
  {
  	Component<? extends ComponentConfiguration> childComponent = null ;
    
    if (!childComponents.containsKey(configuration.getId()))
    {
      childComponent = initialiseChildComponent(parent, configuration, configuration.getId()) ;
      
      ConfigurationUtils.createItemIfNeeded(parent, childComponent, parentConfiguration, configuration) ;
      
      if (childComponent != null)
      {
        childComponents.put (configuration.getId(), childComponent) ;
        
      	childComponent.setVisible(isVisible()) ;
      	childComponent.setEnabled(isEnabled()) ;
      	childComponent.setEditable(isEditable()) ;

        childComponent.initialise() ;
      }
    }
    
    return childComponent ;
  }

  /**
   * In the case of container configuration call {@link #initialiseComponent(Composite, ComponentConfiguration, ComponentConfiguration)}
   * on all child components in the configuration
   * 
   * @param parent the parent composite in to which newly created controls are placed
   * @param configuration the container configuration
   */
  protected final void initialiseChildComponents(Composite parent, ContainerConfiguration configuration)
  {
    if (configuration != null)
    {
      Iterator<ComponentConfiguration> iterator = configuration.getComponents().iterator() ;
      
      while (iterator.hasNext())
      {
        initialiseComponent(parent, configuration, iterator.next()) ;
      }
    }
  }

  /**
   * Checks if a new component can be created for this configuration and calls if so
   * {@link #createAndInitialiseChildComponent(Composite, ComponentConfiguration, ComponentConfiguration)}.
   * If not {@link #createCompositeIfNeeded(Composite, ComponentConfiguration)} is called to
   * ensure any child composites are created.
   * 
   * @param composite the parent composite
   * @param parentConfiguration the configuration of the parent component
   * @param configuration the configuration of the child component
   * @return The newly created component or <code>null</code> if no component is created
   */
  protected final Component<? extends ComponentConfiguration> initialiseComponent(Composite composite, ContainerConfiguration parentConfiguration, ComponentConfiguration configuration)
  {          
    if (configuration != null && configuration.isVisible())
    {
      if (configuration.getId() != null && canProvideChildComponent(configuration.getId()))
      {
        return createAndInitialiseChildComponent(composite, parentConfiguration, configuration) ;
      }
      else
      {
      	if (configuration instanceof ContainerConfiguration)
      		createChildContainerComposite(composite, parentConfiguration, (ContainerConfiguration)configuration) ;
      }
    }
    
    return null ;
  }
  
  /**
   * Creates a child composite based on the given configuration, such as a Composite, Group, ExpandBar or TabFolder.
   * A call to {@link #initialiseComponent(Composite, ContainerConfiguration)} is used to 
   * create the children of the newly created child component.
   * 
   * @param parent the parent composite in to which newly created controls are placed
   * @param parentConfiguration the configuration of the parent component
   * @param configuration the configuration of the child component
   */
  protected void createChildContainerComposite(Composite parent, ContainerConfiguration parentConfiguration, ContainerConfiguration configuration)
  {
    initialiseChildComponents(ConfigurationUtils.createCompositeIfNeeded(parent, parentConfiguration, configuration), (ContainerConfiguration)configuration) ;
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
    return childComponents.put(id, component) ;
  }
  
  /**
   * Initialise the component of the given id using the given configuration and parent.
   * 
   * @param parent the parent composite in which the component will be laid out
   * @param configuration the configuration of the component
   * @param id the id of the configuration which is used to identified which component to the initialised
   * @return
   */
  protected abstract Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)  ;
  
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
  	component.dispose() ;
  }
}
