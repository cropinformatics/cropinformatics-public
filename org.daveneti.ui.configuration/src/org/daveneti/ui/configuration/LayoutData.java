/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grid data properties determine the layout of a component with in a container
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getHeightHint <em>Height Hint</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getVerticalIndent <em>Vertical Indent</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.LayoutData#getWidthHint <em>Width Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData()
 * @model extendedMetaData="name='LayoutData' kind='elementOnly'"
 * @generated
 */
public interface LayoutData extends EObject
{
	/**
	 * Returns the value of the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * grabExcessHorizontalSpace specifies whether the width of the cell changes depending on the size of the parent Composite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #isSetGrabExcessHorizontalSpace()
	 * @see #unsetGrabExcessHorizontalSpace()
	 * @see #setGrabExcessHorizontalSpace(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_GrabExcessHorizontalSpace()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='grabExcessHorizontalSpace'"
	 * @generated
	 */
	boolean isGrabExcessHorizontalSpace();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #isSetGrabExcessHorizontalSpace()
	 * @see #unsetGrabExcessHorizontalSpace()
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 */
	void setGrabExcessHorizontalSpace(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrabExcessHorizontalSpace()
	 * @see #isGrabExcessHorizontalSpace()
	 * @see #setGrabExcessHorizontalSpace(boolean)
	 * @generated
	 */
	void unsetGrabExcessHorizontalSpace();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grab Excess Horizontal Space</em>' attribute is set.
	 * @see #unsetGrabExcessHorizontalSpace()
	 * @see #isGrabExcessHorizontalSpace()
	 * @see #setGrabExcessHorizontalSpace(boolean)
	 * @generated
	 */
	boolean isSetGrabExcessHorizontalSpace();

	/**
	 * Returns the value of the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * grabExcessVerticalSpace specifies whether the height of the cell changes depending on the size of the parent Composite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #isSetGrabExcessVerticalSpace()
	 * @see #unsetGrabExcessVerticalSpace()
	 * @see #setGrabExcessVerticalSpace(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_GrabExcessVerticalSpace()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='grabExcessVerticalSpace'"
	 * @generated
	 */
	boolean isGrabExcessVerticalSpace();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #isSetGrabExcessVerticalSpace()
	 * @see #unsetGrabExcessVerticalSpace()
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 */
	void setGrabExcessVerticalSpace(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrabExcessVerticalSpace()
	 * @see #isGrabExcessVerticalSpace()
	 * @see #setGrabExcessVerticalSpace(boolean)
	 * @generated
	 */
	void unsetGrabExcessVerticalSpace();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grab Excess Vertical Space</em>' attribute is set.
	 * @see #unsetGrabExcessVerticalSpace()
	 * @see #isGrabExcessVerticalSpace()
	 * @see #setGrabExcessVerticalSpace(boolean)
	 * @generated
	 */
	boolean isSetGrabExcessVerticalSpace();

	/**
	 * Returns the value of the '<em><b>Height Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * heightHint specifies the preferred height in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height Hint</em>' attribute.
	 * @see #isSetHeightHint()
	 * @see #unsetHeightHint()
	 * @see #setHeightHint(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_HeightHint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='heightHint'"
	 * @generated
	 */
	int getHeightHint();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHeightHint <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Hint</em>' attribute.
	 * @see #isSetHeightHint()
	 * @see #unsetHeightHint()
	 * @see #getHeightHint()
	 * @generated
	 */
	void setHeightHint(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHeightHint <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeightHint()
	 * @see #getHeightHint()
	 * @see #setHeightHint(int)
	 * @generated
	 */
	void unsetHeightHint();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHeightHint <em>Height Hint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height Hint</em>' attribute is set.
	 * @see #unsetHeightHint()
	 * @see #getHeightHint()
	 * @see #setHeightHint(int)
	 * @generated
	 */
	boolean isSetHeightHint();

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * horizontalAlignment specifies how controls will be positioned horizontally within a cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #isSetHorizontalAlignment()
	 * @see #unsetHorizontalAlignment()
	 * @see #setHorizontalAlignment(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_HorizontalAlignment()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='horizontalAlignment'"
	 * @generated
	 */
	int getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #isSetHorizontalAlignment()
	 * @see #unsetHorizontalAlignment()
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalAlignment()
	 * @see #getHorizontalAlignment()
	 * @see #setHorizontalAlignment(int)
	 * @generated
	 */
	void unsetHorizontalAlignment();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Alignment</em>' attribute is set.
	 * @see #unsetHorizontalAlignment()
	 * @see #getHorizontalAlignment()
	 * @see #setHorizontalAlignment(int)
	 * @generated
	 */
	boolean isSetHorizontalAlignment();

	/**
	 * Returns the value of the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * horizontalIndent specifies the number of pixels of indentation that will be placed along the left side of the cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Indent</em>' attribute.
	 * @see #isSetHorizontalIndent()
	 * @see #unsetHorizontalIndent()
	 * @see #setHorizontalIndent(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_HorizontalIndent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='horizontalIndent'"
	 * @generated
	 */
	int getHorizontalIndent();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalIndent <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Indent</em>' attribute.
	 * @see #isSetHorizontalIndent()
	 * @see #unsetHorizontalIndent()
	 * @see #getHorizontalIndent()
	 * @generated
	 */
	void setHorizontalIndent(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalIndent <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalIndent()
	 * @see #getHorizontalIndent()
	 * @see #setHorizontalIndent(int)
	 * @generated
	 */
	void unsetHorizontalIndent();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalIndent <em>Horizontal Indent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Indent</em>' attribute is set.
	 * @see #unsetHorizontalIndent()
	 * @see #getHorizontalIndent()
	 * @see #setHorizontalIndent(int)
	 * @generated
	 */
	boolean isSetHorizontalIndent();

	/**
	 * Returns the value of the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * horizontalSpan specifies the number of column cells that the control will take up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Span</em>' attribute.
	 * @see #isSetHorizontalSpan()
	 * @see #unsetHorizontalSpan()
	 * @see #setHorizontalSpan(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_HorizontalSpan()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='horizontalSpan'"
	 * @generated
	 */
	int getHorizontalSpan();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalSpan <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Span</em>' attribute.
	 * @see #isSetHorizontalSpan()
	 * @see #unsetHorizontalSpan()
	 * @see #getHorizontalSpan()
	 * @generated
	 */
	void setHorizontalSpan(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalSpan <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalSpan()
	 * @see #getHorizontalSpan()
	 * @see #setHorizontalSpan(int)
	 * @generated
	 */
	void unsetHorizontalSpan();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getHorizontalSpan <em>Horizontal Span</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Span</em>' attribute is set.
	 * @see #unsetHorizontalSpan()
	 * @see #getHorizontalSpan()
	 * @see #setHorizontalSpan(int)
	 * @generated
	 */
	boolean isSetHorizontalSpan();

	/**
	 * Returns the value of the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minimumHeight specifies the minimum height in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Height</em>' attribute.
	 * @see #isSetMinimumHeight()
	 * @see #unsetMinimumHeight()
	 * @see #setMinimumHeight(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_MinimumHeight()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='minimumHeight'"
	 * @generated
	 */
	int getMinimumHeight();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getMinimumHeight <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Height</em>' attribute.
	 * @see #isSetMinimumHeight()
	 * @see #unsetMinimumHeight()
	 * @see #getMinimumHeight()
	 * @generated
	 */
	void setMinimumHeight(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getMinimumHeight <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumHeight()
	 * @see #getMinimumHeight()
	 * @see #setMinimumHeight(int)
	 * @generated
	 */
	void unsetMinimumHeight();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getMinimumHeight <em>Minimum Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Height</em>' attribute is set.
	 * @see #unsetMinimumHeight()
	 * @see #getMinimumHeight()
	 * @see #setMinimumHeight(int)
	 * @generated
	 */
	boolean isSetMinimumHeight();

	/**
	 * Returns the value of the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minimumWidth specifies the minimum width in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Width</em>' attribute.
	 * @see #isSetMinimumWidth()
	 * @see #unsetMinimumWidth()
	 * @see #setMinimumWidth(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_MinimumWidth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='minimumWidth'"
	 * @generated
	 */
	int getMinimumWidth();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getMinimumWidth <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Width</em>' attribute.
	 * @see #isSetMinimumWidth()
	 * @see #unsetMinimumWidth()
	 * @see #getMinimumWidth()
	 * @generated
	 */
	void setMinimumWidth(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getMinimumWidth <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumWidth()
	 * @see #getMinimumWidth()
	 * @see #setMinimumWidth(int)
	 * @generated
	 */
	void unsetMinimumWidth();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getMinimumWidth <em>Minimum Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Width</em>' attribute is set.
	 * @see #unsetMinimumWidth()
	 * @see #getMinimumWidth()
	 * @see #setMinimumWidth(int)
	 * @generated
	 */
	boolean isSetMinimumWidth();

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * verticalAlignment specifies how controls will be positioned vertically within a cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #isSetVerticalAlignment()
	 * @see #unsetVerticalAlignment()
	 * @see #setVerticalAlignment(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_VerticalAlignment()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='verticalAlignment'"
	 * @generated
	 */
	int getVerticalAlignment();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #isSetVerticalAlignment()
	 * @see #unsetVerticalAlignment()
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalAlignment()
	 * @see #getVerticalAlignment()
	 * @see #setVerticalAlignment(int)
	 * @generated
	 */
	void unsetVerticalAlignment();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Alignment</em>' attribute is set.
	 * @see #unsetVerticalAlignment()
	 * @see #getVerticalAlignment()
	 * @see #setVerticalAlignment(int)
	 * @generated
	 */
	boolean isSetVerticalAlignment();

	/**
	 * Returns the value of the '<em><b>Vertical Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * verticalIndent specifies the number of pixels of indentation that will be placed along the top side of the cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Indent</em>' attribute.
	 * @see #isSetVerticalIndent()
	 * @see #unsetVerticalIndent()
	 * @see #setVerticalIndent(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_VerticalIndent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='verticalIndent'"
	 * @generated
	 */
	int getVerticalIndent();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalIndent <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Indent</em>' attribute.
	 * @see #isSetVerticalIndent()
	 * @see #unsetVerticalIndent()
	 * @see #getVerticalIndent()
	 * @generated
	 */
	void setVerticalIndent(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalIndent <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalIndent()
	 * @see #getVerticalIndent()
	 * @see #setVerticalIndent(int)
	 * @generated
	 */
	void unsetVerticalIndent();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalIndent <em>Vertical Indent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Indent</em>' attribute is set.
	 * @see #unsetVerticalIndent()
	 * @see #getVerticalIndent()
	 * @see #setVerticalIndent(int)
	 * @generated
	 */
	boolean isSetVerticalIndent();

	/**
	 * Returns the value of the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * verticalSpan specifies the number of row cells that the control will take up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Span</em>' attribute.
	 * @see #isSetVerticalSpan()
	 * @see #unsetVerticalSpan()
	 * @see #setVerticalSpan(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_VerticalSpan()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='verticalSpan'"
	 * @generated
	 */
	int getVerticalSpan();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalSpan <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Span</em>' attribute.
	 * @see #isSetVerticalSpan()
	 * @see #unsetVerticalSpan()
	 * @see #getVerticalSpan()
	 * @generated
	 */
	void setVerticalSpan(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalSpan <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalSpan()
	 * @see #getVerticalSpan()
	 * @see #setVerticalSpan(int)
	 * @generated
	 */
	void unsetVerticalSpan();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getVerticalSpan <em>Vertical Span</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Span</em>' attribute is set.
	 * @see #unsetVerticalSpan()
	 * @see #getVerticalSpan()
	 * @see #setVerticalSpan(int)
	 * @generated
	 */
	boolean isSetVerticalSpan();

	/**
	 * Returns the value of the '<em><b>Width Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * widthHint specifies the preferred width in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width Hint</em>' attribute.
	 * @see #isSetWidthHint()
	 * @see #unsetWidthHint()
	 * @see #setWidthHint(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getLayoutData_WidthHint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='widthHint'"
	 * @generated
	 */
	int getWidthHint();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getWidthHint <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Hint</em>' attribute.
	 * @see #isSetWidthHint()
	 * @see #unsetWidthHint()
	 * @see #getWidthHint()
	 * @generated
	 */
	void setWidthHint(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.LayoutData#getWidthHint <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidthHint()
	 * @see #getWidthHint()
	 * @see #setWidthHint(int)
	 * @generated
	 */
	void unsetWidthHint();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.LayoutData#getWidthHint <em>Width Hint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width Hint</em>' attribute is set.
	 * @see #unsetWidthHint()
	 * @see #getWidthHint()
	 * @see #setWidthHint(int)
	 * @generated
	 */
	boolean isSetWidthHint();

} // LayoutData
