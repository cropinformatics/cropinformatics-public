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
package org.cropinformatics.ui.wizards;

import org.cropinformatics.common.io.FileProperties;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.components.impl.FilePropertiesEditComponent;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public class FilePropertiesEditComponentWizardPage extends AbstractEditComponentWizardPage<ContainerConfiguration, FileProperties>
{
	private String labelValue;
	private String[] fileExtensions ;
	private boolean openFile;

	public FilePropertiesEditComponentWizardPage(String pageName, String title,
      String description, ImageDescriptor titleImage,
      WizardPageConfiguration configuration, String labelValue, String[] fileExtensions, boolean openFile, FileProperties value)
  {
	  super(pageName, title, description, titleImage, configuration, value);
	  
	  this.labelValue = labelValue ;
	  this.fileExtensions = fileExtensions ;
	  this.openFile = openFile ;
  }

	@Override
  protected EditComponent<ContainerConfiguration, FileProperties> createEditComponent(
      Composite parent, ContainerConfiguration controlConfiguration,
      FileProperties value, IRunnableContext runnableContext)
  {
	  return new FilePropertiesEditComponent(parent, controlConfiguration, labelValue, fileExtensions, openFile, value);
  }

	@Override
  protected ContainerConfiguration getChildControlConfiguration(
      WizardPageConfiguration configuration)
  {
	  return ConfigurationUtils.getChildContainerControl(configuration) ;
  }

}
