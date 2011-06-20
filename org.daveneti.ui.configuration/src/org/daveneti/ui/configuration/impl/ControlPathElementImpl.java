/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import java.util.Collection;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.ControlPathElement;
import org.daveneti.ui.configuration.SubPath;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.ControlPathElementImpl#getConditionProperty <em>Condition Property</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.ControlPathElementImpl#getConditionPageId <em>Condition Page Id</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.ControlPathElementImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.ControlPathElementImpl#getSubPaths <em>Sub Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlPathElementImpl extends PathElementImpl implements ControlPathElement
{
	/**
	 * The default value of the '{@link #getConditionProperty() <em>Condition Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionProperty() <em>Condition Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionProperty()
	 * @generated
	 * @ordered
	 */
	protected String conditionProperty = CONDITION_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionPageId() <em>Condition Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_PAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionPageId() <em>Condition Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionPageId()
	 * @generated
	 * @ordered
	 */
	protected String conditionPageId = CONDITION_PAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPaths() <em>Sub Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<SubPath> subPaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlPathElementImpl()
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
		return ConfigurationPackage.Literals.CONTROL_PATH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionProperty()
	{
		return conditionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionProperty(String newConditionProperty)
	{
		String oldConditionProperty = conditionProperty;
		conditionProperty = newConditionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PROPERTY, oldConditionProperty, conditionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionPageId()
	{
		return conditionPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionPageId(String newConditionPageId)
	{
		String oldConditionPageId = conditionPageId;
		conditionPageId = newConditionPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID, oldConditionPageId, conditionPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue()
	{
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue)
	{
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_PATH_ELEMENT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPath> getSubPaths()
	{
		if (subPaths == null)
		{
			subPaths = new EObjectContainmentEList<SubPath>(SubPath.class, this, ConfigurationPackage.CONTROL_PATH_ELEMENT__SUB_PATHS);
		}
		return subPaths;
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
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__SUB_PATHS:
				return ((InternalEList<?>)getSubPaths()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PROPERTY:
				return getConditionProperty();
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID:
				return getConditionPageId();
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__DEFAULT_VALUE:
				return getDefaultValue();
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__SUB_PATHS:
				return getSubPaths();
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
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PROPERTY:
				setConditionProperty((String)newValue);
				return;
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID:
				setConditionPageId((String)newValue);
				return;
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__SUB_PATHS:
				getSubPaths().clear();
				getSubPaths().addAll((Collection<? extends SubPath>)newValue);
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
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PROPERTY:
				setConditionProperty(CONDITION_PROPERTY_EDEFAULT);
				return;
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID:
				setConditionPageId(CONDITION_PAGE_ID_EDEFAULT);
				return;
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__SUB_PATHS:
				getSubPaths().clear();
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
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PROPERTY:
				return CONDITION_PROPERTY_EDEFAULT == null ? conditionProperty != null : !CONDITION_PROPERTY_EDEFAULT.equals(conditionProperty);
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID:
				return CONDITION_PAGE_ID_EDEFAULT == null ? conditionPageId != null : !CONDITION_PAGE_ID_EDEFAULT.equals(conditionPageId);
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case ConfigurationPackage.CONTROL_PATH_ELEMENT__SUB_PATHS:
				return subPaths != null && !subPaths.isEmpty();
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
		result.append(" (conditionProperty: ");
		result.append(conditionProperty);
		result.append(", conditionPageId: ");
		result.append(conditionPageId);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ControlPathElementImpl
