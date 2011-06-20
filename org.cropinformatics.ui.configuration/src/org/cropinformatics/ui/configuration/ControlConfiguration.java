/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple configuration element that has a layout
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.ControlConfiguration#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ControlConfiguration#getForeground <em>Foreground</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ControlConfiguration#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getControlConfiguration()
 * @model extendedMetaData="name='ControlConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ControlConfiguration extends ComponentConfiguration
{
	/**
	 * Returns the value of the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Data</em>' containment reference.
	 * @see #setLayoutData(LayoutData)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getControlConfiguration_LayoutData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layoutData'"
	 * @generated
	 */
	LayoutData getLayoutData();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ControlConfiguration#getLayoutData <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Data</em>' containment reference.
	 * @see #getLayoutData()
	 * @generated
	 */
	void setLayoutData(LayoutData value);

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' containment reference.
	 * @see #setForeground(Colour)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getControlConfiguration_Foreground()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foreground'"
	 * @generated
	 */
	Colour getForeground();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ControlConfiguration#getForeground <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' containment reference.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(Colour value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Colour)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getControlConfiguration_Background()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='background'"
	 * @generated
	 */
	Colour getBackground();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ControlConfiguration#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Colour value);

} // ControlConfiguration
