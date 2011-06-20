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
package org.daveneti.ui.preferences;

import org.daveneti.ui.Activator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PreferencePage extends org.eclipse.jface.preference.PreferencePage
    implements IWorkbenchPreferencePage
{

  private static final String DESCRIPTION = PreferencePage.class.getName() + ".description";
  
  public PreferencePage()
  {
    super();
    
    setPreferenceStore(Activator.getDefault().getPreferenceStore());
    setDescription(Activator.getDefault().getString(DESCRIPTION));
  }

  @Override
  protected Control createContents(Composite parent)
  {

    return null;
  }

  public void init(IWorkbench workbench)
  {


  }
}
