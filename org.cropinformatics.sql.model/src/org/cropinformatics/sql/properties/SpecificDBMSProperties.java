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
 * A representation of the model object '<em><b>Specific DBMS Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getDBMS <em>DBMS</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getSqlFile <em>Sql File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSpecificDBMSProperties()
 * @model extendedMetaData="name='specificDBMSProperties' kind='elementOnly'"
 * @generated
 */
public interface SpecificDBMSProperties extends EObject
{
	/**
	 * Returns the value of the '<em><b>DBMS</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cropinformatics.sql.properties.DBMS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DBMS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DBMS</em>' attribute.
	 * @see org.cropinformatics.sql.properties.DBMS
	 * @see #isSetDBMS()
	 * @see #unsetDBMS()
	 * @see #setDBMS(DBMS)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSpecificDBMSProperties_DBMS()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DBMS'"
	 * @generated
	 */
	DBMS getDBMS();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getDBMS <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBMS</em>' attribute.
	 * @see org.cropinformatics.sql.properties.DBMS
	 * @see #isSetDBMS()
	 * @see #unsetDBMS()
	 * @see #getDBMS()
	 * @generated
	 */
	void setDBMS(DBMS value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getDBMS <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDBMS()
	 * @see #getDBMS()
	 * @see #setDBMS(DBMS)
	 * @generated
	 */
	void unsetDBMS();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getDBMS <em>DBMS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DBMS</em>' attribute is set.
	 * @see #unsetDBMS()
	 * @see #getDBMS()
	 * @see #setDBMS(DBMS)
	 * @generated
	 */
	boolean isSetDBMS();

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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSpecificDBMSProperties_SqlQuery()
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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSpecificDBMSProperties_SqlFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sqlFile'"
	 * @generated
	 */
	EList<SqlFile> getSqlFile();

} // SpecificDBMSProperties
