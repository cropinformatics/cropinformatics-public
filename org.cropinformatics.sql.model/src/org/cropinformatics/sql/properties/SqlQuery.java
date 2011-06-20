/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.SqlQuery#getQueryString <em>Query String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlQuery()
 * @model extendedMetaData="name='sqlQuery' kind='elementOnly'"
 * @generated
 */
public interface SqlQuery extends Sql
{
	/**
	 * Returns the value of the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query String</em>' attribute.
	 * @see #setQueryString(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlQuery_QueryString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='queryString'"
	 * @generated
	 */
	String getQueryString();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.SqlQuery#getQueryString <em>Query String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query String</em>' attribute.
	 * @see #getQueryString()
	 * @generated
	 */
	void setQueryString(String value);

} // SqlQuery
