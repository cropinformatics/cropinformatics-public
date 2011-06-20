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
package org.cropinformatics.ui.components.impl;

import org.cropinformatics.common.BaseIdentification;

public class Option extends BaseIdentification implements Comparable<Option>
{
  private int index ;
  private boolean enabled = true ;

  /**
   * @param uniqueIdentifier
   */
  public Option(String uniqueIdentifier, String name, int index)
  {
    this(uniqueIdentifier, name, null, index);
  }
  
  /**
   * @param uniqueIdentifier
   */
  public Option(String uniqueIdentifier, String name, String description, int index)
  {
    super(uniqueIdentifier, name);
    
    setIndex(index) ;
  }

  public final boolean isEnabled()
  {
    return enabled;
  }

  public final void setEnabled(boolean enabled)
  {
    this.enabled = enabled;
  }

  public final int getIndex()
  {
    return index;
  }

  protected final void setIndex(int index)
  {
    this.index = index;
  }

  public int compareTo(Option option)
  {
    if (option.getIndex() < index)
      return -1 ;
    else
      if (option.getIndex() > index)
        return -1 ;
      else
        return 0 ;
  }
  
  public boolean equals(Object object)
  {
    return super.equals(object) && object instanceof Option && index == ((Option)object).getIndex() ;
  }
}
