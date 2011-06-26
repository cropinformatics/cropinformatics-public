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

import org.cropinformatics.common.io.CellReader;

public abstract class ExcelCellReader<T extends Object> extends AbstractExcelReader<T> implements CellReader<T>
{

	public ExcelCellReader(String file) throws IOException
	{
		super(file) ;
	}

	public ExcelCellReader(File file) throws IOException
	{
		super(file) ;
	}
	
	public ExcelCellReader(String file, int firstRow, int firstColumn) throws IOException
	{
		super(file, firstRow, firstColumn) ;
	}

	public ExcelCellReader(File file, int firstRow, int firstColumn) throws IOException
	{
		super(file, firstRow, firstColumn) ;
	}
	
	public ExcelCellReader(String file, int firstRow, int firstColumn, int lastRow, int lastColumn) throws IOException
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	public ExcelCellReader(File file, int firstRow, int firstColumn, int lastRow, int lastColumn) throws IOException
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	@Override
  public final boolean hasNextRow()
  {
	  return super.hasNextRow() ;
  }

	@Override
  public boolean hasNextColumn()
  {
	  return super.hasNextColumn() ;
  }

	@Override
  public T getCell() throws IOException
  {
	  return super.getCell() ;
  }

	@Override
  public boolean nextColumn() throws IOException
  {
	  return super.nextColumn() ;
  }

	@Override
  public boolean nextRow() throws IOException
  {
		return super.nextRow() ;
  }
	
	@Override
  public void resetColumn() throws IOException
  {
	  super.resetColumn() ;
  }

	@Override
  public void  resetRow() throws IOException
  {
		super.resetRow() ;
  }
	
	@Override
  protected final T[] createArray(int i)
  {
	  return null;
  }

	@Override
  protected final T[][] createArray(int rowCount, int columnCount)
  {
	  return null;
  }
}