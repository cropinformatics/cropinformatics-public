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
package org.cropinformatics.common;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BaseIdentification implements Identification
{
	private String uniqueIdentifier ;
  
  private String name ;
  
  private String description ;

	private PropertyChangeSupport propertyChangeSupport;
  
  public BaseIdentification()
  {
    this(null, null, null);
  }
  
  public BaseIdentification(String name)
  {
    this(null, name, null);
  }

  public BaseIdentification(String uniqueIdentifier, String name)
  {
    this(uniqueIdentifier, name, null);
  }
  
  public BaseIdentification(String uniqueIdentifier, String name, String description)
  {
    super();
    initialise();
    
    setUniqueIdentifier(uniqueIdentifier) ;
    setName(name) ;
    setDescription(description) ;
  }

  public BaseIdentification(Identification identification)
  {
    super();
    initialise();
    
    if (identification != null)
    {
	    setUniqueIdentifier(identification.getUniqueIdentifier()) ;
	    setName(identification.getName()) ;
	    setDescription(identification.getDescription()) ;
    }
  }

  public String getUniqueIdentifier()
  {
    return uniqueIdentifier;
  }

  public void setUniqueIdentifier(String uniqueIdentifier)
  {
  	String oldValue = this.uniqueIdentifier ;
  	
    if (uniqueIdentifier != null)
      this.uniqueIdentifier = uniqueIdentifier ;
    else
      this.uniqueIdentifier = LSID.createLocalId() ;
    
    getPropertyChangeSupport().firePropertyChange(
    		UNIQUE_IDENTIFIER_PROPERTY, oldValue, this.uniqueIdentifier) ;
  } 
  
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
  	String oldValue = this.name ;
  	
    this.name = name;
    
    getPropertyChangeSupport().firePropertyChange(
    		NAME_PROPERTY, oldValue, this.name) ;
  }
  
  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
  	String oldValue = this.description ;
  	
    this.description = description;
    
    getPropertyChangeSupport().firePropertyChange(
    		DESCRIPTION_PROPERTY, oldValue, this.description) ;
  }

  /*****************************************************************************
   * The two objects are considered equal if their unique identifiers are equal.
   ****************************************************************************/
  @Override
  public boolean equals(Object object)
  {
    if (object == null)
      return false;

    if (object instanceof BaseIdentification)
    {
      return this == object || StringUtils.equals(((BaseIdentification) object)
          .getUniqueIdentifier(), this.getUniqueIdentifier());
    }
    else
    {
      return super.equals(object);
    }
  }
 
  @Override
  public String toString()
  {
    return ToStringBuilder.reflectionToString(this) ;
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
  
  protected void initialise()
  {
    uniqueIdentifier = null ;
    name = null;
    propertyChangeSupport = new PropertyChangeSupport(this);
  }
}
