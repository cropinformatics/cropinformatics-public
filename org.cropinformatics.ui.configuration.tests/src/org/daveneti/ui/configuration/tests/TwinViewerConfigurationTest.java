/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.TwinViewerConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Twin Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwinViewerConfigurationTest extends ViewerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(TwinViewerConfigurationTest.class);
	}

	/**
	 * Constructs a new Twin Viewer Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwinViewerConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Twin Viewer Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TwinViewerConfiguration getFixture()
	{
		return (TwinViewerConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createTwinViewerConfiguration());
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

} //TwinViewerConfigurationTest
