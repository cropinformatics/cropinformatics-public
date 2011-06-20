/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Part of a workflow path that references a specific page
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.PagePathElement#getPageId <em>Page Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getPagePathElement()
 * @model extendedMetaData="name='PagePathElement' kind='elementOnly'"
 * @generated
 */
public interface PagePathElement extends PathElement
{
	/**
	 * Returns the value of the '<em><b>Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Id</em>' attribute.
	 * @see #setPageId(String)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getPagePathElement_PageId()
	 * @model dataType="org.daveneti.ui.configuration.NonEmptyString" required="true"
	 *        extendedMetaData="kind='element' name='pageId'"
	 * @generated
	 */
	String getPageId();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.PagePathElement#getPageId <em>Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Id</em>' attribute.
	 * @see #getPageId()
	 * @generated
	 */
	void setPageId(String value);

} // PagePathElement
