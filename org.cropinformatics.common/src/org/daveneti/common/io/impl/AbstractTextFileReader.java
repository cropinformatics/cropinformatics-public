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


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.daveneti.common.Constants;
import org.daveneti.common.ConversionUtilities;

public abstract class AbstractTextFileReader<T extends Object> 
{
  private String fileReference;

  private File file;
  
  private boolean isInStrictMode;
  
  private String comment;
  
  @SuppressWarnings("unused")
  private boolean usingQuotes ;
  
  private int rowSize;
  
  // the actual position (including headers) of the read/write
  private int rowPosition = -2;
  
  // the index of the current row being written or read, -1 if not on any row yet
  private int rowIndex = -1;
  
  //the cell position (including headers) of the read/write
  private int cellPosition = -1;
  
  // the index of the current cell being written or read, -1 if not on any cell yet
  private int cellIndex = -1;

	private boolean rowSizeSetExternally = false ;
  
  private boolean parsingEmptyStrings ;
  
  private boolean convertingValues ;

  private Map<Integer, Integer> conversionTypesMap  ;

  private int conversionTypesCount;

  private int[] conversionTypesArray;

	private int defaultConversionTypes;
	
  private String delimiter;
  
  private Pattern pattern ;
  
  private BufferedReader bufferedReader;
  
  private boolean ignoringMultipleDelimiters ;

  private List<T> row ;
  
  private String line;
	private String nextLine;
	
	@SuppressWarnings("unused")
  private int firstRow;

	@SuppressWarnings("unused")
  private int firstColumn;

	private T[] rowArray;

  
  private static final String BUFFERREADER_NULL = "Buffer reader is undefined";
  
	private AbstractTextFileReader(int firstRow, int firstColumn)
  {
	  this.firstRow = firstRow ;
	  this.firstColumn = firstColumn ;
  }
	
  /**
   * Constructs an initialised reader using a string reference to a text file.
   * 
   * @param reference
   *          a text file name or URL
   * @throws IOException 
   * @throws FileNotFoundException 
   */
  public AbstractTextFileReader(String reference) throws IOException, FileNotFoundException
  {
    this(reference, 0, 0) ;
  }

  /**
   * Constructs an initialised reader using a file.
   * 
   * @param file
   *          a text File object.
   * @throws IOException 
   * @throws FileNotFoundException 
   */
  public AbstractTextFileReader(File file) throws IOException, FileNotFoundException
  {
    this(file, 0, 0) ;
  }
  
	public AbstractTextFileReader(BufferedReader bufferedReader) throws IOException
  {
    this(bufferedReader, 0, 0) ;
  }

  /**
   * Constructs an initialised reader using a string reference to a text file.
   * 
   * @param reference
   *          a text file name or URL
   * @throws IOException 
   * @throws FileNotFoundException 
   */
  public AbstractTextFileReader(String reference, int firstRow, int firstColumn) throws IOException, FileNotFoundException
  {
  	this(firstRow, firstColumn) ;
  	
    if (reference == null)
      throw new FileNotFoundException("File undefined");

    setFileReference(reference) ;
    
    initialise() ;
  }

  /**
   * Constructs an initialised reader using a file.
   * 
   * @param file
   *          a text File object.
   * @throws IOException 
   * @throws FileNotFoundException 
   */
  public AbstractTextFileReader(File file, int firstRow, int firstColumn) throws IOException, FileNotFoundException
  {
  	this(firstRow, firstColumn) ;
  	
    if (file == null)
      throw new FileNotFoundException("File undefined");

    setFile(file) ;
    
    initialise() ;
  }
  
	public AbstractTextFileReader(BufferedReader bufferedReader, int firstRow, int firstColumn) throws IOException
  {
  	this(firstRow, firstColumn) ;
  	
    if (bufferedReader != null)
    	this.bufferedReader = bufferedReader ;
    else
      throw new IOException("Buffered reader undefined");
    
    initialise() ;
  }

	public final boolean ready()
  {
    try
    {
      if (bufferedReader != null)
        return bufferedReader.ready() ;
      else
        return false ;
    }
    catch (IOException e)
    {
      return false ;
    }
  }

  public final void close() 
  {
    try
    {
      if (bufferedReader != null)
        bufferedReader.close();
    }
    catch (IOException e)
    {

    }
    
    bufferedReader = null ;
  }
  
