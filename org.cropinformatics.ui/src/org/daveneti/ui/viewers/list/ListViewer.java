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

import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.viewers.ConfigurableViewer;

public interface ListViewer<T extends Object> extends ConfigurableViewer<ListViewerConfiguration>
{
  /**
   * Indicates that an item has changed position. The old value gives the old 
   * position and the new value the new position. To find the item that has
   * changed position please use {@link #getItems().get(newPosition)}
   */
  public static final String POSITION_PROPERTY = "position";
  
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

}
