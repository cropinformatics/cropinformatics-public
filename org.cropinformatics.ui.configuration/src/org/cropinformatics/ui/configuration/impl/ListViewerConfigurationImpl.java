/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isMultipleSelectionInUse <em>Multiple Selection In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isMultipleCheckInUse <em>Multiple Check In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isDuplicateAllowed <em>Duplicate Allowed</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isCheckSelectionInUse <em>Check Selection In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isThreadingInUse <em>Threading In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isCopyItemsInUse <em>Copy Items In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isVirtualInUse <em>Virtual In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isMantainingSelectionState <em>Mantaining Selection State</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl#isMantainingCheckedState <em>Mantaining Checked State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListViewerConfigurationImpl extends ViewerConfigurationImpl implements ListViewerConfiguration
{
	/**
	 * The default value of the '{@link #isMultipleSelectionInUse() <em>Multiple Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelectionInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_SELECTION_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleSelectionInUse() <em>Multiple Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelectionInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleSelectionInUse = MULTIPLE_SELECTION_IN_USE_EDEFAULT;

	/**
	 * This is true if the Multiple Selection In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleSelectionInUseESet;

	/**
	 * The default value of the '{@link #isMultipleCheckInUse() <em>Multiple Check In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleCheckInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_CHECK_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleCheckInUse() <em>Multiple Check In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleCheckInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleCheckInUse = MULTIPLE_CHECK_IN_USE_EDEFAULT;

	/**
	 * This is true if the Multiple Check In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleCheckInUseESet;

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
	 * The default value of the '{@link #isCheckSelectionInUse() <em>Check Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckSelectionInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_SELECTION_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckSelectionInUse() <em>Check Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckSelectionInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean checkSelectionInUse = CHECK_SELECTION_IN_USE_EDEFAULT;

	/**
	 * This is true if the Check Selection In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkSelectionInUseESet;

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
	 * The default value of the '{@link #isCopyItemsInUse() <em>Copy Items In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopyItemsInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COPY_ITEMS_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCopyItemsInUse() <em>Copy Items In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopyItemsInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean copyItemsInUse = COPY_ITEMS_IN_USE_EDEFAULT;

	/**
	 * This is true if the Copy Items In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyItemsInUseESet;

	/**
	 * The default value of the '{@link #isVirtualInUse() <em>Virtual In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtualInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIRTUAL_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVirtualInUse() <em>Virtual In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtualInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean virtualInUse = VIRTUAL_IN_USE_EDEFAULT;

	/**
	 * This is true if the Virtual In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean virtualInUseESet;

	/**
	 * The default value of the '{@link #isMantainingSelectionState() <em>Mantaining Selection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMantainingSelectionState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANTAINING_SELECTION_STATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMantainingSelectionState() <em>Mantaining Selection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMantainingSelectionState()
	 * @generated
	 * @ordered
	 */
	protected boolean mantainingSelectionState = MANTAINING_SELECTION_STATE_EDEFAULT;

	/**
	 * This is true if the Mantaining Selection State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mantainingSelectionStateESet;

	/**
	 * The default value of the '{@link #isMantainingCheckedState() <em>Mantaining Checked State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMantainingCheckedState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANTAINING_CHECKED_STATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMantainingCheckedState() <em>Mantaining Checked State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMantainingCheckedState()
	 * @generated
	 * @ordered
	 */
	protected boolean mantainingCheckedState = MANTAINING_CHECKED_STATE_EDEFAULT;

	/**
	 * This is true if the Mantaining Checked State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mantainingCheckedStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewerConfigurationImpl()
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
		return ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleSelectionInUse()
	{
		return multipleSelectionInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleSelectionInUse(boolean newMultipleSelectionInUse)
	{
		boolean oldMultipleSelectionInUse = multipleSelectionInUse;
		multipleSelectionInUse = newMultipleSelectionInUse;
		boolean oldMultipleSelectionInUseESet = multipleSelectionInUseESet;
		multipleSelectionInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE, oldMultipleSelectionInUse, multipleSelectionInUse, !oldMultipleSelectionInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleSelectionInUse()
	{
		boolean oldMultipleSelectionInUse = multipleSelectionInUse;
		boolean oldMultipleSelectionInUseESet = multipleSelectionInUseESet;
		multipleSelectionInUse = MULTIPLE_SELECTION_IN_USE_EDEFAULT;
		multipleSelectionInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE, oldMultipleSelectionInUse, MULTIPLE_SELECTION_IN_USE_EDEFAULT, oldMultipleSelectionInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleSelectionInUse()
	{
		return multipleSelectionInUseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleCheckInUse()
	{
		return multipleCheckInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleCheckInUse(boolean newMultipleCheckInUse)
	{
		boolean oldMultipleCheckInUse = multipleCheckInUse;
		multipleCheckInUse = newMultipleCheckInUse;
		boolean oldMultipleCheckInUseESet = multipleCheckInUseESet;
		multipleCheckInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE, oldMultipleCheckInUse, multipleCheckInUse, !oldMultipleCheckInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleCheckInUse()
	{
		boolean oldMultipleCheckInUse = multipleCheckInUse;
		boolean oldMultipleCheckInUseESet = multipleCheckInUseESet;
		multipleCheckInUse = MULTIPLE_CHECK_IN_USE_EDEFAULT;
		multipleCheckInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE, oldMultipleCheckInUse, MULTIPLE_CHECK_IN_USE_EDEFAULT, oldMultipleCheckInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleCheckInUse()
	{
		return multipleCheckInUseESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED, oldDuplicateAllowed, duplicateAllowed, !oldDuplicateAllowedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED, oldDuplicateAllowed, DUPLICATE_ALLOWED_EDEFAULT, oldDuplicateAllowedESet));
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
	public boolean isCheckSelectionInUse()
	{
		return checkSelectionInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSelectionInUse(boolean newCheckSelectionInUse)
	{
		boolean oldCheckSelectionInUse = checkSelectionInUse;
		checkSelectionInUse = newCheckSelectionInUse;
		boolean oldCheckSelectionInUseESet = checkSelectionInUseESet;
		checkSelectionInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE, oldCheckSelectionInUse, checkSelectionInUse, !oldCheckSelectionInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckSelectionInUse()
	{
		boolean oldCheckSelectionInUse = checkSelectionInUse;
		boolean oldCheckSelectionInUseESet = checkSelectionInUseESet;
		checkSelectionInUse = CHECK_SELECTION_IN_USE_EDEFAULT;
		checkSelectionInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE, oldCheckSelectionInUse, CHECK_SELECTION_IN_USE_EDEFAULT, oldCheckSelectionInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckSelectionInUse()
	{
		return checkSelectionInUseESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE, oldThreadingInUse, threadingInUse, !oldThreadingInUseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE, oldThreadingInUse, THREADING_IN_USE_EDEFAULT, oldThreadingInUseESet));
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
	public boolean isCopyItemsInUse()
	{
		return copyItemsInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyItemsInUse(boolean newCopyItemsInUse)
	{
		boolean oldCopyItemsInUse = copyItemsInUse;
		copyItemsInUse = newCopyItemsInUse;
		boolean oldCopyItemsInUseESet = copyItemsInUseESet;
		copyItemsInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE, oldCopyItemsInUse, copyItemsInUse, !oldCopyItemsInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyItemsInUse()
	{
		boolean oldCopyItemsInUse = copyItemsInUse;
		boolean oldCopyItemsInUseESet = copyItemsInUseESet;
		copyItemsInUse = COPY_ITEMS_IN_USE_EDEFAULT;
		copyItemsInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE, oldCopyItemsInUse, COPY_ITEMS_IN_USE_EDEFAULT, oldCopyItemsInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyItemsInUse()
	{
		return copyItemsInUseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVirtualInUse()
	{
		return virtualInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualInUse(boolean newVirtualInUse)
	{
		boolean oldVirtualInUse = virtualInUse;
		virtualInUse = newVirtualInUse;
		boolean oldVirtualInUseESet = virtualInUseESet;
		virtualInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE, oldVirtualInUse, virtualInUse, !oldVirtualInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVirtualInUse()
	{
		boolean oldVirtualInUse = virtualInUse;
		boolean oldVirtualInUseESet = virtualInUseESet;
		virtualInUse = VIRTUAL_IN_USE_EDEFAULT;
		virtualInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE, oldVirtualInUse, VIRTUAL_IN_USE_EDEFAULT, oldVirtualInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVirtualInUse()
	{
		return virtualInUseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMantainingSelectionState()
	{
		return mantainingSelectionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMantainingSelectionState(boolean newMantainingSelectionState)
	{
		boolean oldMantainingSelectionState = mantainingSelectionState;
		mantainingSelectionState = newMantainingSelectionState;
		boolean oldMantainingSelectionStateESet = mantainingSelectionStateESet;
		mantainingSelectionStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE, oldMantainingSelectionState, mantainingSelectionState, !oldMantainingSelectionStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMantainingSelectionState()
	{
		boolean oldMantainingSelectionState = mantainingSelectionState;
		boolean oldMantainingSelectionStateESet = mantainingSelectionStateESet;
		mantainingSelectionState = MANTAINING_SELECTION_STATE_EDEFAULT;
		mantainingSelectionStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE, oldMantainingSelectionState, MANTAINING_SELECTION_STATE_EDEFAULT, oldMantainingSelectionStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMantainingSelectionState()
	{
		return mantainingSelectionStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMantainingCheckedState()
	{
		return mantainingCheckedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMantainingCheckedState(boolean newMantainingCheckedState)
	{
		boolean oldMantainingCheckedState = mantainingCheckedState;
		mantainingCheckedState = newMantainingCheckedState;
		boolean oldMantainingCheckedStateESet = mantainingCheckedStateESet;
		mantainingCheckedStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE, oldMantainingCheckedState, mantainingCheckedState, !oldMantainingCheckedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMantainingCheckedState()
	{
		boolean oldMantainingCheckedState = mantainingCheckedState;
		boolean oldMantainingCheckedStateESet = mantainingCheckedStateESet;
		mantainingCheckedState = MANTAINING_CHECKED_STATE_EDEFAULT;
		mantainingCheckedStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE, oldMantainingCheckedState, MANTAINING_CHECKED_STATE_EDEFAULT, oldMantainingCheckedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMantainingCheckedState()
	{
		return mantainingCheckedStateESet;
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
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE:
				return isMultipleSelectionInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE:
				return isMultipleCheckInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				return isDuplicateAllowed();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE:
				return isCheckSelectionInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				return isThreadingInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE:
				return isCopyItemsInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE:
				return isVirtualInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE:
				return isMantainingSelectionState();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE:
				return isMantainingCheckedState();
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
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE:
				setMultipleSelectionInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE:
				setMultipleCheckInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				setDuplicateAllowed((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE:
				setCheckSelectionInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				setThreadingInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE:
				setCopyItemsInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE:
				setVirtualInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE:
				setMantainingSelectionState((Boolean)newValue);
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE:
				setMantainingCheckedState((Boolean)newValue);
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
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE:
				unsetMultipleSelectionInUse();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE:
				unsetMultipleCheckInUse();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				unsetDuplicateAllowed();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE:
				unsetCheckSelectionInUse();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				unsetThreadingInUse();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE:
				unsetCopyItemsInUse();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE:
				unsetVirtualInUse();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE:
				unsetMantainingSelectionState();
				return;
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE:
				unsetMantainingCheckedState();
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
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE:
				return isSetMultipleSelectionInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE:
				return isSetMultipleCheckInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
				return isSetDuplicateAllowed();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE:
				return isSetCheckSelectionInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
				return isSetThreadingInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE:
				return isSetCopyItemsInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE:
				return isSetVirtualInUse();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE:
				return isSetMantainingSelectionState();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE:
				return isSetMantainingCheckedState();
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
		result.append(" (multipleSelectionInUse: ");
		if (multipleSelectionInUseESet) result.append(multipleSelectionInUse); else result.append("<unset>");
		result.append(", multipleCheckInUse: ");
		if (multipleCheckInUseESet) result.append(multipleCheckInUse); else result.append("<unset>");
		result.append(", duplicateAllowed: ");
		if (duplicateAllowedESet) result.append(duplicateAllowed); else result.append("<unset>");
		result.append(", checkSelectionInUse: ");
		if (checkSelectionInUseESet) result.append(checkSelectionInUse); else result.append("<unset>");
		result.append(", threadingInUse: ");
		if (threadingInUseESet) result.append(threadingInUse); else result.append("<unset>");
		result.append(", copyItemsInUse: ");
		if (copyItemsInUseESet) result.append(copyItemsInUse); else result.append("<unset>");
		result.append(", virtualInUse: ");
		if (virtualInUseESet) result.append(virtualInUse); else result.append("<unset>");
		result.append(", mantainingSelectionState: ");
		if (mantainingSelectionStateESet) result.append(mantainingSelectionState); else result.append("<unset>");
		result.append(", mantainingCheckedState: ");
		if (mantainingCheckedStateESet) result.append(mantainingCheckedState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ListViewerConfigurationImpl
