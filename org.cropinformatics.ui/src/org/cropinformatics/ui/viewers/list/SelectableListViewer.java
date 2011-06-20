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
package org.cropinformatics.ui.viewers.list;

import java.util.List;

import org.eclipse.jface.viewers.ISelectionProvider;

public interface SelectableListViewer<T extends Object> extends ListViewer<T>, ISelectionProvider
{
  public static final String SELECTION_PROPERTY = "selection";
  
  public static final String SELECTION_CLEARED_PROPERTY = "selectionCleared" ;
  
  /**
   * Determines if the viewer has no items 
   * 
   * @return <code>true</code> if the viewer has no
   * items, <code>false</code> otherwise
   */
  public boolean isEmpty() ;
  
  /**
   * Gets the number of items in the viewer
   * 
   * @return the number of items in the viewer
   */
  public int getItemCount() ;
  
   /**
   * Gets the items displayed in the viewer
   * 
   * @return the items displayed in the viewer
   */
  public List<T> getItems() ;
 
  /**
   * Get if all items are selected
   * 
   * @return <code>true</code> if all items are selected, <code>false</code> otherwise
   */
  public boolean isAllSelected() ;

  /**
   * Gets the number of selected items in the viewer
   * 
   * @return the number of selected items in the viewer
   */
  public int getSelectedCount() ;
  
  /**
   * Gets the selected item or the first selected item if 
   * more than item is selected
   * 
   * @return the selected item or the first selected item if 
   * more than item is selected
   */
  public T getSelectedItem() ;
  
  /**
   * Gets the index of the selected item or the first selected item if 
   * more than item is selected
   * 
   * @return the selected item or the first selected item if 
   * more than item is selected
   */
  public int getSelectedIndex() ;
  
  /**
   * Sets the selected item
   * @param item the item to be selected
   * @return <code>true</code>  if the selection is successful, <code>false</code> otherwise
   */
  public boolean setSelectedItem(T item) ;
  
  /**
   * Sets the selected item
   * @param index the index of the item to be selected
   * @return <code>true</code>  if the selection is successful, <code>false</code> otherwise
   */
  public boolean setSelectedItem(int index) ;
  
  /**
   * Sets the indices of the selected items
   * @return the selected items
   */
  public int[] getSelectedIndices() ;

  /**
   * Gets the selected items
   * @return the selected items
   */
  public List<T> getSelectedItems() ;
  
  /**
   * Sets the selected items
   * @param the items to be selected
   * @return <code>true</code>  if the selection is successful, <code>false</code> otherwise
   */
  public boolean setSelectedItems(List<T> items) ;
  
  /**
   * Sets the selected items
   * @param indices the indices of the items to be selected
   * @return <code>true</code>  if the selection is successful, <code>false</code> otherwise
   */
  public boolean setSelectedItems(int[] indices) ;

}
