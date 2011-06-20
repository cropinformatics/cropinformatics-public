/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ExpandBarConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expand Bar Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpandBarConfigurationTest extends ContainerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(ExpandBarConfigurationTest.class);
	}

	/**
	 * Constructs a new Expand Bar Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandBarConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Expand Bar Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpandBarConfiguration getFixture()
	{
		return (ExpandBarConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createExpandBarConfiguration());
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

} //ExpandBarConfigurationTest
