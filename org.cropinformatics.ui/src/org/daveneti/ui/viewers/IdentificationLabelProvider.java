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
package org.daveneti.ui.viewers;

import org.daveneti.common.Identification;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableFontProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

public class IdentificationLabelProvider extends LabelProvider 
  implements IFontProvider, IColorProvider, ITableLabelProvider, ITableFontProvider, ITableColorProvider 
{

  public String getText(Object element)
  {
    if (element instanceof IAdaptable)
    {
      Object adaptedObject = ((IAdaptable)element).getAdapter(Identification.class) ;
      
      if (adaptedObject != null)
        element = adaptedObject ;
    }
    
    if (element instanceof Identification)
    {
      return ((Identification)element).getName();
    }
    else
    {
      return super.getText(element);
    }
  }
  
  public Image getImage(Object element)
  {
    Image image = super.getImage(element) ;
      
    if (element instanceof IAdaptable)
    {
      Object adaptedObject = ((IAdaptable)element).getAdapter(Identification.class) ;
      
      if (adaptedObject != null)
        element = adaptedObject ;
    }
    
    return image ;
  }

  public Image getColumnImage(Object element, int index)
  {
    if (element instanceof IAdaptable)
    {
      Object adaptedObject = ((IAdaptable)element).getAdapter(Identification.class) ;
      
      if (adaptedObject != null)
        element = adaptedObject ;
    }
    
    return super.getImage(element);
  }

  public String getColumnText(Object element, int index)
  {
    if (element instanceof IAdaptable)
    {
      Object adaptedObject = ((IAdaptable)element).getAdapter(Identification.class) ;
      
      if (adaptedObject != null)
        element = adaptedObject ;
    }
    
    if (element instanceof Identification)
    {
      switch (index)
      {
        case 0 :
          return ((Identification)element).getName();
        case 1 :
          return ((Identification)element).getDescription();
        default: 
          return ((Identification)element).getName();
      }
    }
    else
    {
      return super.getText(element);
    }
  
  }

  public Font getFont(Object element)
  {
    return null;
  }

  public Color getBackground(Object element)
  {
    return null;
  }

  public Color getForeground(Object element)
  {
    return null;
  }
  
  public Font getFont(Object element, int index)
  {
    return null;
  }

  public Color getBackground(Object element, int index)
  {
    return null;
  }

  public Color getForeground(Object element, int index)
  {
    return null;
  }
}