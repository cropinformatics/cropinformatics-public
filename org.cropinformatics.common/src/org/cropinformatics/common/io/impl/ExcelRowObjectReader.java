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
package org.cropinformatics.common.io.impl;

import java.io.File;

public class ExcelRowObjectReader extends ExcelRowReader<Object>
{

	public ExcelRowObjectReader(String file)
	{
		super(new File(file)) ;
	}

	public ExcelRowObjectReader(File file)
	{
		super(file) ;
	}
	
	public ExcelRowObjectReader(String file, int firstRow, int firstColumn)
	{
		super(file, firstRow, firstColumn) ;
	}

	public ExcelRowObjectReader(File file, int firstRow, int firstColumn)
	{
		super(file, firstRow, firstColumn) ;
	}
	
	public ExcelRowObjectReader(String file, int firstRow, int firstColumn, int lastRow, int lastColumn)
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	public ExcelRowObjectReader(File file, int firstRow, int firstColumn, int lastRow, int lastColumn)
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
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
