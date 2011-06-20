/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.TabFolderConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tab Folder Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TabFolderConfigurationTest extends ContainerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(TabFolderConfigurationTest.class);
	}

	/**
	 * Constructs a new Tab Folder Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabFolderConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Tab Folder Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TabFolderConfiguration getFixture()
	{
		return (TabFolderConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createTabFolderConfiguration());
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

} //TabFolderConfigurationTest
