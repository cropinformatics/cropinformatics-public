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
package org.daveneti.ui.test.actions.dialogs.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.daveneti.ui.actions.BaseWorkbenchWindowActionDelegate;
import org.daveneti.ui.dialogs.list.StringListTableDialog;
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
public class StringListDialogTest extends BaseWorkbenchWindowActionDelegate
{
  public StringListDialogTest()
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
    List<String> items =  TestUtils.createRandomStringItems() ;

    List<String> selectedItems = new LinkedList<String>() ;
    
    if (items.size() > 3)
      selectedItems.add(items.get(3)) ;
    if (items.size() > 5)
      selectedItems.add(items.get(5)) ;

    StringListTableDialog dialog = 
      new StringListTableDialog(getWindow().getShell(), null, 
          "String list", "this is a test", items, selectedItems) ;

    Iterator<String> iterator ;
    
    iterator = dialog.getSelectedItems().iterator() ;
    
    System.out.println("Before") ;
    
    while (iterator.hasNext())
    {
      System.out.println(iterator.next()) ;
    }
    
    int code = dialog.open();
    
    if (code == Window.OK)
    { 
      iterator = dialog.getSelectedItems().iterator() ;
      
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