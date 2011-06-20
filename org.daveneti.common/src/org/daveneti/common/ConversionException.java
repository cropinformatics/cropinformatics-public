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

/**
 * Exception thrown in the process of conversion
 *
 * @author <A HREF="mailto:g.davenport@cgiar.org">Guy Davenport (guy@daveneti.com)</A>
 * @version $Id$
 *
 */
public class ConversionException extends Exception
{
    static final long serialVersionUID = 1 ;

  public ConversionException(String message)
  {
    super(message) ;
  }

  public ConversionException(String message, Throwable cause)
  {
    super(message, cause) ;
  }
  
  public ConversionException(ConversionException matrixException)
  {
    super(matrixException.getMessage(), matrixException.getCause()) ;
  }
}
