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
package org.cropinformatics.ui.viewers.list;

import java.io.File;
import java.util.List;

import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.viewers.FileLabelProvider;
import org.cropinformatics.ui.viewers.FileTreeContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Composite;

/**
 * Viewer for displaying and allowing the selection of File objects using a TableViewer
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 * @param <File> the sub-class of File objects to be displayed
 */
public class FileListTreeViewer extends AbstractSingleListTreeViewer<File>
{
  private boolean showAbsolutePath = false;

  public FileListTreeViewer(Composite parent, ListViewerConfiguration listViewerConfiguration)
  {
    super(parent, listViewerConfiguration) ;
  }
 
  public FileListTreeViewer(Composite parent, ListViewerConfiguration listViewerConfiguration, List<File> items)
  {
    super(parent, listViewerConfiguration, items) ;
  }

  public FileListTreeViewer(Composite parent, ListViewerConfiguration listViewerConfiguration, List<File> items, List<File> selectedItems)
  {
    super(parent, listViewerConfiguration, items, selectedItems) ;
  }
  
  public boolean isShowAbsolutePath()
  {
  	return showAbsolutePath;
  }

	public void setShowAbsolutePath(boolean showAbsolutePath)
  {
  	this.showAbsolutePath = showAbsolutePath;
  }

	@Override
  protected ILabelProvider createLabelProvider()
  {
    return new FileLabelProvider(showAbsolutePath);
  }

  @Override
  protected String getFilterableLabel(File element)
  {
    if (element != null)
      return element.getName() ;
    else
      return null ;
  }

	@Override
  protected ITreeContentProvider createTreeContentProvider()
  {
	  return new FileTreeContentProvider() ;
  }
}
