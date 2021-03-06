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
package org.cropinformatics.ui.views;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Configurable;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.ViewConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractView<T extends ControlConfiguration> extends ViewPart implements Configurable<ViewConfiguration>
{      
  private ViewConfiguration configuration;
  private Composite composite ;
  private DeleteAction deleteAction ;

  public AbstractView()
  {
    this(null);
  }
  
  public AbstractView(ViewConfiguration configuration)
  {
    super();
    
    setConfiguration(configuration) ;
  }
  
  public final void createPartControl(Composite parent)
  {
    createListeners();
    createActions();
    registerGlobalActionHandlers() ;
    
    T childConfiguration = getChildControlConfiguration(getConfiguration()) ;
    
    composite = createComponentCompositeIfNeeded(parent, childConfiguration) ;
    
    createInternalViewer(composite, childConfiguration) ;
    hookContextMenus(getSite()) ;
    updateView() ;
  }

	public final void dispose()
  {
    disposeInternalViewer() ;
    disposeGlobalActionHandlers() ;
    disposeActions();
    disposeListeners();
    
    super.dispose();
  }

  public final void setFocus()
  {
    if (composite != null)
    	composite.setFocus();
  }

  public String getId()
  {
    return this.getClass().getName() ;
  }
  
  public ViewConfiguration getConfiguration()
  {
    return configuration ;
  }

  protected boolean isDeleteEnabled()
	{
		return false ;
	}
	
  protected void delete()
  {

  }
  
  protected void updateDeleteAction()
  {
  	if (deleteAction != null)
  		deleteAction.setEnabled(isDeleteEnabled()) ;
  }
  
  protected ViewConfiguration createDefaultConfiguration()
  {
    ViewConfiguration viewConfiguration = ConfigurationUtils.getViewConfiguration(this);
    
    if (viewConfiguration == null)
    {
      viewConfiguration = ConfigurationFactory.eINSTANCE.createViewConfiguration() ;
      viewConfiguration.setId(getId()) ;
    }
    
    return viewConfiguration ;
  }
  
  protected abstract T getChildControlConfiguration(ViewConfiguration configuration) ;
  
  private final void setConfiguration(ViewConfiguration configuration)
  {  
    if (configuration != null)
    {
      this.configuration = configuration;
    }
    else 
    {
      this.configuration = createDefaultConfiguration();
    }
    
    Activator.saveConfiguration(this.configuration) ;
  }
  
  protected void updateView()
  {

  }

  
  protected void createListeners()
  {

  }

  protected void disposeListeners()
  {

  }
  
  protected void createActions()
  {
    deleteAction = new DeleteAction() ;
    
    updateDeleteAction() ;
  }

  protected void disposeActions()
  {

  }
  
  /*
   * Create the global undo and redo action handlers.
   */
  protected void registerGlobalActionHandlers()
  {
    IActionBars actionBars = getViewSite().getActionBars();

    actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction); 
  }
  
  protected void disposeGlobalActionHandlers()
  {
    IActionBars actionBars = getViewSite().getActionBars();

    actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), null); 
  }

  
  protected void hookContextMenus(IWorkbenchPartSite site)
  {
    
  }
  
  /*
   * This method creates the pop menu when a user right-clicks on the control. 
   * This method calls the fillContextMenu which then actually
   * fills the menu
   */
  protected final void hookContextMenu(IWorkbenchPartSite site, Control contextMenuParent, ISelectionProvider selectionProvider)
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
      
      if (site != null && selectionProvider != null)
        site.registerContextMenu(menuMgr, selectionProvider);
    }
  }
  
  protected void fillContextMenu(IMenuManager manager)
  {
 
  }
  
  protected Composite createComponentCompositeIfNeeded(Composite parent, T childConfiguration)
  {
    if (!ConfigurationUtils.isCreatingNewComposite(parent, childConfiguration))
    	return ConfigurationUtils.createComposite(parent, childConfiguration) ;
    else
    	return parent ;
  }

  protected abstract void createInternalViewer(Composite parent, T childConfiguration) ;

  protected abstract void disposeInternalViewer() ;
  
  private class DeleteAction extends Action implements IWorkbenchAction
  {
    @Override
    public void run()
    {
      delete() ;
    }

    public void dispose()
    {
      
    }
  }
}