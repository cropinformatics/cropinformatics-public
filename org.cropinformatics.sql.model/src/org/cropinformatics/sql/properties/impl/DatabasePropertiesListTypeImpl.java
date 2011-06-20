/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import java.util.Collection;

import org.cropinformatics.sql.properties.DatabaseAlias;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.DatabasePropertiesListType;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Properties List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesListTypeImpl#getDatabaseProperties <em>Database Properties</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesListTypeImpl#getDatabaseAlias <em>Database Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabasePropertiesListTypeImpl extends EObjectImpl implements DatabasePropertiesListType
{
	/**
	 * The cached value of the '{@link #getDatabaseProperties() <em>Database Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseProperties> databaseProperties;

	/**
	 * The cached value of the '{@link #getDatabaseAlias() <em>Database Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseAlias> databaseAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabasePropertiesListTypeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PropertiesPackage.Literals.DATABASE_PROPERTIES_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseProperties> getDatabaseProperties()
	{
		if (databaseProperties == null)
		{
			databaseProperties = new EObjectContainmentEList<DatabaseProperties>(DatabaseProperties.class, this, PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES);
		}
		return databaseProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseAlias> getDatabaseAlias()
	{
		if (databaseAlias == null)
		{
			databaseAlias = new EObjectContainmentEList<DatabaseAlias>(DatabaseAlias.class, this, PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS);
		}
		return databaseAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES:
				return ((InternalEList<?>)getDatabaseProperties()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS:
				return ((InternalEList<?>)getDatabaseAlias()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES:
				return getDatabaseProperties();
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS:
				return getDatabaseAlias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES:
				getDatabaseProperties().clear();
				getDatabaseProperties().addAll((Collection<? extends DatabaseProperties>)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS:
				getDatabaseAlias().clear();
				getDatabaseAlias().addAll((Collection<? extends DatabaseAlias>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES:
				getDatabaseProperties().clear();
				return;
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS:
				getDatabaseAlias().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_PROPERTIES:
				return databaseProperties != null && !databaseProperties.isEmpty();
			case PropertiesPackage.DATABASE_PROPERTIES_LIST_TYPE__DATABASE_ALIAS:
				return databaseAlias != null && !databaseAlias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabasePropertiesListTypeImpl
