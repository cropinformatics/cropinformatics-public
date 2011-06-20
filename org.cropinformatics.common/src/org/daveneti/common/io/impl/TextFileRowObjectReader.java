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
package org.daveneti.common.io.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextFileRowObjectReader extends TextFileRowReader<Object>
{
	public TextFileRowObjectReader(String file) throws FileNotFoundException, IOException
	{
		super(new File(file)) ;
	}

	public TextFileRowObjectReader(File file) throws FileNotFoundException, IOException
	{
		super(file) ;
	}
	
	public TextFileRowObjectReader(String file, int firstRow, int firstColumn) throws FileNotFoundException, IOException
	{
		super(file, firstRow, firstColumn) ;
	}

	public TextFileRowObjectReader(File file, int firstRow, int firstColumn) throws FileNotFoundException, IOException
	{
		super(file, firstRow, firstColumn) ;
	}

	@Override
  protected Object[] createArray(int size)
  {
	  return new Object[size];
  }

	@Override
  protected Object[][] createArray(int rowCount, int columnCount)
  {
	  return new Object[rowCount][columnCount];
  }

}
