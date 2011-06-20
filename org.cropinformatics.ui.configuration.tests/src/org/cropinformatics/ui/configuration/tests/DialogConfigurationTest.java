/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.DialogConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dialog Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogConfigurationTest extends ConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(DialogConfigurationTest.class);
	}

	/**
	 * Constructs a new Dialog Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Dialog Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DialogConfiguration getFixture()
	{
		return (DialogConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createDialogConfiguration());
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

} //DialogConfigurationTest
