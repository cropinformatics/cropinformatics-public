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

import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class LabelledComponent extends AbstractConfigurableContainer<ContainerConfiguration>
{
  public static final String LABEL_TEXT_COMPONENT_ID = "label";
  
  private String labelValue;

  private Label label;
  
  public LabelledComponent(Composite parent, ContainerConfiguration containerConfiguration)
  {
    this(parent, containerConfiguration, null) ;
  }
  
  public LabelledComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue)
  {
    super(parent, containerConfiguration);
    
    this.labelValue = labelValue ;
  }
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = null ;
    ControlConfiguration controlConfiguration = null ;
    
    if (configuration instanceof ControlConfiguration)
      controlConfiguration = (ControlConfiguration)configuration ;
    
    if (LABEL_TEXT_COMPONENT_ID.equals(id) && labelValue != null)
    {
    	component = createLabelComponent(parent, controlConfiguration) ;
      
    	label = (Label)component.getControl() ;

      if (ConfigurationUtils.isMandatory(getConfiguration()))
      {
        FontData data = label.getFont().getFontData()[ 0 ];
        label.setFont(new Font(parent.getDisplay(), data.getName(), data.getHeight(), SWT.BOLD));
      }

      label.setText(labelValue) ;
    }
    
    return component ;
  }
  
  @Override
  protected final ContainerConfiguration getDefaultConfiguration()
  {
    return ConfigurationUtils.getContainerConfiguration(this);
  }
  
	@Override
  protected void registerChildComponentIDs()
  {
		super.registerChildComponentIDs(); 
		
  	registerChildComponentID(LABEL_TEXT_COMPONENT_ID) ;
  }

  protected final String getLabelValue()
  {
  	return labelValue;
  }

  protected final void setLabelValue(String labelValue)
  {
  	if (this.labelValue != labelValue)
  	{
  		this.labelValue = labelValue;
  	
  		if (label != null)
  			label.setText(this.labelValue) ;
  	}
  }
}
