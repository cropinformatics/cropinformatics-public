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
import org.eclipse.swt.widgets.Composite;

public interface ComponentProvider
{
  /**
   * Gets a component that can be used in side another component of control
   * 
   * @param parent the parent composite in which the component will be laid out
   * @param configuration the configuration of the component
   * @return an un-initialised component laid out in the given parent composite
   */
	public Component<? extends ComponentConfiguration> 
		createComponent(Composite parent, ComponentConfiguration configuration)  ;
	
}
