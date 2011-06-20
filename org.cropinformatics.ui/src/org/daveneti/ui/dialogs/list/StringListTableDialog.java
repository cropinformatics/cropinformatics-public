/*******************************************************************************
 * Copyright 2011 Guy Davenport
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

import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.viewers.list.AdvancedListViewer;
import org.daveneti.ui.viewers.list.StringListTableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class StringListTableDialog extends SingleListTableDialog<String>
{
	public StringListTableDialog(Shell parentShell,
      DialogConfiguration configuration, String title)
  {
	  super(parentShell, configuration, title);
  }
	
	public StringListTableDialog(Shell parentShell,
      DialogConfiguration configuration, String title, String message)
  {
	  super(parentShell, configuration, title, message);
  }
	
	public StringListTableDialog(Shell parentShell,
      DialogConfiguration configuration, String title, String message,
      List<String> items)
  {
	  super(parentShell, configuration, title, message, items);
  }
	
	public StringListTableDialog(Shell parentShell,
      DialogConfiguration configuration, String title, String message,
      List<String> items, List<String> selectedItems)
  {
	  super(parentShell, configuration, title, message, items, selectedItems);
  }

	@Override
  protected AdvancedListViewer<String> createListViewer(Composite parent,
      ListViewerConfiguration configuration, List<String> items,
      List<String> selectedItems)
  {
		StringListTableViewer listViewer = new StringListTableViewer(parent, configuration, items, selectedItems);
		
		return listViewer ;
  }
}
