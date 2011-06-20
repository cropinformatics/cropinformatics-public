/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines part of a path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.PathElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getPathElement()
 * @model abstract="true"
 *        extendedMetaData="name='PathElement' kind='elementOnly'"
 * @generated
 */
public interface PathElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getPathElement_Id()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.PathElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PathElement
