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

import org.cropinformatics.common.Identification;
import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.dialogs.AbstractEditDialog;
import org.cropinformatics.ui.viewers.IdentificationLabelProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class IdentificationListTableViewer<T extends Identification> extends SingleListTableViewer<T>
{
  private static final String NAME_COLUMN = 
  	IdentificationListTableViewer.class.getName() + ".nameColumn";
  
  private static final String DESCRIPTION_COLUMN = 
  	IdentificationListTableViewer.class.getName() + ".descriptionColumn";
  
  private static final String[] COLUMN_PROPERTIES = new String[] {NAME_COLUMN, DESCRIPTION_COLUMN} ;
  
  
	public IdentificationListTableViewer(Composite parent, ListViewerConfiguration configuration)
  {
    super(parent, configuration) ;
  }
  
  public IdentificationListTableViewer(Composite parent, ListViewerConfiguration configuration, List<T> items)
  {
  	super(parent, configuration, items) ;
  }

  public IdentificationListTableViewer(Composite parent, ListViewerConfiguration configuration, List<T> items, List<T> selectedItems)
  {
  	super(parent, configuration, items, selectedItems) ;
  }
  
  @Override
  protected StructuredViewer createStructuredViewer(Composite parent)
  {
    TableViewer tableViewer ;
    Table table ;
    
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
      table = new Table (parent, createWidgetStyle() | SWT.CHECK);
    else
      table = new Table (parent, createWidgetStyle());
    
    table.setHeaderVisible (true);
    
    int nameWidth = (int)(getInitialStructuredViewerSize().x * 0.33) ;

    TableColumn column = new TableColumn (table, SWT.LEFT);
    column.setText (Activator.getDefault().getString(NAME_COLUMN));
    column.setWidth (nameWidth);

    column = new TableColumn (table, SWT.LEFT);
    column.setText (Activator.getDefault().getString(DESCRIPTION_COLUMN));
    column.setWidth (getInitialStructuredViewerSize().x - nameWidth);
    
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    {
      tableViewer = new CheckboxTableViewer(table) ;
    }
    else
    {
      tableViewer = new TableViewer(table) ;
    }

    table.setHeaderVisible(true);
    table.setLinesVisible(true);
    
    tableViewer.setColumnProperties(COLUMN_PROPERTIES) ;
    
    return tableViewer ;
  }
  
  @Override
  protected Point getInitialStructuredViewerSize()
  {
    return new Point(500, 300);
  }

  @Override
  protected ILabelProvider createLabelProvider()
  {
    return new IdentificationLabelProvider();
  }

  @Override
  protected String getFilterableLabel(T element)
  {
    if (element != null)
      return element.getName() ;
    else
      return null ;
  }

	@Override
  protected boolean canAddItem()
  {
	  // TODO Auto-generated method stub
	  return super.canAddItem();
  }

	@Override
  protected AbstractEditDialog<? extends ComponentConfiguration, T> createEditComponentDialog(
      Shell shell, DialogConfiguration dialogConfiguration, T value)
  {
	  // TODO Auto-generated method stub
	  return super.createEditComponentDialog(shell, dialogConfiguration, value);
  }
  
}
