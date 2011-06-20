/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cropinformatics.sql.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DBMS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * DBMS
 * <!-- end-model-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getDBMS()
 * @model extendedMetaData="name='DBMS'"
 * @generated
 */
public enum DBMS implements Enumerator
{
	/**
	 * The '<em><b>My SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(0, "MySQL", "MySQL"),

	/**
	 * The '<em><b>Pg SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PG_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	PG_SQL(1, "PgSQL", "PgSQL"),

	/**
	 * The '<em><b>HSQLDB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSQLDB_VALUE
	 * @generated
	 * @ordered
	 */
	HSQLDB(2, "HSQLDB", "HSQLDB"), /**
	 * The '<em><b>SQ Lite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQ_LITE_VALUE
	 * @generated
	 * @ordered
	 */
	SQ_LITE(3, "SQLite", "SQLite"), /**
	 * The '<em><b>MS Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	MS_ACCESS(4, "MSAccess", "MSAccess");

	/**
	 * The '<em><b>My SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My SQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="MySQL"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 0;

	/**
	 * The '<em><b>Pg SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pg SQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PG_SQL
	 * @model name="PgSQL"
	 * @generated
	 * @ordered
	 */
	public static final int PG_SQL_VALUE = 1;

	/**
	 * The '<em><b>HSQLDB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HSQLDB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HSQLDB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HSQLDB_VALUE = 2;

	/**
	 * The '<em><b>SQ Lite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQ Lite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQ_LITE
	 * @model name="SQLite"
	 * @generated
	 * @ordered
	 */
	public static final int SQ_LITE_VALUE = 3;

	/**
	 * The '<em><b>MS Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MS Access</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MS_ACCESS
	 * @model name="MSAccess"
	 * @generated
	 * @ordered
	 */
	public static final int MS_ACCESS_VALUE = 4;

	/**
	 * An array of all the '<em><b>DBMS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DBMS[] VALUES_ARRAY =
		new DBMS[]
		{
			MY_SQL,
			PG_SQL,
			HSQLDB,
			SQ_LITE,
			MS_ACCESS,
		};

	/**
	 * A public read-only list of all the '<em><b>DBMS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DBMS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DBMS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DBMS get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DBMS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DBMS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DBMS getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DBMS result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DBMS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DBMS get(int value)
	{
		switch (value)
		{
			case MY_SQL_VALUE: return MY_SQL;
			case PG_SQL_VALUE: return PG_SQL;
			case HSQLDB_VALUE: return HSQLDB;
			case SQ_LITE_VALUE: return SQ_LITE;
			case MS_ACCESS_VALUE: return MS_ACCESS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DBMS(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //DBMS
