/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.daveneti.ui.configuration.Colour;
import org.daveneti.ui.configuration.ConfigurationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColourTest extends TestCase
{

	/**
	 * The fixture for this Colour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Colour fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(ColourTest.class);
	}

	/**
	 * Constructs a new Colour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Colour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Colour fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Colour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Colour getFixture()
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
		setFixture(ConfigurationFactory.eINSTANCE.createColour());
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

} //ColourTest
