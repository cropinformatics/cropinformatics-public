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

import org.apache.commons.lang.ObjectUtils;

public class Mapping<F, T>
{
  private static final String MAPPING_LABEL = Mapping.class.getName() + ".mappingLabel";
	private static final String NULL_LABEL = Mapping.class.getName() + ".nullLabel";
	
	private F from ;
  private T to ;
  /**
   * @param from
   * @param to
   */
  public Mapping(F from, T to)
  {
    super();
    this.from = from;
    this.to = to;
  }
  
  public final F getFrom()
  {
    return from;
  }
  
  public final void setFrom(F from)
  {
    this.from = from;
  }
  
  public final T getTo()
  {
    return to;
  }
  
  public final void setTo(T to)
  {
    this.to = to;
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object object)
  {
    if (object instanceof Mapping)
      return ObjectUtils.equals(getFrom(), ((Mapping<F, T>)object).getFrom()) &&
        ObjectUtils.equals(getTo(), ((Mapping<F, T>)object).getTo()) ;
    else
      return false ;
  }

  @Override
  public String toString()
  {
    return getFromLabel(from) + PropertyUtils.getInstance().getString(MAPPING_LABEL) + getToLabel(to) ;
  }

	protected String getFromLabel(F from)
  {
	  return from != null ? from.toString() : PropertyUtils.getInstance().getString(NULL_LABEL);
  }
	
	protected String getToLabel(T to)
  {
	  return to != null ? to.toString() : PropertyUtils.getInstance().getString(NULL_LABEL);
  }
}
