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
package org.daveneti.ui.operations;

import org.daveneti.ui.Activator;
import org.daveneti.ui.preferences.PreferenceConstants;
import org.eclipse.core.commands.operations.IOperationApprover;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


/**
 * An operation approver that prompts the user to see whether an undo or redo
 * should continue. An example preference is checked to determine if prompting
 * should occur.
 */
public final class PromptingUserApprover implements IOperationApprover
{
  private static final String UNDO_LABEL = PromptingUserApprover.class.getName() + ".undoLabel";
	private static final String REDO_LABEL = PromptingUserApprover.class.getName() + ".redoLabel";
	private static final String CONFIRM_UNDO_LABEL = PromptingUserApprover.class.getName() + ".confirmUndoLabel";
	private static final String CONFIRM_UNDO_DIALOG_TITLE = PromptingUserApprover.class.getName() + ".confirmUndoDialogTitle";
	private static final String DO_NOT_CONFIRM_LABEL = PromptingUserApprover.class.getName() + ".doNotConfirmLabel";
	
	private IUndoContext context;

  /*
   * Create the operation approver.
   */
  public PromptingUserApprover(IUndoContext context)
  {
    super();
    this.context = context;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.commands.operations.IOperationApprover#proceedRedoing(org.eclipse.core.commands.operations.IUndoableOperation,
   *      org.eclipse.core.commands.operations.IOperationHistory,
   *      org.eclipse.core.runtime.IAdaptable)
   */
  public IStatus proceedRedoing(IUndoableOperation operation,
      IOperationHistory history, IAdaptable uiInfo)
  {

    // return immediately if the operation is not relevant
    if (!operation.hasContext(context))
      return Status.OK_STATUS;

    // allow the operation if we are not prompting
    boolean prompt = Activator.getDefault().getPreferenceStore()
        .getBoolean(PreferenceConstants.PREF_CONFIRMUNDO);
    if (!prompt)
      return Status.OK_STATUS;
    return prompt(false, operation, uiInfo);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.commands.operations.IOperationApprover#proceedUndoing(org.eclipse.core.commands.operations.IUndoableOperation,
   *      org.eclipse.core.commands.operations.IOperationHistory,
   *      org.eclipse.core.runtime.IAdaptable)
   */
  public IStatus proceedUndoing(IUndoableOperation operation,
      IOperationHistory history, IAdaptable uiInfo)
  {

    // return immediately if the operation is not relevant
    if (!operation.hasContext(context))
      return Status.OK_STATUS;

    // allow the operation if we are not prompting
    boolean prompt = Activator.getDefault().getPreferenceStore()
        .getBoolean(PreferenceConstants.PREF_CONFIRMUNDO);
    if (!prompt)
      return Status.OK_STATUS;
    return prompt(true, operation, uiInfo);
  }

  // TODO i18n
  /*
   * Prompt the user as to whether to continue the undo or redo, and return an
   * OK_STATUS if we should continue, or a CANCEL_STATUS if we should not.
   */
  private IStatus prompt(boolean undoing, IUndoableOperation operation,
      IAdaptable uiInfo)
  {
    boolean createdShell = false;
    Shell shell = getShell(uiInfo);
    if (shell == null)
    {
      if (shell == null)
      {
        createdShell = true;
        shell = new Shell(Display.getCurrent());
      }
    }
    String command = undoing ? Activator.getDefault().getString(UNDO_LABEL)
        : Activator.getDefault().getString(REDO_LABEL);
    String message = Activator
        .getDefault().getString(CONFIRM_UNDO_LABEL, new Object[] {command, operation.getLabel()});
    MessageDialogWithToggle dialog = MessageDialogWithToggle
        .openOkCancelConfirm(shell, Activator
            .getDefault().getString(CONFIRM_UNDO_DIALOG_TITLE), message,
            Activator
                .getDefault().getString(DO_NOT_CONFIRM_LABEL),
            false, null, null);
    Activator.getDefault().getPreferenceStore().setValue(
        PreferenceConstants.PREF_CONFIRMUNDO, !dialog.getToggleState());

    if (createdShell)
      shell.dispose();
    if (dialog.getReturnCode() == Window.OK)
      return Status.OK_STATUS;
    return Status.CANCEL_STATUS;
  }

  /*
   * Return the shell described by the supplied uiInfo, or null if no shell is
   * described.
   */
  Shell getShell(IAdaptable uiInfo)
  {
    if (uiInfo != null)
    {
      Shell shell = (Shell) uiInfo.getAdapter(Shell.class);
      if (shell != null)
        return shell;
    }
    return null;
  }
}
