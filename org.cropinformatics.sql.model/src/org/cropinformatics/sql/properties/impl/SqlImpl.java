/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import java.util.Collection;

import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.Sql;
import org.cropinformatics.sql.properties.SqlParameter;
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
 * An implementation of the model object '<em><b>Sql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlImpl#isHqlQuery <em>Hql Query</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.SqlImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlImpl extends EObjectImpl implements Sql
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
	 * The default value of the '{@link #isHqlQuery() <em>Hql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHqlQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HQL_QUERY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHqlQuery() <em>Hql Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHqlQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean hqlQuery = HQL_QUERY_EDEFAULT;

	/**
	 * This is true if the Hql Query attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hqlQueryESet;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SqlParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlImpl()
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
		return PropertiesPackage.Literals.SQL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SQL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHqlQuery()
	{
		return hqlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHqlQuery(boolean newHqlQuery)
	{
		boolean oldHqlQuery = hqlQuery;
		hqlQuery = newHqlQuery;
		boolean oldHqlQueryESet = hqlQueryESet;
		hqlQueryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SQL__HQL_QUERY, oldHqlQuery, hqlQuery, !oldHqlQueryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHqlQuery()
	{
		boolean oldHqlQuery = hqlQuery;
		boolean oldHqlQueryESet = hqlQueryESet;
		hqlQuery = HQL_QUERY_EDEFAULT;
		hqlQueryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PropertiesPackage.SQL__HQL_QUERY, oldHqlQuery, HQL_QUERY_EDEFAULT, oldHqlQueryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHqlQuery()
	{
		return hqlQueryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<SqlParameter>(SqlParameter.class, this, PropertiesPackage.SQL__PARAMETERS);
		}
		return parameters;
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
			case PropertiesPackage.SQL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.SQL__ID:
				return getId();
			case PropertiesPackage.SQL__HQL_QUERY:
				return isHqlQuery();
			case PropertiesPackage.SQL__PARAMETERS:
				return getParameters();
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
			case PropertiesPackage.SQL__ID:
				setId((String)newValue);
				return;
			case PropertiesPackage.SQL__HQL_QUERY:
				setHqlQuery((Boolean)newValue);
				return;
			case PropertiesPackage.SQL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SqlParameter>)newValue);
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
			case PropertiesPackage.SQL__ID:
				setId(ID_EDEFAULT);
				return;
			case PropertiesPackage.SQL__HQL_QUERY:
				unsetHqlQuery();
				return;
			case PropertiesPackage.SQL__PARAMETERS:
				getParameters().clear();
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
			case PropertiesPackage.SQL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PropertiesPackage.SQL__HQL_QUERY:
				return isSetHqlQuery();
			case PropertiesPackage.SQL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(", hqlQuery: ");
		if (hqlQueryESet) result.append(hqlQuery); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SqlImpl
