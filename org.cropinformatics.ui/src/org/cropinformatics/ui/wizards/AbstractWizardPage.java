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
package org.cropinformatics.ui.wizards;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractWizardPage<T extends ControlConfiguration> extends WizardPage implements ConfigurableWizardPage
{
  public static final String VISIBILITY_PROPERTY = "visibility" ;
  
  private WizardPageConfiguration configuration ;
  private PropertyChangeSupport propertyChangeSupport;

	private boolean enabled;

  public AbstractWizardPage(String pageName, String title, String description,
      ImageDescriptor titleImage, WizardPageConfiguration configuration)
  {
    super(pageName, title, titleImage);
    
    setDescription(description);
    setConfiguration(configuration) ;
    enabled = getConfiguration().isEnabled() ;
    
    propertyChangeSupport = new PropertyChangeSupport(this);
  }
  
  public final void createControl(Composite parent)
  {
  	T childConfiguration = getChildControlConfiguration(getConfiguration()) ;
  	
    Composite composite = createComponentCompositeIfNeeded(parent, childConfiguration) ;
    
    initialiseControl(composite, childConfiguration) ;
    
    setControl(composite);
  }

  @Override
  public final void dispose()
  {
    disposeControl() ;
    
	  super.dispose();
  }

  public boolean isEnabled()
  {
  	return enabled ;
  }
  
  public void setEnabled(boolean enabled)
  {
  	this.enabled = enabled ;
  }
  
  public final boolean isVisible()
  {
    return getControl() != null && getControl().isVisible() ;
  }

	@Override
  public void setVisible(boolean visible)
  {
    if (isVisible() != visible)
    {
      boolean oldValue = isVisible() ;
      
      super.setVisible(visible) ;
      
      this.propertyChangeSupport.firePropertyChange(VISIBILITY_PROPERTY, oldValue, isVisible()) ;
    }
  }
  
  public synchronized void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public synchronized void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }
  
  public final WizardPageConfiguration getConfiguration()
  {
    return configuration;
  }
  
  public String getId()
  {
    return getClass().getName() ;
  }

  public void performCancel()
  {

  }
  
  public void performUpdate()
  {

  }
  
  protected Composite createComponentCompositeIfNeeded(Composite parent,
      ComponentConfiguration childConfiguration)
  {
    if (!ConfigurationUtils.isCreatingNewComposite(parent, childConfiguration))
    	return ConfigurationUtils.createComposite(parent, childConfiguration) ;
    else
    	return parent ;
  }

  protected void disposeControl()
  {

  }
	
  protected final PropertyChangeSupport getPropertyChangeSupport()
  {
    return propertyChangeSupport;
  }
  
  protected abstract T getChildControlConfiguration(WizardPageConfiguration configuration) ;
  
  protected abstract void initialiseControl(Composite parent, T controlConfiguration) ;
  
  protected WizardPageConfiguration getDefaultConfiguration()
  {
    return ConfigurationFactory.eINSTANCE.createWizardPageConfiguration() ;
  }
  
  private final void setConfiguration(WizardPageConfiguration configuration)
  {
    if (configuration != null)
      this.configuration = (WizardPageConfiguration)ConfigurationUtils.mergeConfiguration(getDefaultConfiguration(), configuration) ;
    
    if (this.configuration == null)
      this.configuration = getDefaultConfiguration() ;
  }

}
