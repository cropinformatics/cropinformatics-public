/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.Layout;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutTest extends TestCase
{

	/**
	 * The fixture for this Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Layout fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(LayoutTest.class);
	}

	/**
	 * Constructs a new Layout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Layout fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Layout getFixture()
	{
		return fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createLayout());
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

} //LayoutTest
