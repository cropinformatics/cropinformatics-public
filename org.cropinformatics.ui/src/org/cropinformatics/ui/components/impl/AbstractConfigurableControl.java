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

import java.util.Date;

import org.cropinformatics.ui.PluginUtils;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public abstract class AbstractConfigurableControl<T extends ControlConfiguration> extends AbstractComponent<T>
{
  private Composite parent ;
  private Composite container ;
  private String errorMessage ;

  public AbstractConfigurableControl(Composite parent, T configuration)
  {
  	super(configuration) ;
  	
    this.parent = parent ;
    
    //errorMessage = null ;
  }

  public final Composite getParent()
  {
    return parent ;
  }
  
  public final Control getControl()
  {
    return container ;
  }

  public String getErrorMessage()
  {
    return errorMessage;
  }

  public final void initialise() 
  {
    if (!isInitialised())
    {
      container = createComponentCompositeIfNeeded(parent) ;
        
      preInitialiseComponent() ;
      initialiseComponent(container) ;
      postInitialiseComponent() ;
      super.initialise()  ;
      updateComponent() ;
    }
  }
  
  @Override
  public void dispose()
  {
    if (container != null && parent != container)
      container.dispose() ;
    
    container = null ;
    
    super.dispose() ;
  }
  
	public String getId()
  {
    return getClass().getName() ;
  }
	
	protected final Composite getComponentComposite()
  {
    return container ;
  }
  
  protected Composite createComponentCompositeIfNeeded(Composite parent)
  {
  	return ConfigurationUtils.createCompositeIfNeeded(parent, null, getConfiguration()) ;
  }
  
  protected final void setErrorMessage(String errorMessage)
  {
    this.errorMessage = errorMessage;
  }

  protected void preInitialiseComponent()
  {
    
  }
  
  protected abstract void initialiseComponent(Composite component) ;
  
  protected void postInitialiseComponent()
  {
    
  }
  
  /**
   * Create a new text based on the configuration if not null. If the configuration defines that
   * the text should not visible the method will return null 
   * 
   * @param configuration the parentConfiguration of the text
   * @param id the configuration identifier of the text 
   * @return a new text or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Text> createTextComponent(Composite parent, ControlConfiguration configuration)
  {
    return createTextComponent(parent, configuration, SWT.NONE) ;
  }
  
  /**
   * Create a new text based on the configuration if not null. If the configuration defines that
   * the text should not visible the method will return null 
   * 
   * @param configuration the parentConfiguration of the text
   * @param defaultStyle default style to be merged with the configuration style
   * @param id the configuration identifier of the text 
   * @return a new text or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Text> createTextComponent(Composite parent, ControlConfiguration configuration, int defaultStyle)
  {
    return ConfigurationUtils.createTextComponent(parent, configuration, new GridData(SWT.FILL, SWT.CENTER, true, false), defaultStyle) ;
  }

  /**
   * Create a new label based on the configuration if not null. If the configuration defines that
   * the label should not visible the method will return null 
   * 
   * @param configuration the configuration of the label
   * @param id the configuration identifier of the label 
   * @return a new label or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Label> createLabelComponent(Composite parent, ControlConfiguration configuration)
  {
    return createLabelComponent(parent, configuration, SWT.NONE) ;
  }
  
  /**
   * Create a new label based on the configuration if not null. If the configuration defines that
   * the label should not visible the method will return null 
   * 
   * @param configuration the configuration of the label
   * @param defaultStyle default style to be merged with the configuration style
   * @param id the configuration identifier of the label 
   * @return a new label or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Label> createLabelComponent(Composite parent, ControlConfiguration configuration, int defaultStyle)
  {
    return ConfigurationUtils.createLabelComponent(parent, configuration, new GridData(SWT.LEFT, SWT.CENTER, false, false), defaultStyle) ;
  }
  
  /**
   * Create a new button based on the configuration if not null. If the configuration defines that
   * the button should not visible the method will return null 
   * 
   * @param configuration the configuration of the button
   * @param id the configuration identifier of the button 
   * @return a new Button or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Button> createButtonComponent(Composite parent, ControlConfiguration configuration)
  {
    return createButtonComponent(parent, configuration, SWT.PUSH) ;
  }
  
  /**
   * Create a new button based on the configuration if not null. If the configuration defines that
   * the button should not visible the method will return null 
   * 
   * @param configuration the configuration of the button
   * @param defaultStyle default style to be merged with the configuration style
   * @param id the configuration identifier of the button 
   * @return a new Button or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Button> createButtonComponent(Composite parent, ControlConfiguration configuration, int defaultStyle)
  {
    return ConfigurationUtils.createButtonComponent(parent, configuration, new GridData(SWT.LEFT, SWT.CENTER, false, false), defaultStyle) ;
  }
  
  /**
   * Create a new Spinner based on the configuration if not null. If the configuration defines that
   * the spinner should not visible the method will return null 
   * 
   * @param configuration the configuration of the spinner
   * @param id the configuration identifier of the spinner 
   * @return a new Spinner or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Spinner> createSpinnerComponent(Composite parent, ControlConfiguration configuration)
  {
    return createSpinnerComponent(parent, configuration, SWT.NONE) ;
  }
  
  /**
   * Create a new Spinner based on the configuration if not null. If the configuration defines that
   * the spinner should not visible the method will return null 
   * 
   * @param configuration the configuration of the spinner
   * @param defaultStyle default style to be merged with the configuration style
   * @param id the configuration identifier of the spinner 
   * @return a new Spinner or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Spinner> createSpinnerComponent(Composite parent, ControlConfiguration configuration, int defaultStyle)
  {
    return ConfigurationUtils.createSpinnerComponent(parent, configuration, new GridData(SWT.LEFT, SWT.CENTER, false, false), defaultStyle) ;
  }
  
  /**
   * Create a new Combo based on the configuration if not null. If the configuration defines that
   * the spinner should not visible the method will return null 
   * 
   * @param configuration the configuration of the combo
   * @param id the configuration identifier of the spinner 
   * @return a new button or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Combo> createComboComponent(Composite parent, ControlConfiguration configuration)
  {
    return createComboComponent(parent, configuration, SWT.READ_ONLY) ;
  }
  
  /**
   * Create a new Combo based on the configuration if not null. If the configuration defines that
   * the spinner should not visible the method will return null 
   * 
   * @param configuration the configuration of the combo
   * @param defaultStyle default style to be merged with the configuration style
   * @param id the configuration identifier of the spinner 
   * @return a new button or null if not visible
   */
  protected final ControlComponent<ControlConfiguration, Combo> createComboComponent(Composite parent, ControlConfiguration configuration, int defaultStyle)
  {
    return ConfigurationUtils.createComboComponent(parent, configuration, new GridData(SWT.LEFT, SWT.CENTER, false, false), defaultStyle) ;
  }
  
  protected final DateEditComponent createDateEditComponent(Composite parent,
      ContainerConfiguration containerConfiguration, String label, Date date)
  {
    if (containerConfiguration != null)
      return (DateEditComponent)PluginUtils.getImplementation(DateEditComponent.class, 
          new Class[] {Composite.class, ContainerConfiguration.class, String.class, Date.class}, new Object[] {parent, containerConfiguration, label, date});
    else
      return (DateEditComponent)PluginUtils.getImplementation(DateEditComponent.class, 
          new Class[] {Composite.class, String.class, Date.class}, new Object[] {parent, label, date});
  }
}
