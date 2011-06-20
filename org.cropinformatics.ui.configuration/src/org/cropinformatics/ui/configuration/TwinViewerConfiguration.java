/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twin Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for viewers that display two lists that interact with each other
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedLeftToRight <em>Item Added Left To Right</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedRightToLeft <em>Item Added Right To Left</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedLeftToRight <em>Item Removed Left To Right</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedRightToLeft <em>Item Removed Right To Left</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getTwinViewerConfiguration()
 * @model extendedMetaData="name='TwinViewerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface TwinViewerConfiguration extends ViewerConfiguration
{
	/**
	 * Returns the value of the '<em><b>Item Added Left To Right</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Added Left To Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Added Left To Right</em>' attribute.
	 * @see #isSetItemAddedLeftToRight()
	 * @see #unsetItemAddedLeftToRight()
	 * @see #setItemAddedLeftToRight(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getTwinViewerConfiguration_ItemAddedLeftToRight()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='itemAddedLeftToRight'"
	 * @generated
	 */
	boolean isItemAddedLeftToRight();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedLeftToRight <em>Item Added Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Added Left To Right</em>' attribute.
	 * @see #isSetItemAddedLeftToRight()
	 * @see #unsetItemAddedLeftToRight()
	 * @see #isItemAddedLeftToRight()
	 * @generated
	 */
	void setItemAddedLeftToRight(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedLeftToRight <em>Item Added Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemAddedLeftToRight()
	 * @see #isItemAddedLeftToRight()
	 * @see #setItemAddedLeftToRight(boolean)
	 * @generated
	 */
	void unsetItemAddedLeftToRight();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedLeftToRight <em>Item Added Left To Right</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Added Left To Right</em>' attribute is set.
	 * @see #unsetItemAddedLeftToRight()
	 * @see #isItemAddedLeftToRight()
	 * @see #setItemAddedLeftToRight(boolean)
	 * @generated
	 */
	boolean isSetItemAddedLeftToRight();

	/**
	 * Returns the value of the '<em><b>Item Added Right To Left</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Added Right To Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Added Right To Left</em>' attribute.
	 * @see #isSetItemAddedRightToLeft()
	 * @see #unsetItemAddedRightToLeft()
	 * @see #setItemAddedRightToLeft(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getTwinViewerConfiguration_ItemAddedRightToLeft()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='itemAddedRightToLeft'"
	 * @generated
	 */
	boolean isItemAddedRightToLeft();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedRightToLeft <em>Item Added Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Added Right To Left</em>' attribute.
	 * @see #isSetItemAddedRightToLeft()
	 * @see #unsetItemAddedRightToLeft()
	 * @see #isItemAddedRightToLeft()
	 * @generated
	 */
	void setItemAddedRightToLeft(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedRightToLeft <em>Item Added Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemAddedRightToLeft()
	 * @see #isItemAddedRightToLeft()
	 * @see #setItemAddedRightToLeft(boolean)
	 * @generated
	 */
	void unsetItemAddedRightToLeft();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedRightToLeft <em>Item Added Right To Left</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Added Right To Left</em>' attribute is set.
	 * @see #unsetItemAddedRightToLeft()
	 * @see #isItemAddedRightToLeft()
	 * @see #setItemAddedRightToLeft(boolean)
	 * @generated
	 */
	boolean isSetItemAddedRightToLeft();

	/**
	 * Returns the value of the '<em><b>Item Removed Left To Right</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Removed Left To Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Removed Left To Right</em>' attribute.
	 * @see #isSetItemRemovedLeftToRight()
	 * @see #unsetItemRemovedLeftToRight()
	 * @see #setItemRemovedLeftToRight(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getTwinViewerConfiguration_ItemRemovedLeftToRight()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='itemRemovedLeftToRight'"
	 * @generated
	 */
	boolean isItemRemovedLeftToRight();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedLeftToRight <em>Item Removed Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Removed Left To Right</em>' attribute.
	 * @see #isSetItemRemovedLeftToRight()
	 * @see #unsetItemRemovedLeftToRight()
	 * @see #isItemRemovedLeftToRight()
	 * @generated
	 */
	void setItemRemovedLeftToRight(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedLeftToRight <em>Item Removed Left To Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemRemovedLeftToRight()
	 * @see #isItemRemovedLeftToRight()
	 * @see #setItemRemovedLeftToRight(boolean)
	 * @generated
	 */
	void unsetItemRemovedLeftToRight();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedLeftToRight <em>Item Removed Left To Right</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Removed Left To Right</em>' attribute is set.
	 * @see #unsetItemRemovedLeftToRight()
	 * @see #isItemRemovedLeftToRight()
	 * @see #setItemRemovedLeftToRight(boolean)
	 * @generated
	 */
	boolean isSetItemRemovedLeftToRight();

	/**
	 * Returns the value of the '<em><b>Item Removed Right To Left</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Removed Right To Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Removed Right To Left</em>' attribute.
	 * @see #isSetItemRemovedRightToLeft()
	 * @see #unsetItemRemovedRightToLeft()
	 * @see #setItemRemovedRightToLeft(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getTwinViewerConfiguration_ItemRemovedRightToLeft()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='itemRemovedRightToLeft'"
	 * @generated
	 */
	boolean isItemRemovedRightToLeft();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedRightToLeft <em>Item Removed Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Removed Right To Left</em>' attribute.
	 * @see #isSetItemRemovedRightToLeft()
	 * @see #unsetItemRemovedRightToLeft()
	 * @see #isItemRemovedRightToLeft()
	 * @generated
	 */
	void setItemRemovedRightToLeft(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedRightToLeft <em>Item Removed Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemRemovedRightToLeft()
	 * @see #isItemRemovedRightToLeft()
	 * @see #setItemRemovedRightToLeft(boolean)
	 * @generated
	 */
	void unsetItemRemovedRightToLeft();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedRightToLeft <em>Item Removed Right To Left</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Removed Right To Left</em>' attribute is set.
	 * @see #unsetItemRemovedRightToLeft()
	 * @see #isItemRemovedRightToLeft()
	 * @see #setItemRemovedRightToLeft(boolean)
	 * @generated
	 */
	boolean isSetItemRemovedRightToLeft();

	/**
	 * Returns the value of the '<em><b>Duplicate Allowed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicate Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Allowed</em>' attribute.
	 * @see #isSetDuplicateAllowed()
	 * @see #unsetDuplicateAllowed()
	 * @see #setDuplicateAllowed(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getTwinViewerConfiguration_DuplicateAllowed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='duplicateAllowed'"
	 * @generated
	 */
	boolean isDuplicateAllowed();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicate Allowed</em>' attribute.
	 * @see #isSetDuplicateAllowed()
	 * @see #unsetDuplicateAllowed()
	 * @see #isDuplicateAllowed()
	 * @generated
	 */
	void setDuplicateAllowed(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuplicateAllowed()
	 * @see #isDuplicateAllowed()
	 * @see #setDuplicateAllowed(boolean)
	 * @generated
	 */
	void unsetDuplicateAllowed();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duplicate Allowed</em>' attribute is set.
	 * @see #unsetDuplicateAllowed()
	 * @see #isDuplicateAllowed()
	 * @see #setDuplicateAllowed(boolean)
	 * @generated
	 */
	boolean isSetDuplicateAllowed();

} // TwinViewerConfiguration
