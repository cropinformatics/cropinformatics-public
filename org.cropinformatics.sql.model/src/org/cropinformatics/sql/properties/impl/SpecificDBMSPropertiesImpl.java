/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import java.util.Collection;

import org.cropinformatics.sql.properties.DBMS;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.SpecificDBMSProperties;
import org.cropinformatics.sql.properties.SqlFile;
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
 * An implementation of the model object '<em><b>Specific DBMS Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl#getDBMS <em>DBMS</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SpecificDBMSPropertiesImpl#getSqlFile <em>Sql File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificDBMSPropertiesImpl extends EObjectImpl implements SpecificDBMSProperties
{
	/**
	 * The default value of the '{@link #getDBMS() <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBMS()
	 * @generated
	 * @ordered
	 */
	protected static final DBMS DBMS_EDEFAULT = DBMS.MY_SQL;

	/**
	 * The cached value of the '{@link #getDBMS() <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBMS()
	 * @generated
	 * @ordered
	 */
	protected DBMS dBMS = DBMS_EDEFAULT;

	/**
	 * This is true if the DBMS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dBMSESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificDBMSPropertiesImpl()
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
		return PropertiesPackage.Literals.SPECIFIC_DBMS_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBMS getDBMS()
	{
		return dBMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBMS(DBMS newDBMS)
	{
		DBMS oldDBMS = dBMS;
		dBMS = newDBMS == null ? DBMS_EDEFAULT : newDBMS;
		boolean oldDBMSESet = dBMSESet;
		dBMSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__DBMS, oldDBMS, dBMS, !oldDBMSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDBMS()
	{
		DBMS oldDBMS = dBMS;
		boolean oldDBMSESet = dBMSESet;
		dBMS = DBMS_EDEFAULT;
		dBMSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__DBMS, oldDBMS, DBMS_EDEFAULT, oldDBMSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDBMS()
	{
		return dBMSESet;
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
			sqlQuery = new EObjectContainmentEList<SqlQuery>(SqlQuery.class, this, PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_QUERY);
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
			sqlFile = new EObjectContainmentEList<SqlFile>(SqlFile.class, this, PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_FILE);
		}
		return sqlFile;
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
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_QUERY:
				return ((InternalEList<?>)getSqlQuery()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_FILE:
				return ((InternalEList<?>)getSqlFile()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__DBMS:
				return getDBMS();
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_QUERY:
				return getSqlQuery();
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_FILE:
				return getSqlFile();
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
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__DBMS:
				setDBMS((DBMS)newValue);
				return;
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_QUERY:
				getSqlQuery().clear();
				getSqlQuery().addAll((Collection<? extends SqlQuery>)newValue);
				return;
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_FILE:
				getSqlFile().clear();
				getSqlFile().addAll((Collection<? extends SqlFile>)newValue);
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
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__DBMS:
				unsetDBMS();
				return;
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_QUERY:
				getSqlQuery().clear();
				return;
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_FILE:
				getSqlFile().clear();
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
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__DBMS:
				return isSetDBMS();
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_QUERY:
				return sqlQuery != null && !sqlQuery.isEmpty();
			case PropertiesPackage.SPECIFIC_DBMS_PROPERTIES__SQL_FILE:
				return sqlFile != null && !sqlFile.isEmpty();
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
		result.append(" (dBMS: ");
		if (dBMSESet) result.append(dBMS); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpecificDBMSPropertiesImpl
