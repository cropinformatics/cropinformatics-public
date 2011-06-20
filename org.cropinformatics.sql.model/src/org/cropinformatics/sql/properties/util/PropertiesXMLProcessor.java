/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties.util;

import java.util.Map;

import org.cropinformatics.sql.properties.PropertiesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		PropertiesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the PropertiesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations()
	{
		if (registrations == null)
		{
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PropertiesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PropertiesResourceFactoryImpl());
		}
		return registrations;
	}

} //PropertiesXMLProcessor
