/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import org.cropinformatics.sql.properties.DBMS;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesFactoryImpl extends EFactoryImpl implements PropertiesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertiesFactory init()
	{
		try
		{
			PropertiesFactory thePropertiesFactory = (PropertiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cropinformatics.org/sqlProperties"); 
			if (thePropertiesFactory != null)
			{
				return thePropertiesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case PropertiesPackage.DATABASE_ALIAS: return createDatabaseAlias();
			case PropertiesPackage.DATABASE_PROPERTIES: return createDatabaseProperties();
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE: return createDatabasePropertiesListType();
			case PropertiesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PropertiesPackage.PROPERTY: return createProperty();
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES: return createSpecificDBMSProperties();
			case PropertiesPackage.SQL: return createSql();
			case PropertiesPackage.SQL_FILE: return createSqlFile();
			case PropertiesPackage.SQL_GROUP: return createSqlGroup();
			case PropertiesPackage.SQL_PARAMETER: return createSqlParameter();
			case PropertiesPackage.SQL_PROPERTIES: return createSqlProperties();
			case PropertiesPackage.SQL_QUERY: return createSqlQuery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case PropertiesPackage.DBMS:
				return createDBMSFromString(eDataType, initialValue);
			case PropertiesPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case PropertiesPackage.DBMS_OBJECT:
				return createDBMSObjectFromString(eDataType, initialValue);
			case PropertiesPackage.JAVA_NAME:
				return createJavaNameFromString(eDataType, initialValue);
			case PropertiesPackage.NON_EMPTY_NO_SPACES:
				return createNonEmptyNoSpacesFromString(eDataType, initialValue);
			case PropertiesPackage.PARAMETER_TYPE_OBJECT:
				return createParameterTypeObjectFromString(eDataType, initialValue);
			case PropertiesPackage.SERVER_ADDRESS:
				return createServerAddressFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case PropertiesPackage.DBMS:
				return convertDBMSToString(eDataType, instanceValue);
			case PropertiesPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case PropertiesPackage.DBMS_OBJECT:
				return convertDBMSObjectToString(eDataType, instanceValue);
			case PropertiesPackage.JAVA_NAME:
				return convertJavaNameToString(eDataType, instanceValue);
			case PropertiesPackage.NON_EMPTY_NO_SPACES:
				return convertNonEmptyNoSpacesToString(eDataType, instanceValue);
			case PropertiesPackage.PARAMETER_TYPE_OBJECT:
				return convertParameterTypeObjectToString(eDataType, instanceValue);
			case PropertiesPackage.SERVER_ADDRESS:
				return convertServerAddressToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseAlias createDatabaseAlias()
	{
		DatabaseAliasImpl databaseAlias = new DatabaseAliasImpl();
		return databaseAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseProperties createDatabaseProperties()
	{
		DatabasePropertiesImpl databaseProperties = new DatabasePropertiesImpl();
		return databaseProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasePropertiesListType createDatabasePropertiesListType()
	{
		DatabasePropertiesListTypeImpl databasePropertiesListType = new DatabasePropertiesListTypeImpl();
		return databasePropertiesListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot()
	{
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty()
	{
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDBMSProperties createSpecificDBMSProperties()
	{
		SpecificDBMSPropertiesImpl specificDBMSProperties = new SpecificDBMSPropertiesImpl();
		return specificDBMSProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sql createSql()
	{
		SqlImpl sql = new SqlImpl();
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFile createSqlFile()
	{
		SqlFileImpl sqlFile = new SqlFileImpl();
		return sqlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlGroup createSqlGroup()
	{
		SqlGroupImpl sqlGroup = new SqlGroupImpl();
		return sqlGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlParameter createSqlParameter()
	{
		SqlParameterImpl sqlParameter = new SqlParameterImpl();
		return sqlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlProperties createSqlProperties()
	{
		SqlPropertiesImpl sqlProperties = new SqlPropertiesImpl();
		return sqlProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlQuery createSqlQuery()
	{
		SqlQueryImpl sqlQuery = new SqlQueryImpl();
		return sqlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBMS createDBMSFromString(EDataType eDataType, String initialValue)
	{
		DBMS result = DBMS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBMSToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue)
	{
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBMS createDBMSObjectFromString(EDataType eDataType, String initialValue)
	{
		return createDBMSFromString(PropertiesPackage.Literals.DBMS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBMSObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertDBMSToString(PropertiesPackage.Literals.DBMS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaNameFromString(EDataType eDataType, String initialValue)
	{
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaNameToString(EDataType eDataType, Object instanceValue)
	{
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyNoSpacesFromString(EDataType eDataType, String initialValue)
	{
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyNoSpacesToString(EDataType eDataType, Object instanceValue)
	{
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeObjectFromString(EDataType eDataType, String initialValue)
	{
		return createParameterTypeFromString(PropertiesPackage.Literals.PARAMETER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeObjectToString(EDataType eDataType, Object instanceValue)
	{
		return convertParameterTypeToString(PropertiesPackage.Literals.PARAMETER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServerAddressFromString(EDataType eDataType, String initialValue)
	{
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerAddressToString(EDataType eDataType, Object instanceValue)
	{
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesPackage getPropertiesPackage()
	{
		return (PropertiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertiesPackage getPackage()
	{
		return PropertiesPackage.eINSTANCE;
	}

} //PropertiesFactoryImpl
