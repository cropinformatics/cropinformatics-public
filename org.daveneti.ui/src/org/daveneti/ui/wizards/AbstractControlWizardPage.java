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
package org.daveneti.ui.wizards;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.daveneti.ui.components.Component;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.WizardPageConfiguration;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractControlWizardPage<C extends ControlConfiguration> extends
    AbstractWizardPage<C>
{
	private Component<C> component;

	public AbstractControlWizardPage(String pageName, String title,
      String description, ImageDescriptor titleImage,
      WizardPageConfiguration configuration)
  {
	  super(pageName, title, description, titleImage, configuration);
  }

	protected final Component<C> getComponent()
  {
  	return component;
  }
	
	@Override
  protected final void initialiseControl(Composite parent,
  		C controlConfiguration)
  {
		if (getWizard() != null && getWizard().getContainer() != null)
			component = createComponent(parent, controlConfiguration, getWizard().getContainer()) ;
		else
			component = createComponent(parent, controlConfiguration, null) ;

		component.initialise() ;

		component.addPropertyChangeListener(new PropertyChangeListener()
		{
			public void propertyChange(PropertyChangeEvent event)
			{
				handlePropertyChange(event) ;
		  	getPropertyChangeSupport().firePropertyChange(event) ; // pass event to page property change listeners TODO find a more elegant solution
			}

		}) ;
  }

  protected void handlePropertyChange(PropertyChangeEvent event)
  {
  	if (component != null)
  	{
  		setPageComplete(component.isValid()) ;
  	}
  	else
  	{
  		setPageComplete(false) ;
  	}
  }
  
  @Override
  protected final void disposeControl()
  {
    if (component != null)
    	component.dispose() ;
  }


  protected abstract Component<C> createComponent(Composite parent, C configuration, IRunnableContext runnableContext);
  
}
