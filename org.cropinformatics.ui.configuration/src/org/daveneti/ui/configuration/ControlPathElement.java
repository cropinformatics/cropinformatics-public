/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Part of a workflow path that references a specific page
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.ControlPathElement#getConditionProperty <em>Condition Property</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ControlPathElement#getConditionPageId <em>Condition Page Id</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ControlPathElement#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ControlPathElement#getSubPaths <em>Sub Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getControlPathElement()
 * @model extendedMetaData="name='ControlPathElement' kind='elementOnly'"
 * @generated
 */
public interface ControlPathElement extends PathElement
{
	/**
	 * Returns the value of the '<em><b>Condition Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition propery that indicates which subpath should be taken
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Property</em>' attribute.
	 * @see #setConditionProperty(String)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getControlPathElement_ConditionProperty()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString" required="true"
	 *        extendedMetaData="kind='element' name='conditionProperty'"
	 * @generated
	 */
	String getConditionProperty();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ControlPathElement#getConditionProperty <em>Condition Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Property</em>' attribute.
	 * @see #getConditionProperty()
	 * @generated
	 */
	void setConditionProperty(String value);

	/**
	 * Returns the value of the '<em><b>Condition Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the wizard page which holds the condition property. If  not defined
	 * 							the property is assumed to be taken from the wizard itself
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Page Id</em>' attribute.
	 * @see #setConditionPageId(String)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getControlPathElement_ConditionPageId()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='conditionPageId'"
	 * @generated
	 */
	String getConditionPageId();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ControlPathElement#getConditionPageId <em>Condition Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Page Id</em>' attribute.
	 * @see #getConditionPageId()
	 * @generated
	 */
	void setConditionPageId(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the default value of the condition propery indicates this path should be taken
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getControlPathElement_DefaultValue()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ControlPathElement#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Sub Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.daveneti.ui.configuration.SubPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the child sub paths
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Paths</em>' containment reference list.
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getControlPathElement_SubPaths()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subPaths'"
	 * @generated
	 */
	EList<SubPath> getSubPaths();

} // ControlPathElement
