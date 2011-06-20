/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.MultipleListViewerConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiple List Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultipleListViewerConfigurationTest extends ViewerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(MultipleListViewerConfigurationTest.class);
	}

	/**
	 * Constructs a new Multiple List Viewer Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleListViewerConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Multiple List Viewer Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultipleListViewerConfiguration getFixture()
	{
		return (MultipleListViewerConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createMultipleListViewerConfiguration());
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

} //MultipleListViewerConfigurationTest
