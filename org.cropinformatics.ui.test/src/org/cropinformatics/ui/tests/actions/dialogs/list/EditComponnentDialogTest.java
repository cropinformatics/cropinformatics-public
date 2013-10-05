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
package org.cropinformatics.ui.tests.actions.dialogs.list;

import org.cropinformatics.ui.actions.BaseWorkbenchWindowActionDelegate;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.dialogs.AbstractEditComponentDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public abstract class EditComponnentDialogTest<T> extends BaseWorkbenchWindowActionDelegate
{
  public EditComponnentDialogTest()
  {
  }

  public final void run(IAction action)
  {
    T value = createTestObject() ;
    
    AbstractEditComponentDialog<T> dialog = createEditComponentDialog(getWindow().getShell(), ConfigurationUtils.getDialogConfiguration(EditComponnentDialogTest.class.getName()), 
      		"Test Dialog", "this is a test", value) ;

    outputValue(value) ;
    
    int code = dialog.open();
    
    if (code == Window.OK)
    { 
      System.out.println("OK") ;
      
      outputValue(dialog.getValue()) ;
      compareValues(value, dialog.getValue(), false) ;
    }
    else
    {
      System.out.println("Cancelled") ;
    }
  }

	protected abstract AbstractEditComponentDialog<T> createEditComponentDialog(Shell shell,
      DialogConfiguration dialogConfiguration, String title, String message, T object) ;
	
	protected T createTestObject()
  {
	  return null;
  }

	protected void outputValue(T value)
  {
  }
	
	protected void compareValues(T before, T after, boolean test)
  {
	  System.out.print("Same value :" + org.apache.commons.lang3.ObjectUtils.equals(before, after)) ;
  }
}