/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple configuration element that can be defined as part of a 
 * 			container configuration
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.ComponentConfiguration#getStyle <em>Style</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ComponentConfiguration#getLabel <em>Label</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ComponentConfiguration#getImage <em>Image</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ComponentConfiguration#isEnclosed <em>Enclosed</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ComponentConfiguration#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.daveneti.ui.configuration.ComponentConfiguration#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration()
 * @model extendedMetaData="name='ComponentConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ComponentConfiguration extends Configuration
{
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(int)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration_Style()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='style'"
	 * @generated
	 */
	int getStyle();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(int value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(int)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(int)
	 * @generated
	 */
	boolean isSetStyle();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='image'"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Enclosed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosed</em>' attribute.
	 * @see #isSetEnclosed()
	 * @see #unsetEnclosed()
	 * @see #setEnclosed(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration_Enclosed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='enclosed'"
	 * @generated
	 */
	boolean isEnclosed();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isEnclosed <em>Enclosed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosed</em>' attribute.
	 * @see #isSetEnclosed()
	 * @see #unsetEnclosed()
	 * @see #isEnclosed()
	 * @generated
	 */
	void setEnclosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isEnclosed <em>Enclosed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnclosed()
	 * @see #isEnclosed()
	 * @see #setEnclosed(boolean)
	 * @generated
	 */
	void unsetEnclosed();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isEnclosed <em>Enclosed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enclosed</em>' attribute is set.
	 * @see #unsetEnclosed()
	 * @see #isEnclosed()
	 * @see #setEnclosed(boolean)
	 * @generated
	 */
	boolean isSetEnclosed();

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #isSetEditable()
	 * @see #unsetEditable()
	 * @see #setEditable(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration_Editable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='editable'"
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isSetEditable()
	 * @see #unsetEditable()
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditable()
	 * @see #isEditable()
	 * @see #setEditable(boolean)
	 * @generated
	 */
	void unsetEditable();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isEditable <em>Editable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Editable</em>' attribute is set.
	 * @see #unsetEditable()
	 * @see #isEditable()
	 * @see #setEditable(boolean)
	 * @generated
	 */
	boolean isSetEditable();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #setMandatory(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getComponentConfiguration_Mandatory()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='mandatory'"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	void unsetMandatory();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.ComponentConfiguration#isMandatory <em>Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mandatory</em>' attribute is set.
	 * @see #unsetMandatory()
	 * @see #isMandatory()
	 * @see #setMandatory(boolean)
	 * @generated
	 */
	boolean isSetMandatory();

} // ComponentConfiguration
