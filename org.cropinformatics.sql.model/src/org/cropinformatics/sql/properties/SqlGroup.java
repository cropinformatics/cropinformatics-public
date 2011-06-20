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
 * A representation of the model object '<em><b>Sql Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.SqlGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.SqlGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.SqlGroup#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.SqlGroup#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.SqlGroup#getSpecificDBMSProperties <em>Specific DBMS Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlGroup()
 * @model extendedMetaData="name='sqlGroup' kind='elementOnly'"
 * @generated
 */
public interface SqlGroup extends EObject
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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlGroup_Id()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.SqlGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlGroup_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.SqlGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sql Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.SqlQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Query</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlGroup_SqlQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sqlQuery'"
	 * @generated
	 */
	EList<SqlQuery> getSqlQuery();

	/**
	 * Returns the value of the '<em><b>Sql File</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.SqlFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql File</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlGroup_SqlFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sqlFile'"
	 * @generated
	 */
	EList<SqlFile> getSqlFile();

	/**
	 * Returns the value of the '<em><b>Specific DBMS Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.SpecificDBMSProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific DBMS Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific DBMS Properties</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlGroup_SpecificDBMSProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificDBMSProperties'"
	 * @generated
	 */
	EList<SpecificDBMSProperties> getSpecificDBMSProperties();

} // SqlGroup
