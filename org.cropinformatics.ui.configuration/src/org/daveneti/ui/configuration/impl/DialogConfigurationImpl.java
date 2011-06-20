/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.DialogConfigurationImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.DialogConfigurationImpl#isResizable <em>Resizable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogConfigurationImpl extends ConfigurationImpl implements DialogConfiguration
{
	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected ControlConfiguration control;

	/**
	 * The default value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizable()
	 * @generated
	 * @ordered
	 */
	protected boolean resizable = RESIZABLE_EDEFAULT;

	/**
	 * This is true if the Resizable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resizableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogConfigurationImpl()
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
		return ConfigurationPackage.Literals.DIALOG_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConfiguration getControl()
	{
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(ControlConfiguration newControl, NotificationChain msgs)
	{
		ControlConfiguration oldControl = control;
		control = newControl;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL, oldControl, newControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(ControlConfiguration newControl)
	{
		if (newControl != control)
		{
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject)control).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResizable()
	{
		return resizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizable(boolean newResizable)
	{
		boolean oldResizable = resizable;
		resizable = newResizable;
		boolean oldResizableESet = resizableESet;
		resizableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DIALOG_CONFIGURATION__RESIZABLE, oldResizable, resizable, !oldResizableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResizable()
	{
		boolean oldResizable = resizable;
		boolean oldResizableESet = resizableESet;
		resizable = RESIZABLE_EDEFAULT;
		resizableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.DIALOG_CONFIGURATION__RESIZABLE, oldResizable, RESIZABLE_EDEFAULT, oldResizableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResizable()
	{
		return resizableESet;
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
			case ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL:
				return basicSetControl(null, msgs);
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
			case ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL:
				return getControl();
			case ConfigurationPackage.DIALOG_CONFIGURATION__RESIZABLE:
				return isResizable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL:
				setControl((ControlConfiguration)newValue);
				return;
			case ConfigurationPackage.DIALOG_CONFIGURATION__RESIZABLE:
				setResizable((Boolean)newValue);
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
			case ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL:
				setControl((ControlConfiguration)null);
				return;
			case ConfigurationPackage.DIALOG_CONFIGURATION__RESIZABLE:
				unsetResizable();
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
			case ConfigurationPackage.DIALOG_CONFIGURATION__CONTROL:
				return control != null;
			case ConfigurationPackage.DIALOG_CONFIGURATION__RESIZABLE:
				return isSetResizable();
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
		result.append(" (resizable: ");
		if (resizableESet) result.append(resizable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DialogConfigurationImpl
