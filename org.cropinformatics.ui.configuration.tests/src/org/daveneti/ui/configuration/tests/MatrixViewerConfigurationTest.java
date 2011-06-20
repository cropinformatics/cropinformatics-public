/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.MatrixViewerConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Matrix Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixViewerConfigurationTest extends ViewerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(MatrixViewerConfigurationTest.class);
	}

	/**
	 * Constructs a new Matrix Viewer Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixViewerConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Matrix Viewer Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MatrixViewerConfiguration getFixture()
	{
		return (MatrixViewerConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createMatrixViewerConfiguration());
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

} //MatrixViewerConfigurationTest
