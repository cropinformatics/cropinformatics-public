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
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.common.AssertionFailed;
import jxl.read.biff.BiffException;

public abstract class AbstractExcelReader<T extends Object>
{
	private File file;
	private int spreadSheetIndex = 0 ;
	private Workbook workbook;
	private int firstRow ;
	private int firstColumn ;
	private int lastRow ;
	private int lastColumn ;
	private Sheet sheet = null ;
	private int rowIndex = 0;
	private int columnIndex = 0;
	private int sheetColumns;
	private int sheetRows;
	private int actualFirstRow ;		
	private int actualFirstColumn ;
	private int actualLastRow ;
	private int actualLastColumn ;
	
	public AbstractExcelReader(String file) throws IOException
	{
		this(new File(file), 0, 0, -1, -1) ;
	}

	public AbstractExcelReader(File file) throws IOException
	{
		this(file, 0, 0, -1, -1) ;
	}
	
	public AbstractExcelReader(String file, int firstRow, int firstColumn) throws IOException
	{
		this(file, firstRow, firstColumn, -1, -1) ;
	}

	public AbstractExcelReader(File file, int firstRow, int firstColumn) throws IOException
	{
		this(file, firstRow, firstColumn, -1, -1) ;
	}
	
	public AbstractExcelReader(String file, int firstRow, int firstColumn, int lastRow, int lastColumn) throws IOException
	{
		this(new File(file), firstRow, firstColumn, lastRow, lastColumn) ;
	}

	public AbstractExcelReader(File file, int firstRow, int firstColumn, int lastRow, int lastColumn) throws IOException
	{
		this.file = file;
		this.firstRow = firstRow ;
		this.firstColumn = firstColumn ;
		this.lastRow = lastRow ;
		this.lastColumn = lastColumn ;
		
		reset() ;
		
		cacheSheet() ;
	}
	
  public final boolean ready()
  {
	  try
    {
	    return getWorkbook() != null;
    }
    catch (Exception e)
    {
	    return false ;
    }
  }
	
  public final void close()
  {
	  if (workbook != null)
	  	workbook.close() ;
	  
	  workbook = null ;
  }
  
  public final void reset()
  {
		this.rowIndex = firstRow - 1;
		this.columnIndex = firstColumn - 1;
		sheet = null ;
  }
	
  public final File getFile()
  {
  	return file;
  }

  public final void setFile(File file)
  {
  	this.file = file;
  }

