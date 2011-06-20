/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for viewers that display mappings
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemRemovedWhenMapped <em>From Item Removed When Mapped</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemAddedWhenUnmapped <em>From Item Added When Unmapped</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemRemovedWhenMapped <em>To Item Removed When Mapped</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemAddedWhenUnmapped <em>To Item Added When Unmapped</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMappingViewerConfiguration()
 * @model extendedMetaData="name='MappingViewerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface MappingViewerConfiguration extends ViewerConfiguration
{
	/**
	 * Returns the value of the '<em><b>From Item Removed When Mapped</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Item Removed When Mapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Item Removed When Mapped</em>' attribute.
	 * @see #isSetFromItemRemovedWhenMapped()
	 * @see #unsetFromItemRemovedWhenMapped()
	 * @see #setFromItemRemovedWhenMapped(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMappingViewerConfiguration_FromItemRemovedWhenMapped()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='fromItemRemovedWhenMapped'"
	 * @generated
	 */
	boolean isFromItemRemovedWhenMapped();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemRemovedWhenMapped <em>From Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Item Removed When Mapped</em>' attribute.
	 * @see #isSetFromItemRemovedWhenMapped()
	 * @see #unsetFromItemRemovedWhenMapped()
	 * @see #isFromItemRemovedWhenMapped()
	 * @generated
	 */
	void setFromItemRemovedWhenMapped(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemRemovedWhenMapped <em>From Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFromItemRemovedWhenMapped()
	 * @see #isFromItemRemovedWhenMapped()
	 * @see #setFromItemRemovedWhenMapped(boolean)
	 * @generated
	 */
	void unsetFromItemRemovedWhenMapped();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemRemovedWhenMapped <em>From Item Removed When Mapped</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>From Item Removed When Mapped</em>' attribute is set.
	 * @see #unsetFromItemRemovedWhenMapped()
	 * @see #isFromItemRemovedWhenMapped()
	 * @see #setFromItemRemovedWhenMapped(boolean)
	 * @generated
	 */
	boolean isSetFromItemRemovedWhenMapped();

	/**
	 * Returns the value of the '<em><b>From Item Added When Unmapped</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Item Added When Unmapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Item Added When Unmapped</em>' attribute.
	 * @see #isSetFromItemAddedWhenUnmapped()
	 * @see #unsetFromItemAddedWhenUnmapped()
	 * @see #setFromItemAddedWhenUnmapped(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMappingViewerConfiguration_FromItemAddedWhenUnmapped()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='fromItemAddedWhenUnmapped'"
	 * @generated
	 */
	boolean isFromItemAddedWhenUnmapped();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemAddedWhenUnmapped <em>From Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Item Added When Unmapped</em>' attribute.
	 * @see #isSetFromItemAddedWhenUnmapped()
	 * @see #unsetFromItemAddedWhenUnmapped()
	 * @see #isFromItemAddedWhenUnmapped()
	 * @generated
	 */
	void setFromItemAddedWhenUnmapped(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemAddedWhenUnmapped <em>From Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFromItemAddedWhenUnmapped()
	 * @see #isFromItemAddedWhenUnmapped()
	 * @see #setFromItemAddedWhenUnmapped(boolean)
	 * @generated
	 */
	void unsetFromItemAddedWhenUnmapped();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isFromItemAddedWhenUnmapped <em>From Item Added When Unmapped</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>From Item Added When Unmapped</em>' attribute is set.
	 * @see #unsetFromItemAddedWhenUnmapped()
	 * @see #isFromItemAddedWhenUnmapped()
	 * @see #setFromItemAddedWhenUnmapped(boolean)
	 * @generated
	 */
	boolean isSetFromItemAddedWhenUnmapped();

	/**
	 * Returns the value of the '<em><b>To Item Removed When Mapped</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Item Removed When Mapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Item Removed When Mapped</em>' attribute.
	 * @see #isSetToItemRemovedWhenMapped()
	 * @see #unsetToItemRemovedWhenMapped()
	 * @see #setToItemRemovedWhenMapped(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMappingViewerConfiguration_ToItemRemovedWhenMapped()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='toItemRemovedWhenMapped'"
	 * @generated
	 */
	boolean isToItemRemovedWhenMapped();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemRemovedWhenMapped <em>To Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Item Removed When Mapped</em>' attribute.
	 * @see #isSetToItemRemovedWhenMapped()
	 * @see #unsetToItemRemovedWhenMapped()
	 * @see #isToItemRemovedWhenMapped()
	 * @generated
	 */
	void setToItemRemovedWhenMapped(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemRemovedWhenMapped <em>To Item Removed When Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToItemRemovedWhenMapped()
	 * @see #isToItemRemovedWhenMapped()
	 * @see #setToItemRemovedWhenMapped(boolean)
	 * @generated
	 */
	void unsetToItemRemovedWhenMapped();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemRemovedWhenMapped <em>To Item Removed When Mapped</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>To Item Removed When Mapped</em>' attribute is set.
	 * @see #unsetToItemRemovedWhenMapped()
	 * @see #isToItemRemovedWhenMapped()
	 * @see #setToItemRemovedWhenMapped(boolean)
	 * @generated
	 */
	boolean isSetToItemRemovedWhenMapped();

	/**
	 * Returns the value of the '<em><b>To Item Added When Unmapped</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Item Added When Unmapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Item Added When Unmapped</em>' attribute.
	 * @see #isSetToItemAddedWhenUnmapped()
	 * @see #unsetToItemAddedWhenUnmapped()
	 * @see #setToItemAddedWhenUnmapped(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMappingViewerConfiguration_ToItemAddedWhenUnmapped()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='toItemAddedWhenUnmapped'"
	 * @generated
	 */
	boolean isToItemAddedWhenUnmapped();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemAddedWhenUnmapped <em>To Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Item Added When Unmapped</em>' attribute.
	 * @see #isSetToItemAddedWhenUnmapped()
	 * @see #unsetToItemAddedWhenUnmapped()
	 * @see #isToItemAddedWhenUnmapped()
	 * @generated
	 */
	void setToItemAddedWhenUnmapped(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemAddedWhenUnmapped <em>To Item Added When Unmapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToItemAddedWhenUnmapped()
	 * @see #isToItemAddedWhenUnmapped()
	 * @see #setToItemAddedWhenUnmapped(boolean)
	 * @generated
	 */
	void unsetToItemAddedWhenUnmapped();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MappingViewerConfiguration#isToItemAddedWhenUnmapped <em>To Item Added When Unmapped</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>To Item Added When Unmapped</em>' attribute is set.
	 * @see #unsetToItemAddedWhenUnmapped()
	 * @see #isToItemAddedWhenUnmapped()
	 * @see #setToItemAddedWhenUnmapped(boolean)
	 * @generated
	 */
	boolean isSetToItemAddedWhenUnmapped();

} // MappingViewerConfiguration
