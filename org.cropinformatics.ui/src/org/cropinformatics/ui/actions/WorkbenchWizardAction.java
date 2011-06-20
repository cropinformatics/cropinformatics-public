/*******************************************************************************
 * Copyright 2011 Guy Davenport
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
package org.cropinformatics.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWizard;

public abstract class WorkbenchWizardAction extends BaseWorkbenchWindowActionDelegate
{
	@Override
  public final void run(IAction action)
  {
		IWorkbenchWizard wizard = createWorkbenchWizard() ;
	  
    ISelection selection = getWindow().getSelectionService().getSelection();

    if (selection instanceof IStructuredSelection)
    	wizard.init(getWindow().getWorkbench(), (IStructuredSelection)selection) ;
    else
    	wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY) ;
    
		WizardDialog dialog = new WizardDialog(getWindow().getShell(), wizard) ;
		
		dialog.open();
  }
  
	protected abstract IWorkbenchWizard createWorkbenchWizard() ;
}