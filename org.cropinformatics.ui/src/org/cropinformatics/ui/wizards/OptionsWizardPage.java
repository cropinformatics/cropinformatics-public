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
package org.cropinformatics.ui.wizards;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;

import org.cropinformatics.ui.components.impl.Option;
import org.cropinformatics.ui.components.impl.Options;
import org.cropinformatics.ui.components.impl.OptionsComponent;
import org.cropinformatics.ui.components.impl.OptionsComponentWithButtons;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;

public class OptionsWizardPage extends AbstractWizardPage<ContainerConfiguration>
{
  private OptionsComponent optionsComposite ;
  private Options options ;
  
  public OptionsWizardPage(String pageName, String title, String description, Options options,
      ImageDescriptor titleImage, WizardPageConfiguration configuration)
  {
    super(pageName, title, description, titleImage, configuration);
    
    this.options = options ;
  }

	@Override
  protected void initialiseControl(Composite parent,
      ContainerConfiguration controlConfiguration)
  {
    optionsComposite = createOptionsComposite(parent, controlConfiguration, options) ;
    
    optionsComposite.addPropertyChangeListener(new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        handlePropertyChange(event.getPropertyName()) ;
      }
    }) ;
    
    optionsComposite.initialise() ;
    
    setPageComplete(isValidSelection()) ;
  }

  protected OptionsComponent createOptionsComposite(Composite parent, ContainerConfiguration configuration,
      Options options)
  {
    return new OptionsComponentWithButtons(parent, configuration, options) ;
  }

  public Option getSelectedOption()
  {
    if (optionsComposite != null)
      return optionsComposite.getSelectedOption() ;
    else
      return null ;
  }
  
  public List<Option> getSelectedOptions()
  {
    if (optionsComposite != null)
      return optionsComposite.getSelectedOptions() ;
    else
      return null ;
  }

  /**
   * Convenience method for testing if an a specific options is selected
   *  
   * @param optionId the id of the option
   * @return <code>true</code> if the given option is selected, <code>false</code> otherwise
   */
	public boolean isSelectedOption(String optionId)
  {
		if (optionsComposite != null)
		{
			if (optionsComposite.getOptions().isMutuallyExclusive())
			{
				return optionsComposite.getSelectedOption() != null && optionsComposite.getSelectedOption().getUniqueIdentifier() != null &&
					optionsComposite.getSelectedOption().getUniqueIdentifier().equals(optionId) ;
			}
			else
			{
				if (optionsComposite.getSelectedOptions() != null)
				{
					Iterator<Option> iterator = optionsComposite.getSelectedOptions().iterator() ;
					
					Option option ;
					
					boolean found = false ;
					
					while (!found && iterator.hasNext())
					{
						option = iterator.next() ;
						found = option != null && option.getUniqueIdentifier() != null && option.getUniqueIdentifier().equals(optionId) ;
					}
					
					return found ;
				}
			}
		}
		
		return false ;
  }
	
  protected void handlePropertyChange(String propertyName)
  {
    if (OptionsComponent.SELECTION_PROPERTY.equals(propertyName)) 
    {
      setPageComplete(isValidSelection()) ;
    }
  }

  protected boolean isValidSelection()
  {
  	if (optionsComposite != null)
  	{
  		if (optionsComposite.getOptions().isMutuallyExclusive())
  			return optionsComposite.getSelectedOption() != null && optionsComposite.getSelectedOption().isEnabled() ;
  		else
  			return optionsComposite != null && optionsComposite.getSelectedOptions().size() > 0; // TODO check for enabled options 
  	}
  	
  	return false ;
  }

	@Override
  protected ContainerConfiguration getChildControlConfiguration(
      WizardPageConfiguration configuration)
  {
		return ConfigurationUtils.getChildContainerControl(getConfiguration()) ;
  }
}
