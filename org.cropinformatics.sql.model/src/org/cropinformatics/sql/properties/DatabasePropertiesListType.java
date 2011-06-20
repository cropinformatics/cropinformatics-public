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
 * A representation of the model object '<em><b>Database Properties List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.DatabasePropertiesListType#getDatabaseProperties <em>Database Properties</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabasePropertiesListType#getDatabaseAlias <em>Database Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabasePropertiesListType()
 * @model extendedMetaData="name='databasePropertiesList_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabasePropertiesListType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Database Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.DatabaseProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Properties</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabasePropertiesListType_DatabaseProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='databaseProperties'"
	 * @generated
	 */
	EList<DatabaseProperties> getDatabaseProperties();

	/**
	 * Returns the value of the '<em><b>Database Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.DatabaseAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Alias</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabasePropertiesListType_DatabaseAlias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='databaseAlias'"
	 * @generated
	 */
	EList<DatabaseAlias> getDatabaseAlias();

} // DatabasePropertiesListType
