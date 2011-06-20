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
package org.cropinformatics.ui.viewers.list;

import java.util.List;

import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

/**
 * Super-class for all viewers that use a StructuredViewer to display the list
 * 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 * @version $Id$
 * @see StructuredViewer
 * 
 * @param <T> the type of the elements in the list
 */
public class ListComboViewer<T extends Object> extends AbstractSingleListStructuredViewer<T> implements SelectableListViewer<T>
{
	private ComboViewer comboViewer ;
	
	public ListComboViewer(Composite parent,
			ListViewerConfiguration configuration, List<T> items,
			T selectedItem)
	{
		super(parent, configuration, items);

		setSelectedItem(selectedItem) ;
	}

	public ListComboViewer(Composite parent,
			ListViewerConfiguration configuration, List<T> items)
	{
		super(parent, configuration, items);
	}

	public ListComboViewer(Composite parent, ListViewerConfiguration configuration)
	{
		super(parent, configuration);
	}

	@Override
	public boolean setSelectedItem(T selectedItem)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setSelectedItems(List<T> selectedItems)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setCheckedItem(T checkedItem)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setCheckedItems(List<T> checkedItems)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void initialiseSelection()
	{
		List<T> selectedItems = getSelectedItems() ;

		if (selectedItems != null && selectedItems.size() > 0)
		{
			selectedItems.retainAll(getItems()) ;

			int index = -1 ;

			if (selectedItems.size() > 0)
			{
				index = getItems().indexOf(selectedItems.get(0)) ;
			}

			getComboViewer().getCombo().select(index) ;
		}
	}

	@Override
	protected void initialiseChecked()
	{ 

	}

	@Override
	protected StructuredViewer createStructuredViewer(Composite parent)
	{ 
		ComboViewer comboViewer ;

		comboViewer = new ComboViewer (parent, createWidgetStyle()) ;

		return comboViewer ; 
	}

	@Override
	protected void initialiseStructuredViewer(StructuredViewer structuredViewer)
	{
		ControlConfiguration componentConfiguration = ConfigurationUtils.getChildControlConfiguration(getConfiguration(), STRUCTURED_VIEWER_CONPONENT_ID) ;

		if (componentConfiguration != null && componentConfiguration.getLayoutData() != null)
			ConfigurationUtils.configureComponent(getComboViewer().getCombo(), componentConfiguration) ;
		else
			getComboViewer().getCombo().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	private ComboViewer getComboViewer()
  {
	  return comboViewer;
  }
}
