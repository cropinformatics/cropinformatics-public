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
package org.cropinformatics.ui.dialogs.twin;

import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.Mapping;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.MappingViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.dialogs.AbstractViewerDialog;
import org.cropinformatics.ui.viewers.twin.BaseMappingViewer;
import org.cropinformatics.ui.viewers.twin.MappingViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;


public class MappingDialog<F, T> extends AbstractViewerDialog<MappingViewerConfiguration>
{
  private MappingViewer<F, T> mappingViewer;
  
  private List<F> fromItems ;
  private List<T> toItems ;
  private List<Mapping<F, T>> mappedItems ;
  
  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   */
  public MappingDialog(Shell parentShell, DialogConfiguration configuration, String title)
  {
    this(parentShell, configuration, title, null, null, null) ;
  }
  
  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   */
  public MappingDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
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
  public MappingDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<F> fromItems, List<T> toItems)
  {
    this(parentShell, configuration, title, message, fromItems, toItems, null) ;
  }

  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   * @param leftItems the items on the left of the chooser
   * @param rightItems the items on the right of the chooser
   */
  public MappingDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, List<F> fromItems, List<T> toItems, 
  		List<Mapping<F, T>> mappedItems)
  {
    super(parentShell, configuration, title, message) ;
    
    initialise(fromItems, toItems, mappedItems) ;
  }
  
  public final List<F> getFromItems()
  {
    if (mappingViewer != null)
    {
      return mappingViewer.getFromItems() ;
    }
    else
    {
      return fromItems ;
    }
  }

  public void setFromItems(List<F> fromItems)
  {
    if (fromItems != null)
      this.fromItems = fromItems;
    else
      this.fromItems = new LinkedList<F>();

    if (mappingViewer != null)
    {
      mappingViewer.setFromItems(this.fromItems);
    }
  }
  
  public final List<T> getToItems()
  {
    if (mappingViewer != null)
    {
      return mappingViewer.getToItems() ;
    }
    else
    {
      return toItems ;
    }
  }

  public void setToItems(List<T> toItems)
  {
    if (toItems != null)
      this.toItems = toItems;
    else
      this.toItems = new LinkedList<T>();

    if (mappingViewer != null)
    {
      mappingViewer.setToItems(this.toItems);
    }
  }
  
  public final List<Mapping<F, T>> getMappedItems()
  {
    if (mappingViewer != null)
    {
      return mappingViewer.getMappedItems() ;
    }
    else
    {
      return mappedItems ;
    }
  }

  public void setMappedItems(List<Mapping<F, T>> mappedItems)
  {
    if (mappedItems != null)
      this.mappedItems = mappedItems;
    else
      this.mappedItems = new LinkedList<Mapping<F, T>>();

    if (mappingViewer != null)
    {
      mappingViewer.setMappedItems(this.mappedItems);
    }
  }
 
  protected void initialise(List<F> fromItems, List<T> toItems, 
  		List<Mapping<F, T>> mappedItems)
  {
    setFromItems(fromItems);
    setToItems(toItems);
    setMappedItems(mappedItems);
  }
  
  @Override
  protected final void initialiseControl(Composite parent, MappingViewerConfiguration configuration)
  {
    mappingViewer = createMappingViewer(parent, configuration, fromItems, toItems, mappedItems) ;
    
    mappingViewer.initialise() ;
  }

  protected MappingViewer<F, T> createMappingViewer(Composite parent, MappingViewerConfiguration configuration, 
  		List<F> leftItems, List<T> rightItems, List<Mapping<F, T>> mappedItems)
  {
  	return new BaseMappingViewer<F, T>(parent, configuration, leftItems, rightItems, mappedItems) ;
  }
  
  public final MappingViewer<F, T> getMappingViewer()
  {
    return mappingViewer;
  }

	@Override
  protected final MappingViewerConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
  	return ConfigurationUtils.getChildMappingViewerControl(configuration) ;
  }
}
