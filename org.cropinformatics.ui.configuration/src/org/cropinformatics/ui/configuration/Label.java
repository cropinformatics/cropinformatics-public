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
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an RGBA colour
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.Label#getValue <em>Value</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Label#getKey <em>Key</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Label#getPluginId <em>Plugin Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLabel()
 * @model extendedMetaData="name='Label' kind='elementOnly'"
 * @generated
 */
public interface Label extends EObject
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLabel_Value()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Label#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLabel_Key()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Label#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Id</em>' attribute.
	 * @see #setPluginId(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLabel_PluginId()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='pluginId'"
	 * @generated
	 */
	String getPluginId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Label#getPluginId <em>Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Id</em>' attribute.
	 * @see #getPluginId()
	 * @generated
	 */
	void setPluginId(String value);

} // Label
