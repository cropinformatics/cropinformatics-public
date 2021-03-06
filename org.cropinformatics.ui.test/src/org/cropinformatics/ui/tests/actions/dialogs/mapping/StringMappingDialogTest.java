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
package org.cropinformatics.ui.tests.actions.dialogs.mapping;

import java.util.Iterator;
import java.util.List;

import org.cropinformatics.common.Mapping;
import org.cropinformatics.ui.actions.BaseWorkbenchWindowActionDelegate;
import org.cropinformatics.ui.dialogs.twin.MappingDialog;
import org.cropinformatics.ui.tests.TestUtils;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate. The action proxy will
 * be created by the workbench and shown in the UI. When the user tries to use
 * the action, this delegate will be created and execution will be delegated to
 * it.
 * 
 * @see IWorkbenchWindowActionDelegate
 */
public class StringMappingDialogTest extends BaseWorkbenchWindowActionDelegate
{
  public StringMappingDialogTest()
  {
  }

  /**
   * The action has been activated. The argument of the method represents the
   * 'real' action sitting in the workbench UI.
   * 
   * @see IWorkbenchWindowActionDelegate#run
   */
  public void run(IAction action)
  {
    List<String> toItems =  TestUtils.createRandomStringItems() ;
    
    List<String> fromItems = TestUtils.createRandomStringItems() ;
    
    MappingDialog<String,String> dialog = 
      new MappingDialog<String,String>(getWindow().getShell(), null, 
          "String list", "this is a test", fromItems, toItems) ;

    Iterator<Mapping<String, String>> iterator ;
    
    iterator = dialog.getMappedItems().iterator() ;
    
    System.out.println("Before") ;
    
    while (iterator.hasNext())
    {
      System.out.println(iterator.next()) ;
    }
    
    int code = dialog.open();
    
    if (code == Window.OK)
    { 
      iterator = dialog.getMappedItems().iterator() ;
      
      System.out.println("After") ;
      
      while (iterator.hasNext())
      {
        System.out.println(iterator.next()) ;
      }
      
    }
    else
    {
      System.out.println("Cancelled") ;
    }
  }
}