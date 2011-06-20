/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy@daveneti.com) under contract by
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
package org.daveneti.ui.components.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * 
 * @author Guy Davenport (guy@daveneti.com)
 *
 */
public class OptionsComponentWithButtons extends OptionsComponent
{
  private int maxIndex ;
  private TreeMap<Option, Button> optionsButtons ;
  int buttonStyle ;

  private Option selectedOption;
  private List<Option> selectedOptions;
  private boolean initialised = false ;
  
  public OptionsComponentWithButtons(Composite parent, ContainerConfiguration containerConfiguration, Options options)
  {
    super(parent, containerConfiguration, options);
    
    maxIndex = -1 ;
    optionsButtons = new TreeMap<Option, Button>() ;
    selectedOptions = new LinkedList<Option>() ;
    
    if (options != null)
    {
      selectedOption = options.getDefaultOption() ;
      selectedOptions.add(options.getDefaultOption()) ;
    }
  }
  
  @Override
  protected void initialiseComponent(Composite component)
  {
    if (getOptions() != null)
    {
      if (getOptions().isMutuallyExclusive())
        buttonStyle = SWT.RADIO ;
      else
        buttonStyle = SWT.TOGGLE ;
      
      if (isLabelInUse() && getConfiguration() != null && getConfiguration().getLabel() != null && component instanceof Group)
      {      
        ((Group)component).setText(getOptions().getName()) ;
        
        initialiseOptions(component) ;
      }
      else
      {
        initialiseLabel(component) ;
        initialiseOptions(component) ;
      }
    }
    
    initialised = true ;
  }

  @Override
  public Option getSelectedOption()
  {
    return selectedOption;
  }

  @Override
  public List<Option> getSelectedOptions()
  {
    return selectedOptions ;
  }
  
