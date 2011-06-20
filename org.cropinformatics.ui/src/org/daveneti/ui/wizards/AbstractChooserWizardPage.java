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
package org.daveneti.ui.wizards;

import java.util.LinkedList;
import java.util.List;

import org.daveneti.ui.configuration.TwinViewerConfiguration;
import org.daveneti.ui.configuration.WizardPageConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.daveneti.ui.viewers.twin.BaseChooserViewer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractChooserWizardPage<T> extends AbstractWizardPage<TwinViewerConfiguration>
{
  private BaseChooserViewer<T> chooserViewer;
  
  private List<T> leftItems ;
  private List<T> rightItems ;
  
  public AbstractChooserWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage)
  {
    this(pageName, title, description, titleImage, null, null, null) ;
  }
  
  public AbstractChooserWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, List<T> leftItems)
  {
    this(pageName, title, description, titleImage, leftItems, null, null) ;
  }
  
  public AbstractChooserWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, List<T> leftItems, List<T> rightItems)
  {
    this(pageName, title, description, titleImage, leftItems, rightItems, null) ;
  }

  public AbstractChooserWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, List<T> leftItems, WizardPageConfiguration configuration)
  {
    this(pageName, title, description, titleImage, leftItems, null, configuration) ;
  }

  public AbstractChooserWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, List<T> leftItems, 
      List<T> rightItems, WizardPageConfiguration configuration)
  {
    super(pageName, title, description, titleImage, configuration);

    initialise(leftItems, rightItems);
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
  
  
  
	@Override
  protected TwinViewerConfiguration getChildControlConfiguration(
      WizardPageConfiguration configuration)
  {
	  return ConfigurationUtils.getChildTwinViewerControl(configuration);
  }

	@Override
  protected void initialiseControl(Composite parent,
      TwinViewerConfiguration controlConfiguration)
  {
    chooserViewer = createChooserViewer(parent, leftItems, rightItems, controlConfiguration);
    
    chooserViewer.initialise() ;
  }
 
  protected void initialise(List<T> leftItems, List<T> rightItems)
  {
    setLeftItems(leftItems);
    setRightItems(rightItems);
  }

  protected void handleViewerSelectionChanged()
  {

  }

  protected abstract BaseChooserViewer<T> createChooserViewer(Composite parent, List<T> leftItems, 
      List<T> rightItems, TwinViewerConfiguration viewerProperties);
  
  protected BaseChooserViewer<T> getChooserViewer()
  {
    return chooserViewer ;
  }

}
