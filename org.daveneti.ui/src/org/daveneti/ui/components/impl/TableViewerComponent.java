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
package org.daveneti.ui.components.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.daveneti.ui.viewers.ArrayLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;

public class TableViewerComponent extends ViewerComponent<ControlConfiguration, TableViewer>
{
	// TODO load form preferences
	private static final int MIM_COLUMN_SIZE = 60;

	private List<TableColumn> tableColumns;
	private int columnCount ;
	private Object[] columnHeaders ;
	private Object[][] tableData ;

	public TableViewerComponent(Composite parent, ControlConfiguration configuration)
	{
		super(parent, configuration);
	}

	public final Object[][] getTableData()
  {
  	return tableData;
  }
	
	public final Object[] getColumnHeaders()
  {
  	return columnHeaders;
  }
	
	public final void setTable(Object[] columnHeaders, Object[][] tableData)
	{
		this.columnHeaders = columnHeaders ;
		this.tableData = tableData ;
		
		if (getViewer() != null)
			updateTableViewer() ;
	}

	@Override
	protected ControlConfiguration getDefaultConfiguration()
	{
		return ConfigurationUtils.getControlConfiguration(this) ;
	}

	@Override
	protected TableViewer createDefaultViewer(Composite parent)
	{
		TableViewer tableViewer = new TableViewer(parent, SWT.NONE);

		tableViewer.setContentProvider(new ArrayContentProvider()) ;
		tableViewer.setLabelProvider(new ArrayLabelProvider()) ;
		tableViewer.getTable().setHeaderVisible(true);

		tableViewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true)) ;
		ConfigurationUtils.configureControl(tableViewer.getTable(), getConfiguration()) ;
		tableViewer.getTable().setEnabled(isEnabled()) ;

		updateTableViewer() ;

		return tableViewer ;
	}

	private void updateTableViewer()
	{
		if (tableColumns == null)
			tableColumns = new LinkedList<TableColumn>() ;
		
		if (tableData != null && columnHeaders != null && 
				tableData.length > 0 && columnHeaders.length > 0)
		{
			// create new columns
			if (columnCount < columnHeaders.length)
			{
				for (int i = columnCount ; i < columnHeaders.length; ++i)
				{
					tableColumns.add(new TableColumn(getViewer().getTable(), SWT.NONE)) ;
				}
			}
			else
			{
				// remove columns
				if (columnCount > columnHeaders.length)
				{    
					for (int i = columnCount ; i > columnHeaders.length ; --i)
					{
						TableColumn tableColumn = tableColumns.remove(i - 1) ;

						if (tableColumn != null)
							tableColumn.dispose() ;
					}
				}
			}

			Iterator<TableColumn> iterator = tableColumns.iterator() ;
			TableColumn tableColumn ;

			int i = 0 ;

			while (iterator.hasNext())
			{
				tableColumn = iterator.next() ;

				tableColumn.setText(columnHeaders[i].toString()) ;

				tableColumn.setWidth(guessColumnWidth(columnHeaders[i].toString())) ;
				++i ;
			}

			columnCount = tableColumns.size();

			getViewer().setInput(tableData) ;
		}
		else
		{
      Iterator<TableColumn> iterator = tableColumns.iterator() ;
      
      while (iterator.hasNext())
        iterator.next().dispose() ;
      
      tableColumns.clear() ;
      
      if (getViewer() != null)
      	getViewer().setInput(null) ;
		}
	}

	private int guessColumnWidth(String columnHeader)
	{
		int size = 0 ;

		if (columnHeader != null && columnHeader.length() > 0)
			size = (columnHeader.length() * 10) + 10 ;

		if (size < MIM_COLUMN_SIZE)
			size = MIM_COLUMN_SIZE ;

		return size ;
	}
}
