/*******************************************************************************
 * Copyright 2010 Guy Davenport
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
package org.daveneti.ui.dialogs.list;

import java.util.List;

import org.daveneti.common.Identification;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.viewers.list.AdvancedListViewer;
import org.daveneti.ui.viewers.list.IdentificationListTableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class IdentificationSingleListTableDialog<T extends Identification> extends AbstractListDialog<T>
{

  /**
   * Creates a list dialog with the given viewer properties
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   */
  public IdentificationSingleListTableDialog(Shell parentShell, DialogConfiguration configuration, String title)
  {
  	super(parentShell, configuration, title) ;
  }
  
  /**
   * Creates a list dialog with the given viewer properties
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   */
  public IdentificationSingleListTableDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
  {
  	super(parentShell, configuration, title, message) ;
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
  public IdentificationSingleListTableDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<T> items)
  {
  	super(parentShell, configuration, title, message, items, null) ;
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
  public IdentificationSingleListTableDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<T> items, List<T> selectedItems)
  {
  	super(parentShell, configuration, title, message, items, selectedItems) ;
  }

	@Override
  protected AdvancedListViewer<T> createListViewer(Composite parent,
      ListViewerConfiguration configuration,
      List<T> items, List<T> selectedItems)
  {
		IdentificationListTableViewer<T> listViewer = new IdentificationListTableViewer<T>(parent, configuration, items, selectedItems);
		
		return listViewer ;
  }

}
