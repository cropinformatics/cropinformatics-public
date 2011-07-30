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
package org.cropinformatics.ui.viewers;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.impl.AbstractConfigurableContainer;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;

public abstract class AbstractViewer<T extends ViewerConfiguration> extends AbstractConfigurableContainer<T> implements ConfigurableViewer<T>
{
  private IRunnableContext runnableContext;

  public AbstractViewer(Composite parent, T configuration)
  {
    super(parent, configuration);
  }
  
  public void performCancel()
  {

  }

  public void fillContextMenu(IMenuManager manager)
  {
 
  }
  
  public final IRunnableContext getRunnableContext()
  {
    return runnableContext ;
  }

  public final void setRunnableContext(IRunnableContext runnableContext)
  {
    this.runnableContext = runnableContext;
  }

  public boolean isDeleteEnabled()
	{
		return false ;
	}
	
  public void delete()
  {

  }
  
  @SuppressWarnings({ "unchecked", "unused" })
  private T getChildViewerConfiguration(ContainerConfiguration containerConfiguration)
  {
    T childConfiguration = null ;
    
    try
    {
      childConfiguration = (T)ConfigurationUtils.getChildConfiguration(containerConfiguration, 0);
    }
    catch (Exception e)
    {

    }

    return childConfiguration;
  }

  protected void preInitialiseComponent()
  {
    if (!isInitialised())
    {
      createListeners() ;
      createActions() ;
    }
  }

  protected void postInitialiseComponent()
  {
  	super.postInitialiseComponent() ;
    if (!isInitialised())
    {
      addListeners() ;
      hookContextMenus() ;
    }
  }
  
  protected void hookContextMenus()
  {

  }
  
  /*
   * This method creates the pop menu when a user right-clicks on the viewer. 
   * This method calls the fillContextMenu which then actually
   * fills the menu
   */
  protected final void hookContextMenu(Control contextMenuParent, ISelectionProvider selectionProvider)
  {
    if (contextMenuParent != null)
    {
      // Create a new Menu of type Pop-up
      MenuManager menuMgr = new MenuManager("#PopupMenu");
      // Remove any previous information
      menuMgr.setRemoveAllWhenShown(true);

      menuMgr.addMenuListener(new IMenuListener()
      {
        // Just before the menu is displayed to the user call the fillContextMenu
        // Method
        public void menuAboutToShow(IMenuManager manager)
        {
          fillContextMenu(manager);
        }
      });
      Menu menu = menuMgr.createContextMenu(contextMenuParent);
      // set the menu and register it
      contextMenuParent.setMenu(menu);
    }
  }
  
  protected void createActions()
  {

  }
  
  protected void disposeActions()
  {

  }
  
  protected void createListeners()
  {

  }
  
  protected void addListeners()
  {

  }
  
  protected void removeListeners()
  {

  }
  
  protected void disposeListeners()
  {

  }

  protected void executeOperation(IUndoableOperation operation)
  {
    try
    {
      if (getUndoContext() != null)
      {
        getOperationHistory().execute(operation, null, null) ;
      }
      else
      {
        IStatus status = operation.execute(null, null) ; 
        
        Activator.getDefault().log(status) ;
      }
    }
    catch (Throwable e)
    {
      if (getParent() != null)
      	Activator.getDefault().error(getParent().getShell(), e) ;
      else
      	Activator.getDefault().error(e) ;
    }
  }
  
  @Override
  protected void disposeContainer()
  {
    performCancel() ;
    removeListeners() ;
    disposeActions() ;
    disposeListeners() ;
    
    super.disposeContainer() ;
  }
}
