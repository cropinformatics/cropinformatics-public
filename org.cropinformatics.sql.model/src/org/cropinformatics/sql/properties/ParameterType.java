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
 * A representation of the literals of the enumeration '<em><b>Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Parameter Types
 * <!-- end-model-doc -->
 * @see org.cropinformatics.sql.properties.PropertiesPackage#getParameterType()
 * @model extendedMetaData="name='ParameterType'"
 * @generated
 */
public enum ParameterType implements Enumerator
{
	/**
	 * The '<em><b>Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(0, "Array", "Array"),

	/**
	 * The '<em><b>Ascii Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCII_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	ASCII_STREAM(1, "AsciiStream", "AsciiStream"),

	/**
	 * The '<em><b>Big Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_DECIMAL(2, "BigDecimal", "BigDecimal"),

	/**
	 * The '<em><b>Binary Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_STREAM(3, "BinaryStream", "BinaryStream"),

	/**
	 * The '<em><b>Blob</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOB_VALUE
	 * @generated
	 * @ordered
	 */
	BLOB(4, "Blob", "Blob"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(5, "Boolean", "Boolean"),

	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(6, "Byte", "Byte"),

	/**
	 * The '<em><b>Bytes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES(7, "Bytes", "Bytes"),

	/**
	 * The '<em><b>Character Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER_STREAM(8, "CharacterStream", "CharacterStream"),

	/**
	 * The '<em><b>Clob</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOB_VALUE
	 * @generated
	 * @ordered
	 */
	CLOB(9, "Clob", "Clob"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(10, "Date", "Date"),

	/**
	 * The '<em><b>Date Calendar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_CALENDAR_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_CALENDAR(11, "DateCalendar", "DateCalendar"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(12, "Double", "Double"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(13, "Float", "Float"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(14, "Int", "Int"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(15, "Long", "Long"),

	/**
	 * The '<em><b>Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(16, "Object", "Object"),

	/**
	 * The '<em><b>Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(17, "Ref", "Ref"),

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(18, "Short", "Short"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(19, "String", "String"),

	/**
	 * The '<em><b>Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(20, "Token", "Token"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(21, "Time", "Time"),

	/**
	 * The '<em><b>Time Calendar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_CALENDAR_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_CALENDAR(22, "TimeCalendar", "TimeCalendar"),

	/**
	 * The '<em><b>Timestamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(23, "Timestamp", "Timestamp"),

	/**
	 * The '<em><b>Time Stamp Calendar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP_CALENDAR_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_STAMP_CALENDAR(24, "TimeStampCalendar", "TimeStampCalendar"),

	/**
	 * The '<em><b>Unicode Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNICODE_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_STREAM(25, "UnicodeStream", "UnicodeStream"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(26, "URL", "URL");

	/**
	 * The '<em><b>Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model name="Array"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 0;

	/**
	 * The '<em><b>Ascii Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ascii Stream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCII_STREAM
	 * @model name="AsciiStream"
	 * @generated
	 * @ordered
	 */
	public static final int ASCII_STREAM_VALUE = 1;

	/**
	 * The '<em><b>Big Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Big Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG_DECIMAL
	 * @model name="BigDecimal"
	 * @generated
	 * @ordered
	 */
	public static final int BIG_DECIMAL_VALUE = 2;

	/**
	 * The '<em><b>Binary Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary Stream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_STREAM
	 * @model name="BinaryStream"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_STREAM_VALUE = 3;

	/**
	 * The '<em><b>Blob</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blob</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOB
	 * @model name="Blob"
	 * @generated
	 * @ordered
	 */
	public static final int BLOB_VALUE = 4;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 5;

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model name="Byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 6;

	/**
	 * The '<em><b>Bytes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bytes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTES
	 * @model name="Bytes"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES_VALUE = 7;

	/**
	 * The '<em><b>Character Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Character Stream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_STREAM
	 * @model name="CharacterStream"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_STREAM_VALUE = 8;

	/**
	 * The '<em><b>Clob</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clob</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOB
	 * @model name="Clob"
	 * @generated
	 * @ordered
	 */
	public static final int CLOB_VALUE = 9;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 10;

	/**
	 * The '<em><b>Date Calendar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Calendar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_CALENDAR
	 * @model name="DateCalendar"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_CALENDAR_VALUE = 11;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 12;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="Float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 13;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="Int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 14;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="Long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 15;

	/**
	 * The '<em><b>Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model name="Object"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 16;

	/**
	 * The '<em><b>Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @model name="Ref"
	 * @generated
	 * @ordered
	 */
	public static final int REF_VALUE = 17;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model name="Short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 18;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 19;

	/**
	 * The '<em><b>Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model name="Token"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 20;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="Time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 21;

	/**
	 * The '<em><b>Time Calendar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Calendar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_CALENDAR
	 * @model name="TimeCalendar"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_CALENDAR_VALUE = 22;

	/**
	 * The '<em><b>Timestamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model name="Timestamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 23;

	/**
	 * The '<em><b>Time Stamp Calendar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Stamp Calendar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP_CALENDAR
	 * @model name="TimeStampCalendar"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_STAMP_CALENDAR_VALUE = 24;

	/**
	 * The '<em><b>Unicode Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unicode Stream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNICODE_STREAM
	 * @model name="UnicodeStream"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_STREAM_VALUE = 25;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 26;

	/**
	 * An array of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterType[] VALUES_ARRAY =
		new ParameterType[]
		{
			ARRAY,
			ASCII_STREAM,
			BIG_DECIMAL,
			BINARY_STREAM,
			BLOB,
			BOOLEAN,
			BYTE,
			BYTES,
			CHARACTER_STREAM,
			CLOB,
			DATE,
			DATE_CALENDAR,
			DOUBLE,
			FLOAT,
			INT,
			LONG,
			OBJECT,
			REF,
			SHORT,
			STRING,
			TOKEN,
			TIME,
			TIME_CALENDAR,
			TIMESTAMP,
			TIME_STAMP_CALENDAR,
			UNICODE_STREAM,
			URL,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			ParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			ParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType get(int value)
	{
		switch (value)
		{
			case ARRAY_VALUE: return ARRAY;
			case ASCII_STREAM_VALUE: return ASCII_STREAM;
			case BIG_DECIMAL_VALUE: return BIG_DECIMAL;
			case BINARY_STREAM_VALUE: return BINARY_STREAM;
			case BLOB_VALUE: return BLOB;
			case BOOLEAN_VALUE: return BOOLEAN;
			case BYTE_VALUE: return BYTE;
			case BYTES_VALUE: return BYTES;
			case CHARACTER_STREAM_VALUE: return CHARACTER_STREAM;
			case CLOB_VALUE: return CLOB;
			case DATE_VALUE: return DATE;
			case DATE_CALENDAR_VALUE: return DATE_CALENDAR;
			case DOUBLE_VALUE: return DOUBLE;
			case FLOAT_VALUE: return FLOAT;
			case INT_VALUE: return INT;
			case LONG_VALUE: return LONG;
			case OBJECT_VALUE: return OBJECT;
			case REF_VALUE: return REF;
			case SHORT_VALUE: return SHORT;
			case STRING_VALUE: return STRING;
			case TOKEN_VALUE: return TOKEN;
			case TIME_VALUE: return TIME;
			case TIME_CALENDAR_VALUE: return TIME_CALENDAR;
			case TIMESTAMP_VALUE: return TIMESTAMP;
			case TIME_STAMP_CALENDAR_VALUE: return TIME_STAMP_CALENDAR;
			case UNICODE_STREAM_VALUE: return UNICODE_STREAM;
			case URL_VALUE: return URL;
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
	private ParameterType(int value, String name, String literal)
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
	
} //ParameterType
