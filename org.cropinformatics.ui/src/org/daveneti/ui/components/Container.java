/*******************************************************************************
 * Copyright 2011 Guy Davenport
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
package org.daveneti.ui.components;

import java.util.Collection;

import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ContainerConfiguration;

public interface Container<C extends ContainerConfiguration> extends Component<C>
{
  /**
   * Determines if a component has be initialised
   * 
   * @param id the id of the component
   * @return <code>true</code> if the component has be initialised, <code>false</code> otherwise
   */
  public boolean hasChildComponent(String id) ;

  /**
   * Gets the child component of the given id, if has been initialised
   * @param id the id of the component
   * @return he child component of the given id, if has been initialised
   */
  public Component<? extends ComponentConfiguration> getChildComponent(String id) ;
  
  /**
   * Gets all of the child components
   * @return all of the child components
   */
  public Collection<Component<? extends ComponentConfiguration>> getChildComponents() ;
  
}
