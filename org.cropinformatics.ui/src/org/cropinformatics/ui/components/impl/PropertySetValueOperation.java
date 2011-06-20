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

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.AbstractOperation;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class PropertySetValueOperation extends AbstractOperation
{
	private Object bean ;
	private String property ; 
	private Object value ;
	private Object oldValue ;
	private boolean canUndo ;

	public PropertySetValueOperation(String label, IUndoContext context, Object bean,
      String property, Object value)
  {
	  super(label);
    addContext(context);
	  
	  this.bean = bean;
	  this.property = property;
	  this.value = value;
	  canUndo = true ;
  }

	@Override
  public IStatus execute(IProgressMonitor monitor, IAdaptable info)
      throws ExecutionException
  {
		
		try
    {
	    oldValue = PropertyUtils.getProperty(bean, property);
    }
    catch (Exception e)
    {
  	  canUndo = false ;
    }
    
    try
    {
    	PropertyUtils.setProperty(bean, property, value) ;
      
      return Status.OK_STATUS;
    }
    catch (IllegalAccessException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
    catch (InvocationTargetException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
    catch (NoSuchMethodException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
  }

	@Override
  public IStatus redo(IProgressMonitor monitor, IAdaptable info)
      throws ExecutionException
  {
    try
    {
    	PropertyUtils.setProperty(bean, property, value) ;
      
      return Status.OK_STATUS;
    }
    catch (IllegalAccessException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
    catch (InvocationTargetException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
    catch (NoSuchMethodException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
  }

	@Override
  public IStatus undo(IProgressMonitor monitor, IAdaptable info)
      throws ExecutionException
  {
    try
    {
    	PropertyUtils.setProperty(bean, property, oldValue) ;
      
      return Status.OK_STATUS;
    }
    catch (IllegalAccessException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
    catch (InvocationTargetException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
    catch (NoSuchMethodException e)
    {
      throw new ExecutionException(e.getLocalizedMessage(), e) ;
    }
  }

	@Override
  public boolean canUndo()
  {
	  return canUndo ;
  }
}
