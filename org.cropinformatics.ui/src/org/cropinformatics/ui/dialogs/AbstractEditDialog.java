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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractEditDialog<C extends ComponentConfiguration, T> extends AbstractDialog<C>
{
  private T value ;
  private EditComponent<C, T> editComponent;
  private PropertyChangeListener propertyChangeListener;

  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param value the value
   */
  public AbstractEditDialog(Shell parentShell, DialogConfiguration configuration, String title, T value)
  {
    this(parentShell, configuration, title, null, value);
  }
  

  /**
   * @param parentShell the parent shell, or <code>null</code> to create a top-level shell
   * @param configuration the viewer properties for this dialog
   * @param title the title of the dialog
   * @param message the message of the dialog
   * @param value the value
   */
  public AbstractEditDialog(Shell parentShell, DialogConfiguration configuration, String title, String message, T value)
  {
    super(parentShell, configuration, title, message);
    
    setValue(value) ;
  }
  
  public final T getValue()
  {
    return value;
  }

  public final void setValue(T value)
  {
    if (value != null)
      this.value = copyValue(value);
    else
      this.value = null ;
  }
  
  public final boolean close()
  {
    dispose() ;
    
    return super.close();
  }
  
  protected void dispose()
  {

  }

  protected abstract T copyValue(T value) ;
  
  @Override
  protected void updateButtons()
  {    
    super.updateButtons();
    
    if (getButton(OK) != null && editComponent != null)
      getButton(OK).setEnabled(editComponent.isValid()) ;
  }
  
  @Override
  protected final void initialiseControl(Composite parent,
      C controlConfiguration)
  {
    editComponent = createEditComponent(parent, controlConfiguration, value) ;
    
    propertyChangeListener = new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        handleComponentPropertyChangeEvent(event) ;
      }  
    } ;
    
    editComponent.addPropertyChangeListener(propertyChangeListener) ;
    
    editComponent.initialise() ;
  }

  protected void handleComponentPropertyChangeEvent(PropertyChangeEvent event)
  {
    updateButtons() ;
  }

  protected abstract EditComponent<C, T> createEditComponent(Composite parent,
      C controlConfiguration, T value) ;

}
