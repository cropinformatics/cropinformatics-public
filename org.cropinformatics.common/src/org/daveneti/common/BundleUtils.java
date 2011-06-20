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

import java.util.LinkedList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class BundleUtils
{
  private static final String DEFAULT_DELIMITER = ",";
  
  /**
   * Gets a string for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @return the required string
   */
  public static final String getString(ResourceBundle resourceBundle, String key)
  {
    try
    {
      return resourceBundle.getString(key);
    }
    catch (MissingResourceException e)
    {
      return '!' + key + '!';
    }
  }

  /**
   * Gets a string array for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @return the required string array
   */
  public static String[] getStringArray(ResourceBundle resourceBundle,
      String key)
  {
    try
    {
      String string = resourceBundle.getString(key);
      
      String[] array = string.split(DEFAULT_DELIMITER) ;
      
      for (int i = 0 ; i < array.length ; ++i)
        array[i] = array[i].trim() ;
        
      return array;
    }
    catch (MissingResourceException e)
    {
      return new String[]{'!' + key + '!'} ;
    }
  }
  
  /**
   * Gets a parameterised string for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public static final String getString(ResourceBundle resourceBundle, String key, String[] parameters)
  {
    String value = getString(resourceBundle, key) ;
    
    if (parameters != null && parameters.length > 0)
    {
      for (int i = 0; i < parameters.length; ++i)
      {
      	if (parameters[i] != null)
      		value = value.replace("{" + i + "}", parameters[i]);
      }
    }

    return value;
  }
  
  /**
   * Gets a parameterised string for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public static final String getString(ResourceBundle resourceBundle, String key, Object[] parameters)
  {
    String value = getString(resourceBundle, key) ;
    
    if (parameters != null && parameters.length > 0)
    {
      for (int i = 0; i < parameters.length; ++i)
      {
        value = value.replace("{" + i + "}", parameters[i] != null ? parameters[i].toString() : "");
      }
    }

    return value;
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
  public static String[] getStringArray(ResourceBundle resourceBundle,
      String key, String[] parameters)
  {
    try
    {
      String string = resourceBundle.getString(key);
      
      String[] array = string.split(DEFAULT_DELIMITER) ;
      
      for (int i = 0 ; i < array.length ; ++i)
      {
        array[i] = array[i].trim() ;
        
        if (parameters != null && parameters.length > 0)
        {
          for (int j = 0; j < parameters.length; ++j)
          {
            array[i] = array[i].replace("{" + j + "}", parameters[j]);
          }
        }
      }
      
      return array;
    }
    catch (MissingResourceException e)
    {
      return new String[]{'!' + key + '!'} ;
    }
  }
  
  /**
   * Gets a parameterised string for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public static final String getString(ResourceBundle resourceBundle, String key, int[] parameters)
  {
    String value = getString(resourceBundle, key) ;
    
    if (parameters != null && parameters.length > 0)
    {
      for (int i = 0; i < parameters.length; ++i)
      {
        value = value.replace("{" + i + "}", String.valueOf(parameters[i]));
      }
    }

    return value;
  }
  
  /**
   * Gets a parameterised string for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public static final String getString(ResourceBundle resourceBundle, String key, double[] parameters)
  {
    String value = getString(resourceBundle, key) ;
    
    if (parameters != null && parameters.length > 0)
    {
      for (int i = 0; i < parameters.length; ++i)
      {
        value = value.replace("{" + i + "}", String.valueOf(parameters[i]));
      }
    }

    return value;
  }
  
  
  /**
   * Gets a parameterised string array for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>}  where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string array
   */
  public static String[] getStringArray(ResourceBundle resourceBundle,
      String key, int[] parameters)
  {
    try
    {
      String string = resourceBundle.getString(key);
      
      String[] array = string.split(DEFAULT_DELIMITER) ;
      
      for (int i = 0 ; i < array.length ; ++i)
      {
        array[i] = array[i].trim() ;
        
        if (parameters != null && parameters.length > 0)
        {
          for (int j = 0; j < parameters.length; ++j)
          {
            array[i] = array[i].replace("{" + j + "}", String.valueOf(parameters[j]));
          }
        }
      }
      
      return array;
    }
    catch (MissingResourceException e)
    {
      return new String[]{'!' + key + '!'} ;
    }
  }
  
  /**
   * Gets a string list for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @return the required string list
   */
  public static List<String> getStringList(ResourceBundle resourceBundle,
      String key)
  {
    List<String> list = new LinkedList<String>() ;
    
    try
    {
      String string = resourceBundle.getString(key);
      
      String[] array = string.split(DEFAULT_DELIMITER) ;
      
      for (int i = 0 ; i < array.length ; ++i)
        list.add(array[i].trim()) ;
    }
    catch (MissingResourceException e)
    {
      list.add('!' + key + '!') ;
    }
    
    return list ;
  }

  /**
   * Gets a parameterised string list for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string list
   */
  public static List<String> getStringList(ResourceBundle resourceBundle,
      String key, String[] parameters)
  {
    List<String> list = new LinkedList<String>() ;
    
    try
    {
      String string = resourceBundle.getString(key);
      
      String[] array = string.split(DEFAULT_DELIMITER) ;
      
      for (int i = 0 ; i < array.length ; ++i)
      {
        array[i] = array[i].trim() ;
        
        if (parameters != null && parameters.length > 0)
        {
          for (int j = 0; j < parameters.length; ++j)
          {
            list.add(array[i].replace("{" + j + "}", parameters[j])) ;
          }
        }
      }
    }
    catch (MissingResourceException e)
    {
      list.add('!' + key + '!') ;
    }
    
    return list ;
  }
  
  /**
   * Gets a parameterised string list for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>}  where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string list
   */
  public static List<String> getStringList(ResourceBundle resourceBundle,
      String key, int[] parameters)
  {
    List<String> list = new LinkedList<String>() ;
    
    try
    {
      String string = resourceBundle.getString(key);
      
      String[] array = string.split(DEFAULT_DELIMITER) ;

      for (int i = 0 ; i < array.length ; ++i)
      {
        array[i] = array[i].trim() ;
        
        if (parameters != null && parameters.length > 0)
        {
          for (int j = 0; j < parameters.length; ++j)
          {
            list.add(array[i].replace("{" + j + "}", String.valueOf(parameters[j])));
          }
        }
      }
    }
    catch (MissingResourceException e)
    {
      list.add('!' + key + '!') ;
    }
    
    return list ;
  }
  
  /**
   * Gets a integer for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific integers required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required integer
   * @param key the key of the integer in the resource bundle
   * @return the required integer
   */
  public static final Integer getInteger(ResourceBundle resourceBundle, String key)
  {
    try
    {
      return Integer.valueOf(resourceBundle.getString(key));
    }
    catch (Exception e)
    {
      return null ;
    }
  }

  public static final boolean hasKey(ResourceBundle resourceBundle, String key)
  {
    try
    {
      resourceBundle.getString(key);

      return true ;
    }
    catch (MissingResourceException e)
    {
      return false ;
    }
  }
  
}
