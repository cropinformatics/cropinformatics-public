/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.provider;


import java.util.Collection;
import java.util.List;

import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.cropinformatics.ui.configuration.ListViewerConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListViewerConfigurationItemProvider
	extends ViewerConfigurationItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListViewerConfigurationItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addMultipleSelectionInUsePropertyDescriptor(object);
			addMultipleCheckInUsePropertyDescriptor(object);
			addDuplicateAllowedPropertyDescriptor(object);
			addCheckSelectionInUsePropertyDescriptor(object);
			addThreadingInUsePropertyDescriptor(object);
			addCopyItemsInUsePropertyDescriptor(object);
			addVirtualInUsePropertyDescriptor(object);
			addMantainingSelectionStatePropertyDescriptor(object);
			addMantainingCheckedStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Multiple Selection In Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleSelectionInUsePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_multipleSelectionInUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_multipleSelectionInUse_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiple Check In Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleCheckInUsePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_multipleCheckInUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_multipleCheckInUse_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duplicate Allowed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuplicateAllowedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_duplicateAllowed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_duplicateAllowed_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check Selection In Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckSelectionInUsePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_checkSelectionInUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_checkSelectionInUse_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threading In Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadingInUsePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_threadingInUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_threadingInUse_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copy Items In Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyItemsInUsePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_copyItemsInUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_copyItemsInUse_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtual In Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualInUsePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_virtualInUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_virtualInUse_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mantaining Selection State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMantainingSelectionStatePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_mantainingSelectionState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_mantainingSelectionState_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mantaining Checked State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMantainingCheckedStatePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListViewerConfiguration_mantainingCheckedState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListViewerConfiguration_mantainingCheckedState_feature", "_UI_ListViewerConfiguration_type"),
				 ConfigurationPackage.Literals.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ListViewerConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListViewerConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((ListViewerConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ListViewerConfiguration_type") :
			getString("_UI_ListViewerConfiguration_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(ListViewerConfiguration.class))
		{
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__THREADING_IN_USE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE:
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ConfigurationPackage.Literals.CONTROL_CONFIGURATION__FOREGROUND ||
			childFeature == ConfigurationPackage.Literals.CONTROL_CONFIGURATION__BACKGROUND;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
