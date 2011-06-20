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
package org.cropinformatics.ui.components.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.BaseIdentification;

public class Options extends BaseIdentification
{
  private static final boolean DEFAULT_MUTUALLY_EXCLUSIVE = true ;

	public static final int UNSELECTED_INDEX = -1 ;
  
  private boolean mutuallyExclusive  ;
  private List<Option> options ;

  private Option defaultOption;
  
  /**
   * @param mutuallyExclusive 
   */
  public Options()
  {
    this(null, DEFAULT_MUTUALLY_EXCLUSIVE, null);
  }
  
  /**
   * @param mutuallyExclusive 
   */
  public Options(boolean mutuallyExclusive)
  {
    this(null, mutuallyExclusive, null);
  }
  
  /**
   * @param mutuallyExclusive
   * @param options
   */
  public Options(List<Option> options)
  {
    this(null, DEFAULT_MUTUALLY_EXCLUSIVE, options);
  }

  /**
   * @param mutuallyExclusive
   * @param options
   */
  public Options(boolean mutuallyExclusive, List<Option> options)
  {
    this(null, mutuallyExclusive, options);
  }

  /**
   * @param mutuallyExclusive 
   */
  public Options(String name)
  {
    this(name, DEFAULT_MUTUALLY_EXCLUSIVE, null);
  }
  
  /**
   * @param mutuallyExclusive 
   */
  public Options(String name, boolean mutuallyExclusive)
  {
    this(name, mutuallyExclusive, null);
  }
  
  /**
   * @param mutuallyExclusive
   * @param options
   */
  public Options(String name, List<Option> options)
  {
    this(name, DEFAULT_MUTUALLY_EXCLUSIVE, options);
  }

  /**
   * @param mutuallyExclusive
   * @param options
   */
  public Options(String name, boolean mutuallyExclusive, List<Option> options)
  {
    super(null, name);
    setMutuallyExclusive(mutuallyExclusive) ;
    setOptions(options) ;
  }

  public final boolean isMutuallyExclusive()
  {
    return mutuallyExclusive;
  }
  
  public final void setMutuallyExclusive(boolean mutuallyExclusive)
  {
    this.mutuallyExclusive = mutuallyExclusive;
  }
  
  public final List<Option> getOptions()
  {
    return options;
  }
  
  public final void setOptions(List<Option> options)
  {
    this.options = new LinkedList<Option>();
    
    if (options != null)
    {
      this.options.addAll(options) ;
    }
  }
  
  public final Option getOption(String uniqueIdentifier)
  {
    Iterator<Option> iterator = options.iterator() ;
    
    Option option = null ;
    
    if (uniqueIdentifier != null && uniqueIdentifier.length() > 0)
    {
      while (option == null && iterator.hasNext())
      {
        option = iterator.next() ;
        
        if (!uniqueIdentifier.equals(option.getUniqueIdentifier()))
          option = null ;
      }
    }
    
    return option ;
  }
  
  public final Option getOption(int index)
  {
    Iterator<Option> iterator = options.iterator() ;
    
    Option option = null ;
    
    if (index >= 0)
    {
      while (option == null && iterator.hasNext())
      {
        option = iterator.next() ;
        
        if (index != option.getIndex())
          option = null ;
      }
    }
    
    return option ;
  }
  
  public final void addOption(Option option)
  {
    if (option != null)
    {
      options.add(option) ;
    }
  }
  
  public final void removeOption(Option option)
  {
    if (option != null)
    {
      options.add(option) ;
    }
  }

  public Option getDefaultOption()
  {
    return defaultOption;
  }
  
  public void setDefaultOption(Option defaultOption)
  {
    if (options.contains(defaultOption))
      this.defaultOption = defaultOption ;
    else
      this.defaultOption = null ;
  }
  
  public void setDefaultOption(String uniqueIdentifier)
  {
    setDefaultOption(getOption(uniqueIdentifier)) ;
  }
  
  public void setDefaultOption(int index)
  {
    setDefaultOption(getOption(index)) ;
  }

  public int getDefaultOptionIndex()
  {
    if (defaultOption != null)
      return defaultOption.getIndex();
    else
      return -1 ;
  }
}
