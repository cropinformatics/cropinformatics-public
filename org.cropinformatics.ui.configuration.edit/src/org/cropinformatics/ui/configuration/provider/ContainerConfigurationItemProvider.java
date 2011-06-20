/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.provider;


import java.util.Collection;
import java.util.List;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.cropinformatics.ui.configuration.ContainerConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerConfigurationItemProvider
	extends ControlConfigurationItemProvider
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
	public ContainerConfigurationItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__LAYOUT);
			childrenFeatures.add(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ContainerConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContainerConfiguration"));
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
		String label = ((ContainerConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContainerConfiguration_type") :
			getString("_UI_ContainerConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(ContainerConfiguration.class))
		{
			case ConfigurationPackage.CONTAINER_CONFIGURATION__LAYOUT:
			case ConfigurationPackage.CONTAINER_CONFIGURATION__COMPONENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__LAYOUT,
				 ConfigurationFactory.eINSTANCE.createLayout()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createComponentConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createControlConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createContainerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createCTabFolderConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createExpandBarConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createViewerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createListViewerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createMappingViewerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createMatrixViewerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createMultipleListViewerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createQueryResultViewerConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createTabFolderConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONTAINER_CONFIGURATION__COMPONENTS,
				 ConfigurationFactory.eINSTANCE.createTwinViewerConfiguration()));
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