  public int getRowCount()
  {
  	if (ready())
  		return Constants.UNKNOWN_ROW_COUNT ;
  	else
  		return getRowIndex() ;
  }
  
  public int getColumnCount()
  {
    if (getRowSize() > -1)
      return getRowSize() ;
    else
      return Constants.UNKNOWN_COLUMN_COUNT ;
  }
  
  /**
   * Gets the string which indicates at comment line that should be ignored by the reader.
   * 
   * @return the comment string
   */
  public final String getCommentString()
  {
    return comment;
  }

  public final String getFileReference()
  {
    return fileReference;
  }

  public final void setFileReference(String fileReference) throws IOException
  {
    if (this.fileReference != fileReference)
    {
      if (isInUse())
        throw new IOException("File can not be changed while reader/writer is in use") ;
      
      this.fileReference = fileReference;
      file = null;
    }
  }

  public final File getFile()
  {
    return file;
  }

  public final void setFile(File file) throws IOException
  {
    if (this.file != file)
    {
      if (isInUse())
        throw new IOException("File can not be changed while reader/writer is in use") ;
      
      fileReference = null;
      this.file = file ;
    }
  }
  
  public final boolean isInStrictMode()
  {
    return isInStrictMode;
  }

  public final void setInStrictMode(boolean isInStrictMode) throws IOException
  {
    if (this.isInStrictMode != isInStrictMode)
    {
      if (isInUse())
        throw new IOException("Mode can not be changed while reader/writer is in use") ;
      
      this.isInStrictMode = isInStrictMode;
    }
  }
  
  /**
   * Sets the string which indicates at comment line that should be ignored by the reader.
   * Set to <code>null</code> if no comments are allowed
   * 
   * @param comment the comment string
   * @throws IOException 
   */
  public final synchronized void setCommentString(String comment) throws IOException
  {
    if (comment == null || comment.equals(""))
      comment = Constants.DEFAULT_COMMENT;
    
    if (!comment.equals(this.comment))
    {
      if (isInUse())
        throw new IOException("Comment string can not be set while reader/writer is in use") ;
      
      this.comment = comment;
    }
  }
  
  /**
   * Gets the string which indicates a new field in a record.
   * 
   * @return the delimiter string
   */
  public final String getDelimiterString()
  {
    return delimiter;
  }

  /**
   * Sets the string which indicates a new field in a record.
   * 
   * @param delimiter the delimiter string
   * @throws MatrixException if the reader is currently in use
   */
  public final synchronized void setDelimiterString(String delimiter) throws IOException
  {
    if (delimiter == null || delimiter.equals(""))
      delimiter = Constants.DEFAULT_DELIMITER;
    
    if (!delimiter.equals(this.delimiter))
    {
      if (getRowSize() >= 0)
        throw new IOException("Delimiter string can not be set while reader is in use") ;
      
      this.delimiter = delimiter;
      
      updatePattern() ;
    }
  }

  /**
   * @return the ignoringMultipleDelimiters
   */
  public final boolean isIgnoringMultipleDelimiters()
  {
    return ignoringMultipleDelimiters;
  }

  /**
   * @param ignoringMultipleDelimiters the ignoringMultipleDelimiters to set
   * @throws MatrixException 
   */
  public final void setIgnoringMultipleDelimiters(
      boolean ignoringMultipleDelimiters) throws IOException
  {
    if (ignoringMultipleDelimiters != this.ignoringMultipleDelimiters)
    {
      if (isInUse())
        throw new IOException("Paramater can not be changed while reader is in use") ;
      
      this.ignoringMultipleDelimiters = ignoringMultipleDelimiters ;
    }
  }
  
  /**
   * @return the convertingValues
   */
  public final boolean isConvertingValues()
  {
    return convertingValues;
  }

  /**
   * @param convertingValues the convertingValues to set
   * @throws IOException 
   */
  public final void setConvertingValues(boolean convertingValues) throws IOException
  {
    if (convertingValues != this.convertingValues)
    {
      if (isInUse())
        throw new IOException("Paramater can not be changed while reader is in use") ;
      
      this.convertingValues = convertingValues ;
    }
  }

  public final boolean isParsingEmptyStrings()
  {
    return parsingEmptyStrings;
  }

