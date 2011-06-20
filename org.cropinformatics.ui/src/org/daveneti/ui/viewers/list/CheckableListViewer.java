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

import java.util.List;

public interface CheckableListViewer<T extends Object> extends ListViewer<T>
{
  public static final String CHECKED_ITEM_ADDED_PROPERTY = "checkedItemAdded" ;

  public static final String CHECKED_ITEM_REMOVED_PROPERTY = "checkedItemRemoved" ;

  public static final String CHECKED_PROPERTY = "checked" ;
  
  /**
   * Gets the number of checked items in the viewer
   * 
   * @return the number of checked items in the viewer
   */
  public int getCheckedCount() ;
  
  /**
   * Gets the checked item or the first checked item if 
   * more than item is checked
   * 
   * @return the checked item or the first checked item if 
   * more than item is checked
   */
  public T getCheckedItem() ;
  
  /**
   * Gets the index of the checked item or the first checked item if 
   * more than item is checked
   * 
   * @return the index of the checked item or the first checked item if 
   * more than item is checked
   */
  public int getCheckedIndex() ;
  
  /**
   * Sets the checked item 
   * 
   * @param item the item to be checked
   * @return <code>true</code>  if the check is successful, <code>false</code> otherwise
   */
  public boolean setCheckedItem(T item) ;
  
  /**
   * Sets the checked item 
   * 
   * @param index the index of the items to be checked
   * @return <code>true</code>  if the check is successful, <code>false</code> otherwise
   */
  public boolean setCheckedItem(int index) ;

  /**
   * Gets the checked items
   * @return the checked items
   */
  public List<T> getCheckedItems() ;
  
  /**
   * Gets the indices of the checked items
   * @return the indices of the checked items
   */
  public int[] getCheckedIndices() ;
  
  /**
   * Sets the checked items
   * @param items the items to be checked
   * @return <code>true</code>  if the check is successful, <code>false</code> otherwise
   */
  public boolean setCheckedItems(List<T> items) ;
  
  /**
   * Sets the checked items
   * @param indices the indices of the items to be checked
   * @return <code>true</code>  if the check is successful, <code>false</code> otherwise
   */
  public boolean setCheckedItems(int[] indices) ;
}
  
