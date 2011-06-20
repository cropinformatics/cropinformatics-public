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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class ViewerComponent<C extends ControlConfiguration, T extends Viewer> extends AbstractComponent<C>
{
  private T viewer ;
  
  private ViewerComponent(C configuration)
  {
    super(configuration);
  }

  protected ViewerComponent(Composite parent, C configuration)
  {
  	this(configuration) ;
  	
  	viewer = createDefaultViewer(parent) ;
  }
  
  public ViewerComponent(T viewer, C configuration)
  {
    super(configuration);
    
    this.viewer = viewer;
  }

  public void dispose()
  {
    if (viewer != null && viewer.getControl() != null)
    	viewer.getControl().dispose() ;
  }

  public final void setEnabled(boolean enabled)
  {
    if (viewer != null && viewer.getControl() != null)
      viewer.getControl().setEnabled(enabled) ;
    
    super.setEnabled(enabled) ;
  }

  public final void setVisible(boolean visible)
  {
    if (viewer != null && viewer.getControl() != null)
      viewer.getControl().setVisible(visible) ;
    
    super.setVisible(visible) ;
  }

	public final Control getControl()
  {
		if (viewer != null)
			return viewer.getControl() ;
		else
			return null ;
  }

  public void updateComponent()
  {
  	if (viewer != null)
  		viewer.refresh() ;
  }

	@Override
  public String getId()
  {
		if (viewer != null)
      return viewer.getClass().getName() ;
		else
			return getClass().getName() ;
  }
	
  public boolean isValid()
  {
  	return true ;
  }

	protected final T getViewer()
  {
		return viewer ;
  }
	
  protected T createDefaultViewer(Composite parent)
  {
	  return null ;
  }
}
