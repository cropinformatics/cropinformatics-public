/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import java.util.Collection;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.MultipleListViewerConfiguration;
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
 * An implementation of the model object '<em><b>Multiple List Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.MultipleListViewerConfigurationImpl#getChildConfiguration <em>Child Configuration</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.MultipleListViewerConfigurationImpl#isThreadingInUse <em>Threading In Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleListViewerConfigurationImpl extends ViewerConfigurationImpl implements MultipleListViewerConfiguration
{
	/**
	 * The cached value of the '{@link #getChildConfiguration() <em>Child Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ListViewerConfiguration> childConfiguration;

	/**
	 * The default value of the '{@link #isThreadingInUse() <em>Threading In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadingInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREADING_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadingInUse() <em>Threading In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadingInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean threadingInUse = THREADING_IN_USE_EDEFAULT;

	/**
	 * This is true if the Threading In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean threadingInUseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleListViewerConfigurationImpl()
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
		return ConfigurationPackage.Literals.MULTIPLE_LIST_VIEWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListViewerConfiguration> getChildConfiguration()
	{
		if (childConfiguration == null)
		{
			childConfiguration = new EObjectContainmentEList<ListViewerConfiguration>(ListViewerConfiguration.class, this, ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION);
		}
		return childConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadingInUse()
	{
		return threadingInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadingInUse(boolean newThreadingInUse)
	{
		boolean oldThreadingInUse = threadingInUse;
		threadingInUse = newThreadingInUse;
		boolean oldThreadingInUseESet = threadingInUseESet;
		threadingInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE, oldThreadingInUse, threadingInUse, !oldThreadingInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThreadingInUse()
	{
		boolean oldThreadingInUse = threadingInUse;
		boolean oldThreadingInUseESet = threadingInUseESet;
		threadingInUse = THREADING_IN_USE_EDEFAULT;
		threadingInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE, oldThreadingInUse, THREADING_IN_USE_EDEFAULT, oldThreadingInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThreadingInUse()
	{
		return threadingInUseESet;
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
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION:
				return ((InternalEList<?>)getChildConfiguration()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION:
				return getChildConfiguration();
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				return isThreadingInUse();
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
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION:
				getChildConfiguration().clear();
				getChildConfiguration().addAll((Collection<? extends ListViewerConfiguration>)newValue);
				return;
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				setThreadingInUse((Boolean)newValue);
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
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION:
				getChildConfiguration().clear();
				return;
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				unsetThreadingInUse();
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
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION:
				return childConfiguration != null && !childConfiguration.isEmpty();
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				return isSetThreadingInUse();
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
		result.append(" (threadingInUse: ");
		if (threadingInUseESet) result.append(threadingInUse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MultipleListViewerConfigurationImpl
