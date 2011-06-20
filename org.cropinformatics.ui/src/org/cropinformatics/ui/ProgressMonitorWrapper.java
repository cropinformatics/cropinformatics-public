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
package org.cropinformatics.ui;

import org.cropinformatics.common.ProgressMonitor;
import org.eclipse.core.runtime.IProgressMonitor;

public class ProgressMonitorWrapper implements ProgressMonitor
{
	private IProgressMonitor progressMonitor ;

	public ProgressMonitorWrapper(IProgressMonitor progressMonitor)
  {
	  super();
	  this.progressMonitor = progressMonitor;
  }

	@Override
	public void beginTask(String name, int totalWork)
	{
		progressMonitor.beginTask(name, totalWork) ;
	}

	@Override
	public void done()
	{
		progressMonitor.done() ;
	}

	@Override
	public void internalWorked(double work)
	{
		progressMonitor.internalWorked(work) ;
	}

	@Override
	public boolean isCanceled()
	{
		return progressMonitor.isCanceled() ;
	}

	@Override
	public void setCanceled(boolean value)
	{
		progressMonitor.setCanceled(value) ;
	}

	@Override
	public void setTaskName(String name)
	{
		progressMonitor.setTaskName(name) ;
	}

	@Override
	public void subTask(String name)
	{
		progressMonitor.subTask(name) ;
	}

	@Override
	public void worked(int work)
	{
		progressMonitor.worked(work) ;
	}

}
