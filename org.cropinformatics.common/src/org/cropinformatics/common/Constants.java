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

public class Constants
{
  public static final int INVALID_INDEX = -1;
  
  /**
   * Value return if the number of rows can not be determined
   */
  public static final int UNKNOWN_ROW_COUNT = -1 ; 
  
  /**
   * Value return if the number of columns can not be determined
   */
  public static final int UNKNOWN_COLUMN_COUNT = -1 ; 
  
  /**
   * Value return if the current row index can not be determined
   */
  public static final int UNKNOWN_ROW_INDEX = -1 ; 
  
  /**
   * Value return if the current column index can not be determined
   */
  public static final int UNKNOWN_COLUMN_INDEX = -1 ;

  public static final String EMPTY_STRING = "" ;
  
  public static final String TAB_DELIMITER = "\t";

  public static final String COMMA_DELIMITER = ",";
  
  public static final String DEFAULT_DELIMITER = TAB_DELIMITER ;
  
  public static final String DEFAULT_COMMENT = "#";

  public static final String QUOTE = "\"";

  public static final String CLASSICATION_DELIMITER = ", ";
  
  public static final String COLLECTION_LABEL_DELIMITER = ", ";
 
  public static final String ARRAY_LABEL_DELIMITER = ", ";
  
  public static final String MAP_LABEL_DELIMITER = ", ";

  public static final String MAP_KEY_VALUE_LABEL_DELIMITER = "=";
}
