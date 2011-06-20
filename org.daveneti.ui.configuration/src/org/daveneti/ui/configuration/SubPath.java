/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sub-path which is part of a workflow path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.SubPath#getId <em>Id</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.SubPath#getConditionValue <em>Condition Value</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.SubPath#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getSubPath()
 * @model extendedMetaData="name='SubPath' kind='elementOnly'"
 * @generated
 */
public interface SubPath extends EObject
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
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getSubPath_Id()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.SubPath#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the value of the condition propery indicates this path should be taken
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Value</em>' attribute.
	 * @see #setConditionValue(String)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getSubPath_ConditionValue()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString" required="true"
	 *        extendedMetaData="kind='element' name='conditionValue'"
	 * @generated
	 */
	String getConditionValue();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.SubPath#getConditionValue <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Value</em>' attribute.
	 * @see #getConditionValue()
	 * @generated
	 */
	void setConditionValue(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.daveneti.ui.configuration.PathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the elemennts in the sub path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getSubPath_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path'"
	 * @generated
	 */
	EList<PathElement> getPath();

} // SubPath
