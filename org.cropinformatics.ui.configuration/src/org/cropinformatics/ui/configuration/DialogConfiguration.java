/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A configuration element for a wizard page
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.DialogConfiguration#getControl <em>Control</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.DialogConfiguration#isResizable <em>Resizable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getDialogConfiguration()
 * @model extendedMetaData="name='DialogConfiguration' kind='elementOnly'"
 * @generated
 */
public interface DialogConfiguration extends Configuration
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
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getDialogConfiguration_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control'"
	 * @generated
	 */
	ControlConfiguration getControl();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.DialogConfiguration#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlConfiguration value);

	/**
	 * Returns the value of the '<em><b>Resizable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resizable</em>' attribute.
	 * @see #isSetResizable()
	 * @see #unsetResizable()
	 * @see #setResizable(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getDialogConfiguration_Resizable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='resizable'"
	 * @generated
	 */
	boolean isResizable();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.DialogConfiguration#isResizable <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resizable</em>' attribute.
	 * @see #isSetResizable()
	 * @see #unsetResizable()
	 * @see #isResizable()
	 * @generated
	 */
	void setResizable(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.DialogConfiguration#isResizable <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResizable()
	 * @see #isResizable()
	 * @see #setResizable(boolean)
	 * @generated
	 */
	void unsetResizable();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.DialogConfiguration#isResizable <em>Resizable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resizable</em>' attribute is set.
	 * @see #unsetResizable()
	 * @see #isResizable()
	 * @see #setResizable(boolean)
	 * @generated
	 */
	boolean isSetResizable();

} // DialogConfiguration
