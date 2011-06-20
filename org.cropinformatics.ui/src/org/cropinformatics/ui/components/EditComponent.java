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
package org.cropinformatics.ui.components;

import org.cropinformatics.ui.configuration.ComponentConfiguration;

/**
/**
 * A component used for editing an object of type <T>
 * @author Guy Davenport (guy@daveneti.com)
 *
 * @param <T> the type of the object to be edited
 */
public interface EditComponent<C extends ComponentConfiguration, T> extends Component<C>
{
  public static final String VALUE_CHANGED = EditComponent.class.getName() + ".valueChanged";
  public static final String VALUE_UPDATED = EditComponent.class.getName() + ".valueUpdated";
  
  public static final String MANDATORY_VALUE_NOT_DEFINED = EditComponent.class.getName() + ".valueNotValid";
  
  /**
   * Gets the value in the edit component
   * 
   * @return the current value in the edit component
   */
  public T getValue() ;
  
  /**
   * Sets the value in the edit component
   * 
   * @param value the value to be set in the edit component
   */
  public void setValue(T value)  ;

  /** 
   * If the edit component has an in valid value or any part of the component 
   * has an invalid content, then this method will return a message than 
   * can be displayed by the parent control
   * @return a message explaining why the component is not valid or null
   * if the component is valid 
   */
	public String getErrorMessage() ;
}
