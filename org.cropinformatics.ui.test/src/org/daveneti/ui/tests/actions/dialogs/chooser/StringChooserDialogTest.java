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
package org.daveneti.ui.tests.actions.dialogs.chooser;

import java.util.Iterator;
import java.util.List;

import org.cropinformatics.ui.actions.BaseWorkbenchWindowActionDelegate;
import org.cropinformatics.ui.dialogs.twin.ChooserDialog;
import org.daveneti.ui.test.TestUtils;
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
public class StringChooserDialogTest extends BaseWorkbenchWindowActionDelegate
{
  public StringChooserDialogTest()
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
    List<String> leftIdentifierItems =  TestUtils.createRandomStringItems() ;
    List<String> rightIdentifierItems =  TestUtils.createRandomStringItems() ;
    
    //SimpleIdentifierListDialog<SimpleIdentifier> simpleIdentifierDialog = //new SimpleIdentifierListDialog<SimpleIdentifier>(getWindow().getShell(), "Modified simple identifier selection", leftIdentifierItems) ;
    ChooserDialog<String> simpleIdentifierDialog = 
      new ChooserDialog<String>(getWindow().getShell(), null, "Test Dialog", "test for simple identifier selection", 
          leftIdentifierItems, rightIdentifierItems) ;

    Iterator<String> iterator ;
    
    iterator = simpleIdentifierDialog.getLeftItems().iterator() ;
    //iterator = simpleIdentifierDialog.getItems().iterator() ;
    
    System.out.println("Before Left") ;
    
    while (iterator.hasNext())
    {
      System.out.println(iterator.next()) ;
    }
    
    iterator = simpleIdentifierDialog.getRightItems().iterator() ;
    
    System.out.println("Before Left") ;
    
    while (iterator.hasNext())
    {
      System.out.println(iterator.next()) ;
    }
    
    int code = simpleIdentifierDialog.open();
    
    if (code == Window.OK)
    { 
      iterator = simpleIdentifierDialog.getLeftItems().iterator() ;
      
    //   iterator = simpleIdentifierDialog.getItems().iterator() ;
      System.out.println("After Left") ;
      
      while (iterator.hasNext())
      {
        System.out.println(iterator.next()) ;
      }
      
      iterator = simpleIdentifierDialog.getRightItems().iterator() ;
      
      System.out.println("After Left") ;
      
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