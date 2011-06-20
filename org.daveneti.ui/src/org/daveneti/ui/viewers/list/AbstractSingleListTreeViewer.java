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

import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;

/**
 * List viewer that uses a TreeViewer to display the list
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 * @param <T> the type of the elements in the list
 */
public abstract class AbstractSingleListTreeViewer<T extends Object> extends AbstractSingleListStructuredViewer<T>
{
  public AbstractSingleListTreeViewer(Composite parent, ListViewerConfiguration configuration)
  {
    super(parent, configuration) ;
  }
  
  public AbstractSingleListTreeViewer(Composite parent, ListViewerConfiguration configuration, List<T> items)
  {
  	super(parent, configuration, items) ;
  }
  
  public AbstractSingleListTreeViewer(Composite parent, ListViewerConfiguration configuration, List<T> items, List<T> selectedItems)
  {
  	super(parent, configuration, items, selectedItems) ;
  }

  public boolean setSelectedItem(T selectedItem)
  {
    boolean success = setSelectedItemInternal(selectedItem) ;
    
    if (success && getTreeViewer() != null)
    {
    	getTreeViewer().getTree().deselectAll() ;
    	
      if (selectedItem != null)
      {
      	TreeItem item = findTreeItem(selectedItem) ;
      	
      	success = item != null ;
      	
      	if (success)
      		getTreeViewer().getTree().select(item) ;
      }

      updateButtons() ;
    }
    
    return success ;
  }

  private TreeItem findTreeItem(T selectedItem)
  {
	  // TODO Auto-generated method stub
	  return null;
  }

	public synchronized boolean setSelectedItems(List<T> selectedItems)
  {
    boolean success ;
    TreeItem item ;
    
    if (!ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()) && selectedItems != null && selectedItems.size() > 1)
    {
      success = setSelectedItem(selectedItems.get(0)) ;
    }
    else
    {
      if (getTreeViewer() != null)
      {
        success = setSelectedItemsInternal(selectedItems) ;
  
        if (success)
        {
          if (selectedItems != null && selectedItems.size() > 0)
          {
            Iterator<T> iterator = selectedItems.iterator() ;
            
            T selectedItem ;
            
            TreeItem[] oldSelection = getTreeViewer().getTree().getSelection() ;
            
            getTreeViewer().getTree().deselectAll() ;
            
            while (success && iterator.hasNext())
            {
            	selectedItem = iterator.next() ;
            	
            	item = findTreeItem(selectedItem) ;
            	
            	success = item != null ;
            	
            	if (success)
            		getTreeViewer().getTree().select(item) ;
            }

            if (!success)
            {
            	getTreeViewer().getTree().deselectAll() ;
            	
            	if (oldSelection != null)
            	{
            		for (int i = 0 ; i < oldSelection.length ; ++i)
            			getTreeViewer().getTree().select(oldSelection[i]) ;
            	}
            }
          }
          else
          {
          	getTreeViewer().getTree().deselectAll() ;
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
      if (getTreeViewer() != null && getTreeViewer() instanceof ICheckable)
      {
        T oldItem = getCheckedItem() ; 
  
        success = setCheckedItemInternal(checkedItem) ;
  
        if (success && getCheckedItem() != oldItem)
        {
          if (oldItem != null)
            ((ICheckable)getTreeViewer()).setChecked(oldItem, false) ;
  
          if (checkedItem != null)
            success = ((ICheckable)getTreeViewer()).setChecked(getCheckedItem(), true) ;
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
        if (getTreeViewer() != null && getTreeViewer() instanceof ICheckable)
        { 
          Iterator<T> iterator = getCheckedItems().iterator() ;
    
          while (iterator.hasNext())
          {
            ((ICheckable)getTreeViewer()).setChecked(iterator.next(), false) ;
          }
    
          if (checkedItems != null)
          {
            success = setCheckedItemsInternal(checkedItems) ;
      
            if (success)
            {
              iterator = getCheckedItems().iterator() ;
        
              while (iterator.hasNext())
              {
                ((ICheckable)getTreeViewer()).setChecked(iterator.next(), true) ;
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
  
  @Override
  protected void initialiseStructuredViewer(StructuredViewer structuredViewer)
  {
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
    
    getTreeViewer().getTree().setLayoutData(gridData) ;
    
    getTreeViewer().setCellModifier(createCellModifier());
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

      // TODO standard selection for tree viewer
      //getTreeViewer().getTable().select(indices) ;
    }
  }
  
  @Override
  protected void initialiseChecked()
  { 
    List<T> checkedItems = getCheckedItems() ;

    if (checkedItems != null && checkedItems.size() > 0 && getTreeViewer() 
    		instanceof ICheckable && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    { 
      checkedItems.retainAll(getItems()) ;
      
      Iterator<T> iterator = checkedItems.iterator() ;

      while (iterator.hasNext())
      {
        ((ICheckable)getTreeViewer()).setChecked(iterator.next(), true) ;
      }
    }
  }

  @Override
  protected StructuredViewer createStructuredViewer(Composite parent)
  { 
    TreeViewer treeViewer ;
    
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    	treeViewer = new CheckboxTreeViewer (parent, createWidgetStyle()) ;
    else
    	treeViewer = new TreeViewer (parent, createWidgetStyle()) ;
    
    treeViewer.setColumnProperties(new String[] {"Name"}) ;
    
    return treeViewer ; 
  }

  protected void deselectAll()
  {
    getTreeViewer().getTree().deselectAll() ;
    
    deselectAllInternal() ;
    
    updateButtons() ;
  }
  
  @SuppressWarnings("deprecation")
  protected void checkAll()
  {
    if (getTreeViewer() instanceof CheckboxTreeViewer && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    { 
      ((CheckboxTreeViewer)getTreeViewer()).setAllChecked(true) ;
    }

    checkAllInternal() ;
    
    updateButtons() ;
  }
  
  @SuppressWarnings("deprecation")
  protected void decheckAll()
  {
    if (getTreeViewer() instanceof CheckboxTreeViewer && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    { 
      ((CheckboxTreeViewer)getTreeViewer()).setAllChecked(false) ;
    }

    decheckAllInternal() ;
    
    updateButtons() ;
  }
  
  protected void handleDown()
  {
    // TODO if possible 
  }

  protected void handleUp()
  {
    // TODO if possible 
  }

  protected TreeViewer getTreeViewer()
  {
    return (TreeViewer)getStructuredViewer() ;
  }
  
  protected final IContentProvider createContentProvider()
  {
    return createTreeContentProvider() ;
  }

  protected abstract ITreeContentProvider createTreeContentProvider() ;
}
