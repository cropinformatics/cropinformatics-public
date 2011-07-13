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
package org.cropinformatics.ui.tests.actions.editors;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.actions.BaseWorkbenchWindowActionDelegate;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractEditorTest extends BaseWorkbenchWindowActionDelegate
{
  public final void run(IAction action)
  {
    try
    {
      PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
      		createEditorInput(), getEditorID()) ;
    }
    catch (Exception e)
    {
      e.printStackTrace(System.err);
      
      ErrorDialog.openError(getWindow().getShell(), Activator.getDefault().getString("_UI_OpenEditorError_label"),
      		Activator.getDefault().getString("_UI_OpenEditorError_label"), new Status(IStatus.ERROR,
          		Activator.PLUGIN_ID, 0, Activator.getDefault().getString("_UI_OpenEditorError_label"), e.getCause()));
    }
  }

  protected abstract IEditorInput createEditorInput() throws Exception ;

  protected abstract String getEditorID() ;
}
