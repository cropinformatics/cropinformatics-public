/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.provider;


import java.util.Collection;
import java.util.List;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.MappingViewerConfiguration;
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
 * This is the item provider adapter for a {@link org.daveneti.ui.configuration.MappingViewerConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingViewerConfigurationItemProvider
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
	public MappingViewerConfigurationItemProvider(AdapterFactory adapterFactory)
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

			addFromItemRemovedWhenMappedPropertyDescriptor(object);
			addFromItemAddedWhenUnmappedPropertyDescriptor(object);
			addToItemRemovedWhenMappedPropertyDescriptor(object);
			addToItemAddedWhenUnmappedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Item Removed When Mapped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromItemRemovedWhenMappedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingViewerConfiguration_fromItemRemovedWhenMapped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingViewerConfiguration_fromItemRemovedWhenMapped_feature", "_UI_MappingViewerConfiguration_type"),
				 ConfigurationPackage.Literals.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Item Added When Unmapped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromItemAddedWhenUnmappedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingViewerConfiguration_fromItemAddedWhenUnmapped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingViewerConfiguration_fromItemAddedWhenUnmapped_feature", "_UI_MappingViewerConfiguration_type"),
				 ConfigurationPackage.Literals.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Item Removed When Mapped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToItemRemovedWhenMappedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingViewerConfiguration_toItemRemovedWhenMapped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingViewerConfiguration_toItemRemovedWhenMapped_feature", "_UI_MappingViewerConfiguration_type"),
				 ConfigurationPackage.Literals.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Item Added When Unmapped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToItemAddedWhenUnmappedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingViewerConfiguration_toItemAddedWhenUnmapped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingViewerConfiguration_toItemAddedWhenUnmapped_feature", "_UI_MappingViewerConfiguration_type"),
				 ConfigurationPackage.Literals.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns MappingViewerConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingViewerConfiguration"));
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
		String label = ((MappingViewerConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingViewerConfiguration_type") :
			getString("_UI_MappingViewerConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(MappingViewerConfiguration.class))
		{
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED:
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED:
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED:
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED:
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