  @Override
  public void setSelectedOption(Option selectedOption)
  {
    if (this.selectedOption != selectedOption)
    {
      if (initialised)
      {
        if (optionsButtons.containsKey(selectedOption))
        {
          Option oldValue = this.selectedOption ;
          this.selectedOption = selectedOption ;
          selectedOptions = new LinkedList<Option>() ;
          selectedOptions.add(this.selectedOption) ;
    
          Iterator<Option> iterator = optionsButtons.keySet().iterator() ;
          
          Option currentOption ;
          
          while (iterator.hasNext())
          {
            currentOption = iterator.next() ;
            
            optionsButtons.get(currentOption).setSelection(currentOption == this.selectedOption) ;
          }
          
          getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, this.selectedOption) ;
        }
      }
      else
      {
        if (this.selectedOption != selectedOption)
        {
          Option oldValue = selectedOption ;
          this.selectedOption = selectedOption ;
          selectedOptions = new LinkedList<Option>() ;
          selectedOptions.add(this.selectedOption) ;
          getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, this.selectedOption) ;
        }
      }
    }
  }

  @Override
  public void setSelectedOptions(List<Option> selectedOptions)
  {
    List<Option> newSelectedOptions = new LinkedList<Option>() ;
    
    if (selectedOptions != null)
    {
      if (getOptions().isMutuallyExclusive() && newSelectedOptions.size() > 0)
      {
        newSelectedOptions = new LinkedList<Option>() ;
        
        newSelectedOptions.add(selectedOptions.get(0)) ;
      }
      else
      {
        newSelectedOptions.addAll(selectedOptions) ;
      }
    }
    
    if (initialised)
    {
      if (!this.selectedOptions.containsAll(newSelectedOptions) || !newSelectedOptions.containsAll(this.selectedOptions))
      {
        Iterator<Option> iterator = optionsButtons.keySet().iterator() ;

        Option currentOption ;

        while (iterator.hasNext())
        {
          currentOption = iterator.next() ;

          optionsButtons.get(currentOption).setSelection(!newSelectedOptions.contains(currentOption)) ;
        }
        
        this.selectedOptions = newSelectedOptions ;
      }
    }
    else
    {
      List<Option> oldValue = this.selectedOptions ;
      this.selectedOptions = newSelectedOptions ;
      
      getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, this.selectedOption) ;
    }
    
    if (!this.selectedOptions.isEmpty())
      this.selectedOption = this.selectedOptions.get(0) ;
  }
  
  @Override
  public void setEnabled(boolean enabled)
  {
    super.setEnabled(enabled);
    
    if (optionsButtons != null)
    {
	    Iterator<Entry<Option, Button>> iterator = optionsButtons.entrySet().iterator() ;
	    
	    Entry<Option, Button> entry ;
	    
	    while (iterator.hasNext())
	    {
	    	entry = iterator.next() ;
	    	entry.getValue().setEnabled(enabled && entry.getKey().isEnabled()) ;
	    }
    }
  }

  @Override
  public void setVisible(boolean visible)
  {
    super.setVisible(visible);
    
    if (optionsButtons != null)
    {
	    Iterator<Button> iterator = optionsButtons.values().iterator() ;
	    
	    while (iterator.hasNext())
	      iterator.next().setVisible(visible) ;
    }
  }

  @Override
  public void setEditable(boolean editable)
  {
    super.setEditable(editable);
    
    if (optionsButtons != null)
    {
	    Iterator<Button> iterator = optionsButtons.values().iterator() ;
	    
	    while (iterator.hasNext())
	      iterator.next().setGrayed(editable) ;
    }
  }
  
  @Override
  protected int getMaxIndex()
  {
  	return maxIndex ;
  }
  
  @Override
  protected void addOption(Composite component, Option option, ComponentConfiguration childConfiguration)
  {
    if (option != null && !optionsButtons.containsKey(option))
    {
    	ControlConfiguration controlConfiguration = null ;
    	
    	if (childConfiguration instanceof ControlConfiguration)
    		controlConfiguration = (ControlConfiguration)childConfiguration ;

    	if (maxIndex < option.getIndex())
    		maxIndex = option.getIndex() ;

    	Button button = createButtonComponent(component, controlConfiguration, buttonStyle).getInternalControl();

    	button.setText(option.getName());

    	if (getOptions().getDefaultOption() != null && getOptions().getDefaultOption().getUniqueIdentifier().equals(option.getUniqueIdentifier()))
    	{
    		button.setSelection(true);
    		selectedOption = option ;
    	}

    	button.setVisible(isVisible()) ;

    	button.setEnabled(isEnabled() && option.isEnabled()) ;
    	
    	button.setGrayed(isEditable()) ;

    	optionsButtons.put(option, button);
    	button.addSelectionListener(new SelectionListener()
    	{
    		public void widgetDefaultSelected(SelectionEvent event)
    		{
    			handleSelectionChange();
    		}

    		public void widgetSelected(SelectionEvent event)
    		{
    			handleSelectionChange();
    		}

    	});
    }
  }

  protected void handleSelectionChange()
  {
    if (getOptions().isMutuallyExclusive())
    {
      Option oldValue = selectedOption ;
      updateSelectedOption() ;
      getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, getSelectedOption()) ;
    }
    else
    {
      List<Option> oldValue = selectedOptions ;
      updateSelectedOptions() ;
      getPropertyChangeSupport().firePropertyChange(SELECTION_PROPERTY, oldValue, getSelectedOptions()) ;
    }
  }
  
  protected void updateSelectedOption()
  {
    if (initialised)
    {
      Iterator<Entry<Option,Button>> iterator = optionsButtons.entrySet().iterator() ;
      
      Entry<Option,Button> entry = null ;
      Option option = null ;
      
      while (option == null && iterator.hasNext())
      {
      	entry = iterator.next() ;
        
        if (entry.getValue().getSelection())
          option = entry.getKey() ;
      }
      
      selectedOption = option ;
    }
  }

  protected void updateSelectedOptions()
  {
    if (initialised)
    {
      List<Option> options = new LinkedList<Option>() ;
      
      Iterator<Entry<Option,Button>> iterator = optionsButtons.entrySet().iterator() ;
        
      Entry<Option,Button> entry = null ;
        
      while (entry == null && iterator.hasNext())
      {
      	entry = iterator.next() ;
          
        if (entry.getValue().getSelection())
          options.add(entry.getKey()) ;
      }
      
      selectedOptions = options ;
    }
  }
}
