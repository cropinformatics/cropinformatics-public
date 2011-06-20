/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ConfigurationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentConfigurationTest extends ConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(ComponentConfigurationTest.class);
	}

	/**
	 * Constructs a new Component Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Component Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentConfiguration getFixture()
	{
		return (ComponentConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createComponentConfiguration());
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

} //ComponentConfigurationTest
