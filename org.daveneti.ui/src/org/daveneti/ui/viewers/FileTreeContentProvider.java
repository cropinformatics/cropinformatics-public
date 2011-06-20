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
package org.daveneti.ui.viewers;

import java.io.File;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class FileTreeContentProvider implements ITreeContentProvider
{
	private File rootFile;
	private List<File> rootFiles;

	public void dispose()
	{
		rootFile = null ;
		rootFiles = null ;
	}

	@SuppressWarnings("unchecked")
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		if (newInput instanceof List && rootFiles != newInput)
		{
			rootFiles = (List<File>)newInput ;
		}
		else
		{
			if (newInput instanceof File && rootFile != newInput)
			{
				rootFile = (File)newInput ;
			}
			else
			{
				rootFile = null ;
				rootFiles = null ;
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
  public Object[] getElements(Object inputElement)
	{
		if (inputElement instanceof List)
			return ((List) inputElement).toArray(new File[((List) inputElement).size()]) ;
		else
			if (inputElement instanceof File)
				return getChildFiles((File)inputElement) ;
			else
				return null;
	}

	public Object[] getChildren(Object parentElement)
	{
		if (parentElement instanceof File)
			return getChildFiles((File)parentElement) ;
		else
			return null;
	}

	public Object getParent(Object element)
	{
		if (element instanceof File)
			return getParentFile((File)element) ;
		else
			return null;
	}

	public boolean hasChildren(Object element)
	{
		if (element instanceof File) 
			return hasChildFiles((File)element) ;
		else
			return false ;
	}

	protected File getParentFile(File file)
  {
	  if (file != null && file != rootFile)
	  {
	  	return file.getParentFile() ;
	  }
	  else
	  {
	  	return null ;
	  }
  }
	
	protected File[] getChildFiles(File file)
  {
	  if (file != null && file.isDirectory())
	  {
	  	return file.listFiles() ;
	  }
	  else
	  {
	  	return null ;
	  }
  }
	
	protected boolean hasChildFiles(File file)
  {
	  if (file != null && file.isDirectory())
	  	return file.listFiles() != null && file.listFiles().length > 0 ;
		else
			return false ;
  }
}
