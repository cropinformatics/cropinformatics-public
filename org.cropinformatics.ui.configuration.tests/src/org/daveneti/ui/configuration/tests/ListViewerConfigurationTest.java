/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>List Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListViewerConfigurationTest extends ViewerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(ListViewerConfigurationTest.class);
	}

	/**
	 * Constructs a new List Viewer Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListViewerConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this List Viewer Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ListViewerConfiguration getFixture()
	{
		return (ListViewerConfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception
	{
		setFixture(ConfigurationFactory.eINSTANCE.createListViewerConfiguration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
	}

} //ListViewerConfigurationTest
