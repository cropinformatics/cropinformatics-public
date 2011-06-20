/*******************************************************************************
 * Copyright 2010 Guy Davenport
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cropinformatics.ui.utils;

import org.cropinformatics.common.Identification;
public class LabelUtils
{
	private static final String EMPTY_STRING = "";

	/**
	 * Gets a string name for an object. By default if the object implements the
	 * {@link Identification}the
	 * getName method is used in each case. If the object is a String or Number
	 * the {@link Object#toString()} method is used, otherwise null returned
	 * 
	 * @param object
	 * @return a string name for the object
	 */
	public static String getName(Object object)
	{
		if (object instanceof Identification)
			return ((Identification)object).getName() ;
		else
			if (object instanceof String || object instanceof Number)
				return object.toString() ;
			else
				return null ;
	}

	/**
	 * Gets a string label for an object. By default if the object implements the
	 * {@link Identification} the
	 * getName method is used in each case, otherwise the {@link Object#toString()} method is used
	 * 
	 * @param object
	 * @return a string name for the object
	 */
	public static String getLabel(Object object)
	{
		if (object instanceof Identification)
			return ((Identification)object).getName() ;
		else
			if (object != null)
				return object.toString() ;
			else
				return EMPTY_STRING ;
	}
}
