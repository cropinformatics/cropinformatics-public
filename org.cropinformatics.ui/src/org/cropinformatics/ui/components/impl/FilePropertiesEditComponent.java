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
package org.cropinformatics.ui.components.impl;

import static org.cropinformatics.common.io.FileProperties.COMMA_SEPARATED_TEXT;
import static org.cropinformatics.common.io.FileProperties.EXCEL;
import static org.cropinformatics.common.io.FileProperties.TAB_SEPARATED_TEXT;

import java.io.File;

import org.cropinformatics.common.io.ExcelFileProperties;
import org.cropinformatics.common.io.FileProperties;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class FilePropertiesEditComponent extends FilePropertiesComponent implements EditComponent<ContainerConfiguration, FileProperties>
{  
	private FileProperties value;

	public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, openFile);
  }
  
  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      boolean openFile, FileProperties fileProperties)
  {
    super(parent, containerConfiguration, labelValue, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
       boolean openFile, FileProperties fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }
  
  public FileProperties getValue()
  {
    return value ;
  }

  public void setValue(FileProperties value)
  {  
    if (value != null)
    {
    	this.value = value ;
    	
    	setFileText(value.getFile()) ;
    	
    	setFileType(value.getFileType()) ;
    }
    else
    {
    	setFileType(-1) ;
    }
  }

	@Override
  protected void updateFile(File file)
  {
		FileProperties oldValue = value ;
		 
		switch (getFileType())
		{
			case EXCEL :
				value = new ExcelFileProperties(file) ;
				break ;
			case TAB_SEPARATED_TEXT :
				value = new FileProperties(file, TAB_SEPARATED_TEXT) ;
				break ;
			case COMMA_SEPARATED_TEXT :
				value = new FileProperties(file, TAB_SEPARATED_TEXT) ;
				break ;
			default :
				value = null ;
		}
    
		super.updateFile(file) ;
		
    getPropertyChangeSupport().firePropertyChange(VALUE_CHANGED, oldValue, value) ;
  }

}