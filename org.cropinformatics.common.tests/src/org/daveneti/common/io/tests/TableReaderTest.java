package org.daveneti.common.io.tests;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.daveneti.common.io.impl.TextFileTableStringReader;
import org.junit.Test;

public class TableReaderTest
{

	private static final String DEFAULT_FEATURE_FILE = "/features.txt";

	@Test
	public void testReadCells()
	{
		try
    {
	    TextFileTableStringReader reader = new TextFileTableStringReader(this.getClass().getResource(DEFAULT_FEATURE_FILE).getPath()) ;
	    
	    reader.setDelimiterString(",") ;
	    
	    if (reader.ready())
	    {
	    	List<List<String>> cell = reader.readCells() ;
	    	
	    	Iterator<List<String>> iterator = cell.iterator() ;
	    	
	    	while(iterator.hasNext())
	    	{
		    	System.out.println(iterator.next()) ;
	    	}
	    }
	    
	    reader = new TextFileTableStringReader(new BufferedReader(
	    		new InputStreamReader(this.getClass().getResourceAsStream(DEFAULT_FEATURE_FILE)))) ;
	    
	    reader.setDelimiterString(",") ;
	    
	    if (reader.ready())
	    {
	    	List<List<String>> cell = reader.readCells() ;
	    	
	    	Iterator<List<String>> iterator = cell.iterator() ;
	    	
	    	while(iterator.hasNext())
	    	{
		    	System.out.println(iterator.next()) ;
	    	}
	    }
    }
    catch (Exception e)
    {
    	e.printStackTrace(System.err) ;
    	fail(e.getLocalizedMessage()) ;
    }
	}

	@Test
	public void testReadCellsAsArray()
	{
		try
    {
	    TextFileTableStringReader reader = new TextFileTableStringReader(this.getClass().getResource(DEFAULT_FEATURE_FILE).toURI().getPath()) ;
	    
	    reader.setDelimiterString(",") ;
	    
	    if (reader.ready())
	    {
	    	String[][] cell = reader.readCellsAsArray() ;
	    	
	    	for (int i = 0 ; i < cell.length ; ++i)
	    	{
		    	for (int j = 0 ; j < cell[i].length ; ++j)
		    	{
		    		System.out.print(cell[i][j]) ;
		    		System.out.print(",") ;
		    	}
		    	
		    	System.out.println() ;
	    	}
	    }
    }
    catch (Exception e)
    {
    	e.printStackTrace(System.err) ;
    	fail(e.getLocalizedMessage()) ;
    }
	}
}
