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
package org.cropinformatics.ui.viewers.list;

import java.util.List;

public interface MutableListViewer<T> extends ListViewer<T>
{
  public static final String ITEM_ADDED_PROPERTY = "itemAdded";
  
  public static final String ITEM_REMOVED_PROPERTY = "itemRemoved";
  
  public static final String ITEMS_ADDED_PROPERTY = "itemsAdded";
  
  public static final String ITEMS_REMOVED_PROPERTY = "itemsRemoved";
  
  public static final String ITEMS_CLEARED_PROPERTY = "itemsCleared" ;
  
   /**
   * Sets the items to be displayed in the viewer
   * 
   * @param the items displayed in the viewer
   */
  public boolean setItems(List<T> items) ;
  
  public boolean addItem(T item) ;
  
  public boolean removeItem(T item) ;
  
  public boolean addItems(List<T> items) ;
  
  public boolean removeItems(List<T> items) ;
  
  public boolean removeAllItems() ;
  
  public boolean replaceItem(T oldItem, T newItem) ;
}
