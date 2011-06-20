/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A configuration element for an wizard
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.WizardConfiguration#getPages <em>Pages</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.WizardConfiguration#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getWizardConfiguration()
 * @model extendedMetaData="name='WizardConfiguration' kind='elementOnly'"
 * @generated
 */
public interface WizardConfiguration extends Configuration
{
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.ui.configuration.WizardPageConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getWizardConfiguration_Pages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pages'"
	 * @generated
	 */
	EList<WizardPageConfiguration> getPages();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.ui.configuration.PathElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getWizardConfiguration_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path'"
	 * @generated
	 */
	EList<PathElement> getPath();

} // WizardConfiguration