  public final void setParsingEmptyStrings(boolean parsingEmptyStrings) throws IOException
  {
    if (this.parsingEmptyStrings != parsingEmptyStrings)
    {
      if (isInUse())
        throw new IOException("Paramater can not be changed while reader is in use") ;
      
      this.parsingEmptyStrings = parsingEmptyStrings;
      
      updatePattern() ;
    }
  }
  
  protected T[][] readCellsAsArray() throws IOException
	{
  	List<List<T>> cells = readCells() ;
  	
  	T[][] array = createArray(cells.size(), getRowSize()) ;
  	
  	Iterator<List<T>> iterator = cells.iterator() ;
  	List<T> row ;
  	
  	int i = 0 ;
  	
  	while (iterator.hasNext() && i < cells.size())
  	{
  		row = iterator.next() ;
  		array[i] = row.toArray(array[i]) ;
  		
  		++i ;
  	}
  	
  	return array ;
	}
  
  protected List<List<T>> readCells() throws IOException
  {
  	List<List<T>> cells = new LinkedList<List<T>>() ;
  	
	  while (nextRow())
	  {
	  	cells.add(getRowCells()) ;
	  }
  	
  	return cells ;
  }
  
	protected boolean hasNextRow()
  {
    return nextLine != null ;
  }

	protected boolean nextRow() throws IOException
  {
    if (hasNextRow())
    {
    	readNextLine() ;
    	++rowIndex ;
    	
    	return true ;
    }
    else
    {
    	return false ;
    }
  }
	
	protected List<T> getRowCells() throws IOException
  {
		if (row == null)
			parseRowCells() ;
		
		return row ;
  }

	protected T[] getRowArray() throws IOException
  {
		if (rowArray == null)
			parseRowArray() ;
		
		return rowArray ;
  }

	protected abstract T[] createArray(int size) ;
	
	protected abstract T[][] createArray(int rowCount, int columnCount) ;


  @SuppressWarnings("unchecked")
  protected T parseValue(String text, int rowIndex, int columnIndex) throws IOException 
  {
	  try
    {
	    return (T)convertValue(text);
    }
    catch (ClassCastException e)
    {
	    throw new IOException(e.getLocalizedMessage(), e) ;
    }
  }
  
  protected Object convertValue(String text) 
  {
    return ConversionUtilities.convertToObject(text) ;
  }
  
  /**
   * Initialises the reader
   * @throws IOException 
   * @throws FileNotFoundException 
   */
  protected final void initialise() throws FileNotFoundException, IOException 
  {
    isInStrictMode = false ;
    
    defaultConversionTypes = ConversionUtilities.DEFAULT_TYPES ;

    conversionTypesMap = new TreeMap<Integer, Integer>() ;
    
    conversionTypesCount = 0 ;
    
    conversionTypesArray = null ;
    
    rowPosition = 0 ;
    rowIndex = Constants.UNKNOWN_ROW_INDEX ;
    cellPosition = 0 ;
    cellIndex = Constants.UNKNOWN_COLUMN_INDEX ;
    
    if (!rowSizeSetExternally)
    	rowSize = Constants.UNKNOWN_ROW_COUNT ;
		
    comment = Constants.DEFAULT_COMMENT ;
        
    usingQuotes = false ;
    
    if (delimiter == null || delimiter.equals(""))
      delimiter = Constants.DEFAULT_DELIMITER;
    
    updatePattern() ;

    if (getFileReference() != null)
      initialiseBufferedReader(getBufferReader(getFileReference()));
    else
      if (getFile() != null)
        initialiseBufferedReader(getBufferReader(getFile()));
      else
        if (bufferedReader != null)
          initialiseBufferedReader(bufferedReader) ;
        else
          throw new IOException("Unable to initialise reader") ;
    
    readNextLine() ; // cache first line
  }
  
  private void readNextLine() throws IOException
  {
  	row = null ;
  	rowArray = null ;
  	line = nextLine ;
  	nextLine = null ;
    
    while (bufferedReader.ready() && nextLine == null)
    {
    	nextLine = bufferedReader.readLine();
    
      //    ignore any commented record or empty lines if not in strict mode
      if (nextLine != null && ((nextLine.trim().length() == 0 && isInStrictMode())
          || (getCommentString() != null && nextLine.trim().startsWith(getCommentString()))))
      {
      	nextLine = null ;
      }
      
      incrementRowPosition() ;
    }
  }

