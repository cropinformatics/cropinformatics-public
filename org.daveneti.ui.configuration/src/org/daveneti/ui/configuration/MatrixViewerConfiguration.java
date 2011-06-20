/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for viewers that display matrices and tables
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isCellSelectionInUse <em>Cell Selection In Use</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isLinesVisible <em>Lines Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMatrixViewerConfiguration()
 * @model extendedMetaData="name='MatrixViewerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface MatrixViewerConfiguration extends ViewerConfiguration
{
	/**
	 * Returns the value of the '<em><b>Cell Selection In Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Selection In Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Selection In Use</em>' attribute.
	 * @see #isSetCellSelectionInUse()
	 * @see #unsetCellSelectionInUse()
	 * @see #setCellSelectionInUse(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMatrixViewerConfiguration_CellSelectionInUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='cellSelectionInUse'"
	 * @generated
	 */
	boolean isCellSelectionInUse();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isCellSelectionInUse <em>Cell Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Selection In Use</em>' attribute.
	 * @see #isSetCellSelectionInUse()
	 * @see #unsetCellSelectionInUse()
	 * @see #isCellSelectionInUse()
	 * @generated
	 */
	void setCellSelectionInUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isCellSelectionInUse <em>Cell Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCellSelectionInUse()
	 * @see #isCellSelectionInUse()
	 * @see #setCellSelectionInUse(boolean)
	 * @generated
	 */
	void unsetCellSelectionInUse();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isCellSelectionInUse <em>Cell Selection In Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cell Selection In Use</em>' attribute is set.
	 * @see #unsetCellSelectionInUse()
	 * @see #isCellSelectionInUse()
	 * @see #setCellSelectionInUse(boolean)
	 * @generated
	 */
	boolean isSetCellSelectionInUse();

	/**
	 * Returns the value of the '<em><b>Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines Visible</em>' attribute.
	 * @see #isSetLinesVisible()
	 * @see #unsetLinesVisible()
	 * @see #setLinesVisible(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getMatrixViewerConfiguration_LinesVisible()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='linesVisible'"
	 * @generated
	 */
	boolean isLinesVisible();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isLinesVisible <em>Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines Visible</em>' attribute.
	 * @see #isSetLinesVisible()
	 * @see #unsetLinesVisible()
	 * @see #isLinesVisible()
	 * @generated
	 */
	void setLinesVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isLinesVisible <em>Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinesVisible()
	 * @see #isLinesVisible()
	 * @see #setLinesVisible(boolean)
	 * @generated
	 */
	void unsetLinesVisible();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration#isLinesVisible <em>Lines Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lines Visible</em>' attribute is set.
	 * @see #unsetLinesVisible()
	 * @see #isLinesVisible()
	 * @see #setLinesVisible(boolean)
	 * @generated
	 */
	boolean isSetLinesVisible();

} // MatrixViewerConfiguration
