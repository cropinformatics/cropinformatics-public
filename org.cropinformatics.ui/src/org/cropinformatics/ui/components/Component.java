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
package org.cropinformatics.ui.components;

import java.beans.PropertyChangeListener;

import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.eclipse.swt.widgets.Control;

/**
 * A component is any set of widgets or UI parts that are grouped together'
 * for reuse and componentization
 * 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 *
 */
public interface Component<C extends ComponentConfiguration> extends Configurable<C>
{
	public static final String VALID = Component.class.getName() + ".valid";
  
  /**
   * Determine if this component is valid, that is all the parts
   * text boxes, radio button, combo boxes etc contain valid values
   * @return <code>true</code> if this component is valid, <code>false</code> otherwise  
   */
  public boolean isValid() ;
  
  /**
   * Adds a PropertyChangeListener to response to any changes in the state of the component
   * @param listener a PropertyChangeListener that responses to any changes in the state of the component
   */
  public void addPropertyChangeListener(PropertyChangeListener listener) ;
  
  /**
   * Removes a PropertyChangeListener previously registered for this component
   * @param listener a PropertyChangeListener previously registered for this component
   */
  public void removePropertyChangeListener(PropertyChangeListener listener) ;
  
  public void initialise() ;
  
  public void dispose() ;
  
  public boolean isEnabled() ;
  
  public void setEnabled(boolean enabled) ;
  
  public boolean isVisible() ;
  
  public void setVisible(boolean visible) ;
  
  /**
   * Determine if this component is editable, that is all the parts
   * text boxes, radio button, combo boxes etc can be changed to
   * change properties in the contained value. The value
   * can still be changed using the {@link #setValue(Object)} method.
   * 
   * @return <code>true</code> if this component is editable, <code>false</code> otherwise 
   */
  public boolean isEditable() ;
  
  /**
   * Sets if this component is editable, that is all the parts
   * text boxes, radio button, combo boxes etc which when used
   * will change properties in the contained value. The value
   * can still be changed using the {@link #setValue(Object)} method
   * If set to <code>false</code> all controls will not be editable,
   * but will not be 'greyed out'. Use {@link #setEnabled(boolean)}
   * for this functionality
   * @param <code>true</code> if this component is to be editable, <code>false</code> otherwise 
   */
  public void setEditable(boolean editable) ;
  
  public Control getControl() ;
  
  public void updateComponent();
}