	/**
   * Initialises the reader using a bufferedReader directly.
   * 
   * @param bufferedReader
   *          a buffered reader
   */
  private final void initialiseBufferedReader(BufferedReader bufferedReader)
  {
    if (bufferedReader == null)
      throw new NullPointerException(BUFFERREADER_NULL);
    
    this.bufferedReader = bufferedReader;
    
    setRowPosition(0) ;
    setRowSizeInternal(Constants.UNKNOWN_ROW_COUNT) ;
    setRowIndex(Constants.UNKNOWN_ROW_INDEX) ;
  }
  
  private final void updatePattern()
  {
    // TODO need to check for special characters
    if (ignoringMultipleDelimiters)
      pattern = Pattern.compile(delimiter + "+", Pattern.DOTALL) ;
    else
      pattern = Pattern.compile(delimiter, Pattern.DOTALL) ;
  }

  protected String convertToken(String string)
  {
    if (isParsingEmptyStrings())
      return string ;
    else
      if (string != null)
        if ("".equals(string.trim()))
          return null ;
        else
          return string ;
      else
        return null ;
  }
  
  private void updateRowFromSize(List<T> row) throws IOException
  {
  	if (row != null)
  	{  
  		if (row.size() < getRowSize())
  			for (int i = 0 ; i < row.size() - getRowSize() ; ++i)
  				row.add(null) ;
  	}
  }

  protected int getDefaultConversionTypes()
  {
    // TODO Auto-generated method stub
    return defaultConversionTypes ;
  }

  protected void setDefaultConversionTypes(int defaultConversionTypes)
  {
    this.defaultConversionTypes = defaultConversionTypes ;
  }
  
  protected int getConversionTypes(int index)
  {
    if (index >= 0 && conversionTypesMap.containsKey(index))
      return conversionTypesMap.get(index);
    else
      return defaultConversionTypes ;
  }
  
  protected int[] getAllConversionTypes()
  {
    if (conversionTypesArray == null)
    {
      conversionTypesArray = new int[conversionTypesCount] ;
      
      Iterator<Entry<Integer, Integer>> iterator = conversionTypesMap.entrySet().iterator() ;
      
      Entry<Integer, Integer> entry = null ;
      
      while (iterator.hasNext())
      {
        entry = iterator.next() ;
        
        conversionTypesArray[entry.getKey()] = entry.getValue() ;
      }
    }
    
    return conversionTypesArray ;
  }

  protected void setAllConversionTypes(int[] conversionTypes)
  {
    conversionTypesArray = null ;
    conversionTypesCount = conversionTypes.length ;
    for (int i = 0 ; i < conversionTypes.length ; ++i)
      conversionTypesMap.put(i, conversionTypes[i]) ;
  }

  protected void setConversionTypes(int conversionTypes, int index)
  {
    if (index >= 0)
    {
      conversionTypesMap.put(index, conversionTypes) ;
      
      if (index >= conversionTypesCount)
      {
        conversionTypesCount = index + 1 ;
        conversionTypesArray = null ;
      }
      else
      {
        conversionTypesArray[index] = conversionTypes ;
      }
    }
  }
  
  public final int getRowSize()
  {
    return rowSize;
  }
  
  public final void setRowSize(int rowSize) throws IOException
  {
  	if (this.rowSize != rowSize)
  		if (isInUse())
  			throw new IOException("Row size can not be set while reader/writer is in use") ;
  		else
  			this.rowSize = rowSize ;
  	
  	rowSizeSetExternally  = rowSize >= 0 ;
  }
  
  protected final void setRowSizeInternal(int rowSize)
  {
    this.rowSize = rowSize ;
  }
  
