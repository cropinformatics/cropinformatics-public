/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.util;

import java.util.Map;

import org.cropinformatics.ui.configuration.CTabFolderConfiguration;
import org.cropinformatics.ui.configuration.Colour;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.Configuration;
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
import org.cropinformatics.ui.configuration.PathElement;
import org.cropinformatics.ui.configuration.PerspectiveConfiguration;
import org.cropinformatics.ui.configuration.QueryResultViewerConfiguration;
import org.cropinformatics.ui.configuration.SubPath;
import org.cropinformatics.ui.configuration.TabFolderConfiguration;
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.cropinformatics.ui.configuration.ViewConfiguration;
import org.cropinformatics.ui.configuration.ViewerConfiguration;
import org.cropinformatics.ui.configuration.WizardConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConfigurationValidator INSTANCE = new ConfigurationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.cropinformatics.ui.configuration";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationValidator()
	{
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return ConfigurationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
			case ConfigurationPackage.COLOUR:
				return validateColour((Colour)value, diagnostics, context);
			case ConfigurationPackage.COMPONENT_CONFIGURATION:
				return validateComponentConfiguration((ComponentConfiguration)value, diagnostics, context);
			case ConfigurationPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case ConfigurationPackage.CONFIGURATION_LIST_TYPE:
				return validateConfigurationListType((ConfigurationListType)value, diagnostics, context);
			case ConfigurationPackage.CONTAINER_CONFIGURATION:
				return validateContainerConfiguration((ContainerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.CONTROL_CONFIGURATION:
				return validateControlConfiguration((ControlConfiguration)value, diagnostics, context);
			case ConfigurationPackage.CONTROL_PATH_ELEMENT:
				return validateControlPathElement((ControlPathElement)value, diagnostics, context);
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION:
				return validateCTabFolderConfiguration((CTabFolderConfiguration)value, diagnostics, context);
			case ConfigurationPackage.DIALOG_CONFIGURATION:
				return validateDialogConfiguration((DialogConfiguration)value, diagnostics, context);
			case ConfigurationPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ConfigurationPackage.EDITOR_CONFIGURATION:
				return validateEditorConfiguration((EditorConfiguration)value, diagnostics, context);
			case ConfigurationPackage.EXPAND_BAR_CONFIGURATION:
				return validateExpandBarConfiguration((ExpandBarConfiguration)value, diagnostics, context);
			case ConfigurationPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case ConfigurationPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case ConfigurationPackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			case ConfigurationPackage.LAYOUT_DATA:
				return validateLayoutData((LayoutData)value, diagnostics, context);
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION:
				return validateListViewerConfiguration((ListViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION:
				return validateMappingViewerConfiguration((MappingViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION:
				return validateMatrixViewerConfiguration((MatrixViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION:
				return validateMultipleListViewerConfiguration((MultipleListViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.PAGE_PATH_ELEMENT:
				return validatePagePathElement((PagePathElement)value, diagnostics, context);
			case ConfigurationPackage.PART_CONFIGURATION:
				return validatePartConfiguration((PartConfiguration)value, diagnostics, context);
			case ConfigurationPackage.PATH_ELEMENT:
				return validatePathElement((PathElement)value, diagnostics, context);
			case ConfigurationPackage.PERSPECTIVE_CONFIGURATION:
				return validatePerspectiveConfiguration((PerspectiveConfiguration)value, diagnostics, context);
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION:
				return validateQueryResultViewerConfiguration((QueryResultViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.SUB_PATH:
				return validateSubPath((SubPath)value, diagnostics, context);
			case ConfigurationPackage.TAB_FOLDER_CONFIGURATION:
				return validateTabFolderConfiguration((TabFolderConfiguration)value, diagnostics, context);
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION:
				return validateTwinViewerConfiguration((TwinViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.VIEW_CONFIGURATION:
				return validateViewConfiguration((ViewConfiguration)value, diagnostics, context);
			case ConfigurationPackage.VIEWER_CONFIGURATION:
				return validateViewerConfiguration((ViewerConfiguration)value, diagnostics, context);
			case ConfigurationPackage.WIZARD_CONFIGURATION:
				return validateWizardConfiguration((WizardConfiguration)value, diagnostics, context);
			case ConfigurationPackage.WIZARD_PAGE_CONFIGURATION:
				return validateWizardPageConfiguration((WizardPageConfiguration)value, diagnostics, context);
			case ConfigurationPackage.NON_EMPTY_STRING:
				return validateNonEmptyString((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColour(Colour colour, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(colour, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentConfiguration(ComponentConfiguration componentConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(componentConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(configuration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationListType(ConfigurationListType configurationListType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(configurationListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerConfiguration(ContainerConfiguration containerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(containerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlConfiguration(ControlConfiguration controlConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(controlConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlPathElement(ControlPathElement controlPathElement, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(controlPathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTabFolderConfiguration(CTabFolderConfiguration cTabFolderConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(cTabFolderConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialogConfiguration(DialogConfiguration dialogConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dialogConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditorConfiguration(EditorConfiguration editorConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(editorConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpandBarConfiguration(ExpandBarConfiguration expandBarConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(expandBarConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(layout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutData(LayoutData layoutData, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(layoutData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListViewerConfiguration(ListViewerConfiguration listViewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(listViewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingViewerConfiguration(MappingViewerConfiguration mappingViewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(mappingViewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatrixViewerConfiguration(MatrixViewerConfiguration matrixViewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(matrixViewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleListViewerConfiguration(MultipleListViewerConfiguration multipleListViewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(multipleListViewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagePathElement(PagePathElement pagePathElement, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(pagePathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartConfiguration(PartConfiguration partConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(partConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathElement(PathElement pathElement, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(pathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveConfiguration(PerspectiveConfiguration perspectiveConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(perspectiveConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryResultViewerConfiguration(QueryResultViewerConfiguration queryResultViewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(queryResultViewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubPath(SubPath subPath, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(subPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabFolderConfiguration(TabFolderConfiguration tabFolderConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(tabFolderConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwinViewerConfiguration(TwinViewerConfiguration twinViewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(twinViewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewConfiguration(ViewConfiguration viewConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(viewConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewerConfiguration(ViewerConfiguration viewerConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(viewerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizardConfiguration(WizardConfiguration wizardConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(wizardConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizardPageConfiguration(WizardPageConfiguration wizardPageConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(wizardPageConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		boolean result = validateNonEmptyString_MinLength(nonEmptyString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MinLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		int length = nonEmptyString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ConfigurationPackage.Literals.NON_EMPTY_STRING, nonEmptyString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ConfigurationValidator
