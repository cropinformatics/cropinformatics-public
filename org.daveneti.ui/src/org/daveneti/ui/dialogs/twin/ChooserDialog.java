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
package org.daveneti.ui.dialogs.twin;

import java.util.LinkedList;
import java.util.List;

import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.TwinViewerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.daveneti.ui.dialogs.AbstractViewerDialog;
import org.daveneti.ui.viewers.list.ListViewerFilter;
import org.daveneti.ui.viewers.twin.BaseChooserViewer;
import org.daveneti.ui.viewers.twin.ChooserViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * Base class for all dialogs that use a {@link AbstractListViewer<T> list viewer} to display 
 * a list 
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 * @param <T> the type of objects in the list to be displayed 
 */
public class ChooserDialog<T> extends AbstractViewerDialog<TwinViewerConfiguration>
{
  private ChooserViewer<T> chooserViewer;
  
  private List<T> leftItems ;
  private List<T> rightItems ;
  
  private List<ListViewerFilter> rightFilters ;
  private List<ListViewerFilter> leftFilters ;
  
  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   */
  public ChooserDialog(Shell parentShell, DialogConfiguration configuration, String title)
  {
    this(parentShell, configuration, title, null, null, null) ;
  }
  
  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   */
  public ChooserDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
  {
    this(parentShell, configuration, title, message, null, null) ;
  }
  
  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   * @param leftItems the items on the left of the chooser
   */
  public ChooserDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<T> leftItems)
  {
    this(parentShell, configuration, title, message, leftItems, null) ;
  }

  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   * @param leftItems the items on the left of the chooser
   * @param rightItems the items on the right of the chooser
   */
  public ChooserDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<T> leftItems, 
      List<T> rightItems)
  {
    super(parentShell, configuration, title, message) ;
    
    initialise(leftItems, rightItems) ;
  }
  
  public final List<T> getLeftItems()
  {
    if (chooserViewer != null)
    {
      return chooserViewer.getLeftItems() ;
    }
    else
    {
      return leftItems ;
    }
  }

  public void setLeftItems(List<T> leftItems)
  {
    if (leftItems != null)
      this.leftItems = leftItems;
    else
      this.leftItems = new LinkedList<T>();

    if (chooserViewer != null)
    {
      chooserViewer.setLeftItems(this.leftItems);
    }
  }
  
  public final List<T> getRightItems()
  {
    if (chooserViewer != null)
    {
      return chooserViewer.getRightItems() ;
    }
    else
    {
      return rightItems ;
    }
  }

  public void setRightItems(List<T> rightItems)
  {
    if (rightItems != null)
      this.rightItems = rightItems;
    else
      this.rightItems = new LinkedList<T>();

    if (chooserViewer != null)
    {
      chooserViewer.setRightItems(this.rightItems);
    }
  }
 
  public void addLeftFilter(ListViewerFilter listViewerFilter)
  {
    leftFilters.add(listViewerFilter) ;
    
    if (chooserViewer != null)
    {
      chooserViewer.addLeftFilter(listViewerFilter) ;
    }
  }
  
  public void removeLeftFilter(ListViewerFilter listViewerFilter)
  {
    leftFilters.remove(listViewerFilter) ;
    
    if (chooserViewer != null)
    {
      chooserViewer.removeLeftFilter(listViewerFilter) ;
    }
  }
  
  public void addRightFilter(ListViewerFilter listViewerFilter)
  {
    rightFilters.add(listViewerFilter) ;
    
    if (chooserViewer != null)
    {
      chooserViewer.addRightFilter(listViewerFilter) ;
    }
  }
  
  public void removeRightFilter(ListViewerFilter listViewerFilter)
  {
    rightFilters.remove(listViewerFilter) ;
    
    if (chooserViewer != null)
    {
      chooserViewer.removeRightFilter(listViewerFilter) ;
    }
  }
  
  protected void initialise(List<T> leftItems, 
      List<T> rightItems)
  {
    leftFilters = new LinkedList<ListViewerFilter>() ;
    rightFilters = new LinkedList<ListViewerFilter>() ;
    
    setLeftItems(leftItems);
    setRightItems(rightItems);
  }
  
  @Override
  protected final void initialiseControl(Composite parent, TwinViewerConfiguration configuration)
  {
    chooserViewer = createChooserViewer(parent, configuration, leftItems, rightItems) ;
    
    chooserViewer.initialise() ;
    
    chooserViewer.setLeftFilters(leftFilters) ;
    chooserViewer.setRightFilters(rightFilters) ;
  }

  protected ChooserViewer<T> createChooserViewer(Composite parent, TwinViewerConfiguration configuration, 
  		List<T> leftItems, List<T> rightItems)
  {
  	return new BaseChooserViewer<T>(parent, configuration, leftItems, rightItems) ;
  }
  
  public final ChooserViewer<T> getChooserViewer()
  {
    return chooserViewer;
  }

	@Override
  protected final TwinViewerConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
  	return ConfigurationUtils.getChildTwinViewerControl(configuration) ;
  }
}
