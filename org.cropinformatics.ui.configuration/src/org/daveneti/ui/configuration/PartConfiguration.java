/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A configuration element that can container configuration elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.PartConfiguration#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getPartConfiguration()
 * @model extendedMetaData="name='PartConfiguration' kind='elementOnly'"
 * @generated
 */
public interface PartConfiguration extends Configuration
{
	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(ControlConfiguration)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getPartConfiguration_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control'"
	 * @generated
	 */
	ControlConfiguration getControl();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.PartConfiguration#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlConfiguration value);

} // PartConfiguration
