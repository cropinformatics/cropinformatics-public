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
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

public abstract class BaseTwinViewer<L extends Object, R extends Object> extends AbstractTwinViewer<L, R>
{
  public BaseTwinViewer(Composite parent,
      TwinViewerConfiguration configuration)
  {
    super(parent, configuration) ;
  }
  
  public BaseTwinViewer(Composite parent, TwinViewerConfiguration configuration, List<L> leftItems)
  {
    super (parent, configuration, leftItems) ;
  }
  
  public BaseTwinViewer(Composite parent, TwinViewerConfiguration configuration, List<L> leftItems, 
      List<R> rightItems)
  {
    super (parent, configuration, leftItems, rightItems) ;
  }

  @Override
  protected AdvancedListViewer<L> createLeftListViewer(
      Composite parent, ListViewerConfiguration configuration, List<L> leftItems)
  {
    return new LeftListViewer<L>(parent, configuration, leftItems) ;
  }
  
  @Override
  protected AdvancedListViewer<R> createRightListViewer(Composite parent, ListViewerConfiguration configuration, List<R> rightItems)
  {
    return new RightListViewer<R>(parent, configuration, rightItems) ;
  }

  protected String getFilterableLeftLabel(L element)
  {
    return LabelUtils.getLabel(element) ;
  }
  
  protected String getFilterableRightLabel(R element)
  {
    return LabelUtils.getLabel(element) ;
  }
  
  protected Point getInitialStructuredViewerSize()
  {
    return new Point(200, 150);
  }
  
  protected abstract ILabelProvider createLeftLabelProvider() ;
  
  protected abstract ILabelProvider createRightLabelProvider() ;

  protected class LeftListViewer<L2> extends SingleListTableViewer<L>
  {

    public LeftListViewer(Composite parent, ListViewerConfiguration configuration, List<L> items)
    {
      super(parent, configuration, items);
    }

    @Override
    protected ILabelProvider createLabelProvider()
    {
      return BaseTwinViewer.this.createLeftLabelProvider();
    }

    @Override
    protected String getFilterableLabel(L element)
    {
      return BaseTwinViewer.this.getFilterableLeftLabel(element);
    }

    @Override
    protected Point getInitialStructuredViewerSize()
    {
      return BaseTwinViewer.this.getInitialStructuredViewerSize();
    }
    
    @Override
    protected void updateButtons()
    {
      super.updateButtons() ;
      
      BaseTwinViewer.this.updateButtons();
    }
  }
  
  protected class RightListViewer<R2> extends SingleListTableViewer<R>
  {

    public RightListViewer(Composite parent, ListViewerConfiguration configuration, List<R> items)
    {
      super(parent, configuration, items);
    }

    @Override
    protected ILabelProvider createLabelProvider()
    {
      return BaseTwinViewer.this.createRightLabelProvider();
    }

    @Override
    protected String getFilterableLabel(R element)
    {
      return BaseTwinViewer.this.getFilterableRightLabel(element);
    }

    @Override
    protected Point getInitialStructuredViewerSize()
    {
      return BaseTwinViewer.this.getInitialStructuredViewerSize();
    }

    @Override
    protected void updateButtons()
    {
      super.updateButtons() ;
      
      BaseTwinViewer.this.updateButtons();
    }
  }
}
