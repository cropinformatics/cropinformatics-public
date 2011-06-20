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

import java.util.Iterator;
import java.util.List;

import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 *
 */
public abstract class OptionsComponent extends AbstractConfigurableControl<ContainerConfiguration>
{
  public static final String LABEL_COMPONENT_ID = "label";
  public static final String SELECTION_PROPERTY = OptionsComponent.class.getName() + ".selecton";
  
  private Options options ;
  private ControlComponent<ControlConfiguration, Label> label;
  
  public OptionsComponent(Composite parent, ContainerConfiguration containerConfiguration, Options options)
  {
    super(parent, containerConfiguration);
    
    this.options = options ;
  }
  
  public final Options getOptions()
  {
    return options ;
  }

  public abstract Option getSelectedOption() ;
  
  public abstract List<Option> getSelectedOptions() ;
  
  public abstract void setSelectedOption(Option option) ;
  
  public int getSelectedOptionIndex()
  {
  	if (getSelectedOption() != null)
  	{
  		return getSelectedOption().getIndex() ;
  	}
  	else
  	{
  		return Options.UNSELECTED_INDEX ;
  	}
  }

  public abstract void setSelectedOptions(List<Option> options) ;

  public final void setSelectedOptionIndex(int index)
  {
  	if (index >= 0 && index <= getMaxIndex())
  	{
  		setSelectedOption(options.getOption(index)) ;
  	}
  	else
  	{
      setSelectedOption(null) ;   
  	}
  }

	@Override
  public void setEnabled(boolean enabled)
  {
    super.setEnabled(enabled);
    
    if (label != null)
      label.setEnabled(enabled) ;
  }

  @Override
  public void setVisible(boolean visible)
  {
    super.setVisible(visible);
    
    if (label != null)
      label.setVisible(visible) ;
  }

  public boolean isValid()
  {
  	// TODO
  	return true ;
  }

  protected abstract int getMaxIndex() ;
  
  @Override
  protected void initialiseComponent(Composite component)
  {
    initialiseLabel(component) ;
    initialiseOptions(component) ;
  }
  
  protected void initialiseLabel(Composite component)
  {
    if (options != null)
    {
      ControlConfiguration childConfiguration = ConfigurationUtils.getChildControlConfiguration(getConfiguration(), LABEL_COMPONENT_ID) ;
      
      if (options.getName() != null && options.getName().length() > 0 &&(childConfiguration == null || childConfiguration.isVisible()))
      {
        label = createLabelComponent(component, childConfiguration) ;
        
        label.getInternalControl().setText(options.getName()) ;
      }
    }
  }
  
  protected final void initialiseOptions(Composite component)
  {
    if (options != null)
    {
      Iterator<Option> iterator = options.getOptions().iterator() ;
      
      while (iterator.hasNext())
        initialiseOption(component, iterator.next()) ;
    }
  }

  private void initialiseOption(Composite component, Option option)
  {
  	ComponentConfiguration componentConfiguration = ConfigurationUtils.getChildComponentConfiguration(getConfiguration(), option.getUniqueIdentifier()) ;
  	
  	if (componentConfiguration != null && componentConfiguration.isSetEnabled())
  		option.setEnabled(componentConfiguration.isEnabled()) ;
  	
    if (ConfigurationUtils.isVisible(componentConfiguration, true))
      addOption(component, option, componentConfiguration) ;
  }

  protected abstract void addOption(Composite component, Option option, ComponentConfiguration childConfiguration) ;
  
  protected final boolean isLabelInUse()
  {
    ComponentConfiguration childConfiguration = ConfigurationUtils.getChildConfiguration(getConfiguration(), LABEL_COMPONENT_ID) ;
    
    return options.getName() != null && options.getName().length() > 0 &&(childConfiguration == null || childConfiguration.isVisible()) ;
  }
  
  @Override
  protected final ContainerConfiguration getDefaultConfiguration()
  {
    return ConfigurationUtils.getContainerConfiguration(this);
  }
}
