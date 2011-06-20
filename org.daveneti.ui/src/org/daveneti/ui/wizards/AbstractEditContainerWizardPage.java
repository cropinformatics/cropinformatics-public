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
package org.daveneti.ui.wizards;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.WizardPageConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.resource.ImageDescriptor;

public abstract class AbstractEditContainerWizardPage<T> extends
    AbstractEditComponentWizardPage<ContainerConfiguration, T>
{
	public AbstractEditContainerWizardPage(String pageName, String title,
      String description, ImageDescriptor titleImage,
      WizardPageConfiguration configuration, T value)
  {
	  super(pageName, title, description, titleImage, configuration, value);
  }

	@Override
  protected final ContainerConfiguration getChildControlConfiguration(
      WizardPageConfiguration configuration)
  {
	  return ConfigurationUtils.getChildContainerControl(configuration);
  }
}
