/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.util;

import java.util.List;

import org.cropinformatics.sql.properties.DatabaseAlias;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.DatabasePropertiesListType;
import org.cropinformatics.sql.properties.DocumentRoot;
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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesPackage
 * @generated
 */
public class PropertiesSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PropertiesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PropertiesPackage.DATABASE_ALIAS:
			{
				DatabaseAlias databaseAlias = (DatabaseAlias)theEObject;
				T result = caseDatabaseAlias(databaseAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.DATABASE_PROPERTIES:
			{
				DatabaseProperties databaseProperties = (DatabaseProperties)theEObject;
				T result = caseDatabaseProperties(databaseProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE:
			{
				DatabasePropertiesListType databasePropertiesListType = (DatabasePropertiesListType)theEObject;
				T result = caseDatabasePropertiesListType(databasePropertiesListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.DOCUMENT_ROOT:
			{
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.PROPERTY:
			{
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES:
			{
				SpecificDBMSProperties specificDBMSProperties = (SpecificDBMSProperties)theEObject;
				T result = caseSpecificDBMSProperties(specificDBMSProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SQL:
			{
				Sql sql = (Sql)theEObject;
				T result = caseSql(sql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SQL_FILE:
			{
				SqlFile sqlFile = (SqlFile)theEObject;
				T result = caseSqlFile(sqlFile);
				if (result == null) result = caseSql(sqlFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SQL_GROUP:
			{
				SqlGroup sqlGroup = (SqlGroup)theEObject;
				T result = caseSqlGroup(sqlGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SQL_PARAMETER:
			{
				SqlParameter sqlParameter = (SqlParameter)theEObject;
				T result = caseSqlParameter(sqlParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SQL_PROPERTIES:
			{
				SqlProperties sqlProperties = (SqlProperties)theEObject;
				T result = caseSqlProperties(sqlProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SQL_QUERY:
			{
				SqlQuery sqlQuery = (SqlQuery)theEObject;
				T result = caseSqlQuery(sqlQuery);
				if (result == null) result = caseSql(sqlQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseAlias(DatabaseAlias object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseProperties(DatabaseProperties object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Properties List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Properties List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabasePropertiesListType(DatabasePropertiesListType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific DBMS Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific DBMS Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificDBMSProperties(SpecificDBMSProperties object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSql(Sql object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlFile(SqlFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlGroup(SqlGroup object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlParameter(SqlParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlProperties(SqlProperties object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlQuery(SqlQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PropertiesSwitch
