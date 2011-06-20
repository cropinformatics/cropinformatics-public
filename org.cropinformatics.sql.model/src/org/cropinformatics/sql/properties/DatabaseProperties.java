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
 * A representation of the model object '<em><b>Database Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a root element of an XML document defining the Database Properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getDriverClassName <em>Driver Class Name</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getDBMS <em>DBMS</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getPort <em>Port</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getUsername <em>Username</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getPassword <em>Password</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getPersistenceUnitName <em>Persistence Unit Name</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getSqlProperties <em>Sql Properties</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DatabaseProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties()
 * @model extendedMetaData="name='databaseProperties' kind='elementOnly'"
 * @generated
 */
public interface DatabaseProperties extends EObject
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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_Id()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Driver Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Class Name</em>' attribute.
	 * @see #setDriverClassName(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_DriverClassName()
	 * @model dataType="org.cropinformatics.sql.properties.JavaName"
	 *        extendedMetaData="kind='element' name='driverClassName'"
	 * @generated
	 */
	String getDriverClassName();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDriverClassName <em>Driver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Class Name</em>' attribute.
	 * @see #getDriverClassName()
	 * @generated
	 */
	void setDriverClassName(String value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see #setDialect(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_Dialect()
	 * @model dataType="org.cropinformatics.sql.properties.JavaName"
	 *        extendedMetaData="kind='element' name='dialect'"
	 * @generated
	 */
	String getDialect();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(String value);

	/**
	 * Returns the value of the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server URL</em>' attribute.
	 * @see #setServerURL(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_ServerURL()
	 * @model dataType="org.cropinformatics.sql.properties.ServerAddress" required="true"
	 *        extendedMetaData="kind='element' name='serverURL'"
	 * @generated
	 */
	String getServerURL();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getServerURL <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server URL</em>' attribute.
	 * @see #getServerURL()
	 * @generated
	 */
	void setServerURL(String value);

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
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_DBMS()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DBMS'"
	 * @generated
	 */
	DBMS getDBMS();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDBMS <em>DBMS</em>}' attribute.
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
	 * Unsets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDBMS <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDBMS()
	 * @see #getDBMS()
	 * @see #setDBMS(DBMS)
	 * @generated
	 */
	void unsetDBMS();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDBMS <em>DBMS</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #setPort(int)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_Port()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	void unsetPort();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPort <em>Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port</em>' attribute is set.
	 * @see #unsetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	boolean isSetPort();

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_DatabaseName()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='databaseName'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_Username()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces"
	 *        extendedMetaData="kind='element' name='username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_Password()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces"
	 *        extendedMetaData="kind='element' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_Namespace()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces"
	 *        extendedMetaData="kind='element' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit Name</em>' attribute.
	 * @see #setPersistenceUnitName(String)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_PersistenceUnitName()
	 * @model dataType="org.cropinformatics.sql.properties.NonEmptyNoSpaces" required="true"
	 *        extendedMetaData="kind='element' name='persistenceUnitName'"
	 * @generated
	 */
	String getPersistenceUnitName();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPersistenceUnitName <em>Persistence Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit Name</em>' attribute.
	 * @see #getPersistenceUnitName()
	 * @generated
	 */
	void setPersistenceUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Sql Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Properties</em>' containment reference.
	 * @see #setSqlProperties(SqlProperties)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_SqlProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sqlProperties'"
	 * @generated
	 */
	SqlProperties getSqlProperties();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DatabaseProperties#getSqlProperties <em>Sql Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Properties</em>' containment reference.
	 * @see #getSqlProperties()
	 * @generated
	 */
	void setSqlProperties(SqlProperties value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDatabaseProperties_AdditionalProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalProperties'"
	 * @generated
	 */
	EList<Property> getAdditionalProperties();

} // DatabaseProperties
