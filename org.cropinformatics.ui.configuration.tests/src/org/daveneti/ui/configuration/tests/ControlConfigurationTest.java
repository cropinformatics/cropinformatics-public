/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ControlConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Control Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlConfigurationTest extends ComponentConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(ControlConfigurationTest.class);
	}

	/**
	 * Constructs a new Control Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Control Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ControlConfiguration getFixture()
	{
		return (ControlConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createControlConfiguration());
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

} //ControlConfigurationTest
