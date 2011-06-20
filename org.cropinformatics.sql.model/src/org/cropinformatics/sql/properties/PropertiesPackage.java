/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This XML Schema specifies an XML format for definition of SQL and SQL Databases
 * <!-- end-model-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface PropertiesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "properties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cropinformatics.org/sqlProperties";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "properties";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesPackage eINSTANCE = org.cropinformatics.sql.properties.impl.PropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.DatabaseAliasImpl <em>Database Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.DatabaseAliasImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDatabaseAlias()
	 * @generated
	 */
	int DATABASE_ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_ALIAS__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_ALIAS__ID = 1;

	/**
	 * The number of structural features of the '<em>Database Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_ALIAS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl <em>Database Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDatabaseProperties()
	 * @generated
	 */
	int DATABASE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__ID = 0;

	/**
	 * The feature id for the '<em><b>Driver Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__DRIVER_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__DIALECT = 2;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__SERVER_URL = 3;

	/**
	 * The feature id for the '<em><b>DBMS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__DBMS = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__PORT = 5;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__DATABASE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__USERNAME = 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__PASSWORD = 8;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__NAMESPACE = 9;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME = 10;

	/**
	 * The feature id for the '<em><b>Sql Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__SQL_PROPERTIES = 11;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES = 12;

	/**
	 * The number of structural features of the '<em>Database Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesListTypeImpl <em>Database Properties List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.DatabasePropertiesListTypeImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDatabasePropertiesListType()
	 * @generated
	 */
	int DATABASE_PROPERTIES_LIST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Database Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Database Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Database Properties List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PROPERTIES_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.DocumentRootImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Database Properties List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_PROPERTIES_LIST = 3;

	/**
	 * The feature id for the '<em><b>Sql Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.PropertyImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl <em>Specific DBMS Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSpecificDBMSProperties()
	 * @generated
	 */
	int SPECIFIC_DBMS_PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>DBMS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DBMS_PROPERTIES__DBMS = 0;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DBMS_PROPERTIES__SQL_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Sql File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DBMS_PROPERTIES__SQL_FILE = 2;

	/**
	 * The number of structural features of the '<em>Specific DBMS Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DBMS_PROPERTIES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SqlImpl <em>Sql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SqlImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSql()
	 * @generated
	 */
	int SQL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL__ID = 0;

	/**
	 * The feature id for the '<em><b>Hql Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL__HQL_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SqlFileImpl <em>Sql File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SqlFileImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlFile()
	 * @generated
	 */
	int SQL_FILE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE__ID = SQL__ID;

	/**
	 * The feature id for the '<em><b>Hql Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE__HQL_QUERY = SQL__HQL_QUERY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE__PARAMETERS = SQL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE__FILE_PATH = SQL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sql File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_FEATURE_COUNT = SQL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl <em>Sql Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SqlGroupImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlGroup()
	 * @generated
	 */
	int SQL_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_GROUP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_GROUP__SQL_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Sql File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_GROUP__SQL_FILE = 3;

	/**
	 * The feature id for the '<em><b>Specific DBMS Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_GROUP__SPECIFIC_DBMS_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Sql Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SqlParameterImpl <em>Sql Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SqlParameterImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlParameter()
	 * @generated
	 */
	int SQL_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Sql Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SqlPropertiesImpl <em>Sql Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SqlPropertiesImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlProperties()
	 * @generated
	 */
	int SQL_PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Sql Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROPERTIES__SQL_GROUP = 0;

	/**
	 * The number of structural features of the '<em>Sql Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.impl.SqlQueryImpl <em>Sql Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.impl.SqlQueryImpl
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlQuery()
	 * @generated
	 */
	int SQL_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__ID = SQL__ID;

	/**
	 * The feature id for the '<em><b>Hql Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__HQL_QUERY = SQL__HQL_QUERY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__PARAMETERS = SQL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__QUERY_STRING = SQL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sql Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_FEATURE_COUNT = SQL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.DBMS <em>DBMS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.DBMS
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDBMS()
	 * @generated
	 */
	int DBMS = 12;

	/**
	 * The meta object id for the '{@link org.cropinformatics.sql.properties.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.ParameterType
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 13;

	/**
	 * The meta object id for the '<em>DBMS Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.DBMS
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDBMSObject()
	 * @generated
	 */
	int DBMS_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Java Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getJavaName()
	 * @generated
	 */
	int JAVA_NAME = 15;

	/**
	 * The meta object id for the '<em>Non Empty No Spaces</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getNonEmptyNoSpaces()
	 * @generated
	 */
	int NON_EMPTY_NO_SPACES = 16;

	/**
	 * The meta object id for the '<em>Parameter Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.sql.properties.ParameterType
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getParameterTypeObject()
	 * @generated
	 */
	int PARAMETER_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Server Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getServerAddress()
	 * @generated
	 */
	int SERVER_ADDRESS = 18;


	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.DatabaseAlias <em>Database Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Alias</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseAlias
	 * @generated
	 */
	EClass getDatabaseAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseAlias#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseAlias#getAlias()
	 * @see #getDatabaseAlias()
	 * @generated
	 */
	EAttribute getDatabaseAlias_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseAlias#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseAlias#getId()
	 * @see #getDatabaseAlias()
	 * @generated
	 */
	EAttribute getDatabaseAlias_Id();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.DatabaseProperties <em>Database Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Properties</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties
	 * @generated
	 */
	EClass getDatabaseProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getId()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDriverClassName <em>Driver Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Class Name</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getDriverClassName()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_DriverClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getDialect()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_Dialect();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getServerURL()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_ServerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDBMS <em>DBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DBMS</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getDBMS()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_DBMS();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getPort()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getDatabaseName()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getUsername()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getPassword()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getNamespace()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.DatabaseProperties#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit Name</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getPersistenceUnitName()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EAttribute getDatabaseProperties_PersistenceUnitName();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.sql.properties.DatabaseProperties#getSqlProperties <em>Sql Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Properties</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getSqlProperties()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EReference getDatabaseProperties_SqlProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.DatabaseProperties#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Properties</em>'.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties#getAdditionalProperties()
	 * @see #getDatabaseProperties()
	 * @generated
	 */
	EReference getDatabaseProperties_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.DatabasePropertiesListType <em>Database Properties List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Properties List Type</em>'.
	 * @see org.cropinformatics.sql.properties.DatabasePropertiesListType
	 * @generated
	 */
	EClass getDatabasePropertiesListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.DatabasePropertiesListType#getDatabaseProperties <em>Database Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Properties</em>'.
	 * @see org.cropinformatics.sql.properties.DatabasePropertiesListType#getDatabaseProperties()
	 * @see #getDatabasePropertiesListType()
	 * @generated
	 */
	EReference getDatabasePropertiesListType_DatabaseProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.DatabasePropertiesListType#getDatabaseAlias <em>Database Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Alias</em>'.
	 * @see org.cropinformatics.sql.properties.DatabasePropertiesListType#getDatabaseAlias()
	 * @see #getDatabasePropertiesListType()
	 * @generated
	 */
	EReference getDatabasePropertiesListType_DatabaseAlias();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.cropinformatics.sql.properties.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.cropinformatics.sql.properties.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.cropinformatics.sql.properties.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.cropinformatics.sql.properties.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.cropinformatics.sql.properties.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.cropinformatics.sql.properties.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.cropinformatics.sql.properties.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.sql.properties.DocumentRoot#getDatabasePropertiesList <em>Database Properties List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Properties List</em>'.
	 * @see org.cropinformatics.sql.properties.DocumentRoot#getDatabasePropertiesList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabasePropertiesList();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.sql.properties.DocumentRoot#getSqlProperties <em>Sql Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Properties</em>'.
	 * @see org.cropinformatics.sql.properties.DocumentRoot#getSqlProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SqlProperties();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.cropinformatics.sql.properties.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.cropinformatics.sql.properties.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cropinformatics.sql.properties.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties <em>Specific DBMS Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific DBMS Properties</em>'.
	 * @see org.cropinformatics.sql.properties.SpecificDBMSProperties
	 * @generated
	 */
	EClass getSpecificDBMSProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getDBMS <em>DBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DBMS</em>'.
	 * @see org.cropinformatics.sql.properties.SpecificDBMSProperties#getDBMS()
	 * @see #getSpecificDBMSProperties()
	 * @generated
	 */
	EAttribute getSpecificDBMSProperties_DBMS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.cropinformatics.sql.properties.SpecificDBMSProperties#getSqlQuery()
	 * @see #getSpecificDBMSProperties()
	 * @generated
	 */
	EReference getSpecificDBMSProperties_SqlQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties#getSqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql File</em>'.
	 * @see org.cropinformatics.sql.properties.SpecificDBMSProperties#getSqlFile()
	 * @see #getSpecificDBMSProperties()
	 * @generated
	 */
	EReference getSpecificDBMSProperties_SqlFile();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.Sql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql</em>'.
	 * @see org.cropinformatics.sql.properties.Sql
	 * @generated
	 */
	EClass getSql();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.Sql#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.sql.properties.Sql#getId()
	 * @see #getSql()
	 * @generated
	 */
	EAttribute getSql_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.Sql#isHqlQuery <em>Hql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hql Query</em>'.
	 * @see org.cropinformatics.sql.properties.Sql#isHqlQuery()
	 * @see #getSql()
	 * @generated
	 */
	EAttribute getSql_HqlQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.Sql#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.cropinformatics.sql.properties.Sql#getParameters()
	 * @see #getSql()
	 * @generated
	 */
	EReference getSql_Parameters();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.SqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql File</em>'.
	 * @see org.cropinformatics.sql.properties.SqlFile
	 * @generated
	 */
	EClass getSqlFile();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlFile#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see org.cropinformatics.sql.properties.SqlFile#getFilePath()
	 * @see #getSqlFile()
	 * @generated
	 */
	EAttribute getSqlFile_FilePath();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.SqlGroup <em>Sql Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Group</em>'.
	 * @see org.cropinformatics.sql.properties.SqlGroup
	 * @generated
	 */
	EClass getSqlGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.sql.properties.SqlGroup#getId()
	 * @see #getSqlGroup()
	 * @generated
	 */
	EAttribute getSqlGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cropinformatics.sql.properties.SqlGroup#getDescription()
	 * @see #getSqlGroup()
	 * @generated
	 */
	EAttribute getSqlGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.SqlGroup#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.cropinformatics.sql.properties.SqlGroup#getSqlQuery()
	 * @see #getSqlGroup()
	 * @generated
	 */
	EReference getSqlGroup_SqlQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.SqlGroup#getSqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql File</em>'.
	 * @see org.cropinformatics.sql.properties.SqlGroup#getSqlFile()
	 * @see #getSqlGroup()
	 * @generated
	 */
	EReference getSqlGroup_SqlFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.SqlGroup#getSpecificDBMSProperties <em>Specific DBMS Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specific DBMS Properties</em>'.
	 * @see org.cropinformatics.sql.properties.SqlGroup#getSpecificDBMSProperties()
	 * @see #getSqlGroup()
	 * @generated
	 */
	EReference getSqlGroup_SpecificDBMSProperties();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.SqlParameter <em>Sql Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Parameter</em>'.
	 * @see org.cropinformatics.sql.properties.SqlParameter
	 * @generated
	 */
	EClass getSqlParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlParameter#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.cropinformatics.sql.properties.SqlParameter#getIndex()
	 * @see #getSqlParameter()
	 * @generated
	 */
	EAttribute getSqlParameter_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cropinformatics.sql.properties.SqlParameter#getName()
	 * @see #getSqlParameter()
	 * @generated
	 */
	EAttribute getSqlParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cropinformatics.sql.properties.SqlParameter#getType()
	 * @see #getSqlParameter()
	 * @generated
	 */
	EAttribute getSqlParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.SqlProperties <em>Sql Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Properties</em>'.
	 * @see org.cropinformatics.sql.properties.SqlProperties
	 * @generated
	 */
	EClass getSqlProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.sql.properties.SqlProperties#getSqlGroup <em>Sql Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Group</em>'.
	 * @see org.cropinformatics.sql.properties.SqlProperties#getSqlGroup()
	 * @see #getSqlProperties()
	 * @generated
	 */
	EReference getSqlProperties_SqlGroup();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.sql.properties.SqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Query</em>'.
	 * @see org.cropinformatics.sql.properties.SqlQuery
	 * @generated
	 */
	EClass getSqlQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.sql.properties.SqlQuery#getQueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query String</em>'.
	 * @see org.cropinformatics.sql.properties.SqlQuery#getQueryString()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_QueryString();

	/**
	 * Returns the meta object for enum '{@link org.cropinformatics.sql.properties.DBMS <em>DBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DBMS</em>'.
	 * @see org.cropinformatics.sql.properties.DBMS
	 * @generated
	 */
	EEnum getDBMS();

	/**
	 * Returns the meta object for enum '{@link org.cropinformatics.sql.properties.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see org.cropinformatics.sql.properties.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for data type '{@link org.cropinformatics.sql.properties.DBMS <em>DBMS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DBMS Object</em>'.
	 * @see org.cropinformatics.sql.properties.DBMS
	 * @model instanceClass="org.cropinformatics.sql.properties.DBMS"
	 *        extendedMetaData="name='DBMS:Object' baseType='DBMS'"
	 * @generated
	 */
	EDataType getDBMSObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='javaName' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='^(([a-z])+.)+[A-Z]([A-Za-z])+$'"
	 * @generated
	 */
	EDataType getJavaName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Empty No Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Empty No Spaces</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NonEmptyNoSpaces' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[^\\s]+'"
	 * @generated
	 */
	EDataType getNonEmptyNoSpaces();

	/**
	 * Returns the meta object for data type '{@link org.cropinformatics.sql.properties.ParameterType <em>Parameter Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter Type Object</em>'.
	 * @see org.cropinformatics.sql.properties.ParameterType
	 * @model instanceClass="org.cropinformatics.sql.properties.ParameterType"
	 *        extendedMetaData="name='ParameterType:Object' baseType='ParameterType'"
	 * @generated
	 */
	EDataType getParameterTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Server Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Server Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='serverAddress' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[^\\s]+'"
	 * @generated
	 */
	EDataType getServerAddress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesFactory getPropertiesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.DatabaseAliasImpl <em>Database Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.DatabaseAliasImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDatabaseAlias()
		 * @generated
		 */
		EClass DATABASE_ALIAS = eINSTANCE.getDatabaseAlias();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_ALIAS__ALIAS = eINSTANCE.getDatabaseAlias_Alias();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_ALIAS__ID = eINSTANCE.getDatabaseAlias_Id();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl <em>Database Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDatabaseProperties()
		 * @generated
		 */
		EClass DATABASE_PROPERTIES = eINSTANCE.getDatabaseProperties();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__ID = eINSTANCE.getDatabaseProperties_Id();

		/**
		 * The meta object literal for the '<em><b>Driver Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__DRIVER_CLASS_NAME = eINSTANCE.getDatabaseProperties_DriverClassName();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__DIALECT = eINSTANCE.getDatabaseProperties_Dialect();

		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__SERVER_URL = eINSTANCE.getDatabaseProperties_ServerURL();

		/**
		 * The meta object literal for the '<em><b>DBMS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__DBMS = eINSTANCE.getDatabaseProperties_DBMS();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__PORT = eINSTANCE.getDatabaseProperties_Port();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__DATABASE_NAME = eINSTANCE.getDatabaseProperties_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__USERNAME = eINSTANCE.getDatabaseProperties_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__PASSWORD = eINSTANCE.getDatabaseProperties_Password();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__NAMESPACE = eINSTANCE.getDatabaseProperties_Namespace();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME = eINSTANCE.getDatabaseProperties_PersistenceUnitName();

		/**
		 * The meta object literal for the '<em><b>Sql Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_PROPERTIES__SQL_PROPERTIES = eINSTANCE.getDatabaseProperties_SqlProperties();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES = eINSTANCE.getDatabaseProperties_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesListTypeImpl <em>Database Properties List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.DatabasePropertiesListTypeImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDatabasePropertiesListType()
		 * @generated
		 */
		EClass DATABASE_PROPERTIES_LIST_TYPE = eINSTANCE.getDatabasePropertiesListType();

		/**
		 * The meta object literal for the '<em><b>Database Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES = eINSTANCE.getDatabasePropertiesListType_DatabaseProperties();

		/**
		 * The meta object literal for the '<em><b>Database Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS = eINSTANCE.getDatabasePropertiesListType_DatabaseAlias();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.DocumentRootImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Database Properties List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATABASE_PROPERTIES_LIST = eINSTANCE.getDocumentRoot_DatabasePropertiesList();

		/**
		 * The meta object literal for the '<em><b>Sql Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SQL_PROPERTIES = eINSTANCE.getDocumentRoot_SqlProperties();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.PropertyImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl <em>Specific DBMS Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSpecificDBMSProperties()
		 * @generated
		 */
		EClass SPECIFIC_DBMS_PROPERTIES = eINSTANCE.getSpecificDBMSProperties();

		/**
		 * The meta object literal for the '<em><b>DBMS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_DBMS_PROPERTIES__DBMS = eINSTANCE.getSpecificDBMSProperties_DBMS();

		/**
		 * The meta object literal for the '<em><b>Sql Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_DBMS_PROPERTIES__SQL_QUERY = eINSTANCE.getSpecificDBMSProperties_SqlQuery();

		/**
		 * The meta object literal for the '<em><b>Sql File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_DBMS_PROPERTIES__SQL_FILE = eINSTANCE.getSpecificDBMSProperties_SqlFile();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SqlImpl <em>Sql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SqlImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSql()
		 * @generated
		 */
		EClass SQL = eINSTANCE.getSql();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL__ID = eINSTANCE.getSql_Id();

		/**
		 * The meta object literal for the '<em><b>Hql Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL__HQL_QUERY = eINSTANCE.getSql_HqlQuery();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL__PARAMETERS = eINSTANCE.getSql_Parameters();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SqlFileImpl <em>Sql File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SqlFileImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlFile()
		 * @generated
		 */
		EClass SQL_FILE = eINSTANCE.getSqlFile();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_FILE__FILE_PATH = eINSTANCE.getSqlFile_FilePath();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl <em>Sql Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SqlGroupImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlGroup()
		 * @generated
		 */
		EClass SQL_GROUP = eINSTANCE.getSqlGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_GROUP__ID = eINSTANCE.getSqlGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_GROUP__DESCRIPTION = eINSTANCE.getSqlGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Sql Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_GROUP__SQL_QUERY = eINSTANCE.getSqlGroup_SqlQuery();

		/**
		 * The meta object literal for the '<em><b>Sql File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_GROUP__SQL_FILE = eINSTANCE.getSqlGroup_SqlFile();

		/**
		 * The meta object literal for the '<em><b>Specific DBMS Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_GROUP__SPECIFIC_DBMS_PROPERTIES = eINSTANCE.getSqlGroup_SpecificDBMSProperties();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SqlParameterImpl <em>Sql Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SqlParameterImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlParameter()
		 * @generated
		 */
		EClass SQL_PARAMETER = eINSTANCE.getSqlParameter();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER__INDEX = eINSTANCE.getSqlParameter_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER__NAME = eINSTANCE.getSqlParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_PARAMETER__TYPE = eINSTANCE.getSqlParameter_Type();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SqlPropertiesImpl <em>Sql Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SqlPropertiesImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlProperties()
		 * @generated
		 */
		EClass SQL_PROPERTIES = eINSTANCE.getSqlProperties();

		/**
		 * The meta object literal for the '<em><b>Sql Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_PROPERTIES__SQL_GROUP = eINSTANCE.getSqlProperties_SqlGroup();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.impl.SqlQueryImpl <em>Sql Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.impl.SqlQueryImpl
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getSqlQuery()
		 * @generated
		 */
		EClass SQL_QUERY = eINSTANCE.getSqlQuery();

		/**
		 * The meta object literal for the '<em><b>Query String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_QUERY__QUERY_STRING = eINSTANCE.getSqlQuery_QueryString();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.DBMS <em>DBMS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.DBMS
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDBMS()
		 * @generated
		 */
		EEnum DBMS = eINSTANCE.getDBMS();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.sql.properties.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.ParameterType
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em>DBMS Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.DBMS
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getDBMSObject()
		 * @generated
		 */
		EDataType DBMS_OBJECT = eINSTANCE.getDBMSObject();

		/**
		 * The meta object literal for the '<em>Java Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getJavaName()
		 * @generated
		 */
		EDataType JAVA_NAME = eINSTANCE.getJavaName();

		/**
		 * The meta object literal for the '<em>Non Empty No Spaces</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getNonEmptyNoSpaces()
		 * @generated
		 */
		EDataType NON_EMPTY_NO_SPACES = eINSTANCE.getNonEmptyNoSpaces();

		/**
		 * The meta object literal for the '<em>Parameter Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.sql.properties.ParameterType
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getParameterTypeObject()
		 * @generated
		 */
		EDataType PARAMETER_TYPE_OBJECT = eINSTANCE.getParameterTypeObject();

		/**
		 * The meta object literal for the '<em>Server Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.cropinformatics.sql.properties.impl.PropertiesPackageImpl#getServerAddress()
		 * @generated
		 */
		EDataType SERVER_ADDRESS = eINSTANCE.getServerAddress();

	}

} //PropertiesPackage
