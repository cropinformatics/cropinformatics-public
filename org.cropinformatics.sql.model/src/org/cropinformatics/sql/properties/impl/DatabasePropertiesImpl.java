/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.impl;

import java.util.Collection;

import org.cropinformatics.sql.properties.DBMS;
import org.cropinformatics.sql.properties.DatabaseProperties;
import org.cropinformatics.sql.properties.PropertiesPackage;
import org.cropinformatics.sql.properties.Property;
import org.cropinformatics.sql.properties.SqlProperties;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getDriverClassName <em>Driver Class Name</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getDBMS <em>DBMS</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getPersistenceUnitName <em>Persistence Unit Name</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getSqlProperties <em>Sql Properties</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.impl.DatabasePropertiesImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabasePropertiesImpl extends EObjectImpl implements DatabaseProperties
{
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverClassName() <em>Driver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriverClassName() <em>Driver Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverClassName()
	 * @generated
	 * @ordered
	 */
	protected String driverClassName = DRIVER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected static final String DIALECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected String dialect = DIALECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected String serverURL = SERVER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBMS() <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBMS()
	 * @generated
	 * @ordered
	 */
	protected static final DBMS DBMS_EDEFAULT = DBMS.MY_SQL;

	/**
	 * The cached value of the '{@link #getDBMS() <em>DBMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBMS()
	 * @generated
	 * @ordered
	 */
	protected DBMS dBMS = DBMS_EDEFAULT;

	/**
	 * This is true if the DBMS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dBMSESet;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * This is true if the Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portESet;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceUnitName() <em>Persistence Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceUnitName() <em>Persistence Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitName()
	 * @generated
	 * @ordered
	 */
	protected String persistenceUnitName = PERSISTENCE_UNIT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSqlProperties() <em>Sql Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlProperties()
	 * @generated
	 * @ordered
	 */
	protected SqlProperties sqlProperties;

	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabasePropertiesImpl()
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
		return PropertiesPackage.Literals.DATABASE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId)
	{
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriverClassName()
	{
		return driverClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverClassName(String newDriverClassName)
	{
		String oldDriverClassName = driverClassName;
		driverClassName = newDriverClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__DRIVER_CLASS_NAME, oldDriverClassName, driverClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDialect()
	{
		return dialect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialect(String newDialect)
	{
		String oldDialect = dialect;
		dialect = newDialect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__DIALECT, oldDialect, dialect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerURL()
	{
		return serverURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerURL(String newServerURL)
	{
		String oldServerURL = serverURL;
		serverURL = newServerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__SERVER_URL, oldServerURL, serverURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBMS getDBMS()
	{
		return dBMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBMS(DBMS newDBMS)
	{
		DBMS oldDBMS = dBMS;
		dBMS = newDBMS == null ? DBMS_EDEFAULT : newDBMS;
		boolean oldDBMSESet = dBMSESet;
		dBMSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__DBMS, oldDBMS, dBMS, !oldDBMSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDBMS()
	{
		DBMS oldDBMS = dBMS;
		boolean oldDBMSESet = dBMSESet;
		dBMS = DBMS_EDEFAULT;
		dBMSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PropertiesPackage.DATABASE_PROPERTIES__DBMS, oldDBMS, DBMS_EDEFAULT, oldDBMSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDBMS()
	{
		return dBMSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort()
	{
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort)
	{
		int oldPort = port;
		port = newPort;
		boolean oldPortESet = portESet;
		portESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__PORT, oldPort, port, !oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPort()
	{
		int oldPort = port;
		boolean oldPortESet = portESet;
		port = PORT_EDEFAULT;
		portESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PropertiesPackage.DATABASE_PROPERTIES__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPort()
	{
		return portESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName()
	{
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName)
	{
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername)
	{
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword)
	{
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace()
	{
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace)
	{
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceUnitName()
	{
		return persistenceUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnitName(String newPersistenceUnitName)
	{
		String oldPersistenceUnitName = persistenceUnitName;
		persistenceUnitName = newPersistenceUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME, oldPersistenceUnitName, persistenceUnitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlProperties getSqlProperties()
	{
		return sqlProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlProperties(SqlProperties newSqlProperties, NotificationChain msgs)
	{
		SqlProperties oldSqlProperties = sqlProperties;
		sqlProperties = newSqlProperties;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES, oldSqlProperties, newSqlProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlProperties(SqlProperties newSqlProperties)
	{
		if (newSqlProperties != sqlProperties)
		{
			NotificationChain msgs = null;
			if (sqlProperties != null)
				msgs = ((InternalEObject)sqlProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES, null, msgs);
			if (newSqlProperties != null)
				msgs = ((InternalEObject)newSqlProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES, null, msgs);
			msgs = basicSetSqlProperties(newSqlProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES, newSqlProperties, newSqlProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAdditionalProperties()
	{
		if (additionalProperties == null)
		{
			additionalProperties = new EObjectContainmentEList<Property>(Property.class, this, PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES);
		}
		return additionalProperties;
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
			case PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES:
				return basicSetSqlProperties(null, msgs);
			case PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES:
				return ((InternalEList<?>)getAdditionalProperties()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.DATABASE_PROPERTIES__ID:
				return getId();
			case PropertiesPackage.DATABASE_PROPERTIES__DRIVER_CLASS_NAME:
				return getDriverClassName();
			case PropertiesPackage.DATABASE_PROPERTIES__DIALECT:
				return getDialect();
			case PropertiesPackage.DATABASE_PROPERTIES__SERVER_URL:
				return getServerURL();
			case PropertiesPackage.DATABASE_PROPERTIES__DBMS:
				return getDBMS();
			case PropertiesPackage.DATABASE_PROPERTIES__PORT:
				return getPort();
			case PropertiesPackage.DATABASE_PROPERTIES__DATABASE_NAME:
				return getDatabaseName();
			case PropertiesPackage.DATABASE_PROPERTIES__USERNAME:
				return getUsername();
			case PropertiesPackage.DATABASE_PROPERTIES__PASSWORD:
				return getPassword();
			case PropertiesPackage.DATABASE_PROPERTIES__NAMESPACE:
				return getNamespace();
			case PropertiesPackage.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME:
				return getPersistenceUnitName();
			case PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES:
				return getSqlProperties();
			case PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
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
			case PropertiesPackage.DATABASE_PROPERTIES__ID:
				setId((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DRIVER_CLASS_NAME:
				setDriverClassName((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DIALECT:
				setDialect((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__SERVER_URL:
				setServerURL((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DBMS:
				setDBMS((DBMS)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__PORT:
				setPort((Integer)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__USERNAME:
				setUsername((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__PASSWORD:
				setPassword((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME:
				setPersistenceUnitName((String)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES:
				setSqlProperties((SqlProperties)newValue);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
				getAdditionalProperties().addAll((Collection<? extends Property>)newValue);
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
			case PropertiesPackage.DATABASE_PROPERTIES__ID:
				setId(ID_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DRIVER_CLASS_NAME:
				setDriverClassName(DRIVER_CLASS_NAME_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DIALECT:
				setDialect(DIALECT_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__SERVER_URL:
				setServerURL(SERVER_URL_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DBMS:
				unsetDBMS();
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__PORT:
				unsetPort();
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME:
				setPersistenceUnitName(PERSISTENCE_UNIT_NAME_EDEFAULT);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES:
				setSqlProperties((SqlProperties)null);
				return;
			case PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
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
			case PropertiesPackage.DATABASE_PROPERTIES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PropertiesPackage.DATABASE_PROPERTIES__DRIVER_CLASS_NAME:
				return DRIVER_CLASS_NAME_EDEFAULT == null ? driverClassName != null : !DRIVER_CLASS_NAME_EDEFAULT.equals(driverClassName);
			case PropertiesPackage.DATABASE_PROPERTIES__DIALECT:
				return DIALECT_EDEFAULT == null ? dialect != null : !DIALECT_EDEFAULT.equals(dialect);
			case PropertiesPackage.DATABASE_PROPERTIES__SERVER_URL:
				return SERVER_URL_EDEFAULT == null ? serverURL != null : !SERVER_URL_EDEFAULT.equals(serverURL);
			case PropertiesPackage.DATABASE_PROPERTIES__DBMS:
				return isSetDBMS();
			case PropertiesPackage.DATABASE_PROPERTIES__PORT:
				return isSetPort();
			case PropertiesPackage.DATABASE_PROPERTIES__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case PropertiesPackage.DATABASE_PROPERTIES__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case PropertiesPackage.DATABASE_PROPERTIES__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case PropertiesPackage.DATABASE_PROPERTIES__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case PropertiesPackage.DATABASE_PROPERTIES__PERSISTENCE_UNIT_NAME:
				return PERSISTENCE_UNIT_NAME_EDEFAULT == null ? persistenceUnitName != null : !PERSISTENCE_UNIT_NAME_EDEFAULT.equals(persistenceUnitName);
			case PropertiesPackage.DATABASE_PROPERTIES__SQL_PROPERTIES:
				return sqlProperties != null;
			case PropertiesPackage.DATABASE_PROPERTIES__ADDITIONAL_PROPERTIES:
				return additionalProperties != null && !additionalProperties.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", driverClassName: ");
		result.append(driverClassName);
		result.append(", dialect: ");
		result.append(dialect);
		result.append(", serverURL: ");
		result.append(serverURL);
		result.append(", dBMS: ");
		if (dBMSESet) result.append(dBMS); else result.append("<unset>");
		result.append(", port: ");
		if (portESet) result.append(port); else result.append("<unset>");
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", persistenceUnitName: ");
		result.append(persistenceUnitName);
		result.append(')');
		return result.toString();
	}

} //DatabasePropertiesImpl
