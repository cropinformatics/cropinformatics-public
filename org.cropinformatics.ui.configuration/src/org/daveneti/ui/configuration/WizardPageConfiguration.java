/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Page Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A configuration element for a wizard page
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.WizardPageConfiguration#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getWizardPageConfiguration()
 * @model extendedMetaData="name='WizardPageConfiguration' kind='elementOnly'"
 * @generated
 */
public interface WizardPageConfiguration extends Configuration
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
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getWizardPageConfiguration_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control'"
	 * @generated
	 */
	ControlConfiguration getControl();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.WizardPageConfiguration#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlConfiguration value);

} // WizardPageConfiguration
