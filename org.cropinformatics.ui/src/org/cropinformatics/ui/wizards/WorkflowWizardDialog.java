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
package org.cropinformatics.ui.wizards;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class WorkflowWizardDialog extends WizardDialog
{

	public WorkflowWizardDialog(Shell parentShell, AbstractWizard wizard)
  {
	  super(parentShell, wizard);
  }
	
	protected Control createDialogArea(Composite parent) 
	{
		SashForm form = new SashForm(parent,SWT.HORIZONTAL);
		form.setLayout(new FillLayout());
		
		Composite leftPane = new Composite(form,SWT.NONE);
		leftPane.setLayout(new FillLayout());
		
		new Label(leftPane,SWT.NONE).setText("Label in pane 1");
		
		@SuppressWarnings("unused")
    Composite rightPane = (Composite) super.createDialogArea(form);

		form.setWeights(new int[] {30,70});

		return form;
	}

}
