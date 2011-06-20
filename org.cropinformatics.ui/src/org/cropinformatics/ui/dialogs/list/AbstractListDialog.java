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
package org.cropinformatics.ui.dialogs.list;

import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.dialogs.AbstractViewerDialog;
import org.cropinformatics.ui.viewers.list.AdvancedListViewer;
import org.cropinformatics.ui.viewers.list.ListViewerFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * Base class for all dialogs that use a {@link AbstractListViewer<T> list viewer} to display 
 * a list 
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 * @param <T> the type of objects in the list to be displayed 
 */
public abstract class AbstractListDialog<T> extends AbstractViewerDialog<ListViewerConfiguration>
{
  private List<T> items;
  
  private AdvancedListViewer<T> listViewer ;

  private List<ListViewerFilter> filters;
  
  private List<T> selectedItems ;
  
  private List<T> checkedItems ;
  
  /**
   * Creates a list dialog with the given viewer properties
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   */
  public AbstractListDialog(Shell parentShell, DialogConfiguration configuration, String title)
  {
    this(parentShell, configuration, title, null, null, null) ;
  }
  
  /**
   * Creates a list dialog with the given viewer properties
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   */
  public AbstractListDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
  {
    this(parentShell, configuration, title, message, null, null) ;
  }

  
  /**
   * Creates a list dialog with the given viewer properties
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   * @param items the initial items to be displayed
   */
  public AbstractListDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<T> items)
  {
    this(parentShell, configuration, title, message, items, null) ;
  }
  
  /**
   * Creates a list dialog with the given viewer properties and an initial selection. 
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   * @param selectedItems the initial selection
   * @param selectionViewerProperties the viewer properties for this dialog
   */
  public AbstractListDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<T> items, List<T> selectedItems)
  {
    super(parentShell, configuration, title, message) ;
    
    initialise() ;
    setItems(items) ;
    setSelectedItems(selectedItems) ;
  }
  
  /**
   * Gets the items displayed in the dialog
   * 
   * @return the items displayed in the dialog
   */
  public final List<T> getItems()
  {
    if (listViewer != null)
    {
      return listViewer.getItems() ;
    }
    else
    {
      return items ;
    }
  }
  
  /**
   * Sets the items displayed in the dialog
   * 
   * @param the items to be displayed in the dialog
   */
  public final void setItems(List<T> items)
  {
    if (items != null)
      this.items = items ;
    else
      this.items = new LinkedList<T>() ;
    
    if (listViewer != null)
    {
      listViewer.setItems(this.items) ;
    }
  }
  

  public void addFilter(ListViewerFilter listViewerFilter)
  {
    filters.add(listViewerFilter) ;
    
    if (listViewer != null)
    {
      listViewer.addFilter(listViewerFilter) ;
    }
  }
  
  public void removeFilter(ListViewerFilter listViewerFilter)
  {
    filters.remove(listViewerFilter) ;
    
    if (listViewer != null)
    {
      listViewer.removeFilter(listViewerFilter) ;
    }
  }
  
  
  /**
   * Gets the number of selected items in the dialog
   * 
   * @return the number of selected items in the dialog
   */
  public final int getSelectedCount()
  {
    if (listViewer != null)
    {
      return listViewer.getSelectedCount() ;
    }
    else
    {
      return 0 ;
    }
  }

  /**
   * Gets the selected item or the first selected item if 
   * more than item is selected
   * 
   * @return the selected item or the first selected item if 
   * more than item is selected
   */
  public final T getSelectedItem()
  {
    if (listViewer != null)
    {
      return listViewer.getSelectedItem() ;
    }
    else
    {
      if (selectedItems.size() > 0)
        return selectedItems.get(0) ;
      else
        return null ;
    }
  }
  
  /**
   * Sets the selected item clearing any previously selected
   * item(s) 
   * 
   * selectedItem the new selected item, or <code>null</code> if 
   * all elements are to be de-selected
   */
  public final void setSelectedItem(T selectedItem)
  {
    if (listViewer != null)
    {
      listViewer.setSelectedItem(selectedItem) ;
    }
    else
    {
      selectedItems.clear() ;
      if (selectedItem != null)
        selectedItems.add(selectedItem) ;
    }
  }
  
  /**
   * Gets the selected items
   * @return the selected items
   */
  public final List<T> getSelectedItems()
  {
    if (listViewer != null)
    {
      return listViewer.getSelectedItems() ;
    }
    else
    {
      return selectedItems ;
    }
  }
  
  /**
   * Sets the selected items clearing any previously selected
   * item(s) 
   * 
   * selectedItems the new selected items, or <code>null</code> if 
   * all elements are to be de-selected
   */
  public final void setSelectedItems(List<T> selectedItems)
  {
    if (listViewer != null)
    {
      listViewer.setSelectedItems(selectedItems) ;
    }
    else
    {
      this.selectedItems.clear() ;
      if (selectedItems != null)
        this.selectedItems.addAll(selectedItems) ;
    }
  }
  
  /**
   * Gets the number of checked items in the dialog
   * 
   * @return the number of checked items in the dialog
   */
  public final int getCheckedCount()
  {
    if (listViewer != null)
    {
      return listViewer.getCheckedCount() ;
    }
    else
    {
      return 0 ;
    }
  }

  /**
   * Gets the checked item or the first selected item if 
   * more than item is selected
   * 
   * @return the checked item or the first selected item if 
   * more than item is selected
   */
  public final T getCheckedItem()
  {
    if (listViewer != null)
    {
      return listViewer.getCheckedItem() ;
    }
    else
    {
      if (checkedItems.size() > 0)
        return checkedItems.get(0) ;
      else
        return null ;
    }
  }
  
  /**
   * Sets the checked item clearing any previously selected
   * item(s) 
   * 
   * checkedItem the new selected item, or <code>null</code> if 
   * all elements are to be de-selected
   */
  public final void setCheckedItem(T checkedItem)
  {
    if (listViewer != null)
    {
      listViewer.setCheckedItem(checkedItem) ;
    }
    else
    {
      checkedItems.clear() ;
      if (checkedItem != null)
        checkedItems.add(checkedItem) ;
    }
  }
  
  /**
   * Gets the selected items
   * @return the selected items
   */
  public final List<T> getCheckedItems()
  {
    if (listViewer != null)
    {
      return listViewer.getCheckedItems() ;
    }
    else
    {
      return checkedItems ;
    }
  }
  
  /**
   * Sets the checked items clearing any previously selected
   * item(s) 
   * 
   * checkedItems the new checked items, or <code>null</code> if 
   * all elements are to be de-selected
   */
  public final void setCheckedItems(List<T> checkedItems)
  {
    if (listViewer != null)
    {
      listViewer.setCheckedItems(checkedItems) ;
    }
    else
    {
      this.checkedItems.clear() ;
      if (checkedItems != null)
        this.checkedItems.addAll(checkedItems) ;
    }
  }
  
  /**
   * Gets the underlying list viewer used to display the list
   * @return the underlying list viewer used to display the list
   */
  protected final AdvancedListViewer<T> getListViewer()
  {
    return listViewer;
  }
  
  /**
   * Initialises the dialog. Override this method to provide additional initialision code,
   * Remember to call this method first in any overrided method. For example
   * 
   * <pre> protected void initialise(String title, List<T> items, configuration viewerProperties)
   * {
   *    super.initialise(title, items, viewerProperties) ;
   *    
   *    // do other initialisation
   * }</pre>
   * 
   * @param items the iniial items in the dialog
   * @param viewerProperties the view properties
   */
  protected void initialise()
  {
    filters = new LinkedList<ListViewerFilter>() ;
    
    selectedItems = new LinkedList<T>() ;
    checkedItems = new LinkedList<T>() ;
  }
  
  @Override
  protected final void initialiseControl(Composite parent, ListViewerConfiguration listViewerConfiguration)
  {
    listViewer = createListViewer(parent, listViewerConfiguration, items, selectedItems) ;
    
    listViewer.setCheckedItems(checkedItems) ;
    
    listViewer.initialise() ;
    
    listViewer.setFilters(filters) ;
  }
  
  @Override
  protected final ListViewerConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
  	return ConfigurationUtils.getChildListViewerControl(configuration) ;
  }

	/**
   * Creates the underlying list viewer to be used by the dialog. This method should not usually
   * be called by an sub-classes
   * 
   * @param parent the parent component to be used by the list viewer
   * @param items the initial elements in the list
   * @param listViewerConfiguration the viewer configuration
   * @return an {@link AbstractListViewer<T>} implementation that is used as the the underlying list viewer
   */
  protected abstract AdvancedListViewer<T> createListViewer(Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> items, List<T> selectedItems) ;
}
