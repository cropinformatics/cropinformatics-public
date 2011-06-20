/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.QueryResultViewerConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Result Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.QueryResultViewerConfigurationImpl#isRunningQueryOnFirstUse <em>Running Query On First Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryResultViewerConfigurationImpl extends ViewerConfigurationImpl implements QueryResultViewerConfiguration
{
	/**
	 * The default value of the '{@link #isRunningQueryOnFirstUse() <em>Running Query On First Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunningQueryOnFirstUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_QUERY_ON_FIRST_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunningQueryOnFirstUse() <em>Running Query On First Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunningQueryOnFirstUse()
	 * @generated
	 * @ordered
	 */
	protected boolean runningQueryOnFirstUse = RUNNING_QUERY_ON_FIRST_USE_EDEFAULT;

	/**
	 * This is true if the Running Query On First Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean runningQueryOnFirstUseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryResultViewerConfigurationImpl()
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
		return ConfigurationPackage.Literals.QUERY_RESULT_VIEWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunningQueryOnFirstUse()
	{
		return runningQueryOnFirstUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningQueryOnFirstUse(boolean newRunningQueryOnFirstUse)
	{
		boolean oldRunningQueryOnFirstUse = runningQueryOnFirstUse;
		runningQueryOnFirstUse = newRunningQueryOnFirstUse;
		boolean oldRunningQueryOnFirstUseESet = runningQueryOnFirstUseESet;
		runningQueryOnFirstUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE, oldRunningQueryOnFirstUse, runningQueryOnFirstUse, !oldRunningQueryOnFirstUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRunningQueryOnFirstUse()
	{
		boolean oldRunningQueryOnFirstUse = runningQueryOnFirstUse;
		boolean oldRunningQueryOnFirstUseESet = runningQueryOnFirstUseESet;
		runningQueryOnFirstUse = RUNNING_QUERY_ON_FIRST_USE_EDEFAULT;
		runningQueryOnFirstUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE, oldRunningQueryOnFirstUse, RUNNING_QUERY_ON_FIRST_USE_EDEFAULT, oldRunningQueryOnFirstUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRunningQueryOnFirstUse()
	{
		return runningQueryOnFirstUseESet;
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
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE:
				return isRunningQueryOnFirstUse();
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
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE:
				setRunningQueryOnFirstUse((Boolean)newValue);
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
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE:
				unsetRunningQueryOnFirstUse();
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
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE:
				return isSetRunningQueryOnFirstUse();
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
		result.append(" (runningQueryOnFirstUse: ");
		if (runningQueryOnFirstUseESet) result.append(runningQueryOnFirstUse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryResultViewerConfigurationImpl
