/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.util;

import java.util.List;

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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.cropinformatics.ui.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ConfigurationPackage.COLOUR:
			{
				Colour colour = (Colour)theEObject;
				T result = caseColour(colour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.COMPONENT_CONFIGURATION:
			{
				ComponentConfiguration componentConfiguration = (ComponentConfiguration)theEObject;
				T result = caseComponentConfiguration(componentConfiguration);
				if (result == null) result = caseConfiguration(componentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION:
			{
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_LIST_TYPE:
			{
				ConfigurationListType configurationListType = (ConfigurationListType)theEObject;
				T result = caseConfigurationListType(configurationListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONTAINER_CONFIGURATION:
			{
				ContainerConfiguration containerConfiguration = (ContainerConfiguration)theEObject;
				T result = caseContainerConfiguration(containerConfiguration);
				if (result == null) result = caseControlConfiguration(containerConfiguration);
				if (result == null) result = caseComponentConfiguration(containerConfiguration);
				if (result == null) result = caseConfiguration(containerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONTROL_CONFIGURATION:
			{
				ControlConfiguration controlConfiguration = (ControlConfiguration)theEObject;
				T result = caseControlConfiguration(controlConfiguration);
				if (result == null) result = caseComponentConfiguration(controlConfiguration);
				if (result == null) result = caseConfiguration(controlConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONTROL_PATH_ELEMENT:
			{
				ControlPathElement controlPathElement = (ControlPathElement)theEObject;
				T result = caseControlPathElement(controlPathElement);
				if (result == null) result = casePathElement(controlPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CTAB_FOLDER_CONFIGURATION:
			{
				CTabFolderConfiguration cTabFolderConfiguration = (CTabFolderConfiguration)theEObject;
				T result = caseCTabFolderConfiguration(cTabFolderConfiguration);
				if (result == null) result = caseContainerConfiguration(cTabFolderConfiguration);
				if (result == null) result = caseControlConfiguration(cTabFolderConfiguration);
				if (result == null) result = caseComponentConfiguration(cTabFolderConfiguration);
				if (result == null) result = caseConfiguration(cTabFolderConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DIALOG_CONFIGURATION:
			{
				DialogConfiguration dialogConfiguration = (DialogConfiguration)theEObject;
				T result = caseDialogConfiguration(dialogConfiguration);
				if (result == null) result = caseConfiguration(dialogConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DOCUMENT_ROOT:
			{
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.EDITOR_CONFIGURATION:
			{
				EditorConfiguration editorConfiguration = (EditorConfiguration)theEObject;
				T result = caseEditorConfiguration(editorConfiguration);
				if (result == null) result = casePartConfiguration(editorConfiguration);
				if (result == null) result = caseConfiguration(editorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.EXPAND_BAR_CONFIGURATION:
			{
				ExpandBarConfiguration expandBarConfiguration = (ExpandBarConfiguration)theEObject;
				T result = caseExpandBarConfiguration(expandBarConfiguration);
				if (result == null) result = caseContainerConfiguration(expandBarConfiguration);
				if (result == null) result = caseControlConfiguration(expandBarConfiguration);
				if (result == null) result = caseComponentConfiguration(expandBarConfiguration);
				if (result == null) result = caseConfiguration(expandBarConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.IMAGE:
			{
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.LABEL:
			{
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.LAYOUT:
			{
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.LAYOUT_DATA:
			{
				LayoutData layoutData = (LayoutData)theEObject;
				T result = caseLayoutData(layoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.LIST_VIEWER_CONFIGURATION:
			{
				ListViewerConfiguration listViewerConfiguration = (ListViewerConfiguration)theEObject;
				T result = caseListViewerConfiguration(listViewerConfiguration);
				if (result == null) result = caseViewerConfiguration(listViewerConfiguration);
				if (result == null) result = caseContainerConfiguration(listViewerConfiguration);
				if (result == null) result = caseControlConfiguration(listViewerConfiguration);
				if (result == null) result = caseComponentConfiguration(listViewerConfiguration);
				if (result == null) result = caseConfiguration(listViewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.MAPPING_VIEWER_CONFIGURATION:
			{
				MappingViewerConfiguration mappingViewerConfiguration = (MappingViewerConfiguration)theEObject;
				T result = caseMappingViewerConfiguration(mappingViewerConfiguration);
				if (result == null) result = caseViewerConfiguration(mappingViewerConfiguration);
				if (result == null) result = caseContainerConfiguration(mappingViewerConfiguration);
				if (result == null) result = caseControlConfiguration(mappingViewerConfiguration);
				if (result == null) result = caseComponentConfiguration(mappingViewerConfiguration);
				if (result == null) result = caseConfiguration(mappingViewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.MATRIX_VIEWER_CONFIGURATION:
			{
				MatrixViewerConfiguration matrixViewerConfiguration = (MatrixViewerConfiguration)theEObject;
				T result = caseMatrixViewerConfiguration(matrixViewerConfiguration);
				if (result == null) result = caseViewerConfiguration(matrixViewerConfiguration);
				if (result == null) result = caseContainerConfiguration(matrixViewerConfiguration);
				if (result == null) result = caseControlConfiguration(matrixViewerConfiguration);
				if (result == null) result = caseComponentConfiguration(matrixViewerConfiguration);
				if (result == null) result = caseConfiguration(matrixViewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.MULTIPLE_LIST_VIEWER_CONFIGURATION:
			{
				MultipleListViewerConfiguration multipleListViewerConfiguration = (MultipleListViewerConfiguration)theEObject;
				T result = caseMultipleListViewerConfiguration(multipleListViewerConfiguration);
				if (result == null) result = caseViewerConfiguration(multipleListViewerConfiguration);
				if (result == null) result = caseContainerConfiguration(multipleListViewerConfiguration);
				if (result == null) result = caseControlConfiguration(multipleListViewerConfiguration);
				if (result == null) result = caseComponentConfiguration(multipleListViewerConfiguration);
				if (result == null) result = caseConfiguration(multipleListViewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PAGE_PATH_ELEMENT:
			{
				PagePathElement pagePathElement = (PagePathElement)theEObject;
				T result = casePagePathElement(pagePathElement);
				if (result == null) result = casePathElement(pagePathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PART_CONFIGURATION:
			{
				PartConfiguration partConfiguration = (PartConfiguration)theEObject;
				T result = casePartConfiguration(partConfiguration);
				if (result == null) result = caseConfiguration(partConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PATH_ELEMENT:
			{
				PathElement pathElement = (PathElement)theEObject;
				T result = casePathElement(pathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PERSPECTIVE_CONFIGURATION:
			{
				PerspectiveConfiguration perspectiveConfiguration = (PerspectiveConfiguration)theEObject;
				T result = casePerspectiveConfiguration(perspectiveConfiguration);
				if (result == null) result = casePartConfiguration(perspectiveConfiguration);
				if (result == null) result = caseConfiguration(perspectiveConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.QUERY_RESULT_VIEWER_CONFIGURATION:
			{
				QueryResultViewerConfiguration queryResultViewerConfiguration = (QueryResultViewerConfiguration)theEObject;
				T result = caseQueryResultViewerConfiguration(queryResultViewerConfiguration);
				if (result == null) result = caseViewerConfiguration(queryResultViewerConfiguration);
				if (result == null) result = caseContainerConfiguration(queryResultViewerConfiguration);
				if (result == null) result = caseControlConfiguration(queryResultViewerConfiguration);
				if (result == null) result = caseComponentConfiguration(queryResultViewerConfiguration);
				if (result == null) result = caseConfiguration(queryResultViewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.SUB_PATH:
			{
				SubPath subPath = (SubPath)theEObject;
				T result = caseSubPath(subPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.TAB_FOLDER_CONFIGURATION:
			{
				TabFolderConfiguration tabFolderConfiguration = (TabFolderConfiguration)theEObject;
				T result = caseTabFolderConfiguration(tabFolderConfiguration);
				if (result == null) result = caseContainerConfiguration(tabFolderConfiguration);
				if (result == null) result = caseControlConfiguration(tabFolderConfiguration);
				if (result == null) result = caseComponentConfiguration(tabFolderConfiguration);
				if (result == null) result = caseConfiguration(tabFolderConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.TWIN_VIEWER_CONFIGURATION:
			{
				TwinViewerConfiguration twinViewerConfiguration = (TwinViewerConfiguration)theEObject;
				T result = caseTwinViewerConfiguration(twinViewerConfiguration);
				if (result == null) result = caseViewerConfiguration(twinViewerConfiguration);
				if (result == null) result = caseContainerConfiguration(twinViewerConfiguration);
				if (result == null) result = caseControlConfiguration(twinViewerConfiguration);
				if (result == null) result = caseComponentConfiguration(twinViewerConfiguration);
				if (result == null) result = caseConfiguration(twinViewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.VIEW_CONFIGURATION:
			{
				ViewConfiguration viewConfiguration = (ViewConfiguration)theEObject;
				T result = caseViewConfiguration(viewConfiguration);
				if (result == null) result = casePartConfiguration(viewConfiguration);
				if (result == null) result = caseConfiguration(viewConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.VIEWER_CONFIGURATION:
			{
				ViewerConfiguration viewerConfiguration = (ViewerConfiguration)theEObject;
				T result = caseViewerConfiguration(viewerConfiguration);
				if (result == null) result = caseContainerConfiguration(viewerConfiguration);
				if (result == null) result = caseControlConfiguration(viewerConfiguration);
				if (result == null) result = caseComponentConfiguration(viewerConfiguration);
				if (result == null) result = caseConfiguration(viewerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.WIZARD_CONFIGURATION:
			{
				WizardConfiguration wizardConfiguration = (WizardConfiguration)theEObject;
				T result = caseWizardConfiguration(wizardConfiguration);
				if (result == null) result = caseConfiguration(wizardConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.WIZARD_PAGE_CONFIGURATION:
			{
				WizardPageConfiguration wizardPageConfiguration = (WizardPageConfiguration)theEObject;
				T result = caseWizardPageConfiguration(wizardPageConfiguration);
				if (result == null) result = caseConfiguration(wizardPageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColour(Colour object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentConfiguration(ComponentConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationListType(ConfigurationListType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerConfiguration(ContainerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConfiguration(ControlConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlPathElement(ControlPathElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTab Folder Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTab Folder Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTabFolderConfiguration(CTabFolderConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogConfiguration(DialogConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditorConfiguration(EditorConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expand Bar Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expand Bar Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandBarConfiguration(ExpandBarConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutData(LayoutData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListViewerConfiguration(ListViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingViewerConfiguration(MappingViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixViewerConfiguration(MatrixViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple List Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple List Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleListViewerConfiguration(MultipleListViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagePathElement(PagePathElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartConfiguration(PartConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathElement(PathElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveConfiguration(PerspectiveConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Result Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Result Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryResultViewerConfiguration(QueryResultViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPath(SubPath object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Folder Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Folder Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabFolderConfiguration(TabFolderConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twin Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twin Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwinViewerConfiguration(TwinViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewConfiguration(ViewConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewerConfiguration(ViewerConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizardConfiguration(WizardConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard Page Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard Page Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizardPageConfiguration(WizardPageConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ConfigurationSwitch
