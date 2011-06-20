/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.daveneti.ui.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Result Viewer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for viewers that display the results of queries
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.daveneti.ui.configuration.QueryResultViewerConfiguration#isRunningQueryOnFirstUse <em>Running Query On First Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.daveneti.ui.configuration.ConfigurationPackage#getQueryResultViewerConfiguration()
 * @model extendedMetaData="name='QueryResultViewerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface QueryResultViewerConfiguration extends ViewerConfiguration
{
	/**
	 * Returns the value of the '<em><b>Running Query On First Use</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Query On First Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Query On First Use</em>' attribute.
	 * @see #isSetRunningQueryOnFirstUse()
	 * @see #unsetRunningQueryOnFirstUse()
	 * @see #setRunningQueryOnFirstUse(boolean)
	 * @see org.daveneti.ui.configuration.ConfigurationPackage#getQueryResultViewerConfiguration_RunningQueryOnFirstUse()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='runningQueryOnFirstUse'"
	 * @generated
	 */
	boolean isRunningQueryOnFirstUse();

	/**
	 * Sets the value of the '{@link org.daveneti.ui.configuration.QueryResultViewerConfiguration#isRunningQueryOnFirstUse <em>Running Query On First Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Query On First Use</em>' attribute.
	 * @see #isSetRunningQueryOnFirstUse()
	 * @see #unsetRunningQueryOnFirstUse()
	 * @see #isRunningQueryOnFirstUse()
	 * @generated
	 */
	void setRunningQueryOnFirstUse(boolean value);

	/**
	 * Unsets the value of the '{@link org.daveneti.ui.configuration.QueryResultViewerConfiguration#isRunningQueryOnFirstUse <em>Running Query On First Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRunningQueryOnFirstUse()
	 * @see #isRunningQueryOnFirstUse()
	 * @see #setRunningQueryOnFirstUse(boolean)
	 * @generated
	 */
	void unsetRunningQueryOnFirstUse();

	/**
	 * Returns whether the value of the '{@link org.daveneti.ui.configuration.QueryResultViewerConfiguration#isRunningQueryOnFirstUse <em>Running Query On First Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Running Query On First Use</em>' attribute is set.
	 * @see #unsetRunningQueryOnFirstUse()
	 * @see #isRunningQueryOnFirstUse()
	 * @see #setRunningQueryOnFirstUse(boolean)
	 * @generated
	 */
	boolean isSetRunningQueryOnFirstUse();

} // QueryResultViewerConfiguration
