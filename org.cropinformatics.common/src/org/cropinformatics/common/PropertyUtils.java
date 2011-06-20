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
package org.cropinformatics.common;

import java.util.ResourceBundle;

public class PropertyUtils extends AbstractPropertyUtils
{
  private static final String BUNDLE_NAME = "messages"; //$NON-NLS-1$
  
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  
  private static AbstractPropertyUtils instance;

	protected PropertyUtils()
  {
  	
  }
  
	public static final AbstractPropertyUtils getInstance()
  {
		if (instance == null)
			instance = new PropertyUtils() ;

	  return instance;
  }

	@Override
  protected ResourceBundle getResourceBundle()
  {
	  return RESOURCE_BUNDLE;
  }
}
