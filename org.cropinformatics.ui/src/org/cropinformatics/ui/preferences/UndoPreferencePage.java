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
package org.cropinformatics.ui.preferences;

import org.cropinformatics.ui.Activator;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class is used to define preferences that control how undo occurs. It
 * demonstrates the use of preferences to configure the operation history in
 * different ways.
 */

public class UndoPreferencePage extends FieldEditorPreferencePage implements
    IWorkbenchPreferencePage
{
  private static final String DESCRIPTION = UndoPreferencePage.class.getName() + ".description";
  private static final String HISTORY_LIMIT_LABEL = UndoPreferencePage.class.getName() + ".historyLimitLabel";
  private static final String SHOW_DEBUG_LABEL = UndoPreferencePage.class.getName() + ".showDebugLabel";
  private static final String CONFIRM_UNDO_LABEL = UndoPreferencePage.class.getName() + ".confirmUndoLabel";

  public UndoPreferencePage()
  {
    super(GRID);
    setPreferenceStore(Activator.getDefault().getPreferenceStore());
    setDescription(Activator.getDefault().getString(DESCRIPTION));
  }

  /**
   * Creates the field editors.
   */
  public void createFieldEditors()
  {

    addField(new IntegerFieldEditor(PreferenceConstants.PREF_UNDOLIMIT,
    		Activator.getDefault().getString(HISTORY_LIMIT_LABEL),
        getFieldEditorParent()));

    addField(new BooleanFieldEditor(PreferenceConstants.PREF_SHOWDEBUG,
    		Activator.getDefault().getString(SHOW_DEBUG_LABEL),
        getFieldEditorParent()));

    addField(new BooleanFieldEditor(PreferenceConstants.PREF_CONFIRMUNDO,
    		Activator.getDefault().getString(CONFIRM_UNDO_LABEL),
        getFieldEditorParent()));
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
   */
  public void init(IWorkbench workbench)
  {
  }

}