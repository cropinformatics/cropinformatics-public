/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.Layout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.impl.LayoutImpl#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends EObjectImpl implements Layout
{
	/**
	 * The default value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_SPACING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
	protected int horizontalSpacing = HORIZONTAL_SPACING_EDEFAULT;

	/**
	 * This is true if the Horizontal Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalSpacingESet;

	/**
	 * The default value of the '{@link #isMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected boolean makeColumnsEqualWidth = MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;

	/**
	 * This is true if the Make Columns Equal Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean makeColumnsEqualWidthESet;

	/**
	 * The default value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_BOTTOM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected int marginBottom = MARGIN_BOTTOM_EDEFAULT;

	/**
	 * This is true if the Margin Bottom attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marginBottomESet;

	/**
	 * The default value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginHeight()
	 * @generated
	 * @ordered
	 */
	protected int marginHeight = MARGIN_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Margin Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marginHeightESet;

	/**
	 * The default value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected int marginLeft = MARGIN_LEFT_EDEFAULT;

	/**
	 * This is true if the Margin Left attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marginLeftESet;

	/**
	 * The default value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected int marginRight = MARGIN_RIGHT_EDEFAULT;

	/**
	 * This is true if the Margin Right attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marginRightESet;

	/**
	 * The default value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_TOP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected int marginTop = MARGIN_TOP_EDEFAULT;

	/**
	 * This is true if the Margin Top attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marginTopESet;

	/**
	 * The default value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
	protected int marginWidth = MARGIN_WIDTH_EDEFAULT;

	/**
	 * This is true if the Margin Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marginWidthESet;

	/**
	 * The default value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected int numColumns = NUM_COLUMNS_EDEFAULT;

	/**
	 * This is true if the Num Columns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numColumnsESet;

	/**
	 * The default value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_SPACING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
	protected int verticalSpacing = VERTICAL_SPACING_EDEFAULT;

	/**
	 * This is true if the Vertical Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalSpacingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl()
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
		return ConfigurationPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalSpacing()
	{
		return horizontalSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpacing(int newHorizontalSpacing)
	{
		int oldHorizontalSpacing = horizontalSpacing;
		horizontalSpacing = newHorizontalSpacing;
		boolean oldHorizontalSpacingESet = horizontalSpacingESet;
		horizontalSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__HORIZONTAL_SPACING, oldHorizontalSpacing, horizontalSpacing, !oldHorizontalSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalSpacing()
	{
		int oldHorizontalSpacing = horizontalSpacing;
		boolean oldHorizontalSpacingESet = horizontalSpacingESet;
		horizontalSpacing = HORIZONTAL_SPACING_EDEFAULT;
		horizontalSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__HORIZONTAL_SPACING, oldHorizontalSpacing, HORIZONTAL_SPACING_EDEFAULT, oldHorizontalSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalSpacing()
	{
		return horizontalSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMakeColumnsEqualWidth()
	{
		return makeColumnsEqualWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakeColumnsEqualWidth(boolean newMakeColumnsEqualWidth)
	{
		boolean oldMakeColumnsEqualWidth = makeColumnsEqualWidth;
		makeColumnsEqualWidth = newMakeColumnsEqualWidth;
		boolean oldMakeColumnsEqualWidthESet = makeColumnsEqualWidthESet;
		makeColumnsEqualWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH, oldMakeColumnsEqualWidth, makeColumnsEqualWidth, !oldMakeColumnsEqualWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMakeColumnsEqualWidth()
	{
		boolean oldMakeColumnsEqualWidth = makeColumnsEqualWidth;
		boolean oldMakeColumnsEqualWidthESet = makeColumnsEqualWidthESet;
		makeColumnsEqualWidth = MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;
		makeColumnsEqualWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH, oldMakeColumnsEqualWidth, MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT, oldMakeColumnsEqualWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMakeColumnsEqualWidth()
	{
		return makeColumnsEqualWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginBottom()
	{
		return marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginBottom(int newMarginBottom)
	{
		int oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		boolean oldMarginBottomESet = marginBottomESet;
		marginBottomESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MARGIN_BOTTOM, oldMarginBottom, marginBottom, !oldMarginBottomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarginBottom()
	{
		int oldMarginBottom = marginBottom;
		boolean oldMarginBottomESet = marginBottomESet;
		marginBottom = MARGIN_BOTTOM_EDEFAULT;
		marginBottomESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MARGIN_BOTTOM, oldMarginBottom, MARGIN_BOTTOM_EDEFAULT, oldMarginBottomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarginBottom()
	{
		return marginBottomESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginHeight()
	{
		return marginHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginHeight(int newMarginHeight)
	{
		int oldMarginHeight = marginHeight;
		marginHeight = newMarginHeight;
		boolean oldMarginHeightESet = marginHeightESet;
		marginHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MARGIN_HEIGHT, oldMarginHeight, marginHeight, !oldMarginHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarginHeight()
	{
		int oldMarginHeight = marginHeight;
		boolean oldMarginHeightESet = marginHeightESet;
		marginHeight = MARGIN_HEIGHT_EDEFAULT;
		marginHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MARGIN_HEIGHT, oldMarginHeight, MARGIN_HEIGHT_EDEFAULT, oldMarginHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarginHeight()
	{
		return marginHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginLeft()
	{
		return marginLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginLeft(int newMarginLeft)
	{
		int oldMarginLeft = marginLeft;
		marginLeft = newMarginLeft;
		boolean oldMarginLeftESet = marginLeftESet;
		marginLeftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MARGIN_LEFT, oldMarginLeft, marginLeft, !oldMarginLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarginLeft()
	{
		int oldMarginLeft = marginLeft;
		boolean oldMarginLeftESet = marginLeftESet;
		marginLeft = MARGIN_LEFT_EDEFAULT;
		marginLeftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MARGIN_LEFT, oldMarginLeft, MARGIN_LEFT_EDEFAULT, oldMarginLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarginLeft()
	{
		return marginLeftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginRight()
	{
		return marginRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginRight(int newMarginRight)
	{
		int oldMarginRight = marginRight;
		marginRight = newMarginRight;
		boolean oldMarginRightESet = marginRightESet;
		marginRightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MARGIN_RIGHT, oldMarginRight, marginRight, !oldMarginRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarginRight()
	{
		int oldMarginRight = marginRight;
		boolean oldMarginRightESet = marginRightESet;
		marginRight = MARGIN_RIGHT_EDEFAULT;
		marginRightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MARGIN_RIGHT, oldMarginRight, MARGIN_RIGHT_EDEFAULT, oldMarginRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarginRight()
	{
		return marginRightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginTop()
	{
		return marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginTop(int newMarginTop)
	{
		int oldMarginTop = marginTop;
		marginTop = newMarginTop;
		boolean oldMarginTopESet = marginTopESet;
		marginTopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MARGIN_TOP, oldMarginTop, marginTop, !oldMarginTopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarginTop()
	{
		int oldMarginTop = marginTop;
		boolean oldMarginTopESet = marginTopESet;
		marginTop = MARGIN_TOP_EDEFAULT;
		marginTopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MARGIN_TOP, oldMarginTop, MARGIN_TOP_EDEFAULT, oldMarginTopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarginTop()
	{
		return marginTopESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginWidth()
	{
		return marginWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginWidth(int newMarginWidth)
	{
		int oldMarginWidth = marginWidth;
		marginWidth = newMarginWidth;
		boolean oldMarginWidthESet = marginWidthESet;
		marginWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__MARGIN_WIDTH, oldMarginWidth, marginWidth, !oldMarginWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarginWidth()
	{
		int oldMarginWidth = marginWidth;
		boolean oldMarginWidthESet = marginWidthESet;
		marginWidth = MARGIN_WIDTH_EDEFAULT;
		marginWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__MARGIN_WIDTH, oldMarginWidth, MARGIN_WIDTH_EDEFAULT, oldMarginWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarginWidth()
	{
		return marginWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumColumns()
	{
		return numColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumColumns(int newNumColumns)
	{
		int oldNumColumns = numColumns;
		numColumns = newNumColumns;
		boolean oldNumColumnsESet = numColumnsESet;
		numColumnsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__NUM_COLUMNS, oldNumColumns, numColumns, !oldNumColumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumColumns()
	{
		int oldNumColumns = numColumns;
		boolean oldNumColumnsESet = numColumnsESet;
		numColumns = NUM_COLUMNS_EDEFAULT;
		numColumnsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__NUM_COLUMNS, oldNumColumns, NUM_COLUMNS_EDEFAULT, oldNumColumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumColumns()
	{
		return numColumnsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalSpacing()
	{
		return verticalSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpacing(int newVerticalSpacing)
	{
		int oldVerticalSpacing = verticalSpacing;
		verticalSpacing = newVerticalSpacing;
		boolean oldVerticalSpacingESet = verticalSpacingESet;
		verticalSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT__VERTICAL_SPACING, oldVerticalSpacing, verticalSpacing, !oldVerticalSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalSpacing()
	{
		int oldVerticalSpacing = verticalSpacing;
		boolean oldVerticalSpacingESet = verticalSpacingESet;
		verticalSpacing = VERTICAL_SPACING_EDEFAULT;
		verticalSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT__VERTICAL_SPACING, oldVerticalSpacing, VERTICAL_SPACING_EDEFAULT, oldVerticalSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalSpacing()
	{
		return verticalSpacingESet;
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
			case ConfigurationPackage.LAYOUT__HORIZONTAL_SPACING:
				return getHorizontalSpacing();
			case ConfigurationPackage.LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				return isMakeColumnsEqualWidth();
			case ConfigurationPackage.LAYOUT__MARGIN_BOTTOM:
				return getMarginBottom();
			case ConfigurationPackage.LAYOUT__MARGIN_HEIGHT:
				return getMarginHeight();
			case ConfigurationPackage.LAYOUT__MARGIN_LEFT:
				return getMarginLeft();
			case ConfigurationPackage.LAYOUT__MARGIN_RIGHT:
				return getMarginRight();
			case ConfigurationPackage.LAYOUT__MARGIN_TOP:
				return getMarginTop();
			case ConfigurationPackage.LAYOUT__MARGIN_WIDTH:
				return getMarginWidth();
			case ConfigurationPackage.LAYOUT__NUM_COLUMNS:
				return getNumColumns();
			case ConfigurationPackage.LAYOUT__VERTICAL_SPACING:
				return getVerticalSpacing();
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
			case ConfigurationPackage.LAYOUT__HORIZONTAL_SPACING:
				setHorizontalSpacing((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				setMakeColumnsEqualWidth((Boolean)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_BOTTOM:
				setMarginBottom((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_HEIGHT:
				setMarginHeight((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_LEFT:
				setMarginLeft((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_RIGHT:
				setMarginRight((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_TOP:
				setMarginTop((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_WIDTH:
				setMarginWidth((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__NUM_COLUMNS:
				setNumColumns((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT__VERTICAL_SPACING:
				setVerticalSpacing((Integer)newValue);
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
			case ConfigurationPackage.LAYOUT__HORIZONTAL_SPACING:
				unsetHorizontalSpacing();
				return;
			case ConfigurationPackage.LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				unsetMakeColumnsEqualWidth();
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_BOTTOM:
				unsetMarginBottom();
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_HEIGHT:
				unsetMarginHeight();
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_LEFT:
				unsetMarginLeft();
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_RIGHT:
				unsetMarginRight();
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_TOP:
				unsetMarginTop();
				return;
			case ConfigurationPackage.LAYOUT__MARGIN_WIDTH:
				unsetMarginWidth();
				return;
			case ConfigurationPackage.LAYOUT__NUM_COLUMNS:
				unsetNumColumns();
				return;
			case ConfigurationPackage.LAYOUT__VERTICAL_SPACING:
				unsetVerticalSpacing();
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
			case ConfigurationPackage.LAYOUT__HORIZONTAL_SPACING:
				return isSetHorizontalSpacing();
			case ConfigurationPackage.LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				return isSetMakeColumnsEqualWidth();
			case ConfigurationPackage.LAYOUT__MARGIN_BOTTOM:
				return isSetMarginBottom();
			case ConfigurationPackage.LAYOUT__MARGIN_HEIGHT:
				return isSetMarginHeight();
			case ConfigurationPackage.LAYOUT__MARGIN_LEFT:
				return isSetMarginLeft();
			case ConfigurationPackage.LAYOUT__MARGIN_RIGHT:
				return isSetMarginRight();
			case ConfigurationPackage.LAYOUT__MARGIN_TOP:
				return isSetMarginTop();
			case ConfigurationPackage.LAYOUT__MARGIN_WIDTH:
				return isSetMarginWidth();
			case ConfigurationPackage.LAYOUT__NUM_COLUMNS:
				return isSetNumColumns();
			case ConfigurationPackage.LAYOUT__VERTICAL_SPACING:
				return isSetVerticalSpacing();
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
		result.append(" (horizontalSpacing: ");
		if (horizontalSpacingESet) result.append(horizontalSpacing); else result.append("<unset>");
		result.append(", makeColumnsEqualWidth: ");
		if (makeColumnsEqualWidthESet) result.append(makeColumnsEqualWidth); else result.append("<unset>");
		result.append(", marginBottom: ");
		if (marginBottomESet) result.append(marginBottom); else result.append("<unset>");
		result.append(", marginHeight: ");
		if (marginHeightESet) result.append(marginHeight); else result.append("<unset>");
		result.append(", marginLeft: ");
		if (marginLeftESet) result.append(marginLeft); else result.append("<unset>");
		result.append(", marginRight: ");
		if (marginRightESet) result.append(marginRight); else result.append("<unset>");
		result.append(", marginTop: ");
		if (marginTopESet) result.append(marginTop); else result.append("<unset>");
		result.append(", marginWidth: ");
		if (marginWidthESet) result.append(marginWidth); else result.append("<unset>");
		result.append(", numColumns: ");
		if (numColumnsESet) result.append(numColumns); else result.append("<unset>");
		result.append(", verticalSpacing: ");
		if (verticalSpacingESet) result.append(verticalSpacing); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
