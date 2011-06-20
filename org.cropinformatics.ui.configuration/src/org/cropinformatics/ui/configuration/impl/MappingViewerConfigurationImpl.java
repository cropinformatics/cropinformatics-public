/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.MappingViewerConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl#isFromItemRemovedWhenMapped <em>From Item Removed When Mapped</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl#isFromItemAddedWhenUnmapped <em>From Item Added When Unmapped</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl#isToItemRemovedWhenMapped <em>To Item Removed When Mapped</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl#isToItemAddedWhenUnmapped <em>To Item Added When Unmapped</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingViewerConfigurationImpl extends ViewerConfigurationImpl implements MappingViewerConfiguration
{
	/**
	 * The default value of the '{@link #isFromItemRemovedWhenMapped() <em>From Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromItemRemovedWhenMapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFromItemRemovedWhenMapped() <em>From Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromItemRemovedWhenMapped()
	 * @generated
	 * @ordered
	 */
	protected boolean fromItemRemovedWhenMapped = FROM_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT;

	/**
	 * This is true if the From Item Removed When Mapped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fromItemRemovedWhenMappedESet;

	/**
	 * The default value of the '{@link #isFromItemAddedWhenUnmapped() <em>From Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromItemAddedWhenUnmapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFromItemAddedWhenUnmapped() <em>From Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromItemAddedWhenUnmapped()
	 * @generated
	 * @ordered
	 */
	protected boolean fromItemAddedWhenUnmapped = FROM_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT;

	/**
	 * This is true if the From Item Added When Unmapped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fromItemAddedWhenUnmappedESet;

	/**
	 * The default value of the '{@link #isToItemRemovedWhenMapped() <em>To Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToItemRemovedWhenMapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isToItemRemovedWhenMapped() <em>To Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToItemRemovedWhenMapped()
	 * @generated
	 * @ordered
	 */
	protected boolean toItemRemovedWhenMapped = TO_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT;

	/**
	 * This is true if the To Item Removed When Mapped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toItemRemovedWhenMappedESet;

	/**
	 * The default value of the '{@link #isToItemAddedWhenUnmapped() <em>To Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToItemAddedWhenUnmapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isToItemAddedWhenUnmapped() <em>To Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToItemAddedWhenUnmapped()
	 * @generated
	 * @ordered
	 */
	protected boolean toItemAddedWhenUnmapped = TO_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT;

	/**
	 * This is true if the To Item Added When Unmapped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toItemAddedWhenUnmappedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingViewerConfigurationImpl()
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
		return ConfigurationPackage.Literals.MAPPING_VIEWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFromItemRemovedWhenMapped()
	{
		return fromItemRemovedWhenMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromItemRemovedWhenMapped(boolean newFromItemRemovedWhenMapped)
	{
		boolean oldFromItemRemovedWhenMapped = fromItemRemovedWhenMapped;
		fromItemRemovedWhenMapped = newFromItemRemovedWhenMapped;
		boolean oldFromItemRemovedWhenMappedESet = fromItemRemovedWhenMappedESet;
		fromItemRemovedWhenMappedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED, oldFromItemRemovedWhenMapped, fromItemRemovedWhenMapped, !oldFromItemRemovedWhenMappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFromItemRemovedWhenMapped()
	{
		boolean oldFromItemRemovedWhenMapped = fromItemRemovedWhenMapped;
		boolean oldFromItemRemovedWhenMappedESet = fromItemRemovedWhenMappedESet;
		fromItemRemovedWhenMapped = FROM_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT;
		fromItemRemovedWhenMappedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED, oldFromItemRemovedWhenMapped, FROM_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT, oldFromItemRemovedWhenMappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFromItemRemovedWhenMapped()
	{
		return fromItemRemovedWhenMappedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFromItemAddedWhenUnmapped()
	{
		return fromItemAddedWhenUnmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromItemAddedWhenUnmapped(boolean newFromItemAddedWhenUnmapped)
	{
		boolean oldFromItemAddedWhenUnmapped = fromItemAddedWhenUnmapped;
		fromItemAddedWhenUnmapped = newFromItemAddedWhenUnmapped;
		boolean oldFromItemAddedWhenUnmappedESet = fromItemAddedWhenUnmappedESet;
		fromItemAddedWhenUnmappedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED, oldFromItemAddedWhenUnmapped, fromItemAddedWhenUnmapped, !oldFromItemAddedWhenUnmappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFromItemAddedWhenUnmapped()
	{
		boolean oldFromItemAddedWhenUnmapped = fromItemAddedWhenUnmapped;
		boolean oldFromItemAddedWhenUnmappedESet = fromItemAddedWhenUnmappedESet;
		fromItemAddedWhenUnmapped = FROM_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT;
		fromItemAddedWhenUnmappedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED, oldFromItemAddedWhenUnmapped, FROM_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT, oldFromItemAddedWhenUnmappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFromItemAddedWhenUnmapped()
	{
		return fromItemAddedWhenUnmappedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToItemRemovedWhenMapped()
	{
		return toItemRemovedWhenMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToItemRemovedWhenMapped(boolean newToItemRemovedWhenMapped)
	{
		boolean oldToItemRemovedWhenMapped = toItemRemovedWhenMapped;
		toItemRemovedWhenMapped = newToItemRemovedWhenMapped;
		boolean oldToItemRemovedWhenMappedESet = toItemRemovedWhenMappedESet;
		toItemRemovedWhenMappedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED, oldToItemRemovedWhenMapped, toItemRemovedWhenMapped, !oldToItemRemovedWhenMappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetToItemRemovedWhenMapped()
	{
		boolean oldToItemRemovedWhenMapped = toItemRemovedWhenMapped;
		boolean oldToItemRemovedWhenMappedESet = toItemRemovedWhenMappedESet;
		toItemRemovedWhenMapped = TO_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT;
		toItemRemovedWhenMappedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED, oldToItemRemovedWhenMapped, TO_ITEM_REMOVED_WHEN_MAPPED_EDEFAULT, oldToItemRemovedWhenMappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetToItemRemovedWhenMapped()
	{
		return toItemRemovedWhenMappedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToItemAddedWhenUnmapped()
	{
		return toItemAddedWhenUnmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToItemAddedWhenUnmapped(boolean newToItemAddedWhenUnmapped)
	{
		boolean oldToItemAddedWhenUnmapped = toItemAddedWhenUnmapped;
		toItemAddedWhenUnmapped = newToItemAddedWhenUnmapped;
		boolean oldToItemAddedWhenUnmappedESet = toItemAddedWhenUnmappedESet;
		toItemAddedWhenUnmappedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED, oldToItemAddedWhenUnmapped, toItemAddedWhenUnmapped, !oldToItemAddedWhenUnmappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetToItemAddedWhenUnmapped()
	{
		boolean oldToItemAddedWhenUnmapped = toItemAddedWhenUnmapped;
		boolean oldToItemAddedWhenUnmappedESet = toItemAddedWhenUnmappedESet;
		toItemAddedWhenUnmapped = TO_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT;
		toItemAddedWhenUnmappedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED, oldToItemAddedWhenUnmapped, TO_ITEM_ADDED_WHEN_UNMAPPED_EDEFAULT, oldToItemAddedWhenUnmappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetToItemAddedWhenUnmapped()
	{
		return toItemAddedWhenUnmappedESet;
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
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED:
				return isFromItemRemovedWhenMapped();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED:
				return isFromItemAddedWhenUnmapped();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED:
				return isToItemRemovedWhenMapped();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED:
				return isToItemAddedWhenUnmapped();
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
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED:
				setFromItemRemovedWhenMapped((Boolean)newValue);
				return;
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED:
				setFromItemAddedWhenUnmapped((Boolean)newValue);
				return;
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED:
				setToItemRemovedWhenMapped((Boolean)newValue);
				return;
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED:
				setToItemAddedWhenUnmapped((Boolean)newValue);
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
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED:
				unsetFromItemRemovedWhenMapped();
				return;
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED:
				unsetFromItemAddedWhenUnmapped();
				return;
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED:
				unsetToItemRemovedWhenMapped();
				return;
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED:
				unsetToItemAddedWhenUnmapped();
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
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED:
				return isSetFromItemRemovedWhenMapped();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED:
				return isSetFromItemAddedWhenUnmapped();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED:
				return isSetToItemRemovedWhenMapped();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED:
				return isSetToItemAddedWhenUnmapped();
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
		result.append(" (fromItemRemovedWhenMapped: ");
		if (fromItemRemovedWhenMappedESet) result.append(fromItemRemovedWhenMapped); else result.append("<unset>");
		result.append(", fromItemAddedWhenUnmapped: ");
		if (fromItemAddedWhenUnmappedESet) result.append(fromItemAddedWhenUnmapped); else result.append("<unset>");
		result.append(", toItemRemovedWhenMapped: ");
		if (toItemRemovedWhenMappedESet) result.append(toItemRemovedWhenMapped); else result.append("<unset>");
		result.append(", toItemAddedWhenUnmapped: ");
		if (toItemAddedWhenUnmappedESet) result.append(toItemAddedWhenUnmapped); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MappingViewerConfigurationImpl
