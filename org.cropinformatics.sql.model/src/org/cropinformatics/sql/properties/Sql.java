/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.Sql#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.Sql#isHqlQuery <em>Hql Query</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.Sql#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSql()
 * @model extendedMetaData="name='sql' kind='elementOnly'"
 * @generated
 */
public interface Sql extends EObject
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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSql_Id()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.Sql#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Hql Query</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hql Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hql Query</em>' attribute.
	 * @see #isSetHqlQuery()
	 * @see #unsetHqlQuery()
	 * @see #setHqlQuery(boolean)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSql_HqlQuery()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='hqlQuery'"
	 * @generated
	 */
	boolean isHqlQuery();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.Sql#isHqlQuery <em>Hql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hql Query</em>' attribute.
	 * @see #isSetHqlQuery()
	 * @see #unsetHqlQuery()
	 * @see #isHqlQuery()
	 * @generated
	 */
	void setHqlQuery(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.sql.properties.Sql#isHqlQuery <em>Hql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHqlQuery()
	 * @see #isHqlQuery()
	 * @see #setHqlQuery(boolean)
	 * @generated
	 */
	void unsetHqlQuery();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.sql.properties.Sql#isHqlQuery <em>Hql Query</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hql Query</em>' attribute is set.
	 * @see #unsetHqlQuery()
	 * @see #isHqlQuery()
	 * @see #setHqlQuery(boolean)
	 * @generated
	 */
	boolean isSetHqlQuery();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.SqlParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSql_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters'"
	 * @generated
	 */
	EList<SqlParameter> getParameters();

} // Sql
