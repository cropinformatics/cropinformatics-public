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
package org.cropinformatics.ui.wizards;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.list.AdvancedListViewer;
import org.cropinformatics.ui.viewers.list.SelectableMutableListViewer;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractAdvancedListWizardPage<T> extends AbstractListWizardPage<T>
{
  public AbstractAdvancedListWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage,
      WizardPageConfiguration configuration)
  {
    this(pageName, title, description, titleImage, configuration, null, null) ;
  }
  
  public AbstractAdvancedListWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, WizardPageConfiguration configuration, List<T> items)
  {
    this(pageName, title, description, titleImage, configuration, items, null);
  }

  public AbstractAdvancedListWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, WizardPageConfiguration configuration, List<T> items, 
      List<T> selectedItems)
  {
    super(pageName, title, description, titleImage, configuration);
    
    initialise(items);
    setSelectedItems(selectedItems);
  }

  @Override
  public final int getSelectedCount()
  {
    if (getAdvancedListViewer() != null && isCheckSelectionInUse())
    {
      return getAdvancedListViewer().getCheckedCount();
    }
    else
    {
      return super.getSelectedCount();
    }
  }

  @Override
  public final T getSelectedItem()
  {
    if (getAdvancedListViewer() != null && isCheckSelectionInUse())
    {
      return getAdvancedListViewer().getCheckedItem();
    }
    else
    {
      return super.getSelectedItem();
    }
  }

  @Override
  public final void setSelectedItem(T checkedItem)
  {
    if (getAdvancedListViewer() != null && isCheckSelectionInUse())
    {
    	getAdvancedListViewer().setCheckedItem(checkedItem);
    	
    	updatePageComplete();
    }
    else
    {
    	super.setSelectedItem(checkedItem);
    }
  }

  @Override
  public final List<T> getSelectedItems()
  {
    if (getAdvancedListViewer() != null && isCheckSelectionInUse())
    {
      return getAdvancedListViewer().getCheckedItems();
    }
    else
    {
    	return super.getSelectedItems();
    }
  }

  @Override
  public final void setSelectedItems(List<T> checkedItems)
  {
    if (getAdvancedListViewer() != null && isCheckSelectionInUse())
    {
    	getAdvancedListViewer().setCheckedItems(checkedItems);
    }
    else
    {
    	super.setSelectedItems(checkedItems);
    }
  }

  public final boolean isCheckSelectionInUse()
  {
  	return ConfigurationUtils.isCheckSelectionInUse(ConfigurationUtils.getChildListViewerControl(getConfiguration())) ;
  }
  
  @Override
  protected void initialiseControl(Composite parent, ListViewerConfiguration listViewerConfiguration)
  {
  	super.initialiseControl(parent, listViewerConfiguration) ;
  	
  	if (getAdvancedListViewer() != null && isCheckSelectionInUse())
  	{
    	getAdvancedListViewer().setCheckedItems(getAdvancedListViewer().getSelectedItems());
    	
    	getAdvancedListViewer().setSelectedItem(null) ;
  	}
  }
  
  protected void handleViewerPropertyChanged(PropertyChangeEvent event)
  {
  	if (isCheckSelectionInUse() &&
  			(AdvancedListViewer.CHECKED_PROPERTY.equals(event.getPropertyName()) ||
  			AdvancedListViewer.CHECKED_ITEM_ADDED_PROPERTY.equals(event.getPropertyName()) ||
  			AdvancedListViewer.CHECKED_ITEM_REMOVED_PROPERTY.equals(event.getPropertyName())))
  		updatePageComplete();
  	else
  		super.handleViewerPropertyChanged(event) ;
  }
  
  protected final SelectableMutableListViewer<T> createListViewer(
      Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> items, 
      List<T> selectedItems, IRunnableContext runnableContext)
  {
  	return createAdvancedListViewer(parent, listViewerConfiguration, items, selectedItems, runnableContext) ;
  }
  
  protected abstract AdvancedListViewer<T> createAdvancedListViewer(
      Composite parent, ListViewerConfiguration listViewerConfiguration, List<T> items, 
      List<T> selectedItems, IRunnableContext runnableContext);
  
  protected AdvancedListViewer<T> getAdvancedListViewer()
  {
    return (AdvancedListViewer<T>)getListViewer() ;
  }
}
