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
package org.cropinformatics.ui.editors;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.operations.PromptingUserApprover;
import org.cropinformatics.ui.preferences.PreferenceConstants;
import org.cropinformatics.ui.viewers.AbstractViewer;
import org.eclipse.core.commands.common.EventManager;
import org.eclipse.core.commands.operations.IOperationApprover;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.ObjectUndoContext;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.operations.RedoActionHandler;
import org.eclipse.ui.operations.UndoActionHandler;

public class EditorHelper extends EventManager
{
  private ConfigurableEditor editor ;
  
  private String message;
  
  private boolean dirty ;
  
  private IUndoContext undoContext;

  private IOperationApprover operationApprover;

  private IPropertyChangeListener propertyChangeListener;

  private OperationHistoryListener operationHistoryListener;
  
  private DeleteAction deleteAction ;
  
  private UndoActionHandler undoAction;

  private RedoActionHandler redoAction;

  private Component<? extends ComponentConfiguration> component;

	private String errorMessage;
  
  public EditorHelper(ConfigurableEditor editor)
  {
    super();
    
    dirty = false ;
    
    this.editor = editor;
  }
 
  public ConfigurableEditor getEditor()
  {
    return editor;
  }

  public void initialise()
  {
    createListeners() ;
    initializeOperationHistory();
    createActions() ;
  }

  public void createControls()
  {
    registerGlobalActionHandlers() ;
    createMenus();
    hookContextMenu();
  }
  
  public void setComponent(Component<? extends ComponentConfiguration> component)
  {
    this.component = component ;
  }

  public void dispose()
  {
    if (component != null)
      component.dispose() ; 

    disposeGlobalActionHandlers() ;
    disposeActions() ;
    disposeOperationHistory();
    disposeListeners() ;
  }

  public final String getStatusMessage()
  {
    return message;
  }
  
  public final String getErrorMessage()
  {
    return errorMessage;
  }
  
  public final void setStatusMessage(String message)
  {
    editor.getEditorSite().getActionBars().getStatusLineManager().setMessage(message);
    
    this.message = message ;
  }
  
  public final void setErrorMessage(String errorMessage)
  {
    editor.getEditorSite().getActionBars().getStatusLineManager().setErrorMessage(errorMessage);
    
    this.errorMessage = errorMessage ;
  }
  
  public boolean isDirty()
  {
    return dirty ;
  }

  public synchronized void setDirty(boolean dirty)
  {
    if (this.dirty != dirty)
    {
      this.dirty = dirty;

      if (!dirty)
        clearFirstOperation() ;
    }
  }

  public Component<? extends ComponentConfiguration> getComponent()
  {
    return component;
  }
  
  /*
   * Get the operation history from the workbench.
   */
  public IOperationHistory getOperationHistory()
  {
    return PlatformUI.getWorkbench().getOperationSupport()
        .getOperationHistory();
  }
  
  public void done(IUndoableOperation operation)
  {

  }
  
  public void undone(IUndoableOperation operation)
  {
    
  }
  
  public void redone(IUndoableOperation operation)
  {
    
  }
  
  public void clearFirstOperation()
  {
    operationHistoryListener.clearFirstOperation() ;
  }
  
  public final IUndoContext getUndoContext()
  {
  	return undoContext;
  }

	/**
   * Fires a property changed event.
   * 
   * @param propertyId
   *          the id of the property that changed
   */
  protected void firePropertyChange(final int propertyId)
  {
    Object[] array = getListeners();
    for (int nX = 0; nX < array.length; nX++)
    {
      final IPropertyListener l = (IPropertyListener) array[nX];
      try
      {
        l.propertyChanged(EditorHelper.this, propertyId);
      }
      catch (RuntimeException e)
      {
        Activator.getDefault().error(e);
      }
    }
  }
  
