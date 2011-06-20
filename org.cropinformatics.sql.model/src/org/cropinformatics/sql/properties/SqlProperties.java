/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.sql.properties.SqlProperties#getSqlGroup <em>Sql Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlProperties()
 * @model extendedMetaData="name='sqlProperties' kind='elementOnly'"
 * @generated
 */
public interface SqlProperties extends EObject
{
	/**
	 * Returns the value of the '<em><b>Sql Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.cropinformatics.sql.properties.SqlGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Group</em>' containment reference list.
	 * @see org.cropinformatics.sql.properties.PropertiesPackage#getSqlProperties_SqlGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sqlGroup'"
	 * @generated
	 */
	EList<SqlGroup> getSqlGroup();

} // SqlProperties
