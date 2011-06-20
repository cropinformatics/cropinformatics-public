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
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
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
 * This is the item provider adapter for a {@link org.cropinformatics.ui.configuration.TwinViewerConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TwinViewerConfigurationItemProvider
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
	public TwinViewerConfigurationItemProvider(AdapterFactory adapterFactory)
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

			addItemAddedLeftToRightPropertyDescriptor(object);
			addItemAddedRightToLeftPropertyDescriptor(object);
			addItemRemovedLeftToRightPropertyDescriptor(object);
			addItemRemovedRightToLeftPropertyDescriptor(object);
			addDuplicateAllowedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Item Added Left To Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemAddedLeftToRightPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TwinViewerConfiguration_itemAddedLeftToRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwinViewerConfiguration_itemAddedLeftToRight_feature", "_UI_TwinViewerConfiguration_type"),
				 ConfigurationPackage.Literals.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item Added Right To Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemAddedRightToLeftPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TwinViewerConfiguration_itemAddedRightToLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwinViewerConfiguration_itemAddedRightToLeft_feature", "_UI_TwinViewerConfiguration_type"),
				 ConfigurationPackage.Literals.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item Removed Left To Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemRemovedLeftToRightPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TwinViewerConfiguration_itemRemovedLeftToRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwinViewerConfiguration_itemRemovedLeftToRight_feature", "_UI_TwinViewerConfiguration_type"),
				 ConfigurationPackage.Literals.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item Removed Right To Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemRemovedRightToLeftPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TwinViewerConfiguration_itemRemovedRightToLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwinViewerConfiguration_itemRemovedRightToLeft_feature", "_UI_TwinViewerConfiguration_type"),
				 ConfigurationPackage.Literals.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT,
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
				 getString("_UI_TwinViewerConfiguration_duplicateAllowed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwinViewerConfiguration_duplicateAllowed_feature", "_UI_TwinViewerConfiguration_type"),
				 ConfigurationPackage.Literals.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TwinViewerConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TwinViewerConfiguration"));
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
		String label = ((TwinViewerConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TwinViewerConfiguration_type") :
			getString("_UI_TwinViewerConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(TwinViewerConfiguration.class))
		{
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT:
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT:
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT:
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT:
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED:
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
