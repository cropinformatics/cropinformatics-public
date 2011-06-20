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
package org.cropinformatics.ui.configuration.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.PluginUtils;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.Configurable;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.components.impl.ControlComponent;
import org.cropinformatics.ui.components.impl.SimpleControlComponent;
import org.cropinformatics.ui.configuration.CTabFolderConfiguration;
import org.cropinformatics.ui.configuration.Colour;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.Configuration;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ConfigurationListType;
import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.ControlPathElement;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.DocumentRoot;
import org.cropinformatics.ui.configuration.EditorConfiguration;
import org.cropinformatics.ui.configuration.ExpandBarConfiguration;
import org.cropinformatics.ui.configuration.Image;
import org.cropinformatics.ui.configuration.Label;
import org.cropinformatics.ui.configuration.Layout;
import org.cropinformatics.ui.configuration.LayoutData;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.MappingViewerConfiguration;
import org.cropinformatics.ui.configuration.MatrixViewerConfiguration;
import org.cropinformatics.ui.configuration.MultipleListViewerConfiguration;
import org.cropinformatics.ui.configuration.PagePathElement;
import org.cropinformatics.ui.configuration.PartConfiguration;
import org.cropinformatics.ui.configuration.PathElement;
import org.cropinformatics.ui.configuration.PerspectiveConfiguration;
import org.cropinformatics.ui.configuration.QueryResultViewerConfiguration;
import org.cropinformatics.ui.configuration.SubPath;
import org.cropinformatics.ui.configuration.TabFolderConfiguration;
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.cropinformatics.ui.configuration.ViewConfiguration;
import org.cropinformatics.ui.configuration.ViewerConfiguration;
import org.cropinformatics.ui.configuration.WizardConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.util.ConfigurationResourceFactoryImpl;
import org.cropinformatics.ui.preferences.PreferenceConstants;
import org.cropinformatics.ui.viewers.ConfigurableViewer;
import org.cropinformatics.ui.viewers.twin.AbstractTwinViewer;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class ConfigurationUtils
{
  public static final String CONFIGURATION_FILE_EXTN = ".configuration" ;
  public static final String CONFIGURATION_FILE_TEMPLATE_EXTN = CONFIGURATION_FILE_EXTN + ".template" ;
  
  //private static ColourMap colourMap = new ColourWheelColourMap() ;
  //private static int colour ;
  //private static int altColour = colourMap.getSize() / 2;
  //private static boolean useAltColour = false ;

  /**
   * Gets the child component configuration from a container configuration by id
   * @param containerConfiguration the parent container configuration
   * @param id the id unique within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ComponentConfiguration getChildComponentConfiguration(
      ContainerConfiguration containerConfiguration, String id)
  {
    ComponentConfiguration componentConfiguration = null ;
    
    if (id != null && id != null)
    {
      Iterator<ComponentConfiguration> iterator = containerConfiguration.getComponents().iterator() ;
      
      while (componentConfiguration == null && iterator.hasNext())
      {
        componentConfiguration = iterator.next() ;
        
        if (!id.equals(componentConfiguration.getId()))
          componentConfiguration = null ;
      }
    }
    return componentConfiguration;
  }
  
  /**
   * Gets the child component configuration from a container configuration by i
   * @param containerConfiguration the parent container configuration
   * @param index the index within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ComponentConfiguration getChildComponentConfiguration(
      ContainerConfiguration containerConfiguration, int index)
  {
    ComponentConfiguration componentConfiguration = null ;
    
    if (index >= 0 && index < containerConfiguration.getComponents().size())
    {
      componentConfiguration = containerConfiguration.getComponents().get(index) ;
    }
    
    return componentConfiguration;
  }
  
  /**
   * Gets the child component configuration from a container configuration by i
   * @param containerConfiguration the parent container configuration
   * @param index the index within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ContainerConfiguration getChildContainerConfiguration(
      ContainerConfiguration parentConfiguration, int index)
  {
    ComponentConfiguration childConfiguration = getChildConfiguration(parentConfiguration, index) ;
    
    if (childConfiguration instanceof ContainerConfiguration)
      return (ContainerConfiguration)childConfiguration ;
    else
      return null ;
  }
  
  /** 
   * Gets a wizard page configuration from a wizard configuration by id
   * @param wizardConfiguration
   * @param id the id unique within this wizard for the required page
   * @return the page configuration with the given id
   */
  public static final WizardPageConfiguration getWizardPageConfiguration(WizardConfiguration wizardConfiguration, String uniqueIdentifier)
  {
    WizardPageConfiguration wizardPageConfiguration = null ;
    
    if (wizardConfiguration != null && uniqueIdentifier != null)
    {
      Iterator<WizardPageConfiguration> iterator = wizardConfiguration.getPages().iterator() ;
      
      while (wizardPageConfiguration == null && iterator.hasNext())
      {
        wizardPageConfiguration = iterator.next() ;
        
        if (!uniqueIdentifier.equals(wizardPageConfiguration.getId()))
          wizardPageConfiguration = null ;
      }
    }
    
    return wizardPageConfiguration;
  }
  
  /**
   * Gets a dialog configuration by unique identifier from the configuration platform system
   * @param uniqueIdentifier the system wide unique identifier for the dialog
   * @return the dialog configuration of the given system wide unique identifier
   */
  public static final Configuration getConfiguration(String uniqueIdentifier)
  {
  	return ConfigurationManager.instance().getConfiguration(uniqueIdentifier);
  }
  
  /**
   * Gets a dialog configuration by unique identifier from the configuration platform system
   * @param uniqueIdentifier the system wide unique identifier for the dialog
   * @return the dialog configuration of the given system wide unique identifier
   */
  public static final DialogConfiguration getDialogConfiguration(String uniqueIdentifier)
  {
    Configuration configuration = getConfiguration(uniqueIdentifier) ;
    
    if (configuration instanceof DialogConfiguration)
      return (DialogConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets a configuration for a configurable from the configuration platform system
   * @param configurable the configurable object 
   * @return the configuration of the given system wide unique identifier
   */
  public static final Configuration getConfiguration(Configurable<? extends Configuration> configurable)
  {
  	Configuration configuration = null ;

  	if (configurable != null)
  	{
	    configuration = ConfigurationManager.instance().getConfiguration(configurable.getId());
	    
	    if (configuration == null)
	    {
		    if (configuration == null)
		    {
		    	configuration = getConfigurationByClass(configurable.getClass()) ;
		    	
		    	configuration = copyConfiguration(configuration) ;
		    	
		    	/*if (configuration != null)
		    	{
			    	configuration.setId(configurable.getClass().getName()) ;
			    	
			    	ConfigurationManager.instance().addConfiguration(configuration) ;
		    	}*/
		    }
	    }
  	}
  	
    return configuration ;
  }

	/**
   * Gets a wizard configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the wizard configuration of the given system wide unique identifier
   */
  public static final WizardConfiguration getWizardConfiguration(Configurable<? extends WizardConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof WizardConfiguration)
      return (WizardConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets a dialog configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the dialog configuration of the given system wide unique identifier
   */
  public static final DialogConfiguration getDialogConfiguration(Configurable<? extends DialogConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof DialogConfiguration)
      return (DialogConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets a editor configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the editor configuration of the given system wide unique identifier
   */
  public static final EditorConfiguration getEditorConfiguration(Configurable<? extends EditorConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof EditorConfiguration)
      return (EditorConfiguration)configuration ;
    else
    	return null ;
  }

  /**
   * Gets a view configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the view configuration of the given system wide unique identifier
   */
  public static final ViewConfiguration getViewConfiguration(Configurable<? extends ViewConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof ViewConfiguration)
      return (ViewConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets a perspective configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the perspective configuration of the given system wide unique identifier
   */
  public static final PerspectiveConfiguration getPerspectiveConfiguration(Configurable<? extends PerspectiveConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof PerspectiveConfiguration)
      return (PerspectiveConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets a configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the dialog configuration of the given system wide unique identifier
   */
  public static final ControlConfiguration getControlConfiguration(Configurable<? extends ControlConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof ControlConfiguration)
      return (ControlConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets a configuration by unique identifier from the configuration platform system
   * @param configurable the configurable object 
   * @return the dialog configuration of the given system wide unique identifier
   */
  public static final ContainerConfiguration getContainerConfiguration(Configurable<? extends ContainerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof ContainerConfiguration)
      return (ContainerConfiguration)configuration ;
    else
    	return null ;
  }
  
	public static ViewerConfiguration getViewerConfiguration(Configurable<? extends ViewerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof ViewerConfiguration)
      return (ViewerConfiguration)configuration ;
    else
    	return null ;
  }

  public static ListViewerConfiguration getListViewerConfiguration(Configurable<? extends ListViewerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof ListViewerConfiguration)
      return (ListViewerConfiguration)configuration ;
    else
    	return null ;
  }
  
  public static MatrixViewerConfiguration getMatrixViewerConfiguration(Configurable<? extends MatrixViewerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof MatrixViewerConfiguration)
      return (MatrixViewerConfiguration)configuration ;
    else
    	return null ;
  }
  
  public static TwinViewerConfiguration getTwinViewerConfiguration(Configurable<? extends TwinViewerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof TwinViewerConfiguration)
      return (TwinViewerConfiguration)configuration ;
    else
    	return null ;
  }
  
  public static MappingViewerConfiguration getMappingViewerConfiguration(Configurable<? extends MappingViewerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof MappingViewerConfiguration)
      return (MappingViewerConfiguration)configuration ;
    else
    	return null ;
  }

  public static QueryResultViewerConfiguration getQueryResultViewerConfiguration(Configurable<? extends QueryResultViewerConfiguration> configurable)
  {
    Configuration configuration = getConfiguration(configurable) ;
    
    if (configuration instanceof QueryResultViewerConfiguration)
      return (QueryResultViewerConfiguration)configuration ;
    else
    	return null ;
  }
  
  /**
   * Gets the child component configuration from a container configuration by id, if
   * given configuration can contain children and the specified child is present
   * @param parentConfiguration the parent configuration
   * @param id the id unique within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ComponentConfiguration getChildConfiguration(
      ComponentConfiguration parentConfiguration, String id)
  {
    if (parentConfiguration instanceof ContainerConfiguration)
      return ConfigurationUtils.getChildComponentConfiguration((ContainerConfiguration)parentConfiguration, id) ;
    else
      return null ;
  }
  
  /**
   * Geta a list viewer child configuration from a given MultipleListViewerConfiguration at the specified index
   * @param parentConfiguration the parent configuration
   * @param index the index of the required child
   * @return the child list viewer configuration at the given index
   */
  public static final ComponentConfiguration getChildConfiguration(ComponentConfiguration parentConfiguration, int index)
  {
    if (parentConfiguration instanceof ContainerConfiguration)
      return ConfigurationUtils.getChildComponentConfiguration((ContainerConfiguration)parentConfiguration, index) ;
    else
      return null ;
  }
  
  /**
   * Gets the child component configuration from a container configuration by id, if
   * given configuration can contain children and the specified child is present
   * @param parentConfiguration the parent configuration
   * @param id the id unique within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ControlConfiguration getChildControlConfiguration(
      ComponentConfiguration parentConfiguration, String id)
  {
    ComponentConfiguration childConfiguration = getChildConfiguration(parentConfiguration, id) ;
    
    if (childConfiguration instanceof ControlConfiguration)
      return (ControlConfiguration)childConfiguration ;
    else
      return null ;
  }
  
  /**
   * Gets the child component configuration from a container configuration by id, if
   * given configuration can contain children and the specified child is present
   * @param parentConfiguration the parent configuration
   * @param id the id unique within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ContainerConfiguration getChildContainerConfiguration(
      ComponentConfiguration parentConfiguration, String id)
  {
    ComponentConfiguration childConfiguration = getChildConfiguration(parentConfiguration, id) ;
    
    if (childConfiguration instanceof ContainerConfiguration)
      return (ContainerConfiguration)childConfiguration ;
    else
      return null ;
  }
  
  /**
   * Gets the child component configuration from a container configuration by id, if
   * given configuration can contain children, the specified child is present and if
   * the child is of type ListViewerConfiguration
   * @param parentConfiguration the parent configuration
   * @param id the id unique within this container for the required child
   * @return the child list viewer configuration with the given id
   */
  public static final ListViewerConfiguration getChildListViewerConfiguration(
      ComponentConfiguration parentConfiguration, String id)
  {
    if (parentConfiguration instanceof ContainerConfiguration)
    {
      ComponentConfiguration childConfiguration = ConfigurationUtils.getChildComponentConfiguration((ContainerConfiguration)parentConfiguration, id) ;
      
      if (childConfiguration instanceof ViewerConfiguration)
        return (ListViewerConfiguration)childConfiguration ;
      else
        return null ;
    }
    else
    {
      return null ;
    }
  }
  
  /**
   * Geta a list viewer child configuration from a given MultipleListViewerConfiguration at the specified index
   * @param parentConfiguration the parent configuration
   * @param index the index of the required child
   * @return the child list viewer configuration at the given index
   */
  public static final ListViewerConfiguration getChildConfiguration(MultipleListViewerConfiguration parentConfiguration, int index)
  {
    if (parentConfiguration != null && parentConfiguration.getChildConfiguration() != null && 
        parentConfiguration.getChildConfiguration().size() > 0 && index < parentConfiguration.getChildConfiguration().size())
      return parentConfiguration.getChildConfiguration().get(index) ;
    else
      return null;
  }

  /**
   * Gets a child dialog configuration
   * @param parentConfiguration
   * @param componentId
   * @return
   */
  public static final DialogConfiguration getChildDialogConfiguration(ComponentConfiguration parentConfiguration,
      String componentId)
  {
    if (parentConfiguration instanceof ContainerConfiguration)
    {
      ComponentConfiguration childConfiguration = ConfigurationUtils.getChildComponentConfiguration((ContainerConfiguration)parentConfiguration, componentId) ;
      
      if (childConfiguration instanceof DialogConfiguration)
        return (DialogConfiguration)childConfiguration ;
      else
        return null ;
    }
    else
    {
      return null ;
    }
  }
  
  /**
   * Gets the control component configuration from a container configuration, if
   * given control and is of type ListViewerConfiguration. It returns null otherwise.
   * @param parentConfiguration the parent configuration
   * @return the child control
   */
  public static final ViewerConfiguration getChildViewerControl(Configuration parentConfiguration)
  {
    ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof ViewerConfiguration)
      return (ViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
 
  /**
   * Gets the control component configuration from a container configuration, if
   * given control and is of type ListViewerConfiguration. It returns null otherwise.
   * @param parentConfiguration the parent configuration
   * @return the child control
   */
  public static final ListViewerConfiguration getChildListViewerControl(Configuration parentConfiguration)
  {
    ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof ListViewerConfiguration)
      return (ListViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
  
  /**
   * Gets the control component configuration from a container configuration, if
   * given control and is of type ListViewerConfiguration. It returns null otherwise.
   * @param parentConfiguration the parent configuration
   * @return the child control
   */
  public static final MatrixViewerConfiguration getChildMatrixViewerControl(Configuration parentConfiguration)
  {
    ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof MatrixViewerConfiguration)
      return (MatrixViewerConfiguration)childConfiguration ;
    else
      return null ;
  }

	public static TwinViewerConfiguration getChildTwinViewerControl(
      DialogConfiguration parentConfiguration)
  {
		ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof TwinViewerConfiguration)
      return (TwinViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
	
	public static TwinViewerConfiguration getChildTwinViewerControl(
      WizardPageConfiguration parentConfiguration)
  {
		ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof TwinViewerConfiguration)
      return (TwinViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
	
	public static MappingViewerConfiguration getChildMappingViewerControl(
      DialogConfiguration parentConfiguration)
  {
		ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof MappingViewerConfiguration)
      return (MappingViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
	
	public static MappingViewerConfiguration getChildMappingViewerControl(
      WizardPageConfiguration parentConfiguration)
  {
		ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof MappingViewerConfiguration)
      return (MappingViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
	
  /**
   * Gets the control component configuration from a container configuration, if
   * given control and is of type ContainerConfiguration. It returns null otherwise.
   * @param parentConfiguration the parent configuration
   * @return the child control
   */
  public static final MultipleListViewerConfiguration getChildMultipleListViewerControl(Configuration parentConfiguration)
  {
    ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof MultipleListViewerConfiguration)
      return (MultipleListViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
  
	public static QueryResultViewerConfiguration getChildQueryResultViewerConfiguration(
      DialogConfiguration configuration)
  {
    ComponentConfiguration childConfiguration = getChildControl(configuration) ;
    
    if (childConfiguration instanceof QueryResultViewerConfiguration)
      return (QueryResultViewerConfiguration)childConfiguration ;
    else
      return null ;
  }

	public static QueryResultViewerConfiguration getChildQueryResultViewerConfiguration(
      WizardPageConfiguration configuration)
  {
    ComponentConfiguration childConfiguration = getChildControl(configuration) ;
    
    if (childConfiguration instanceof QueryResultViewerConfiguration)
      return (QueryResultViewerConfiguration)childConfiguration ;
    else
      return null ;
  }
	
  /**
   * Gets the control component configuration from a container configuration, if
   * given control and is of type ContainerConfiguration. It returns null otherwise.
   * @param parentConfiguration the parent configuration
   * @return the child control
   */
  public static final ContainerConfiguration getChildContainerControl(Configuration parentConfiguration)
  {
    ComponentConfiguration childConfiguration = getChildControl(parentConfiguration) ;
    
    if (childConfiguration instanceof ContainerConfiguration)
      return (ContainerConfiguration)childConfiguration ;
    else
      return null ;
  }
  
  /**
   * Gets the child control component configuration from a container configuration by id, if
   * given configuration can contain children and the specified child is present
   * @param parentConfiguration the parent configuration
   * @param id the id unique within this container for the required child
   * @return the child configuration with the given id
   */
  public static final ControlConfiguration getChildControl(Configuration parentConfiguration)
  {
    if (parentConfiguration instanceof WizardPageConfiguration)
      return ((WizardPageConfiguration)parentConfiguration).getControl() ;
    else
      if (parentConfiguration instanceof DialogConfiguration)
        return ((DialogConfiguration)parentConfiguration).getControl() ;
      else
        if (parentConfiguration instanceof ViewConfiguration)
          return ((ViewConfiguration)parentConfiguration).getControl() ;
        else
          if (parentConfiguration instanceof EditorConfiguration)
            return ((EditorConfiguration)parentConfiguration).getControl() ;
          else
          	return null ;
  }
   
  public static PathElement getChildPathElement(WizardConfiguration parentWizardConfiguration,
      String id)
  {
    PathElement pathElement = null ;
    
    if (id != null && id != null)
    {
      Iterator<PathElement> iterator = parentWizardConfiguration.getPath().iterator() ;
      
      while (pathElement == null && iterator.hasNext())
      {
        pathElement = iterator.next() ;
        
        if (!id.equals(pathElement.getId()))
          pathElement = null ;
      }
    }
    
    return pathElement;
  }
  
  public static SubPath getChildSubPath(ControlPathElement parentPathElement,
      String id)
  {
    SubPath subPath = null ;
    
    if (id != null && id != null)
    {
      Iterator<SubPath> iterator = parentPathElement.getSubPaths().iterator() ;
      
      while (subPath == null && iterator.hasNext())
      {
        subPath = iterator.next() ;
        
        if (!id.equals(subPath.getId()))
          subPath = null ;
      }
    }
    
    return subPath;
  }
  
  public static PathElement getChildPathElement(SubPath parentSubPath,
      String id)
  {
    PathElement pathElement = null ;
    
    if (id != null && id != null)
    {
      Iterator<PathElement> iterator = parentSubPath.getPath().iterator() ;
      
      while (pathElement == null && iterator.hasNext())
      {
        pathElement = iterator.next() ;
        
        if (!id.equals(pathElement.getId()))
          pathElement = null ;
      }
    }
    
    return pathElement;
  }
  
  /**
   * Creates a Composite or Group (if labelled) and then configures it with the given configuration
   * @param parent the parent of the composite to be created
   * @param configuration the configuration to be used
   * @return a new composite
   */
  public static Composite createComposite(Composite parent, ComponentConfiguration configuration)
  {
  	return createComposite(parent, null, configuration) ;
  }
  
  /**
   * Creates a Composite or Group (if labelled) and then configures it with the given configuration
   * @param parent the parent of the composite to be created
   * @param parentConfiguration the parentConfiguration if available
   * @param configuration the configuration to be used
   * @return a new composite
   */
  public static Composite createComposite(Composite parent, ContainerConfiguration parentConfiguration, ComponentConfiguration configuration)
  {
    Composite composite ;
    
    if (parent instanceof ExpandBar)
    {
    	composite = createInternalComposite(parent, configuration) ;
      
    	if (parentConfiguration instanceof ExpandBarConfiguration)
      {
    		ExpandItem item = createExpandItem((ExpandBar)parent, configuration) ;
        
    		item.setControl(composite) ;
      }
    }
    else
    {
      if (parent instanceof TabFolder)
      {
      	composite = createInternalComposite(parent, configuration) ;
        
        if (parentConfiguration instanceof TabFolderConfiguration)
        {
        	TabItem item = createTabItem((TabFolder)parent, configuration) ;
        
        	item.setControl(composite) ;
        }
      }
      else
      {
        if (parent instanceof CTabFolder)
        {
        	composite = createInternalComposite(parent, configuration) ;

        	if (parentConfiguration instanceof CTabFolderConfiguration)
          {
          	CTabItem item = createCTabItem((CTabFolder)parent, configuration) ;

          	item.setControl(composite) ;
          }
        }
        else
        {
        	if (configuration != null)
        	{
	        	if (configuration instanceof ExpandBarConfiguration || 
	        			configuration instanceof TabFolderConfiguration ||
	        			configuration instanceof CTabFolderConfiguration)
	        	{
	        		composite = createInternalComposite(parent, configuration) ;
	        	}
	        	else
	        	{
		        	if (configuration != null && configuration.getLabel() != null)
		          {
		            Group group = new Group(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE) ;
		            
		            group.setLayout(createDefaultGroupLayout()) ;
		
		            group.setText(getText(configuration.getLabel(), configuration));
		
		            composite = group;
		          }
		          else
		          {
		            composite = new Composite(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE);
		          }
	        	}
        	}
        	else
        	{
            composite = new Composite(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE);
        	}
        }
      }
    }

    updateControl(composite, configuration, createFilledLayoutData()) ;

    return composite ;
  }

  /**
   * Creates a Composite for use inside another component and then configures it with the given configuration
   * @param parent the parent of the composite to be created
   * @param configuration the configuration to be used
   * @return a new composite
   */
	public static Composite createInternalComposite(Composite parent,
      ComponentConfiguration configuration)
  {
		Composite composite = null ;
		
    if (configuration instanceof ExpandBarConfiguration)
    {  
    	composite = ConfigurationUtils.createExpandBar(parent, (ExpandBarConfiguration)configuration) ;
    }
    else
    {
    	if (configuration instanceof TabFolderConfiguration)
    	{  
    		composite = ConfigurationUtils.createTabFolder(parent, (TabFolderConfiguration)configuration) ;
    	}
    	else
    	{
    		if (configuration instanceof CTabFolderConfiguration)
    		{  
    			composite = ConfigurationUtils.createCTabFolder(parent, (TabFolderConfiguration)configuration) ;
    		}
    		else
    		{
    			composite = new Composite(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE);
    		}
    	}
    }

    updateControl(composite, configuration, createFilledLayoutData()) ;
    
    return composite ;
  }
	
  /**
   * Returns the original composite or a newly created enclosing control, such as
   * a Composite or Group. If a new composite is created it is configured with the given
   * configuration, if a new composite is not created the original composite is NOT configured 
   * with the given configuration. The returned composite can used to add child components.
   * @param parent the parent of the composite to be created
   * @param configuration the configuration to be used
   * @return a new composite
   */
  public static Composite createCompositeIfNeeded(Composite parent, ComponentConfiguration configuration)
  {
    if (isCreatingNewComposite(parent, configuration))
    {
      return createComposite(parent, null, configuration) ;
    }
    else
    {
      return parent ;
    }
  }
	
  /**
   * Returns the original composite or a newly created enclosing control, such as
   * a Composite or Group. If a new composite is created it is configured with the given
   * configuration, if a new composite is not created the original composite is NOT configured 
   * with the given configuration. The returned composite can used to add child components.
   * @param parent the parent of the composite to be created
   * @param parentConfiguration the parentConfiguration if available
   * @param configuration the configuration to be used
   * @return a new composite
   */
  public static Composite createCompositeIfNeeded(Composite parent, ContainerConfiguration parentConfiguration, ComponentConfiguration configuration)
  {
    if (isCreatingNewComposite(parent, parentConfiguration, configuration))
    {
      return createComposite(parent, parentConfiguration, configuration) ;
    }
    else
    {
      return parent ;
    }
  }
  
  /**
   * Determines if the configuration will create a new composite if it is used in the {@link #createCompositeIfNeeded(Composite, ComponentConfiguration)}
   * method
   * @param parent the parent the composite to be created
   * @param configuration the configuration to be tested
   * @return <code>true</code> if the configuration will create a new composite, <code>false</code> otherwise
   */
  public static boolean isCreatingNewComposite(Composite parent, ComponentConfiguration configuration)
  {
  	return isCreatingNewComposite(parent, null, configuration) ;
  }
  /**
   * Determines if the configuration will create a new composite if it is used in the {@link #createCompositeIfNeeded(Composite, ComponentConfiguration)}
   * method
   * @param parent the parent the composite to be created
   * @param parentConfiguration the parentConfiguration if available
   * @param configuration the configuration to be tested
   * @return <code>true</code> if the configuration will create a new composite, <code>false</code> otherwise
   */
  public static boolean isCreatingNewComposite(Composite parent, ContainerConfiguration parentConfiguration, ComponentConfiguration configuration)
  {
    return configuration != null && (configuration.getLabel() != null || 
    			isEnclosed(configuration) || 
    			configuration instanceof ExpandBarConfiguration || 
    			configuration instanceof TabFolderConfiguration || 
    			configuration instanceof TabFolderConfiguration) || 
    			parent instanceof ExpandBar || 
    			parent instanceof TabFolder ||
    			parent instanceof CTabFolder ;
  }
  
	public static void createItemIfNeeded(Composite parent,
      Component<? extends ComponentConfiguration> childComponent,
      ContainerConfiguration parentConfiguration,
      ComponentConfiguration configuration)
  {
		if (parent instanceof ExpandBar && parentConfiguration instanceof ExpandBarConfiguration)
		{
			ExpandItem item = createExpandItem((ExpandBar)parent, configuration) ;

			item.setControl(childComponent.getControl()) ;
		}
		else
		{
			if (parent instanceof TabFolder && parentConfiguration instanceof TabFolderConfiguration)
			{
				TabItem item = createTabItem((TabFolder)parent, configuration) ;

				item.setControl(childComponent.getControl()) ;
			}
			else
			{
				if (parent instanceof CTabFolder && parentConfiguration instanceof CTabFolderConfiguration)
				{
					CTabItem item = createCTabItem((CTabFolder)parent, configuration) ;

					item.setControl(childComponent.getControl()) ;
				}
			}
		}
  }
  
  /**
   * Creates a expand bar and then configures it with the given configuration
   * @param parent the parent the expand bar to be created
   * @param configuration the configuration to be used
   * @return a new expand bar
   */
  public static ExpandBar createExpandBar(Composite parent, ControlConfiguration configuration)
  {
    ExpandBar composite = new ExpandBar(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE);

    updateControl(composite, configuration, null) ;
      
    return composite ;
  }
  
  /**
   * Creates a TabFolder and then configures it with the given configuration
   * @param parent the parent the TabFolder to be created
   * @param configuration the configuration to be used
   * @return a new TabFolder
   */
  public static TabFolder createTabFolder(Composite parent, ControlConfiguration configuration)
  {
    TabFolder composite = new TabFolder(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE);

    updateControl(composite, configuration, null) ;
      
    return composite ;
  }
  
  /**
   * Creates a CTabFolder and then configures it with the given configuration
   * @param parent the parent the CTabFolder to be created
   * @param configuration the configuration to be used
   * @return a new CTabFolder
   */
  public static CTabFolder createCTabFolder(Composite parent, ControlConfiguration configuration)
  {
    CTabFolder composite = new CTabFolder(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE);
    
    if (configuration instanceof CTabFolderConfiguration && ((CTabFolderConfiguration)configuration).isSetTabPosition())
    	composite.setTabPosition(((CTabFolderConfiguration)configuration).getTabPosition()) ;

    updateControl(composite, configuration, null) ;
      
    return composite ;
  }
  
  public static ExpandItem createExpandItem(ExpandBar parent, ComponentConfiguration configuration)
  {
    ExpandItem item = new ExpandItem(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE) ;
    
    configureItem(parent.getDisplay(), item, configuration) ;
    
    return item ;
  }

  public static TabItem createTabItem(TabFolder parent, ComponentConfiguration configuration)
  {
    TabItem item = new TabItem(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE) ;

    configureItem(parent.getDisplay(), item, configuration) ;
    
    return item ;
  }

  public static CTabItem createCTabItem(CTabFolder parent, ComponentConfiguration configuration)
  {
    CTabItem item = new CTabItem(parent, configuration != null && configuration.isSetStyle() ? configuration.getStyle() : SWT.NONE) ;

    configureItem(parent.getDisplay(), item, configuration) ;
    
    return item ;
  }

	public static void configureParent(Composite parent)
  {
	  if (parent != null && (parent.getLayout() == null || !(parent.getLayout() instanceof GridLayout)))
	  {
	  	Activator.getDefault().warn("Setting GridLayout in Parent, may cause problems") ;
	  	
	    // ensure parent has GridLayout
	    GridLayout layout = new GridLayout(1, false);
	    layout.marginWidth = 0 ;
	    layout.marginHeight = 0 ;
	      
	    parent.setLayout(layout) ;
	  }
  }
  
  /**
   * Configures a component. If component represented by a composite, the original composite 
   * or a newly created enclosing composite, such as a Composite or Group is returned. 
   * If a new composite is create it is configured with the given
   * configuration. The returned composite can used to add child components.
   * 
   * @param configurableComponent the component to be used
   * @return the returning the original composite or an internal composite, such as a Composite or Group. 
   * <code>null</code> id returned if the component is NOT represented by a composite
   */
  public static Composite configureComponent(Component<? extends ControlConfiguration> configurableComponent)
  {
    if (configurableComponent != null && configurableComponent.getConfiguration() != null && configurableComponent.getControl() != null)
      if (configurableComponent.getControl() instanceof Composite)
        return configureComponent((Composite)configurableComponent.getControl(), configurableComponent.getConfiguration()) ;
      else
        configureControl(configurableComponent.getControl(), configurableComponent.getConfiguration()) ;

    return null ;
  }
  
  /**
   * Returns the original composite or a newly created enclosing control, such as
   * a Composite or Group. If a new composite is created it is configured with the given
   * configuration, if a new composite is not created the original composite configured 
   * with the given configuration. The returned composite can used to add child components.
   * 
   * @param composite the composite to be configured
   * @param configuration the configuration to be used
   * @return the returning the original composite or an internal composite, such as a Composite or Group
   */
  public static Composite configureComponent(Composite composite, ComponentConfiguration configuration)
  {
    return configureComposite(composite, configuration) ;
  }

  /**
   * Configures a control using the given configuration
   * 
   * @param control
   * @param configuration
   */
  public static void configureControl(Control control, ControlConfiguration configuration)
  {
    updateControl(control, configuration, null) ;
  }

  public static void configureViewer(ConfigurableViewer<? extends ViewerConfiguration> viewer)
  {
    if (viewer != null && viewer.getConfiguration() != null)
    {
      ViewerConfiguration configuration = viewer.getConfiguration() ;
  
      if (configuration instanceof ContainerConfiguration)
      {
        ContainerConfiguration containerConfiguration = (ContainerConfiguration)configuration ;
  
        if (viewer.getControl() instanceof Composite && containerConfiguration.getLayout() != null)
          updateLayout(((Composite)viewer.getControl()), containerConfiguration.getLayout()) ;
      }
  
      if (viewer.getControl() instanceof Composite && configuration.getLayoutData() != null)
        updateLayoutData((Composite)viewer.getControl(), configuration.getLayoutData(), null) ;
    }
  }
  
  public static final boolean isEnclosed(ComponentConfiguration configuration)
  {
    return configuration != null && configuration.isEnclosed() ;
  }
  
  public static final boolean isMandatory(ComponentConfiguration configuration)
  {
    return configuration != null && configuration.isMandatory() ;
  }

	@SuppressWarnings("rawtypes")
  public static String getErrorMessage(
      Component<? extends ComponentConfiguration> component)
  {
		if (component instanceof EditComponent)
			return ((EditComponent)component).getErrorMessage();
		else
			return null ;
  }
  
  public static final boolean isMultipleSelectionInUse(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isMultipleSelectionInUse() ;
  }

  public static boolean isMultipleCheckInUse( ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isMultipleCheckInUse() ;
  }
  
  public static final boolean isDuplicateAllowed(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isDuplicateAllowed() ;
  }

  public static final boolean isCheckSelectionInUse(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isCheckSelectionInUse() ;
  }
  
  public static final boolean isThreadingInUse(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isThreadingInUse() ;
  }

  public static final boolean isSetThreadingInUse(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isSetThreadingInUse() ;
  }

  public static final boolean isCopyItemsInUse(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isMultipleSelectionInUse() ;
  }
  
	public static boolean isMantainingSelectionState(
      ListViewerConfiguration configuration)
  {
    return configuration == null || configuration.isMantainingSelectionState() ;
  }
	
	public static boolean isMantainingCheckedState(
      ListViewerConfiguration configuration)
  {
    return configuration == null || configuration.isMantainingCheckedState() ;
  }

	public static boolean isCellSelectionInUse(MatrixViewerConfiguration configuration)
  {
    return configuration != null && configuration.isCellSelectionInUse() ;
  }
	
	public static boolean isLinesVisible(MatrixViewerConfiguration configuration)
  {
    return configuration != null && configuration.isLinesVisible() ;
  }

  public static final boolean isEditable(ComponentConfiguration configuration)
  {
    return configuration != null && configuration.isEditable() ;
  }
  
  public static final boolean isVisible(ViewerConfiguration configuration)
  {
    return configuration == null || configuration.isVisible() ;
  }
  
  public static final boolean isItemRemovedLeftToRight(TwinViewerConfiguration configuration)
  {
    return configuration == null || configuration.isItemRemovedLeftToRight() ;
  }  
  
  public static final boolean isItemRemovedRightToLeft(TwinViewerConfiguration configuration)
  {
    return configuration == null || configuration.isItemRemovedRightToLeft() ;
  }  
  
  public static final boolean isItemAddedLeftToRight(TwinViewerConfiguration configuration)
  {
    return configuration == null || configuration.isItemAddedLeftToRight() ;
  }  
  
  public static final boolean isItemAddedRightToLeft(TwinViewerConfiguration configuration)
  {
    return configuration == null || configuration.isItemAddedRightToLeft() ;
  }  
  
  public static final boolean isLeftThreadingInUse(TwinViewerConfiguration configuration)
  {
    return configuration == null || (getChildListViewerConfiguration(configuration, AbstractTwinViewer.LEFT_VIEWER_COMPONENT_ID) != null && 
    		getChildListViewerConfiguration(configuration, AbstractTwinViewer.LEFT_VIEWER_COMPONENT_ID).isThreadingInUse()) ;
  }  
  
  public static final boolean isRightThreadingInUse(TwinViewerConfiguration configuration)
  {
    return configuration == null || (getChildListViewerConfiguration(configuration, AbstractTwinViewer.RIGHT_VIEWER_COMPONENT_ID) != null && 
    		getChildListViewerConfiguration(configuration, AbstractTwinViewer.RIGHT_VIEWER_COMPONENT_ID).isThreadingInUse()) ;
  }
  
  public static final boolean isLeftCopyItemsInUse(TwinViewerConfiguration configuration)
  {
    return configuration == null || (getChildListViewerConfiguration(configuration, AbstractTwinViewer.LEFT_VIEWER_COMPONENT_ID) != null && 
    		getChildListViewerConfiguration(configuration, AbstractTwinViewer.LEFT_VIEWER_COMPONENT_ID).isCopyItemsInUse()) ;
  }  
  
  public static final boolean isRightCopyItemsInUse(TwinViewerConfiguration configuration)
  {
    return configuration == null || (getChildListViewerConfiguration(configuration, AbstractTwinViewer.RIGHT_VIEWER_COMPONENT_ID) != null && 
    		getChildListViewerConfiguration(configuration, AbstractTwinViewer.RIGHT_VIEWER_COMPONENT_ID).isCopyItemsInUse()) ;
  }
  
  public static final boolean isFromItemRemovedWhenMapped(MappingViewerConfiguration configuration)
  {
    return configuration == null || configuration.isFromItemRemovedWhenMapped() ;
  }
  
  public static final boolean isFromItemAddedWhenUnmapped(MappingViewerConfiguration configuration)
  {
    return configuration == null || configuration.isFromItemAddedWhenUnmapped() ;
  }
  
  public static final boolean isToItemRemovedWhenMapped(MappingViewerConfiguration configuration)
  {
    return configuration == null || configuration.isToItemRemovedWhenMapped() ;
  }
  
  public static final boolean isToItemAddedWhenUnmapped(MappingViewerConfiguration configuration)
  {
    return configuration == null || configuration.isToItemAddedWhenUnmapped() ;
  }
  
  public static final boolean isThreadingInUse(MultipleListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isThreadingInUse() ;
  }
  

  public static boolean isVirtualInUse(ListViewerConfiguration configuration)
  {
    return configuration != null && configuration.isVirtualInUse() ;
  }

  public static final boolean isLeftDuplicateAllowed(
      TwinViewerConfiguration configuration)
  {
    return configuration == null || (getChildListViewerConfiguration(configuration, AbstractTwinViewer.LEFT_VIEWER_COMPONENT_ID) != null && 
    		getChildListViewerConfiguration(configuration, AbstractTwinViewer.LEFT_VIEWER_COMPONENT_ID).isDuplicateAllowed()) ;
  }
  
  public static final boolean isRightDuplicateAllowed(
      TwinViewerConfiguration configuration)
  {
    return configuration == null || (getChildListViewerConfiguration(configuration, AbstractTwinViewer.RIGHT_VIEWER_COMPONENT_ID) != null && 
    		getChildListViewerConfiguration(configuration, AbstractTwinViewer.RIGHT_VIEWER_COMPONENT_ID).isDuplicateAllowed()) ;
  }
  
  public static boolean isRunningQueryOnFirstUse(
      QueryResultViewerConfiguration configuration)
  {
    return configuration != null && configuration.isRunningQueryOnFirstUse() ;
  }

  /**
   * Create a new text based on the configuration if not null. If the configuration defines that
   * the text should not visible the method will return null 
   * 
   * @param configuration the parentConfiguration of the text
   * @param id the configuration identifier of the text 
   * @return a new text or null if not visible
   */
  public static final ControlComponent<ControlConfiguration, Text> createTextComponent(Composite parent, ControlConfiguration configuration, GridData defaultLayoutData, int defaultStyle)
  {
    Text text = null ;
    
    if (configuration != null)
    {
      if (!configuration.isSetVisible() || configuration.isVisible())
      {
        if (configuration.isSetStyle())
          text = new Text(parent, configuration.getStyle()) ;
        else
          text = new Text(parent, defaultStyle) ;
        
        updateControl(text, configuration, defaultLayoutData) ;
      }
    }
    else
    {
      text = new Text(parent, defaultStyle) ;
      assignLayoutData(text, defaultLayoutData) ;
    }
    
    return new SimpleControlComponent<Text>(text, configuration) ;
  }

  /**
   * Create a new label based on the configuration if not null. If the configuration defines that
   * the label should not visible the method will return null 
   * 
   * @param configuration the configuration of the label
   * @param id the configuration identifier of the label 
   * @return a new label or null if not visible
   */
  public static final ControlComponent<ControlConfiguration, org.eclipse.swt.widgets.Label> createLabelComponent(Composite parent, ControlConfiguration configuration, GridData defaultLayoutData, int defaultStyle)
  {
    org.eclipse.swt.widgets.Label label = null ;
    
    if (configuration != null)
    {
      if (configuration.isVisible())
      {
        if (configuration.isSetStyle())
          label = new org.eclipse.swt.widgets.Label(parent, configuration.getStyle()) ;
        else
          label = new org.eclipse.swt.widgets.Label(parent, defaultStyle) ;
        
        updateControl(label, configuration, defaultLayoutData) ;
      }
    }
    else
    {
      label = new org.eclipse.swt.widgets.Label(parent, defaultStyle) ;
      assignLayoutData(label, defaultLayoutData) ;
    }
    
    return new SimpleControlComponent<org.eclipse.swt.widgets.Label>(label, configuration) ;
  }
  
  /**
   * Create a new button based on the configuration if not null. If the configuration defines that
   * the button should not visible the method will return null 
   * 
   * @param configuration the configuration of the button
   * @param defaultButtonStyle default style if not defined in in configuration
   * @param id the configuration identifier of the button 
   * @return a new button or null if not visible
   */
  public static final ControlComponent<ControlConfiguration, Button> createButtonComponent(Composite parent, ControlConfiguration configuration, GridData defaultLayoutData, int defaultStyle)
  {
    Button button = null ;
    
    if (configuration != null)
    {
      if (!configuration.isSetVisible() || configuration.isVisible())
      {
        if (configuration.isSetStyle())
          button = new Button(parent, configuration.getStyle()) ;
        else
          button = new Button(parent, defaultStyle) ;
    
        updateControl(button, configuration, defaultLayoutData) ;
      }
    }
    else
    {
      button = new Button(parent, defaultStyle) ;
      assignLayoutData(button, defaultLayoutData) ;
    }
    
    return new SimpleControlComponent<Button>(button, configuration) ;
  }
  
	/**
   * Create a new spinner based on the configuration if not null. If the configuration defines that
   * the spinner should not visible the method will return null 
   * 
   * @param configuration the configuration of the spinner
   * @param id the configuration identifier of the spinner 
   * @return a new button or null if not visible
   */
  public static final ControlComponent<ControlConfiguration, Spinner> createSpinnerComponent(Composite parent, ControlConfiguration configuration, GridData defaultLayoutData, int defaultStyle)
  {
    Spinner spinner = null ;
    
    if (configuration != null)
    {
      if (!configuration.isSetVisible() || configuration.isVisible())
      {
        if (configuration.isSetStyle())
          spinner = new Spinner(parent, configuration.getStyle()) ;
        else
          spinner = new Spinner(parent, defaultStyle) ;
    
        updateControl(spinner, configuration, defaultLayoutData) ;
      }
    }
    else
    {
      spinner = new Spinner(parent, defaultStyle) ;
      assignLayoutData(spinner, defaultLayoutData) ;
    }
    
    return new SimpleControlComponent<Spinner>(spinner, configuration) ;
  }
  
  /**
   * Create a new spinner based on the configuration if not null. If the configuration defines that
   * the spinner should not visible the method will return null 
   * 
   * @param configuration the configuration of the combo
   * @param id the configuration identifier of the spinner 
   * @return a new button or null if not visible
   */
  public static final ControlComponent<ControlConfiguration, Combo> createComboComponent(Composite parent, ControlConfiguration configuration, GridData defaultLayoutData, int defaultStyle)
  {
    Combo combo = null ;
    
    if (configuration != null)
    {
      if (!configuration.isSetVisible() || configuration.isVisible())
      {
        if (configuration.isSetStyle())
          combo = new Combo(parent, configuration.getStyle()) ;
        else
          combo = new Combo(parent, defaultStyle) ;
    
        updateControl(combo, configuration, defaultLayoutData) ;
      }
    }
    else
    {
      combo = new Combo(parent, defaultStyle) ;
      assignLayoutData(combo, defaultLayoutData) ;
    }
    
    return new SimpleControlComponent<Combo>(combo, configuration) ;
  }

  public static boolean isVisible(ComponentConfiguration configuration, boolean defaultValue)
  {
     if (configuration != null)
       return configuration.isVisible() ;
     else
       return defaultValue;
  }
  
  public static boolean isChildVisible(ContainerConfiguration configuration,
      String id, boolean defaultValue)
  {
     if (configuration != null)
     {
       ComponentConfiguration childComponentConfiguration = getChildComponentConfiguration(configuration, id) ;
       
       if (childComponentConfiguration != null && childComponentConfiguration.isSetVisible())
         return childComponentConfiguration.isVisible() ;
     }
     
     return defaultValue;
  }
  
  public static boolean isChildEnabled(ContainerConfiguration configuration,
      String id, boolean defaultValue)
  {
     if (configuration != null)
     {
       ComponentConfiguration childComponentConfiguration = getChildComponentConfiguration(configuration, id) ;
       
       if (childComponentConfiguration != null)
         return childComponentConfiguration.isEnabled() ;
     }
     
     return defaultValue;
  }
  
  public static final void readConfiguration(InputStream inputStream)
  {
    // Create a resource set to hold the resources.
    //
    ResourceSet resourceSet = new ResourceSetImpl();
    
    // Register the appropriate resource factory to handle all file extensions.
    //
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
      (Resource.Factory.Registry.DEFAULT_EXTENSION, 
       new ConfigurationResourceFactoryImpl());

    // Register the package to ensure it is available during loading.
    //
    resourceSet.getPackageRegistry().put
      (ConfigurationPackage.eNS_URI, 
       ConfigurationPackage.eINSTANCE);
        
      try
      {
        Resource resource = resourceSet.createResource(URI.createURI("http:///My.configuration"));
        DocumentRoot documentRoot = ConfigurationFactory.eINSTANCE.createDocumentRoot();
        ConfigurationListType root = ConfigurationFactory.eINSTANCE.createConfigurationListType();
        //root.getConfiguration().add(configuration) ;
        documentRoot.setConfigurationList(root);
        resource.getContents().add(documentRoot);
        resource.load(inputStream, null);
      }
      catch (IOException exception) 
      {
        exception.printStackTrace(System.err);
      }
  }

  public static final void saveConfiguration(Configuration configuration, OutputStream outputStream)
  {
  	// Create a resource set to hold the resources.
  	//
  	ResourceSet resourceSet = new ResourceSetImpl();

  	// Register the appropriate resource factory to handle all file extensions.
  	//
  	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
  	(Resource.Factory.Registry.DEFAULT_EXTENSION, 
  			new ConfigurationResourceFactoryImpl());

  	// Register the package to ensure it is available during loading.
  	//
  	resourceSet.getPackageRegistry().put
  	(ConfigurationPackage.eNS_URI, 
  			ConfigurationPackage.eINSTANCE);

  	try
  	{
  		Resource resource = resourceSet.createResource(URI.createURI("http:///My.configuration"));
  		DocumentRoot documentRoot = ConfigurationFactory.eINSTANCE.createDocumentRoot();
  		ConfigurationListType root = ConfigurationFactory.eINSTANCE.createConfigurationListType();
  		root.getConfiguration().add((Configuration)EcoreUtil.copy((EObject)configuration)) ;
  		documentRoot.setConfigurationList(root);
  		resource.getContents().add(documentRoot);

  		resource.save(outputStream, null);
  	}
  	catch (IOException exception) 
  	{
  		exception.printStackTrace(System.err);
  	}
  }

  public static final void saveConfigurations(List<Configuration> configurations, OutputStream outputStream)
  {
    // Create a resource set to hold the resources.
    //
    ResourceSet resourceSet = new ResourceSetImpl();
    
    // Register the appropriate resource factory to handle all file extensions.
    //
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
      (Resource.Factory.Registry.DEFAULT_EXTENSION, 
       new ConfigurationResourceFactoryImpl());

    // Register the package to ensure it is available during loading.
    //
    resourceSet.getPackageRegistry().put
      (ConfigurationPackage.eNS_URI, 
       ConfigurationPackage.eINSTANCE);
        
      try
      {
        Resource resource = resourceSet.createResource(URI.createURI("http:///My.configuration"));
        DocumentRoot documentRoot = ConfigurationFactory.eINSTANCE.createDocumentRoot();
        ConfigurationListType root = ConfigurationFactory.eINSTANCE.createConfigurationListType();
        root.getConfiguration().addAll(configurations) ;
        documentRoot.setConfigurationList(root);
        resource.getContents().add(documentRoot);
        
        resource.save(outputStream, null);
      }
      catch (IOException exception) 
      {
        exception.printStackTrace(System.err);
      }
  }
  
  public static final String getUserConfigurationDirectory()
  {
    String userConfigurationDirectory = Platform.getInstanceLocation().getURL().getFile() ;
    
    try
    {
	    if (Activator.getDefault() != null)
	      userConfigurationDirectory = Activator.getDefault().getPreferenceStore()
	      .getString(PreferenceConstants.USER_CONFIGURATION_DIRECTORY) ;
    }
    catch (Exception e)
    {
    	// TODO handle exception. ignore in RAP context
    }
    
    return userConfigurationDirectory ;
  }

  public static void saveConfiguration(Configuration configuration) throws FileNotFoundException
  {
    if (configuration != null && configuration.getId() != null)
      saveConfiguration(configuration, new FileOutputStream(new File (ConfigurationUtils.getUserConfigurationDirectory(), configuration.getId() + CONFIGURATION_FILE_TEMPLATE_EXTN))) ;
  }

  public static Configuration copyConfiguration(Configuration newConfiguration)
  {
    if (newConfiguration != null)
    {
      if (newConfiguration instanceof ComponentConfiguration)
      {
        if (newConfiguration instanceof ControlConfiguration)
        {
          if (newConfiguration instanceof ContainerConfiguration)
          {
            if (newConfiguration instanceof ViewerConfiguration)
            {
              if (newConfiguration instanceof ListViewerConfiguration)
                return mergeConfiguration(ConfigurationFactory.eINSTANCE.createListViewerConfiguration(), newConfiguration) ;
              else
                if (newConfiguration instanceof TwinViewerConfiguration)
                  return mergeConfiguration(ConfigurationFactory.eINSTANCE.createTwinViewerConfiguration(), newConfiguration) ;
                else
                  if (newConfiguration instanceof MappingViewerConfiguration)
                    return mergeConfiguration(ConfigurationFactory.eINSTANCE.createMappingViewerConfiguration(), newConfiguration) ;
                  else
                    if (newConfiguration instanceof MultipleListViewerConfiguration)
                      return mergeConfiguration(ConfigurationFactory.eINSTANCE.createMultipleListViewerConfiguration(), newConfiguration) ;
                    else
                      if (newConfiguration instanceof MatrixViewerConfiguration)
                        return mergeConfiguration(ConfigurationFactory.eINSTANCE.createMatrixViewerConfiguration(), newConfiguration) ;
                      else
                        if (newConfiguration instanceof QueryResultViewerConfiguration)
                          return mergeConfiguration(ConfigurationFactory.eINSTANCE.createQueryResultViewerConfiguration(), newConfiguration) ;
                        else
                            return mergeConfiguration(ConfigurationFactory.eINSTANCE.createViewerConfiguration(), newConfiguration) ;
            }
            else
            {
            	if (newConfiguration instanceof ExpandBarConfiguration)
            		return mergeConfiguration(ConfigurationFactory.eINSTANCE.createExpandBarConfiguration(), newConfiguration) ;
            	else
            		if (newConfiguration instanceof TabFolderConfiguration)
            			return mergeConfiguration(ConfigurationFactory.eINSTANCE.createTabFolderConfiguration(), newConfiguration) ;
            		else
            			return mergeConfiguration(ConfigurationFactory.eINSTANCE.createContainerConfiguration(), newConfiguration) ;
            }
          }
          else
          {
            return mergeConfiguration(ConfigurationFactory.eINSTANCE.createControlConfiguration(), newConfiguration) ;
          }
        }
        else
        {
          return mergeConfiguration(ConfigurationFactory.eINSTANCE.createComponentConfiguration(), newConfiguration) ;
        }
      }
      else
      {
        if (newConfiguration instanceof PartConfiguration)
        {
          if (newConfiguration instanceof EditorConfiguration)
            return mergeConfiguration(ConfigurationFactory.eINSTANCE.createEditorConfiguration(), newConfiguration) ;
          else
            if (newConfiguration instanceof ViewConfiguration)
              return mergeConfiguration(ConfigurationFactory.eINSTANCE.createViewConfiguration(), newConfiguration) ;
            else
              if (newConfiguration instanceof PerspectiveConfiguration)
                return mergeConfiguration(ConfigurationFactory.eINSTANCE.createPerspectiveConfiguration(), newConfiguration) ;
              else
                return mergeConfiguration(ConfigurationFactory.eINSTANCE.createPartConfiguration(), newConfiguration) ;
        }
        else
        {
          if (newConfiguration instanceof WizardConfiguration)
          {
            return mergeConfiguration(ConfigurationFactory.eINSTANCE.createWizardConfiguration(), newConfiguration) ;
          }
          else
          {
            if (newConfiguration instanceof WizardPageConfiguration)
            {
              return mergeConfiguration(ConfigurationFactory.eINSTANCE.createWizardPageConfiguration(), newConfiguration) ;
            }
            else
            {
              if (newConfiguration instanceof DialogConfiguration)
              {
                return mergeConfiguration(ConfigurationFactory.eINSTANCE.createDialogConfiguration(), newConfiguration) ;
              }
              else
              {
                return mergeConfiguration(ConfigurationFactory.eINSTANCE.createConfiguration(), newConfiguration) ;
              }
            }
          }
        }
      }
    }
    else
    {
      return null ;
    }
  }
  
  public static Configuration mergeConfiguration(Configuration oldConfiguration, Configuration newConfiguration)
  {
    if (oldConfiguration != null && newConfiguration != null)
    {
      Configuration mergedConfiguration = null ;
      
      if (newConfiguration instanceof ComponentConfiguration)
        mergedConfiguration = mergeComponentConfiguration(oldConfiguration, (ComponentConfiguration)newConfiguration) ;
      else
        if (oldConfiguration instanceof PartConfiguration && newConfiguration instanceof PartConfiguration)
          mergedConfiguration = mergePartConfiguration((PartConfiguration)oldConfiguration, (PartConfiguration)newConfiguration) ;
        else
          if (oldConfiguration instanceof WizardConfiguration && newConfiguration instanceof WizardConfiguration)
            mergedConfiguration = mergeWizardConfiguration((WizardConfiguration)oldConfiguration, (WizardConfiguration)newConfiguration) ;
          else
            if (oldConfiguration instanceof WizardPageConfiguration && newConfiguration instanceof WizardPageConfiguration)
              mergedConfiguration = mergeWizardPageConfiguration((WizardPageConfiguration)oldConfiguration, (WizardPageConfiguration)newConfiguration) ;
            else
              if (oldConfiguration instanceof DialogConfiguration && newConfiguration instanceof DialogConfiguration)
                mergedConfiguration = mergeDialogConfiguration((DialogConfiguration)oldConfiguration, (DialogConfiguration)newConfiguration) ;
              else
                mergedConfiguration = oldConfiguration ;
      
      if (mergedConfiguration != null)
      {
        if (newConfiguration.isSetEnabled())
          mergedConfiguration.setEnabled(newConfiguration.isEnabled()) ;
        
        if (newConfiguration.getHelpContextId() != null)
          mergedConfiguration.setHelpContextId(newConfiguration.getHelpContextId()) ;
        
        if (newConfiguration.isSetVisible())
          mergedConfiguration.setVisible(newConfiguration.isVisible()) ;
        
        if (newConfiguration.getName() != null)
          mergedConfiguration.setName(newConfiguration.getName()) ;
        
        if (newConfiguration.getId() != null)
        	mergedConfiguration.setId(newConfiguration.getId()) ;
        
        if (newConfiguration.getExtends() != null)
          mergedConfiguration.setExtends(newConfiguration.getExtends()) ;
        
        if (newConfiguration.getClassName() != null)
          mergedConfiguration.setClassName(newConfiguration.getClassName()) ;
        
        if (newConfiguration.getPluginId() != null)
          mergedConfiguration.setPluginId(newConfiguration.getPluginId()) ;
      }
    
      return mergedConfiguration ;
    }
    else
    {
      if (oldConfiguration != null)
      {
        return oldConfiguration ;
      }
      else
      {
        if (newConfiguration != null)
        {
          return copyConfiguration(newConfiguration) ;
        }
        else
        {
          return ConfigurationFactory.eINSTANCE.createComponentConfiguration()  ;
        }
      }
    }
  }
  
  public static final String getText(Label label, Configuration configuration)
  {
    String text = "" ;
    
    if (label != null)
    {
      if (label.getKey() != null)
      {
        //if (label.getPluginId() != null)
        //  text = PluginUtils.getString(label.getPluginId(), label.getKey()) ;
        //else
       //   if (configuration.getPluginId() != null)
       //     text = PluginUtils.getString(configuration.getPluginId(), label.getKey()) ;
       //   else
          	text = Activator.getDefault().getString(label.getKey()) ;
          	
        // temp fix
        if ((text == null || text.contains('!' + label.getKey() + '!')) && label.getValue() != null)
        	text = label.getValue() ;
      }
      else
      {
        if (label.getValue() != null)
          text = label.getValue() ;
      }
    }

    return text;
  }

  private static PartConfiguration mergePartConfiguration(Configuration oldConfiguration, PartConfiguration newConfiguration)
  {
    PartConfiguration mergedConfiguration = null ;

    if (newConfiguration instanceof EditorConfiguration)
      mergedConfiguration = mergeEditorConfiguration((EditorConfiguration)oldConfiguration, (EditorConfiguration)newConfiguration) ;
    else
      if (newConfiguration instanceof ViewConfiguration)
        mergedConfiguration = mergeViewConfiguration((ViewConfiguration)oldConfiguration, (ViewConfiguration)newConfiguration) ;
      else
        if (newConfiguration instanceof PerspectiveConfiguration)
          mergedConfiguration = mergePerspectiveConfiguration((PerspectiveConfiguration)oldConfiguration, (PerspectiveConfiguration)newConfiguration) ;
        else
          mergedConfiguration = (PartConfiguration)copyConfiguration(newConfiguration) ;
    
    if (newConfiguration.getControl() != null)
    {  
    	ControlConfiguration componentConfiguration ;
    	
      if (mergedConfiguration.getControl() != null)
      {
        componentConfiguration = (ControlConfiguration)mergeConfiguration(mergedConfiguration.getControl(), newConfiguration.getControl()) ;
      }
      else
      {
      	componentConfiguration = (ControlConfiguration)copyConfiguration(newConfiguration.getControl()) ;
      }
      
      mergedConfiguration.setControl(componentConfiguration) ;
    }
    

    return mergedConfiguration ;
  }

  private static EditorConfiguration mergeEditorConfiguration(Configuration oldConfiguration,
      EditorConfiguration newConfiguration)
  {
  	EditorConfiguration mergedConfiguration ;

    if (oldConfiguration instanceof EditorConfiguration)
    {
    	mergedConfiguration = (EditorConfiguration)oldConfiguration ;

    	// TODO merge other properties when they are defined
    }
    else
    {
    	mergedConfiguration = (EditorConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static ViewConfiguration mergeViewConfiguration(Configuration oldConfiguration,
      ViewConfiguration newConfiguration)
  {
  	ViewConfiguration mergedConfiguration ;

    if (oldConfiguration instanceof ViewConfiguration)
    {
    	mergedConfiguration = (ViewConfiguration)oldConfiguration ;

    	// TODO merge other properties when they are defined
    }
    else
    {
    	mergedConfiguration = (ViewConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static PerspectiveConfiguration mergePerspectiveConfiguration(
  		Configuration oldConfiguration,
      PerspectiveConfiguration newConfiguration)
  {
  	PerspectiveConfiguration mergedConfiguration ;

    if (oldConfiguration instanceof ExpandBarConfiguration)
    {
    	mergedConfiguration = (PerspectiveConfiguration)oldConfiguration ;

    	// TODO merge other properties when they are defined
    }
    else
    {
    	mergedConfiguration = (PerspectiveConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static ComponentConfiguration mergeComponentConfiguration(Configuration oldConfiguration, ComponentConfiguration newConfiguration)
  {
    ComponentConfiguration mergedConfiguration = null ;
    
    if (oldConfiguration != null && newConfiguration != null)
    {
      if (newConfiguration instanceof ControlConfiguration)
        mergedConfiguration = mergeControlConfiguration(oldConfiguration, (ControlConfiguration)newConfiguration) ;
      else
        if (oldConfiguration instanceof ComponentConfiguration)
          mergedConfiguration = (ComponentConfiguration)oldConfiguration ;
      
      if (mergedConfiguration != null)
      {
        if (newConfiguration.isSetStyle())
          mergedConfiguration.setStyle(newConfiguration.getStyle()) ;
        
        if (newConfiguration.isSetEnclosed())
          mergedConfiguration.setEnclosed(newConfiguration.isEnclosed()) ;
        
        if (newConfiguration.isSetEditable())
          mergedConfiguration.setEditable(newConfiguration.isEditable()) ;
        
        if (newConfiguration.isSetMandatory())
          mergedConfiguration.setMandatory(newConfiguration.isMandatory()) ;
        
        if (newConfiguration.getClassName() != null)
          mergedConfiguration.setClassName(new String(newConfiguration.getClassName())) ;
        
        if (newConfiguration.getLabel() != null)
          if (mergedConfiguration.getLabel() != null)
            mergedConfiguration.setLabel(mergeLabel(mergedConfiguration.getLabel(), newConfiguration.getLabel())) ;
          else
            mergedConfiguration.setLabel(mergeLabel(ConfigurationFactory.eINSTANCE.createLabel(), newConfiguration.getLabel())) ;
        
      	if (newConfiguration.getImage() != null)
  	      if (mergedConfiguration.getImage() != null)
  	        mergedConfiguration.setImage(mergeImage(mergedConfiguration.getImage() , newConfiguration.getImage())) ;
  	      else
  	        mergedConfiguration.setImage(mergeImage(ConfigurationFactory.eINSTANCE.createImage(), newConfiguration.getImage())) ;
      }
      else
      {
      	mergedConfiguration = (ComponentConfiguration)copyConfiguration(newConfiguration) ;
      }
    }
    else
    {
      if (oldConfiguration != null)
      {
        if (oldConfiguration instanceof ComponentConfiguration)
        {
          mergedConfiguration = (ComponentConfiguration)oldConfiguration ;
        }
        else
        {
          mergedConfiguration = ConfigurationFactory.eINSTANCE.createComponentConfiguration() ;
        }
      }
      else
      {
        if (newConfiguration != null)
        {
          mergedConfiguration = (ComponentConfiguration)copyConfiguration(newConfiguration) ;
        }
        else
        {
        	mergedConfiguration = ConfigurationFactory.eINSTANCE.createComponentConfiguration() ;
        }
      }
    }
    
    return mergedConfiguration ;
  }

  private static ControlConfiguration mergeControlConfiguration(Configuration oldConfiguration, ControlConfiguration newConfiguration)
  {
    ControlConfiguration mergedConfiguration = null ;
    
    if (oldConfiguration != null && newConfiguration != null)
    {
      if (newConfiguration instanceof ContainerConfiguration)
        mergedConfiguration = mergeContainerConfiguration(oldConfiguration, (ContainerConfiguration)newConfiguration) ;
      else
      	if (oldConfiguration instanceof ControlConfiguration)
      		mergedConfiguration = (ControlConfiguration)oldConfiguration ;

      if (mergedConfiguration != null)
      {
        if (newConfiguration.getLayoutData() != null)
          if (mergedConfiguration.getLayoutData() != null)
            mergedConfiguration.setLayoutData(mergeLayoutData(mergedConfiguration.getLayoutData(), newConfiguration.getLayoutData())) ;
          else
            mergedConfiguration.setLayoutData(mergeLayoutData(ConfigurationFactory.eINSTANCE.createLayoutData(), newConfiguration.getLayoutData())) ;
        
        
        if (newConfiguration.getBackground() != null)
          if (mergedConfiguration.getBackground() != null)
            mergedConfiguration.setBackground(mergeColour(mergedConfiguration.getBackground(), newConfiguration.getBackground())) ;
          else
            mergedConfiguration.setBackground(mergeColour(ConfigurationFactory.eINSTANCE.createColour(), newConfiguration.getBackground())) ;
        
        if (newConfiguration.getForeground() != null)
          if (mergedConfiguration.getForeground() != null)
            mergedConfiguration.setForeground(mergeColour(mergedConfiguration.getForeground(), newConfiguration.getForeground())) ;
          else
            mergedConfiguration.setForeground(mergeColour(ConfigurationFactory.eINSTANCE.createColour(), newConfiguration.getForeground())) ;
      }
    }
    else
    {
      if (oldConfiguration != null)
      {
        if (oldConfiguration instanceof ControlConfiguration)
        {
          mergedConfiguration = (ControlConfiguration)oldConfiguration ;
        }
        else
        {
          mergedConfiguration = ConfigurationFactory.eINSTANCE.createControlConfiguration() ;
        }
      }
      else
      {
        if (newConfiguration != null)
        {
          mergedConfiguration = (ControlConfiguration)copyConfiguration(newConfiguration) ;
        }
        else
        {
        	mergedConfiguration = ConfigurationFactory.eINSTANCE.createControlConfiguration() ;
        }
      }
    }
    
    return mergedConfiguration ;
  }
  
  private static Colour mergeColour(Colour oldColour, Colour newColour)
  {
    if (newColour.isSetRed())
      oldColour.setRed(newColour.getRed()) ;
    
    if (newColour.isSetGreen())
      oldColour.setGreen(newColour.getGreen()) ;
    
    if (newColour.isSetBlue())
      oldColour.setBlue(newColour.getBlue()) ;
    
    return oldColour ;
  }

  private static ContainerConfiguration mergeContainerConfiguration(Configuration oldConfiguration, ContainerConfiguration newConfiguration)
  {
    ContainerConfiguration mergedConfiguration = null ;
    
    if (newConfiguration instanceof ViewerConfiguration)
      mergedConfiguration = mergeViewerConfiguration(oldConfiguration, (ViewerConfiguration)newConfiguration) ;
    else
    	if (newConfiguration instanceof ExpandBarConfiguration)
    		mergedConfiguration = mergeExpandBarConfiguration(oldConfiguration, (ExpandBarConfiguration)newConfiguration) ;
    	else
    		if (newConfiguration instanceof TabFolderConfiguration)
    			mergedConfiguration = mergeTabFolderConfiguration(oldConfiguration, (TabFolderConfiguration)newConfiguration) ;
    		else
    			if (oldConfiguration instanceof ContainerConfiguration)
      			mergedConfiguration = (ContainerConfiguration)oldConfiguration ;

    if (mergedConfiguration != null)
    {
      if (newConfiguration.getLayout() != null)
        if (mergedConfiguration.getLayout() != null)
          mergedConfiguration.setLayout(mergeLayout(mergedConfiguration.getLayout(), newConfiguration.getLayout())) ;
        else
          mergedConfiguration.setLayout(mergeLayout(ConfigurationFactory.eINSTANCE.createLayout(), newConfiguration.getLayout())) ;
      
      // TODO check this!
      if (mergedConfiguration != oldConfiguration && oldConfiguration instanceof ContainerConfiguration)
      {
        Iterator<ComponentConfiguration> iterator = ((ContainerConfiguration)oldConfiguration).getComponents().iterator() ;
        
        while (iterator.hasNext())
        {
        	mergedConfiguration.getComponents().add((ComponentConfiguration)copyConfiguration(iterator.next())) ;
        }
      }

      ComponentConfiguration childComponentConfiguration ;
      ComponentConfiguration oldChildComponentConfiguration ;
      List<ComponentConfiguration> newChildComponentConfigurations = new LinkedList<ComponentConfiguration>() ;

      Iterator<ComponentConfiguration> iterator = newConfiguration.getComponents().iterator() ;

      while (iterator.hasNext())
      {
        childComponentConfiguration = iterator.next() ;

        oldChildComponentConfiguration = ConfigurationUtils.getChildConfiguration(mergedConfiguration, childComponentConfiguration.getId()) ;

        if (oldChildComponentConfiguration != null)
        {
          newChildComponentConfigurations.add((ComponentConfiguration)mergeConfiguration(oldChildComponentConfiguration, childComponentConfiguration)) ;
          mergedConfiguration.getComponents().remove(oldChildComponentConfiguration) ;
        }
        else
        {
        	newChildComponentConfigurations.add((ComponentConfiguration)copyConfiguration(childComponentConfiguration)) ;
        }
      }
      iterator = null ;
      mergedConfiguration.getComponents().addAll(newChildComponentConfigurations) ;
    }
    else
    {
    	mergedConfiguration = (ContainerConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }
  
  private static ExpandBarConfiguration mergeExpandBarConfiguration(Configuration oldConfiguration,
      ExpandBarConfiguration newConfiguration)
  {
    ExpandBarConfiguration mergedConfiguration ;

    if (oldConfiguration instanceof ExpandBarConfiguration)
    {
    	mergedConfiguration = (ExpandBarConfiguration)oldConfiguration ;

    	// TODO merge other properties when they are defined
    }
    else
    {
    	mergedConfiguration = (ExpandBarConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }
  
  private static TabFolderConfiguration mergeTabFolderConfiguration(Configuration oldConfiguration,
      TabFolderConfiguration newConfiguration)
  {
    TabFolderConfiguration mergedConfiguration ;
    
    if (oldConfiguration instanceof TabFolderConfiguration)
    {
    	mergedConfiguration = (TabFolderConfiguration)oldConfiguration ;

    	// TODO merge other properties when they are defined
    }
    else
    {
    	mergedConfiguration = (TabFolderConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static ViewerConfiguration mergeViewerConfiguration(Configuration oldConfiguration,
      ViewerConfiguration newConfiguration)
  {
    ViewerConfiguration mergedConfiguration = null ;
    
    if (newConfiguration instanceof ListViewerConfiguration)
      mergedConfiguration = mergeListViewerConfiguration(oldConfiguration, (ListViewerConfiguration)newConfiguration) ;
    else
      if (newConfiguration instanceof TwinViewerConfiguration)
        mergedConfiguration = mergeTwinViewerConfiguration(oldConfiguration, (TwinViewerConfiguration)newConfiguration) ;
      else
        if (newConfiguration instanceof MappingViewerConfiguration)
          mergedConfiguration = mergeMappingViewerConfiguration(oldConfiguration, (MappingViewerConfiguration)newConfiguration) ;
        else
          if (newConfiguration instanceof MultipleListViewerConfiguration)
            mergedConfiguration = mergeMultipleListViewerConfiguration(oldConfiguration, (MultipleListViewerConfiguration)newConfiguration) ;
          else
            if (newConfiguration instanceof MatrixViewerConfiguration)
              mergedConfiguration = mergeMatrixViewerConfiguration(oldConfiguration, (MatrixViewerConfiguration)newConfiguration) ;
            else
              if (newConfiguration instanceof QueryResultViewerConfiguration)
                mergedConfiguration = mergeQueryResultViewerConfiguration(oldConfiguration, (QueryResultViewerConfiguration)newConfiguration) ;
              else
                if (oldConfiguration instanceof ViewerConfiguration)
                	mergedConfiguration = (ViewerConfiguration)oldConfiguration ;

    if (mergedConfiguration != null)
    {
      if (newConfiguration.isSetEditable())
        mergedConfiguration.setEditable(newConfiguration.isEditable()) ;
    }  
    else
    {
    	mergedConfiguration = (ViewerConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static ListViewerConfiguration mergeListViewerConfiguration(Configuration oldConfiguration,
      ListViewerConfiguration newConfiguration)
  {
    ListViewerConfiguration mergedConfiguration = null ;

    if (oldConfiguration instanceof ListViewerConfiguration)
    {
    	mergedConfiguration = (ListViewerConfiguration)oldConfiguration ;
    }
    
    if (mergedConfiguration != null)
    {
	    if (newConfiguration.isSetCheckSelectionInUse())
	      mergedConfiguration.setCheckSelectionInUse(newConfiguration.isCheckSelectionInUse()) ;
	    
	    if (newConfiguration.isSetCopyItemsInUse())
	      mergedConfiguration.setCopyItemsInUse(newConfiguration.isCopyItemsInUse()) ;
	    
	    if (newConfiguration.isSetDuplicateAllowed())
	      mergedConfiguration.setDuplicateAllowed(newConfiguration.isDuplicateAllowed()) ;

	    if (newConfiguration.isSetMultipleCheckInUse())
	      mergedConfiguration.setMultipleCheckInUse(newConfiguration.isMultipleCheckInUse()) ;
	    
	    if (newConfiguration.isSetMultipleSelectionInUse())
	      mergedConfiguration.setMultipleSelectionInUse(newConfiguration.isMultipleSelectionInUse()) ;
	    
	    if (newConfiguration.isSetThreadingInUse())
	      mergedConfiguration.setThreadingInUse(newConfiguration.isThreadingInUse()) ;
	    
	    if (newConfiguration.isSetVirtualInUse())
	      mergedConfiguration.setVirtualInUse(newConfiguration.isVirtualInUse()) ;
    }
    else
    {
    	mergedConfiguration = (ListViewerConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static TwinViewerConfiguration mergeTwinViewerConfiguration(Configuration oldConfiguration,
      TwinViewerConfiguration newConfiguration)
  {
    TwinViewerConfiguration mergedConfiguration = null ;
    
    if (oldConfiguration instanceof TwinViewerConfiguration)
    {
    	mergedConfiguration = (TwinViewerConfiguration)oldConfiguration ;
    }
    
    if (mergedConfiguration != null)
    {
	    if (newConfiguration.isSetDuplicateAllowed())
	      mergedConfiguration.setDuplicateAllowed(newConfiguration.isDuplicateAllowed()) ;
	    
	    if (newConfiguration.isSetItemAddedLeftToRight())
	      mergedConfiguration.setItemAddedLeftToRight(newConfiguration.isItemAddedLeftToRight()) ;
	    
	    if (newConfiguration.isSetItemAddedRightToLeft())
	      mergedConfiguration.setItemAddedRightToLeft(newConfiguration.isItemAddedRightToLeft()) ;
	    
	    if (newConfiguration.isSetItemRemovedLeftToRight())
	      mergedConfiguration.setItemRemovedLeftToRight(newConfiguration.isItemRemovedLeftToRight()) ;
	    
	    if (newConfiguration.isSetItemRemovedRightToLeft())
	      mergedConfiguration.setItemRemovedRightToLeft(newConfiguration.isItemRemovedRightToLeft()) ;
    }
    else
    {
    	mergedConfiguration = (TwinViewerConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static MappingViewerConfiguration mergeMappingViewerConfiguration(Configuration oldConfiguration,
      MappingViewerConfiguration newConfiguration)
  {
    MappingViewerConfiguration mergedConfiguration = null ;

    if (oldConfiguration instanceof MappingViewerConfiguration)
    {
    	mergedConfiguration = (MappingViewerConfiguration)oldConfiguration ;
    }
    
    if (mergedConfiguration != null)
    {  
	    if (newConfiguration.isSetFromItemAddedWhenUnmapped())
	      mergedConfiguration.setFromItemAddedWhenUnmapped(newConfiguration.isFromItemAddedWhenUnmapped()) ;
	    
	    if (newConfiguration.isSetFromItemRemovedWhenMapped())
	      mergedConfiguration.setFromItemRemovedWhenMapped(newConfiguration.isFromItemRemovedWhenMapped()) ;
	    
	    if (newConfiguration.isSetToItemAddedWhenUnmapped())
	      mergedConfiguration.setToItemAddedWhenUnmapped(newConfiguration.isToItemAddedWhenUnmapped()) ;
	    
	    if (newConfiguration.isSetToItemRemovedWhenMapped())
	      mergedConfiguration.setToItemRemovedWhenMapped(newConfiguration.isToItemRemovedWhenMapped()) ;
    }
    else
    {
    	mergedConfiguration = (MappingViewerConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static MultipleListViewerConfiguration mergeMultipleListViewerConfiguration(Configuration oldConfiguration,
      MultipleListViewerConfiguration newConfiguration)
  {
    MultipleListViewerConfiguration mergedConfiguration = null ;
    
    if (oldConfiguration instanceof MultipleListViewerConfiguration)
    {
    	mergedConfiguration = (MultipleListViewerConfiguration)oldConfiguration ;

      if (newConfiguration.isSetThreadingInUse())
        mergedConfiguration.setThreadingInUse(newConfiguration.isThreadingInUse()) ;
    }
    else
    {
    	mergedConfiguration = (MultipleListViewerConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static MatrixViewerConfiguration mergeMatrixViewerConfiguration(Configuration oldConfiguration,
      MatrixViewerConfiguration newConfiguration)
  {
  	MatrixViewerConfiguration mergedConfiguration ;
  	
    if (oldConfiguration instanceof MatrixViewerConfiguration)
    {
    	mergedConfiguration = (MatrixViewerConfiguration)oldConfiguration ;

      if (newConfiguration.isSetCellSelectionInUse())
        mergedConfiguration.setCellSelectionInUse(newConfiguration.isCellSelectionInUse());
      
      if (newConfiguration.isSetLinesVisible())
        mergedConfiguration.setLinesVisible(newConfiguration.isLinesVisible());
    }
    else
    {
    	mergedConfiguration = (MatrixViewerConfiguration)copyConfiguration(newConfiguration) ;
    }

    return mergedConfiguration ;
  }
  
  private static QueryResultViewerConfiguration mergeQueryResultViewerConfiguration(Configuration oldConfiguration,
      QueryResultViewerConfiguration newConfiguration)
  {
    QueryResultViewerConfiguration mergedConfiguration ;
    
    if (oldConfiguration instanceof QueryResultViewerConfiguration)
    {
    	mergedConfiguration = (QueryResultViewerConfiguration)oldConfiguration ;

      if (newConfiguration.isSetRunningQueryOnFirstUse())
        mergedConfiguration.setRunningQueryOnFirstUse(newConfiguration.isRunningQueryOnFirstUse()) ;
    }
    else
    {
    	mergedConfiguration = (QueryResultViewerConfiguration)copyConfiguration(newConfiguration) ;
    }

    return mergedConfiguration ;
  }

  private static WizardConfiguration mergeWizardConfiguration(Configuration oldConfiguration, WizardConfiguration newConfiguration)
  {
    WizardConfiguration mergedConfiguration ;
    
    if (oldConfiguration instanceof WizardConfiguration)
    {
    	mergedConfiguration = (WizardConfiguration)oldConfiguration ;
    	
	    WizardPageConfiguration wizardPageConfiguration ;
	    WizardPageConfiguration oldChildWizardPageConfiguration ;
	    List<WizardPageConfiguration> newChildWizardPageConfigurations = new LinkedList<WizardPageConfiguration>() ;
	
	    Iterator<WizardPageConfiguration> iterator = newConfiguration.getPages().listIterator();
	
	    while (iterator.hasNext())
	    {
	      wizardPageConfiguration = iterator.next() ;
	
	      oldChildWizardPageConfiguration = ConfigurationUtils.getWizardPageConfiguration(mergedConfiguration, wizardPageConfiguration.getId()) ;
	
	      if (oldChildWizardPageConfiguration != null)
	      {
	        newChildWizardPageConfigurations.add((WizardPageConfiguration)mergeConfiguration(oldChildWizardPageConfiguration, wizardPageConfiguration)) ;
	        mergedConfiguration.getPages().remove(oldChildWizardPageConfiguration) ;
	      }
	      else
	      {
	        newChildWizardPageConfigurations.add((WizardPageConfiguration)copyConfiguration(wizardPageConfiguration)) ;
	      }
	    }
	
	    iterator = null ;
	    mergedConfiguration.getPages().addAll(newChildWizardPageConfigurations) ;
	
	    /*Iterator<PathElement> iterator = newConfiguration.getPath().iterator() ;
	
	      PathElement newChildPathElement ;
	      PathElement oldChildPathElement ;
	      List<PathElement> newPathElements = new LinkedList<PathElement>() ;
	
	      while (success && iterator.hasNext())
	      {
	        newChildPathElement = iterator.next() ;
	
	        oldChildPathElement = ConfigurationUtils.getChildPathElement(oldConfiguration, newChildPathElement.getId()) ;
	
	        if (oldChildPathElement != null)
	        {
	          success = mergePathElement(oldChildPathElement, newChildPathElement) ;
	          if (success)
	            success = newPathElements.add(oldChildPathElement) ;
	        }
	        else
	        {
	          success = newPathElements.add(newChildPathElement) ;
	        }
	      }
	
	      iterator = null ;
	
	      if (success)
	      {
	        newConfiguration.getPath().clear() ;
	        success = newConfiguration.getPath().addAll(newPathElements) ;
	      }*/
	
	    // at moment just replace the whole path, need to traverse path and copy
	    mergedConfiguration.getPath().clear() ;
	    mergedConfiguration.getPath().addAll((List<PathElement>)EcoreUtil.copyAll(newConfiguration.getPath())) ;
    }
    else
    {
    	mergedConfiguration = (WizardConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static WizardPageConfiguration mergeWizardPageConfiguration(Configuration oldConfiguration, WizardPageConfiguration newConfiguration)
  {
    WizardPageConfiguration mergedConfiguration ;
    
    if (oldConfiguration instanceof WizardPageConfiguration)
    {
    	mergedConfiguration = (WizardPageConfiguration)oldConfiguration ;

      if (newConfiguration.getControl() != null)
      {  
      	ControlConfiguration componentConfiguration ;
      	
        if (mergedConfiguration.getControl() != null)
        {
          componentConfiguration = (ControlConfiguration)mergeConfiguration(mergedConfiguration.getControl(), newConfiguration.getControl()) ;
        }
        else
        {
        	componentConfiguration = (ControlConfiguration)copyConfiguration(newConfiguration.getControl()) ;
        }
        
        mergedConfiguration.setControl(componentConfiguration) ;
      }
    }
    else
    {
    	mergedConfiguration = (WizardPageConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static DialogConfiguration mergeDialogConfiguration(Configuration oldConfiguration, DialogConfiguration newConfiguration)
  {
    DialogConfiguration mergedConfiguration ;
    
    if (oldConfiguration instanceof DialogConfiguration)
    {
    	mergedConfiguration = (DialogConfiguration)oldConfiguration ;

      if (newConfiguration.getControl() != null)
      {  
      	ControlConfiguration componentConfiguration ;
      	
        if (mergedConfiguration.getControl() != null)
        {
          componentConfiguration = (ControlConfiguration)mergeConfiguration(mergedConfiguration.getControl(), newConfiguration.getControl()) ;
        }
        else
        {
        	componentConfiguration = (ControlConfiguration)copyConfiguration(newConfiguration.getControl()) ;
        }
        
        mergedConfiguration.setControl(componentConfiguration) ;
      }
      
      if (newConfiguration.isSetResizable())
        mergedConfiguration.setResizable(newConfiguration.isResizable()) ;
        
    }
    else
    {
    	mergedConfiguration = (DialogConfiguration)copyConfiguration(newConfiguration) ;
    }
    
    return mergedConfiguration ;
  }

  private static Layout mergeLayout(Layout oldConfiguration, Layout newConfiguration)
  {
    if (newConfiguration.isSetHorizontalSpacing())
      oldConfiguration.setHorizontalSpacing(newConfiguration.getHorizontalSpacing()) ;
    
    if (newConfiguration.isSetMakeColumnsEqualWidth())
      oldConfiguration.setMakeColumnsEqualWidth(newConfiguration.isMakeColumnsEqualWidth()) ;
    
    if (newConfiguration.isSetMarginBottom())
      oldConfiguration.setMarginBottom(newConfiguration.getMarginBottom()) ;
    
    if (newConfiguration.isSetMarginHeight())
      oldConfiguration.setMarginHeight(newConfiguration.getMarginHeight()) ;
    
    if (newConfiguration.isSetMarginLeft())
      oldConfiguration.setMarginLeft(newConfiguration.getMarginLeft()) ;
    
    if (newConfiguration.isSetMarginRight())
      oldConfiguration.setMarginRight(newConfiguration.getMarginRight()) ;
    
    if (newConfiguration.isSetMarginTop())
      oldConfiguration.setMarginTop(newConfiguration.getMarginTop()) ;
    
    if (newConfiguration.isSetMarginWidth())
      oldConfiguration.setMarginWidth(newConfiguration.getMarginWidth()) ;
    
    if (newConfiguration.isSetNumColumns())
      oldConfiguration.setNumColumns(newConfiguration.getNumColumns()) ;
    
    if (newConfiguration.isSetVerticalSpacing())
      oldConfiguration.setVerticalSpacing(newConfiguration.getVerticalSpacing()) ;
    
    return oldConfiguration ;
  }

  private static LayoutData mergeLayoutData(LayoutData oldConfiguration, LayoutData newConfiguration)
  {
    if (newConfiguration.isSetGrabExcessHorizontalSpace())
      oldConfiguration.setGrabExcessHorizontalSpace(newConfiguration.isGrabExcessHorizontalSpace()) ;
    
    if (newConfiguration.isSetGrabExcessVerticalSpace())
      oldConfiguration.setGrabExcessVerticalSpace(newConfiguration.isGrabExcessVerticalSpace()) ;
    
    if (newConfiguration.isSetHeightHint())
      oldConfiguration.setHeightHint(newConfiguration.getHeightHint()) ;
    
    if (newConfiguration.isSetHorizontalAlignment())
      oldConfiguration.setHorizontalAlignment(newConfiguration.getHorizontalAlignment()) ;
    
    if (newConfiguration.isSetHorizontalIndent())
      oldConfiguration.setHorizontalIndent(newConfiguration.getHorizontalIndent()) ;
    
    if (newConfiguration.isSetHorizontalSpan())
      oldConfiguration.setHorizontalSpan(newConfiguration.getHorizontalSpan()) ;
    
    if (newConfiguration.isSetMinimumHeight())
      oldConfiguration.setMinimumHeight(newConfiguration.getMinimumHeight()) ;
    
    if (newConfiguration.isSetMinimumWidth())
      oldConfiguration.setMinimumWidth(newConfiguration.getMinimumWidth()) ;
    
    if (newConfiguration.isSetVerticalAlignment())
      oldConfiguration.setVerticalAlignment(newConfiguration.getVerticalAlignment()) ;
    
    if (newConfiguration.isSetVerticalIndent())
      oldConfiguration.setVerticalIndent(newConfiguration.getVerticalIndent()) ;
    
    if (newConfiguration.isSetVerticalSpan())
      oldConfiguration.setVerticalSpan(newConfiguration.getVerticalSpan()) ;
    
    if (newConfiguration.isSetWidthHint())
      oldConfiguration.setWidthHint(newConfiguration.getWidthHint()) ;
    
    return oldConfiguration ;
  }
  
  private static org.cropinformatics.ui.configuration.Label mergeLabel(org.cropinformatics.ui.configuration.Label oldConfiguration, org.cropinformatics.ui.configuration.Label newConfiguration)
  {
    if (newConfiguration.getValue() != null)
    {
      oldConfiguration.setValue(new String(newConfiguration.getValue())) ;
      oldConfiguration.setKey(null) ;
    }
    else
    {
      if (newConfiguration.getKey() != null)
      {
        oldConfiguration.setKey(new String(newConfiguration.getKey())) ;
        oldConfiguration.setValue(null) ;
      }
    }
    
    if (newConfiguration.getPluginId() != null)
      oldConfiguration.setPluginId(new String(newConfiguration.getPluginId())) ;
    
    return oldConfiguration ;
  }
  
  private static Image mergeImage(Image oldConfiguration, Image newConfiguration)
  {
    if (newConfiguration.getPath() != null)
    {
      oldConfiguration.setPath(new String(newConfiguration.getPath())) ;
      oldConfiguration.setKey(null) ;
    }
    else
    {
      if (newConfiguration.getKey() != null)
      {
        oldConfiguration.setKey(new String(newConfiguration.getKey())) ;
        oldConfiguration.setPath(null) ;
      }
    }
    
    if (newConfiguration.getPluginId() != null)
      oldConfiguration.setPluginId(new String(newConfiguration.getPluginId())) ;
    
    return oldConfiguration ;
  }
  
  private static boolean mergePathElement(PathElement oldConfiguration, PathElement newConfiguration)
  {
    boolean success = true ;
    
    if (oldConfiguration instanceof PagePathElement && newConfiguration instanceof PagePathElement)
      success = mergePagePathElement((PagePathElement)oldConfiguration, (PagePathElement)newConfiguration) ;
    else
      if (oldConfiguration instanceof ControlPathElement && newConfiguration instanceof ControlPathElement)
        success = mergeControlPathElement((ControlPathElement)oldConfiguration, (ControlPathElement)newConfiguration) ;
      else
        success = false ;
    
    return success ;
  }


  private static boolean mergePagePathElement(PagePathElement oldConfiguration, PagePathElement newConfiguration)
  {
    boolean success = true ;
    
    if (oldConfiguration instanceof ControlPathElement && newConfiguration instanceof ControlPathElement)
      success = mergeControlPathElement((ControlPathElement)oldConfiguration, (ControlPathElement)newConfiguration) ;
    else
      success = false ;
    
    if (success && newConfiguration.getPageId() != null)
      oldConfiguration.setPageId(newConfiguration.getPageId()) ;
    
    return success ;
  }

  private static boolean mergeControlPathElement(ControlPathElement oldConfiguration, ControlPathElement newConfiguration)
  {
    boolean success = true ;
    
    if (newConfiguration.getConditionProperty() != null)
      oldConfiguration.setConditionProperty(newConfiguration.getConditionProperty()) ;
    
    if (newConfiguration.getDefaultValue() != null)
      oldConfiguration.setDefaultValue(newConfiguration.getDefaultValue()) ;
    
    Iterator<SubPath> iterator = newConfiguration.getSubPaths().iterator() ;
    SubPath newSubPath ;
    List<SubPath> newSubPaths = new LinkedList<SubPath>() ;
    
    SubPath oldSubPath ;
    
    while (success && iterator.hasNext())
    {
      newSubPath = iterator.next() ;
      
      oldSubPath = ConfigurationUtils.getChildSubPath(oldConfiguration, newSubPath.getId()) ;
      
      if (oldSubPath != null)
      {
        success = mergeSubPath(oldSubPath, newSubPath) ;
        
        if (success)
          success = newSubPaths.add(oldSubPath) ;
      }
      else
      {
        success = newSubPaths.add(newSubPath) ;
      }
    }
    
    if (success)
    {
      oldConfiguration.getSubPaths().clear() ;
      oldConfiguration.getSubPaths().addAll(newSubPaths) ;
    }
    
    return success ;
  }
  
  private static boolean mergeSubPath(SubPath oldConfiguration, SubPath newConfiguration)
  {
    boolean success = true ;
    
    if (newConfiguration.getConditionValue() != null)
      oldConfiguration.setConditionValue(newConfiguration.getConditionValue()) ;
    
    Iterator<PathElement> iterator = newConfiguration.getPath().iterator() ;
    PathElement newPathElement ;
    List<PathElement> newPathElements = new LinkedList<PathElement>() ;
    
    PathElement oldPathElement ;
    
    while (iterator.hasNext())
    {
      newPathElement = iterator.next() ;
      
      oldPathElement = ConfigurationUtils.getChildPathElement(oldConfiguration, newPathElement.getId()) ;
      
      if (oldPathElement != null)
      {
        success = mergePathElement(oldPathElement, oldPathElement) ;
        
        if (success)
          success = newPathElements.add(oldPathElement) ;
      }
      else
      {
        success = newPathElements.add(newPathElement) ;
      }
    }
    
    if (success)
    {
      oldConfiguration.getPath().clear() ;
      oldConfiguration.getPath().addAll(newPathElements) ;
    }
    
    return success ;
  }
  
  /**
   * Returns the original composite or a newly created enclosing control, such as
   * a Composite or Group. If a new composite is created it is configured with the given
   * configuration, if a new composite is not created the original composite configured 
   * with the given configuration. The returned composite can used to add child components.
   * 
   * @param composite the composite to be configured
   * @param configuration the configuration to be used
   * @param ignoreLayoutData if <code>true</code> any layout data in the configuration is ignored.
   * @return the returning the original composite or an internal composite, such as a Composite or Group
   */
  private static Composite configureComposite(Composite composite,
      ComponentConfiguration configuration)
  {
    Composite returnedComposite = composite ;

    if (configuration != null && (configuration.isEnclosed() || configuration.getLabel() != null))
    {  
    	returnedComposite = createComposite(composite, null, configuration) ;
    }
    else
    {
    	updateControl(composite, configuration, null) ;  
    }  
    
    return returnedComposite;
  }
  
  
  /**
   * Configures a control using the given configuration
   * 
   * @param control
   * @param configuration
   * @param defaultLayoutData the layout data to be used if not layout data not defined
   * 
   */
  private static void updateControl(Control control, ComponentConfiguration configuration, GridData defaultLayoutData)
  {
    if (control != null)
    {
      if (configuration != null)
      {
        if (control instanceof Composite)
        {
          if (configuration instanceof ContainerConfiguration && ((ContainerConfiguration)configuration).getLayout() != null)
            updateLayout((Composite)control, ((ContainerConfiguration)configuration).getLayout()) ;
          else
            updateLayout((Composite)control, null) ;
        }
        
        if (configuration instanceof ControlConfiguration)
        {
          ControlConfiguration controlConfiguration = ((ControlConfiguration)configuration) ;
          
          updateLayoutData(control, controlConfiguration.getLayoutData(), defaultLayoutData) ;
          
          if (controlConfiguration.getForeground() != null)
            control.setForeground(createColour(control.getDisplay(), controlConfiguration.getForeground())) ;
  
          if (controlConfiguration.getBackground() != null)
            control.setBackground(createColour(control.getDisplay(), controlConfiguration.getBackground())) ;
          //else
          //  control.setBackground(createRandomColour(control.getDisplay())) ;
        }
        else
        {
        	updateLayoutData(control, null, defaultLayoutData) ;
        }
        
        if (configuration.getHelpContextId() != null)
        	PlatformUI.getWorkbench().getHelpSystem().setHelp(control, configuration.getHelpContextId());
      }
      else
      {
        if (control instanceof Composite)
          updateLayout((Composite)control, null) ;

        updateLayoutData(control, null, defaultLayoutData) ;
      }
    }
  }

  // Remove after testing
  /*private static Color createRandomColour(Device device)
  {
    // TODO Auto-generated method stub
    
    ColourModel colourModel ;
    
    if (useAltColour)
    {
      colourModel = colourMap.getColourModel(altColour) ;
      ++altColour ;
      if (altColour >= colourMap.getSize())
        altColour = 0 ;
    }
    else
    {
      colourModel = colourMap.getColourModel(colour) ;
      ++colour ;
      if (colour >= colourMap.getSize())
        colour = 0 ;
    }
    useAltColour = !useAltColour ;
    
    return new Color(device, colourModel.getRed(), colourModel.getGreen(), colourModel.getBlue()) ;
  }*/

  /**
   * Update or create a grid data layout object from a configuration, or uses default if no configuration available
   * 
   * @param control the control object
   * @param layout the configuration object
   * @param override set values even if unset
   */
  protected static final void updateLayoutData(Control control, LayoutData layoutData, GridData defaultLayoutData)
  {
    if (control != null)
    {
      GridData gridData ;
      
      if (control.getLayoutData() != null && control.getLayoutData() instanceof GridData)
      {
        gridData = (GridData)control.getLayoutData() ;
      }
      else
      {
      	if (defaultLayoutData != null)
      		gridData = defaultLayoutData ;
      	else
      		gridData = createDefaultLayoutData() ;  
      }
      
      if (layoutData != null)
      {
        if (layoutData.isSetGrabExcessHorizontalSpace())
          gridData.grabExcessHorizontalSpace = layoutData.isGrabExcessHorizontalSpace() ;
    
        if (layoutData.isSetGrabExcessVerticalSpace())
          gridData.grabExcessVerticalSpace = layoutData.isGrabExcessVerticalSpace() ;
        
        if (layoutData.isSetHeightHint())
          gridData.heightHint = layoutData.getHeightHint() ;
        
        if (layoutData.isSetHorizontalAlignment())
          gridData.horizontalAlignment = layoutData.getHorizontalAlignment() ;
        
        if (layoutData.isSetHorizontalIndent())
          gridData.horizontalIndent = layoutData.getHorizontalIndent() ;
        
        if (layoutData.isSetHorizontalSpan())
          gridData.horizontalSpan = layoutData.getHorizontalSpan() ;
        
        if (layoutData.isSetMinimumHeight())
          gridData.minimumHeight = layoutData.getMinimumHeight() ;
        
        if (layoutData.isSetMinimumWidth())
          gridData.minimumWidth = layoutData.getMinimumWidth() ;
        
        if (layoutData.isSetVerticalAlignment())
          gridData.verticalAlignment = layoutData.getVerticalAlignment() ;
        
        if (layoutData.isSetVerticalIndent())
          gridData.verticalIndent = layoutData.getVerticalIndent();
        
        if (layoutData.isSetVerticalSpan())
          gridData.verticalSpan = layoutData.getVerticalSpan() ;
        
        if (layoutData.isSetWidthHint())
          gridData.widthHint = layoutData.getVerticalAlignment() ;
      }
      
      assignLayoutData(control, gridData) ;
    }
  }
  
  /**
   * Update or create a grid layout object from a configuration, or uses default if no configuration available
   * 
   * @param composite the composite object
   * @param layout the configuration object
   * @return the created GridLayout object
   */
  private static final void updateLayout(Composite composite, Layout layout)
  {
    updateLayout(composite, layout, false) ;
  }
  
  /**
   * Update or create a grid layout object from a configuration, or uses default if no configuration available
   * 
   * @param composite the composite object
   * @param layout the configuration object
   * @param d set values even if unset
   * @return the created GridLayout object
   */
  private static final void updateLayout(Composite composite, Layout layout, boolean override)
  {
    if (composite != null)
    {
      GridLayout gridLayout ;
      
      if (composite.getLayout() != null && composite.getLayout() instanceof GridLayout)
      {
        gridLayout = (GridLayout)composite.getLayout() ;
      }
      else
      {
        gridLayout = createDefaultLayout() ;  
      }
        
      if (layout != null)
      {
        if (override || layout.isSetHorizontalSpacing())
          gridLayout.horizontalSpacing = layout.getHorizontalSpacing() ;
        
        if (override || layout.isSetMakeColumnsEqualWidth())
          gridLayout.makeColumnsEqualWidth = layout.isMakeColumnsEqualWidth() ;
      
        if (override || layout.isSetMarginBottom())
          gridLayout.marginBottom = layout.getMarginBottom() ;
        
        if (override || layout.isSetMarginHeight())
          gridLayout.marginHeight = layout.getMarginHeight() ;
        
        if (override || layout.isSetMarginLeft())
          gridLayout.marginLeft = layout.getMarginLeft() ;
        
        if (override || layout.isSetMarginRight())
          gridLayout.marginRight = layout.getMarginRight() ;
        
        if (override || layout.isSetMarginTop())
          gridLayout.marginTop = layout.getMarginTop() ;
        
        if (override || layout.isSetMarginWidth())
          gridLayout.marginWidth = layout.getMarginWidth() ;
        
        if (override || layout.isSetNumColumns())
          gridLayout.numColumns = layout.getNumColumns()  ;
        
        if (override || layout.isSetVerticalSpacing())
          gridLayout.verticalSpacing = layout.getVerticalSpacing() ;
      }
      
      composite.setLayout(gridLayout) ;
    }
  }

  private static Color createColour(Device device, Colour colour)
  {
    return new Color(device, colour.getRed(), colour.getGreen(), colour.getBlue());
  }
  
  private static GridLayout createDefaultLayout()
  {
    GridLayout gridLayout = new GridLayout(1, false) ;
    
    gridLayout.marginHeight = 0 ;
    gridLayout.marginWidth = 0 ;

    return gridLayout ;
  }
  
  private static GridLayout createDefaultGroupLayout()
  {
    GridLayout gridLayout = new GridLayout(1, false) ;

    return gridLayout ;
  }
  
  private static GridData createDefaultLayoutData()
  {
  	return new GridData(SWT.FILL, SWT.TOP, true, false) ;
  }
  
  private static GridData createFilledLayoutData()
  {
  	return new GridData(SWT.FILL, SWT.FILL, true, true) ;
  }
  
  private static void configureItem(Display display, Item item,
      ComponentConfiguration configuration)
  {
    if (configuration.getLabel() != null)
      item.setText(getText(configuration.getLabel(), configuration)) ;
    
    if (configuration.getImage() != null)
      item.setImage(getImage(display, configuration.getImage())) ;
  }
  
  private static org.eclipse.swt.graphics.Image getImage(Display display, Image image)
  {
    org.eclipse.swt.graphics.Image imageObject = null ;
    
    if (image != null)
    {
      if (image.getKey() != null)
        if (image.getPluginId() != null)
          ;  // TODO find a way to get a image from Registry
        else
          imageObject = Activator.getDefault().getImage(image.getKey()) ;
      else
        if (image.getPath() != null)
          if (image.getPluginId() != null)
            imageObject = PluginUtils.createImage(image.getPluginId(), display, image.getPath()) ;
          else
            imageObject = Activator.getDefault().createImage(display, image.getPath()) ;
    }
    
    return imageObject ;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  private static Configuration getConfigurationByClass(Class<? extends Configurable> classObject)
  {
  	Configuration configuration = ConfigurationManager.instance().getConfiguration(classObject.getName());
  	
    if (configuration == null && classObject.getSuperclass() != null && Configurable.class.isAssignableFrom(classObject.getSuperclass()))
    	configuration = getConfigurationByClass((Class<? extends Configurable>) classObject.getSuperclass()) ;
    
    return configuration ;
  }
  
  private static void assignLayoutData(Control control, GridData layoutData)
  {
  	if (control.getParent().getLayout() instanceof GridLayout)
  		control.setLayoutData(layoutData) ;
  	else
  		Activator.getDefault().warn("Parent layout is not GridLayout, ignoring setLayoutData()") ;
  		
  }


}