/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.PerspectiveConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Perspective Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerspectiveConfigurationTest extends PartConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(PerspectiveConfigurationTest.class);
	}

	/**
	 * Constructs a new Perspective Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Perspective Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PerspectiveConfiguration getFixture()
	{
		return (PerspectiveConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createPerspectiveConfiguration());
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

} //PerspectiveConfigurationTest
