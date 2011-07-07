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
package org.cropinformatics.ui.components.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractConfigurable
{
  public static final String VISIBLE = "visible" ;
  public static final String EDITABLE = "editable" ;
  public static final String ENABLED = "enabled" ;

  private PropertyChangeSupport propertyChangeSupport;
  private boolean enabled = true ;
  private boolean visible = true ;
  private boolean editable = true ;
  private boolean initialised = false ;
  
	private IUndoContext undoContext = null ;
	private IOperationHistoryListener operationHistoryListener;

  public AbstractConfigurable()
  {
    propertyChangeSupport = new PropertyChangeSupport(this);
  }
  
  public final IUndoContext getUndoContext()
  {
    return undoContext;
  }
  
  public final void setUndoContext(IUndoContext undoContext)
  {
  	this.undoContext = undoContext;
  	
  	if (undoContext != null)
  	{

    	operationHistoryListener = new IOperationHistoryListener()
    	{
  			@Override
        public void historyNotification(OperationHistoryEvent event)
        {
  				if (event.getEventType() ==	OperationHistoryEvent.UNDONE)
  				{
  					operationUndone(event.getOperation()) ;
  				}
  				else
  				{
    				if (event.getEventType() ==	OperationHistoryEvent.REDONE)
    				{
    					operationRedone(event.getOperation()) ;
    				}
  				}
        }
    	} ; 	
    	
	  	PlatformUI.getWorkbench().getOperationSupport()
	    .getOperationHistory().addOperationHistoryListener(operationHistoryListener) ;
  	}
  	else
  	{
      if (operationHistoryListener != null)
      	PlatformUI.getWorkbench().getOperationSupport()
        .getOperationHistory().removeOperationHistoryListener(operationHistoryListener) ;
  	}

  }
  
  protected void operationRedone(IUndoableOperation operation)
  {

  }

	protected void operationUndone(IUndoableOperation operation)
  {

  }

	public void dispose()
  {
    propertyChangeSupport = null ;
    
    if (operationHistoryListener != null)
    	PlatformUI.getWorkbench().getOperationSupport()
      .getOperationHistory().removeOperationHistoryListener(operationHistoryListener) ;
  }

  public final synchronized void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public final synchronized void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }

  public final boolean isEnabled()
  {
    return enabled  ;
  }
  
  public void setEnabled(boolean enabled)
  {
  	if (this.enabled != enabled)
  	{
  		boolean oldValue = this.enabled ;
  		this.enabled = enabled ;
  		
  		if (isInitialised())
  			getPropertyChangeSupport().firePropertyChange(ENABLED, oldValue, this.enabled) ;
  	}
  }
  
  public final boolean isVisible()
  {
    return visible ;
  }
  
  public void setVisible(boolean visible)
  {
  	if (this.visible != visible)
  	{
  		boolean oldValue = this.visible ;
  		this.visible = visible ;
  		
  		if (isInitialised())
  			getPropertyChangeSupport().firePropertyChange(VISIBLE, oldValue, this.visible) ;
  	}
  }
  
  public final boolean isEditable()
  {
  	return editable;
  }

	public void setEditable(boolean editable)
  {
  	if (this.editable != editable)
  	{
  		boolean oldValue = this.editable ;
  		this.editable = editable ;
  		
  		if (isInitialised())
  			getPropertyChangeSupport().firePropertyChange(EDITABLE, oldValue, this.editable) ;
  	}
  }
  
  public void initialise() 
  {
    if (!isInitialised())
    {
      initialised = true ;
    }
  }
  
  protected final boolean isInitialised()
  {
    return initialised ;
  }

  protected final PropertyChangeSupport getPropertyChangeSupport()
  {
    return propertyChangeSupport;
  }
  
	/*
   * Get the operation history from the workbench.
   */
  protected final IOperationHistory getOperationHistory()
  {
    return PlatformUI.getWorkbench().getOperationSupport()
        .getOperationHistory();
  }
}
