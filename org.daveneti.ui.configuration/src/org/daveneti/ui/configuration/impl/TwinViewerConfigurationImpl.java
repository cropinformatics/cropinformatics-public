/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.TwinViewerConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twin Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.TwinViewerConfigurationImpl#isItemAddedLeftToRight <em>Item Added Left To Right</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.TwinViewerConfigurationImpl#isItemAddedRightToLeft <em>Item Added Right To Left</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.TwinViewerConfigurationImpl#isItemRemovedLeftToRight <em>Item Removed Left To Right</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.TwinViewerConfigurationImpl#isItemRemovedRightToLeft <em>Item Removed Right To Left</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.TwinViewerConfigurationImpl#isDuplicateAllowed <em>Duplicate Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwinViewerConfigurationImpl extends ViewerConfigurationImpl implements TwinViewerConfiguration
{
	/**
	 * The default value of the '{@link #isItemAddedLeftToRight() <em>Item Added Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemAddedLeftToRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITEM_ADDED_LEFT_TO_RIGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isItemAddedLeftToRight() <em>Item Added Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemAddedLeftToRight()
	 * @generated
	 * @ordered
	 */
	protected boolean itemAddedLeftToRight = ITEM_ADDED_LEFT_TO_RIGHT_EDEFAULT;

	/**
	 * This is true if the Item Added Left To Right attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemAddedLeftToRightESet;

	/**
	 * The default value of the '{@link #isItemAddedRightToLeft() <em>Item Added Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemAddedRightToLeft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITEM_ADDED_RIGHT_TO_LEFT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isItemAddedRightToLeft() <em>Item Added Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemAddedRightToLeft()
	 * @generated
	 * @ordered
	 */
	protected boolean itemAddedRightToLeft = ITEM_ADDED_RIGHT_TO_LEFT_EDEFAULT;

	/**
	 * This is true if the Item Added Right To Left attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemAddedRightToLeftESet;

	/**
	 * The default value of the '{@link #isItemRemovedLeftToRight() <em>Item Removed Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemRemovedLeftToRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITEM_REMOVED_LEFT_TO_RIGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isItemRemovedLeftToRight() <em>Item Removed Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemRemovedLeftToRight()
	 * @generated
	 * @ordered
	 */
	protected boolean itemRemovedLeftToRight = ITEM_REMOVED_LEFT_TO_RIGHT_EDEFAULT;

	/**
	 * This is true if the Item Removed Left To Right attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemRemovedLeftToRightESet;

	/**
	 * The default value of the '{@link #isItemRemovedRightToLeft() <em>Item Removed Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemRemovedRightToLeft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITEM_REMOVED_RIGHT_TO_LEFT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isItemRemovedRightToLeft() <em>Item Removed Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItemRemovedRightToLeft()
	 * @generated
	 * @ordered
	 */
	protected boolean itemRemovedRightToLeft = ITEM_REMOVED_RIGHT_TO_LEFT_EDEFAULT;

	/**
	 * This is true if the Item Removed Right To Left attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemRemovedRightToLeftESet;

	/**
	 * The default value of the '{@link #isDuplicateAllowed() <em>Duplicate Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDuplicateAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DUPLICATE_ALLOWED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDuplicateAllowed() <em>Duplicate Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDuplicateAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean duplicateAllowed = DUPLICATE_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Duplicate Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean duplicateAllowedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwinViewerConfigurationImpl()
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
		return ConfigurationPackage.Literals.TWIN_VIEWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItemAddedLeftToRight()
	{
		return itemAddedLeftToRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemAddedLeftToRight(boolean newItemAddedLeftToRight)
	{
		boolean oldItemAddedLeftToRight = itemAddedLeftToRight;
		itemAddedLeftToRight = newItemAddedLeftToRight;
		boolean oldItemAddedLeftToRightESet = itemAddedLeftToRightESet;
		itemAddedLeftToRightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT, oldItemAddedLeftToRight, itemAddedLeftToRight, !oldItemAddedLeftToRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemAddedLeftToRight()
	{
		boolean oldItemAddedLeftToRight = itemAddedLeftToRight;
		boolean oldItemAddedLeftToRightESet = itemAddedLeftToRightESet;
		itemAddedLeftToRight = ITEM_ADDED_LEFT_TO_RIGHT_EDEFAULT;
		itemAddedLeftToRightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT, oldItemAddedLeftToRight, ITEM_ADDED_LEFT_TO_RIGHT_EDEFAULT, oldItemAddedLeftToRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemAddedLeftToRight()
	{
		return itemAddedLeftToRightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItemAddedRightToLeft()
	{
		return itemAddedRightToLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemAddedRightToLeft(boolean newItemAddedRightToLeft)
	{
		boolean oldItemAddedRightToLeft = itemAddedRightToLeft;
		itemAddedRightToLeft = newItemAddedRightToLeft;
		boolean oldItemAddedRightToLeftESet = itemAddedRightToLeftESet;
		itemAddedRightToLeftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT, oldItemAddedRightToLeft, itemAddedRightToLeft, !oldItemAddedRightToLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemAddedRightToLeft()
	{
		boolean oldItemAddedRightToLeft = itemAddedRightToLeft;
		boolean oldItemAddedRightToLeftESet = itemAddedRightToLeftESet;
		itemAddedRightToLeft = ITEM_ADDED_RIGHT_TO_LEFT_EDEFAULT;
		itemAddedRightToLeftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT, oldItemAddedRightToLeft, ITEM_ADDED_RIGHT_TO_LEFT_EDEFAULT, oldItemAddedRightToLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemAddedRightToLeft()
	{
		return itemAddedRightToLeftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItemRemovedLeftToRight()
	{
		return itemRemovedLeftToRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemRemovedLeftToRight(boolean newItemRemovedLeftToRight)
	{
		boolean oldItemRemovedLeftToRight = itemRemovedLeftToRight;
		itemRemovedLeftToRight = newItemRemovedLeftToRight;
		boolean oldItemRemovedLeftToRightESet = itemRemovedLeftToRightESet;
		itemRemovedLeftToRightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT, oldItemRemovedLeftToRight, itemRemovedLeftToRight, !oldItemRemovedLeftToRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemRemovedLeftToRight()
	{
		boolean oldItemRemovedLeftToRight = itemRemovedLeftToRight;
		boolean oldItemRemovedLeftToRightESet = itemRemovedLeftToRightESet;
		itemRemovedLeftToRight = ITEM_REMOVED_LEFT_TO_RIGHT_EDEFAULT;
		itemRemovedLeftToRightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT, oldItemRemovedLeftToRight, ITEM_REMOVED_LEFT_TO_RIGHT_EDEFAULT, oldItemRemovedLeftToRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemRemovedLeftToRight()
	{
		return itemRemovedLeftToRightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItemRemovedRightToLeft()
	{
		return itemRemovedRightToLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemRemovedRightToLeft(boolean newItemRemovedRightToLeft)
	{
		boolean oldItemRemovedRightToLeft = itemRemovedRightToLeft;
		itemRemovedRightToLeft = newItemRemovedRightToLeft;
		boolean oldItemRemovedRightToLeftESet = itemRemovedRightToLeftESet;
		itemRemovedRightToLeftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT, oldItemRemovedRightToLeft, itemRemovedRightToLeft, !oldItemRemovedRightToLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemRemovedRightToLeft()
	{
		boolean oldItemRemovedRightToLeft = itemRemovedRightToLeft;
		boolean oldItemRemovedRightToLeftESet = itemRemovedRightToLeftESet;
		itemRemovedRightToLeft = ITEM_REMOVED_RIGHT_TO_LEFT_EDEFAULT;
		itemRemovedRightToLeftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT, oldItemRemovedRightToLeft, ITEM_REMOVED_RIGHT_TO_LEFT_EDEFAULT, oldItemRemovedRightToLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemRemovedRightToLeft()
	{
		return itemRemovedRightToLeftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDuplicateAllowed()
	{
		return duplicateAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuplicateAllowed(boolean newDuplicateAllowed)
	{
		boolean oldDuplicateAllowed = duplicateAllowed;
		duplicateAllowed = newDuplicateAllowed;
		boolean oldDuplicateAllowedESet = duplicateAllowedESet;
		duplicateAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED, oldDuplicateAllowed, duplicateAllowed, !oldDuplicateAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDuplicateAllowed()
	{
		boolean oldDuplicateAllowed = duplicateAllowed;
		boolean oldDuplicateAllowedESet = duplicateAllowedESet;
		duplicateAllowed = DUPLICATE_ALLOWED_EDEFAULT;
		duplicateAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED, oldDuplicateAllowed, DUPLICATE_ALLOWED_EDEFAULT, oldDuplicateAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDuplicateAllowed()
	{
		return duplicateAllowedESet;
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
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT:
				return isItemAddedLeftToRight();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT:
				return isItemAddedRightToLeft();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT:
				return isItemRemovedLeftToRight();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT:
				return isItemRemovedRightToLeft();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				return isDuplicateAllowed();
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
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT:
				setItemAddedLeftToRight((Boolean)newValue);
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT:
				setItemAddedRightToLeft((Boolean)newValue);
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT:
				setItemRemovedLeftToRight((Boolean)newValue);
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT:
				setItemRemovedRightToLeft((Boolean)newValue);
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				setDuplicateAllowed((Boolean)newValue);
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
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT:
				unsetItemAddedLeftToRight();
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT:
				unsetItemAddedRightToLeft();
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT:
				unsetItemRemovedLeftToRight();
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT:
				unsetItemRemovedRightToLeft();
				return;
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				unsetDuplicateAllowed();
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
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT:
				return isSetItemAddedLeftToRight();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT:
				return isSetItemAddedRightToLeft();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT:
				return isSetItemRemovedLeftToRight();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT:
				return isSetItemRemovedRightToLeft();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				return isSetDuplicateAllowed();
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
		result.append(" (itemAddedLeftToRight: ");
		if (itemAddedLeftToRightESet) result.append(itemAddedLeftToRight); else result.append("<unset>");
		result.append(", itemAddedRightToLeft: ");
		if (itemAddedRightToLeftESet) result.append(itemAddedRightToLeft); else result.append("<unset>");
		result.append(", itemRemovedLeftToRight: ");
		if (itemRemovedLeftToRightESet) result.append(itemRemovedLeftToRight); else result.append("<unset>");
		result.append(", itemRemovedRightToLeft: ");
		if (itemRemovedRightToLeftESet) result.append(itemRemovedRightToLeft); else result.append("<unset>");
		result.append(", duplicateAllowed: ");
		if (duplicateAllowedESet) result.append(duplicateAllowed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TwinViewerConfigurationImpl
