/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.impl;

import org.cropinformatics.ui.configuration.CTabFolderConfiguration;
import org.cropinformatics.ui.configuration.Colour;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.Configuration;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ConfigurationListType;
import org.cropinformatics.ui.configuration.ConfigurationPackage;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.ControlPathElement;
import org.cropinformatics.ui.configuration.DialogConfiguration;
import org.cropinformatics.ui.configuration.DocumentRoot;
import org.cropinformatics.ui.configuration.EditorConfiguration;
import org.cropinformatics.ui.configuration.ExpandBarConfiguration;
import org.cropinformatics.ui.configuration.Image;
import org.cropinformatics.ui.configuration.Label;
import org.cropinformatics.ui.configuration.Layout;
import org.cropinformatics.ui.configuration.LayoutData;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.MappingViewerConfiguration;
import org.cropinformatics.ui.configuration.MatrixViewerConfiguration;
import org.cropinformatics.ui.configuration.MultipleListViewerConfiguration;
import org.cropinformatics.ui.configuration.PagePathElement;
import org.cropinformatics.ui.configuration.PartConfiguration;
import org.cropinformatics.ui.configuration.PerspectiveConfiguration;
import org.cropinformatics.ui.configuration.QueryResultViewerConfiguration;
import org.cropinformatics.ui.configuration.SubPath;
import org.cropinformatics.ui.configuration.TabFolderConfiguration;
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.cropinformatics.ui.configuration.ViewConfiguration;
import org.cropinformatics.ui.configuration.ViewerConfiguration;
import org.cropinformatics.ui.configuration.WizardConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init()
	{
		try
		{
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cropinformatics.org/ui/configuration"); 
			if (theConfigurationFactory != null)
			{
				return theConfigurationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ConfigurationPackage.COLOUR: return createColour();
			case ConfigurationPackage.COMPONENT_CONFIGURATION: return createComponentConfiguration();
			case ConfigurationPackage.CONFIGURATION: return createConfiguration();
			case ConfigurationPackage.CONFIGURATION_LIST_TYPE: return createConfigurationListType();
			case ConfigurationPackage.CONTAINER_CONFIGURATION: return createContainerConfiguration();
			case ConfigurationPackage.CONTROL_CONFIGURATION: return createControlConfiguration();
			case ConfigurationPackage.CONTROL_PATH_ELEMENT: return createControlPathElement();
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION: return createCTabFolderConfiguration();
			case ConfigurationPackage.DIALOG_CONFIGURATION: return createDialogConfiguration();
			case ConfigurationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ConfigurationPackage.EDITOR_CONFIGURATION: return createEditorConfiguration();
			case ConfigurationPackage.EXPAND_BAR_CONFIGURATION: return createExpandBarConfiguration();
			case ConfigurationPackage.IMAGE: return createImage();
			case ConfigurationPackage.LABEL: return createLabel();
			case ConfigurationPackage.LAYOUT: return createLayout();
			case ConfigurationPackage.LAYOUT_DATA: return createLayoutData();
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION: return createListViewerConfiguration();
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION: return createMappingViewerConfiguration();
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION: return createMatrixViewerConfiguration();
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION: return createMultipleListViewerConfiguration();
			case ConfigurationPackage.PAGE_PATH_ELEMENT: return createPagePathElement();
			case ConfigurationPackage.PART_CONFIGURATION: return createPartConfiguration();
			case ConfigurationPackage.PERSPECTIVE_CONFIGURATION: return createPerspectiveConfiguration();
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION: return createQueryResultViewerConfiguration();
			case ConfigurationPackage.SUB_PATH: return createSubPath();
			case ConfigurationPackage.TAB_FOLDER_CONFIGURATION: return createTabFolderConfiguration();
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION: return createTwinViewerConfiguration();
			case ConfigurationPackage.VIEW_CONFIGURATION: return createViewConfiguration();
			case ConfigurationPackage.VIEWER_CONFIGURATION: return createViewerConfiguration();
			case ConfigurationPackage.WIZARD_CONFIGURATION: return createWizardConfiguration();
			case ConfigurationPackage.WIZARD_PAGE_CONFIGURATION: return createWizardPageConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ConfigurationPackage.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ConfigurationPackage.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour createColour()
	{
		ColourImpl colour = new ColourImpl();
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentConfiguration createComponentConfiguration()
	{
		ComponentConfigurationImpl componentConfiguration = new ComponentConfigurationImpl();
		return componentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration()
	{
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationListType createConfigurationListType()
	{
		ConfigurationListTypeImpl configurationListType = new ConfigurationListTypeImpl();
		return configurationListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfiguration createContainerConfiguration()
	{
		ContainerConfigurationImpl containerConfiguration = new ContainerConfigurationImpl();
		return containerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConfiguration createControlConfiguration()
	{
		ControlConfigurationImpl controlConfiguration = new ControlConfigurationImpl();
		return controlConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPathElement createControlPathElement()
	{
		ControlPathElementImpl controlPathElement = new ControlPathElementImpl();
		return controlPathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTabFolderConfiguration createCTabFolderConfiguration()
	{
		CTabFolderConfigurationImpl cTabFolderConfiguration = new CTabFolderConfigurationImpl();
		return cTabFolderConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogConfiguration createDialogConfiguration()
	{
		DialogConfigurationImpl dialogConfiguration = new DialogConfigurationImpl();
		return dialogConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot()
	{
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorConfiguration createEditorConfiguration()
	{
		EditorConfigurationImpl editorConfiguration = new EditorConfigurationImpl();
		return editorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandBarConfiguration createExpandBarConfiguration()
	{
		ExpandBarConfigurationImpl expandBarConfiguration = new ExpandBarConfigurationImpl();
		return expandBarConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage()
	{
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel()
	{
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout()
	{
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutData createLayoutData()
	{
		LayoutDataImpl layoutData = new LayoutDataImpl();
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListViewerConfiguration createListViewerConfiguration()
	{
		ListViewerConfigurationImpl listViewerConfiguration = new ListViewerConfigurationImpl();
		return listViewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingViewerConfiguration createMappingViewerConfiguration()
	{
		MappingViewerConfigurationImpl mappingViewerConfiguration = new MappingViewerConfigurationImpl();
		return mappingViewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixViewerConfiguration createMatrixViewerConfiguration()
	{
		MatrixViewerConfigurationImpl matrixViewerConfiguration = new MatrixViewerConfigurationImpl();
		return matrixViewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleListViewerConfiguration createMultipleListViewerConfiguration()
	{
		MultipleListViewerConfigurationImpl multipleListViewerConfiguration = new MultipleListViewerConfigurationImpl();
		return multipleListViewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagePathElement createPagePathElement()
	{
		PagePathElementImpl pagePathElement = new PagePathElementImpl();
		return pagePathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartConfiguration createPartConfiguration()
	{
		PartConfigurationImpl partConfiguration = new PartConfigurationImpl();
		return partConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveConfiguration createPerspectiveConfiguration()
	{
		PerspectiveConfigurationImpl perspectiveConfiguration = new PerspectiveConfigurationImpl();
		return perspectiveConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryResultViewerConfiguration createQueryResultViewerConfiguration()
	{
		QueryResultViewerConfigurationImpl queryResultViewerConfiguration = new QueryResultViewerConfigurationImpl();
		return queryResultViewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPath createSubPath()
	{
		SubPathImpl subPath = new SubPathImpl();
		return subPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabFolderConfiguration createTabFolderConfiguration()
	{
		TabFolderConfigurationImpl tabFolderConfiguration = new TabFolderConfigurationImpl();
		return tabFolderConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwinViewerConfiguration createTwinViewerConfiguration()
	{
		TwinViewerConfigurationImpl twinViewerConfiguration = new TwinViewerConfigurationImpl();
		return twinViewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewConfiguration createViewConfiguration()
	{
		ViewConfigurationImpl viewConfiguration = new ViewConfigurationImpl();
		return viewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewerConfiguration createViewerConfiguration()
	{
		ViewerConfigurationImpl viewerConfiguration = new ViewerConfigurationImpl();
		return viewerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardConfiguration createWizardConfiguration()
	{
		WizardConfigurationImpl wizardConfiguration = new WizardConfigurationImpl();
		return wizardConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPageConfiguration createWizardPageConfiguration()
	{
		WizardPageConfigurationImpl wizardPageConfiguration = new WizardPageConfigurationImpl();
		return wizardPageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue)
	{
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue)
	{
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage()
	{
		return (ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage()
	{
		return ConfigurationPackage.eINSTANCE;
	}

} //ConfigurationFactoryImpl
