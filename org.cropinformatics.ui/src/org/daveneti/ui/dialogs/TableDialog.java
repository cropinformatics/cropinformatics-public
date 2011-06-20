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
package org.daveneti.ui.dialogs;

import org.daveneti.ui.components.impl.TableViewerComponent;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class TableDialog extends AbstractDialog<ControlConfiguration>
{
	private TableViewerComponent tableViewerComponent;
	private Object[] columnHeaders ;
	private Object[][] tableData;

	public TableDialog(Shell parentShell, DialogConfiguration configuration,
      String title)
  {
	  super(parentShell, configuration, title);
  }

	public TableDialog(Shell parentShell, DialogConfiguration configuration,
      String title, String message)
  {
	  super(parentShell, configuration, title, message);
  }
	
	public TableDialog(Shell shell, DialogConfiguration configuration,
      String title, Object[] columnHeaders,
      Object[][] tableData)
  {
	  super(shell, configuration, title) ;
	  
		setTable(columnHeaders, tableData) ;
  }

	public TableDialog(Shell shell, DialogConfiguration configuration,
      String title, String message, Object[] columnHeaders,
      Object[][] tableData)
  {
	  super(shell, configuration, title, message);
	  
		setTable(columnHeaders, tableData) ;
  }

	public final Object[][] getTableData()
  {
		if (tableViewerComponent != null)
			return tableViewerComponent.getTableData() ;
		else
			return tableData;
  }
	
	public final Object[] getColumnHeaders()
  {
		if (tableViewerComponent != null)
			return tableViewerComponent.getColumnHeaders() ;
		else
			return columnHeaders;
  }

	public final void setTable(Object[] columnHeaders, Object[][] tableData)
  {
		if (tableViewerComponent != null)
		{
			tableViewerComponent.setTable(columnHeaders, tableData) ;
		}
		else
		{
	  	this.columnHeaders = columnHeaders;
	  	this.tableData = tableData;
		}
  }

	@Override
  protected ControlConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
	  return ConfigurationUtils.getChildControl(configuration);
  }

	@Override
  protected void initialiseControl(Composite parent,
      ControlConfiguration controlConfiguration)
  {
		tableViewerComponent = new TableViewerComponent(parent, controlConfiguration) ;
		
		tableViewerComponent.setTable(columnHeaders, tableData) ;
  }
}
