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
package org.cropinformatics.ui.components.impl;

import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public abstract class ControlComponent<C extends ControlConfiguration, T extends Control> extends AbstractComponent<C>
{
  private T control ;
  
  private ControlComponent(C configuration)
  {
    super(configuration);
  }

  protected ControlComponent(Composite parent, C configuration)
  {
  	this(configuration) ;
  	
  	control = createDefaultControl(parent) ;
  }
  
  public ControlComponent(T control, C configuration)
  {
    super(configuration);
    
    this.control = control;
  }

	public final void initialise()
  {
    if (control == null)
      throw new NullPointerException("Control must be defined!") ;
    
  	super.initialise() ;
  }

  public void dispose()
  {
    if (control != null)
      control.dispose() ;
  }

  public final void setEnabled(boolean enabled)
  {
    if (control != null)
      control.setEnabled(enabled) ;
    
    super.setEnabled(enabled) ;
  }

  public final void setVisible(boolean visible)
  {
    if (control != null)
      control.setVisible(visible) ;
    
    super.setVisible(visible) ;
  }

	@Override
  public final void setEditable(boolean editable)
  {
    if (control != null)
    	if (control instanceof Button && (control.getStyle() | SWT.CHECK) > 0)
    		((Button)control).setGrayed(!editable) ;
    	else
      	if (control instanceof Text)
      		((Text)control).setEditable(editable) ;
      	else
      		control.setEnabled(editable) ;
    
    super.setEditable(editable) ;
  }

	public final Control getControl()
  {
    return control ;
  }
	
	public final T getInternalControl()
  {
    return control ;
  }

  public void updateComponent()
  {

  }

	@Override
  public String getId()
  {
		if (control != null)
      return control.getClass().getName() ;
		else
			return getClass().getName() ;
  }
	
  public boolean isValid()
  {
  	return true ;
  }
	
  protected T createDefaultControl(Composite parent)
  {
	  return null ;
  }
}
