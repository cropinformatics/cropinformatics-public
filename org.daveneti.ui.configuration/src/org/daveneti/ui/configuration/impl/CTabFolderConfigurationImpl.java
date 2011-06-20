/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import org.daveneti.ui.configuration.CTabFolderConfiguration;
import org.daveneti.ui.configuration.ConfigurationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTab Folder Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.CTabFolderConfigurationImpl#getTabPosition <em>Tab Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CTabFolderConfigurationImpl extends ContainerConfigurationImpl implements CTabFolderConfiguration
{
	/**
	 * The default value of the '{@link #getTabPosition() <em>Tab Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int TAB_POSITION_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTabPosition() <em>Tab Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabPosition()
	 * @generated
	 * @ordered
	 */
	protected int tabPosition = TAB_POSITION_EDEFAULT;
	/**
	 * This is true if the Tab Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tabPositionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTabFolderConfigurationImpl()
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
		return ConfigurationPackage.Literals.CTAB_FOLDER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTabPosition()
	{
		return tabPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabPosition(int newTabPosition)
	{
		int oldTabPosition = tabPosition;
		tabPosition = newTabPosition;
		boolean oldTabPositionESet = tabPositionESet;
		tabPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CTAB_FOLDER_CONFIGURATION__TAB_POSITION, oldTabPosition, tabPosition, !oldTabPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTabPosition()
	{
		int oldTabPosition = tabPosition;
		boolean oldTabPositionESet = tabPositionESet;
		tabPosition = TAB_POSITION_EDEFAULT;
		tabPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.CTAB_FOLDER_CONFIGURATION__TAB_POSITION, oldTabPosition, TAB_POSITION_EDEFAULT, oldTabPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTabPosition()
	{
		return tabPositionESet;
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
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION__TAB_POSITION:
				return getTabPosition();
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
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION__TAB_POSITION:
				setTabPosition((Integer)newValue);
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
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION__TAB_POSITION:
				unsetTabPosition();
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
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION__TAB_POSITION:
				return isSetTabPosition();
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
		result.append(" (tabPosition: ");
		if (tabPositionESet) result.append(tabPosition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CTabFolderConfigurationImpl
