/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.Image;
import org.cropinformatics.ui.configuration.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl#isEnclosed <em>Enclosed</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentConfigurationImpl extends ConfigurationImpl implements ComponentConfiguration
{
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final int STYLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected int style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The default value of the '{@link #isEnclosed() <em>Enclosed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnclosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnclosed() <em>Enclosed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnclosed()
	 * @generated
	 * @ordered
	 */
	protected boolean enclosed = ENCLOSED_EDEFAULT;

	/**
	 * This is true if the Enclosed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enclosedESet;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * This is true if the Editable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean editableESet;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * This is true if the Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConfigurationImpl()
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
		return ConfigurationPackage.Literals.COMPONENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStyle()
	{
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(int newStyle)
	{
		int oldStyle = style;
		style = newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__STYLE, oldStyle, style, !oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle()
	{
		int oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.COMPONENT_CONFIGURATION__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle()
	{
		return styleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs)
	{
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel)
	{
		if (newLabel != label)
		{
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage()
	{
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs)
	{
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage)
	{
		if (newImage != image)
		{
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnclosed()
	{
		return enclosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosed(boolean newEnclosed)
	{
		boolean oldEnclosed = enclosed;
		enclosed = newEnclosed;
		boolean oldEnclosedESet = enclosedESet;
		enclosedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__ENCLOSED, oldEnclosed, enclosed, !oldEnclosedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnclosed()
	{
		boolean oldEnclosed = enclosed;
		boolean oldEnclosedESet = enclosedESet;
		enclosed = ENCLOSED_EDEFAULT;
		enclosedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.COMPONENT_CONFIGURATION__ENCLOSED, oldEnclosed, ENCLOSED_EDEFAULT, oldEnclosedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnclosed()
	{
		return enclosedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable()
	{
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable)
	{
		boolean oldEditable = editable;
		editable = newEditable;
		boolean oldEditableESet = editableESet;
		editableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__EDITABLE, oldEditable, editable, !oldEditableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEditable()
	{
		boolean oldEditable = editable;
		boolean oldEditableESet = editableESet;
		editable = EDITABLE_EDEFAULT;
		editableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.COMPONENT_CONFIGURATION__EDITABLE, oldEditable, EDITABLE_EDEFAULT, oldEditableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEditable()
	{
		return editableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory()
	{
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory)
	{
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__MANDATORY, oldMandatory, mandatory, !oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMandatory()
	{
		boolean oldMandatory = mandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatory = MANDATORY_EDEFAULT;
		mandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.COMPONENT_CONFIGURATION__MANDATORY, oldMandatory, MANDATORY_EDEFAULT, oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMandatory()
	{
		return mandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL:
				return basicSetLabel(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE:
				return basicSetImage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ConfigurationPackage.COMPONENT_CONFIGURATION__STYLE:
				return getStyle();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL:
				return getLabel();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE:
				return getImage();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENCLOSED:
				return isEnclosed();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__EDITABLE:
				return isEditable();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__MANDATORY:
				return isMandatory();
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
			case ConfigurationPackage.COMPONENT_CONFIGURATION__STYLE:
				setStyle((Integer)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL:
				setLabel((Label)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE:
				setImage((Image)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENCLOSED:
				setEnclosed((Boolean)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__MANDATORY:
				setMandatory((Boolean)newValue);
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
			case ConfigurationPackage.COMPONENT_CONFIGURATION__STYLE:
				unsetStyle();
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL:
				setLabel((Label)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE:
				setImage((Image)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENCLOSED:
				unsetEnclosed();
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__EDITABLE:
				unsetEditable();
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__MANDATORY:
				unsetMandatory();
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
			case ConfigurationPackage.COMPONENT_CONFIGURATION__STYLE:
				return isSetStyle();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LABEL:
				return label != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__IMAGE:
				return image != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENCLOSED:
				return isSetEnclosed();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__EDITABLE:
				return isSetEditable();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__MANDATORY:
				return isSetMandatory();
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
		result.append(" (style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(", enclosed: ");
		if (enclosedESet) result.append(enclosed); else result.append("<unset>");
		result.append(", editable: ");
		if (editableESet) result.append(editable); else result.append("<unset>");
		result.append(", mandatory: ");
		if (mandatoryESet) result.append(mandatory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComponentConfigurationImpl
