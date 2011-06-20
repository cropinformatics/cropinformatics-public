/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.impl;

import org.daveneti.ui.configuration.CTabFolderConfiguration;
import org.daveneti.ui.configuration.Colour;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.Configuration;
import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.ConfigurationListType;
import org.daveneti.ui.configuration.ConfigurationPackage;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.ControlPathElement;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.DocumentRoot;
import org.daveneti.ui.configuration.EditorConfiguration;
import org.daveneti.ui.configuration.ExpandBarConfiguration;
import org.daveneti.ui.configuration.Image;
import org.daveneti.ui.configuration.Label;
import org.daveneti.ui.configuration.Layout;
import org.daveneti.ui.configuration.LayoutData;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.MappingViewerConfiguration;
import org.daveneti.ui.configuration.MatrixViewerConfiguration;
import org.daveneti.ui.configuration.MultipleListViewerConfiguration;
import org.daveneti.ui.configuration.PagePathElement;
import org.daveneti.ui.configuration.PartConfiguration;
import org.daveneti.ui.configuration.PathElement;
import org.daveneti.ui.configuration.PerspectiveConfiguration;
import org.daveneti.ui.configuration.QueryResultViewerConfiguration;
import org.daveneti.ui.configuration.SubPath;
import org.daveneti.ui.configuration.TabFolderConfiguration;
import org.daveneti.ui.configuration.TwinViewerConfiguration;
import org.daveneti.ui.configuration.ViewConfiguration;
import org.daveneti.ui.configuration.ViewerConfiguration;
import org.daveneti.ui.configuration.WizardConfiguration;
import org.daveneti.ui.configuration.WizardPageConfiguration;
import org.daveneti.ui.configuration.util.ConfigurationValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTabFolderConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandBarConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listViewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingViewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixViewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleListViewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perspectiveConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResultViewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabFolderConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twinViewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardPageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl()
	{
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init()
	{
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConfigurationPackage, 
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return ConfigurationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColour()
	{
		return colourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColour_Red()
	{
		return (EAttribute)colourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColour_Green()
	{
		return (EAttribute)colourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColour_Blue()
	{
		return (EAttribute)colourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentConfiguration()
	{
		return componentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_Style()
	{
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_Label()
	{
		return (EReference)componentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_Image()
	{
		return (EReference)componentConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_Enclosed()
	{
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_Editable()
	{
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentConfiguration_Mandatory()
	{
		return (EAttribute)componentConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration()
	{
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Id()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Extends()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Visible()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Enabled()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_HelpContextId()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_ClassName()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_PluginId()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationListType()
	{
		return configurationListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationListType_Configuration()
	{
		return (EReference)configurationListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerConfiguration()
	{
		return containerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerConfiguration_Layout()
	{
		return (EReference)containerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerConfiguration_Components()
	{
		return (EReference)containerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConfiguration()
	{
		return controlConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConfiguration_LayoutData()
	{
		return (EReference)controlConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConfiguration_Foreground()
	{
		return (EReference)controlConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConfiguration_Background()
	{
		return (EReference)controlConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlPathElement()
	{
		return controlPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlPathElement_ConditionProperty()
	{
		return (EAttribute)controlPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlPathElement_ConditionPageId()
	{
		return (EAttribute)controlPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlPathElement_DefaultValue()
	{
		return (EAttribute)controlPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPathElement_SubPaths()
	{
		return (EReference)controlPathElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTabFolderConfiguration()
	{
		return cTabFolderConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCTabFolderConfiguration_TabPosition()
	{
		return (EAttribute)cTabFolderConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogConfiguration()
	{
		return dialogConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogConfiguration_Control()
	{
		return (EReference)dialogConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogConfiguration_Resizable()
	{
		return (EAttribute)dialogConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot()
	{
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed()
	{
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConfigurationList()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditorConfiguration()
	{
		return editorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandBarConfiguration()
	{
		return expandBarConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage()
	{
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Path()
	{
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Key()
	{
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_PluginId()
	{
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel()
	{
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Value()
	{
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Key()
	{
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_PluginId()
	{
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout()
	{
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_HorizontalSpacing()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MakeColumnsEqualWidth()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MarginBottom()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MarginHeight()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MarginLeft()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MarginRight()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MarginTop()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_MarginWidth()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_NumColumns()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_VerticalSpacing()
	{
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutData()
	{
		return layoutDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_GrabExcessHorizontalSpace()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_GrabExcessVerticalSpace()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_HeightHint()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_HorizontalAlignment()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_HorizontalIndent()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_HorizontalSpan()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_MinimumHeight()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_MinimumWidth()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_VerticalAlignment()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_VerticalIndent()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_VerticalSpan()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutData_WidthHint()
	{
		return (EAttribute)layoutDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListViewerConfiguration()
	{
		return listViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_MultipleSelectionInUse()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_MultipleCheckInUse()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_DuplicateAllowed()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_CheckSelectionInUse()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_ThreadingInUse()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_CopyItemsInUse()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_VirtualInUse()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_MantainingSelectionState()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListViewerConfiguration_MantainingCheckedState()
	{
		return (EAttribute)listViewerConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingViewerConfiguration()
	{
		return mappingViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingViewerConfiguration_FromItemRemovedWhenMapped()
	{
		return (EAttribute)mappingViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingViewerConfiguration_FromItemAddedWhenUnmapped()
	{
		return (EAttribute)mappingViewerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingViewerConfiguration_ToItemRemovedWhenMapped()
	{
		return (EAttribute)mappingViewerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingViewerConfiguration_ToItemAddedWhenUnmapped()
	{
		return (EAttribute)mappingViewerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrixViewerConfiguration()
	{
		return matrixViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixViewerConfiguration_CellSelectionInUse()
	{
		return (EAttribute)matrixViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixViewerConfiguration_LinesVisible()
	{
		return (EAttribute)matrixViewerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleListViewerConfiguration()
	{
		return multipleListViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleListViewerConfiguration_ChildConfiguration()
	{
		return (EReference)multipleListViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleListViewerConfiguration_ThreadingInUse()
	{
		return (EAttribute)multipleListViewerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagePathElement()
	{
		return pagePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagePathElement_PageId()
	{
		return (EAttribute)pagePathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartConfiguration()
	{
		return partConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartConfiguration_Control()
	{
		return (EReference)partConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathElement()
	{
		return pathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathElement_Id()
	{
		return (EAttribute)pathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerspectiveConfiguration()
	{
		return perspectiveConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryResultViewerConfiguration()
	{
		return queryResultViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResultViewerConfiguration_RunningQueryOnFirstUse()
	{
		return (EAttribute)queryResultViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPath()
	{
		return subPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPath_Id()
	{
		return (EAttribute)subPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPath_ConditionValue()
	{
		return (EAttribute)subPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPath_Path()
	{
		return (EReference)subPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabFolderConfiguration()
	{
		return tabFolderConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwinViewerConfiguration()
	{
		return twinViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwinViewerConfiguration_ItemAddedLeftToRight()
	{
		return (EAttribute)twinViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwinViewerConfiguration_ItemAddedRightToLeft()
	{
		return (EAttribute)twinViewerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwinViewerConfiguration_ItemRemovedLeftToRight()
	{
		return (EAttribute)twinViewerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwinViewerConfiguration_ItemRemovedRightToLeft()
	{
		return (EAttribute)twinViewerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwinViewerConfiguration_DuplicateAllowed()
	{
		return (EAttribute)twinViewerConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewConfiguration()
	{
		return viewConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewerConfiguration()
	{
		return viewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardConfiguration()
	{
		return wizardConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizardConfiguration_Pages()
	{
		return (EReference)wizardConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizardConfiguration_Path()
	{
		return (EReference)wizardConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardPageConfiguration()
	{
		return wizardPageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizardPageConfiguration_Control()
	{
		return (EReference)wizardPageConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyString()
	{
		return nonEmptyStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory()
	{
		return (ConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		colourEClass = createEClass(COLOUR);
		createEAttribute(colourEClass, COLOUR__RED);
		createEAttribute(colourEClass, COLOUR__GREEN);
		createEAttribute(colourEClass, COLOUR__BLUE);

		componentConfigurationEClass = createEClass(COMPONENT_CONFIGURATION);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__STYLE);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__LABEL);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__IMAGE);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__ENCLOSED);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__EDITABLE);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__MANDATORY);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__ID);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEAttribute(configurationEClass, CONFIGURATION__EXTENDS);
		createEAttribute(configurationEClass, CONFIGURATION__VISIBLE);
		createEAttribute(configurationEClass, CONFIGURATION__ENABLED);
		createEAttribute(configurationEClass, CONFIGURATION__HELP_CONTEXT_ID);
		createEAttribute(configurationEClass, CONFIGURATION__CLASS_NAME);
		createEAttribute(configurationEClass, CONFIGURATION__PLUGIN_ID);

		configurationListTypeEClass = createEClass(CONFIGURATION_LIST_TYPE);
		createEReference(configurationListTypeEClass, CONFIGURATION_LIST_TYPE__CONFIGURATION);

		containerConfigurationEClass = createEClass(CONTAINER_CONFIGURATION);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__LAYOUT);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__COMPONENTS);

		controlConfigurationEClass = createEClass(CONTROL_CONFIGURATION);
		createEReference(controlConfigurationEClass, CONTROL_CONFIGURATION__LAYOUT_DATA);
		createEReference(controlConfigurationEClass, CONTROL_CONFIGURATION__FOREGROUND);
		createEReference(controlConfigurationEClass, CONTROL_CONFIGURATION__BACKGROUND);

		controlPathElementEClass = createEClass(CONTROL_PATH_ELEMENT);
		createEAttribute(controlPathElementEClass, CONTROL_PATH_ELEMENT__CONDITION_PROPERTY);
		createEAttribute(controlPathElementEClass, CONTROL_PATH_ELEMENT__CONDITION_PAGE_ID);
		createEAttribute(controlPathElementEClass, CONTROL_PATH_ELEMENT__DEFAULT_VALUE);
		createEReference(controlPathElementEClass, CONTROL_PATH_ELEMENT__SUB_PATHS);

		cTabFolderConfigurationEClass = createEClass(CTAB_FOLDER_CONFIGURATION);
		createEAttribute(cTabFolderConfigurationEClass, CTAB_FOLDER_CONFIGURATION__TAB_POSITION);

		dialogConfigurationEClass = createEClass(DIALOG_CONFIGURATION);
		createEReference(dialogConfigurationEClass, DIALOG_CONFIGURATION__CONTROL);
		createEAttribute(dialogConfigurationEClass, DIALOG_CONFIGURATION__RESIZABLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFIGURATION_LIST);

		editorConfigurationEClass = createEClass(EDITOR_CONFIGURATION);

		expandBarConfigurationEClass = createEClass(EXPAND_BAR_CONFIGURATION);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__PATH);
		createEAttribute(imageEClass, IMAGE__KEY);
		createEAttribute(imageEClass, IMAGE__PLUGIN_ID);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__VALUE);
		createEAttribute(labelEClass, LABEL__KEY);
		createEAttribute(labelEClass, LABEL__PLUGIN_ID);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__HORIZONTAL_SPACING);
		createEAttribute(layoutEClass, LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH);
		createEAttribute(layoutEClass, LAYOUT__MARGIN_BOTTOM);
		createEAttribute(layoutEClass, LAYOUT__MARGIN_HEIGHT);
		createEAttribute(layoutEClass, LAYOUT__MARGIN_LEFT);
		createEAttribute(layoutEClass, LAYOUT__MARGIN_RIGHT);
		createEAttribute(layoutEClass, LAYOUT__MARGIN_TOP);
		createEAttribute(layoutEClass, LAYOUT__MARGIN_WIDTH);
		createEAttribute(layoutEClass, LAYOUT__NUM_COLUMNS);
		createEAttribute(layoutEClass, LAYOUT__VERTICAL_SPACING);

		layoutDataEClass = createEClass(LAYOUT_DATA);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__HEIGHT_HINT);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__HORIZONTAL_ALIGNMENT);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__HORIZONTAL_INDENT);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__HORIZONTAL_SPAN);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__MINIMUM_HEIGHT);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__MINIMUM_WIDTH);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__VERTICAL_ALIGNMENT);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__VERTICAL_INDENT);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__VERTICAL_SPAN);
		createEAttribute(layoutDataEClass, LAYOUT_DATA__WIDTH_HINT);

		listViewerConfigurationEClass = createEClass(LIST_VIEWER_CONFIGURATION);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__MULTIPLE_SELECTION_IN_USE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__MULTIPLE_CHECK_IN_USE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__CHECK_SELECTION_IN_USE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__THREADING_IN_USE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__COPY_ITEMS_IN_USE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__VIRTUAL_IN_USE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__MANTAINING_SELECTION_STATE);
		createEAttribute(listViewerConfigurationEClass, LIST_VIEWER_CONFIGURATION__MANTAINING_CHECKED_STATE);

		mappingViewerConfigurationEClass = createEClass(MAPPING_VIEWER_CONFIGURATION);
		createEAttribute(mappingViewerConfigurationEClass, MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_REMOVED_WHEN_MAPPED);
		createEAttribute(mappingViewerConfigurationEClass, MAPPING_VIEWER_CONFIGURATION__FROM_ITEM_ADDED_WHEN_UNMAPPED);
		createEAttribute(mappingViewerConfigurationEClass, MAPPING_VIEWER_CONFIGURATION__TO_ITEM_REMOVED_WHEN_MAPPED);
		createEAttribute(mappingViewerConfigurationEClass, MAPPING_VIEWER_CONFIGURATION__TO_ITEM_ADDED_WHEN_UNMAPPED);

		matrixViewerConfigurationEClass = createEClass(MATRIX_VIEWER_CONFIGURATION);
		createEAttribute(matrixViewerConfigurationEClass, MATRIX_VIEWER_CONFIGURATION__CELL_SELECTION_IN_USE);
		createEAttribute(matrixViewerConfigurationEClass, MATRIX_VIEWER_CONFIGURATION__LINES_VISIBLE);

		multipleListViewerConfigurationEClass = createEClass(MULTIPLE_LIST_VIEWER_CONFIGURATION);
		createEReference(multipleListViewerConfigurationEClass, MULTIPLE_LIST_VIEWER_CONFIGURATION__CHILD_CONFIGURATION);
		createEAttribute(multipleListViewerConfigurationEClass, MULTIPLE_LIST_VIEWER_CONFIGURATION__THREADING_IN_USE);

		pagePathElementEClass = createEClass(PAGE_PATH_ELEMENT);
		createEAttribute(pagePathElementEClass, PAGE_PATH_ELEMENT__PAGE_ID);

		partConfigurationEClass = createEClass(PART_CONFIGURATION);
		createEReference(partConfigurationEClass, PART_CONFIGURATION__CONTROL);

		pathElementEClass = createEClass(PATH_ELEMENT);
		createEAttribute(pathElementEClass, PATH_ELEMENT__ID);

		perspectiveConfigurationEClass = createEClass(PERSPECTIVE_CONFIGURATION);

		queryResultViewerConfigurationEClass = createEClass(QUERY_RESULT_VIEWER_CONFIGURATION);
		createEAttribute(queryResultViewerConfigurationEClass, QUERY_RESULT_VIEWER_CONFIGURATION__RUNNING_QUERY_ON_FIRST_USE);

		subPathEClass = createEClass(SUB_PATH);
		createEAttribute(subPathEClass, SUB_PATH__ID);
		createEAttribute(subPathEClass, SUB_PATH__CONDITION_VALUE);
		createEReference(subPathEClass, SUB_PATH__PATH);

		tabFolderConfigurationEClass = createEClass(TAB_FOLDER_CONFIGURATION);

		twinViewerConfigurationEClass = createEClass(TWIN_VIEWER_CONFIGURATION);
		createEAttribute(twinViewerConfigurationEClass, TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_LEFT_TO_RIGHT);
		createEAttribute(twinViewerConfigurationEClass, TWIN_VIEWER_CONFIGURATION__ITEM_ADDED_RIGHT_TO_LEFT);
		createEAttribute(twinViewerConfigurationEClass, TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_LEFT_TO_RIGHT);
		createEAttribute(twinViewerConfigurationEClass, TWIN_VIEWER_CONFIGURATION__ITEM_REMOVED_RIGHT_TO_LEFT);
		createEAttribute(twinViewerConfigurationEClass, TWIN_VIEWER_CONFIGURATION__DUPLICATE_ALLOWED);

		viewConfigurationEClass = createEClass(VIEW_CONFIGURATION);

		viewerConfigurationEClass = createEClass(VIEWER_CONFIGURATION);

		wizardConfigurationEClass = createEClass(WIZARD_CONFIGURATION);
		createEReference(wizardConfigurationEClass, WIZARD_CONFIGURATION__PAGES);
		createEReference(wizardConfigurationEClass, WIZARD_CONFIGURATION__PATH);

		wizardPageConfigurationEClass = createEClass(WIZARD_PAGE_CONFIGURATION);
		createEReference(wizardPageConfigurationEClass, WIZARD_PAGE_CONFIGURATION__CONTROL);

		// Create data types
		nonEmptyStringEDataType = createEDataType(NON_EMPTY_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		containerConfigurationEClass.getESuperTypes().add(this.getControlConfiguration());
		controlConfigurationEClass.getESuperTypes().add(this.getComponentConfiguration());
		controlPathElementEClass.getESuperTypes().add(this.getPathElement());
		cTabFolderConfigurationEClass.getESuperTypes().add(this.getContainerConfiguration());
		dialogConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		editorConfigurationEClass.getESuperTypes().add(this.getPartConfiguration());
		expandBarConfigurationEClass.getESuperTypes().add(this.getContainerConfiguration());
		listViewerConfigurationEClass.getESuperTypes().add(this.getViewerConfiguration());
		mappingViewerConfigurationEClass.getESuperTypes().add(this.getViewerConfiguration());
		matrixViewerConfigurationEClass.getESuperTypes().add(this.getViewerConfiguration());
		multipleListViewerConfigurationEClass.getESuperTypes().add(this.getViewerConfiguration());
		pagePathElementEClass.getESuperTypes().add(this.getPathElement());
		partConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		perspectiveConfigurationEClass.getESuperTypes().add(this.getPartConfiguration());
		queryResultViewerConfigurationEClass.getESuperTypes().add(this.getViewerConfiguration());
		tabFolderConfigurationEClass.getESuperTypes().add(this.getContainerConfiguration());
		twinViewerConfigurationEClass.getESuperTypes().add(this.getViewerConfiguration());
		viewConfigurationEClass.getESuperTypes().add(this.getPartConfiguration());
		viewerConfigurationEClass.getESuperTypes().add(this.getContainerConfiguration());
		wizardConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		wizardPageConfigurationEClass.getESuperTypes().add(this.getConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(colourEClass, Colour.class, "Colour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColour_Red(), theXMLTypePackage.getInt(), "red", "0", 1, 1, Colour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColour_Green(), theXMLTypePackage.getInt(), "green", "0", 1, 1, Colour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColour_Blue(), theXMLTypePackage.getInt(), "blue", "0", 1, 1, Colour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentConfigurationEClass, ComponentConfiguration.class, "ComponentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentConfiguration_Style(), theXMLTypePackage.getInt(), "style", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_Label(), this.getLabel(), null, "label", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_Image(), this.getImage(), null, "image", null, 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_Enclosed(), theXMLTypePackage.getBoolean(), "enclosed", "false", 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_Editable(), theXMLTypePackage.getBoolean(), "editable", "true", 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_Mandatory(), theXMLTypePackage.getBoolean(), "mandatory", "false", 0, 1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Id(), this.getNonEmptyString(), "id", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Name(), this.getNonEmptyString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Extends(), this.getNonEmptyString(), "extends", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Visible(), theXMLTypePackage.getBoolean(), "visible", "true", 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_HelpContextId(), this.getNonEmptyString(), "helpContextId", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_ClassName(), this.getNonEmptyString(), "className", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_PluginId(), this.getNonEmptyString(), "pluginId", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationListTypeEClass, ConfigurationListType.class, "ConfigurationListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationListType_Configuration(), this.getConfiguration(), null, "configuration", null, 0, -1, ConfigurationListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerConfigurationEClass, ContainerConfiguration.class, "ContainerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerConfiguration_Layout(), this.getLayout(), null, "layout", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerConfiguration_Components(), this.getComponentConfiguration(), null, "components", null, 0, -1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConfigurationEClass, ControlConfiguration.class, "ControlConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConfiguration_LayoutData(), this.getLayoutData(), null, "layoutData", null, 0, 1, ControlConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlConfiguration_Foreground(), this.getColour(), null, "foreground", null, 0, 1, ControlConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlConfiguration_Background(), this.getColour(), null, "background", null, 0, 1, ControlConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlPathElementEClass, ControlPathElement.class, "ControlPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlPathElement_ConditionProperty(), this.getNonEmptyString(), "conditionProperty", null, 1, 1, ControlPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlPathElement_ConditionPageId(), this.getNonEmptyString(), "conditionPageId", null, 0, 1, ControlPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlPathElement_DefaultValue(), this.getNonEmptyString(), "defaultValue", null, 0, 1, ControlPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlPathElement_SubPaths(), this.getSubPath(), null, "subPaths", null, 1, -1, ControlPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cTabFolderConfigurationEClass, CTabFolderConfiguration.class, "CTabFolderConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCTabFolderConfiguration_TabPosition(), theXMLTypePackage.getInt(), "tabPosition", null, 0, 1, CTabFolderConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogConfigurationEClass, DialogConfiguration.class, "DialogConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogConfiguration_Control(), this.getControlConfiguration(), null, "control", null, 0, 1, DialogConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogConfiguration_Resizable(), theXMLTypePackage.getBoolean(), "resizable", "false", 0, 1, DialogConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConfigurationList(), this.getConfigurationListType(), null, "configurationList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(editorConfigurationEClass, EditorConfiguration.class, "EditorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expandBarConfigurationEClass, ExpandBarConfiguration.class, "ExpandBarConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Path(), this.getNonEmptyString(), "path", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Key(), this.getNonEmptyString(), "key", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_PluginId(), this.getNonEmptyString(), "pluginId", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Value(), this.getNonEmptyString(), "value", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Key(), this.getNonEmptyString(), "key", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_PluginId(), this.getNonEmptyString(), "pluginId", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_HorizontalSpacing(), theXMLTypePackage.getInt(), "horizontalSpacing", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MakeColumnsEqualWidth(), theXMLTypePackage.getBoolean(), "makeColumnsEqualWidth", "false", 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MarginBottom(), theXMLTypePackage.getInt(), "marginBottom", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MarginHeight(), theXMLTypePackage.getInt(), "marginHeight", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MarginLeft(), theXMLTypePackage.getInt(), "marginLeft", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MarginRight(), theXMLTypePackage.getInt(), "marginRight", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MarginTop(), theXMLTypePackage.getInt(), "marginTop", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_MarginWidth(), theXMLTypePackage.getInt(), "marginWidth", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_NumColumns(), theXMLTypePackage.getInt(), "numColumns", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_VerticalSpacing(), theXMLTypePackage.getInt(), "verticalSpacing", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutDataEClass, LayoutData.class, "LayoutData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutData_GrabExcessHorizontalSpace(), theXMLTypePackage.getBoolean(), "grabExcessHorizontalSpace", "true", 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_GrabExcessVerticalSpace(), theXMLTypePackage.getBoolean(), "grabExcessVerticalSpace", "true", 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_HeightHint(), theXMLTypePackage.getInt(), "heightHint", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_HorizontalAlignment(), theXMLTypePackage.getInt(), "horizontalAlignment", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_HorizontalIndent(), theXMLTypePackage.getInt(), "horizontalIndent", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_HorizontalSpan(), theXMLTypePackage.getInt(), "horizontalSpan", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_MinimumHeight(), theXMLTypePackage.getInt(), "minimumHeight", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_MinimumWidth(), theXMLTypePackage.getInt(), "minimumWidth", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_VerticalAlignment(), theXMLTypePackage.getInt(), "verticalAlignment", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_VerticalIndent(), theXMLTypePackage.getInt(), "verticalIndent", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_VerticalSpan(), theXMLTypePackage.getInt(), "verticalSpan", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutData_WidthHint(), theXMLTypePackage.getInt(), "widthHint", null, 0, 1, LayoutData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listViewerConfigurationEClass, ListViewerConfiguration.class, "ListViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListViewerConfiguration_MultipleSelectionInUse(), theXMLTypePackage.getBoolean(), "multipleSelectionInUse", "false", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_MultipleCheckInUse(), theXMLTypePackage.getBoolean(), "multipleCheckInUse", "false", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_DuplicateAllowed(), theXMLTypePackage.getBoolean(), "duplicateAllowed", "true", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_CheckSelectionInUse(), theXMLTypePackage.getBoolean(), "checkSelectionInUse", "false", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_ThreadingInUse(), theXMLTypePackage.getBoolean(), "threadingInUse", "false", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_CopyItemsInUse(), theXMLTypePackage.getBoolean(), "copyItemsInUse", "false", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_VirtualInUse(), theXMLTypePackage.getBoolean(), "virtualInUse", "false", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_MantainingSelectionState(), theXMLTypePackage.getBoolean(), "mantainingSelectionState", "true", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListViewerConfiguration_MantainingCheckedState(), theXMLTypePackage.getBoolean(), "mantainingCheckedState", "true", 0, 1, ListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingViewerConfigurationEClass, MappingViewerConfiguration.class, "MappingViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingViewerConfiguration_FromItemRemovedWhenMapped(), theXMLTypePackage.getBoolean(), "fromItemRemovedWhenMapped", "true", 0, 1, MappingViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingViewerConfiguration_FromItemAddedWhenUnmapped(), theXMLTypePackage.getBoolean(), "fromItemAddedWhenUnmapped", "true", 0, 1, MappingViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingViewerConfiguration_ToItemRemovedWhenMapped(), theXMLTypePackage.getBoolean(), "toItemRemovedWhenMapped", "true", 0, 1, MappingViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingViewerConfiguration_ToItemAddedWhenUnmapped(), theXMLTypePackage.getBoolean(), "toItemAddedWhenUnmapped", "true", 0, 1, MappingViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixViewerConfigurationEClass, MatrixViewerConfiguration.class, "MatrixViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrixViewerConfiguration_CellSelectionInUse(), theXMLTypePackage.getBoolean(), "cellSelectionInUse", "false", 0, 1, MatrixViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixViewerConfiguration_LinesVisible(), theXMLTypePackage.getBoolean(), "linesVisible", "true", 0, 1, MatrixViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleListViewerConfigurationEClass, MultipleListViewerConfiguration.class, "MultipleListViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleListViewerConfiguration_ChildConfiguration(), this.getListViewerConfiguration(), null, "childConfiguration", null, 0, -1, MultipleListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleListViewerConfiguration_ThreadingInUse(), theXMLTypePackage.getBoolean(), "threadingInUse", "false", 0, 1, MultipleListViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagePathElementEClass, PagePathElement.class, "PagePathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagePathElement_PageId(), this.getNonEmptyString(), "pageId", null, 1, 1, PagePathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partConfigurationEClass, PartConfiguration.class, "PartConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartConfiguration_Control(), this.getControlConfiguration(), null, "control", null, 0, 1, PartConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathElementEClass, PathElement.class, "PathElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathElement_Id(), this.getNonEmptyString(), "id", null, 0, 1, PathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perspectiveConfigurationEClass, PerspectiveConfiguration.class, "PerspectiveConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryResultViewerConfigurationEClass, QueryResultViewerConfiguration.class, "QueryResultViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryResultViewerConfiguration_RunningQueryOnFirstUse(), theXMLTypePackage.getBoolean(), "runningQueryOnFirstUse", "false", 0, 1, QueryResultViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subPathEClass, SubPath.class, "SubPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubPath_Id(), this.getNonEmptyString(), "id", null, 0, 1, SubPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubPath_ConditionValue(), this.getNonEmptyString(), "conditionValue", null, 1, 1, SubPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubPath_Path(), this.getPathElement(), null, "path", null, 0, -1, SubPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabFolderConfigurationEClass, TabFolderConfiguration.class, "TabFolderConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twinViewerConfigurationEClass, TwinViewerConfiguration.class, "TwinViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwinViewerConfiguration_ItemAddedLeftToRight(), theXMLTypePackage.getBoolean(), "itemAddedLeftToRight", "true", 0, 1, TwinViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwinViewerConfiguration_ItemAddedRightToLeft(), theXMLTypePackage.getBoolean(), "itemAddedRightToLeft", "true", 0, 1, TwinViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwinViewerConfiguration_ItemRemovedLeftToRight(), theXMLTypePackage.getBoolean(), "itemRemovedLeftToRight", "true", 0, 1, TwinViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwinViewerConfiguration_ItemRemovedRightToLeft(), theXMLTypePackage.getBoolean(), "itemRemovedRightToLeft", "true", 0, 1, TwinViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwinViewerConfiguration_DuplicateAllowed(), theXMLTypePackage.getBoolean(), "duplicateAllowed", "true", 0, 1, TwinViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewConfigurationEClass, ViewConfiguration.class, "ViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewerConfigurationEClass, ViewerConfiguration.class, "ViewerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wizardConfigurationEClass, WizardConfiguration.class, "WizardConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWizardConfiguration_Pages(), this.getWizardPageConfiguration(), null, "pages", null, 0, -1, WizardConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizardConfiguration_Path(), this.getPathElement(), null, "path", null, 0, -1, WizardConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wizardPageConfigurationEClass, WizardPageConfiguration.class, "WizardPageConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWizardPageConfiguration_Control(), this.getControlConfiguration(), null, "control", null, 0, 1, WizardPageConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(nonEmptyStringEDataType, String.class, "NonEmptyString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (colourEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Colour",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getColour_Red(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "red"
		   });		
		addAnnotation
		  (getColour_Green(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "green"
		   });		
		addAnnotation
		  (getColour_Blue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "blue"
		   });			
		addAnnotation
		  (componentConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ComponentConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getComponentConfiguration_Style(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "style"
		   });		
		addAnnotation
		  (getComponentConfiguration_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "label"
		   });		
		addAnnotation
		  (getComponentConfiguration_Image(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "image"
		   });		
		addAnnotation
		  (getComponentConfiguration_Enclosed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "enclosed"
		   });		
		addAnnotation
		  (getComponentConfiguration_Editable(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "editable"
		   });		
		addAnnotation
		  (getComponentConfiguration_Mandatory(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "mandatory"
		   });			
		addAnnotation
		  (configurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Configuration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfiguration_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getConfiguration_Name(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getConfiguration_Extends(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "extends"
		   });		
		addAnnotation
		  (getConfiguration_Visible(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "visible"
		   });		
		addAnnotation
		  (getConfiguration_Enabled(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "enabled"
		   });		
		addAnnotation
		  (getConfiguration_HelpContextId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "helpContextId"
		   });		
		addAnnotation
		  (getConfiguration_ClassName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "className"
		   });		
		addAnnotation
		  (getConfiguration_PluginId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "pluginId"
		   });			
		addAnnotation
		  (configurationListTypeEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ConfigurationList_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationListType_Configuration(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "Configuration"
		   });			
		addAnnotation
		  (containerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ContainerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerConfiguration_Layout(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "layout"
		   });		
		addAnnotation
		  (getContainerConfiguration_Components(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "components"
		   });			
		addAnnotation
		  (controlConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ControlConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getControlConfiguration_LayoutData(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "layoutData"
		   });		
		addAnnotation
		  (getControlConfiguration_Foreground(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "foreground"
		   });		
		addAnnotation
		  (getControlConfiguration_Background(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "background"
		   });			
		addAnnotation
		  (controlPathElementEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ControlPathElement",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getControlPathElement_ConditionProperty(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "conditionProperty"
		   });			
		addAnnotation
		  (getControlPathElement_ConditionPageId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "conditionPageId"
		   });			
		addAnnotation
		  (getControlPathElement_DefaultValue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "defaultValue"
		   });			
		addAnnotation
		  (getControlPathElement_SubPaths(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "subPaths"
		   });			
		addAnnotation
		  (cTabFolderConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "CTabFolderConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCTabFolderConfiguration_TabPosition(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "tabPosition"
		   });			
		addAnnotation
		  (dialogConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "DialogConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDialogConfiguration_Control(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "control"
		   });		
		addAnnotation
		  (getDialogConfiguration_Resizable(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "resizable"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_ConfigurationList(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "ConfigurationList",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (editorConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "EditorConfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (expandBarConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ExpandBarConfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Image",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImage_Path(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "path"
		   });		
		addAnnotation
		  (getImage_Key(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "key"
		   });		
		addAnnotation
		  (getImage_PluginId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "pluginId"
		   });			
		addAnnotation
		  (labelEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Label",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLabel_Value(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (getLabel_Key(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "key"
		   });		
		addAnnotation
		  (getLabel_PluginId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "pluginId"
		   });			
		addAnnotation
		  (layoutEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "Layout",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLayout_HorizontalSpacing(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "horizontalSpacing"
		   });			
		addAnnotation
		  (getLayout_MakeColumnsEqualWidth(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "makeColumnsEqualWidth"
		   });			
		addAnnotation
		  (getLayout_MarginBottom(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "marginBottom"
		   });			
		addAnnotation
		  (getLayout_MarginHeight(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "marginHeight"
		   });			
		addAnnotation
		  (getLayout_MarginLeft(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "marginLeft"
		   });			
		addAnnotation
		  (getLayout_MarginRight(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "marginRight"
		   });			
		addAnnotation
		  (getLayout_MarginTop(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "marginTop"
		   });			
		addAnnotation
		  (getLayout_MarginWidth(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "marginWidth"
		   });			
		addAnnotation
		  (getLayout_NumColumns(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "numColumns"
		   });			
		addAnnotation
		  (getLayout_VerticalSpacing(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "verticalSpacing"
		   });			
		addAnnotation
		  (layoutDataEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "LayoutData",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLayoutData_GrabExcessHorizontalSpace(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "grabExcessHorizontalSpace"
		   });			
		addAnnotation
		  (getLayoutData_GrabExcessVerticalSpace(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "grabExcessVerticalSpace"
		   });			
		addAnnotation
		  (getLayoutData_HeightHint(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "heightHint"
		   });			
		addAnnotation
		  (getLayoutData_HorizontalAlignment(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "horizontalAlignment"
		   });			
		addAnnotation
		  (getLayoutData_HorizontalIndent(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "horizontalIndent"
		   });			
		addAnnotation
		  (getLayoutData_HorizontalSpan(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "horizontalSpan"
		   });			
		addAnnotation
		  (getLayoutData_MinimumHeight(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "minimumHeight"
		   });			
		addAnnotation
		  (getLayoutData_MinimumWidth(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "minimumWidth"
		   });			
		addAnnotation
		  (getLayoutData_VerticalAlignment(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "verticalAlignment"
		   });			
		addAnnotation
		  (getLayoutData_VerticalIndent(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "verticalIndent"
		   });			
		addAnnotation
		  (getLayoutData_VerticalSpan(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "verticalSpan"
		   });			
		addAnnotation
		  (getLayoutData_WidthHint(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "widthHint"
		   });			
		addAnnotation
		  (listViewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ListViewerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListViewerConfiguration_MultipleSelectionInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "multipleSelectionInUse"
		   });		
		addAnnotation
		  (getListViewerConfiguration_MultipleCheckInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "multipleCheckInUse"
		   });		
		addAnnotation
		  (getListViewerConfiguration_DuplicateAllowed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "duplicateAllowed"
		   });		
		addAnnotation
		  (getListViewerConfiguration_CheckSelectionInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "checkSelectionInUse"
		   });		
		addAnnotation
		  (getListViewerConfiguration_ThreadingInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "threadingInUse"
		   });		
		addAnnotation
		  (getListViewerConfiguration_CopyItemsInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "copyItemsInUse"
		   });		
		addAnnotation
		  (getListViewerConfiguration_VirtualInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "virtualInUse"
		   });		
		addAnnotation
		  (getListViewerConfiguration_MantainingSelectionState(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "mantainingSelectionState"
		   });		
		addAnnotation
		  (getListViewerConfiguration_MantainingCheckedState(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "mantainingCheckedState"
		   });			
		addAnnotation
		  (mappingViewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "MappingViewerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMappingViewerConfiguration_FromItemRemovedWhenMapped(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "fromItemRemovedWhenMapped"
		   });		
		addAnnotation
		  (getMappingViewerConfiguration_FromItemAddedWhenUnmapped(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "fromItemAddedWhenUnmapped"
		   });		
		addAnnotation
		  (getMappingViewerConfiguration_ToItemRemovedWhenMapped(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "toItemRemovedWhenMapped"
		   });		
		addAnnotation
		  (getMappingViewerConfiguration_ToItemAddedWhenUnmapped(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "toItemAddedWhenUnmapped"
		   });			
		addAnnotation
		  (matrixViewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "MatrixViewerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMatrixViewerConfiguration_CellSelectionInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "cellSelectionInUse"
		   });		
		addAnnotation
		  (getMatrixViewerConfiguration_LinesVisible(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "linesVisible"
		   });			
		addAnnotation
		  (multipleListViewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "MultipleListViewerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultipleListViewerConfiguration_ChildConfiguration(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "childConfiguration"
		   });		
		addAnnotation
		  (getMultipleListViewerConfiguration_ThreadingInUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "threadingInUse"
		   });		
		addAnnotation
		  (nonEmptyStringEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "nonEmptyString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1"
		   });			
		addAnnotation
		  (pagePathElementEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "PagePathElement",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPagePathElement_PageId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "pageId"
		   });			
		addAnnotation
		  (partConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "PartConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPartConfiguration_Control(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "control"
		   });			
		addAnnotation
		  (pathElementEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "PathElement",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPathElement_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (perspectiveConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "PerspectiveConfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (queryResultViewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "QueryResultViewerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueryResultViewerConfiguration_RunningQueryOnFirstUse(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "runningQueryOnFirstUse"
		   });			
		addAnnotation
		  (subPathEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "SubPath",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubPath_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getSubPath_ConditionValue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "conditionValue"
		   });			
		addAnnotation
		  (getSubPath_Path(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "path"
		   });			
		addAnnotation
		  (tabFolderConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "TabFolderConfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (twinViewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "TwinViewerConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTwinViewerConfiguration_ItemAddedLeftToRight(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "itemAddedLeftToRight"
		   });		
		addAnnotation
		  (getTwinViewerConfiguration_ItemAddedRightToLeft(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "itemAddedRightToLeft"
		   });		
		addAnnotation
		  (getTwinViewerConfiguration_ItemRemovedLeftToRight(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "itemRemovedLeftToRight"
		   });		
		addAnnotation
		  (getTwinViewerConfiguration_ItemRemovedRightToLeft(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "itemRemovedRightToLeft"
		   });		
		addAnnotation
		  (getTwinViewerConfiguration_DuplicateAllowed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "duplicateAllowed"
		   });			
		addAnnotation
		  (viewConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ViewConfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (viewerConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ViewerConfiguration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (wizardConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "WizardConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWizardConfiguration_Pages(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "pages"
		   });		
		addAnnotation
		  (getWizardConfiguration_Path(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "path"
		   });			
		addAnnotation
		  (wizardPageConfigurationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "WizardPageConfiguration",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWizardPageConfiguration_Control(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "control"
		   });
	}

} //ConfigurationPackageImpl
