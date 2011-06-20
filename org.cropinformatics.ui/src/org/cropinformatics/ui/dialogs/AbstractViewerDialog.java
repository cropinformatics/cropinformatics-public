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
package org.cropinformatics.ui.dialogs;

import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.ViewerConfiguration;
import org.eclipse.swt.widgets.Shell;

/**
 * Base class for all dialogs 
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 */
public abstract class AbstractViewerDialog<C extends ViewerConfiguration> extends AbstractDialog<C>
{

  /**
   * Creates a list dialog using the default viewer properties.
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   */
  public AbstractViewerDialog(Shell parentShell, DialogConfiguration configuration, String title)
  {
    super(parentShell, configuration, title) ;
  }
  
  /**
   * Creates a list dialog using the default viewer properties.
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   */
  public AbstractViewerDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
  {
    super(parentShell, configuration, title, message) ;
  }
 
  /**
   * Gets the viewer properties
   * @return the viewer properties
   */
  protected final ViewerConfiguration getViewerConfiguration()
  {
    if (getConfiguration() != null && getConfiguration().getControl() instanceof ViewerConfiguration)
      return (ViewerConfiguration)getConfiguration().getControl() ;
    else
      return null ;
  }
}