  protected void createListeners()
  {
    // listen for a change in the undo limit
    propertyChangeListener = new IPropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        if (event.getProperty() == PreferenceConstants.PREF_UNDOLIMIT)
        {
          int limit = Activator.getDefault().getPreferenceStore().getInt(
          		PreferenceConstants.PREF_UNDOLIMIT);
          getOperationHistory().setLimit(undoContext, limit);
        }
      }
    };

    Activator.getDefault().getPreferenceStore()
        .addPropertyChangeListener(propertyChangeListener);
    
    operationHistoryListener = new OperationHistoryListener() ;
  }
  
  protected void disposeListeners()
  {
    if (propertyChangeListener != null)
    	Activator.getDefault().getPreferenceStore()
        .addPropertyChangeListener(propertyChangeListener);
    
    propertyChangeListener = null ;
    
    operationHistoryListener = null ;
  }
  
  /*
   * Initialize the workbench operation history for our undo context.
   */
  protected void initializeOperationHistory()
  {
    // create a unique undo context to
    // represent this editor's undo history
    undoContext = new ObjectUndoContext(this, getEditor().getUndoContextLabel());

    // set the undo limit for this context based on the preference
    int limit = Activator.getDefault().getPreferenceStore().getInt(
        PreferenceConstants.PREF_UNDOLIMIT);
    getOperationHistory().setLimit(undoContext, limit);

    // Install an operation approver for this undo context that prompts
    // according to a user preference.
    operationApprover = new PromptingUserApprover(undoContext);
    getOperationHistory().addOperationApprover(operationApprover);
    getOperationHistory().addOperationHistoryListener(operationHistoryListener);
  }
  
  protected void disposeOperationHistory()
  {
    if (operationApprover != null)
      getOperationHistory().removeOperationApprover(operationApprover);
    if (operationHistoryListener != null)
      getOperationHistory().removeOperationHistoryListener(operationHistoryListener);
    
    getOperationHistory().dispose(undoContext, true, true, true) ;
    
    operationApprover = null ;
    undoContext = null ;
  }
  
  /*
   * Create any actions.
   */
  protected void createActions()
  {
    deleteAction = new DeleteAction() ;
    undoAction = new UndoActionHandler(editor.getSite(), undoContext);
    redoAction = new RedoActionHandler(editor.getSite(), undoContext);
  }
  
  /*
   * Dispose any actions.
   */
  protected void disposeActions()
  {
    deleteAction = null ;
    undoAction = null ;
    redoAction = null ;
  }
  
  /*
   * Create the global undo and redo action handlers.
   */
  protected void registerGlobalActionHandlers()
  {
    IActionBars actionBars = editor.getEditorSite().getActionBars();

    actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction); 
    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
  }
  
  protected void disposeGlobalActionHandlers()
  {
    IActionBars actionBars = editor.getEditorSite().getActionBars();

    actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), null); 
    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), null);
    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), null);
  }
  
  /*
   * Create any menus.
   */
  protected void createMenus()
  {
    
  }
  
  protected void hookContextMenu()
  {
    if (editor.getSelectionProvider() != null)
    {
      MenuManager menuMgr = new MenuManager("#PopupMenu1");
      menuMgr.setRemoveAllWhenShown(true);
      menuMgr.addMenuListener(new IMenuListener()
      {
        public void menuAboutToShow(IMenuManager manager)
        {
          fillContextMenu(manager);
        }
      });
      Menu menu = menuMgr.createContextMenu(editor.getControl());
      editor.getControl().setMenu(menu);
      editor.getSite().registerContextMenu(menuMgr, editor.getSelectionProvider());
    }
  }

  @SuppressWarnings("rawtypes")
  protected void fillContextMenu(IMenuManager manager)
  {
    IEditorActionBarContributor actionBarContributor = editor.getEditorSite().getActionBarContributor() ;
    
    if (actionBarContributor instanceof AbstractEditorActionBarContributor)
    {
      ((AbstractEditorActionBarContributor)actionBarContributor).contributeToContextMenu(manager) ;
    }
    
    if (component != null && component instanceof AbstractViewer)
      ((AbstractViewer)component).fillContextMenu(manager) ;
  }
  
  private class DeleteAction extends Action implements IWorkbenchAction
  {
    @Override
    public void run()
    {
      editor.delete() ;
    }

    public void dispose()
    {
      
    }
  }

  protected class OperationHistoryListener implements IOperationHistoryListener
  {
    private IUndoableOperation firstOperationSinceSave ;
    
    public void historyNotification(OperationHistoryEvent event)
    {
        IUndoableOperation operation = event.getOperation() ;
        
        switch (event.getEventType())
        {
          case OperationHistoryEvent.DONE :
            if (firstOperationSinceSave == null)
            {
              firstOperationSinceSave = operation ;
              editor.setDirty(true) ;
            }
            done(operation) ;
            break ;
          case OperationHistoryEvent.REDONE :
            if (firstOperationSinceSave == null)
            {
              firstOperationSinceSave = operation ;
              editor.setDirty(true) ;
            }
            
            redone(operation) ;
            break ;
          case OperationHistoryEvent.UNDONE : 
            if (firstOperationSinceSave == operation)
            {
              firstOperationSinceSave = null ;
              editor.setDirty(false) ;
            }
            undone(operation) ;
            break ;
          case OperationHistoryEvent.OPERATION_ADDED : 
            break ;
          case OperationHistoryEvent.OPERATION_REMOVED : 
            break ;
        }
      
    }

    public void clearFirstOperation()
    {
      firstOperationSinceSave = null ;
    }
  }
}
