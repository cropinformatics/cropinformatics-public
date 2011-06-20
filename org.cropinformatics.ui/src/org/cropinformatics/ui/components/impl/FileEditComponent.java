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
package org.cropinformatics.ui.components.impl;

import java.io.File;

import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class FileEditComponent extends FileComponent implements EditComponent<ContainerConfiguration, File>
{  
  public FileEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
  }
  
  public FileEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile, File file)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setFile(file) ;
  }

  public FileEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
      String[] fileExtensions, boolean openFile, File file, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setFile(file) ;
  }

  public FileEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FileEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, File file)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setFile(file) ;
  }

  public FileEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, File file, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setFile(file) ;
  }
  
  public File getValue()
  {
    return getFile() ;
  }

  public void setValue(File value)
  {  
    super.setFileText(value) ;
    setFileText(value) ;
  }

	@Override
  protected void setFile(File value)
  {
    File oldValue = getFile() ;
    
    super.setFile(value) ;
    
    getPropertyChangeSupport().firePropertyChange(VALUE_CHANGED, oldValue, getFile()) ;
  }

}