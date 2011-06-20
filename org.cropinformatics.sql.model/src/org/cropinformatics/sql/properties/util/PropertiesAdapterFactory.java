/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.util;

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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesPackage
 * @generated
 */
public class PropertiesAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = PropertiesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesSwitch<Adapter> modelSwitch =
		new PropertiesSwitch<Adapter>()
		{
			@Override
			public Adapter caseDatabaseAlias(DatabaseAlias object)
			{
				return createDatabaseAliasAdapter();
			}
			@Override
			public Adapter caseDatabaseProperties(DatabaseProperties object)
			{
				return createDatabasePropertiesAdapter();
			}
			@Override
			public Adapter caseDatabasePropertiesListType(DatabasePropertiesListType object)
			{
				return createDatabasePropertiesListTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object)
			{
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseProperty(Property object)
			{
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseSpecificDBMSProperties(SpecificDBMSProperties object)
			{
				return createSpecificDBMSPropertiesAdapter();
			}
			@Override
			public Adapter caseSql(Sql object)
			{
				return createSqlAdapter();
			}
			@Override
			public Adapter caseSqlFile(SqlFile object)
			{
				return createSqlFileAdapter();
			}
			@Override
			public Adapter caseSqlGroup(SqlGroup object)
			{
				return createSqlGroupAdapter();
			}
			@Override
			public Adapter caseSqlParameter(SqlParameter object)
			{
				return createSqlParameterAdapter();
			}
			@Override
			public Adapter caseSqlProperties(SqlProperties object)
			{
				return createSqlPropertiesAdapter();
			}
			@Override
			public Adapter caseSqlQuery(SqlQuery object)
			{
				return createSqlQueryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.DatabaseAlias <em>Database Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.DatabaseAlias
	 * @generated
	 */
	public Adapter createDatabaseAliasAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.DatabaseProperties <em>Database Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.DatabaseProperties
	 * @generated
	 */
	public Adapter createDatabasePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.DatabasePropertiesListType <em>Database Properties List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.DatabasePropertiesListType
	 * @generated
	 */
	public Adapter createDatabasePropertiesListTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.SpecificDBMSProperties <em>Specific DBMS Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.SpecificDBMSProperties
	 * @generated
	 */
	public Adapter createSpecificDBMSPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.Sql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.Sql
	 * @generated
	 */
	public Adapter createSqlAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.SqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.SqlFile
	 * @generated
	 */
	public Adapter createSqlFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.SqlGroup <em>Sql Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.SqlGroup
	 * @generated
	 */
	public Adapter createSqlGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.SqlParameter <em>Sql Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.SqlParameter
	 * @generated
	 */
	public Adapter createSqlParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.SqlProperties <em>Sql Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.SqlProperties
	 * @generated
	 */
	public Adapter createSqlPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cropinformatics.sql.properties.SqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cropinformatics.sql.properties.SqlQuery
	 * @generated
	 */
	public Adapter createSqlQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //PropertiesAdapterFactory
