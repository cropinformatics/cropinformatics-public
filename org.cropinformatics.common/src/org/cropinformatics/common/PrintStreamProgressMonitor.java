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
package org.cropinformatics.common;

import java.io.PrintStream;

public class PrintStreamProgressMonitor implements ProgressMonitor
{
	private PrintStream printStream ;
	
	private int totalWork ;
	private double workdone ;
	private String name ;

	private boolean canceled;

	private String subtask;

	public PrintStreamProgressMonitor(PrintStream printStream)
  {
	  super();
	  this.printStream = printStream;
  }

	@Override
  public void beginTask(String name, int totalWork)
  {
		printStream.println("Begin : " + name) ;
		
		this.totalWork = totalWork ;
		this.name = name ;
  }

	@Override
  public void done()
  {
		printStream.println("End : " + name) ;
  }

	@Override
  public void internalWorked(double work)
  {
		workdone = workdone + work ;
		
		if (workdone > totalWork)
			workdone = totalWork ;
		
		printStream.println("Worked [" + subtask + "] : " + getPercentage() + " %") ;
  }

	private double getPercentage()
  {
	  return (workdone/totalWork)  * 100;
  }

	@Override
  public boolean isCanceled()
  {
	  return canceled;
  }

	@Override
  public void setCanceled(boolean canceled)
  {
	  this.canceled = canceled ;
  }

	@Override
  public void setTaskName(String name)
  {
		this.name = name ;
  }

	@Override
  public void subTask(String name)
  {
		this.subtask = name ;
		
		printStream.println("Started " + subtask + " : " + getPercentage() + " %") ;
  }

	@Override
  public void worked(int work)
  {
		workdone = workdone + work ;
		
		if (workdone > totalWork)
			workdone = totalWork ;
		
		printStream.println("Worked : " + (workdone/totalWork)  * 100 + " %") ;
  }
}