  public final int getSpreadSheetCount() throws IOException
  {
  	try
    {
	    return getWorkbook().getNumberOfSheets();
    }
    catch (BiffException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }
  
  public final int getSpreadSheetIndex()
  {
  	return spreadSheetIndex;
  }

	public synchronized final void setSpreadSheetIndex(int spreadSheetIndex) throws IOException
  {
		try
    {
			String[] names = getWorkbook().getSheetNames() ;
			
			if (names != null && names.length > 0 && spreadSheetIndex >= 0 && spreadSheetIndex < names.length)
				this.spreadSheetIndex = spreadSheetIndex;
			else
				throw new IllegalArgumentException("Index out of range!") ;
			
	  	reset() ;
	  	
			cacheSheet() ;
    }
    catch (BiffException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }
	
  public final String getSpreadSheetName() throws IOException
  {
		try
    {
	    if (spreadSheetIndex != -1)
	    	return getWorkbook().getSheetNames()[spreadSheetIndex] ;
	    else
	    	return null ;
    }
    catch (BiffException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }

	public String[] getSpreadSheetNames() throws IOException
  {
		try
    {
	    return getWorkbook().getSheetNames() ;
    }
    catch (BiffException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }
	
	public final void setSpreadSheetName(String spreadSheetName) throws IOException, IllegalArgumentException
  {
		try
    {
	    String[] spreadSheetNames = getWorkbook().getSheetNames() ;
	    
	    this.spreadSheetIndex = -1 ;
	    int i = 0 ;
	    
	    while (spreadSheetIndex == -1 && i < spreadSheetNames.length)
	    {
	    	if (spreadSheetNames[i].equals(spreadSheetName))
	    		this.spreadSheetIndex = i ;
	    	++i ;
	    }
	    
	    reset() ;
	    
			cacheSheet() ;
    }
    catch (BiffException e)
    {
	    throw new IllegalArgumentException(e.getLocalizedMessage(), e) ;
    }
  }

	protected boolean hasNextRow()
  {
		return rowIndex < actualLastRow ;
  }
	
	protected boolean hasNextColumn()
  {
		return columnIndex < actualLastColumn ;
  }
	
  protected List<List<T>> readCells() throws IOException
	{
  	reset() ;
  	
		cacheSheet() ;
  	
  	List<List<T>> values ;
  	List<T> row ;
  	
    try
    {
	    values = null;

	    if (actualLastRow > actualFirstRow && actualLastColumn > actualFirstColumn)
	    {
	    	values = new ArrayList<List<T>>(actualLastRow - actualFirstRow + 1) ;
	    	
	    	for (int i = actualFirstRow; i <= actualLastRow; i++)
	    	{
		    	row = new ArrayList<T>(actualLastColumn - actualFirstColumn + 1) ;
		    	
		    	for (int j = actualFirstColumn; j <= actualLastColumn; j++)
		    	{
		    		row.add(parseCell(sheet.getCell(j, rowIndex))) ;
		    	}
		    	
		    	values.add(row) ;
	    	}
	    }
	    else
	    {
	    	values = new ArrayList<List<T>>() ;
	    }
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
		
		return values ;
	}
  

  protected T[][] readCellsAsArray() throws IOException
	{
  	reset() ;
  	
  	cacheSheet() ;
  	
  	T[][] values;
  	
    try
    {
	    values = null;

	    if (actualLastRow > actualFirstRow && actualLastColumn > actualFirstColumn)
	    {
	    	int rowCount = actualLastRow - actualFirstRow + 1 ;
	    	int columnCount = actualLastColumn - actualFirstColumn + 1 ;
	    	
	    	values = createArray(rowCount, columnCount) ;

	    	for (int j = 0; j < columnCount; j++)
	    	{
	    		for (int i = 0; i < rowCount; i++)
	    		{
	    			values[i][j] = parseCell(sheet.getCell(j+actualFirstColumn, i+actualFirstRow)) ;
	    		}
	    	}
	    }
	    else
	    {
	    	values = createArray(0, 0) ;
	    }
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
		
		return values ;
	}
  
	protected T[] getRowArray() throws IOException
  {
		T[] values = null ;
		
    try
    {
	    if (rowIndex <= actualLastRow)
	    {
	    	values = createArray(actualLastColumn - actualFirstColumn + 1) ;
	    	
	    	for (int j = actualFirstColumn; j <= actualLastColumn; j++)
	    	{
	    		values[j] = parseCell(sheet.getCell(j, rowIndex)) ;
	    	}
	    }
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
    
	  return values;
  }
	
	protected T[] getColumnArray() throws IOException
  {
		T[] values = null ;
		
    try
    {
	    if (columnIndex < actualLastColumn)
	    {
	    	values = createArray(actualLastRow - actualFirstRow + 1) ;
	    	
	    	for (int j = actualFirstRow; j <= actualLastRow; j++)
	    	{
	    		values[j] = parseCell(sheet.getCell(columnIndex, j)) ;
	    	}
	    }
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }

	  return values;
  }

	protected List<T> getRowCells() throws IOException
  {
		List<T> values ;
		
    try
    {
	    if (rowIndex <= actualLastRow  && rowIndex >= actualFirstRow && actualLastColumn > actualFirstColumn)
	    {
	    	values = new ArrayList<T>(actualLastColumn - actualFirstColumn + 1) ;
	    	
	    	for (int j = actualFirstColumn; j <= actualLastColumn; j++)
	    	{
	    		values.add(parseCell(sheet.getCell(j, rowIndex))) ;
	    	}
	    }
	    else
	    {
	    	values = new ArrayList<T>(0) ;
	    }
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }

	  return values;
  }
  
	protected List<T> getColumnCells() throws IOException
  {
		List<T> values ;
		
    try
    {
	    if (columnIndex <= actualLastColumn  && columnIndex >= actualFirstColumn && actualLastRow > actualFirstRow)
	    {
	    	values = new ArrayList<T>(actualLastRow - actualFirstRow + 1) ;
	    	
	    	for (int j = actualFirstRow; j <= actualLastRow; j++)
	    	{
	    		values.add(parseCell(sheet.getCell(columnIndex, j))) ;
	    	}
	    }
	    else
	    {
	    	values = new ArrayList<T>(0) ;
	    }
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }

	  return values;
  }
	
	protected T getCell() throws IOException
  {
    try
    {
	    return parseCell(sheet.getCell(columnIndex, rowIndex)) ;
    }
    catch (IndexOutOfBoundsException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }

	protected boolean nextColumn() throws IOException
  {
    if (hasNextColumn())
    {
    	++columnIndex ;
    	
    	return true ;
    }
    else
    {
    	return false ;
    }
  }

	protected boolean nextRow() throws IOException
  {
    if (hasNextRow())
    {
    	++rowIndex ;
    	
    	return true ;
    }
    else
    {
    	return false ;
    }
  }
	
	protected void resetRow() throws IOException
  {
    rowIndex = actualFirstRow - 1 ;
  }

	protected void resetColumn() throws IOException
  {
    columnIndex = actualFirstColumn - 1;
  }
	
	protected abstract T[] createArray(int i) ;
	
	protected abstract T[][] createArray(int rowCount, int columnCount) ;
	
	@SuppressWarnings("unchecked")
  protected T parseCell(Cell cell) throws IOException
	{
	  try
    {
	    return (T)getCellValue(cell);
    }
    catch (ClassCastException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }
	
	protected Object getCellValue(Cell cell)
	{
		Object value = null ;

		if (!isNull(cell))
		{
			if (cell.getType() == CellType.LABEL)
			{
				value = cell.getContents() ;
			}
			else
			{
				if (cell.getType() == CellType.BOOLEAN)
				{
					value = Boolean.valueOf(cell.getContents()) ;
				}
				else
				{
					if (cell.getType() == CellType.NUMBER)
					{
						try
						{
							value = Integer.valueOf(cell.getContents()) ;
						}
						catch (NumberFormatException e)
						{
							try
							{
								value = Double.valueOf(cell.getContents()) ;
							}
							catch (NumberFormatException e1)
							{
								value = cell.getContents() ;
							}
						}
					}
					else
					{
						if (cell.getType() == CellType.DATE)
						{
							try
							{
								value = Date.valueOf(cell.getContents()) ;
							}
							catch (Exception e)
							{
								value = cell.getContents() ;
							}
						}
						else
						{
							if (cell.getType() == CellType.BOOLEAN_FORMULA)
							{
								value = cell.getContents() ;
							}
							else
							{
								if (cell.getType() == CellType.DATE_FORMULA)
								{
									value = cell.getContents() ;
								}
								else
								{
									if (cell.getType() == CellType.ERROR)
									{
										value = cell.getContents() ;
									}
									else
									{
										if (cell.getType() == CellType.FORMULA_ERROR)
										{
											value = cell.getContents() ;
										}
										else
										{
											if (cell.getType() == CellType.NUMBER_FORMULA)
											{
												value = cell.getContents() ;
											}
											else
											{
												if (cell.getType() == CellType.STRING_FORMULA)
												{
													value = cell.getContents() ;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		return value;
	}
	
	private Workbook getWorkbook() throws BiffException, IOException
  {
		if (workbook == null)
			workbook = Workbook.getWorkbook(file) ;
		
	  return workbook;
  }

	protected boolean isNull(Cell cell)
  {
	  return cell == null || cell.getType() == CellType.EMPTY || 
	  	cell.getContents() == null || cell.getContents().trim().length() == 0 ;
  }
	
	private Sheet cacheSheet() throws IOException
  {
		try
		{
			if (sheet == null && getWorkbook() != null && spreadSheetIndex >=0)	
			{
				sheet = getWorkbook().getSheet(spreadSheetIndex) ;

				sheetRows = 0 ;
				sheetColumns = 0 ;

				if (sheet != null)
				{
					sheetRows = sheet.getRows() ;
					sheetColumns = sheet.getColumns() ;
					
					actualFirstRow = firstRow < sheetRows ? this.firstRow : sheetRows -1 ;		
					actualFirstColumn = firstColumn < sheetColumns ? this.firstColumn : sheetColumns -1 ;

					actualLastRow = lastRow != -1 && this.lastRow < sheetRows  ? this.lastRow : sheetRows -1;
					actualLastColumn = lastColumn != -1 && this.lastColumn < sheetColumns ? this.lastColumn : sheetColumns -1 ;
				}
			}
		}
		catch (AssertionFailed e)
		{
			throw new IOException("Can not read excel file : " + file + " Cells may contain linked content! Please try to remove link content from cells. See http://jira.pentaho.com/browse/PDI-2447", e) ;
		}
    catch (Exception e)
    {
			throw new IOException(e.getLocalizedMessage(), e) ;
    }
 
		return sheet ;
  }
}
