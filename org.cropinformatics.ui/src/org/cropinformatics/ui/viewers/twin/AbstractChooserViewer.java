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
package org.cropinformatics.ui.viewers.twin;

import java.beans.PropertyChangeEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.cropinformatics.ui.viewers.list.AdvancedListViewer;
import org.cropinformatics.ui.viewers.list.ListViewer;
import org.cropinformatics.ui.viewers.list.ListViewerFilter;
import org.cropinformatics.ui.viewers.list.SelectableListViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractChooserViewer<T> extends AbstractTwinViewer<T, T> implements ChooserViewer<T>
{
  private List<T> items ;
  
  public AbstractChooserViewer(Composite parent, TwinViewerConfiguration configuration)
  {
    super(parent, configuration);
  }
  
  public AbstractChooserViewer(Composite parent, TwinViewerConfiguration configuration, List<T> items)
  {
    super(parent, configuration, items) ;
  }
  
  public AbstractChooserViewer(Composite parent, TwinViewerConfiguration configuration, List<T> items,
      List<T> selectedItems)
  {
    super(parent, configuration, items, selectedItems);
  }

  @Override
  public boolean setLeftItems(List<T> leftItems)
  {
    if (items == null)
      items = new LinkedList<T>() ;
    
    boolean success = super.setLeftItems(leftItems) ;
    
    if (success && leftItems != null)
      items.addAll(leftItems) ;
    
    return success ;
  }
  
  @Override
  public boolean setRightItems(List<T> rightItems)
  {
    if (items == null)
      items = new LinkedList<T>() ;
    
    boolean success = super.setRightItems(rightItems) ;
    
    if (success && rightItems != null)
      items.addAll(rightItems) ;
     
    return success ;
  }
  
  public final boolean isEmpty()
  {
    if (getItems() != null)
      return getItems().isEmpty() ;
    else
      return false ;
  }
  
  public final int getItemCount()
  {
    if (getItems() != null)
      return getItems().size() ;
    else
      return 0 ;
  }

  public List<T> getItems()
  {
    return items ;
  }
  
  public int getSelectedCount()
  {
    return this.getRightItems().size() ;
  }

  public T getSelectedItem()
  {
    if (getRightItems().isEmpty())
      return null ;
    else
      return getRightItems().get(0);
  }
  
  public final int getSelectedIndex()
  {
    if (items != null && getSelectedItem() != null)
      return items.indexOf(getSelectedItem()) ;
    else
      return -1 ;
  }

  public List<T> getSelectedItems()
  {
    return getRightItems() ;
  }
  
  public final int[] getSelectedIndices()
  {
    int[] selectedIndices ;
    
    if (items != null)
    {
      List<T> selectedItems  = getSelectedItems() ;
      
      if (selectedItems != null)
      {
        selectedIndices = new int[selectedItems.size()] ;
        Iterator<T> iterator = getSelectedItems().iterator() ;
        
        int i = 0 ;
        
        while (iterator.hasNext())
        {
          selectedIndices[i] = items.indexOf(iterator.next()) ;
          ++i ;
        }
        
      }
      else
      {
        selectedIndices = new int[0] ;
      }
    }
    else
    {
      selectedIndices = new int[0] ;
    }
    
    return selectedIndices ;
  }

  public boolean isAllSelected()
  {
    return getLeftListViewer().isAllSelected() ;
  }

  public boolean setItems(List<T> items)
  {
    this.items.clear() ;
    
    return setLeftItems(items) ;
  }
  
  public boolean addItem(T item)
  {
    boolean success = items.add(item) ;
    
    if (success)
      success = addLeftItem(item) ;
  
    return success ;
  }

  public boolean removeItem(T item)
  {
    boolean success = items.remove(item) ;
    
    if (success && getLeftItems().contains(item))
      success = removeLeftItem(item) ;
    
    if (success && getRightItems().contains(item))
      success = removeRightItem(item) ;
    
    return success ;
  }
  
  public boolean addItems(List<T> items)
  {
    boolean success = items.addAll(items) ;
    
    if (success)
      success = addLeftItems(items) ;
    
    return success ;
  }

  public boolean removeItems(List<T> items)
  {
    boolean success = items.removeAll(items) ;
    
    if (success)
      success = removeLeftItems(items) ;
    
    if (success)
      success = removeRightItems(items) ;
    
    return success ;
  }

  public boolean removeAllItems()
  {
    items.clear() ;
    
    return super.removeAllItems() ;
  }

  public boolean replaceItem(T oldItem, T newItem)
  {
    boolean success = true ;
    
    if (oldItem != newItem)
    {
      int index = items.lastIndexOf(oldItem) ;
      
      if (index >= 0)
      {
        success = items.set(index, newItem) != oldItem ;
      }
    
      if (success)
      {
        List<T> leftItems = getLeftItems() ;
        List<T> rightItems = getRightItems() ;
        
        if (leftItems.contains(oldItem))
        {
          success = getLeftListViewer().replaceItem(oldItem, newItem) ;
        }
        else
        {
          if (rightItems.contains(oldItem))
          {
            success = getRightListViewer().replaceItem(oldItem, newItem) ;
          }
          else
          {
            success = false ;
            // rollback
            items.set(index, oldItem) ;
          }
        }
      }
    }
    
    return success ;
  }
  
  public boolean setSelectedItem(T item)
  {
    boolean success = moveAllToLeft() ;
    
    if (success)
      success = moveToRight(item) ;
    
    return success ;
  }
  
  public boolean setSelectedItem(int index)
  {
    boolean success = false ;
    
    if (index >=0 && index < items.size())
    {
      success = setSelectedItem(items.get(index)) ;
    }
    
    return success ;
  }

  public boolean setSelectedItems(List<T> items)
  {
    boolean success = moveAllToLeft() ;
    
    if (success)
      success = moveToRight(items) ;
    
    return success ;
  }
  
  public boolean setSelectedItems(int[] indices)
  {
    if (indices != null && indices.length > 0)
    {
      if (!items.isEmpty())
      {
        List<T> selectedItems = new LinkedList<T>() ;
        
        for (int i = 0 ; i < indices.length ; ++i)
          if (indices[i] >=0 && indices[i] < items.size())
            selectedItems.add(items.get(indices[i])) ;
          
        return setSelectedItems(selectedItems) ;
      }
      else
      {
        return false ;
      }
    }
    
    return true ;
  }
  
  public boolean addFilter(ListViewerFilter filter)
  {
    return addLeftFilter(filter) ;
  }

  public List<T> getFilteredItems()
  {
    return getLeftFilteredItems() ;
  }

  public List<ListViewerFilter> getFilters()
  {
    return getLeftFilters() ;
  }

  public boolean removeFilter(ListViewerFilter filter)
  {
    return removeLeftFilter(filter) ;
  }

  public boolean setFilters(List<ListViewerFilter> filters)
  {
    return setLeftFilters(filters) ;
  }
  
  @Override
  protected boolean moveToRight(T item)
  {
    List<T> oldSelectedItems = new LinkedList<T>() ;
    oldSelectedItems.addAll(getSelectedItems()) ;
    
    boolean success = super.moveToRight(item) ;
    
    if (success)
      getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_PROPERTY, oldSelectedItems, getSelectedItems()) ;

    return success ;
  }
  
  @Override
  protected boolean moveToRight(List<T> items)
  {
    List<T> oldSelectedItems = new LinkedList<T>() ;
    oldSelectedItems.addAll(getSelectedItems()) ;
    
    boolean success = super.moveToRight(items) ;
    
    if (success)
      getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_PROPERTY, oldSelectedItems, getSelectedItems()) ;

    return success ;
  }

  @Override
  protected void handleToRightAll()
  {
    List<T> oldSelectedItems = new LinkedList<T>() ;
    oldSelectedItems.addAll(getSelectedItems()) ;
    
    super.handleToRightAll() ;
    
    getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_PROPERTY, oldSelectedItems, getSelectedItems()) ;
  }
  
  @Override
  protected boolean moveToLeft(T item)
  {
    List<T> oldSelectedItems = new LinkedList<T>() ;
    oldSelectedItems.addAll(getSelectedItems()) ;
    
    boolean success = super.moveToLeft(item) ;
    
    if (success)
      getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_PROPERTY, oldSelectedItems, getSelectedItems()) ;

    return success ;
  }
  
  @Override
  protected boolean moveToLeft(List<T> items)
  {
    List<T> oldSelectedItems = new LinkedList<T>() ;
    oldSelectedItems.addAll(getSelectedItems()) ;
    
    boolean success = super.moveToLeft(items) ;
    
    if (success)
      getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_PROPERTY, oldSelectedItems, getSelectedItems()) ;

    return success ;
  }
  
  @Override
  protected void handleToLeftAll()
  {
    super.handleToLeftAll() ;
    
    getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_CLEARED_PROPERTY, null, null) ;
  }
  
  @Override
  protected void handleRightListViewerPropertyChange(PropertyChangeEvent event)
  {
    super.handleRightListViewerPropertyChange(event);
    
    if (ListViewer.POSITION_PROPERTY.equals(event.getPropertyName()))
    {
      List<T> oldSelectedItems = new LinkedList<T>() ;
      oldSelectedItems.addAll(getSelectedItems()) ;
      
      int oldValueIndex = (Integer)event.getOldValue() ;
      int newValueIndex = (Integer)event.getNewValue() ;
      
      T newValue = oldSelectedItems.get(newValueIndex) ;
      T oldValue = oldSelectedItems.set(oldValueIndex, newValue) ;
      oldSelectedItems.set(newValueIndex, oldValue) ;
      
      getPropertyChangeSupport().firePropertyChange(SelectableListViewer.SELECTION_PROPERTY, oldSelectedItems, getSelectedItems()) ;
    }
  }

  @Override
  protected final T convertLeftItem(T item)
  {
    return item ;
  }

  @Override
  protected final List<T> convertLeftItems(List<T> items)
  {
    return items ;
  }
  
  @Override
  protected final T convertRightItem(T item)
  {
    return item ;
  }

  @Override
  protected final List<T> convertRightItems(List<T> items)
  {
    return items ;
  }
  
  protected IStructuredSelection createSelection()
  {
    return new StructuredSelection(getSelectedItems()) ;
  }

  @Override
  protected AdvancedListViewer<T> createLeftListViewer(Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> leftItems)
  {
    return createChooserListViewer(parent, listViewerConfiguration, leftItems) ;
  }

  @Override
  protected final AdvancedListViewer<T> createRightListViewer(Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> rightItems)
  {
    return createChooserListViewer(parent, listViewerConfiguration, rightItems) ;
  }
  
  protected abstract AdvancedListViewer<T> createChooserListViewer(Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> items) ;
}
