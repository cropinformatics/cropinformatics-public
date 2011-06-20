/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for viewers that display lists
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleSelectionInUse <em>Multiple Selection In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleCheckInUse <em>Multiple Check In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCheckSelectionInUse <em>Check Selection In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCopyItemsInUse <em>Copy Items In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isVirtualInUse <em>Virtual In Use</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingSelectionState <em>Mantaining Selection State</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingCheckedState <em>Mantaining Checked State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration()
 * @model extendedMetaData="name='ListViewerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ListViewerConfiguration extends ViewerConfiguration
{
	/**
	 * Returns the value of the '<em><b>Multiple Selection In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Selection In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Selection In Use</em>' attribute.
	 * @see #isSetMultipleSelectionInUse()
	 * @see #unsetMultipleSelectionInUse()
	 * @see #setMultipleSelectionInUse(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_MultipleSelectionInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='multipleSelectionInUse'"
	 * @generated
	 */
	boolean isMultipleSelectionInUse();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleSelectionInUse <em>Multiple Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Selection In Use</em>' attribute.
	 * @see #isSetMultipleSelectionInUse()
	 * @see #unsetMultipleSelectionInUse()
	 * @see #isMultipleSelectionInUse()
	 * @generated
	 */
	void setMultipleSelectionInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleSelectionInUse <em>Multiple Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultipleSelectionInUse()
	 * @see #isMultipleSelectionInUse()
	 * @see #setMultipleSelectionInUse(boolean)
	 * @generated
	 */
	void unsetMultipleSelectionInUse();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleSelectionInUse <em>Multiple Selection In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple Selection In Use</em>' attribute is set.
	 * @see #unsetMultipleSelectionInUse()
	 * @see #isMultipleSelectionInUse()
	 * @see #setMultipleSelectionInUse(boolean)
	 * @generated
	 */
	boolean isSetMultipleSelectionInUse();

	/**
	 * Returns the value of the '<em><b>Multiple Check In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Check In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Check In Use</em>' attribute.
	 * @see #isSetMultipleCheckInUse()
	 * @see #unsetMultipleCheckInUse()
	 * @see #setMultipleCheckInUse(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_MultipleCheckInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='multipleCheckInUse'"
	 * @generated
	 */
	boolean isMultipleCheckInUse();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleCheckInUse <em>Multiple Check In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Check In Use</em>' attribute.
	 * @see #isSetMultipleCheckInUse()
	 * @see #unsetMultipleCheckInUse()
	 * @see #isMultipleCheckInUse()
	 * @generated
	 */
	void setMultipleCheckInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleCheckInUse <em>Multiple Check In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultipleCheckInUse()
	 * @see #isMultipleCheckInUse()
	 * @see #setMultipleCheckInUse(boolean)
	 * @generated
	 */
	void unsetMultipleCheckInUse();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleCheckInUse <em>Multiple Check In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple Check In Use</em>' attribute is set.
	 * @see #unsetMultipleCheckInUse()
	 * @see #isMultipleCheckInUse()
	 * @see #setMultipleCheckInUse(boolean)
	 * @generated
	 */
	boolean isSetMultipleCheckInUse();

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
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_DuplicateAllowed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='duplicateAllowed'"
	 * @generated
	 */
	boolean isDuplicateAllowed();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}' attribute.
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
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuplicateAllowed()
	 * @see #isDuplicateAllowed()
	 * @see #setDuplicateAllowed(boolean)
	 * @generated
	 */
	void unsetDuplicateAllowed();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duplicate Allowed</em>' attribute is set.
	 * @see #unsetDuplicateAllowed()
	 * @see #isDuplicateAllowed()
	 * @see #setDuplicateAllowed(boolean)
	 * @generated
	 */
	boolean isSetDuplicateAllowed();

	/**
	 * Returns the value of the '<em><b>Check Selection In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Selection In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Selection In Use</em>' attribute.
	 * @see #isSetCheckSelectionInUse()
	 * @see #unsetCheckSelectionInUse()
	 * @see #setCheckSelectionInUse(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_CheckSelectionInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='checkSelectionInUse'"
	 * @generated
	 */
	boolean isCheckSelectionInUse();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCheckSelectionInUse <em>Check Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Selection In Use</em>' attribute.
	 * @see #isSetCheckSelectionInUse()
	 * @see #unsetCheckSelectionInUse()
	 * @see #isCheckSelectionInUse()
	 * @generated
	 */
	void setCheckSelectionInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCheckSelectionInUse <em>Check Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckSelectionInUse()
	 * @see #isCheckSelectionInUse()
	 * @see #setCheckSelectionInUse(boolean)
	 * @generated
	 */
	void unsetCheckSelectionInUse();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCheckSelectionInUse <em>Check Selection In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Check Selection In Use</em>' attribute is set.
	 * @see #unsetCheckSelectionInUse()
	 * @see #isCheckSelectionInUse()
	 * @see #setCheckSelectionInUse(boolean)
	 * @generated
	 */
	boolean isSetCheckSelectionInUse();

	/**
	 * Returns the value of the '<em><b>Threading In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threading In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threading In Use</em>' attribute.
	 * @see #isSetThreadingInUse()
	 * @see #unsetThreadingInUse()
	 * @see #setThreadingInUse(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_ThreadingInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='threadingInUse'"
	 * @generated
	 */
	boolean isThreadingInUse();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threading In Use</em>' attribute.
	 * @see #isSetThreadingInUse()
	 * @see #unsetThreadingInUse()
	 * @see #isThreadingInUse()
	 * @generated
	 */
	void setThreadingInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreadingInUse()
	 * @see #isThreadingInUse()
	 * @see #setThreadingInUse(boolean)
	 * @generated
	 */
	void unsetThreadingInUse();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threading In Use</em>' attribute is set.
	 * @see #unsetThreadingInUse()
	 * @see #isThreadingInUse()
	 * @see #setThreadingInUse(boolean)
	 * @generated
	 */
	boolean isSetThreadingInUse();

	/**
	 * Returns the value of the '<em><b>Copy Items In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Items In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Items In Use</em>' attribute.
	 * @see #isSetCopyItemsInUse()
	 * @see #unsetCopyItemsInUse()
	 * @see #setCopyItemsInUse(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_CopyItemsInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='copyItemsInUse'"
	 * @generated
	 */
	boolean isCopyItemsInUse();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCopyItemsInUse <em>Copy Items In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Items In Use</em>' attribute.
	 * @see #isSetCopyItemsInUse()
	 * @see #unsetCopyItemsInUse()
	 * @see #isCopyItemsInUse()
	 * @generated
	 */
	void setCopyItemsInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCopyItemsInUse <em>Copy Items In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyItemsInUse()
	 * @see #isCopyItemsInUse()
	 * @see #setCopyItemsInUse(boolean)
	 * @generated
	 */
	void unsetCopyItemsInUse();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCopyItemsInUse <em>Copy Items In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Items In Use</em>' attribute is set.
	 * @see #unsetCopyItemsInUse()
	 * @see #isCopyItemsInUse()
	 * @see #setCopyItemsInUse(boolean)
	 * @generated
	 */
	boolean isSetCopyItemsInUse();

	/**
	 * Returns the value of the '<em><b>Virtual In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual In Use</em>' attribute.
	 * @see #isSetVirtualInUse()
	 * @see #unsetVirtualInUse()
	 * @see #setVirtualInUse(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_VirtualInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='virtualInUse'"
	 * @generated
	 */
	boolean isVirtualInUse();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isVirtualInUse <em>Virtual In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual In Use</em>' attribute.
	 * @see #isSetVirtualInUse()
	 * @see #unsetVirtualInUse()
	 * @see #isVirtualInUse()
	 * @generated
	 */
	void setVirtualInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isVirtualInUse <em>Virtual In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVirtualInUse()
	 * @see #isVirtualInUse()
	 * @see #setVirtualInUse(boolean)
	 * @generated
	 */
	void unsetVirtualInUse();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isVirtualInUse <em>Virtual In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Virtual In Use</em>' attribute is set.
	 * @see #unsetVirtualInUse()
	 * @see #isVirtualInUse()
	 * @see #setVirtualInUse(boolean)
	 * @generated
	 */
	boolean isSetVirtualInUse();

	/**
	 * Returns the value of the '<em><b>Mantaining Selection State</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mantaining Selection State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mantaining Selection State</em>' attribute.
	 * @see #isSetMantainingSelectionState()
	 * @see #unsetMantainingSelectionState()
	 * @see #setMantainingSelectionState(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_MantainingSelectionState()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='mantainingSelectionState'"
	 * @generated
	 */
	boolean isMantainingSelectionState();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingSelectionState <em>Mantaining Selection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mantaining Selection State</em>' attribute.
	 * @see #isSetMantainingSelectionState()
	 * @see #unsetMantainingSelectionState()
	 * @see #isMantainingSelectionState()
	 * @generated
	 */
	void setMantainingSelectionState(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingSelectionState <em>Mantaining Selection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMantainingSelectionState()
	 * @see #isMantainingSelectionState()
	 * @see #setMantainingSelectionState(boolean)
	 * @generated
	 */
	void unsetMantainingSelectionState();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingSelectionState <em>Mantaining Selection State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mantaining Selection State</em>' attribute is set.
	 * @see #unsetMantainingSelectionState()
	 * @see #isMantainingSelectionState()
	 * @see #setMantainingSelectionState(boolean)
	 * @generated
	 */
	boolean isSetMantainingSelectionState();

	/**
	 * Returns the value of the '<em><b>Mantaining Checked State</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mantaining Checked State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mantaining Checked State</em>' attribute.
	 * @see #isSetMantainingCheckedState()
	 * @see #unsetMantainingCheckedState()
	 * @see #setMantainingCheckedState(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getListViewerConfiguration_MantainingCheckedState()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='mantainingCheckedState'"
	 * @generated
	 */
	boolean isMantainingCheckedState();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingCheckedState <em>Mantaining Checked State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mantaining Checked State</em>' attribute.
	 * @see #isSetMantainingCheckedState()
	 * @see #unsetMantainingCheckedState()
	 * @see #isMantainingCheckedState()
	 * @generated
	 */
	void setMantainingCheckedState(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingCheckedState <em>Mantaining Checked State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMantainingCheckedState()
	 * @see #isMantainingCheckedState()
	 * @see #setMantainingCheckedState(boolean)
	 * @generated
	 */
	void unsetMantainingCheckedState();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingCheckedState <em>Mantaining Checked State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mantaining Checked State</em>' attribute is set.
	 * @see #unsetMantainingCheckedState()
	 * @see #isMantainingCheckedState()
	 * @see #setMantainingCheckedState(boolean)
	 * @generated
	 */
	boolean isSetMantainingCheckedState();

} // ListViewerConfiguration
