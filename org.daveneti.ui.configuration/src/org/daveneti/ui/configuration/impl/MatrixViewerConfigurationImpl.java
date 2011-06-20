/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.MatrixViewerConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.MatrixViewerConfigurationImpl#isCellSelectionInUse <em>Cell Selection In Use</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.MatrixViewerConfigurationImpl#isLinesVisible <em>Lines Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixViewerConfigurationImpl extends ViewerConfigurationImpl implements MatrixViewerConfiguration
{
	/**
	 * The default value of the '{@link #isCellSelectionInUse() <em>Cell Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCellSelectionInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CELL_SELECTION_IN_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCellSelectionInUse() <em>Cell Selection In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCellSelectionInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean cellSelectionInUse = CELL_SELECTION_IN_USE_EDEFAULT;

	/**
	 * This is true if the Cell Selection In Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cellSelectionInUseESet;

	/**
	 * The default value of the '{@link #isLinesVisible() <em>Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLinesVisible() <em>Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean linesVisible = LINES_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Lines Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linesVisibleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixViewerConfigurationImpl()
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
		return ConfigurationPackage.Literals.MATRIX_VIEWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCellSelectionInUse()
	{
		return cellSelectionInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellSelectionInUse(boolean newCellSelectionInUse)
	{
		boolean oldCellSelectionInUse = cellSelectionInUse;
		cellSelectionInUse = newCellSelectionInUse;
		boolean oldCellSelectionInUseESet = cellSelectionInUseESet;
		cellSelectionInUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE, oldCellSelectionInUse, cellSelectionInUse, !oldCellSelectionInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCellSelectionInUse()
	{
		boolean oldCellSelectionInUse = cellSelectionInUse;
		boolean oldCellSelectionInUseESet = cellSelectionInUseESet;
		cellSelectionInUse = CELL_SELECTION_IN_USE_EDEFAULT;
		cellSelectionInUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE, oldCellSelectionInUse, CELL_SELECTION_IN_USE_EDEFAULT, oldCellSelectionInUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCellSelectionInUse()
	{
		return cellSelectionInUseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLinesVisible()
	{
		return linesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinesVisible(boolean newLinesVisible)
	{
		boolean oldLinesVisible = linesVisible;
		linesVisible = newLinesVisible;
		boolean oldLinesVisibleESet = linesVisibleESet;
		linesVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE, oldLinesVisible, linesVisible, !oldLinesVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinesVisible()
	{
		boolean oldLinesVisible = linesVisible;
		boolean oldLinesVisibleESet = linesVisibleESet;
		linesVisible = LINES_VISIBLE_EDEFAULT;
		linesVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE, oldLinesVisible, LINES_VISIBLE_EDEFAULT, oldLinesVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinesVisible()
	{
		return linesVisibleESet;
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
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE:
				return isCellSelectionInUse();
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE:
				return isLinesVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE:
				setCellSelectionInUse((Boolean)newValue);
				return;
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE:
				setLinesVisible((Boolean)newValue);
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
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE:
				unsetCellSelectionInUse();
				return;
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE:
				unsetLinesVisible();
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
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE:
				return isSetCellSelectionInUse();
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE:
				return isSetLinesVisible();
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
		result.append(" (cellSelectionInUse: ");
		if (cellSelectionInUseESet) result.append(cellSelectionInUse); else result.append("<unset>");
		result.append(", linesVisible: ");
		if (linesVisibleESet) result.append(linesVisible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MatrixViewerConfigurationImpl
