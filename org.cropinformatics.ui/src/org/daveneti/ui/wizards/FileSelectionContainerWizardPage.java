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
package org.daveneti.ui.wizards;

import java.io.File;

import org.daveneti.ui.components.Container;
import org.daveneti.ui.components.impl.FileSelectionContainer;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.WizardPageConfiguration;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public class FileSelectionContainerWizardPage extends AbstractContainerWizardPage
{
	private File file ;
	private String labelValue;
	private String[] fileExtensions ;
	private boolean openFile;

	public FileSelectionContainerWizardPage(String pageName, String title,
      String description, ImageDescriptor titleImage,
      WizardPageConfiguration configuration, String labelValue, String[] fileExtensions, boolean openFile, File file)
  {
	  super(pageName, title, description, titleImage, configuration);
	  
	  this.file = file ;
	  this.labelValue = labelValue ;
	  this.fileExtensions = fileExtensions ;
	  this.openFile = openFile ;
  }
	
	public final File getFile()
  {
		if (getComponent() != null)
			return getFileSelectionContainer().getFile() ;
		else
			return file;
  }

	public final void setFile(File file)
  {
		if (getComponent() != null)
			getFileSelectionContainer().setFile(file) ;
		else
			this.file = file;
  }
	
	protected final FileSelectionContainer getFileSelectionContainer()
	{
		return (FileSelectionContainer)getComponent() ;
	}

	@Override
  protected final Container<ContainerConfiguration> createComponent(Composite parent,
      ContainerConfiguration configuration, IRunnableContext runnableContext)
  {
	  return createFileSelectionContainer(parent, configuration, runnableContext, labelValue, fileExtensions, openFile, file); 
  }
	
  protected FileSelectionContainer createFileSelectionContainer(Composite parent,
      ContainerConfiguration configuration, IRunnableContext runnableContext, String labelValue, String[] fileExtensions, boolean openFile, File file)
  {
	  return new FileSelectionContainer(parent, configuration, labelValue, fileExtensions, openFile, file); 
  }
}
