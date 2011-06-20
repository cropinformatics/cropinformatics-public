/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy.davenport@cropinformatics.com) under contract by
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
package org.cropinformatics.ui.wizards;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.list.SelectableListViewer;
import org.cropinformatics.ui.viewers.list.SelectableMutableListViewer;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractListWizardPage<T> extends AbstractViewerWizardPage<ListViewerConfiguration>
{
  private SelectableMutableListViewer<T> listViewer;
  
  private List<T> items;
  
  private List<T> selectedItems;

  private PropertyChangeListener selectionChangedListener;

  public AbstractListWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage,
      WizardPageConfiguration configuration)
  {
    this(pageName, title, description, titleImage, configuration, null, null) ;
  }
  
  public AbstractListWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, WizardPageConfiguration configuration, List<T> items)
  {
    this(pageName, title, description, titleImage, configuration, items, null);
  }

  public AbstractListWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, WizardPageConfiguration configuration, List<T> items, 
      List<T> selectedItems)
  {
    super(pageName, title, description, titleImage, configuration);
    
    initialise(items);
    setSelectedItems(selectedItems);
    updatePageComplete() ;
  }

  @Override
  protected void initialiseControl(Composite parent, ListViewerConfiguration listViewerConfiguration)
  {
    if (getWizard() != null && getWizard().getContainer() != null)
      listViewer = createListViewer(parent, listViewerConfiguration, items, getSelectedItems(), getWizard().getContainer()) ;
    else
      listViewer = createListViewer(parent, listViewerConfiguration, items, getSelectedItems(), null) ;
    
    listViewer.addPropertyChangeListener(selectionChangedListener) ;
    
    listViewer.initialise() ;
  }
  
  @Override
  protected void disposeControl()
  {
    if (listViewer != null)
    	listViewer.removePropertyChangeListener(selectionChangedListener) ;
    
	  super.disposeControl();
  }

  public final List<T> getItems()
  {
    if (listViewer != null)
    {
      return listViewer.getItems() ;
    }
    else
    {
      return items ;
    }
  }

  public void setItems(List<T> items)
  {
    if (items != null)
      this.items = items;
    else
      this.items = new LinkedList<T>();

    if (listViewer != null)
    {
      listViewer.setItems(this.items);
    }
    
    updatePageComplete();
  }
 
  public int getSelectedCount()
  {
    if (listViewer != null)
    {
      return listViewer.getSelectedCount();
    }
    else
    {
    	if (selectedItems != null)
    	{
    		return selectedItems.size();
    	}
    	else
    	{
    		return 0 ;
    	}
    }
  }

  public T getSelectedItem()
  {
    if (listViewer != null)
    {
      return listViewer.getSelectedItem();
    }
    else
    {
      return null;
    }
  }

  public void setSelectedItem(T selectedItem)
  {
    if (listViewer != null)
    {
      listViewer.setSelectedItem(selectedItem);
    }
    else
    {
      selectedItems = new LinkedList<T>() ;
      
      if (selectedItem != null)
      	selectedItems.add(selectedItem) ;
    }
    
    updatePageComplete();
  }

  public List<T> getSelectedItems()
  {
    if (listViewer != null)
    {
      return listViewer.getSelectedItems();
    }
    else
    {
      return selectedItems;
    }
  }

  public void setSelectedItems(List<T> selectedItems)
  {
    if (listViewer != null)
    {
      listViewer.setSelectedItems(selectedItems);
    }
    else
    {
      this.selectedItems = selectedItems ;
    }
    
    updatePageComplete();
  }
  
  public final void isAllSelected()
  {
    if (listViewer != null)
    {
      listViewer.isAllSelected() ;
    }
  }

  @Override
  public void performCancel()
  {
    if (listViewer != null)
      listViewer.performCancel() ;
  }
  
  protected void initialise(List<T> items)
  {
    selectionChangedListener = new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {  
        handleViewerPropertyChanged(event) ;
        
        // TODO perhaps should be handled as a new separate event
        getPropertyChangeSupport().firePropertyChange(event) ;
      }
    } ;

    setItems(items);
    
    this.selectedItems = new LinkedList<T>();
  } 

  public final ListViewerConfiguration getChildControlConfiguration(WizardPageConfiguration configuration)
  {
    return ConfigurationUtils.getChildListViewerControl(configuration) ;
  }

  protected void handleViewerPropertyChanged(PropertyChangeEvent event)
  {
  	if (SelectableListViewer.SELECTION_PROPERTY.equals(event.getPropertyName()) ||
        SelectableListViewer.SELECTION_CLEARED_PROPERTY.equals(event.getPropertyName()))
  		updatePageComplete();
  }
  
  protected void updatePageComplete()
  {
  	setPageComplete(getSelectedCount() > 0) ;
  }
  
  protected abstract SelectableMutableListViewer<T> createListViewer(
      Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> items, 
      List<T> selectedItems, IRunnableContext runnableContext);
  
  
  @Override
  protected final Component<ListViewerConfiguration> getComponent()
  {
    return getListViewer();
  }
  
  protected final SelectableMutableListViewer<T> getListViewer()
  {
    return listViewer ;
  }
}
