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
package org.daveneti.ui.components.impl;

import java.util.List;

import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class StringComboViewerEditComponent extends AbstractComboViewerEditComponent<String, String>
{
	public StringComboViewerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, List<String> values, boolean allowingNewValues)
	{
		super(parent, containerConfiguration, labelValue, values, allowingNewValues) ;
	}

	public StringComboViewerEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String value, List<String> values, boolean allowingNewValues)
	{
		super(parent, containerConfiguration, labelValue, value, values, allowingNewValues);
	}

	@Override
  protected String parseToValue(String value)
  {
	  return value;
  }

	@Override
  protected String parseFromValue(String value)
  {
	  return value;
  }

	@Override
  protected boolean isValidValue(String value)
  {
	  return getValidValues().contains(value);
  }

	@Override
  protected void createCache()
  {

  }
}
