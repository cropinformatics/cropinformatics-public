/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import org.cropinformatics.sql.properties.DatabaseAlias;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.DatabasePropertiesListType;
import org.cropinformatics.sql.properties.DocumentRoot;
import org.cropinformatics.sql.properties.ParameterType;
import org.cropinformatics.sql.properties.PropertiesFactory;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.Property;
import org.cropinformatics.sql.properties.SpecificDBMSProperties;
import org.cropinformatics.sql.properties.Sql;
import org.cropinformatics.sql.properties.SqlFile;
import org.cropinformatics.sql.properties.SqlGroup;
import org.cropinformatics.sql.properties.SqlParameter;
import org.cropinformatics.sql.properties.SqlProperties;
import org.cropinformatics.sql.properties.SqlQuery;
import org.cropinformatics.sql.properties.util.PropertiesValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesPackageImpl extends EPackageImpl implements PropertiesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databasePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databasePropertiesListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDBMSPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbmsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dbmsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyNoSpacesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serverAddressEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertiesPackageImpl()
	{
		super(eNS_URI, PropertiesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertiesPackage init()
	{
		if (isInited) return (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

		// Obtain or create and register package
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePropertiesPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePropertiesPackage, 
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return PropertiesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertiesPackage.eNS_URI, thePropertiesPackage);
		return thePropertiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseAlias()
	{
		return databaseAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseAlias_Alias()
	{
		return (EAttribute)databaseAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseAlias_Id()
	{
		return (EAttribute)databaseAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseProperties()
	{
		return databasePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_Id()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_DriverClassName()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_Dialect()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_ServerURL()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_DBMS()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_Port()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_DatabaseName()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_Username()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_Password()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_Namespace()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseProperties_PersistenceUnitName()
	{
		return (EAttribute)databasePropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseProperties_SqlProperties()
	{
		return (EReference)databasePropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseProperties_AdditionalProperties()
	{
		return (EReference)databasePropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabasePropertiesListType()
	{
		return databasePropertiesListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabasePropertiesListType_DatabaseProperties()
	{
		return (EReference)databasePropertiesListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabasePropertiesListType_DatabaseAlias()
	{
		return (EReference)databasePropertiesListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot()
	{
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed()
	{
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatabasePropertiesList()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SqlProperties()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty()
	{
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key()
	{
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value()
	{
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDBMSProperties()
	{
		return specificDBMSPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificDBMSProperties_DBMS()
	{
		return (EAttribute)specificDBMSPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificDBMSProperties_SqlQuery()
	{
		return (EReference)specificDBMSPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificDBMSProperties_SqlFile()
	{
		return (EReference)specificDBMSPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSql()
	{
		return sqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSql_Id()
	{
		return (EAttribute)sqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSql_HqlQuery()
	{
		return (EAttribute)sqlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSql_Parameters()
	{
		return (EReference)sqlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlFile()
	{
		return sqlFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlFile_FilePath()
	{
		return (EAttribute)sqlFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlGroup()
	{
		return sqlGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlGroup_Id()
	{
		return (EAttribute)sqlGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlGroup_Description()
	{
		return (EAttribute)sqlGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlGroup_SqlQuery()
	{
		return (EReference)sqlGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlGroup_SqlFile()
	{
		return (EReference)sqlGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlGroup_SpecificDBMSProperties()
	{
		return (EReference)sqlGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlParameter()
	{
		return sqlParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlParameter_Index()
	{
		return (EAttribute)sqlParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlParameter_Name()
	{
		return (EAttribute)sqlParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlParameter_Type()
	{
		return (EAttribute)sqlParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlProperties()
	{
		return sqlPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlProperties_SqlGroup()
	{
		return (EReference)sqlPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlQuery()
	{
		return sqlQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_QueryString()
	{
		return (EAttribute)sqlQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDBMS()
	{
		return dbmsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType()
	{
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDBMSObject()
	{
		return dbmsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaName()
	{
		return javaNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyNoSpaces()
	{
		return nonEmptyNoSpacesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParameterTypeObject()
	{
		return parameterTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServerAddress()
	{
		return serverAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactory getPropertiesFactory()
	{
		return (PropertiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		databaseAliasEClass = createEClass(DATABASE_ALIAS);
		createEAttribute(databaseAliasEClass, DATABASE_ALIAS__ALIAS);
		createEAttribute(databaseAliasEClass, DATABASE_ALIAS__ID);

		databasePropertiesEClass = createEClass(DATABASE_PROPERTIES);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__ID);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__DRIVER_CLASS_NAME);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__DIALECT);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__SERVER_URL);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__DBMS);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__PORT);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__DATABASE_NAME);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__USERNAME);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__PASSWORD);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__NAMESPACE);
		createEAttribute(databasePropertiesEClass, DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME);
		createEReference(databasePropertiesEClass, DATABASE_PROPERTIES__SQL_PROPERTIES);
		createEReference(databasePropertiesEClass, DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES);

		databasePropertiesListTypeEClass = createEClass(DATABASE_PROPERTIES_LIST_TYPE);
		createEReference(databasePropertiesListTypeEClass, DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES);
		createEReference(databasePropertiesListTypeEClass, DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATABASE_PROPERTIES_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SQL_PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		specificDBMSPropertiesEClass = createEClass(SPECIFIC_DBMS_PROPERTIES);
		createEAttribute(specificDBMSPropertiesEClass, SPECIFIC_DBMS_PROPERTIES__DBMS);
		createEReference(specificDBMSPropertiesEClass, SPECIFIC_DBMS_PROPERTIES__SQL_QUERY);
		createEReference(specificDBMSPropertiesEClass, SPECIFIC_DBMS_PROPERTIES__SQL_FILE);

		sqlEClass = createEClass(SQL);
		createEAttribute(sqlEClass, SQL__ID);
		createEAttribute(sqlEClass, SQL__HQL_QUERY);
		createEReference(sqlEClass, SQL__PARAMETERS);

		sqlFileEClass = createEClass(SQL_FILE);
		createEAttribute(sqlFileEClass, SQL_FILE__FILE_PATH);

		sqlGroupEClass = createEClass(SQL_GROUP);
		createEAttribute(sqlGroupEClass, SQL_GROUP__ID);
		createEAttribute(sqlGroupEClass, SQL_GROUP__DESCRIPTION);
		createEReference(sqlGroupEClass, SQL_GROUP__SQL_QUERY);
		createEReference(sqlGroupEClass, SQL_GROUP__SQL_FILE);
		createEReference(sqlGroupEClass, SQL_GROUP__SPECIFIC_DBMS_PROPERTIES);

		sqlParameterEClass = createEClass(SQL_PARAMETER);
		createEAttribute(sqlParameterEClass, SQL_PARAMETER__INDEX);
		createEAttribute(sqlParameterEClass, SQL_PARAMETER__NAME);
		createEAttribute(sqlParameterEClass, SQL_PARAMETER__TYPE);

		sqlPropertiesEClass = createEClass(SQL_PROPERTIES);
		createEReference(sqlPropertiesEClass, SQL_PROPERTIES__SQL_GROUP);

		sqlQueryEClass = createEClass(SQL_QUERY);
		createEAttribute(sqlQueryEClass, SQL_QUERY__QUERY_STRING);

		// Create enums
		dbmsEEnum = createEEnum(DBMS);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);

		// Create data types
		dbmsObjectEDataType = createEDataType(DBMS_OBJECT);
		javaNameEDataType = createEDataType(JAVA_NAME);
		nonEmptyNoSpacesEDataType = createEDataType(NON_EMPTY_NO_SPACES);
		parameterTypeObjectEDataType = createEDataType(PARAMETER_TYPE_OBJECT);
		serverAddressEDataType = createEDataType(SERVER_ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqlFileEClass.getESuperTypes().add(this.getSql());
		sqlQueryEClass.getESuperTypes().add(this.getSql());

		// Initialize classes and features; add operations and parameters
		initEClass(databaseAliasEClass, DatabaseAlias.class, "DatabaseAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseAlias_Alias(), this.getNonEmptyNoSpaces(), "alias", null, 1, 1, DatabaseAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseAlias_Id(), this.getNonEmptyNoSpaces(), "id", null, 1, 1, DatabaseAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databasePropertiesEClass, DatabaseProperties.class, "DatabaseProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseProperties_Id(), this.getNonEmptyNoSpaces(), "id", null, 1, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_DriverClassName(), this.getJavaName(), "driverClassName", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_Dialect(), this.getJavaName(), "dialect", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_ServerURL(), this.getServerAddress(), "serverURL", null, 1, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_DBMS(), this.getDBMS(), "dBMS", null, 1, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_Port(), theXMLTypePackage.getInt(), "port", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_DatabaseName(), this.getNonEmptyNoSpaces(), "databaseName", null, 1, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_Username(), this.getNonEmptyNoSpaces(), "username", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_Password(), this.getNonEmptyNoSpaces(), "password", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_Namespace(), this.getNonEmptyNoSpaces(), "namespace", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseProperties_PersistenceUnitName(), this.getNonEmptyNoSpaces(), "persistenceUnitName", null, 1, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseProperties_SqlProperties(), this.getSqlProperties(), null, "sqlProperties", null, 0, 1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseProperties_AdditionalProperties(), this.getProperty(), null, "additionalProperties", null, 0, -1, DatabaseProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databasePropertiesListTypeEClass, DatabasePropertiesListType.class, "DatabasePropertiesListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabasePropertiesListType_DatabaseProperties(), this.getDatabaseProperties(), null, "databaseProperties", null, 0, -1, DatabasePropertiesListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabasePropertiesListType_DatabaseAlias(), this.getDatabaseAlias(), null, "databaseAlias", null, 0, -1, DatabasePropertiesListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DatabasePropertiesList(), this.getDatabasePropertiesListType(), null, "databasePropertiesList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SqlProperties(), this.getSqlProperties(), null, "sqlProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), this.getNonEmptyNoSpaces(), "key", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), this.getNonEmptyNoSpaces(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificDBMSPropertiesEClass, SpecificDBMSProperties.class, "SpecificDBMSProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificDBMSProperties_DBMS(), this.getDBMS(), "dBMS", null, 1, 1, SpecificDBMSProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificDBMSProperties_SqlQuery(), this.getSqlQuery(), null, "sqlQuery", null, 0, -1, SpecificDBMSProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificDBMSProperties_SqlFile(), this.getSqlFile(), null, "sqlFile", null, 0, -1, SpecificDBMSProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlEClass, Sql.class, "Sql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSql_Id(), this.getNonEmptyNoSpaces(), "id", null, 1, 1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSql_HqlQuery(), theXMLTypePackage.getBoolean(), "hqlQuery", "true", 1, 1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSql_Parameters(), this.getSqlParameter(), null, "parameters", null, 0, -1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlFileEClass, SqlFile.class, "SqlFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlFile_FilePath(), theXMLTypePackage.getString(), "filePath", null, 1, 1, SqlFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlGroupEClass, SqlGroup.class, "SqlGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlGroup_Id(), this.getNonEmptyNoSpaces(), "id", null, 1, 1, SqlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqlGroup_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, SqlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlGroup_SqlQuery(), this.getSqlQuery(), null, "sqlQuery", null, 0, -1, SqlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlGroup_SqlFile(), this.getSqlFile(), null, "sqlFile", null, 0, -1, SqlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlGroup_SpecificDBMSProperties(), this.getSpecificDBMSProperties(), null, "specificDBMSProperties", null, 0, -1, SqlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlParameterEClass, SqlParameter.class, "SqlParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlParameter_Index(), theXMLTypePackage.getInt(), "index", null, 0, 1, SqlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqlParameter_Name(), theXMLTypePackage.getToken(), "name", null, 0, 1, SqlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqlParameter_Type(), this.getParameterType(), "type", null, 1, 1, SqlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlPropertiesEClass, SqlProperties.class, "SqlProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqlProperties_SqlGroup(), this.getSqlGroup(), null, "sqlGroup", null, 1, -1, SqlProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlQueryEClass, SqlQuery.class, "SqlQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlQuery_QueryString(), theXMLTypePackage.getString(), "queryString", null, 1, 1, SqlQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dbmsEEnum, org.cropinformatics.sql.properties.DBMS.class, "DBMS");
		addEEnumLiteral(dbmsEEnum, org.cropinformatics.sql.properties.DBMS.MY_SQL);
		addEEnumLiteral(dbmsEEnum, org.cropinformatics.sql.properties.DBMS.PG_SQL);
		addEEnumLiteral(dbmsEEnum, org.cropinformatics.sql.properties.DBMS.HSQLDB);
		addEEnumLiteral(dbmsEEnum, org.cropinformatics.sql.properties.DBMS.SQ_LITE);
		addEEnumLiteral(dbmsEEnum, org.cropinformatics.sql.properties.DBMS.MS_ACCESS);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.ARRAY);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.ASCII_STREAM);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BIG_DECIMAL);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BINARY_STREAM);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BLOB);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BOOLEAN);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BYTE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BYTES);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.CHARACTER_STREAM);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.CLOB);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.DATE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.DATE_CALENDAR);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.DOUBLE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.FLOAT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.LONG);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.OBJECT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.REF);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.SHORT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TOKEN);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TIME);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TIME_CALENDAR);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TIMESTAMP);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TIME_STAMP_CALENDAR);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.UNICODE_STREAM);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.URL);

		// Initialize data types
		initEDataType(dbmsObjectEDataType, org.cropinformatics.sql.properties.DBMS.class, "DBMSObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaNameEDataType, String.class, "JavaName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonEmptyNoSpacesEDataType, String.class, "NonEmptyNoSpaces", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(parameterTypeObjectEDataType, ParameterType.class, "ParameterTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serverAddressEDataType, String.class, "ServerAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (databaseAliasEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "databaseAlias",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDatabaseAlias_Alias(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "alias"
		   });		
		addAnnotation
		  (getDatabaseAlias_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (databasePropertiesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "databaseProperties",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDatabaseProperties_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getDatabaseProperties_DriverClassName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "driverClassName"
		   });		
		addAnnotation
		  (getDatabaseProperties_Dialect(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "dialect"
		   });		
		addAnnotation
		  (getDatabaseProperties_ServerURL(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "serverURL"
		   });		
		addAnnotation
		  (getDatabaseProperties_DBMS(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "DBMS"
		   });		
		addAnnotation
		  (getDatabaseProperties_Port(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "port"
		   });		
		addAnnotation
		  (getDatabaseProperties_DatabaseName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "databaseName"
		   });		
		addAnnotation
		  (getDatabaseProperties_Username(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "username"
		   });		
		addAnnotation
		  (getDatabaseProperties_Password(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "password"
		   });		
		addAnnotation
		  (getDatabaseProperties_Namespace(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "namespace"
		   });		
		addAnnotation
		  (getDatabaseProperties_PersistenceUnitName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "persistenceUnitName"
		   });		
		addAnnotation
		  (getDatabaseProperties_SqlProperties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlProperties"
		   });		
		addAnnotation
		  (getDatabaseProperties_AdditionalProperties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "additionalProperties"
		   });		
		addAnnotation
		  (databasePropertiesListTypeEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "databasePropertiesList_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDatabasePropertiesListType_DatabaseProperties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "databaseProperties"
		   });		
		addAnnotation
		  (getDatabasePropertiesListType_DatabaseAlias(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "databaseAlias"
		   });			
		addAnnotation
		  (dbmsEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "DBMS"
		   });		
		addAnnotation
		  (dbmsObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "DBMS:Object",
			 "baseType", "DBMS"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_DatabasePropertiesList(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "databasePropertiesList",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SqlProperties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlProperties",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (javaNameEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "javaName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "^(([a-z])+.)+[A-Z]([A-Za-z])+$"
		   });			
		addAnnotation
		  (nonEmptyNoSpacesEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "NonEmptyNoSpaces",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[^\\s]+"
		   });			
		addAnnotation
		  (parameterTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "ParameterType"
		   });		
		addAnnotation
		  (parameterTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "ParameterType:Object",
			 "baseType", "ParameterType"
		   });		
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "property",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProperty_Key(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "key"
		   });		
		addAnnotation
		  (getProperty_Value(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "value"
		   });			
		addAnnotation
		  (serverAddressEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "serverAddress",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[^\\s]+"
		   });		
		addAnnotation
		  (specificDBMSPropertiesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "specificDBMSProperties",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpecificDBMSProperties_DBMS(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "DBMS"
		   });		
		addAnnotation
		  (getSpecificDBMSProperties_SqlQuery(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlQuery"
		   });		
		addAnnotation
		  (getSpecificDBMSProperties_SqlFile(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlFile"
		   });		
		addAnnotation
		  (sqlEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "sql",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSql_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getSql_HqlQuery(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "hqlQuery"
		   });		
		addAnnotation
		  (getSql_Parameters(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "parameters"
		   });		
		addAnnotation
		  (sqlFileEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "sqlFile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSqlFile_FilePath(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "filePath"
		   });		
		addAnnotation
		  (sqlGroupEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "sqlGroup",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSqlGroup_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getSqlGroup_Description(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getSqlGroup_SqlQuery(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlQuery"
		   });		
		addAnnotation
		  (getSqlGroup_SqlFile(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlFile"
		   });		
		addAnnotation
		  (getSqlGroup_SpecificDBMSProperties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "specificDBMSProperties"
		   });		
		addAnnotation
		  (sqlParameterEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "sqlParameter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSqlParameter_Index(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "index"
		   });		
		addAnnotation
		  (getSqlParameter_Name(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getSqlParameter_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (sqlPropertiesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "sqlProperties",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSqlProperties_SqlGroup(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "sqlGroup"
		   });		
		addAnnotation
		  (sqlQueryEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "sqlQuery",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSqlQuery_QueryString(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "queryString"
		   });
	}

} //PropertiesPackageImpl
