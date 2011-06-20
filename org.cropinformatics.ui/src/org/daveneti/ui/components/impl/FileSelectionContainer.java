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
package org.daveneti.ui.components.impl;

import java.io.File;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class FileSelectionContainer extends FileComponent
{  
  public static final String FILE_CHANGED = FileSelectionContainer.class.getName() + ".fileChanged";
  
  public FileSelectionContainer(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
  }
  
  public FileSelectionContainer(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile, File file)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setFile(file) ;
  }

  public FileSelectionContainer(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
      String[] fileExtensions, boolean openFile, File file, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setFile(file) ;
  }

  public FileSelectionContainer(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FileSelectionContainer(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, File file)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setFile(file) ;
  }

  public FileSelectionContainer(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, File file, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setFile(file) ;
  }
  
  public final File getFile()
  {
    return super.getFile() ;
  }

	public final void setFile(File file)
  {
    File oldValue = getFile() ;
    
    super.setFile(file) ;
    
    getPropertyChangeSupport().firePropertyChange(FILE_CHANGED, oldValue, getFile()) ;
  }
}