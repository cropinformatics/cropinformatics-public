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
import java.io.IOException;

import jxl.Cell;

public class ExcelCellStringReader extends ExcelCellReader<String>
{

	public ExcelCellStringReader(String file) throws IOException
	{
		super(new File(file)) ;
	}

	public ExcelCellStringReader(File file) throws IOException
	{
		super(file) ;
	}
	
	public ExcelCellStringReader(String file, int firstRow, int firstColumn) throws IOException
	{
		super(file, firstRow, firstColumn) ;
	}

	public ExcelCellStringReader(File file, int firstRow, int firstColumn) throws IOException
	{
		super(file, firstRow, firstColumn) ;
	}
	
	public ExcelCellStringReader(String file, int firstRow, int firstColumn, int lastRow, int lastColumn) throws IOException
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	public ExcelCellStringReader(File file, int firstRow, int firstColumn, int lastRow, int lastColumn) throws IOException
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}
	
	@Override
	protected String getCellValue(Cell cell)
	{
		if (!isNull(cell))
		{
			return cell.getContents() ;
		}
		else
		{
			return null;
		}
  }
}
