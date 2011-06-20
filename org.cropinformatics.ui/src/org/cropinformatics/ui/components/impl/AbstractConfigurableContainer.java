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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractConfigurableContainer<T extends ContainerConfiguration> extends AbstractContainer<T>
{
  private List<String> childConpomentIds;

  public AbstractConfigurableContainer(Composite parent,
      T configuration)
  {
    super(parent, configuration);
  }
  
	@Override
  /**
   * Iterates through all the child configurations initialising the named child composites
   * and creating any unnamed composites as parents for the child components.
   * @param composite the parent for any newly created controls
   */
  protected final void initialiseComponent(Composite composite)
  {
    ComponentConfiguration configuration = getConfiguration() ;
    
    if (configuration != null)
    {
      if (configuration.isVisible())
      {
        if (configuration.getId() != null && canProvideChildComponent(configuration.getId()))
        {
          createAndInitialiseChildComponent(composite, null, configuration) ;
        }
        else
        {
        	if (configuration instanceof ContainerConfiguration)
        	{
        		if (composite == getParent())
        			createChildContainerComposite(composite, null, (ContainerConfiguration)configuration) ;
        		else
        			initialiseChildComponents(composite, (ContainerConfiguration)configuration) ;
        	}
        }
      }
    }
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
  protected final boolean canProvideChildComponent(String id)
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
  protected final Component<? extends ComponentConfiguration> createAndInitialiseChildComponent(Composite parent, 
  		ContainerConfiguration parentConfiguration, ComponentConfiguration configuration)
  {
  	Component<? extends ComponentConfiguration> childComponent = null ;
    
    if (!hasChildComponent(configuration.getId()))
    {
      childComponent = initialiseChildComponent(parent, configuration, configuration.getId()) ;
      
      ConfigurationUtils.createItemIfNeeded(parent, childComponent, parentConfiguration, configuration) ;
      
      if (childComponent != null)
      {
      	addChildComponent(configuration.getId(), childComponent) ;
        
      	childComponent.setEnabled(isEnabled() && childComponent.isEnabled()) ;
      	childComponent.setEditable(isEditable() && childComponent.isEditable()) ;

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
  protected final void createChildContainerComposite(Composite parent, ContainerConfiguration parentConfiguration, ContainerConfiguration configuration)
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
  
	public final String getErrorMessage()
	{
		String errorMessage = super.getErrorMessage() ;
	  	
	  if (errorMessage == null)
	  {
			Iterator<Component<? extends ComponentConfiguration>> components = getChildComponents().iterator() ;
			    
			while (errorMessage == null && components.hasNext())
				errorMessage = ConfigurationUtils.getErrorMessage(components.next()) ;
	  }
	  	
	  return errorMessage ;
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

}
