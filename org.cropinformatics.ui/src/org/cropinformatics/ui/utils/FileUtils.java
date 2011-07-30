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
package org.cropinformatics.ui.utils;

import org.eclipse.swt.widgets.Shell;

public abstract class FileUtils
{
  /**
   * Opens a file path dialog for the given shell with the given style and file extension filters
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title to be shown on the dialog
   * @param fileExtensionFilters filters which are used to filter the files shown in the dialog
   * @param directory the starting directory for the dialog
	 * @param openFile <code>true</code> if the dialog should be used to open a file or <code>false</code> if the dialog should used be to save a file 
   * @return the full path of the file chooser or <code>null</code> if the no path is chosen or the dialog is canceled
   */
  public abstract String openFilePathDialog(Shell parent, String title, 
      String[] fileExtensionFilters, String directory, boolean openFile) ;
  
  /**
   * Opens a file path dialog for the given shell with the given style and file extension filters
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title to be shown on the dialog
   * @param fileExtensionFilters filters which are used to filter the files shown in the dialog
   * @param directory the starting directory for the dialog
	 * @param openFile <code>true</code> if the dialog should be used to open a file or <code>false</code> if the dialog should be used to save a file 
   * @return the full paths of the file chooser or <code>null</code> if no paths are chosen or the dialog is canceled
   */
  public abstract String[] openFilesPathDialog(Shell parent, String title, 
      String[] fileExtensionFilters, String directory) ;
  
  /**
   * Opens a directory dialog for the given shell with the given style
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title to be shown on the dialog
   * @param directory the starting directory for the dialog
	 * @param openDirectory <code>true</code> if the dialog should be used to open a file or <code>false</code> if the dialog should be used to save to directory 
   * @return the full path of the file chooser or <code>null</code> if the no path is chosen or the dialog is canceled
   */
  public abstract String openDirectoryPathDialog(Shell parent, String title, String directory,
      boolean openDirectory) ;
}
