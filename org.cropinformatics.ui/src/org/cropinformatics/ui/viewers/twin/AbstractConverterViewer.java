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
package org.cropinformatics.ui.viewers.twin;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.impl.SimpleControlComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public abstract class AbstractConverterViewer<L, R> extends
    BaseTwinViewer<L, R>
{
  private static final String CONVERSION_PROPERTIES_COMPONENT_ID = "conversionPropertiesComponent";

  
  public AbstractConverterViewer(Composite parent, TwinViewerConfiguration configuration, List<L> leftItems)
  {
    super(parent, configuration, leftItems);
  }
  
  public AbstractConverterViewer(Composite parent, TwinViewerConfiguration configuration, List<L> leftItems,
      List<R> rightItems)
  {
    super(parent, configuration, leftItems, rightItems);
  }
 
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(
      Composite parent, ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = 
  		super.initialiseChildComponent(parent, configuration, id);

  	if (component == null && CONVERSION_PROPERTIES_COMPONENT_ID.equals(id))
  	{
    	ControlConfiguration controlConfiguration = null;
    	
    	if (configuration instanceof ComponentConfiguration)
    		controlConfiguration = (ControlConfiguration)configuration ;
    	
  		return createConversionPropertiesComposite(parent, controlConfiguration);
  	}
  	else
  	{
  		return component ;
  	}
  }
  
  protected Component<? extends ComponentConfiguration> createConversionPropertiesComposite(Composite parent, ControlConfiguration configuration)
  {
    Group group = new Group(parent, SWT.NULL);
    group.setText("OVERRIDE createConversionPropertiesComposite") ;
    
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    group.setLayoutData(gridData);
    
    return new SimpleControlComponent<Group>(group, configuration) ;
  }
  
  @Override
  protected final List<R> convertLeftItems(List<L> items)
  {
    List<R> convertedItems = new LinkedList<R>() ;
    
    if (items != null)
    {
      Iterator<L> iterator = items.iterator() ;
      
      while (iterator.hasNext())
        convertedItems.add(convertLeftItem(iterator.next())) ;
    }

    return convertedItems;
  }


  @Override
  protected List<L> convertRightItems(List<R> items)
  {
    List<L> convertedItems = new LinkedList<L>() ;
    
    if (items != null)
    {
      Iterator<R> iterator = items.iterator() ;
      
      while (iterator.hasNext())
        convertedItems.add(convertRightItem(iterator.next())) ;
    }

    return convertedItems;
  }


  protected abstract R convertLeftItem(L item) ;
  
  protected abstract L convertRightItem(R item) ;
}
