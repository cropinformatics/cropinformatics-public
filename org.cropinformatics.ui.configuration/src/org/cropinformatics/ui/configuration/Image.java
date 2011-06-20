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
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an RGBA colour
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.Image#getPath <em>Path</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Image#getKey <em>Key</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Image#getPluginId <em>Plugin Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getImage()
 * @model extendedMetaData="name='Image' kind='elementOnly'"
 * @generated
 */
public interface Image extends EObject
{
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getImage_Path()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Image#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getImage_Key()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Image#getKey <em>Key</em>}' attribute.
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
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getImage_PluginId()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='pluginId'"
	 * @generated
	 */
	String getPluginId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Image#getPluginId <em>Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Id</em>' attribute.
	 * @see #getPluginId()
	 * @generated
	 */
	void setPluginId(String value);

} // Image
