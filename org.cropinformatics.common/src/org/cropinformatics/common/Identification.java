/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Richard Bruskiewich under contract by
 * IRRI. Additional modifications by Guy Davenport after 21 November 2010
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

/**
 * A basic interface to identify GCP entities. <p>
 *
 * @author <A HREF="mailto:r.bruskiewich@cgiar.org">Richard Bruskiewich</A>
 * @version $Id: Identification.java 5472 2007-04-10 03:19:11Z Guy Davenport (guy.davenport@cropinformatics.com) $
 */
public interface Identification 
{
	public static final String UNIQUE_IDENTIFIER_PROPERTY = Identification.class.getName() + ".unuqueIdentifier" ;
	public static final String NAME_PROPERTY  = Identification.class.getName() + ".name" ;
	public static final String DESCRIPTION_PROPERTY = Identification.class.getName() + ".description" ;

	/*************************************************************************
	 * Return the unique identifier of the entity being identified. <p>
	 *************************************************************************/
	public String getUniqueIdentifier();

	/*************************************************************************
	 * Return a (usually more) human readable name of the entity being
	 * identified. This name could be used in GUIs, etc.
	 *************************************************************************/
	public String getName();

	/**
	 * Gets the optional description of what the entity is or does. For example the
	 * the description could be used by the application to provide information 
	 * to user to allow to know what the entity is or what is does.
	 * 
	 * @return description of what the entities is or does, or null
	 * if there is no description
	 */
	public String getDescription() ;


	/**
	 * Sets the unique identifier of the entity being identified. <p>
	 * @param uniqueIdentifier the unique identifier to be set
	 */
	public void setUniqueIdentifier(String uniqueIdentifier);

	/**
	 * Sets a (usually more) human readable name of the entity being
	 * identified. This name could be used in GUIs, etc.
	 * @param name the name to be set
	 */
	public void setName(String name);


	/**
	 * Sets the optional description of what the entity is or does. For example the
	 * the description could be used by the application to provide information 
	 * to user to allow to know what the entity is or what is does.
	 * 
	 * @param description the description to be set
	 * @return description of what the entities is or does, or null
	 * if there is no description
	 */
	public void setDescription(String description) ;
}
