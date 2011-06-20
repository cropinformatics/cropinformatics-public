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
package org.cropinformatics.ui.viewers;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ArrayLabelProvider extends LabelProvider implements ITableLabelProvider
{

  public Image getColumnImage(Object element, int columnIndex)
  {
    if (element instanceof Object[])
      return getColumnImageFromArray((Object[])element, columnIndex) ;
    else
      return null ;
  }

  public String getColumnText(Object element, int columnIndex)
  {
    if (element instanceof Object[])
      return getColumnTextFromArray((Object[])element, columnIndex) ;
    else
      return null ;
  }

  protected Image getColumnImageFromArray(Object[] array, int columnIndex)
  {
    if (columnIndex < array.length)
      return getImage(array[columnIndex]) ;
    else
      return null ;
  }

  protected String getColumnTextFromArray(Object[] array, int columnIndex)
  {
    if (columnIndex < array.length)
      return getText(array[columnIndex]) ;
    else
      return null ;
  }

}
