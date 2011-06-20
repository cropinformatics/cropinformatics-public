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
package org.daveneti.ui.viewers.list;

import java.util.List;

import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.dialogs.AbstractEditDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class StringListTableViewer extends SingleListTableViewer<String>
{
	public StringListTableViewer(Composite parent,
      ListViewerConfiguration configuration)
  {
	  super(parent, configuration);
  }

	public StringListTableViewer(Composite parent,
      ListViewerConfiguration configuration, List<String> items)
  {
	  super(parent, configuration, items);
  }
	
	public StringListTableViewer(Composite parent,
      ListViewerConfiguration configuration, List<String> items,
      List<String> selectedItems)
  {
	  super(parent, configuration, items, selectedItems);
  }

	@Override
  protected boolean canAddItem()
  {
	  return true ;
  }

	@Override
  protected AbstractEditDialog<? extends ComponentConfiguration, String> createEditComponentDialog(
      Shell shell, DialogConfiguration dialogConfiguration, String value)
  {
	  return super.createEditComponentDialog(shell, dialogConfiguration, value);
  }

}
