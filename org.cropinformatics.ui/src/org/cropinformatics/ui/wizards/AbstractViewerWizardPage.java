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

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.eclipse.jface.resource.ImageDescriptor;

public abstract class AbstractViewerWizardPage<T extends ControlConfiguration> extends AbstractWizardPage<T>
{
  public AbstractViewerWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage,
      WizardPageConfiguration configuration)
  {
    super(pageName, title, description, titleImage, configuration);
  }
  
  @Override
  protected void disposeControl()
  {
    if (getComponent() != null)
    	getComponent().dispose() ;
  }

  protected abstract Component<T> getComponent() ;
}
