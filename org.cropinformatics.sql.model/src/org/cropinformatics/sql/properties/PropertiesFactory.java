/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesPackage
 * @generated
 */
public interface PropertiesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesFactory eINSTANCE = org.cropinformatics.sql.properties.impl.PropertiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Database Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Alias</em>'.
	 * @generated
	 */
	DatabaseAlias createDatabaseAlias();

	/**
	 * Returns a new object of class '<em>Database Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Properties</em>'.
	 * @generated
	 */
	DatabaseProperties createDatabaseProperties();

	/**
	 * Returns a new object of class '<em>Database Properties List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Properties List Type</em>'.
	 * @generated
	 */
	DatabasePropertiesListType createDatabasePropertiesListType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Specific DBMS Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific DBMS Properties</em>'.
	 * @generated
	 */
	SpecificDBMSProperties createSpecificDBMSProperties();

	/**
	 * Returns a new object of class '<em>Sql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql</em>'.
	 * @generated
	 */
	Sql createSql();

	/**
	 * Returns a new object of class '<em>Sql File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql File</em>'.
	 * @generated
	 */
	SqlFile createSqlFile();

	/**
	 * Returns a new object of class '<em>Sql Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Group</em>'.
	 * @generated
	 */
	SqlGroup createSqlGroup();

	/**
	 * Returns a new object of class '<em>Sql Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Parameter</em>'.
	 * @generated
	 */
	SqlParameter createSqlParameter();

	/**
	 * Returns a new object of class '<em>Sql Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Properties</em>'.
	 * @generated
	 */
	SqlProperties createSqlProperties();

	/**
	 * Returns a new object of class '<em>Sql Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Query</em>'.
	 * @generated
	 */
	SqlQuery createSqlQuery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertiesPackage getPropertiesPackage();

} //PropertiesFactory
