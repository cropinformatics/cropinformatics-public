/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grid layout properties determine the how the componenta will be positions in thw container
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.Layout#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout()
 * @model extendedMetaData="name='Layout' kind='elementOnly'"
 * @generated
 */
public interface Layout extends EObject
{
	/**
	 * Returns the value of the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the number of pixels between the right edge of one cell and the left edge of its neighbouring cell to the right.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #isSetHorizontalSpacing()
	 * @see #unsetHorizontalSpacing()
	 * @see #setHorizontalSpacing(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_HorizontalSpacing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='horizontalSpacing'"
	 * @generated
	 */
	int getHorizontalSpacing();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getHorizontalSpacing <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #isSetHorizontalSpacing()
	 * @see #unsetHorizontalSpacing()
	 * @see #getHorizontalSpacing()
	 * @generated
	 */
	void setHorizontalSpacing(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getHorizontalSpacing <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalSpacing()
	 * @see #getHorizontalSpacing()
	 * @see #setHorizontalSpacing(int)
	 * @generated
	 */
	void unsetHorizontalSpacing();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getHorizontalSpacing <em>Horizontal Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Spacing</em>' attribute is set.
	 * @see #unsetHorizontalSpacing()
	 * @see #getHorizontalSpacing()
	 * @see #setHorizontalSpacing(int)
	 * @generated
	 */
	boolean isSetHorizontalSpacing();

	/**
	 * Returns the value of the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * makeColumnsEqualWidth specifies whether all columns in the layout will be forced to have the same width.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #isSetMakeColumnsEqualWidth()
	 * @see #unsetMakeColumnsEqualWidth()
	 * @see #setMakeColumnsEqualWidth(boolean)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MakeColumnsEqualWidth()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='makeColumnsEqualWidth'"
	 * @generated
	 */
	boolean isMakeColumnsEqualWidth();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #isSetMakeColumnsEqualWidth()
	 * @see #unsetMakeColumnsEqualWidth()
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 */
	void setMakeColumnsEqualWidth(boolean value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMakeColumnsEqualWidth()
	 * @see #isMakeColumnsEqualWidth()
	 * @see #setMakeColumnsEqualWidth(boolean)
	 * @generated
	 */
	void unsetMakeColumnsEqualWidth();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Make Columns Equal Width</em>' attribute is set.
	 * @see #unsetMakeColumnsEqualWidth()
	 * @see #isMakeColumnsEqualWidth()
	 * @see #setMakeColumnsEqualWidth(boolean)
	 * @generated
	 */
	boolean isSetMakeColumnsEqualWidth();

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * marginBottom specifies the number of pixels of vertical margin that will be placed along the bottom edge of the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #isSetMarginBottom()
	 * @see #unsetMarginBottom()
	 * @see #setMarginBottom(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MarginBottom()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='marginBottom'"
	 * @generated
	 */
	int getMarginBottom();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #isSetMarginBottom()
	 * @see #unsetMarginBottom()
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarginBottom()
	 * @see #getMarginBottom()
	 * @see #setMarginBottom(int)
	 * @generated
	 */
	void unsetMarginBottom();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginBottom <em>Margin Bottom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Margin Bottom</em>' attribute is set.
	 * @see #unsetMarginBottom()
	 * @see #getMarginBottom()
	 * @see #setMarginBottom(int)
	 * @generated
	 */
	boolean isSetMarginBottom();

	/**
	 * Returns the value of the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * marginHeight specifies the number of pixels of vertical margin that will be placed along the top and bottom edges of the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin Height</em>' attribute.
	 * @see #isSetMarginHeight()
	 * @see #unsetMarginHeight()
	 * @see #setMarginHeight(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MarginHeight()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='marginHeight'"
	 * @generated
	 */
	int getMarginHeight();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginHeight <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Height</em>' attribute.
	 * @see #isSetMarginHeight()
	 * @see #unsetMarginHeight()
	 * @see #getMarginHeight()
	 * @generated
	 */
	void setMarginHeight(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginHeight <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarginHeight()
	 * @see #getMarginHeight()
	 * @see #setMarginHeight(int)
	 * @generated
	 */
	void unsetMarginHeight();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginHeight <em>Margin Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Margin Height</em>' attribute is set.
	 * @see #unsetMarginHeight()
	 * @see #getMarginHeight()
	 * @see #setMarginHeight(int)
	 * @generated
	 */
	boolean isSetMarginHeight();

	/**
	 * Returns the value of the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * marginLeft specifies the number of pixels of horizontal margin that will be placed along the left edge of the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin Left</em>' attribute.
	 * @see #isSetMarginLeft()
	 * @see #unsetMarginLeft()
	 * @see #setMarginLeft(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MarginLeft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='marginLeft'"
	 * @generated
	 */
	int getMarginLeft();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Left</em>' attribute.
	 * @see #isSetMarginLeft()
	 * @see #unsetMarginLeft()
	 * @see #getMarginLeft()
	 * @generated
	 */
	void setMarginLeft(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarginLeft()
	 * @see #getMarginLeft()
	 * @see #setMarginLeft(int)
	 * @generated
	 */
	void unsetMarginLeft();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginLeft <em>Margin Left</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Margin Left</em>' attribute is set.
	 * @see #unsetMarginLeft()
	 * @see #getMarginLeft()
	 * @see #setMarginLeft(int)
	 * @generated
	 */
	boolean isSetMarginLeft();

	/**
	 * Returns the value of the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * marginRight specifies the number of pixels of horizontal margin that will be placed along the right edge of the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin Right</em>' attribute.
	 * @see #isSetMarginRight()
	 * @see #unsetMarginRight()
	 * @see #setMarginRight(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MarginRight()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='marginRight'"
	 * @generated
	 */
	int getMarginRight();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Right</em>' attribute.
	 * @see #isSetMarginRight()
	 * @see #unsetMarginRight()
	 * @see #getMarginRight()
	 * @generated
	 */
	void setMarginRight(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarginRight()
	 * @see #getMarginRight()
	 * @see #setMarginRight(int)
	 * @generated
	 */
	void unsetMarginRight();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginRight <em>Margin Right</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Margin Right</em>' attribute is set.
	 * @see #unsetMarginRight()
	 * @see #getMarginRight()
	 * @see #setMarginRight(int)
	 * @generated
	 */
	boolean isSetMarginRight();

	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * marginTop specifies the number of pixels of vertical margin that will be placed along the top edge of the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #isSetMarginTop()
	 * @see #unsetMarginTop()
	 * @see #setMarginTop(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MarginTop()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='marginTop'"
	 * @generated
	 */
	int getMarginTop();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #isSetMarginTop()
	 * @see #unsetMarginTop()
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarginTop()
	 * @see #getMarginTop()
	 * @see #setMarginTop(int)
	 * @generated
	 */
	void unsetMarginTop();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginTop <em>Margin Top</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Margin Top</em>' attribute is set.
	 * @see #unsetMarginTop()
	 * @see #getMarginTop()
	 * @see #setMarginTop(int)
	 * @generated
	 */
	boolean isSetMarginTop();

	/**
	 * Returns the value of the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * marginWidth specifies the number of pixels of horizontal margin that will be placed along the left and right edges of the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Margin Width</em>' attribute.
	 * @see #isSetMarginWidth()
	 * @see #unsetMarginWidth()
	 * @see #setMarginWidth(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_MarginWidth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='marginWidth'"
	 * @generated
	 */
	int getMarginWidth();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginWidth <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Width</em>' attribute.
	 * @see #isSetMarginWidth()
	 * @see #unsetMarginWidth()
	 * @see #getMarginWidth()
	 * @generated
	 */
	void setMarginWidth(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginWidth <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarginWidth()
	 * @see #getMarginWidth()
	 * @see #setMarginWidth(int)
	 * @generated
	 */
	void unsetMarginWidth();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getMarginWidth <em>Margin Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Margin Width</em>' attribute is set.
	 * @see #unsetMarginWidth()
	 * @see #getMarginWidth()
	 * @see #setMarginWidth(int)
	 * @generated
	 */
	boolean isSetMarginWidth();

	/**
	 * Returns the value of the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numColumns specifies the number of cell columns in the layout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Columns</em>' attribute.
	 * @see #isSetNumColumns()
	 * @see #unsetNumColumns()
	 * @see #setNumColumns(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_NumColumns()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='numColumns'"
	 * @generated
	 */
	int getNumColumns();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getNumColumns <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Columns</em>' attribute.
	 * @see #isSetNumColumns()
	 * @see #unsetNumColumns()
	 * @see #getNumColumns()
	 * @generated
	 */
	void setNumColumns(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getNumColumns <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumColumns()
	 * @see #getNumColumns()
	 * @see #setNumColumns(int)
	 * @generated
	 */
	void unsetNumColumns();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getNumColumns <em>Num Columns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Columns</em>' attribute is set.
	 * @see #unsetNumColumns()
	 * @see #getNumColumns()
	 * @see #setNumColumns(int)
	 * @generated
	 */
	boolean isSetNumColumns();

	/**
	 * Returns the value of the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * verticalSpacing specifies the number of pixels between the bottom edge of one cell and the top edge of its neighbouring cell underneath.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #isSetVerticalSpacing()
	 * @see #unsetVerticalSpacing()
	 * @see #setVerticalSpacing(int)
	 * @see org.cropinformatics.ui.configuration.ConfigurationPackage#getLayout_VerticalSpacing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='verticalSpacing'"
	 * @generated
	 */
	int getVerticalSpacing();

	/**
	 * Sets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getVerticalSpacing <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #isSetVerticalSpacing()
	 * @see #unsetVerticalSpacing()
	 * @see #getVerticalSpacing()
	 * @generated
	 */
	void setVerticalSpacing(int value);

	/**
	 * Unsets the value of the '{@link org.cropinformatics.ui.configuration.Layout#getVerticalSpacing <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalSpacing()
	 * @see #getVerticalSpacing()
	 * @see #setVerticalSpacing(int)
	 * @generated
	 */
	void unsetVerticalSpacing();

	/**
	 * Returns whether the value of the '{@link org.cropinformatics.ui.configuration.Layout#getVerticalSpacing <em>Vertical Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Spacing</em>' attribute is set.
	 * @see #unsetVerticalSpacing()
	 * @see #getVerticalSpacing()
	 * @see #setVerticalSpacing(int)
	 * @generated
	 */
	boolean isSetVerticalSpacing();

} // Layout
