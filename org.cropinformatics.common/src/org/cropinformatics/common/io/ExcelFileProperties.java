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
package org.cropinformatics.common.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileProperties extends FileProperties
{
	private static final String SHEETS_PROPERTY = ExcelFileProperties.class.getName() + ".sheets";
	private List<String> sheets ;
	
	public ExcelFileProperties(File file)
  {
	  this(file, null);
  }
	
	public ExcelFileProperties(File file, List<String> sheets)
  {
	  super(file, EXCEL);
	  
	  this.sheets = new LinkedList<String>() ;
	  if (sheets != null)
	  	this.sheets.addAll(sheets) ;
  }
	
	public List<String> getSheets()
	{
		return sheets ;
	}
	
	public void setSheets(List<String> sheets)
	{
		if (this.sheets != sheets)
		{
			List<String> oldValue = sheets ;
			
		  if (sheets != null)
		  {
				this.sheets = new ArrayList<String>(sheets.size()) ;
			  
		  	this.sheets.addAll(sheets) ;
		  	
				getPropertyChangeSupport().firePropertyChange(SHEETS_PROPERTY, oldValue, this.sheets) ;
		  }
		  else
		  {
				this.sheets = new ArrayList<String>(0) ;
				getPropertyChangeSupport().firePropertyChange(SHEETS_PROPERTY, oldValue, this.sheets) ;
		  }
		}
	}

	public boolean addSheet(String sheet)
	{
		if (sheet != null)
		{
			List<String> oldValue = sheets ;
			
		  sheets = new ArrayList<String>(oldValue.size()+1) ;
			
			boolean success = oldValue.isEmpty() || sheets.addAll(oldValue) ;
	
			if (success)
				success = sheets.add(sheet) ;
			
			if (success)
				getPropertyChangeSupport().firePropertyChange(SHEETS_PROPERTY, oldValue, this.sheets) ;
			
			return success ;
		}
		else
		{
			return false ;
		}
	}
	
	public boolean removeSheet(String sheet)
	{
		if (sheet != null)
		{
			List<String> oldValue = sheets ;
			
		  sheets = new ArrayList<String>(oldValue.size() > 0 ? oldValue.size() - 1 : 0 ) ;
			
			boolean success = oldValue.isEmpty() || sheets.addAll(oldValue) ;
	
			if (success)
				success = sheets.remove(sheet) ;
			
			if (success)
				getPropertyChangeSupport().firePropertyChange(SHEETS_PROPERTY, oldValue, this.sheets) ;
			
			return success ;
		}
		else
		{
			return false ;
		}
	}
	
	public void removeAllFiles()
	{
		List<String> oldValue = sheets ;
		
	  sheets = new ArrayList<String>(0) ;
		
	  getPropertyChangeSupport().firePropertyChange(SHEETS_PROPERTY, oldValue, this.sheets) ;
	}
	
	public String[] getSheetsAsArray()
	{
		return sheets.toArray(new String[sheets.size()]) ;
	}
	
	public static List<String> getSheets(File file) throws IOException
	{
		List<String> sheetNameList = null ;
		
		if (file != null)
		{
			Workbook workbook = null ;
			
	    try
	    {
		    workbook = Workbook.getWorkbook(file);
	    }
	    catch (BiffException e)
	    {
	    	throw new IOException(e) ;
	    }
			
			String[] sheetNames = workbook.getSheetNames() ;
	
			sheetNameList = new ArrayList<String>(sheetNames.length) ;
			
			for (int i = 0 ; i < sheetNames.length ; ++i)
				sheetNameList.add(sheetNames[i]) ;
		}
		else
		{
			sheetNameList = new ArrayList<String>(0) ;
		}
				
		return sheetNameList ;
	}
}
