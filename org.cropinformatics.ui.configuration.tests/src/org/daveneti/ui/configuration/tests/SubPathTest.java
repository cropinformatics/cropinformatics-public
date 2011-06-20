/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.SubPath;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Path</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPathTest extends TestCase
{

	/**
	 * The fixture for this Sub Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubPath fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(SubPathTest.class);
	}

	/**
	 * Constructs a new Sub Path test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPathTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Sub Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubPath fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sub Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubPath getFixture()
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
		setFixture(ConfigurationFactory.eINSTANCE.createSubPath());
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

} //SubPathTest
