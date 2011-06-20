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
import java.util.List;

import org.cropinformatics.common.io.RowReader;

public abstract class ExcelRowReader<T extends Object> extends AbstractExcelReader<T> implements RowReader<T>
{
	public ExcelRowReader(String file)
	{
		super(file) ;
	}

	public ExcelRowReader(File file)
	{
		super(file) ;
	}
	
	public ExcelRowReader(String file, int firstRow, int firstColumn)
	{
		super(file, firstRow, firstColumn) ;
	}

	public ExcelRowReader(File file, int firstRow, int firstColumn)
	{
		super(file, firstRow, firstColumn) ;
	}
	
	public ExcelRowReader(String file, int firstRow, int firstColumn, int lastRow, int lastColumn)
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	public ExcelRowReader(File file, int firstRow, int firstColumn, int lastRow, int lastColumn)
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	@Override
	public boolean hasNextRow()
  {
		return super.hasNextRow() ;
  }

	@Override
	public T[] getRowArray() throws IOException
  {
		return super.getRowArray() ;
  }
	
	@Override
	public List<T> getRowCells() throws IOException
  {
		return super.getRowCells() ;
  }
	
	@Override
  public boolean nextRow() throws IOException
  {
	  return super.nextRow() ;
  }
}
