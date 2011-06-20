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
package org.daveneti.ui.editors;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.part.EditorActionBarContributor;

public class AbstractEditorActionBarContributor extends EditorActionBarContributor
{
  /**
   * Contributes to the given context menu.
   * <p>
   * The <code>AbstractEditorActionBarContributor</code> implementation of this method
   * does nothing. Subclasses may re-implement to add to the context portion of
   * this contribution. There can only be contributions from a context menu.
   * </p>
   *
   * @param manager the manager that controls the context menu.
   */
  public void contributeToContextMenu(IMenuManager manager) 
  {
    
  }
}
