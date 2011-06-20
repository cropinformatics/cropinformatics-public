/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import java.util.Collection;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.PathElement;
import org.daveneti.ui.configuration.WizardConfiguration;
import org.daveneti.ui.configuration.WizardPageConfiguration;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.WizardConfigurationImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.WizardConfigurationImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardConfigurationImpl extends ConfigurationImpl implements WizardConfiguration
{
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<WizardPageConfiguration> pages;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathElement> path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardConfigurationImpl()
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
		return ConfigurationPackage.Literals.WIZARD_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WizardPageConfiguration> getPages()
	{
		if (pages == null)
		{
			pages = new EObjectContainmentEList<WizardPageConfiguration>(WizardPageConfiguration.class, this, ConfigurationPackage.WIZARD_CONFIGURATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathElement> getPath()
	{
		if (path == null)
		{
			path = new EObjectContainmentEList<PathElement>(PathElement.class, this, ConfigurationPackage.WIZARD_CONFIGURATION__PATH);
		}
		return path;
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
			case ConfigurationPackage.WIZARD_CONFIGURATION__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.WIZARD_CONFIGURATION__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.WIZARD_CONFIGURATION__PAGES:
				return getPages();
			case ConfigurationPackage.WIZARD_CONFIGURATION__PATH:
				return getPath();
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
			case ConfigurationPackage.WIZARD_CONFIGURATION__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends WizardPageConfiguration>)newValue);
				return;
			case ConfigurationPackage.WIZARD_CONFIGURATION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathElement>)newValue);
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
			case ConfigurationPackage.WIZARD_CONFIGURATION__PAGES:
				getPages().clear();
				return;
			case ConfigurationPackage.WIZARD_CONFIGURATION__PATH:
				getPath().clear();
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
			case ConfigurationPackage.WIZARD_CONFIGURATION__PAGES:
				return pages != null && !pages.isEmpty();
			case ConfigurationPackage.WIZARD_CONFIGURATION__PATH:
				return path != null && !path.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WizardConfigurationImpl
