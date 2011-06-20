/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT)
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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

/**
 * Base class for workbench window action delegates 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 * @version $Id$
 *
 */
public abstract class BaseWorkbenchWindowActionDelegate extends Action implements IWorkbenchWindowActionDelegate, IWorkbenchAction
{
  private IWorkbenchWindow window ;
  
  public BaseWorkbenchWindowActionDelegate()
	{
  	this(PlatformUI.getWorkbench().getActiveWorkbenchWindow()) ;
	}
  
  public BaseWorkbenchWindowActionDelegate (IWorkbenchWindow window)
	{
		init(window);
	}
  
  public final void init(IWorkbenchWindow window)
  {
    this.window = window ;
  }

  @Override
  public final void dispose()
  {
    window = null ;
  }

	@Override
	public abstract void run(IAction action) ;
	
	@Override
	public final void run()
	{
		run(null) ;
	}

	@Override
  public void selectionChanged(IAction action, ISelection selection)
  {

	  
  }
	
  protected IWorkbenchWindow getWindow()
  {
    return window;
  }
}
