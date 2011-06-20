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

import java.math.BigDecimal;
import java.math.BigInteger;

public class ConversionUtilities
{
  public static final int SHORT               = 1 << 0 ;
  public static final int INTEGER             = 1 << 1 ;
  public static final int LONG                = 1 << 2 ;
  public static final int FLOAT               = 1 << 3 ;
  public static final int DOUBLE              = 1 << 4 ;
  public static final int BIG_INTEGER         = 1 << 5 ;
  public static final int BIG_DECIMAL         = 1 << 6 ;
  public static final int SIMPLE_IDENTIFER    = 1 << 7 ;
  public static final int STRING              = 1 << 9 ;
  
  public static final int DEFAULT_TYPES = INTEGER | DOUBLE | STRING ;
  @SuppressWarnings("unused")
  private static String DEFAULT_DELIMITER    = "&" ;

  public static final String convertToString(String value)
  {
    return value;
  }

  public static final Object convertToObject(String string)
  {
    return convertToObject(string, DEFAULT_TYPES);
  }

  public static final Object convertToObject(String string, int types)
  {
    Object value = null ;
    
    if (string != null)
    {
      if (value == null && (types & SHORT) != 0)
        value = convertToShortInternal(string) ;
      
      if (value == null && (types & INTEGER) != 0)
        value = convertToIntegerInternal(string) ;
      
      if (value == null && (types & LONG) != 0)
        value = convertToLongInternal(string) ;
      
      if (value == null && (types & FLOAT) != 0)
        value = convertToFloatInternal(string) ;
      
      if (value == null && (types & DOUBLE) != 0)
        value = convertToDoubleInternal(string) ;
      
      if (value == null && (types & BIG_INTEGER) != 0)
        value = convertToBigIntegerInternal(string) ;

      if (value == null && (types & BIG_DECIMAL) != 0)
        value = convertToBigDecimalInternal(string) ;
      
      if (value == null && (types & STRING) != 0)
        value = string ;
    }
    
    return value;
  }


  public static final BigDecimal convertToBigDecimal(String string) throws ConversionException
  {
    BigDecimal value = null ;
    
    if (string != null)
    {
      try
      {
        value = new BigDecimal(string) ;
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }
  
  public static final BigInteger convertToBigInteger(String string) throws ConversionException
  {
    BigInteger value = null ;
    
    if (string != null)
    {
      try
      {
        value = new BigInteger(string) ;
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }
  
  public static final Double convertToDouble(String string) throws ConversionException
  {
    Double value = null ;
    
    if (string != null)
    {
      try
      {
        value = Double.valueOf(string);
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }

  public static final Float convertToFloat(String string) throws ConversionException
  {
    Float value = null ;
    
    if (string != null)
    {
      try
      {
        value = Float.valueOf(string);
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }
  
  public static final Long convertToLong(String string) throws ConversionException
  {
    Long value = null ;
    
    if (string != null)
    {
      try
      {
        value = Long.valueOf(string);
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }
  public static final Integer convertToInteger(String string) throws ConversionException
  {
    Integer value = null ;
    
    if (string != null)
    {
      try
      {
        value = Integer.valueOf(string);
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }
  
  public static final Short convertToShort(String string) throws ConversionException
  {
    Short value = null ;
    
    if (string != null)
    {
      try
      {
        value = Short.valueOf(string);
      }
      catch (NumberFormatException e)
      {
        throw new ConversionException(e.getMessage(), e);
      }
    }
    
    return value ;
  }

  public static final String convertToString(Object value)
  {
    if (value != null)
      return value.toString() ;
    else
      return null ;
  }

  public static final Double convertToDouble(Object value) throws ConversionException
  {
    if (value != null)
    {
      if (value instanceof Double)
      {
        return (Double)value ;
      }
      else
      {
        if (value instanceof Number)
        {
          return ((Number)value).doubleValue() ;
        }
        else
        {
          if (value instanceof String)
          {
            return convertToDouble((String)value) ;
          }
          else
          {
            throw new ConversionException("Can not convert value to integer : " + value) ;
          }
        }
      }
    }
    else
    {
      return null ;
    }  
  }
  
  public static final Integer convertToInteger(Object value) throws ConversionException
  {
    if (value != null)
    {
      if (value instanceof Integer)
      {
        return (Integer)value ;
      }
      else
      {
        if (value instanceof Number)
        {
          return ((Number)value).intValue() ;
        }
        else
        {
          if (value instanceof String)
          {
            return convertToInteger((String)value) ;
          }
          else
          {
            throw new ConversionException("Can not convert value to integer : " + value) ;
          }
        }
      }
    }
    else
    {
      return null ;
    }  
  }

  private static final BigDecimal convertToBigDecimalInternal(String string)
  {
    try
    {
      return convertToBigDecimal(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }

  private static final BigInteger convertToBigIntegerInternal(String string)
  {
    try
    {
      return convertToBigInteger(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }

  private static final Double convertToDoubleInternal(String string)
  {
    try
    {
      return convertToDouble(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }

  private static final Float convertToFloatInternal(String string)
  {
    try
    {
      return convertToFloat(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }

  private static final Long convertToLongInternal(String string)
  {
    try
    {
      return convertToLong(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }

  private static final Integer convertToIntegerInternal(String string)
  {
    try
    {
      return convertToInteger(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }

  private static final Short convertToShortInternal(String string)
  {
    try
    {
      return convertToShort(string);
    }
    catch (ConversionException e)
    {
      return null ;
    }
  }
}
