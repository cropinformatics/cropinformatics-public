/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.util;

import java.util.Map;

import org.cropinformatics.sql.properties.DBMS;
import org.cropinformatics.sql.properties.DatabaseAlias;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.DatabasePropertiesListType;
import org.cropinformatics.sql.properties.DocumentRoot;
import org.cropinformatics.sql.properties.ParameterType;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.Property;
import org.cropinformatics.sql.properties.SpecificDBMSProperties;
import org.cropinformatics.sql.properties.Sql;
import org.cropinformatics.sql.properties.SqlFile;
import org.cropinformatics.sql.properties.SqlGroup;
import org.cropinformatics.sql.properties.SqlParameter;
import org.cropinformatics.sql.properties.SqlProperties;
import org.cropinformatics.sql.properties.SqlQuery;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesPackage
 * @generated
 */
public class PropertiesValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PropertiesValidator INSTANCE = new PropertiesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.cropinformatics.sql.properties";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesValidator()
	{
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return PropertiesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
			case PropertiesPackage.DATABASE_ALIAS:
				return validateDatabaseAlias((DatabaseAlias)value, diagnostics, context);
			case PropertiesPackage.DATABASE_PROPERTIES:
				return validateDatabaseProperties((DatabaseProperties)value, diagnostics, context);
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE:
				return validateDatabasePropertiesListType((DatabasePropertiesListType)value, diagnostics, context);
			case PropertiesPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PropertiesPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES:
				return validateSpecificDBMSProperties((SpecificDBMSProperties)value, diagnostics, context);
			case PropertiesPackage.SQL:
				return validateSql((Sql)value, diagnostics, context);
			case PropertiesPackage.SQL_FILE:
				return validateSqlFile((SqlFile)value, diagnostics, context);
			case PropertiesPackage.SQL_GROUP:
				return validateSqlGroup((SqlGroup)value, diagnostics, context);
			case PropertiesPackage.SQL_PARAMETER:
				return validateSqlParameter((SqlParameter)value, diagnostics, context);
			case PropertiesPackage.SQL_PROPERTIES:
				return validateSqlProperties((SqlProperties)value, diagnostics, context);
			case PropertiesPackage.SQL_QUERY:
				return validateSqlQuery((SqlQuery)value, diagnostics, context);
			case PropertiesPackage.DBMS:
				return validateDBMS((DBMS)value, diagnostics, context);
			case PropertiesPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case PropertiesPackage.DBMS_OBJECT:
				return validateDBMSObject((DBMS)value, diagnostics, context);
			case PropertiesPackage.JAVA_NAME:
				return validateJavaName((String)value, diagnostics, context);
			case PropertiesPackage.NON_EMPTY_NO_SPACES:
				return validateNonEmptyNoSpaces((String)value, diagnostics, context);
			case PropertiesPackage.PARAMETER_TYPE_OBJECT:
				return validateParameterTypeObject((ParameterType)value, diagnostics, context);
			case PropertiesPackage.SERVER_ADDRESS:
				return validateServerAddress((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseAlias(DatabaseAlias databaseAlias, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(databaseAlias, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseProperties(DatabaseProperties databaseProperties, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(databaseProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabasePropertiesListType(DatabasePropertiesListType databasePropertiesListType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(databasePropertiesListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificDBMSProperties(SpecificDBMSProperties specificDBMSProperties, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(specificDBMSProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSql(Sql sql, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sql, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlFile(SqlFile sqlFile, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sqlFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlGroup(SqlGroup sqlGroup, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sqlGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlParameter(SqlParameter sqlParameter, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sqlParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlProperties(SqlProperties sqlProperties, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sqlProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlQuery(SqlQuery sqlQuery, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sqlQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBMS(DBMS dbms, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBMSObject(DBMS dbmsObject, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaName(String javaName, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		boolean result = validateJavaName_Pattern(javaName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateJavaName_Pattern
	 */
	public static final  PatternMatcher [][] JAVA_NAME__PATTERN__VALUES =
		new PatternMatcher [][]
		{
			new PatternMatcher []
			{
				XMLTypeUtil.createPatternMatcher("^(([a-z])+.)+[A-Z]([A-Za-z])+$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Java Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaName_Pattern(String javaName, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validatePattern(PropertiesPackage.Literals.JAVA_NAME, javaName, JAVA_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyNoSpaces(String nonEmptyNoSpaces, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		boolean result = validateNonEmptyNoSpaces_Pattern(nonEmptyNoSpaces, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonEmptyNoSpaces_Pattern
	 */
	public static final  PatternMatcher [][] NON_EMPTY_NO_SPACES__PATTERN__VALUES =
		new PatternMatcher [][]
		{
			new PatternMatcher []
			{
				XMLTypeUtil.createPatternMatcher("[^\\s]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Non Empty No Spaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyNoSpaces_Pattern(String nonEmptyNoSpaces, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validatePattern(PropertiesPackage.Literals.NON_EMPTY_NO_SPACES, nonEmptyNoSpaces, NON_EMPTY_NO_SPACES__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterTypeObject(ParameterType parameterTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAddress(String serverAddress, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		boolean result = validateServerAddress_Pattern(serverAddress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateServerAddress_Pattern
	 */
	public static final  PatternMatcher [][] SERVER_ADDRESS__PATTERN__VALUES =
		new PatternMatcher [][]
		{
			new PatternMatcher []
			{
				XMLTypeUtil.createPatternMatcher("[^\\s]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Server Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAddress_Pattern(String serverAddress, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validatePattern(PropertiesPackage.Literals.SERVER_ADDRESS, serverAddress, SERVER_ADDRESS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PropertiesValidator
