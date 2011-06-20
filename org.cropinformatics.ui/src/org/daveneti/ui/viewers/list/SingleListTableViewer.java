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
package org.daveneti.ui.viewers.list;

import java.util.Iterator;
import java.util.List;

import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;

/**
 * List viewer that uses a TableViewer to display the list
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 * @param <T> the type of the elements in the list
 */
public class SingleListTableViewer<T extends Object> 
  extends AbstractSingleListStructuredViewer<T> implements AdvancedListViewer<T>
{
  public SingleListTableViewer(Composite parent, ListViewerConfiguration configuration)
  {
    super(parent, configuration) ;
  }
  
  public SingleListTableViewer(Composite parent, ListViewerConfiguration configuration, List<T> items)
  {
  	super(parent, configuration, items) ;
  }

  public SingleListTableViewer(Composite parent, ListViewerConfiguration configuration, List<T> items, List<T> selectedItems)
  {
  	super(parent, configuration, items, selectedItems) ;
  }
  
  public boolean setSelectedItem(T selectedItem)
  {
    boolean success = setSelectedItemInternal(selectedItem) ;
    
    if (success && getTableViewer() != null)
    {
      if (selectedItem != null)
      {
        getTableViewer().getTable().select(getItems().indexOf(selectedItem)) ;
      }
      else
      {
        getTableViewer().getTable().deselectAll() ;
      }
      updateButtons() ;
    }
    
    return success ;
  }

  public synchronized boolean setSelectedItems(List<T> selectedItems)
  {
    boolean success  ;
    
    if (!ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()) && selectedItems != null && selectedItems.size() > 1)
    {
      success = setSelectedItem(selectedItems.get(0)) ;
    }
    else
    {
      if (getTableViewer() != null)
      {
        success = setSelectedItemsInternal(selectedItems) ;
  
        if (success)
        {
          if (selectedItems != null && selectedItems.size() > 0)
          {
            int[] indices = new int[selectedItems.size()] ;
  
            Iterator<T> iterator = selectedItems.iterator() ;
  
            int i = 0 ;
  
            while (iterator.hasNext())
            {
              indices[i] = getItems().indexOf(iterator.next()) ;
              ++i ;
            }
  
            getTableViewer().getTable().select(indices) ;
          }
          else
          {
            getTableViewer().getTable().deselectAll() ;
          }
  
        }
      
        updateButtons() ;
      }
      else
      {
        success = setSelectedItemsInternal(selectedItems) ;
      }
    }
    return success ;
  }
  
  public boolean setCheckedItem(T checkedItem)
  {
    boolean success = false ;
    
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    {
      if (getTableViewer() != null && getTableViewer() instanceof ICheckable)
      {
        T oldItem = getCheckedItem() ; 
  
        success = setCheckedItemInternal(checkedItem) ;
  
        if (success && getCheckedItem() != oldItem)
        {
          if (oldItem != null)
            ((ICheckable)getTableViewer()).setChecked(oldItem, false) ;
  
          if (checkedItem != null)
            success = ((ICheckable)getTableViewer()).setChecked(getCheckedItem(), true) ;
        }
      }
      else
      {
        success = setCheckedItemInternal(checkedItem) ;
      }
      
      updateButtons() ;
    }
    
    return success ;
  }

  public synchronized boolean setCheckedItems(List<T> checkedItems)
  {
    boolean success = false ;
    
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    {
      if (!ConfigurationUtils.isMultipleCheckInUse(getConfiguration()))
      {
        if (checkedItems != null && !checkedItems.isEmpty())
          success = setCheckedItem(checkedItems.get(0)) ;
        else
          success = setCheckedItem(null) ;
      }
      else
      {
        if (getTableViewer() != null && getTableViewer() instanceof ICheckable)
        { 
          Iterator<T> iterator = getCheckedItems().iterator() ;
    
          while (iterator.hasNext())
          {
            ((ICheckable)getTableViewer()).setChecked(iterator.next(), false) ;
          }
    
          if (checkedItems != null)
          {
            success = setCheckedItemsInternal(checkedItems) ;
      
            if (success)
            {
              iterator = getCheckedItems().iterator() ;
        
              while (iterator.hasNext())
              {
                ((ICheckable)getTableViewer()).setChecked(iterator.next(), true) ;
              }
            }
          }
          
          updateButtons() ;
        }
        else
        {
          success = setCheckedItemsInternal(checkedItems) ;
        }
      }
    }
    
    return success ;
  }
  
  protected boolean setSelectedItemWithEvent(T selectedItem)
  {
  	T oldValue = getSelectedItem() ;
  	
    boolean success = setSelectedItem(selectedItem) ;
    
    if (success)
    	handleInternalPropertyChange(SELECTION_PROPERTY, oldValue, getSelectedItem()) ;
    
    return success ;
  }

  protected synchronized boolean setSelectedItemsWithEvent(List<T> selectedItems)
  {
  	List<T> oldValue = getSelectedItems() ;
  	
    boolean success = setSelectedItems(selectedItems) ;
    
    if (success)
    	handleInternalPropertyChange(SELECTION_PROPERTY, oldValue, getSelectedItems()) ;
    
    return success ;
  }
  
  protected boolean setCheckedItemWithEvent(T checkedItem)
  {
  	T oldValue = getCheckedItem() ;
  	
    boolean success = setCheckedItem(checkedItem) ;
    
    if (success)
    	handleInternalPropertyChange(CHECKED_PROPERTY, oldValue, getCheckedItem()) ;
    
    return success ;
  }

  protected synchronized boolean setCheckedItemsWithEvent(List<T> checkedItems)
  {
  	List<T> oldValue = getCheckedItems() ;
  	
    boolean success = setCheckedItemsWithEvent(checkedItems) ;
    
    if (success)
    	handleInternalPropertyChange(CHECKED_PROPERTY, oldValue, getCheckedItems()) ;
    
    return success ;
  }
  
  @SuppressWarnings("unchecked")
  protected final synchronized T getItemAt(int index)
  {
    if (getTableViewer() != null)
      return (T)getTableViewer().getTable().getItem(index).getData() ;
    else
      return null ;
  }

  @Override
  protected void initialiseStructuredViewer(StructuredViewer structuredViewer)
  {
    ControlConfiguration componentConfiguration = ConfigurationUtils.getChildControlConfiguration(getConfiguration(), STRUCTURED_VIEWER_CONPONENT_ID) ;
    
    if (componentConfiguration != null && componentConfiguration.getLayoutData() != null)
      ConfigurationUtils.configureComponent(getTableViewer().getTable(), componentConfiguration) ;
    else
      getTableViewer().getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
    getTableViewer().setCellModifier(createCellModifier());
  }
  
  @Override
  protected void initialiseSelection()
  {
    List<T> selectedItems = getSelectedItems() ;
    
    if (selectedItems != null && selectedItems.size() > 0)
    {
    	selectedItems.retainAll(getItems()) ;
    	
      int[] indices = new int[selectedItems.size()] ;

      Iterator<T> iterator = selectedItems.iterator() ;

      int i = 0 ;

      while (iterator.hasNext())
      {
        indices[i] = getItems().indexOf(iterator.next()) ;
        ++i ;
      }

      getTableViewer().getTable().select(indices) ;
    }
  }
  
  @Override
  protected void initialiseChecked()
  { 
    List<T> checkedItems = getCheckedItems() ;
    
    if (checkedItems != null && checkedItems.size() > 0 && getTableViewer() instanceof ICheckable && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    { 
    	checkedItems.retainAll(getItems()) ;
    	
      Iterator<T> iterator = checkedItems.iterator() ;

      while (iterator.hasNext())
      {
        ((ICheckable)getTableViewer()).setChecked(iterator.next(), true) ;
      }
    }
  }

  @Override
  protected StructuredViewer createStructuredViewer(Composite parent)
  { 
    TableViewer tableViewer ;
    
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
      tableViewer = CheckboxTableViewer.newCheckList(parent, createWidgetStyle()) ;
    else
      tableViewer = new TableViewer (parent, createWidgetStyle()) ;
    
    tableViewer.setColumnProperties(new String[] {"Name"}) ;
    
    return tableViewer ; 
  }

  protected void deselectAll()
  {
    getTableViewer().getTable().deselectAll() ;

    deselectAllInternal() ;
    
    updateButtons() ;
  }
  
  protected void checkAll()
  {
    if (getTableViewer() instanceof CheckboxTableViewer && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    { 
      ((CheckboxTableViewer)getTableViewer()).setAllChecked(true) ;
    }

    checkAllInternal() ;
    
    updateButtons() ;
  }
  
  protected void decheckAll()
  {
    if (getTableViewer() instanceof CheckboxTableViewer && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    { 
      ((CheckboxTableViewer)getTableViewer()).setAllChecked(false) ;
    }

    decheckAllInternal() ;
    
    updateButtons() ;
  }

  protected void handleDown()
  {
    int indexA = -1 ;
    int indexB = -1 ;
    
    if (isFiltersInUse())
    {
      int index = getTableViewer().getTable().getSelectionIndex() ;
      
      TableItem tableItemA = getTableViewer().getTable().getItem(index) ;
      TableItem tableItemB = getTableViewer().getTable().getItem(index + 1) ;
      
      swapItems(tableItemA, tableItemB) ; 
      
      getTableViewer().getTable().select(index + 1) ;
      
      getPropertyChangeSupport().firePropertyChange(POSITION_PROPERTY, index, index + 1) ;
    }
    else
    {
      indexA = getTableViewer().getTable().getSelectionIndex();
      indexB = indexA + 1 ;
      
      swapItems(indexA, indexB) ;
      
      getTableViewer().getTable().select(indexB) ;
      
      getPropertyChangeSupport().firePropertyChange(POSITION_PROPERTY, indexA, indexB) ;
    }
  }

  protected void handleUp()
  {
    int indexA = -1 ;
    int indexB = -1 ;
    
    if (isFiltersInUse())
    {
      int index = getTableViewer().getTable().getSelectionIndex() ;
      
      TableItem tableItemA = getTableViewer().getTable().getItem(index) ;
      TableItem tableItemB = getTableViewer().getTable().getItem(index - 1) ;
      
      swapItems(tableItemA, tableItemB) ; 
      
      getTableViewer().getTable().select(index - 1) ;
      
      getPropertyChangeSupport().firePropertyChange(POSITION_PROPERTY, index, index - 1) ;
    }
    else
    {
      indexA = getTableViewer().getTable().getSelectionIndex();
      indexB = indexA - 1 ;
      
      swapItems(indexA, indexB) ;
      
      
      getTableViewer().getTable().select(indexB) ;
      
      getPropertyChangeSupport().firePropertyChange(POSITION_PROPERTY, indexA, indexB) ;
    }
  }
  
  @SuppressWarnings("unchecked")
  private void swapItems(TableItem tableItemA, TableItem tableItemB)
  {
    swapItems((T)tableItemA.getData(), (T)tableItemB.getData()) ;
  }
  
  private void swapItems(int indexA, int indexB)
  {
    swapItems(getItemAt(indexA), getItemAt(indexB), indexA, indexB) ;
  }
  
  protected TableViewer getTableViewer()
  {
    return (TableViewer)getStructuredViewer() ;
  }
}
