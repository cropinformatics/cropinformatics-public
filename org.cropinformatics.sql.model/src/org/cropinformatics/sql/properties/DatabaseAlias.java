/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseAlias#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseAlias#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseAlias()
 * @model extendedMetaData="name='databaseAlias' kind='elementOnly'"
 * @generated
 */
public interface DatabaseAlias extends EObject
{
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseAlias_Alias()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseAlias#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseAlias_Id()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseAlias#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DatabaseAlias
