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
package org.cropinformatics.ui.views;

import org.cropinformatics.ui.configuration.ViewerConfiguration;
import org.cropinformatics.ui.viewers.ConfigurableViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractViewWithViewer<T extends ViewerConfiguration> extends AbstractView<T>
{
  private ConfigurableViewer<T> viewer ;
	private ISelectionChangedListener selectionChangedListener;
  
  public AbstractViewWithViewer()
  {

  }
  
  protected boolean isDeleteEnabled()
	{
  	if (viewer != null)
  		return viewer.isDeleteEnabled() ;
  	else
  		return false ;
	}
  
  protected void delete()
  {
  	if (viewer != null)
  		viewer.delete() ;
  }

  @Override
  protected final void createInternalViewer(Composite parent, T viewerConfigiration)
  {
    viewer = createViewer(parent, viewerConfigiration) ;
    
    viewer.initialise() ;
    
  	if (viewer instanceof ISelectionProvider)
  	{
  		getSite().setSelectionProvider((ISelectionProvider)viewer);
  		
  		selectionChangedListener = new ISelectionChangedListener()
  		{
				@Override
        public void selectionChanged(SelectionChangedEvent event)
        {
	        updateDeleteAction() ;
        }
  		} ;
  		
			((ISelectionProvider)viewer).addSelectionChangedListener(selectionChangedListener) ;
  	}
  }
  
  @Override
  protected final void disposeInternalViewer()
  {
  	if (viewer instanceof ISelectionProvider)
  	{
  		getSite().setSelectionProvider(null);
			((ISelectionProvider)viewer).removeSelectionChangedListener(selectionChangedListener) ;
  	}
  	
    if (viewer != null)
      viewer.dispose() ;
    
    viewer = null ;
  }

  protected final ConfigurableViewer<T> getViewer()
  {
    return viewer;
  }
  
  protected abstract ConfigurableViewer<T> createViewer(Composite parent, T viewerConfiguration) ;

}
