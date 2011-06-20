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
import java.io.IOException;
import java.util.List;

import org.daveneti.common.io.TableReader;

public class AbstractExcelTableReader<T extends Object> extends AbstractExcelReader<T> implements TableReader<T>
{
	public AbstractExcelTableReader(String file)
	{
		super(new File(file)) ;
	}

	public AbstractExcelTableReader(File file)
	{
		super(file) ;
	}
	
	public AbstractExcelTableReader(String file, int firstRow, int firstColumn)
	{
		super(file, firstRow, firstColumn) ;
	}

	public AbstractExcelTableReader(File file, int firstRow, int firstColumn)
	{
		super(file, firstRow, firstColumn) ;
	}
	
	public AbstractExcelTableReader(String file, int firstRow, int firstColumn, int lastRow, int lastColumn)
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}

	public AbstractExcelTableReader(File file, int firstRow, int firstColumn, int lastRow, int lastColumn)
	{
		super(file, firstRow, firstColumn, lastRow, lastColumn) ;
	}
	
	@Override
  public List<List<T>> readCells() throws IOException
	{
		return super.readCells() ;
	}
	
	@Override
  public T[][] readCellsAsArray() throws IOException
	{
		return super.readCellsAsArray() ;
	}

	@Override
  protected T[] createArray(int i)
  {
	  // TODO Auto-generated method stub
	  return null;
  }

	@Override
  protected T[][] createArray(int rowCount, int columnCount)
  {
	  // TODO Auto-generated method stub
	  return null;
  }
}
