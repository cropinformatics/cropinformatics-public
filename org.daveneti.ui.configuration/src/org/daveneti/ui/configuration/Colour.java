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
 * A representation of the model object '<em><b>Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an RGBA colour
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.Colour#getRed <em>Red</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.Colour#getGreen <em>Green</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.Colour#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getColour()
 * @model extendedMetaData="name='Colour' kind='elementOnly'"
 * @generated
 */
public interface Colour extends EObject
{
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #setRed(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getColour_Red()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='red'"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.Colour#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.Colour#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRed()
	 * @see #getRed()
	 * @see #setRed(int)
	 * @generated
	 */
	void unsetRed();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.Colour#getRed <em>Red</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red</em>' attribute is set.
	 * @see #unsetRed()
	 * @see #getRed()
	 * @see #setRed(int)
	 * @generated
	 */
	boolean isSetRed();

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #setGreen(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getColour_Green()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='green'"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.Colour#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.Colour#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGreen()
	 * @see #getGreen()
	 * @see #setGreen(int)
	 * @generated
	 */
	void unsetGreen();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.Colour#getGreen <em>Green</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Green</em>' attribute is set.
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @see #setGreen(int)
	 * @generated
	 */
	boolean isSetGreen();

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #setBlue(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getColour_Blue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='blue'"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.Colour#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.Colour#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlue()
	 * @see #getBlue()
	 * @see #setBlue(int)
	 * @generated
	 */
	void unsetBlue();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.Colour#getBlue <em>Blue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blue</em>' attribute is set.
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @see #setBlue(int)
	 * @generated
	 */
	boolean isSetBlue();

} // Colour
