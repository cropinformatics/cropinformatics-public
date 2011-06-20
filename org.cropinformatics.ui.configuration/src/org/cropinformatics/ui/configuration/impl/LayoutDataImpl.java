/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.LayoutData;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getHeightHint <em>Height Hint</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getVerticalIndent <em>Vertical Indent</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl#getWidthHint <em>Width Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutDataImpl extends EObjectImpl implements LayoutData
{
	/**
	 * The default value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessHorizontalSpace = GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;

	/**
	 * This is true if the Grab Excess Horizontal Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessHorizontalSpaceESet;

	/**
	 * The default value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessVerticalSpace = GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;

	/**
	 * This is true if the Grab Excess Vertical Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessVerticalSpaceESet;

	/**
	 * The default value of the '{@link #getHeightHint() <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightHint()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_HINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeightHint() <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightHint()
	 * @generated
	 * @ordered
	 */
	protected int heightHint = HEIGHT_HINT_EDEFAULT;

	/**
	 * This is true if the Height Hint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightHintESet;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_ALIGNMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected int horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Horizontal Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalAlignmentESet;

	/**
	 * The default value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalIndent()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_INDENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalIndent()
	 * @generated
	 * @ordered
	 */
	protected int horizontalIndent = HORIZONTAL_INDENT_EDEFAULT;

	/**
	 * This is true if the Horizontal Indent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalIndentESet;

	/**
	 * The default value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_SPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected int horizontalSpan = HORIZONTAL_SPAN_EDEFAULT;

	/**
	 * This is true if the Horizontal Span attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalSpanESet;

	/**
	 * The default value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
	protected int minimumHeight = MINIMUM_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Minimum Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumHeightESet;

	/**
	 * The default value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
	protected int minimumWidth = MINIMUM_WIDTH_EDEFAULT;

	/**
	 * This is true if the Minimum Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumWidthESet;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_ALIGNMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected int verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Vertical Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalAlignmentESet;

	/**
	 * The default value of the '{@link #getVerticalIndent() <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalIndent()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_INDENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalIndent() <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalIndent()
	 * @generated
	 * @ordered
	 */
	protected int verticalIndent = VERTICAL_INDENT_EDEFAULT;

	/**
	 * This is true if the Vertical Indent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalIndentESet;

	/**
	 * The default value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_SPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected int verticalSpan = VERTICAL_SPAN_EDEFAULT;

	/**
	 * This is true if the Vertical Span attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalSpanESet;

	/**
	 * The default value of the '{@link #getWidthHint() <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthHint()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_HINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidthHint() <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthHint()
	 * @generated
	 * @ordered
	 */
	protected int widthHint = WIDTH_HINT_EDEFAULT;

	/**
	 * This is true if the Width Hint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthHintESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutDataImpl()
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
		return ConfigurationPackage.Literals.LAYOUT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabExcessHorizontalSpace()
	{
		return grabExcessHorizontalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessHorizontalSpace(boolean newGrabExcessHorizontalSpace)
	{
		boolean oldGrabExcessHorizontalSpace = grabExcessHorizontalSpace;
		grabExcessHorizontalSpace = newGrabExcessHorizontalSpace;
		boolean oldGrabExcessHorizontalSpaceESet = grabExcessHorizontalSpaceESet;
		grabExcessHorizontalSpaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE, oldGrabExcessHorizontalSpace, grabExcessHorizontalSpace, !oldGrabExcessHorizontalSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrabExcessHorizontalSpace()
	{
		boolean oldGrabExcessHorizontalSpace = grabExcessHorizontalSpace;
		boolean oldGrabExcessHorizontalSpaceESet = grabExcessHorizontalSpaceESet;
		grabExcessHorizontalSpace = GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;
		grabExcessHorizontalSpaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE, oldGrabExcessHorizontalSpace, GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT, oldGrabExcessHorizontalSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrabExcessHorizontalSpace()
	{
		return grabExcessHorizontalSpaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabExcessVerticalSpace()
	{
		return grabExcessVerticalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessVerticalSpace(boolean newGrabExcessVerticalSpace)
	{
		boolean oldGrabExcessVerticalSpace = grabExcessVerticalSpace;
		grabExcessVerticalSpace = newGrabExcessVerticalSpace;
		boolean oldGrabExcessVerticalSpaceESet = grabExcessVerticalSpaceESet;
		grabExcessVerticalSpaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE, oldGrabExcessVerticalSpace, grabExcessVerticalSpace, !oldGrabExcessVerticalSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrabExcessVerticalSpace()
	{
		boolean oldGrabExcessVerticalSpace = grabExcessVerticalSpace;
		boolean oldGrabExcessVerticalSpaceESet = grabExcessVerticalSpaceESet;
		grabExcessVerticalSpace = GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;
		grabExcessVerticalSpaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE, oldGrabExcessVerticalSpace, GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT, oldGrabExcessVerticalSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrabExcessVerticalSpace()
	{
		return grabExcessVerticalSpaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeightHint()
	{
		return heightHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightHint(int newHeightHint)
	{
		int oldHeightHint = heightHint;
		heightHint = newHeightHint;
		boolean oldHeightHintESet = heightHintESet;
		heightHintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT, oldHeightHint, heightHint, !oldHeightHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeightHint()
	{
		int oldHeightHint = heightHint;
		boolean oldHeightHintESet = heightHintESet;
		heightHint = HEIGHT_HINT_EDEFAULT;
		heightHintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT, oldHeightHint, HEIGHT_HINT_EDEFAULT, oldHeightHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeightHint()
	{
		return heightHintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalAlignment()
	{
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(int newHorizontalAlignment)
	{
		int oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment;
		boolean oldHorizontalAlignmentESet = horizontalAlignmentESet;
		horizontalAlignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment, !oldHorizontalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalAlignment()
	{
		int oldHorizontalAlignment = horizontalAlignment;
		boolean oldHorizontalAlignmentESet = horizontalAlignmentESet;
		horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;
		horizontalAlignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, HORIZONTAL_ALIGNMENT_EDEFAULT, oldHorizontalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalAlignment()
	{
		return horizontalAlignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalIndent()
	{
		return horizontalIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalIndent(int newHorizontalIndent)
	{
		int oldHorizontalIndent = horizontalIndent;
		horizontalIndent = newHorizontalIndent;
		boolean oldHorizontalIndentESet = horizontalIndentESet;
		horizontalIndentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT, oldHorizontalIndent, horizontalIndent, !oldHorizontalIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalIndent()
	{
		int oldHorizontalIndent = horizontalIndent;
		boolean oldHorizontalIndentESet = horizontalIndentESet;
		horizontalIndent = HORIZONTAL_INDENT_EDEFAULT;
		horizontalIndentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT, oldHorizontalIndent, HORIZONTAL_INDENT_EDEFAULT, oldHorizontalIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalIndent()
	{
		return horizontalIndentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalSpan()
	{
		return horizontalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpan(int newHorizontalSpan)
	{
		int oldHorizontalSpan = horizontalSpan;
		horizontalSpan = newHorizontalSpan;
		boolean oldHorizontalSpanESet = horizontalSpanESet;
		horizontalSpanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN, oldHorizontalSpan, horizontalSpan, !oldHorizontalSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalSpan()
	{
		int oldHorizontalSpan = horizontalSpan;
		boolean oldHorizontalSpanESet = horizontalSpanESet;
		horizontalSpan = HORIZONTAL_SPAN_EDEFAULT;
		horizontalSpanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN, oldHorizontalSpan, HORIZONTAL_SPAN_EDEFAULT, oldHorizontalSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalSpan()
	{
		return horizontalSpanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumHeight()
	{
		return minimumHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumHeight(int newMinimumHeight)
	{
		int oldMinimumHeight = minimumHeight;
		minimumHeight = newMinimumHeight;
		boolean oldMinimumHeightESet = minimumHeightESet;
		minimumHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT, oldMinimumHeight, minimumHeight, !oldMinimumHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumHeight()
	{
		int oldMinimumHeight = minimumHeight;
		boolean oldMinimumHeightESet = minimumHeightESet;
		minimumHeight = MINIMUM_HEIGHT_EDEFAULT;
		minimumHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT, oldMinimumHeight, MINIMUM_HEIGHT_EDEFAULT, oldMinimumHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumHeight()
	{
		return minimumHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumWidth()
	{
		return minimumWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumWidth(int newMinimumWidth)
	{
		int oldMinimumWidth = minimumWidth;
		minimumWidth = newMinimumWidth;
		boolean oldMinimumWidthESet = minimumWidthESet;
		minimumWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH, oldMinimumWidth, minimumWidth, !oldMinimumWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumWidth()
	{
		int oldMinimumWidth = minimumWidth;
		boolean oldMinimumWidthESet = minimumWidthESet;
		minimumWidth = MINIMUM_WIDTH_EDEFAULT;
		minimumWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH, oldMinimumWidth, MINIMUM_WIDTH_EDEFAULT, oldMinimumWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumWidth()
	{
		return minimumWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalAlignment()
	{
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(int newVerticalAlignment)
	{
		int oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment;
		boolean oldVerticalAlignmentESet = verticalAlignmentESet;
		verticalAlignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment, !oldVerticalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalAlignment()
	{
		int oldVerticalAlignment = verticalAlignment;
		boolean oldVerticalAlignmentESet = verticalAlignmentESet;
		verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;
		verticalAlignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT, oldVerticalAlignment, VERTICAL_ALIGNMENT_EDEFAULT, oldVerticalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalAlignment()
	{
		return verticalAlignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalIndent()
	{
		return verticalIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalIndent(int newVerticalIndent)
	{
		int oldVerticalIndent = verticalIndent;
		verticalIndent = newVerticalIndent;
		boolean oldVerticalIndentESet = verticalIndentESet;
		verticalIndentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT, oldVerticalIndent, verticalIndent, !oldVerticalIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalIndent()
	{
		int oldVerticalIndent = verticalIndent;
		boolean oldVerticalIndentESet = verticalIndentESet;
		verticalIndent = VERTICAL_INDENT_EDEFAULT;
		verticalIndentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT, oldVerticalIndent, VERTICAL_INDENT_EDEFAULT, oldVerticalIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalIndent()
	{
		return verticalIndentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalSpan()
	{
		return verticalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpan(int newVerticalSpan)
	{
		int oldVerticalSpan = verticalSpan;
		verticalSpan = newVerticalSpan;
		boolean oldVerticalSpanESet = verticalSpanESet;
		verticalSpanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN, oldVerticalSpan, verticalSpan, !oldVerticalSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalSpan()
	{
		int oldVerticalSpan = verticalSpan;
		boolean oldVerticalSpanESet = verticalSpanESet;
		verticalSpan = VERTICAL_SPAN_EDEFAULT;
		verticalSpanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN, oldVerticalSpan, VERTICAL_SPAN_EDEFAULT, oldVerticalSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalSpan()
	{
		return verticalSpanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidthHint()
	{
		return widthHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthHint(int newWidthHint)
	{
		int oldWidthHint = widthHint;
		widthHint = newWidthHint;
		boolean oldWidthHintESet = widthHintESet;
		widthHintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT, oldWidthHint, widthHint, !oldWidthHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidthHint()
	{
		int oldWidthHint = widthHint;
		boolean oldWidthHintESet = widthHintESet;
		widthHint = WIDTH_HINT_EDEFAULT;
		widthHintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT, oldWidthHint, WIDTH_HINT_EDEFAULT, oldWidthHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidthHint()
	{
		return widthHintESet;
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
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				return isGrabExcessHorizontalSpace();
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				return isGrabExcessVerticalSpace();
			case ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT:
				return getHeightHint();
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT:
				return getHorizontalIndent();
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN:
				return getHorizontalSpan();
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT:
				return getMinimumHeight();
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH:
				return getMinimumWidth();
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT:
				return getVerticalIndent();
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN:
				return getVerticalSpan();
			case ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT:
				return getWidthHint();
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
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				setGrabExcessHorizontalSpace((Boolean)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				setGrabExcessVerticalSpace((Boolean)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT:
				setHeightHint((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT:
				setHorizontalIndent((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN:
				setHorizontalSpan((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT:
				setMinimumHeight((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH:
				setMinimumWidth((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT:
				setVerticalIndent((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN:
				setVerticalSpan((Integer)newValue);
				return;
			case ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT:
				setWidthHint((Integer)newValue);
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
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				unsetGrabExcessHorizontalSpace();
				return;
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				unsetGrabExcessVerticalSpace();
				return;
			case ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT:
				unsetHeightHint();
				return;
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				unsetHorizontalAlignment();
				return;
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT:
				unsetHorizontalIndent();
				return;
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN:
				unsetHorizontalSpan();
				return;
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT:
				unsetMinimumHeight();
				return;
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH:
				unsetMinimumWidth();
				return;
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT:
				unsetVerticalAlignment();
				return;
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT:
				unsetVerticalIndent();
				return;
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN:
				unsetVerticalSpan();
				return;
			case ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT:
				unsetWidthHint();
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
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				return isSetGrabExcessHorizontalSpace();
			case ConfigurationPackage.LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				return isSetGrabExcessVerticalSpace();
			case ConfigurationPackage.LAYOUT_DATA__HEIGHT_HINT:
				return isSetHeightHint();
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				return isSetHorizontalAlignment();
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_INDENT:
				return isSetHorizontalIndent();
			case ConfigurationPackage.LAYOUT_DATA__HORIZONTAL_SPAN:
				return isSetHorizontalSpan();
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_HEIGHT:
				return isSetMinimumHeight();
			case ConfigurationPackage.LAYOUT_DATA__MINIMUM_WIDTH:
				return isSetMinimumWidth();
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_ALIGNMENT:
				return isSetVerticalAlignment();
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_INDENT:
				return isSetVerticalIndent();
			case ConfigurationPackage.LAYOUT_DATA__VERTICAL_SPAN:
				return isSetVerticalSpan();
			case ConfigurationPackage.LAYOUT_DATA__WIDTH_HINT:
				return isSetWidthHint();
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
		result.append(" (grabExcessHorizontalSpace: ");
		if (grabExcessHorizontalSpaceESet) result.append(grabExcessHorizontalSpace); else result.append("<unset>");
		result.append(", grabExcessVerticalSpace: ");
		if (grabExcessVerticalSpaceESet) result.append(grabExcessVerticalSpace); else result.append("<unset>");
		result.append(", heightHint: ");
		if (heightHintESet) result.append(heightHint); else result.append("<unset>");
		result.append(", horizontalAlignment: ");
		if (horizontalAlignmentESet) result.append(horizontalAlignment); else result.append("<unset>");
		result.append(", horizontalIndent: ");
		if (horizontalIndentESet) result.append(horizontalIndent); else result.append("<unset>");
		result.append(", horizontalSpan: ");
		if (horizontalSpanESet) result.append(horizontalSpan); else result.append("<unset>");
		result.append(", minimumHeight: ");
		if (minimumHeightESet) result.append(minimumHeight); else result.append("<unset>");
		result.append(", minimumWidth: ");
		if (minimumWidthESet) result.append(minimumWidth); else result.append("<unset>");
		result.append(", verticalAlignment: ");
		if (verticalAlignmentESet) result.append(verticalAlignment); else result.append("<unset>");
		result.append(", verticalIndent: ");
		if (verticalIndentESet) result.append(verticalIndent); else result.append("<unset>");
		result.append(", verticalSpan: ");
		if (verticalSpanESet) result.append(verticalSpan); else result.append("<unset>");
		result.append(", widthHint: ");
		if (widthHintESet) result.append(widthHint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LayoutDataImpl
