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

import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ComboViewerComponent<T> extends LabelledComponent
{
	public static final String SELECTED_ITEM = ComboViewerComponent.class.getName() + ".selectedItem";
	
	private static final String COMBO_VIEWER_ID = "comboViewer";

	private ComboViewer comboViewer;
	private List<T> items;
	private T selectedItem;

	public ComboViewerComponent(Composite parent,
      ContainerConfiguration containerConfiguration, List<T> items)
  {
	  super(parent, containerConfiguration);
	  
	  setItem(items);
  }

	public ComboViewerComponent(Composite parent,
      ContainerConfiguration containerConfiguration, String labelValue, List<T> items)
  {
	  super(parent, containerConfiguration, labelValue);
	  
	  setItem(items);
  }
	
	public ComboViewerComponent(Composite parent,
      ContainerConfiguration containerConfiguration, List<T> items, T selectedItem)
  {
	  super(parent, containerConfiguration);
	  
	  setItem(items);
	  
	  this.selectedItem = selectedItem ;
  }

	public ComboViewerComponent(Composite parent,
      ContainerConfiguration containerConfiguration, String labelValue, List<T> items, T selectedItem)
  {
	  super(parent, containerConfiguration, labelValue);
	  
	  setItem(items);
	  
	  this.selectedItem = selectedItem ;
  }
	
	public List<T> getItem()
  {
		return items ;
  }
	
	public void setItem(List<T> items)
  {
	  this.items = new LinkedList<T>() ;
	  
	  this.items.addAll(items) ;
  }

	public T getSelectedItem()
  {
		return selectedItem ;
  }

  public final void setSelectedItem(T selectedItem)
  {
  	this.selectedItem = selectedItem;
  	
  	if (comboViewer != null)
  		if (selectedItem != null)
  			comboViewer.getCombo().select(items.indexOf(selectedItem)) ;
  		else
				comboViewer.getCombo().deselectAll() ;
  }
  
  public final boolean isValid()
  {
    if (ConfigurationUtils.isMandatory(getConfiguration()))
    {
    	return selectedItem != null ;
    }
    else
    {
    	return true ;
    }
  }

	@Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
    ControlConfiguration controlConfiguration = null ;

    if (component == null && COMBO_VIEWER_ID.equals(id))
    {
      if (configuration instanceof ControlConfiguration)
        controlConfiguration = (ControlConfiguration)configuration ;
     
      comboViewer = new ComboViewer(parent, SWT.None) ;
      
      comboViewer.setContentProvider(createContentProvider()) ;
      comboViewer.setLabelProvider(createLabelProvider()) ;
      comboViewer.setInput(items) ;
      comboViewer.setSorter(createViewerSorter()) ;
      
      if (selectedItem != null)
      	comboViewer.getCombo().select(items.indexOf(selectedItem)) ;
      
      comboViewer.addSelectionChangedListener(new ISelectionChangedListener()
      {
				@Override
        public void selectionChanged(SelectionChangedEvent event)
        {
        	updateSelectedItem() ;
        }
      }) ;
    	
      component = new SimpleViewerComponent<ComboViewer>(comboViewer, controlConfiguration) ;
    }
    
    return component ;
  }
  
  @SuppressWarnings("unchecked")
  protected void updateSelectedItem()
  {
  	T oldValue = selectedItem ;
  	
  	if (comboViewer != null && comboViewer.getSelection() != null && !comboViewer.getSelection().isEmpty())
		{
  		selectedItem = (T)((IStructuredSelection)comboViewer.getSelection()).getFirstElement() ;
		}
		else
		{
			selectedItem = null ;
		}
  	
  	getPropertyChangeSupport().firePropertyChange(SELECTED_ITEM, oldValue, selectedItem) ;
  }

	protected IContentProvider createContentProvider()
  {
	  return new ArrayContentProvider();
  }

  protected IBaseLabelProvider createLabelProvider()
  {
	  return new LabelProvider() ;
  }
  
	protected ViewerSorter createViewerSorter()
  {
	  return null;
  }

	@Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(COMBO_VIEWER_ID) ;
    
    return list ;
  }
}
