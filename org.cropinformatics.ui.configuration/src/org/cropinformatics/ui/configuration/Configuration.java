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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base element for all other configuration elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#getHelpContextId <em>Help Context Id</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Configuration#getPluginId <em>Plugin Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration()
 * @model extendedMetaData="name='Configuration' kind='elementOnly'"
 * @generated
 */
public interface Configuration extends EObject
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
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_Id()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_Name()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_Extends()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='extends'"
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_Visible()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Configuration#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_Enabled()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='enabled'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Configuration#isEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	boolean isSetEnabled();

	/**
	 * Returns the value of the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Context Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Context Id</em>' attribute.
	 * @see #setHelpContextId(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_HelpContextId()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='helpContextId'"
	 * @generated
	 */
	String getHelpContextId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#getHelpContextId <em>Help Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Context Id</em>' attribute.
	 * @see #getHelpContextId()
	 * @generated
	 */
	void setHelpContextId(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_ClassName()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='className'"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

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
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getConfiguration_PluginId()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString"
	 *        extendedMetaData="kind='element' name='pluginId'"
	 * @generated
	 */
	String getPluginId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Configuration#getPluginId <em>Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Id</em>' attribute.
	 * @see #getPluginId()
	 * @generated
	 */
	void setPluginId(String value);

} // Configuration
