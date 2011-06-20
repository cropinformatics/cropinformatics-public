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
package org.daveneti.common;

import java.util.ResourceBundle;

public abstract class AbstractPropertyUtils
{
	protected AbstractPropertyUtils()
  {
  	
  }

  
	/**
   * Gets a string for the given key. Most commonly used for obtaining language 
   * specific text required in user interfaces.
   * 
   * @param key the key of the string in the resource bundle
   * @return the required string
   */
  public final String getString(String key)
  {
    return BundleUtils.getString(getResourceBundle(), key) ;
  }

	/**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {0} will be replaced by the parameter argument
   * 
   * @param key the key of the string in the resource bundle
   * @param parameter to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, String parameter)
  {
    return BundleUtils.getString(getResourceBundle(), key, new String[] {parameter}) ;
  }
  
	/**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {0} will be replaced by the parameter argument
   * 
   * @param key the key of the string in the resource bundle
   * @param parameter to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, Object parameter)
  {
    return BundleUtils.getString(getResourceBundle(), key, new Object[] {parameter}) ;
  }
  
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {0} will be replaced by the parameter argument
   * 
   * @param key the key of the string in the resource bundle
   * @param parameter to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, int parameter)
  {
    return BundleUtils.getString(getResourceBundle(), key, new String[] {String.valueOf(parameter)}) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, String... parameters)
  {
    return BundleUtils.getString(getResourceBundle(), key, parameters) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, int... parameters)
  {
    return BundleUtils.getString(getResourceBundle(), key, parameters) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, Object... parameters)
  {
    return BundleUtils.getString(getResourceBundle(), key, parameters) ;
  }

  /**
   * Gets a string array for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @return the required string array
   */
  public final String[] getStringArray(String key)
  {
    return BundleUtils.getStringArray(getResourceBundle(), key) ;
  }
  
  /**
   * Gets a parameterised string array for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string array
   */
  public final String[] getStringArray(String key, String[] parameters)
  {
    return BundleUtils.getStringArray(getResourceBundle(), key, parameters) ;
  }
  
  protected abstract ResourceBundle getResourceBundle() ;
}
