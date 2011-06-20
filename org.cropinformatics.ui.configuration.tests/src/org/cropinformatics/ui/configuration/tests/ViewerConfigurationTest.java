/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ViewerConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewerConfigurationTest extends ContainerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(ViewerConfigurationTest.class);
	}

	/**
	 * Constructs a new Viewer Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewerConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Viewer Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewerConfiguration getFixture()
	{
		return (ViewerConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createViewerConfiguration());
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

} //ViewerConfigurationTest
