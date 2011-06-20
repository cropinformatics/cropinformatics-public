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
package org.daveneti.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.daveneti.ui.Activator;
import org.daveneti.ui.preferences.PreferenceConstants;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.operations.RedoActionHandler;
import org.eclipse.ui.operations.UndoActionHandler;
import org.eclipse.ui.part.ViewPart;

/**
 * This view shows what operations are being added to the operations history for
 * undo. The view can be filtered by any operation context. A null operation
 * context indicates that the view should not be filtered.
 * 
 * <p>
 * Selecting undo or redo from the context menu or the edit menu will perform a
 * linear undo in the current context of the view. Selecting "Undo selected"
 * allows experimentation with direct undo. Operations that are undoable may be
 * undone independently of their order in the history.
 */

public class UndoHistoryView extends ViewPart implements
    ISelectionChangedListener
{
  public static final String VIEW_ID = UndoHistoryView.class.getName();

  private static final String CONTEXT_FILTER_DIALOG_TITLE = UndoHistoryView.class.getName() + ".contextFilterDialogTitle";
  private static final String CHOOSE_CONTEXT_MESSAGE = UndoHistoryView.class.getName() + ".chooseContextMessage";
  private static final String INFO_DIALOG_TITLE = UndoHistoryView.class.getName() + ".infoDialogTitle";
  private static final String FILTER_ACTION_LABEL = UndoHistoryView.class.getName() + ".filterActionLabel";
  private static final String FILTER_TOOL_TIP = UndoHistoryView.class.getName() + ".filterActionToolTip";
  private static final String REFRESH_ACTION_LABEL = UndoHistoryView.class.getName() + ".refreshActionLabel";
  private static final String REFRESH_ACTION_TOOL_TIP = UndoHistoryView.class.getName() + ".refreshActionToolTip";
  private static final String SELECT_UNDO_ACTION_LABEL = UndoHistoryView.class.getName() + ".selectUndoActionLabel";
  private static final String SELECT_UNDO_ACTION_TOOL_TIP = UndoHistoryView.class.getName() + ".selectUndoActionToolTip";
  private static final String OPERATION_EXCEPTION_MESSAGE = UndoHistoryView.class.getName() + ".operationExceptionMessage";
  private static final String OPERATION_INVALID_MESSAGE = UndoHistoryView.class.getName() + ".operationInvalidMessage";

  private TableViewer viewer;

  private Action filterAction;

  private Action doubleClickAction;

  private Action selectiveUndoAction;

  private Action refreshListAction;

  private IOperationHistory history = OperationHistoryFactory
      .getOperationHistory();

  private IUndoContext fContext = IOperationHistory.GLOBAL_UNDO_CONTEXT;

  private UndoActionHandler undoAction;

  private RedoActionHandler redoAction;

  /*
   * A simple label provider that uses a preference to determine whether the
   * simple label or the debugging label (toString()) for an operation is shown.
   */
  class ViewLabelProvider extends LabelProvider implements ITableLabelProvider
  {
    public String getColumnText(Object obj, int index)
    {
      return getText(obj);
    }
  
    public Image getColumnImage(Object obj, int index)
    {
      return getImage(obj);
    }
  
    public String getText(Object obj)
    {
      if (!showDebug && obj instanceof IUndoableOperation)
        return ((IUndoableOperation) obj).getLabel();
      return obj.toString();
    }
  }

	// TODO check for RAP compatibility
  private boolean showDebug = Activator.getDefault().getInstancePreferenceStore()
      .getBoolean(PreferenceConstants.PREF_SHOWDEBUG);

  private IPropertyChangeListener propertyChangeListener;

  /*
   * The content provider shows the operations in the undo portion of the
   * operation history. The history is filtered by the currently selected undo
   * context.
   */

  class ViewContentProvider implements IStructuredContentProvider,
      IOperationHistoryListener
  {

    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
      // we never change inputs, so we just use this as a place to add our
      // listener.
      history.addOperationHistoryListener(this);
    }

    public void dispose()
    {
      history.removeOperationHistoryListener(this);
    }

    public Object[] getElements(Object input)
    {
      // show the items in the operations history.
      return history.getUndoHistory(fContext);
    }

    public void historyNotification(OperationHistoryEvent event)
    {
      if (viewer.getTable().isDisposed())
        return;
      Display display = viewer.getTable().getDisplay();
      switch (event.getEventType())
      {
        case OperationHistoryEvent.OPERATION_ADDED:
        case OperationHistoryEvent.OPERATION_REMOVED:
        case OperationHistoryEvent.UNDONE:
        case OperationHistoryEvent.REDONE:
          if (event.getOperation().hasContext(fContext) && display != null)
          {
            display.syncExec(new Runnable()
            {
              public void run()
              {
                // refresh all labels in case any operation has
                // changed dynamically
                // without notifying the operation history.
                if (!viewer.getTable().isDisposed())
                  viewer.refresh(true);
              }
            });
          }
          break;
      }
    }
  }

  /*
   * Create a table viewer to show the list of operations.
   */
  public void createPartControl(Composite parent)
  {
    viewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new ViewLabelProvider());
    viewer.setInput(getViewSite());
    makeActions();
    hookContextMenu();
    hookDoubleClickAction();
    addListeners();
    createGlobalActionHandlers();
  }

  /*
   * Add any listeners needed by this view.
   */
  private void addListeners()
  {
    propertyChangeListener = new IPropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        if (event.getProperty() == PreferenceConstants.PREF_SHOWDEBUG)
        {
          showDebug = Activator.getDefault().getInstancePreferenceStore().getBoolean(
              PreferenceConstants.PREF_SHOWDEBUG);
          viewer.refresh();
        }
      }
    };
    Activator.getDefault().getInstancePreferenceStore().addPropertyChangeListener(
        propertyChangeListener);
    viewer.getControl().addDisposeListener(new DisposeListener()
    {
      public void widgetDisposed(DisposeEvent event)
      {
        removeListeners();
      }
    });
  }

  /*
   * Remove listeners that were added to this view.
   */
  private void removeListeners()
  {
  	Activator.getDefault().getInstancePreferenceStore().removePropertyChangeListener(
        propertyChangeListener);
  }

  /*
   * Create global action handlers to control undo and redo. We use the action
   * handlers rather than the UndoRedoActionGroup because this view dynamically
   * sets the undo context of the handlers. Most views that simply desire an
   * undo and redo menu action for their undo context can use
   * UndoRedoActionGroup.
   */
  private void createGlobalActionHandlers()
  {
    // set up action handlers that operate on the current context
    undoAction = new UndoActionHandler(this.getSite(), fContext);
    redoAction = new RedoActionHandler(this.getSite(), fContext);
    IActionBars actionBars = getViewSite().getActionBars();
    actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
    actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
  }

  /*
   * Put up a dialog that shows all of the available undo contexts and allow the
   * user to select one.
   */
  private IUndoContext selectContext()
  {
    // This would be better implemented as a view filter, but for now, we
    // will use a dialog that collects the available undo contexts.
    List<IUndoContext> input = new ArrayList<IUndoContext>();
    IUndoableOperation[] operations = history
        .getUndoHistory(IOperationHistory.GLOBAL_UNDO_CONTEXT);
    for (int i = 0; i < operations.length; i++)
    {
      IUndoContext[] contexts = operations[i].getContexts();
      for (int j = 0; j < contexts.length; j++)
      {
        if (!input.contains(contexts[j]))
        {
          input.add(contexts[j]);
        }
      }
    }
    input.add(IOperationHistory.GLOBAL_UNDO_CONTEXT);

    ILabelProvider labelProvider = new LabelProvider()
    {
      public String getText(Object element)
      {
        return ((IUndoContext) element).getLabel();
      }
    };

    ElementListSelectionDialog dialog = new ElementListSelectionDialog(
        getSite().getShell(), labelProvider);
    dialog.setMultipleSelection(false);
    dialog.setTitle(Activator.getDefault().getString(CONTEXT_FILTER_DIALOG_TITLE));
    dialog.setMessage(Activator.getDefault()
        .getString(CHOOSE_CONTEXT_MESSAGE));
    dialog.setElements(input.toArray());
    dialog.setInitialSelections(new Object[] { fContext });
    if (dialog.open() == Window.OK)
    {
      Object[] contexts = dialog.getResult();
      if (contexts[0] instanceof IUndoContext)
        return (IUndoContext) contexts[0];
      return null;
    }
    return null;
  }

  /*
   * Reset the undo context on which the history is filtered.
   */
  public void setContext(IUndoContext context)
  {
    fContext = context;
    // setting the context into the actions updates the menu labels, etc.
    redoAction.setContext(context);
    undoAction.setContext(context);
    // need to refresh the viewer
    viewer.refresh(false);
  }

  /*
   * Hook the context menu for the view
   */
  private void hookContextMenu()
  {
    MenuManager menuMgr = new MenuManager("#PopupMenu");
    menuMgr.setRemoveAllWhenShown(true);
    menuMgr.addMenuListener(new IMenuListener()
    {
      public void menuAboutToShow(IMenuManager manager)
      {
        UndoHistoryView.this.fillContextMenu(manager);
      }
    });
    Menu menu = menuMgr.createContextMenu(viewer.getControl());
    viewer.getControl().setMenu(menu);
    getSite().registerContextMenu(menuMgr, viewer);
  }

  /*
   * Fill the context menu for the view.
   */
  private void fillContextMenu(IMenuManager manager)
  {
    // First add the global undo/redo actions
    undoAction.update();
    redoAction.update();
    manager.add(undoAction);
    manager.add(redoAction);
    manager.add(new Separator());

    // Now add our specialized actions
    manager.add(selectiveUndoAction);
    manager.add(filterAction);
    manager.add(refreshListAction);

    ISelection selection = viewer.getSelection();
    if (!selection.isEmpty())
    {
      IUndoableOperation operation = (IUndoableOperation) ((IStructuredSelection) selection)
          .getFirstElement();
      selectiveUndoAction.setEnabled(operation.canUndo());
    }
    else
    {
      selectiveUndoAction.setEnabled(false);
    }

    // Other plug-ins can contribute actions here
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  /*
   * Create the actions for the view.
   */
  private void makeActions()
  {
    filterAction = new Action()
    {
      public void run()
      {
        IUndoContext context = selectContext();
        if (fContext != context && context != null)
        {
          setContext(context);
        }
      }
    };
    filterAction.setText(Activator.getDefault().getString(FILTER_ACTION_LABEL));
    filterAction.setToolTipText(Activator.getDefault()
        .getString(FILTER_TOOL_TIP));
    filterAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
        .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

    selectiveUndoAction = new Action()
    {
      public void run()
      {
        ISelection selection = viewer.getSelection();
        IUndoableOperation operation = (IUndoableOperation) ((IStructuredSelection) selection)
            .getFirstElement();
        if (operation.canUndo())
        {
          try
          {
            history.undoOperation(operation, null, undoAction);
          }
          catch (ExecutionException e)
          {
            showMessage(Activator.getDefault()
                .getString(OPERATION_EXCEPTION_MESSAGE));
          }
        }
        else
        {
          showMessage(Activator.getDefault().getString(OPERATION_INVALID_MESSAGE));
        }
      }
    };
    selectiveUndoAction.setText(Activator.getDefault()
        .getString(SELECT_UNDO_ACTION_LABEL));
    selectiveUndoAction
        .setToolTipText(Activator.getDefault()
            .getString(SELECT_UNDO_ACTION_TOOL_TIP));
    selectiveUndoAction.setImageDescriptor(PlatformUI.getWorkbench()
        .getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));

    refreshListAction = new Action()
    {
      public void run()
      {
        if (!viewer.getTable().isDisposed())
          viewer.refresh(true);
      }
    };
    refreshListAction.setText(Activator.getDefault()
        .getString(REFRESH_ACTION_LABEL));
    refreshListAction
        .setToolTipText(Activator.getDefault()
            .getString(REFRESH_ACTION_TOOL_TIP));

    doubleClickAction = new Action()
    {
      public void run()
      {
        ISelection selection = viewer.getSelection();
        IUndoableOperation operation = (IUndoableOperation) ((IStructuredSelection) selection)
            .getFirstElement();
        StringBuffer buf = new StringBuffer(operation.getLabel());
        buf.append("\n");
        buf.append("Enabled="); //$NON-NLS-1$
        buf.append(new Boolean(operation.canUndo()).toString());
        buf.append("\n");
        buf.append(operation.getClass().toString());
        showMessage(buf.toString());

      }
    };
  }

  /*
   * Register a double click action with the double click event.
   */
  private void hookDoubleClickAction()
  {
    viewer.addDoubleClickListener(new IDoubleClickListener()
    {
      public void doubleClick(DoubleClickEvent event)
      {
        doubleClickAction.run();
      }
    });
  }

  /*
   * Show an info message
   */
  private void showMessage(String message)
  {
    MessageDialog.openInformation(viewer.getControl().getShell(), Activator.getDefault()
        .getString(INFO_DIALOG_TITLE), message);
  }

  /*
   * The selection has changed.
   */
  public void selectionChanged(SelectionChangedEvent event)
  {
    ISelection selection = viewer.getSelection();
    boolean enabled = !selection.isEmpty();
    selectiveUndoAction.setEnabled(enabled);
  }

  /*
   * Pass the focus request to the viewer's control.
   */
  public void setFocus()
  {
    viewer.getControl().setFocus();

  }
}
