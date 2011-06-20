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
 * A representation of the model object '<em><b>Multiple List Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for viewers that display multiple lists
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.MultipleListViewerConfiguration#getChildConfiguration <em>Child Configuration</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.MultipleListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMultipleListViewerConfiguration()
 * @model extendedMetaData="name='MultipleListViewerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface MultipleListViewerConfiguration extends ViewerConfiguration
{
	/**
	 * Returns the value of the '<em><b>Child Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.daveneti.ui.configuration.ListViewerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Configuration</em>' containment reference list.
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMultipleListViewerConfiguration_ChildConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='childConfiguration'"
	 * @generated
	 */
	EList<ListViewerConfiguration> getChildConfiguration();

	/**
	 * Returns the value of the '<em><b>Threading In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threading In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threading In Use</em>' attribute.
	 * @see #isSetThreadingInUse()
	 * @see #unsetThreadingInUse()
	 * @see #setThreadingInUse(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMultipleListViewerConfiguration_ThreadingInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='threadingInUse'"
	 * @generated
	 */
	boolean isThreadingInUse();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MultipleListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threading In Use</em>' attribute.
	 * @see #isSetThreadingInUse()
	 * @see #unsetThreadingInUse()
	 * @see #isThreadingInUse()
	 * @generated
	 */
	void setThreadingInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MultipleListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreadingInUse()
	 * @see #isThreadingInUse()
	 * @see #setThreadingInUse(boolean)
	 * @generated
	 */
	void unsetThreadingInUse();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MultipleListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threading In Use</em>' attribute is set.
	 * @see #unsetThreadingInUse()
	 * @see #isThreadingInUse()
	 * @see #setThreadingInUse(boolean)
	 * @generated
	 */
	boolean isSetThreadingInUse();

} // MultipleListViewerConfiguration
