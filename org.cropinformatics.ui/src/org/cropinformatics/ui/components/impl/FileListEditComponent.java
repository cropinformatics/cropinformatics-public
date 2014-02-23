/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy.davenport@cropinformatics.com) under contract by
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
package org.cropinformatics.ui.components.impl;

import java.io.File;
import java.util.List;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class FileListEditComponent extends FileComponent implements EditComponent<ContainerConfiguration, List<File>>
{  
  private static final String ADD_FILE_BUTTON_ID = "addFileButton";
	private static final String ADD_FILE_BUTTON_LABEL = FileListEditComponent.class.getName() + "addFileButtonLabel";
	private List<File> value;
	private Button addButton;

	public FileListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
  }
  
  public FileListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile, List<File> value)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setValue(value) ;
  }

  public FileListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
      String[] fileExtensions, boolean openFile, List<File> value, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setValue(value) ;
  }

  public FileListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FileListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, List<File> value)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(value) ;
  }

  public FileListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, List<File> value, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(value) ;
  }
  
  public List<File> getValue()
  {
    return value ;
  }

  public void setValue(List<File> value)
  {  
		List<File> oldValue = value ;
    
    this.value = value ;
    
    super.setFile(!value.isEmpty() ? value.get(0) : null) ;
    
    getPropertyChangeSupport().firePropertyChange(VALUE_CHANGED, oldValue, value) ;
    
    setFileText(!value.isEmpty() ? value.get(0) : null) ;
  }

  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(
  		Composite parent, ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
  	ControlConfiguration controlConfiguration = null ;

  	if (configuration instanceof ControlConfiguration)
  		controlConfiguration = (ControlConfiguration)configuration ;

  	if (component == null)
  	{
  		if (ADD_FILE_BUTTON_ID.equals(id))
  		{
  			component = createButtonComponent(parent, controlConfiguration, SWT.PUSH);

  			addButton = (Button)component.getControl() ;

  			addButton.setText(Activator.getDefault().getString(ADD_FILE_BUTTON_LABEL));

  			addButton.addSelectionListener(new SelectionAdapter()
  			{
  				public void widgetSelected(SelectionEvent e)
  				{
  					handleAddFile() ;
  				}
  			});
  		}
  	}

  	return component ; 
  }

  protected void handleAddFile()
  {
	  // TODO Auto-generated method stub
	  
  }
  
	@Override
  protected void registerChildComponentIDs()
  {
		super.registerChildComponentIDs(); 
		
  	registerChildComponentID(ADD_FILE_BUTTON_ID) ;
  }
}