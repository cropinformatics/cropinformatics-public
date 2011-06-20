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
package org.cropinformatics.ui.views;

import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.ViewConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.AbstractViewer;
import org.cropinformatics.ui.viewers.list.SingleListTableViewer;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractListView<T> extends AbstractViewWithViewer<ListViewerConfiguration>
{
  private List<T> items;
  
  public AbstractListView()
  {

  }
  
  public final List<T> getItems()
  {
    return items ;
  }
  
  public final void setItems(List<T> items)
  {
    if (items != null)
      this.items = items ;
    else
      this.items = new LinkedList<T>() ;
    
    if (getListViewer() != null)
    {
      getListViewer().setItems(this.items) ;
    }
  }

  @SuppressWarnings("unchecked")
  public final SingleListTableViewer<T> getListViewer()
  {
    return (SingleListTableViewer<T>)getViewer();
  }

  @Override
  protected final ListViewerConfiguration getChildControlConfiguration(ViewConfiguration configuration)
  {
  	return ConfigurationUtils.getChildListViewerControl(configuration) ;
  }

	protected final AbstractViewer<ListViewerConfiguration> createViewer(Composite parent, ListViewerConfiguration configuration)
  {
    return createListViewer(parent, items, configuration) ;
  }
  
  protected abstract SingleListTableViewer<T> createListViewer(Composite parent, List<T> items,
      ListViewerConfiguration configuration) ;

}
