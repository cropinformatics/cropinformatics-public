/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration.tests;

import junit.textui.TestRunner;

import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.QueryResultViewerConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Query Result Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryResultViewerConfigurationTest extends ViewerConfigurationTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(QueryResultViewerConfigurationTest.class);
	}

	/**
	 * Constructs a new Query Result Viewer Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryResultViewerConfigurationTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Query Result Viewer Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QueryResultViewerConfiguration getFixture()
	{
		return (QueryResultViewerConfiguration)fixture;
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
		setFixture(ConfigurationFactory.eINSTANCE.createQueryResultViewerConfiguration());
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

} //QueryResultViewerConfigurationTest
