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
package org.cropinformatics.ui.dialogs;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Configurable;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Base class for all dialogs 
 * 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 * @version $Id$
 *
 */
public abstract class AbstractDialog<C extends ComponentConfiguration> extends Dialog implements Configurable<DialogConfiguration>
{
  private String title ;
  private DialogConfiguration configuration;
  private Label messageLabel;
  private String message;
  
  /**
   * Creates a list dialog using the default viewer properties.
   * 
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   */
  public AbstractDialog(Shell parentShell, DialogConfiguration configuration, String title)
  {
    this(parentShell, configuration, title, null) ;
  }
  
  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   */
  public AbstractDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
  {
    super(parentShell);
    
    this.title = title ;
    this.message = message ;
    
    setConfiguration(configuration) ;
  }

  public final DialogConfiguration getConfiguration()
  {
    return configuration;
  }

  public String getId()
  {
    return getClass().getName() ;
  }

  @Override
  protected Control createDialogArea(Composite parent)
  {
    C childConfiguration = getChildControlConfiguration(getConfiguration()) ;
    
    Composite composite = createComponentCompositeIfNeeded(parent, childConfiguration) ;
    
    if (message != null)
    	createMessageArea(composite) ;
    	
    initialiseControl(composite, childConfiguration) ;
    
    return composite ;
  }
  
  protected Composite createComponentCompositeIfNeeded(Composite parent,
      ComponentConfiguration childConfiguration)
  {
    if (!ConfigurationUtils.isCreatingNewComposite(parent, childConfiguration))
    	return ConfigurationUtils.createComposite(parent, childConfiguration) ;
    else
    	return parent ;
  }
  
  protected Control createMessageArea(Composite composite) 
  {
    // create message
    if (message != null) {
      messageLabel = new Label(composite, getMessageLabelStyle());
      messageLabel.setText(message);
      GridDataFactory
          .fillDefaults()
          .align(SWT.FILL, SWT.BEGINNING)
          .grab(true, false)
          .hint(
              convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH),
              SWT.DEFAULT).applyTo(messageLabel);
    }
    return composite;
  }

	protected abstract C getChildControlConfiguration(DialogConfiguration configuration) ;
  
	@Override
  protected Control createContents(Composite parent)
  {
    Control control = super.createContents(parent);
    
    updateButtons() ;
    
    return control ;
  }

  protected void updateButtons()
  {

  }

  protected abstract void initialiseControl(Composite parent, C controlConfiguration) ;

  @Override
  protected final void configureShell(Shell newShell)
  {
    super.configureShell(newShell);
    newShell.setText(title);
  }
  
  protected DialogConfiguration createDefaultConfiguration()
  {
    DialogConfiguration dialogConfiguration = ConfigurationUtils.getDialogConfiguration(this);
    
    if (dialogConfiguration == null)
    {
      dialogConfiguration = ConfigurationFactory.eINSTANCE.createDialogConfiguration() ;
      dialogConfiguration.setId(getId()) ;
    }
    
    return dialogConfiguration ;
  }
  
  private final void setConfiguration(DialogConfiguration configuration)
  {  
    if (configuration != null)
    {
      this.configuration = configuration;
    }
    else 
    {
      this.configuration = createDefaultConfiguration();
    }
    
    Activator.saveConfiguration(this.configuration) ;
  }
  
  @Override
  protected final boolean isResizable()
  {
    if (getConfiguration() != null)
      return getConfiguration().isResizable() ; // TODO this is never called since this method is called before configuration is set 
    else
      return true ;
  }

  private int getMessageLabelStyle()
  {
    return SWT.WRAP;
  }
}
