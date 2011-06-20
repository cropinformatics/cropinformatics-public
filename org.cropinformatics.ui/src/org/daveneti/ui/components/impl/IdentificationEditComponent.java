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

import org.daveneti.common.BaseIdentification;
import org.daveneti.common.Identification;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class IdentificationEditComponent<T extends Identification> extends AbstractIdentificationEditComponent<T>
{
  public IdentificationEditComponent(Composite parent,
      ContainerConfiguration configuration)
  {
	  super(parent, configuration);
  }

	public IdentificationEditComponent(Composite parent,
      ContainerConfiguration configuration, T value)
  {
    super(parent, configuration, value);
  }
  
  @SuppressWarnings("unchecked")
  protected T createDefaultValue()
  {
    return (T) new BaseIdentification() ;
  }
  
  protected String getUniqueIdentifier()
  {
	  return getValue() != null ? getValue().getUniqueIdentifier() : null;
  }

  protected String getName()
  {
	  return getValue() != null ? getValue().getName() : null;
  }

  protected final String getDescription()
  {
	  return getValue() != null ? getValue().getDescription() : null;
  }

	@Override
  protected void setUniqueIdentifier(String uniqueIdentifier)
  {
    getValue().setUniqueIdentifier(uniqueIdentifier) ;
  }
  
	@Override
  protected void setName(String name)
  {
    getValue().setName(name) ;
  }

  protected final void setDescription(String description)
  {
    getValue().setDescription(description) ;
  }

}
