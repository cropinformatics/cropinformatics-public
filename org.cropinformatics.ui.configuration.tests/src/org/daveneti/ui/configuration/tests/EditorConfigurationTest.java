/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.EditorConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Editor Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorConfigurationTest extends PartConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(EditorConfigurationTest.class);
	}

	/**
	 * Constructs a new Editor Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Editor Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EditorConfiguration getFixture()
	{
		return (EditorConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createEditorConfiguration());
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

} //EditorConfigurationTest
