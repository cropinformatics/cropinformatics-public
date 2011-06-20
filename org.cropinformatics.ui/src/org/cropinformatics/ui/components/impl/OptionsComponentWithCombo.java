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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 *
 */
public class OptionsComponentWithCombo extends OptionsComponent
{
  private static final String BLANK = "-";
  public static final String COMBO_COMPONENT_ID = "comboComponent";
  private static final int MAX_HEIGHT = 10;
  
  private int maxIndex ;
  private Combo combo ;
  private Option selectedOption ;
  private HashMap<String, Option> optionsByName;
	private ControlComponent<ControlConfiguration, Combo> component;
  
  public OptionsComponentWithCombo(Composite parent, ContainerConfiguration containerConfiguration, Options options)
  {
    super(parent, containerConfiguration, options);
    
    if (!getOptions().isMutuallyExclusive())
      throw new IllegalArgumentException("Options must be MutuallyExclusive for this implementation") ;
    
    optionsByName = new HashMap<String, Option>() ;
    
    if (options != null)
    {
      selectedOption = options.getDefaultOption() ;
    }
        
    maxIndex = -1 ;
  }

  @Override
  public Option getSelectedOption()
  {
    return selectedOption ;
  }

  @Override
  public List<Option> getSelectedOptions()
  {
    List<Option> options = new LinkedList<Option>() ;
    
    Option selectedOption = getSelectedOption() ;
      
    if (selectedOption != null)
      options.add(selectedOption) ;

    return options ;
  }
  
  @Override
  public void setSelectedOption(Option option)
  {
    if (combo != null)
    {
      if (option != null)
      {
        if (optionsByName.containsValue(option) && combo.getSelectionIndex() != option.getIndex())
        {
          Option oldValue = selectedOption ;
          selectedOption = option ;
        
          getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, selectedOption) ;
        }
      }
      else
      {
        if (selectedOption != null)
        {
          Option oldValue = selectedOption ;
          selectedOption = null ;
        
          getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, null) ;  
        }
      }
    }
    else
    {
      if (selectedOption != option)
      {
        Option oldValue = selectedOption ;
        selectedOption = option ;
      
        getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, selectedOption) ;  
      }
    }
  }

  @Override
  public void setSelectedOptions(List<Option> options)
  {
    if (options != null && options.size() > 0)
    {
      setSelectedOption(options.get(0)) ;
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
    
    if (combo != null)
      combo.setEnabled(isEnabled() && isEditable()) ;
  }

  @Override
  public void setVisible(boolean visible)
  {
    super.setVisible(visible);
    
    if (combo != null)
      combo.setVisible(visible) ;
  }
  
  @Override
  public void setEditable(boolean editable)
  {
    super.setEditable(editable);
    
    if (combo != null)
      combo.setEnabled(isEnabled() && isEditable()) ;
  }
  
  @Override
  protected int getMaxIndex()
  {
  	return maxIndex ;
  }
  
  @Override
  protected void initialiseComponent(Composite component)
  {
    initialiseLabel(component) ;
    initialiseCombo(component) ;
    initialiseOptions(component) ;
    
    if (combo != null && getOptions().getDefaultOptionIndex() >=0)
    {
      combo.select(getOptions().getDefaultOptionIndex()) ;
    }
  }
  
  protected void initialiseCombo(Composite parent)
  {
    ControlConfiguration childConfiguration = ConfigurationUtils.getChildControlConfiguration(getConfiguration(), COMBO_COMPONENT_ID) ;
    
    if (childConfiguration == null || childConfiguration.isVisible())
    {
    	component = createComboComponent(parent, childConfiguration) ;
      
    	combo = (Combo)component.getControl() ;
      
      combo.setVisible(isVisible()) ;
      
      combo.setEnabled(isEnabled() && isEditable()) ;
      
      combo.addSelectionListener(new SelectionListener()
      {
  
        public void widgetDefaultSelected(SelectionEvent e)
        {
          handleSelectionChange() ;
        }
  
        public void widgetSelected(SelectionEvent e)
        {
          handleSelectionChange() ;
        }
        
      }) ;
    }
  }

  @Override
  protected void addOption(Composite component, Option option, ComponentConfiguration childConfiguration)
  {
    if (option != null && !optionsByName.containsKey(option.getName()))
    {
    	if (maxIndex < option.getIndex())
    		maxIndex = option.getIndex() ;

    	if (combo.getVisibleItemCount() <= maxIndex && maxIndex >= MAX_HEIGHT)
    	{
    		combo.setVisibleItemCount(maxIndex + 1) ;
    	}

    	if (combo != null)
    	{
    		int start = combo.getItemCount() ;
    		for (int i = start ; i < option.getIndex() ; ++i) 
    			combo.add(BLANK, i) ;

    		combo.add(option.getName(), option.getIndex()) ;
    	}

    	optionsByName.put(option.getName(), option) ;
    }
  }

  protected void handleSelectionChange()
  {
    Option oldValue = selectedOption ;
    updateSelectedOption() ;
    
    getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, getSelectedOption()) ;
  }

  protected void updateSelectedOption()
  {
    if (combo != null && combo.getSelectionIndex() >=0 && !BLANK.equals(combo.getItem(combo.getSelectionIndex())))
    {
      selectedOption = optionsByName.get(combo.getItem(combo.getSelectionIndex())) ;
    }
    else
    {
      selectedOption = null ;
    }
    
  }
}
