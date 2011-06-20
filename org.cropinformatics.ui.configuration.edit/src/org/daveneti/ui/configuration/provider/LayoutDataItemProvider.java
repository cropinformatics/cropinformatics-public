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
import org.daveneti.ui.configuration.LayoutData;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.daveneti.ui.configuration.LayoutData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutDataItemProvider
	extends ItemProviderAdapter
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
	public LayoutDataItemProvider(AdapterFactory adapterFactory)
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

			addGrabExcessHorizontalSpacePropertyDescriptor(object);
			addGrabExcessVerticalSpacePropertyDescriptor(object);
			addHeightHintPropertyDescriptor(object);
			addHorizontalAlignmentPropertyDescriptor(object);
			addHorizontalIndentPropertyDescriptor(object);
			addHorizontalSpanPropertyDescriptor(object);
			addMinimumHeightPropertyDescriptor(object);
			addMinimumWidthPropertyDescriptor(object);
			addVerticalAlignmentPropertyDescriptor(object);
			addVerticalIndentPropertyDescriptor(object);
			addVerticalSpanPropertyDescriptor(object);
			addWidthHintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Grab Excess Horizontal Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrabExcessHorizontalSpacePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_grabExcessHorizontalSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_grabExcessHorizontalSpace_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grab Excess Vertical Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrabExcessVerticalSpacePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_grabExcessVerticalSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_grabExcessVerticalSpace_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height Hint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightHintPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_heightHint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_heightHint_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__HEIGHT_HINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalAlignmentPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_horizontalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_horizontalAlignment_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__HORIZONTAL_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Indent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalIndentPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_horizontalIndent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_horizontalIndent_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__HORIZONTAL_INDENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalSpanPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_horizontalSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_horizontalSpan_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__HORIZONTAL_SPAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumHeightPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_minimumHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_minimumHeight_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__MINIMUM_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumWidthPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_minimumWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_minimumWidth_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__MINIMUM_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalAlignmentPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_verticalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_verticalAlignment_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__VERTICAL_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Indent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalIndentPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_verticalIndent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_verticalIndent_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__VERTICAL_INDENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalSpanPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_verticalSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_verticalSpan_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__VERTICAL_SPAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width Hint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthHintPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_widthHint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_widthHint_feature", "_UI_LayoutData_type"),
				 ConfigurationPackage.Literals.LAYOUT_DATA__WIDTH_HINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LayoutData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayoutData"));
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
		LayoutData layoutData = (LayoutData)object;
		return getString("_UI_LayoutData_type") + " " + layoutData.isGrabExcessHorizontalSpace();
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

		switch (notification.getFeatureID(LayoutData.class))
		{
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			case ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT:
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT:
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN:
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT:
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH:
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT:
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT:
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN:
			case ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT:
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
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return ConfigurationEditPlugin.INSTANCE;
	}

}
