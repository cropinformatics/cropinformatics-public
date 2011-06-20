/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.Colour;
import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.LayoutData;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlConfigurationImpl extends ComponentConfigurationImpl implements ControlConfiguration
{
	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected LayoutData layoutData;

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected Colour foreground;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Colour background;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConfigurationImpl()
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
		return ConfigurationPackage.Literals.CONTROL_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutData getLayoutData()
	{
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(LayoutData newLayoutData, NotificationChain msgs)
	{
		LayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA, oldLayoutData, newLayoutData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutData(LayoutData newLayoutData)
	{
		if (newLayoutData != layoutData)
		{
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA, null, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject)newLayoutData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA, null, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA, newLayoutData, newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour getForeground()
	{
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeground(Colour newForeground, NotificationChain msgs)
	{
		Colour oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND, oldForeground, newForeground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(Colour newForeground)
	{
		if (newForeground != foreground)
		{
			NotificationChain msgs = null;
			if (foreground != null)
				msgs = ((InternalEObject)foreground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND, null, msgs);
			if (newForeground != null)
				msgs = ((InternalEObject)newForeground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND, null, msgs);
			msgs = basicSetForeground(newForeground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND, newForeground, newForeground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour getBackground()
	{
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(Colour newBackground, NotificationChain msgs)
	{
		Colour oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND, oldBackground, newBackground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(Colour newBackground)
	{
		if (newBackground != background)
		{
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND, newBackground, newBackground));
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
			case ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
			case ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND:
				return basicSetForeground(null, msgs);
			case ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND:
				return basicSetBackground(null, msgs);
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
			case ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA:
				return getLayoutData();
			case ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND:
				return getForeground();
			case ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND:
				return getBackground();
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
			case ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA:
				setLayoutData((LayoutData)newValue);
				return;
			case ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND:
				setForeground((Colour)newValue);
				return;
			case ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND:
				setBackground((Colour)newValue);
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
			case ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA:
				setLayoutData((LayoutData)null);
				return;
			case ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND:
				setForeground((Colour)null);
				return;
			case ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND:
				setBackground((Colour)null);
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
			case ConfigurationPackage.CONTROL_CONFIGURATION__LAYOUT_DATA:
				return layoutData != null;
			case ConfigurationPackage.CONTROL_CONFIGURATION__FOREGROUND:
				return foreground != null;
			case ConfigurationPackage.CONTROL_CONFIGURATION__BACKGROUND:
				return background != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlConfigurationImpl
