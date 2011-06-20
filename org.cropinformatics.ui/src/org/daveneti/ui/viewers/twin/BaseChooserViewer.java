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
package org.daveneti.ui.viewers.twin;

import java.util.List;

import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.TwinViewerConfiguration;
import org.daveneti.ui.utils.LabelUtils;
import org.daveneti.ui.viewers.list.AdvancedListViewer;
import org.daveneti.ui.viewers.list.SingleListTableViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

public class BaseChooserViewer<T> extends AbstractChooserViewer<T>
{

  public BaseChooserViewer(Composite parent,
      TwinViewerConfiguration configuration)
  {
    super(parent, configuration) ;
  }
  
  public BaseChooserViewer(Composite parent, TwinViewerConfiguration configuration, List<T> items)
  {
    super(parent, configuration, items) ;
  }

 
  public BaseChooserViewer(Composite parent, TwinViewerConfiguration configuration, List<T> items,
      List<T> selectedItems)
  {
    super(parent, configuration, items, selectedItems);
  }

  @Override
  protected AdvancedListViewer<T> createChooserListViewer(Composite parent,
      ListViewerConfiguration configuration, List<T> items)
  {
    return new ChooserListViewer<T>(parent, configuration, items) ;
  }
  
  protected ILabelProvider createLabelProvider()
  {
  	return new LabelProvider() ;
  }
  
  protected String getFilterableLabel(T element)
  {
    return LabelUtils.getLabel(element) ;
  }
  
  protected Point getInitialStructuredViewerSize()
  {
    return new Point(200, 150);
  }
  
  protected class ChooserListViewer<T2> extends SingleListTableViewer<T>
  {

    public ChooserListViewer(Composite parent, ListViewerConfiguration configuration, List<T> items)
    {
      super(parent, configuration, items);
    }

    @Override
    protected ILabelProvider createLabelProvider()
    {
      return BaseChooserViewer.this.createLabelProvider();
    }

    @Override
    protected String getFilterableLabel(T element)
    {
      return BaseChooserViewer.this.getFilterableLabel(element);
    }

    @Override
    protected Point getInitialStructuredViewerSize()
    {
      return BaseChooserViewer.this.getInitialStructuredViewerSize();
    }

    @Override
    protected void updateButtons()
    {
      super.updateButtons() ;
      
      BaseChooserViewer.this.updateButtons();
    }
  }
}
