/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTab Folder Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of composite with tabs
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.CTabFolderConfiguration#getTabPosition <em>Tab Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getCTabFolderConfiguration()
 * @model extendedMetaData="name='CTabFolderConfiguration' kind='elementOnly'"
 * @generated
 */
public interface CTabFolderConfiguration extends ContainerConfiguration
{

	/**
	 * Returns the value of the '<em><b>Tab Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Position</em>' attribute.
	 * @see #isSetTabPosition()
	 * @see #unsetTabPosition()
	 * @see #setTabPosition(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getCTabFolderConfiguration_TabPosition()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='tabPosition'"
	 * @generated
	 */
	int getTabPosition();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.CTabFolderConfiguration#getTabPosition <em>Tab Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Position</em>' attribute.
	 * @see #isSetTabPosition()
	 * @see #unsetTabPosition()
	 * @see #getTabPosition()
	 * @generated
	 */
	void setTabPosition(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.CTabFolderConfiguration#getTabPosition <em>Tab Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabPosition()
	 * @see #getTabPosition()
	 * @see #setTabPosition(int)
	 * @generated
	 */
	void unsetTabPosition();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.CTabFolderConfiguration#getTabPosition <em>Tab Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tab Position</em>' attribute is set.
	 * @see #unsetTabPosition()
	 * @see #getTabPosition()
	 * @see #setTabPosition(int)
	 * @generated
	 */
	boolean isSetTabPosition();
} // CTabFolderConfiguration
