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
package org.cropinformatics.ui.tests.actions.components;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.dialogs.AbstractDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class BasicComponentsDialog extends AbstractDialog<ContainerConfiguration>
{
  private BasicComponentsContainer basicComponentsContainer;

  public BasicComponentsDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
  {
    super(parentShell, configuration, title, message);
  }

  @Override
  protected void initialiseControl(Composite parent,
      ContainerConfiguration controlConfiguration)
  {
    basicComponentsContainer = new BasicComponentsContainer(parent, controlConfiguration) ;
    
    basicComponentsContainer.initialise() ;
    
    basicComponentsContainer.addPropertyChangeListener(new PropertyChangeListener()
    {

      public void propertyChange(PropertyChangeEvent event)
      {
        System.out.println(event) ;
      }
      
    }) ;
  }

	@Override
  protected ContainerConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
	  return ConfigurationUtils.getChildContainerControl(configuration);
  }

}
