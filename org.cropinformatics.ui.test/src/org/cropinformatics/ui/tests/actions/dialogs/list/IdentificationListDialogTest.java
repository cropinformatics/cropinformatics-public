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
package org.cropinformatics.ui.tests.actions.dialogs.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.Identification;
import org.cropinformatics.ui.actions.BaseWorkbenchWindowActionDelegate;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.dialogs.list.IdentificationSingleListTableDialog;
import org.cropinformatics.ui.tests.TestUtils;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;

public class IdentificationListDialogTest extends BaseWorkbenchWindowActionDelegate
{
  public IdentificationListDialogTest()
  {
  }

  public void run(IAction action)
  {
    List<Identification> identificationItems =  TestUtils.createRandomIdentificationItems() ;

    List<Identification> selectedItems = new LinkedList<Identification>() ;
    
    if (identificationItems.size() > 3)
      selectedItems.add(identificationItems.get(3)) ;
    if (identificationItems.size() > 5)
      selectedItems.add(identificationItems.get(5)) ;
    
    IdentificationSingleListTableDialog<Identification> identificationDialog = 
      new IdentificationSingleListTableDialog<Identification>(getWindow().getShell(), ConfigurationUtils.getDialogConfiguration(IdentificationListDialogTest.class.getName()), 
      		"Test Dialog", "this is a test", identificationItems, selectedItems) ;

    Iterator<Identification> iterator ;
    
    iterator = identificationDialog.getSelectedItems().iterator() ;
    
    System.out.println("Before") ;
    
    while (iterator.hasNext())
    {
      System.out.println(iterator.next()) ;
    }
    
    int code = identificationDialog.open();
    
    if (code == Window.OK)
    { 
      iterator = identificationDialog.getSelectedItems().iterator() ;
      
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