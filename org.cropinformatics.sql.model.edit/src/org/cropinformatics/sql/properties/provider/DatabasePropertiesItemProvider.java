/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.provider;


import java.util.Collection;
import java.util.List;

import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.PropertiesFactory;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link org.cropinformatics.sql.properties.DatabaseProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabasePropertiesItemProvider
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
	public DatabasePropertiesItemProvider(AdapterFactory adapterFactory)
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

			addIdPropertyDescriptor(object);
			addDriverClassNamePropertyDescriptor(object);
			addDialectPropertyDescriptor(object);
			addServerURLPropertyDescriptor(object);
			addDBMSPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addDatabaseNamePropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addNamespacePropertyDescriptor(object);
			addPersistenceUnitNamePropertyDescriptor(object);
			addSqlPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_id_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverClassNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_driverClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_driverClassName_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__DRIVER_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dialect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDialectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_dialect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_dialect_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__DIALECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerURLPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_serverURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_serverURL_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__SERVER_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DBMS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDBMSPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_dBMS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_dBMS_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__DBMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_port_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_databaseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_databaseName_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__DATABASE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_username_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_password_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_namespace_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistence Unit Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistenceUnitNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_persistenceUnitName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_persistenceUnitName_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sql Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSqlPropertiesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatabaseProperties_sqlProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseProperties_sqlProperties_feature", "_UI_DatabaseProperties_type"),
				 PropertiesPackage.Literals.DATABASE_PROPERTIES__SQL_PROPERTIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(PropertiesPackage.Literals.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES);
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
	 * This returns DatabaseProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatabaseProperties"));
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
		String label = ((DatabaseProperties)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DatabaseProperties_type") :
			getString("_UI_DatabaseProperties_type") + " " + label;
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

		switch (notification.getFeatureID(DatabaseProperties.class))
		{
			case PropertiesPackage.DATABASE_PROPERTIES__ID:
			case PropertiesPackage.DATABASE_PROPERTIES__DRIVER_CLASS_NAME:
			case PropertiesPackage.DATABASE_PROPERTIES__DIALECT:
			case PropertiesPackage.DATABASE_PROPERTIES__SERVER_URL:
			case PropertiesPackage.DATABASE_PROPERTIES__DBMS:
			case PropertiesPackage.DATABASE_PROPERTIES__PORT:
			case PropertiesPackage.DATABASE_PROPERTIES__DATABASE_NAME:
			case PropertiesPackage.DATABASE_PROPERTIES__USERNAME:
			case PropertiesPackage.DATABASE_PROPERTIES__PASSWORD:
			case PropertiesPackage.DATABASE_PROPERTIES__NAMESPACE:
			case PropertiesPackage.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME:
			case PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES:
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
				(PropertiesPackage.Literals.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES,
				 PropertiesFactory.eINSTANCE.createProperty()));
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
		return SQLUtilitiesEditPlugin.INSTANCE;
	}

}
