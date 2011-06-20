/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A configuration element that can contain configuration elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.ContainerConfiguration#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ContainerConfiguration#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getContainerConfiguration()
 * @model extendedMetaData="name='ContainerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ContainerConfiguration extends ControlConfiguration
{
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getContainerConfiguration_Layout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layout'"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ContainerConfiguration#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.daveneti.ui.configuration.ComponentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getContainerConfiguration_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components'"
	 * @generated
	 */
	EList<ComponentConfiguration> getComponents();

} // ContainerConfiguration
