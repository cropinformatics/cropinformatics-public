/*******************************************************************************
 * Copyright 2010 Guy Davenport
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
package org.daveneti.ui.dialogs;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractEditComponentDialog<T> extends AbstractEditDialog<ContainerConfiguration, T>
{

	public AbstractEditComponentDialog(Shell parentShell,
      DialogConfiguration configuration, String title, T value)
  {
	  super(parentShell, configuration, title, value);
  }
	
	public AbstractEditComponentDialog(Shell parentShell,
      DialogConfiguration configuration, String title, String message, T value)
  {
	  super(parentShell, configuration, title, message, value);
  }

	@Override
  protected final ContainerConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
	  return ConfigurationUtils.getChildContainerControl(configuration) ;
  }

}
