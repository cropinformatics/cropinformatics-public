/*******************************************************************************
 * Copyright 2011 Guy Davenport
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
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractComboViewerEditComponent<T, E> extends LabelledEditComponent<T>
{
	private static final String VIEWER_COMPONENT_ID = "comboViewer";
	
	private ComboViewer comboViewer ;

	private List<E> values;

	private E selectedValue;
	
	private boolean allowingNewValues ;
	
  public AbstractComboViewerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, List<E> values, boolean allowingNewValues)
  {
  	this(parent, containerConfiguration, labelValue, null, values, allowingNewValues) ;
  }
  
  public AbstractComboViewerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, T value, List<E> values, boolean allowingNewValues)
  {
    super(parent, containerConfiguration, labelValue);

    this.values = new LinkedList<E>() ;
    
    this.values.addAll(values) ;

	  createCache() ;

	  setValue(value) ;
  }
  
	@Override
  public void setValue(T value)
  {
		if (isValidValue(value))
		{
		  super.setValue(value);
		}
  }

	@Override
  protected void updateInternalComponents()
  {
	  if (comboViewer != null)
	  {
  		updateSelection() ;
	  }
  }

	protected abstract void createCache() ;
	
	protected final boolean isAllowingNewValues()
  {
  	return allowingNewValues;
  }

	protected final List<E> getValidValues()
	{
		return values ;
	}

	@Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
  	
  	if (component == null)
  	{
	    ControlConfiguration controlConfiguration = null ;
	    
	    if (configuration instanceof ControlConfiguration)
	      controlConfiguration = (ControlConfiguration)configuration ;
	    
	    if (VIEWER_COMPONENT_ID.equals(id))
	    {
	    	comboViewer = new ComboViewer(parent, SWT.NONE) ;
	    	
	    	comboViewer.setContentProvider(createContentProvider()) ;
	  		comboViewer.setLabelProvider(createLabelProvider()) ;
	  		comboViewer.setInput(values) ;
	  		comboViewer.setSorter(createViewerSorter()) ;
	  		
	  		updateSelection() ;
	  		
	  		comboViewer.addSelectionChangedListener(new ISelectionChangedListener()
	  		{
					@Override
	        public void selectionChanged(SelectionChangedEvent event)
	        {
		        handleSelectionChanged() ;
	        }
	  			
	  		}) ;
	
	      component = new SimpleViewerComponent<ComboViewer>(comboViewer, controlConfiguration) ;
	    }
  	}
    
    return component ;
  }
  
  @SuppressWarnings("unchecked")
  protected void handleSelectionChanged()
  {
  	selectedValue = (E)((StructuredSelection)comboViewer.getSelection()).getFirstElement() ;
  	
  	setValueInternalWithEvent(parseToValue(selectedValue)) ;
  }

	@Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(VIEWER_COMPONENT_ID) ;
    
    return list ;
  }
  
	protected IStructuredContentProvider createContentProvider()
	{
		return new ArrayContentProvider() ;
	}
	
	protected ILabelProvider createLabelProvider()
	{
		return new LabelProvider() ;
	}
	
	protected ViewerSorter createViewerSorter()
	{
		return null ;
	}
	
	protected boolean isValidValue(T value)
  {
	  return true ;
  }
	
	protected abstract T parseToValue(E value) ;
	
	protected abstract E parseFromValue(T value) ;
	
	private void updateSelection()
  {
		E parsedValue = parseFromValue(getValue()) ;
		
		if (parsedValue != null)
			comboViewer.setSelection(new StructuredSelection(parseFromValue(getValue()))) ;
		else
			comboViewer.setSelection(StructuredSelection.EMPTY) ;
  }	

}
