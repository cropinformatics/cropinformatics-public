package org.daveneti.ui.utils;
/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT) 
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


import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileUtilsImpl extends FileUtils
{
	public String openFilePathDialog(Shell parent,
      String fileExtensionFilter, String directory, boolean openFile)
  {
		String[] fileExtensionFilters = null ;
  
    if (fileExtensionFilter != null)
    {
    	fileExtensionFilters = new String[] { fileExtensionFilter } ;
    }
  
    return openFilePathDialog(parent, fileExtensionFilters, directory, openFile) ;
  }

	public String openFilePathDialog(Shell parent, String[] fileExtensionFilters,
      String directory, boolean openFile)
  {
		int style ;
		
		if (openFile)
			style = SWT.OPEN ;
		else
			style = SWT.SAVE ;
		
    FileDialog fileDialog = new FileDialog(parent, style);
    
    if (directory != null)
      fileDialog.setFilterPath(new File(directory).getAbsolutePath());
  
    if (fileExtensionFilters != null)
    {
      fileDialog.setFilterExtensions(fileExtensionFilters);
    }
  
    fileDialog.open();
    
    if (fileDialog.getFileName() != null
        && fileDialog.getFileName().length() > 0)
    {
      return fileDialog.getFilterPath() + File.separator
          + fileDialog.getFileName();
    }
    else
    {
      return null;
    }
  }
  
  public String openDirectoryPathDialog(Shell parent, String directory, boolean openFile)
  {
		int style ;
		
		if (openFile)
			style = SWT.OPEN ;
		else
			style = SWT.SAVE ;
		
    DirectoryDialog directoryDialog = new DirectoryDialog(parent, style);
  
    if (directory != null)
      directoryDialog.setFilterPath(new File(directory).getAbsolutePath());
  
    String path = directoryDialog.open();
  
    return path;
  }
}
