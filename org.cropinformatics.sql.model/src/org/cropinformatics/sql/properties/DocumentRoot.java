/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DocumentRoot#getDatabasePropertiesList <em>Database Properties List</em>}</li>
 *   <li>{@link org.cropinformatics.sql.properties.DocumentRoot#getSqlProperties <em>Sql Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject
{
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Database Properties List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a root element of an XML document defining databases
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Properties List</em>' containment reference.
	 * @see #setDatabasePropertiesList(DatabasePropertiesListType)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDocumentRoot_DatabasePropertiesList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='databasePropertiesList' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabasePropertiesListType getDatabasePropertiesList();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DocumentRoot#getDatabasePropertiesList <em>Database Properties List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Properties List</em>' containment reference.
	 * @see #getDatabasePropertiesList()
	 * @generated
	 */
	void setDatabasePropertiesList(DatabasePropertiesListType value);

	/**
	 * Returns the value of the '<em><b>Sql Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a root element of an XML document defining the SQL Properties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sql Properties</em>' containment reference.
	 * @see #setSqlProperties(SqlProperties)
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDocumentRoot_SqlProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	SqlProperties getSqlProperties();

	/**
	 * Sets the value of the '{@link org.cropinformatics.sql.properties.DocumentRoot#getSqlProperties <em>Sql Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Properties</em>' containment reference.
	 * @see #getSqlProperties()
	 * @generated
	 */
	void setSqlProperties(SqlProperties value);

} // DocumentRoot
