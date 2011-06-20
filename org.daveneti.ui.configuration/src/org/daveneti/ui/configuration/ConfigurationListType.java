/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of configuration elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.ConfigurationListType#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getConfigurationListType()
 * @model extendedMetaData="name='ConfigurationList_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationListType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.daveneti.ui.configuration.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getConfigurationListType_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Configuration'"
	 * @generated
	 */
	EList<Configuration> getConfiguration();

} // ConfigurationListType
