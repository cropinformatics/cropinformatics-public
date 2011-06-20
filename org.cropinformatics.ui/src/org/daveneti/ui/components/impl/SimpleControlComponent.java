/*******************************************************************************
 * Copyright 2010 Guy Davenport
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

import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.eclipse.swt.widgets.Control;

public class SimpleControlComponent<T extends Control> extends ControlComponent<ControlConfiguration, T>
{
	public SimpleControlComponent(T control)
  {
	  super(control, null);
  }
	
  public SimpleControlComponent(T control, ControlConfiguration configuration)
  {
    super(control, configuration);
  }

	@Override
  protected ControlConfiguration getDefaultConfiguration()
  {
		return  ConfigurationFactory.eINSTANCE.createControlConfiguration() ;
  }
}
