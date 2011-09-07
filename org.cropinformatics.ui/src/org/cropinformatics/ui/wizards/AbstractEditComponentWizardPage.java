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
package org.cropinformatics.ui.wizards;

import java.beans.PropertyChangeEvent;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.components.impl.AbstractConfigurableEditComponent;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractEditComponentWizardPage<C extends ControlConfiguration, T> extends AbstractControlWizardPage<C>
{
  public static final String VALUE_PROPERTY = AbstractConfigurableEditComponent.class.getName() + ".value";
  
  private T value ;
  
  /**
   * @param pageName
   * @param title
   * @param description
   * @param titleImage
   * @param configuration
   * @throws GCPException 
   */
  public AbstractEditComponentWizardPage(String pageName, String title,
      String description, ImageDescriptor titleImage,
      WizardPageConfiguration configuration, T value)
  {
    super(pageName, title, description, titleImage, configuration);
    setValue(value) ;
  }
  
  public final T getValue()
  {
    if (getEditComponent() != null)
      return getEditComponent().getValue() ;
    else
      return value ;  
  }

  public void setValue(T value)
  {
    if (this.value != value)
    {
      T oldValue = this.value ;
      
      this.value = value ;
      
      this.getPropertyChangeSupport().firePropertyChange(VALUE_PROPERTY, oldValue, this.value) ;
      
      if (getEditComponent() != null)
      	getEditComponent().setValue(this.value) ;
    }
  }
  
  @Override
  protected final Component<C> createComponent(Composite parent, C configuration, IRunnableContext runnableContext)
  {
		return createEditComponent(parent, configuration, value, runnableContext) ;
  }

	@Override
  protected void postInitialiseControl(Composite composite)
  {
	  super.postInitialiseControl(composite);
	  
	  checkValidation() ;
  }

	@Override
  protected void handlePropertyChange(PropertyChangeEvent event)
  {
		checkValidation() ;
  }
	
	protected void checkValidation()
	{
  	if (getEditComponent() != null)
  	{
  		if (getEditComponent().isValid())
  		{
  			setPageComplete(true) ;
    		setErrorMessage(null) ;
  		}
  		else
  		{
  			setPageComplete(false) ;
    		setErrorMessage(getEditComponent().getErrorMessage()) ;
  		}
  	}
  	else
  	{
  		setErrorMessage(null) ;
  	}
	}

  @SuppressWarnings("unchecked")
  protected final EditComponent<C, T> getEditComponent()
  {
    return (EditComponent<C, T>)getComponent();
  }

  protected abstract EditComponent<C, T> createEditComponent(
      Composite parent, C controlConfiguration, T value, IRunnableContext runnableContext) ;
}
