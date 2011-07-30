/*******************************************************************************
 * Copyright 2011 Guy Davenport
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
package org.cropinformatics.ui.wizards;

import org.cropinformatics.ui.components.Configurable;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.eclipse.jface.wizard.IWizardPage;

public interface ConfigurableWizardPage extends IWizardPage, Configurable<WizardPageConfiguration>
{
  public static final String VISIBILITY_PROPERTY = "visibility" ;
	
  public boolean isEnabled() ;
  
  public void setEnabled(boolean enabled) ;
  
}