  protected final void updateRowSize(int size) throws IOException
  {
  	if (rowSizeSetExternally && size > rowSize)
  		throw new IOException("Row Size must not be greater than : " + rowSize);     
  	
    if (getRowSize() < 0)
    {
    	setRowSizeInternal(size) ;
    }
    else
    {
      if (isRowSizesEqual())
      {
        if (getRowSize() != size)
        {
          String message = "Row Size Equal ON: All Rows must contain " ;
            
          if (getRowSize() == 1)
            message = message + " 1 element : at row " + getRowPosition() ;
          else
            message = message + getRowSize() + " elements : at row " + getRowPosition()  ;
          
          if (size == 1)
            message = message + " there is 1 element" ;
          else
            message = message + " there are " + size + " elements" ;
          
          throw new IOException(message);          
        }
      }
      else
      {
        if (getRowSize() < size)
        {
        	setRowSizeInternal(size) ;
        }
      }
    }
  }
  
  protected boolean isRowSizesEqual()
  {
	  return false;
  }

	protected int getRowIndex() 
  {
    return rowIndex ;
  }
  
  protected final void setRowIndex(int rowIndex)
  {
    this.rowIndex = rowIndex ;
  }
  
  protected final void incrementRowIndex()
  {
    ++rowIndex ;
  }
  
  protected final int getRowPosition() 
  {
    return rowPosition ;
  }
  
  protected final void setRowPosition(int rowPosition)
  {
    this.rowPosition = rowPosition ;
  }
  
  protected final void incrementRowPosition()
  {
    ++rowPosition ;
  }
  
  protected boolean isInUse()
  {
    return rowPosition > -1 ;
  }
  
  protected int getCellIndex() 
  {
    return cellIndex ;
  }
  
  protected final void setCellIndex(int cellIndex)
  {
    this.cellIndex = cellIndex ;
  }
  
  protected final void incrementCellIndex()
  {
    ++cellIndex ;
    incrementCellPosition() ;
  }
  
  protected final int getCellPosition() 
  {
    return cellPosition ;
  }
  
  protected final void setCellPosition(int cellPosition)
  {
    this.cellPosition = cellPosition ;
  }
  
  protected final void incrementCellPosition()
  {
    ++cellPosition ;
  }
  
  protected final void resetCellPositionAndIndex()
  {
    cellPosition = 0 ;
    cellIndex = Constants.UNKNOWN_COLUMN_INDEX ;
  }
  
  private void parseRowCells() throws IOException
  {
		row = new LinkedList<T>() ;

		if (line != null)
		{
			String[] tokens = pattern.split(line) ;
			
			updateRowSize(tokens.length) ;
			
			int i = 0 ;

			while (i < tokens.length)
			{
				row.add(parseValue(convertToken(tokens[i]), getRowIndex(), i)) ;
				++i ;
			}
		}

		updateRowFromSize(row) ;
  }
  
	private void parseRowArray() throws IOException
  {
		if (line != null)
		{
			String[] tokens = pattern.split(line) ;
			
			updateRowSize(tokens.length) ;
			
			rowArray = createArray(getRowSize()) ;

			for (int i = 0 ; i < tokens.length ; ++i)
			{
				rowArray[i] = parseValue(convertToken(tokens[i]), getRowIndex(), i) ;
			}
		}

		updateRowFromSize(row) ;
  }

  /**
   * Creates a BufferedReader using the string reference to a text file.
   * 
   * @param textFileReference
   *          a text file name or URL
   * @return a bufferedReader
   * 
   * @exception FileNotFoundException
   *              if the file referenced can not be found
   * @exception IOException
   *              if the reader can not open an inputstream to the file
   */
  private static final BufferedReader getBufferReader(File file)
      throws FileNotFoundException, IOException
  {
    if (file != null)
      return new BufferedReader(new FileReader(file));
    else
      throw new FileNotFoundException("File object is null");
  }

  /**
   * Creates a BufferedReader using the string reference to a text file.
   * 
   * @param textFileReference
   *          a text file name or URL
   * @return a bufferedReader
   * 
   * @exception FileNotFoundException
   *              if the file referenced can not be found
   * @exception IOException
   *              if the reader can not open an inputstream to the file
   */
  private static final BufferedReader getBufferReader(String fileReference)
      throws FileNotFoundException, IOException
  {
    BufferedReader bufferedReader = null;

    try
    {
      URL refURL = new java.net.URL(fileReference);
      bufferedReader = new BufferedReader(new InputStreamReader(refURL
          .openStream()));
    }
    catch (MalformedURLException malformedURLException)
    {
      bufferedReader = new BufferedReader(new FileReader(fileReference));
    }

    return bufferedReader;
  }
}
