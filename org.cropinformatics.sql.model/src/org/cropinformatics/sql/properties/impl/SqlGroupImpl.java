/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import java.util.Collection;

import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.SpecificDBMSProperties;
import org.cropinformatics.sql.properties.SqlFile;
import org.cropinformatics.sql.properties.SqlGroup;
import org.cropinformatics.sql.properties.SqlQuery;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlGroupImpl#getSpecificDBMSProperties <em>Specific DBMS Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlGroupImpl extends EObjectImpl implements SqlGroup
{
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSqlQuery() <em>Sql Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<SqlQuery> sqlQuery;

	/**
	 * The cached value of the '{@link #getSqlFile() <em>Sql File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlFile()
	 * @generated
	 * @ordered
	 */
	protected EList<SqlFile> sqlFile;

	/**
	 * The cached value of the '{@link #getSpecificDBMSProperties() <em>Specific DBMS Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificDBMSProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificDBMSProperties> specificDBMSProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlGroupImpl()
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
		return PropertiesPackage.Literals.SQL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId)
	{
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SQL_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SQL_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlQuery> getSqlQuery()
	{
		if (sqlQuery == null)
		{
			sqlQuery = new EObjectContainmentEList<SqlQuery>(SqlQuery.class, this, PropertiesPackage.SQL_GROUP__SQL_QUERY);
		}
		return sqlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlFile> getSqlFile()
	{
		if (sqlFile == null)
		{
			sqlFile = new EObjectContainmentEList<SqlFile>(SqlFile.class, this, PropertiesPackage.SQL_GROUP__SQL_FILE);
		}
		return sqlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDBMSProperties> getSpecificDBMSProperties()
	{
		if (specificDBMSProperties == null)
		{
			specificDBMSProperties = new EObjectContainmentEList<SpecificDBMSProperties>(SpecificDBMSProperties.class, this, PropertiesPackage.SQL_GROUP__SPECIFIC_DBMS_PROPERTIES);
		}
		return specificDBMSProperties;
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
			case PropertiesPackage.SQL_GROUP__SQL_QUERY:
				return ((InternalEList<?>)getSqlQuery()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.SQL_GROUP__SQL_FILE:
				return ((InternalEList<?>)getSqlFile()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.SQL_GROUP__SPECIFIC_DBMS_PROPERTIES:
				return ((InternalEList<?>)getSpecificDBMSProperties()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.SQL_GROUP__ID:
				return getId();
			case PropertiesPackage.SQL_GROUP__DESCRIPTION:
				return getDescription();
			case PropertiesPackage.SQL_GROUP__SQL_QUERY:
				return getSqlQuery();
			case PropertiesPackage.SQL_GROUP__SQL_FILE:
				return getSqlFile();
			case PropertiesPackage.SQL_GROUP__SPECIFIC_DBMS_PROPERTIES:
				return getSpecificDBMSProperties();
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
			case PropertiesPackage.SQL_GROUP__ID:
				setId((String)newValue);
				return;
			case PropertiesPackage.SQL_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PropertiesPackage.SQL_GROUP__SQL_QUERY:
				getSqlQuery().clear();
				getSqlQuery().addAll((Collection<? extends SqlQuery>)newValue);
				return;
			case PropertiesPackage.SQL_GROUP__SQL_FILE:
				getSqlFile().clear();
				getSqlFile().addAll((Collection<? extends SqlFile>)newValue);
				return;
			case PropertiesPackage.SQL_GROUP__SPECIFIC_DBMS_PROPERTIES:
				getSpecificDBMSProperties().clear();
				getSpecificDBMSProperties().addAll((Collection<? extends SpecificDBMSProperties>)newValue);
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
			case PropertiesPackage.SQL_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case PropertiesPackage.SQL_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PropertiesPackage.SQL_GROUP__SQL_QUERY:
				getSqlQuery().clear();
				return;
			case PropertiesPackage.SQL_GROUP__SQL_FILE:
				getSqlFile().clear();
				return;
			case PropertiesPackage.SQL_GROUP__SPECIFIC_DBMS_PROPERTIES:
				getSpecificDBMSProperties().clear();
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
			case PropertiesPackage.SQL_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PropertiesPackage.SQL_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PropertiesPackage.SQL_GROUP__SQL_QUERY:
				return sqlQuery != null && !sqlQuery.isEmpty();
			case PropertiesPackage.SQL_GROUP__SQL_FILE:
				return sqlFile != null && !sqlFile.isEmpty();
			case PropertiesPackage.SQL_GROUP__SPECIFIC_DBMS_PROPERTIES:
				return specificDBMSProperties != null && !specificDBMSProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SqlGroupImpl
