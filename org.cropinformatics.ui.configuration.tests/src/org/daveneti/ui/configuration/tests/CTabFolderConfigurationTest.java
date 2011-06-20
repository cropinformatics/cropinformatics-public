/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.daveneti.ui.configuration.CTabFolderConfiguration;
import org.daveneti.ui.configuration.ConfigurationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CTab Folder Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CTabFolderConfigurationTest extends ContainerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(CTabFolderConfigurationTest.class);
	}

	/**
	 * Constructs a new CTab Folder Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTabFolderConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this CTab Folder Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CTabFolderConfiguration getFixture()
	{
		return (CTabFolderConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createCTabFolderConfiguration());
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

} //CTabFolderConfigurationTest
