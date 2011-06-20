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
package org.cropinformatics.ui.viewers.list;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.apache.commons.lang.StringUtils;
import org.cropinformatics.common.Identification;
import org.cropinformatics.common.LSID;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public abstract class ListViewerFilter extends ViewerFilter implements Identification
{
  private String uniqueIdentifier ;
  private String name ;
  private String description ;
  private String[] classification ;
  
  private transient PropertyChangeSupport propertyChangeSupport;
  
  public ListViewerFilter(String name)
  {
    this(null, name, null);
  }
  
  public ListViewerFilter(String uniqueIdentifier, String name)
  {
    this(uniqueIdentifier, name, null);
  }
  
  public ListViewerFilter(String uniqueIdentifier, String name, 
      String description)
  {
    setUniqueIdentifier(uniqueIdentifier);
    setName(name);
    setDescription(description) ;
    
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public final String getUniqueIdentifier()
  {
    return uniqueIdentifier;
  }

  public final String getName()
  {
    return name;
  }

  public final String getDescription()
  {
    return description;
  }

  public final String[] getClassification()
  {
    return classification;
  }

  @Override
  public final boolean select(Viewer viewer, Object parentElement, Object element)
  {
    return select(element) ;
  }

  public synchronized void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public synchronized void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }

  protected PropertyChangeSupport getPropertyChangeSupport()
  {
    return propertyChangeSupport;
  }

  public abstract boolean select(Object element) ;
  
  public void setUniqueIdentifier(String uniqueIdentifier)
  {
    String oldValue = getUniqueIdentifier() ;
    
    if (oldValue == null || !StringUtils.equals(oldValue, uniqueIdentifier))
    {
      if (uniqueIdentifier == null)
        this.uniqueIdentifier = LSID.createLocalId();
      else
        this.uniqueIdentifier = uniqueIdentifier ;
      
      if (oldValue != null && propertyChangeSupport != null)
        propertyChangeSupport.firePropertyChange(Identification.UNIQUE_IDENTIFIER_PROPERTY, oldValue, getUniqueIdentifier()) ;
    }
  }
  
  public void setName(String name)
  {
    String oldValue = getName() ;
    
    if (!StringUtils.equals(oldValue, name))
    {
      this.name = name ;
      
      if (propertyChangeSupport != null)
        propertyChangeSupport.firePropertyChange(Identification.NAME_PROPERTY, oldValue, getName()) ;
    }
  }

  public void setDescription(String description)
  {
    String oldValue = getDescription() ;
    
    if (!StringUtils.equals(oldValue, description))
    {
      this.description = description ;
      
      if (propertyChangeSupport != null)
        propertyChangeSupport.firePropertyChange(Identification.DESCRIPTION_PROPERTY, oldValue, getDescription()) ;
    }
  }
}
