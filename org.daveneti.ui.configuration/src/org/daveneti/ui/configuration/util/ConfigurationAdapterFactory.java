/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.util;

import org.daveneti.ui.configuration.CTabFolderConfiguration;
import org.daveneti.ui.configuration.Colour;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.Configuration;
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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.daveneti.ui.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationSwitch<Adapter> modelSwitch =
		new ConfigurationSwitch<Adapter>()
		{
			@Override
			public Adapter caseColour(Colour object)
			{
				return createColourAdapter();
			}
			@Override
			public Adapter caseComponentConfiguration(ComponentConfiguration object)
			{
				return createComponentConfigurationAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object)
			{
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseConfigurationListType(ConfigurationListType object)
			{
				return createConfigurationListTypeAdapter();
			}
			@Override
			public Adapter caseContainerConfiguration(ContainerConfiguration object)
			{
				return createContainerConfigurationAdapter();
			}
			@Override
			public Adapter caseControlConfiguration(ControlConfiguration object)
			{
				return createControlConfigurationAdapter();
			}
			@Override
			public Adapter caseControlPathElement(ControlPathElement object)
			{
				return createControlPathElementAdapter();
			}
			@Override
			public Adapter caseCTabFolderConfiguration(CTabFolderConfiguration object)
			{
				return createCTabFolderConfigurationAdapter();
			}
			@Override
			public Adapter caseDialogConfiguration(DialogConfiguration object)
			{
				return createDialogConfigurationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object)
			{
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEditorConfiguration(EditorConfiguration object)
			{
				return createEditorConfigurationAdapter();
			}
			@Override
			public Adapter caseExpandBarConfiguration(ExpandBarConfiguration object)
			{
				return createExpandBarConfigurationAdapter();
			}
			@Override
			public Adapter caseImage(Image object)
			{
				return createImageAdapter();
			}
			@Override
			public Adapter caseLabel(Label object)
			{
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object)
			{
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseLayoutData(LayoutData object)
			{
				return createLayoutDataAdapter();
			}
			@Override
			public Adapter caseListViewerConfiguration(ListViewerConfiguration object)
			{
				return createListViewerConfigurationAdapter();
			}
			@Override
			public Adapter caseMappingViewerConfiguration(MappingViewerConfiguration object)
			{
				return createMappingViewerConfigurationAdapter();
			}
			@Override
			public Adapter caseMatrixViewerConfiguration(MatrixViewerConfiguration object)
			{
				return createMatrixViewerConfigurationAdapter();
			}
			@Override
			public Adapter caseMultipleListViewerConfiguration(MultipleListViewerConfiguration object)
			{
				return createMultipleListViewerConfigurationAdapter();
			}
			@Override
			public Adapter casePagePathElement(PagePathElement object)
			{
				return createPagePathElementAdapter();
			}
			@Override
			public Adapter casePartConfiguration(PartConfiguration object)
			{
				return createPartConfigurationAdapter();
			}
			@Override
			public Adapter casePathElement(PathElement object)
			{
				return createPathElementAdapter();
			}
			@Override
			public Adapter casePerspectiveConfiguration(PerspectiveConfiguration object)
			{
				return createPerspectiveConfigurationAdapter();
			}
			@Override
			public Adapter caseQueryResultViewerConfiguration(QueryResultViewerConfiguration object)
			{
				return createQueryResultViewerConfigurationAdapter();
			}
			@Override
			public Adapter caseSubPath(SubPath object)
			{
				return createSubPathAdapter();
			}
			@Override
			public Adapter caseTabFolderConfiguration(TabFolderConfiguration object)
			{
				return createTabFolderConfigurationAdapter();
			}
			@Override
			public Adapter caseTwinViewerConfiguration(TwinViewerConfiguration object)
			{
				return createTwinViewerConfigurationAdapter();
			}
			@Override
			public Adapter caseViewConfiguration(ViewConfiguration object)
			{
				return createViewConfigurationAdapter();
			}
			@Override
			public Adapter caseViewerConfiguration(ViewerConfiguration object)
			{
				return createViewerConfigurationAdapter();
			}
			@Override
			public Adapter caseWizardConfiguration(WizardConfiguration object)
			{
				return createWizardConfigurationAdapter();
			}
			@Override
			public Adapter caseWizardPageConfiguration(WizardPageConfiguration object)
			{
				return createWizardPageConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.Colour
	 * @generated
	 */
	public Adapter createColourAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ComponentConfiguration <em>Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ComponentConfiguration
	 * @generated
	 */
	public Adapter createComponentConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ConfigurationListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ConfigurationListType
	 * @generated
	 */
	public Adapter createConfigurationListTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ContainerConfiguration <em>Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ContainerConfiguration
	 * @generated
	 */
	public Adapter createContainerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ControlConfiguration <em>Control Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ControlConfiguration
	 * @generated
	 */
	public Adapter createControlConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ControlPathElement <em>Control Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ControlPathElement
	 * @generated
	 */
	public Adapter createControlPathElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.CTabFolderConfiguration <em>CTab Folder Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.CTabFolderConfiguration
	 * @generated
	 */
	public Adapter createCTabFolderConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.DialogConfiguration <em>Dialog Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.DialogConfiguration
	 * @generated
	 */
	public Adapter createDialogConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.EditorConfiguration <em>Editor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.EditorConfiguration
	 * @generated
	 */
	public Adapter createEditorConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ExpandBarConfiguration <em>Expand Bar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ExpandBarConfiguration
	 * @generated
	 */
	public Adapter createExpandBarConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.Image
	 * @generated
	 */
	public Adapter createImageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.Label
	 * @generated
	 */
	public Adapter createLabelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.LayoutData
	 * @generated
	 */
	public Adapter createLayoutDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ListViewerConfiguration <em>List Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ListViewerConfiguration
	 * @generated
	 */
	public Adapter createListViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.MappingViewerConfiguration <em>Mapping Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.MappingViewerConfiguration
	 * @generated
	 */
	public Adapter createMappingViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.MatrixViewerConfiguration <em>Matrix Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.MatrixViewerConfiguration
	 * @generated
	 */
	public Adapter createMatrixViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.MultipleListViewerConfiguration <em>Multiple List Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.MultipleListViewerConfiguration
	 * @generated
	 */
	public Adapter createMultipleListViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.PagePathElement <em>Page Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.PagePathElement
	 * @generated
	 */
	public Adapter createPagePathElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.PartConfiguration <em>Part Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.PartConfiguration
	 * @generated
	 */
	public Adapter createPartConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.PathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.PathElement
	 * @generated
	 */
	public Adapter createPathElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.PerspectiveConfiguration <em>Perspective Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.PerspectiveConfiguration
	 * @generated
	 */
	public Adapter createPerspectiveConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.QueryResultViewerConfiguration <em>Query Result Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.QueryResultViewerConfiguration
	 * @generated
	 */
	public Adapter createQueryResultViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.SubPath <em>Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.SubPath
	 * @generated
	 */
	public Adapter createSubPathAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.TabFolderConfiguration <em>Tab Folder Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.TabFolderConfiguration
	 * @generated
	 */
	public Adapter createTabFolderConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.TwinViewerConfiguration <em>Twin Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.TwinViewerConfiguration
	 * @generated
	 */
	public Adapter createTwinViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ViewConfiguration <em>View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ViewConfiguration
	 * @generated
	 */
	public Adapter createViewConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.ViewerConfiguration <em>Viewer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.ViewerConfiguration
	 * @generated
	 */
	public Adapter createViewerConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.WizardConfiguration <em>Wizard Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.WizardConfiguration
	 * @generated
	 */
	public Adapter createWizardConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.daveneti.ui.configuration.WizardPageConfiguration <em>Wizard Page Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.daveneti.ui.configuration.WizardPageConfiguration
	 * @generated
	 */
	public Adapter createWizardPageConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ConfigurationAdapterFactory
