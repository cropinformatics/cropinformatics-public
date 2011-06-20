/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This XML Schema specifies an XML format for definition of Configurable GUI components
 * 		Start exploring this schema by the root element which is the 'ConfigurationList' element.
 *       
 * <!-- end-model-doc -->
 * @see org.cropinformatics.ui.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cropinformatics.org/ui/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ColourImpl <em>Colour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ColourImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR__RED = 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR__GREEN = 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR__BLUE = 2;

	/**
	 * The number of structural features of the '<em>Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__EXTENDS = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VISIBLE = 3;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENABLED = 4;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__HELP_CONTEXT_ID = 5;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PLUGIN_ID = 7;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl <em>Component Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getComponentConfiguration()
	 * @generated
	 */
	int COMPONENT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__NAME = CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__EXTENDS = CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__VISIBLE = CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__HELP_CONTEXT_ID = CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__CLASS_NAME = CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__PLUGIN_ID = CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__STYLE = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__LABEL = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__IMAGE = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ENCLOSED = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__EDITABLE = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__MANDATORY = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ConfigurationListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationListTypeImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getConfigurationListType()
	 * @generated
	 */
	int CONFIGURATION_LIST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_LIST_TYPE__CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl <em>Control Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getControlConfiguration()
	 * @generated
	 */
	int CONTROL_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__ID = COMPONENT_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__NAME = COMPONENT_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__EXTENDS = COMPONENT_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__VISIBLE = COMPONENT_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__ENABLED = COMPONENT_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__HELP_CONTEXT_ID = COMPONENT_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__CLASS_NAME = COMPONENT_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__PLUGIN_ID = COMPONENT_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__STYLE = COMPONENT_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__LABEL = COMPONENT_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__IMAGE = COMPONENT_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__ENCLOSED = COMPONENT_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__EDITABLE = COMPONENT_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__MANDATORY = COMPONENT_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__LAYOUT_DATA = COMPONENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__FOREGROUND = COMPONENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION__BACKGROUND = COMPONENT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONFIGURATION_FEATURE_COUNT = COMPONENT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ContainerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getContainerConfiguration()
	 * @generated
	 */
	int CONTAINER_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__ID = CONTROL_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__NAME = CONTROL_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__EXTENDS = CONTROL_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__VISIBLE = CONTROL_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__ENABLED = CONTROL_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__HELP_CONTEXT_ID = CONTROL_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__CLASS_NAME = CONTROL_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__PLUGIN_ID = CONTROL_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__STYLE = CONTROL_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__LABEL = CONTROL_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__IMAGE = CONTROL_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__ENCLOSED = CONTROL_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__EDITABLE = CONTROL_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__MANDATORY = CONTROL_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__LAYOUT_DATA = CONTROL_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__FOREGROUND = CONTROL_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__BACKGROUND = CONTROL_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__LAYOUT = CONTROL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__COMPONENTS = CONTROL_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION_FEATURE_COUNT = CONTROL_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.PathElementImpl <em>Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.PathElementImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPathElement()
	 * @generated
	 */
	int PATH_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ControlPathElementImpl <em>Control Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ControlPathElementImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getControlPathElement()
	 * @generated
	 */
	int CONTROL_PATH_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_ELEMENT__ID = PATH_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Condition Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_ELEMENT__CONDITION_PROPERTY = PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID = PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_ELEMENT__DEFAULT_VALUE = PATH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_ELEMENT__SUB_PATHS = PATH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_ELEMENT_FEATURE_COUNT = PATH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.CTabFolderConfigurationImpl <em>CTab Folder Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.CTabFolderConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getCTabFolderConfiguration()
	 * @generated
	 */
	int CTAB_FOLDER_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__ID = CONTAINER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__NAME = CONTAINER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__EXTENDS = CONTAINER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__VISIBLE = CONTAINER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__ENABLED = CONTAINER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__HELP_CONTEXT_ID = CONTAINER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__CLASS_NAME = CONTAINER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__PLUGIN_ID = CONTAINER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__STYLE = CONTAINER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__LABEL = CONTAINER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__IMAGE = CONTAINER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__ENCLOSED = CONTAINER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__EDITABLE = CONTAINER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__MANDATORY = CONTAINER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__LAYOUT_DATA = CONTAINER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__FOREGROUND = CONTAINER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__BACKGROUND = CONTAINER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__LAYOUT = CONTAINER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__COMPONENTS = CONTAINER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Tab Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION__TAB_POSITION = CONTAINER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CTab Folder Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTAB_FOLDER_CONFIGURATION_FEATURE_COUNT = CONTAINER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.DialogConfigurationImpl <em>Dialog Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.DialogConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getDialogConfiguration()
	 * @generated
	 */
	int DIALOG_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__NAME = CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__EXTENDS = CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__VISIBLE = CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__HELP_CONTEXT_ID = CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__CLASS_NAME = CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__PLUGIN_ID = CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__CONTROL = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION__RESIZABLE = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dialog Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.DocumentRootImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Configuration List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIGURATION_LIST = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.PartConfigurationImpl <em>Part Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.PartConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPartConfiguration()
	 * @generated
	 */
	int PART_CONFIGURATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__NAME = CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__EXTENDS = CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__VISIBLE = CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__HELP_CONTEXT_ID = CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__CLASS_NAME = CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__PLUGIN_ID = CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION__CONTROL = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.EditorConfigurationImpl <em>Editor Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.EditorConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getEditorConfiguration()
	 * @generated
	 */
	int EDITOR_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__ID = PART_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__NAME = PART_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__EXTENDS = PART_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__VISIBLE = PART_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__ENABLED = PART_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__HELP_CONTEXT_ID = PART_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__CLASS_NAME = PART_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__PLUGIN_ID = PART_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION__CONTROL = PART_CONFIGURATION__CONTROL;

	/**
	 * The number of structural features of the '<em>Editor Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CONFIGURATION_FEATURE_COUNT = PART_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ExpandBarConfigurationImpl <em>Expand Bar Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ExpandBarConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getExpandBarConfiguration()
	 * @generated
	 */
	int EXPAND_BAR_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__ID = CONTAINER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__NAME = CONTAINER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__EXTENDS = CONTAINER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__VISIBLE = CONTAINER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__ENABLED = CONTAINER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__HELP_CONTEXT_ID = CONTAINER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__CLASS_NAME = CONTAINER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__PLUGIN_ID = CONTAINER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__STYLE = CONTAINER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__LABEL = CONTAINER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__IMAGE = CONTAINER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__ENCLOSED = CONTAINER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__EDITABLE = CONTAINER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__MANDATORY = CONTAINER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__LAYOUT_DATA = CONTAINER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__FOREGROUND = CONTAINER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__BACKGROUND = CONTAINER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__LAYOUT = CONTAINER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION__COMPONENTS = CONTAINER_CONFIGURATION__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Expand Bar Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_BAR_CONFIGURATION_FEATURE_COUNT = CONTAINER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ImageImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__KEY = 1;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PLUGIN_ID = 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.LabelImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__KEY = 1;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PLUGIN_ID = 2;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.LayoutImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 14;

	/**
	 * The feature id for the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HORIZONTAL_SPACING = 0;

	/**
	 * The feature id for the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN_BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN_HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN_RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN_TOP = 6;

	/**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGIN_WIDTH = 7;

	/**
	 * The feature id for the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NUM_COLUMNS = 8;

	/**
	 * The feature id for the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VERTICAL_SPACING = 9;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl <em>Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.LayoutDataImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getLayoutData()
	 * @generated
	 */
	int LAYOUT_DATA = 15;

	/**
	 * The feature id for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Height Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__HEIGHT_HINT = 2;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__HORIZONTAL_ALIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__HORIZONTAL_INDENT = 4;

	/**
	 * The feature id for the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__HORIZONTAL_SPAN = 5;

	/**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__MINIMUM_HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__MINIMUM_WIDTH = 7;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__VERTICAL_ALIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Vertical Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__VERTICAL_INDENT = 9;

	/**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__VERTICAL_SPAN = 10;

	/**
	 * The feature id for the '<em><b>Width Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__WIDTH_HINT = 11;

	/**
	 * The number of structural features of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ViewerConfigurationImpl <em>Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getViewerConfiguration()
	 * @generated
	 */
	int VIEWER_CONFIGURATION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__ID = CONTAINER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__NAME = CONTAINER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__EXTENDS = CONTAINER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__VISIBLE = CONTAINER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__ENABLED = CONTAINER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__HELP_CONTEXT_ID = CONTAINER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__CLASS_NAME = CONTAINER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__PLUGIN_ID = CONTAINER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__STYLE = CONTAINER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__LABEL = CONTAINER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__IMAGE = CONTAINER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__ENCLOSED = CONTAINER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__EDITABLE = CONTAINER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__MANDATORY = CONTAINER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__LAYOUT_DATA = CONTAINER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__FOREGROUND = CONTAINER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__BACKGROUND = CONTAINER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__LAYOUT = CONTAINER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION__COMPONENTS = CONTAINER_CONFIGURATION__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWER_CONFIGURATION_FEATURE_COUNT = CONTAINER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl <em>List Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getListViewerConfiguration()
	 * @generated
	 */
	int LIST_VIEWER_CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__ID = VIEWER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__NAME = VIEWER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__EXTENDS = VIEWER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__VISIBLE = VIEWER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__ENABLED = VIEWER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__HELP_CONTEXT_ID = VIEWER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__CLASS_NAME = VIEWER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__PLUGIN_ID = VIEWER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__STYLE = VIEWER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__LABEL = VIEWER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__IMAGE = VIEWER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__ENCLOSED = VIEWER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__EDITABLE = VIEWER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__MANDATORY = VIEWER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__LAYOUT_DATA = VIEWER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__FOREGROUND = VIEWER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__BACKGROUND = VIEWER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__LAYOUT = VIEWER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__COMPONENTS = VIEWER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Multiple Selection In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Check In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duplicate Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED = VIEWER_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check Selection In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Threading In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__THREADING_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Copy Items In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Virtual In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mantaining Selection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE = VIEWER_CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mantaining Checked State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE = VIEWER_CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>List Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEWER_CONFIGURATION_FEATURE_COUNT = VIEWER_CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl <em>Mapping Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getMappingViewerConfiguration()
	 * @generated
	 */
	int MAPPING_VIEWER_CONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__ID = VIEWER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__NAME = VIEWER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__EXTENDS = VIEWER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__VISIBLE = VIEWER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__ENABLED = VIEWER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__HELP_CONTEXT_ID = VIEWER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__CLASS_NAME = VIEWER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__PLUGIN_ID = VIEWER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__STYLE = VIEWER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__LABEL = VIEWER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__IMAGE = VIEWER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__ENCLOSED = VIEWER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__EDITABLE = VIEWER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__MANDATORY = VIEWER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__LAYOUT_DATA = VIEWER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__FOREGROUND = VIEWER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__BACKGROUND = VIEWER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__LAYOUT = VIEWER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__COMPONENTS = VIEWER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>From Item Removed When Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED = VIEWER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Item Added When Unmapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED = VIEWER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Item Removed When Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED = VIEWER_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Item Added When Unmapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED = VIEWER_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mapping Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_VIEWER_CONFIGURATION_FEATURE_COUNT = VIEWER_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.MatrixViewerConfigurationImpl <em>Matrix Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.MatrixViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getMatrixViewerConfiguration()
	 * @generated
	 */
	int MATRIX_VIEWER_CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__ID = VIEWER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__NAME = VIEWER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__EXTENDS = VIEWER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__VISIBLE = VIEWER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__ENABLED = VIEWER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__HELP_CONTEXT_ID = VIEWER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__CLASS_NAME = VIEWER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__PLUGIN_ID = VIEWER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__STYLE = VIEWER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__LABEL = VIEWER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__IMAGE = VIEWER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__ENCLOSED = VIEWER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__EDITABLE = VIEWER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__MANDATORY = VIEWER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__LAYOUT_DATA = VIEWER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__FOREGROUND = VIEWER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__BACKGROUND = VIEWER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__LAYOUT = VIEWER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__COMPONENTS = VIEWER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Cell Selection In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE = VIEWER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matrix Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_VIEWER_CONFIGURATION_FEATURE_COUNT = VIEWER_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.MultipleListViewerConfigurationImpl <em>Multiple List Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.MultipleListViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getMultipleListViewerConfiguration()
	 * @generated
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__ID = VIEWER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__NAME = VIEWER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__EXTENDS = VIEWER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__VISIBLE = VIEWER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__ENABLED = VIEWER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__HELP_CONTEXT_ID = VIEWER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__CLASS_NAME = VIEWER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__PLUGIN_ID = VIEWER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__STYLE = VIEWER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__LABEL = VIEWER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__IMAGE = VIEWER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__ENCLOSED = VIEWER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__EDITABLE = VIEWER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__MANDATORY = VIEWER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__LAYOUT_DATA = VIEWER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__FOREGROUND = VIEWER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__BACKGROUND = VIEWER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__LAYOUT = VIEWER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__COMPONENTS = VIEWER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION = VIEWER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threading In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple List Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_LIST_VIEWER_CONFIGURATION_FEATURE_COUNT = VIEWER_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.PagePathElementImpl <em>Page Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.PagePathElementImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPagePathElement()
	 * @generated
	 */
	int PAGE_PATH_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PATH_ELEMENT__ID = PATH_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PATH_ELEMENT__PAGE_ID = PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PATH_ELEMENT_FEATURE_COUNT = PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.PerspectiveConfigurationImpl <em>Perspective Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.PerspectiveConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPerspectiveConfiguration()
	 * @generated
	 */
	int PERSPECTIVE_CONFIGURATION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__ID = PART_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__NAME = PART_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__EXTENDS = PART_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__VISIBLE = PART_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__ENABLED = PART_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__HELP_CONTEXT_ID = PART_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__CLASS_NAME = PART_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__PLUGIN_ID = PART_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION__CONTROL = PART_CONFIGURATION__CONTROL;

	/**
	 * The number of structural features of the '<em>Perspective Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_CONFIGURATION_FEATURE_COUNT = PART_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.QueryResultViewerConfigurationImpl <em>Query Result Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.QueryResultViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getQueryResultViewerConfiguration()
	 * @generated
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__ID = VIEWER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__NAME = VIEWER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__EXTENDS = VIEWER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__VISIBLE = VIEWER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__ENABLED = VIEWER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__HELP_CONTEXT_ID = VIEWER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__CLASS_NAME = VIEWER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__PLUGIN_ID = VIEWER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__STYLE = VIEWER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__LABEL = VIEWER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__IMAGE = VIEWER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__ENCLOSED = VIEWER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__EDITABLE = VIEWER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__MANDATORY = VIEWER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__LAYOUT_DATA = VIEWER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__FOREGROUND = VIEWER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__BACKGROUND = VIEWER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__LAYOUT = VIEWER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__COMPONENTS = VIEWER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Running Query On First Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE = VIEWER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Result Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_VIEWER_CONFIGURATION_FEATURE_COUNT = VIEWER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.SubPathImpl <em>Sub Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.SubPathImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getSubPath()
	 * @generated
	 */
	int SUB_PATH = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PATH__ID = 0;

	/**
	 * The feature id for the '<em><b>Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PATH__CONDITION_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PATH__PATH = 2;

	/**
	 * The number of structural features of the '<em>Sub Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PATH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.TabFolderConfigurationImpl <em>Tab Folder Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.TabFolderConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getTabFolderConfiguration()
	 * @generated
	 */
	int TAB_FOLDER_CONFIGURATION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__ID = CONTAINER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__NAME = CONTAINER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__EXTENDS = CONTAINER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__VISIBLE = CONTAINER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__ENABLED = CONTAINER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__HELP_CONTEXT_ID = CONTAINER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__CLASS_NAME = CONTAINER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__PLUGIN_ID = CONTAINER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__STYLE = CONTAINER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__LABEL = CONTAINER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__IMAGE = CONTAINER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__ENCLOSED = CONTAINER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__EDITABLE = CONTAINER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__MANDATORY = CONTAINER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__LAYOUT_DATA = CONTAINER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__FOREGROUND = CONTAINER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__BACKGROUND = CONTAINER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__LAYOUT = CONTAINER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION__COMPONENTS = CONTAINER_CONFIGURATION__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Tab Folder Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER_CONFIGURATION_FEATURE_COUNT = CONTAINER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.TwinViewerConfigurationImpl <em>Twin Viewer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.TwinViewerConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getTwinViewerConfiguration()
	 * @generated
	 */
	int TWIN_VIEWER_CONFIGURATION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ID = VIEWER_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__NAME = VIEWER_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__EXTENDS = VIEWER_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__VISIBLE = VIEWER_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ENABLED = VIEWER_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__HELP_CONTEXT_ID = VIEWER_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__CLASS_NAME = VIEWER_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__PLUGIN_ID = VIEWER_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__STYLE = VIEWER_CONFIGURATION__STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__LABEL = VIEWER_CONFIGURATION__LABEL;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__IMAGE = VIEWER_CONFIGURATION__IMAGE;

	/**
	 * The feature id for the '<em><b>Enclosed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ENCLOSED = VIEWER_CONFIGURATION__ENCLOSED;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__EDITABLE = VIEWER_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__MANDATORY = VIEWER_CONFIGURATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__LAYOUT_DATA = VIEWER_CONFIGURATION__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__FOREGROUND = VIEWER_CONFIGURATION__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__BACKGROUND = VIEWER_CONFIGURATION__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__LAYOUT = VIEWER_CONFIGURATION__LAYOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__COMPONENTS = VIEWER_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Item Added Left To Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT = VIEWER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Added Right To Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT = VIEWER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Removed Left To Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT = VIEWER_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Removed Right To Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT = VIEWER_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duplicate Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED = VIEWER_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Twin Viewer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIN_VIEWER_CONFIGURATION_FEATURE_COUNT = VIEWER_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.ViewConfigurationImpl <em>View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.ViewConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getViewConfiguration()
	 * @generated
	 */
	int VIEW_CONFIGURATION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__ID = PART_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__NAME = PART_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__EXTENDS = PART_CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__VISIBLE = PART_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__ENABLED = PART_CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__HELP_CONTEXT_ID = PART_CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__CLASS_NAME = PART_CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__PLUGIN_ID = PART_CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__CONTROL = PART_CONFIGURATION__CONTROL;

	/**
	 * The number of structural features of the '<em>View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION_FEATURE_COUNT = PART_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.WizardConfigurationImpl <em>Wizard Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.WizardConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getWizardConfiguration()
	 * @generated
	 */
	int WIZARD_CONFIGURATION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__NAME = CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__EXTENDS = CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__VISIBLE = CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__HELP_CONTEXT_ID = CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__CLASS_NAME = CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__PLUGIN_ID = CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__PAGES = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION__PATH = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wizard Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cropinformatics.ui.configuration.impl.WizardPageConfigurationImpl <em>Wizard Page Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cropinformatics.ui.configuration.impl.WizardPageConfigurationImpl
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getWizardPageConfiguration()
	 * @generated
	 */
	int WIZARD_PAGE_CONFIGURATION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__NAME = CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__EXTENDS = CONFIGURATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__VISIBLE = CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__ENABLED = CONFIGURATION__ENABLED;

	/**
	 * The feature id for the '<em><b>Help Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__HELP_CONTEXT_ID = CONFIGURATION__HELP_CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__CLASS_NAME = CONFIGURATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__PLUGIN_ID = CONFIGURATION__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION__CONTROL = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wizard Page Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Non Empty String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getNonEmptyString()
	 * @generated
	 */
	int NON_EMPTY_STRING = 32;


	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colour</em>'.
	 * @see org.cropinformatics.ui.configuration.Colour
	 * @generated
	 */
	EClass getColour();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Colour#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.cropinformatics.ui.configuration.Colour#getRed()
	 * @see #getColour()
	 * @generated
	 */
	EAttribute getColour_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Colour#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.cropinformatics.ui.configuration.Colour#getGreen()
	 * @see #getColour()
	 * @generated
	 */
	EAttribute getColour_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Colour#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.cropinformatics.ui.configuration.Colour#getBlue()
	 * @see #getColour()
	 * @generated
	 */
	EAttribute getColour_Blue();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ComponentConfiguration <em>Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration
	 * @generated
	 */
	EClass getComponentConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ComponentConfiguration#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration#getStyle()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_Style();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.ComponentConfiguration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration#getLabel()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.ComponentConfiguration#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration#getImage()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ComponentConfiguration#isEnclosed <em>Enclosed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enclosed</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration#isEnclosed()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_Enclosed();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ComponentConfiguration#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration#isEditable()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ComponentConfiguration#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.cropinformatics.ui.configuration.ComponentConfiguration#isMandatory()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_Mandatory();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#getId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#getExtends()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#isVisible()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#isEnabled()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#getHelpContextId <em>Help Context Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Context Id</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#getHelpContextId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_HelpContextId();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#getClassName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Configuration#getPluginId <em>Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Id</em>'.
	 * @see org.cropinformatics.ui.configuration.Configuration#getPluginId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_PluginId();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ConfigurationListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see org.cropinformatics.ui.configuration.ConfigurationListType
	 * @generated
	 */
	EClass getConfigurationListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.ConfigurationListType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ConfigurationListType#getConfiguration()
	 * @see #getConfigurationListType()
	 * @generated
	 */
	EReference getConfigurationListType_Configuration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ContainerConfiguration <em>Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ContainerConfiguration
	 * @generated
	 */
	EClass getContainerConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.ContainerConfiguration#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.cropinformatics.ui.configuration.ContainerConfiguration#getLayout()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EReference getContainerConfiguration_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.ContainerConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.cropinformatics.ui.configuration.ContainerConfiguration#getComponents()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EReference getContainerConfiguration_Components();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ControlConfiguration <em>Control Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlConfiguration
	 * @generated
	 */
	EClass getControlConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.ControlConfiguration#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlConfiguration#getLayoutData()
	 * @see #getControlConfiguration()
	 * @generated
	 */
	EReference getControlConfiguration_LayoutData();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.ControlConfiguration#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlConfiguration#getForeground()
	 * @see #getControlConfiguration()
	 * @generated
	 */
	EReference getControlConfiguration_Foreground();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.ControlConfiguration#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlConfiguration#getBackground()
	 * @see #getControlConfiguration()
	 * @generated
	 */
	EReference getControlConfiguration_Background();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ControlPathElement <em>Control Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Path Element</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlPathElement
	 * @generated
	 */
	EClass getControlPathElement();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ControlPathElement#getConditionProperty <em>Condition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Property</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlPathElement#getConditionProperty()
	 * @see #getControlPathElement()
	 * @generated
	 */
	EAttribute getControlPathElement_ConditionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ControlPathElement#getConditionPageId <em>Condition Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Page Id</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlPathElement#getConditionPageId()
	 * @see #getControlPathElement()
	 * @generated
	 */
	EAttribute getControlPathElement_ConditionPageId();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ControlPathElement#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlPathElement#getDefaultValue()
	 * @see #getControlPathElement()
	 * @generated
	 */
	EAttribute getControlPathElement_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.ControlPathElement#getSubPaths <em>Sub Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Paths</em>'.
	 * @see org.cropinformatics.ui.configuration.ControlPathElement#getSubPaths()
	 * @see #getControlPathElement()
	 * @generated
	 */
	EReference getControlPathElement_SubPaths();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.CTabFolderConfiguration <em>CTab Folder Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTab Folder Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.CTabFolderConfiguration
	 * @generated
	 */
	EClass getCTabFolderConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.CTabFolderConfiguration#getTabPosition <em>Tab Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Position</em>'.
	 * @see org.cropinformatics.ui.configuration.CTabFolderConfiguration#getTabPosition()
	 * @see #getCTabFolderConfiguration()
	 * @generated
	 */
	EAttribute getCTabFolderConfiguration_TabPosition();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.DialogConfiguration <em>Dialog Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.DialogConfiguration
	 * @generated
	 */
	EClass getDialogConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.DialogConfiguration#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.cropinformatics.ui.configuration.DialogConfiguration#getControl()
	 * @see #getDialogConfiguration()
	 * @generated
	 */
	EReference getDialogConfiguration_Control();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.DialogConfiguration#isResizable <em>Resizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resizable</em>'.
	 * @see org.cropinformatics.ui.configuration.DialogConfiguration#isResizable()
	 * @see #getDialogConfiguration()
	 * @generated
	 */
	EAttribute getDialogConfiguration_Resizable();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.cropinformatics.ui.configuration.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.cropinformatics.ui.configuration.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.cropinformatics.ui.configuration.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.cropinformatics.ui.configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.cropinformatics.ui.configuration.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.cropinformatics.ui.configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.cropinformatics.ui.configuration.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.DocumentRoot#getConfigurationList <em>Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration List</em>'.
	 * @see org.cropinformatics.ui.configuration.DocumentRoot#getConfigurationList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigurationList();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.EditorConfiguration <em>Editor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.EditorConfiguration
	 * @generated
	 */
	EClass getEditorConfiguration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ExpandBarConfiguration <em>Expand Bar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expand Bar Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ExpandBarConfiguration
	 * @generated
	 */
	EClass getExpandBarConfiguration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.cropinformatics.ui.configuration.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.cropinformatics.ui.configuration.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Image#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.cropinformatics.ui.configuration.Image#getKey()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Image#getPluginId <em>Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Id</em>'.
	 * @see org.cropinformatics.ui.configuration.Image#getPluginId()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_PluginId();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.cropinformatics.ui.configuration.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Label#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cropinformatics.ui.configuration.Label#getValue()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Label#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.cropinformatics.ui.configuration.Label#getKey()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Label#getPluginId <em>Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Id</em>'.
	 * @see org.cropinformatics.ui.configuration.Label#getPluginId()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_PluginId();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getHorizontalSpacing <em>Horizontal Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Spacing</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getHorizontalSpacing()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_HorizontalSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make Columns Equal Width</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#isMakeColumnsEqualWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MakeColumnsEqualWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getMarginBottom()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MarginBottom();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getMarginHeight <em>Margin Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Height</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getMarginHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MarginHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getMarginLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MarginLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getMarginRight()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MarginRight();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getMarginTop()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MarginTop();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getMarginWidth <em>Margin Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Width</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getMarginWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_MarginWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getNumColumns <em>Num Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Columns</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getNumColumns()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_NumColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.Layout#getVerticalSpacing <em>Vertical Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Spacing</em>'.
	 * @see org.cropinformatics.ui.configuration.Layout#getVerticalSpacing()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_VerticalSpacing();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Data</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData
	 * @generated
	 */
	EClass getLayoutData();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Horizontal Space</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#isGrabExcessHorizontalSpace()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_GrabExcessHorizontalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Vertical Space</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#isGrabExcessVerticalSpace()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_GrabExcessVerticalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getHeightHint <em>Height Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Hint</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getHeightHint()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_HeightHint();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getHorizontalAlignment()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getHorizontalIndent <em>Horizontal Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Indent</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getHorizontalIndent()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_HorizontalIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getHorizontalSpan <em>Horizontal Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Span</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getHorizontalSpan()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_HorizontalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getMinimumHeight <em>Minimum Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Height</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getMinimumHeight()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_MinimumHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getMinimumWidth <em>Minimum Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Width</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getMinimumWidth()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_MinimumWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getVerticalAlignment()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getVerticalIndent <em>Vertical Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Indent</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getVerticalIndent()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_VerticalIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getVerticalSpan()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_VerticalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.LayoutData#getWidthHint <em>Width Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Hint</em>'.
	 * @see org.cropinformatics.ui.configuration.LayoutData#getWidthHint()
	 * @see #getLayoutData()
	 * @generated
	 */
	EAttribute getLayoutData_WidthHint();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration <em>List Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration
	 * @generated
	 */
	EClass getListViewerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleSelectionInUse <em>Multiple Selection In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Selection In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleSelectionInUse()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_MultipleSelectionInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleCheckInUse <em>Multiple Check In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Check In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isMultipleCheckInUse()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_MultipleCheckInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duplicate Allowed</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isDuplicateAllowed()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_DuplicateAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCheckSelectionInUse <em>Check Selection In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Selection In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isCheckSelectionInUse()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_CheckSelectionInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threading In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isThreadingInUse()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_ThreadingInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isCopyItemsInUse <em>Copy Items In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Items In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isCopyItemsInUse()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_CopyItemsInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isVirtualInUse <em>Virtual In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isVirtualInUse()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_VirtualInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingSelectionState <em>Mantaining Selection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mantaining Selection State</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingSelectionState()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_MantainingSelectionState();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingCheckedState <em>Mantaining Checked State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mantaining Checked State</em>'.
	 * @see org.cropinformatics.ui.configuration.ListViewerConfiguration#isMantainingCheckedState()
	 * @see #getListViewerConfiguration()
	 * @generated
	 */
	EAttribute getListViewerConfiguration_MantainingCheckedState();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.MappingViewerConfiguration <em>Mapping Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.MappingViewerConfiguration
	 * @generated
	 */
	EClass getMappingViewerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MappingViewerConfiguration#isFromItemRemovedWhenMapped <em>From Item Removed When Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Item Removed When Mapped</em>'.
	 * @see org.cropinformatics.ui.configuration.MappingViewerConfiguration#isFromItemRemovedWhenMapped()
	 * @see #getMappingViewerConfiguration()
	 * @generated
	 */
	EAttribute getMappingViewerConfiguration_FromItemRemovedWhenMapped();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MappingViewerConfiguration#isFromItemAddedWhenUnmapped <em>From Item Added When Unmapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Item Added When Unmapped</em>'.
	 * @see org.cropinformatics.ui.configuration.MappingViewerConfiguration#isFromItemAddedWhenUnmapped()
	 * @see #getMappingViewerConfiguration()
	 * @generated
	 */
	EAttribute getMappingViewerConfiguration_FromItemAddedWhenUnmapped();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MappingViewerConfiguration#isToItemRemovedWhenMapped <em>To Item Removed When Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Item Removed When Mapped</em>'.
	 * @see org.cropinformatics.ui.configuration.MappingViewerConfiguration#isToItemRemovedWhenMapped()
	 * @see #getMappingViewerConfiguration()
	 * @generated
	 */
	EAttribute getMappingViewerConfiguration_ToItemRemovedWhenMapped();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MappingViewerConfiguration#isToItemAddedWhenUnmapped <em>To Item Added When Unmapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Item Added When Unmapped</em>'.
	 * @see org.cropinformatics.ui.configuration.MappingViewerConfiguration#isToItemAddedWhenUnmapped()
	 * @see #getMappingViewerConfiguration()
	 * @generated
	 */
	EAttribute getMappingViewerConfiguration_ToItemAddedWhenUnmapped();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.MatrixViewerConfiguration <em>Matrix Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.MatrixViewerConfiguration
	 * @generated
	 */
	EClass getMatrixViewerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MatrixViewerConfiguration#isCellSelectionInUse <em>Cell Selection In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Selection In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.MatrixViewerConfiguration#isCellSelectionInUse()
	 * @see #getMatrixViewerConfiguration()
	 * @generated
	 */
	EAttribute getMatrixViewerConfiguration_CellSelectionInUse();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MatrixViewerConfiguration#isLinesVisible <em>Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines Visible</em>'.
	 * @see org.cropinformatics.ui.configuration.MatrixViewerConfiguration#isLinesVisible()
	 * @see #getMatrixViewerConfiguration()
	 * @generated
	 */
	EAttribute getMatrixViewerConfiguration_LinesVisible();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.MultipleListViewerConfiguration <em>Multiple List Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple List Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.MultipleListViewerConfiguration
	 * @generated
	 */
	EClass getMultipleListViewerConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.MultipleListViewerConfiguration#getChildConfiguration <em>Child Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.MultipleListViewerConfiguration#getChildConfiguration()
	 * @see #getMultipleListViewerConfiguration()
	 * @generated
	 */
	EReference getMultipleListViewerConfiguration_ChildConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.MultipleListViewerConfiguration#isThreadingInUse <em>Threading In Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threading In Use</em>'.
	 * @see org.cropinformatics.ui.configuration.MultipleListViewerConfiguration#isThreadingInUse()
	 * @see #getMultipleListViewerConfiguration()
	 * @generated
	 */
	EAttribute getMultipleListViewerConfiguration_ThreadingInUse();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.PagePathElement <em>Page Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Path Element</em>'.
	 * @see org.cropinformatics.ui.configuration.PagePathElement
	 * @generated
	 */
	EClass getPagePathElement();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.PagePathElement#getPageId <em>Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Id</em>'.
	 * @see org.cropinformatics.ui.configuration.PagePathElement#getPageId()
	 * @see #getPagePathElement()
	 * @generated
	 */
	EAttribute getPagePathElement_PageId();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.PartConfiguration <em>Part Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.PartConfiguration
	 * @generated
	 */
	EClass getPartConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.PartConfiguration#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.cropinformatics.ui.configuration.PartConfiguration#getControl()
	 * @see #getPartConfiguration()
	 * @generated
	 */
	EReference getPartConfiguration_Control();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.PathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Element</em>'.
	 * @see org.cropinformatics.ui.configuration.PathElement
	 * @generated
	 */
	EClass getPathElement();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.PathElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.ui.configuration.PathElement#getId()
	 * @see #getPathElement()
	 * @generated
	 */
	EAttribute getPathElement_Id();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.PerspectiveConfiguration <em>Perspective Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.PerspectiveConfiguration
	 * @generated
	 */
	EClass getPerspectiveConfiguration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.QueryResultViewerConfiguration <em>Query Result Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Result Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.QueryResultViewerConfiguration
	 * @generated
	 */
	EClass getQueryResultViewerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.QueryResultViewerConfiguration#isRunningQueryOnFirstUse <em>Running Query On First Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Query On First Use</em>'.
	 * @see org.cropinformatics.ui.configuration.QueryResultViewerConfiguration#isRunningQueryOnFirstUse()
	 * @see #getQueryResultViewerConfiguration()
	 * @generated
	 */
	EAttribute getQueryResultViewerConfiguration_RunningQueryOnFirstUse();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.SubPath <em>Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Path</em>'.
	 * @see org.cropinformatics.ui.configuration.SubPath
	 * @generated
	 */
	EClass getSubPath();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.SubPath#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cropinformatics.ui.configuration.SubPath#getId()
	 * @see #getSubPath()
	 * @generated
	 */
	EAttribute getSubPath_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.SubPath#getConditionValue <em>Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Value</em>'.
	 * @see org.cropinformatics.ui.configuration.SubPath#getConditionValue()
	 * @see #getSubPath()
	 * @generated
	 */
	EAttribute getSubPath_ConditionValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.SubPath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.cropinformatics.ui.configuration.SubPath#getPath()
	 * @see #getSubPath()
	 * @generated
	 */
	EReference getSubPath_Path();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.TabFolderConfiguration <em>Tab Folder Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Folder Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.TabFolderConfiguration
	 * @generated
	 */
	EClass getTabFolderConfiguration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration <em>Twin Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twin Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.TwinViewerConfiguration
	 * @generated
	 */
	EClass getTwinViewerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedLeftToRight <em>Item Added Left To Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Added Left To Right</em>'.
	 * @see org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedLeftToRight()
	 * @see #getTwinViewerConfiguration()
	 * @generated
	 */
	EAttribute getTwinViewerConfiguration_ItemAddedLeftToRight();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedRightToLeft <em>Item Added Right To Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Added Right To Left</em>'.
	 * @see org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemAddedRightToLeft()
	 * @see #getTwinViewerConfiguration()
	 * @generated
	 */
	EAttribute getTwinViewerConfiguration_ItemAddedRightToLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedLeftToRight <em>Item Removed Left To Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Removed Left To Right</em>'.
	 * @see org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedLeftToRight()
	 * @see #getTwinViewerConfiguration()
	 * @generated
	 */
	EAttribute getTwinViewerConfiguration_ItemRemovedLeftToRight();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedRightToLeft <em>Item Removed Right To Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Removed Right To Left</em>'.
	 * @see org.cropinformatics.ui.configuration.TwinViewerConfiguration#isItemRemovedRightToLeft()
	 * @see #getTwinViewerConfiguration()
	 * @generated
	 */
	EAttribute getTwinViewerConfiguration_ItemRemovedRightToLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.cropinformatics.ui.configuration.TwinViewerConfiguration#isDuplicateAllowed <em>Duplicate Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duplicate Allowed</em>'.
	 * @see org.cropinformatics.ui.configuration.TwinViewerConfiguration#isDuplicateAllowed()
	 * @see #getTwinViewerConfiguration()
	 * @generated
	 */
	EAttribute getTwinViewerConfiguration_DuplicateAllowed();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ViewConfiguration <em>View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ViewConfiguration
	 * @generated
	 */
	EClass getViewConfiguration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.ViewerConfiguration <em>Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewer Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.ViewerConfiguration
	 * @generated
	 */
	EClass getViewerConfiguration();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.WizardConfiguration <em>Wizard Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.WizardConfiguration
	 * @generated
	 */
	EClass getWizardConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.WizardConfiguration#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.cropinformatics.ui.configuration.WizardConfiguration#getPages()
	 * @see #getWizardConfiguration()
	 * @generated
	 */
	EReference getWizardConfiguration_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cropinformatics.ui.configuration.WizardConfiguration#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.cropinformatics.ui.configuration.WizardConfiguration#getPath()
	 * @see #getWizardConfiguration()
	 * @generated
	 */
	EReference getWizardConfiguration_Path();

	/**
	 * Returns the meta object for class '{@link org.cropinformatics.ui.configuration.WizardPageConfiguration <em>Wizard Page Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Page Configuration</em>'.
	 * @see org.cropinformatics.ui.configuration.WizardPageConfiguration
	 * @generated
	 */
	EClass getWizardPageConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.cropinformatics.ui.configuration.WizardPageConfiguration#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.cropinformatics.ui.configuration.WizardPageConfiguration#getControl()
	 * @see #getWizardPageConfiguration()
	 * @generated
	 */
	EReference getWizardPageConfiguration_Control();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Empty String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Empty String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nonEmptyString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getNonEmptyString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ColourImpl <em>Colour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ColourImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getColour()
		 * @generated
		 */
		EClass COLOUR = eINSTANCE.getColour();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOUR__RED = eINSTANCE.getColour_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOUR__GREEN = eINSTANCE.getColour_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOUR__BLUE = eINSTANCE.getColour_Blue();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl <em>Component Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ComponentConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getComponentConfiguration()
		 * @generated
		 */
		EClass COMPONENT_CONFIGURATION = eINSTANCE.getComponentConfiguration();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__STYLE = eINSTANCE.getComponentConfiguration_Style();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__LABEL = eINSTANCE.getComponentConfiguration_Label();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__IMAGE = eINSTANCE.getComponentConfiguration_Image();

		/**
		 * The meta object literal for the '<em><b>Enclosed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__ENCLOSED = eINSTANCE.getComponentConfiguration_Enclosed();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__EDITABLE = eINSTANCE.getComponentConfiguration_Editable();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__MANDATORY = eINSTANCE.getComponentConfiguration_Mandatory();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ID = eINSTANCE.getConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__EXTENDS = eINSTANCE.getConfiguration_Extends();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__VISIBLE = eINSTANCE.getConfiguration_Visible();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ENABLED = eINSTANCE.getConfiguration_Enabled();

		/**
		 * The meta object literal for the '<em><b>Help Context Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__HELP_CONTEXT_ID = eINSTANCE.getConfiguration_HelpContextId();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CLASS_NAME = eINSTANCE.getConfiguration_ClassName();

		/**
		 * The meta object literal for the '<em><b>Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__PLUGIN_ID = eINSTANCE.getConfiguration_PluginId();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ConfigurationListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationListTypeImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getConfigurationListType()
		 * @generated
		 */
		EClass CONFIGURATION_LIST_TYPE = eINSTANCE.getConfigurationListType();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_LIST_TYPE__CONFIGURATION = eINSTANCE.getConfigurationListType_Configuration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ContainerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getContainerConfiguration()
		 * @generated
		 */
		EClass CONTAINER_CONFIGURATION = eINSTANCE.getContainerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CONFIGURATION__LAYOUT = eINSTANCE.getContainerConfiguration_Layout();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CONFIGURATION__COMPONENTS = eINSTANCE.getContainerConfiguration_Components();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl <em>Control Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ControlConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getControlConfiguration()
		 * @generated
		 */
		EClass CONTROL_CONFIGURATION = eINSTANCE.getControlConfiguration();

		/**
		 * The meta object literal for the '<em><b>Layout Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONFIGURATION__LAYOUT_DATA = eINSTANCE.getControlConfiguration_LayoutData();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONFIGURATION__FOREGROUND = eINSTANCE.getControlConfiguration_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONFIGURATION__BACKGROUND = eINSTANCE.getControlConfiguration_Background();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ControlPathElementImpl <em>Control Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ControlPathElementImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getControlPathElement()
		 * @generated
		 */
		EClass CONTROL_PATH_ELEMENT = eINSTANCE.getControlPathElement();

		/**
		 * The meta object literal for the '<em><b>Condition Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PATH_ELEMENT__CONDITION_PROPERTY = eINSTANCE.getControlPathElement_ConditionProperty();

		/**
		 * The meta object literal for the '<em><b>Condition Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID = eINSTANCE.getControlPathElement_ConditionPageId();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PATH_ELEMENT__DEFAULT_VALUE = eINSTANCE.getControlPathElement_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Sub Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PATH_ELEMENT__SUB_PATHS = eINSTANCE.getControlPathElement_SubPaths();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.CTabFolderConfigurationImpl <em>CTab Folder Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.CTabFolderConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getCTabFolderConfiguration()
		 * @generated
		 */
		EClass CTAB_FOLDER_CONFIGURATION = eINSTANCE.getCTabFolderConfiguration();

		/**
		 * The meta object literal for the '<em><b>Tab Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTAB_FOLDER_CONFIGURATION__TAB_POSITION = eINSTANCE.getCTabFolderConfiguration_TabPosition();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.DialogConfigurationImpl <em>Dialog Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.DialogConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getDialogConfiguration()
		 * @generated
		 */
		EClass DIALOG_CONFIGURATION = eINSTANCE.getDialogConfiguration();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_CONFIGURATION__CONTROL = eINSTANCE.getDialogConfiguration_Control();

		/**
		 * The meta object literal for the '<em><b>Resizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_CONFIGURATION__RESIZABLE = eINSTANCE.getDialogConfiguration_Resizable();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.DocumentRootImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Configuration List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIGURATION_LIST = eINSTANCE.getDocumentRoot_ConfigurationList();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.EditorConfigurationImpl <em>Editor Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.EditorConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getEditorConfiguration()
		 * @generated
		 */
		EClass EDITOR_CONFIGURATION = eINSTANCE.getEditorConfiguration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ExpandBarConfigurationImpl <em>Expand Bar Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ExpandBarConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getExpandBarConfiguration()
		 * @generated
		 */
		EClass EXPAND_BAR_CONFIGURATION = eINSTANCE.getExpandBarConfiguration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ImageImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH = eINSTANCE.getImage_Path();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__KEY = eINSTANCE.getImage_Key();

		/**
		 * The meta object literal for the '<em><b>Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PLUGIN_ID = eINSTANCE.getImage_PluginId();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.LabelImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VALUE = eINSTANCE.getLabel_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__KEY = eINSTANCE.getLabel_Key();

		/**
		 * The meta object literal for the '<em><b>Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__PLUGIN_ID = eINSTANCE.getLabel_PluginId();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.LayoutImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Horizontal Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__HORIZONTAL_SPACING = eINSTANCE.getLayout_HorizontalSpacing();

		/**
		 * The meta object literal for the '<em><b>Make Columns Equal Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = eINSTANCE.getLayout_MakeColumnsEqualWidth();

		/**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MARGIN_BOTTOM = eINSTANCE.getLayout_MarginBottom();

		/**
		 * The meta object literal for the '<em><b>Margin Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MARGIN_HEIGHT = eINSTANCE.getLayout_MarginHeight();

		/**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MARGIN_LEFT = eINSTANCE.getLayout_MarginLeft();

		/**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MARGIN_RIGHT = eINSTANCE.getLayout_MarginRight();

		/**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MARGIN_TOP = eINSTANCE.getLayout_MarginTop();

		/**
		 * The meta object literal for the '<em><b>Margin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MARGIN_WIDTH = eINSTANCE.getLayout_MarginWidth();

		/**
		 * The meta object literal for the '<em><b>Num Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__NUM_COLUMNS = eINSTANCE.getLayout_NumColumns();

		/**
		 * The meta object literal for the '<em><b>Vertical Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__VERTICAL_SPACING = eINSTANCE.getLayout_VerticalSpacing();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.LayoutDataImpl <em>Layout Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.LayoutDataImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getLayoutData()
		 * @generated
		 */
		EClass LAYOUT_DATA = eINSTANCE.getLayoutData();

		/**
		 * The meta object literal for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = eINSTANCE.getLayoutData_GrabExcessHorizontalSpace();

		/**
		 * The meta object literal for the '<em><b>Grab Excess Vertical Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE = eINSTANCE.getLayoutData_GrabExcessVerticalSpace();

		/**
		 * The meta object literal for the '<em><b>Height Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__HEIGHT_HINT = eINSTANCE.getLayoutData_HeightHint();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__HORIZONTAL_ALIGNMENT = eINSTANCE.getLayoutData_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Horizontal Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__HORIZONTAL_INDENT = eINSTANCE.getLayoutData_HorizontalIndent();

		/**
		 * The meta object literal for the '<em><b>Horizontal Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__HORIZONTAL_SPAN = eINSTANCE.getLayoutData_HorizontalSpan();

		/**
		 * The meta object literal for the '<em><b>Minimum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__MINIMUM_HEIGHT = eINSTANCE.getLayoutData_MinimumHeight();

		/**
		 * The meta object literal for the '<em><b>Minimum Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__MINIMUM_WIDTH = eINSTANCE.getLayoutData_MinimumWidth();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__VERTICAL_ALIGNMENT = eINSTANCE.getLayoutData_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__VERTICAL_INDENT = eINSTANCE.getLayoutData_VerticalIndent();

		/**
		 * The meta object literal for the '<em><b>Vertical Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__VERTICAL_SPAN = eINSTANCE.getLayoutData_VerticalSpan();

		/**
		 * The meta object literal for the '<em><b>Width Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DATA__WIDTH_HINT = eINSTANCE.getLayoutData_WidthHint();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl <em>List Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ListViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getListViewerConfiguration()
		 * @generated
		 */
		EClass LIST_VIEWER_CONFIGURATION = eINSTANCE.getListViewerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Multiple Selection In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE = eINSTANCE.getListViewerConfiguration_MultipleSelectionInUse();

		/**
		 * The meta object literal for the '<em><b>Multiple Check In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE = eINSTANCE.getListViewerConfiguration_MultipleCheckInUse();

		/**
		 * The meta object literal for the '<em><b>Duplicate Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED = eINSTANCE.getListViewerConfiguration_DuplicateAllowed();

		/**
		 * The meta object literal for the '<em><b>Check Selection In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE = eINSTANCE.getListViewerConfiguration_CheckSelectionInUse();

		/**
		 * The meta object literal for the '<em><b>Threading In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__THREADING_IN_USE = eINSTANCE.getListViewerConfiguration_ThreadingInUse();

		/**
		 * The meta object literal for the '<em><b>Copy Items In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE = eINSTANCE.getListViewerConfiguration_CopyItemsInUse();

		/**
		 * The meta object literal for the '<em><b>Virtual In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE = eINSTANCE.getListViewerConfiguration_VirtualInUse();

		/**
		 * The meta object literal for the '<em><b>Mantaining Selection State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE = eINSTANCE.getListViewerConfiguration_MantainingSelectionState();

		/**
		 * The meta object literal for the '<em><b>Mantaining Checked State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE = eINSTANCE.getListViewerConfiguration_MantainingCheckedState();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl <em>Mapping Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.MappingViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getMappingViewerConfiguration()
		 * @generated
		 */
		EClass MAPPING_VIEWER_CONFIGURATION = eINSTANCE.getMappingViewerConfiguration();

		/**
		 * The meta object literal for the '<em><b>From Item Removed When Mapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED = eINSTANCE.getMappingViewerConfiguration_FromItemRemovedWhenMapped();

		/**
		 * The meta object literal for the '<em><b>From Item Added When Unmapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED = eINSTANCE.getMappingViewerConfiguration_FromItemAddedWhenUnmapped();

		/**
		 * The meta object literal for the '<em><b>To Item Removed When Mapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED = eINSTANCE.getMappingViewerConfiguration_ToItemRemovedWhenMapped();

		/**
		 * The meta object literal for the '<em><b>To Item Added When Unmapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED = eINSTANCE.getMappingViewerConfiguration_ToItemAddedWhenUnmapped();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.MatrixViewerConfigurationImpl <em>Matrix Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.MatrixViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getMatrixViewerConfiguration()
		 * @generated
		 */
		EClass MATRIX_VIEWER_CONFIGURATION = eINSTANCE.getMatrixViewerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Cell Selection In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE = eINSTANCE.getMatrixViewerConfiguration_CellSelectionInUse();

		/**
		 * The meta object literal for the '<em><b>Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE = eINSTANCE.getMatrixViewerConfiguration_LinesVisible();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.MultipleListViewerConfigurationImpl <em>Multiple List Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.MultipleListViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getMultipleListViewerConfiguration()
		 * @generated
		 */
		EClass MULTIPLE_LIST_VIEWER_CONFIGURATION = eINSTANCE.getMultipleListViewerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Child Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION = eINSTANCE.getMultipleListViewerConfiguration_ChildConfiguration();

		/**
		 * The meta object literal for the '<em><b>Threading In Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE = eINSTANCE.getMultipleListViewerConfiguration_ThreadingInUse();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.PagePathElementImpl <em>Page Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.PagePathElementImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPagePathElement()
		 * @generated
		 */
		EClass PAGE_PATH_ELEMENT = eINSTANCE.getPagePathElement();

		/**
		 * The meta object literal for the '<em><b>Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_PATH_ELEMENT__PAGE_ID = eINSTANCE.getPagePathElement_PageId();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.PartConfigurationImpl <em>Part Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.PartConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPartConfiguration()
		 * @generated
		 */
		EClass PART_CONFIGURATION = eINSTANCE.getPartConfiguration();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_CONFIGURATION__CONTROL = eINSTANCE.getPartConfiguration_Control();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.PathElementImpl <em>Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.PathElementImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPathElement()
		 * @generated
		 */
		EClass PATH_ELEMENT = eINSTANCE.getPathElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_ELEMENT__ID = eINSTANCE.getPathElement_Id();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.PerspectiveConfigurationImpl <em>Perspective Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.PerspectiveConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getPerspectiveConfiguration()
		 * @generated
		 */
		EClass PERSPECTIVE_CONFIGURATION = eINSTANCE.getPerspectiveConfiguration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.QueryResultViewerConfigurationImpl <em>Query Result Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.QueryResultViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getQueryResultViewerConfiguration()
		 * @generated
		 */
		EClass QUERY_RESULT_VIEWER_CONFIGURATION = eINSTANCE.getQueryResultViewerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Running Query On First Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE = eINSTANCE.getQueryResultViewerConfiguration_RunningQueryOnFirstUse();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.SubPathImpl <em>Sub Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.SubPathImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getSubPath()
		 * @generated
		 */
		EClass SUB_PATH = eINSTANCE.getSubPath();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PATH__ID = eINSTANCE.getSubPath_Id();

		/**
		 * The meta object literal for the '<em><b>Condition Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PATH__CONDITION_VALUE = eINSTANCE.getSubPath_ConditionValue();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PATH__PATH = eINSTANCE.getSubPath_Path();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.TabFolderConfigurationImpl <em>Tab Folder Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.TabFolderConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getTabFolderConfiguration()
		 * @generated
		 */
		EClass TAB_FOLDER_CONFIGURATION = eINSTANCE.getTabFolderConfiguration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.TwinViewerConfigurationImpl <em>Twin Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.TwinViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getTwinViewerConfiguration()
		 * @generated
		 */
		EClass TWIN_VIEWER_CONFIGURATION = eINSTANCE.getTwinViewerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Item Added Left To Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT = eINSTANCE.getTwinViewerConfiguration_ItemAddedLeftToRight();

		/**
		 * The meta object literal for the '<em><b>Item Added Right To Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT = eINSTANCE.getTwinViewerConfiguration_ItemAddedRightToLeft();

		/**
		 * The meta object literal for the '<em><b>Item Removed Left To Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT = eINSTANCE.getTwinViewerConfiguration_ItemRemovedLeftToRight();

		/**
		 * The meta object literal for the '<em><b>Item Removed Right To Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT = eINSTANCE.getTwinViewerConfiguration_ItemRemovedRightToLeft();

		/**
		 * The meta object literal for the '<em><b>Duplicate Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED = eINSTANCE.getTwinViewerConfiguration_DuplicateAllowed();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ViewConfigurationImpl <em>View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ViewConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getViewConfiguration()
		 * @generated
		 */
		EClass VIEW_CONFIGURATION = eINSTANCE.getViewConfiguration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.ViewerConfigurationImpl <em>Viewer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.ViewerConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getViewerConfiguration()
		 * @generated
		 */
		EClass VIEWER_CONFIGURATION = eINSTANCE.getViewerConfiguration();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.WizardConfigurationImpl <em>Wizard Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.WizardConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getWizardConfiguration()
		 * @generated
		 */
		EClass WIZARD_CONFIGURATION = eINSTANCE.getWizardConfiguration();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_CONFIGURATION__PAGES = eINSTANCE.getWizardConfiguration_Pages();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_CONFIGURATION__PATH = eINSTANCE.getWizardConfiguration_Path();

		/**
		 * The meta object literal for the '{@link org.cropinformatics.ui.configuration.impl.WizardPageConfigurationImpl <em>Wizard Page Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cropinformatics.ui.configuration.impl.WizardPageConfigurationImpl
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getWizardPageConfiguration()
		 * @generated
		 */
		EClass WIZARD_PAGE_CONFIGURATION = eINSTANCE.getWizardPageConfiguration();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_PAGE_CONFIGURATION__CONTROL = eINSTANCE.getWizardPageConfiguration_Control();

		/**
		 * The meta object literal for the '<em>Non Empty String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.cropinformatics.ui.configuration.impl.ConfigurationPackageImpl#getNonEmptyString()
		 * @generated
		 */
		EDataType NON_EMPTY_STRING = eINSTANCE.getNonEmptyString();

	}

} //ConfigurationPackage
