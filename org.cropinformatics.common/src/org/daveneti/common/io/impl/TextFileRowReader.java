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
import java.io.IOException;

public abstract class TextFileRowReader<T extends Object> extends AbstractTextFileRowReader<T>
{
	public TextFileRowReader(String file) throws FileNotFoundException, IOException
	{
		super(new File(file)) ;
	}

	public TextFileRowReader(File file) throws FileNotFoundException, IOException
	{
		super(file) ;
	}
	
	public TextFileRowReader(BufferedReader bufferedReader) throws IOException
  {
		super(bufferedReader) ;
  }
	
	public TextFileRowReader(String file, int firstRow, int firstColumn) throws FileNotFoundException, IOException
	{
		super(file, firstRow, firstColumn) ;
	}

	public TextFileRowReader(File file, int firstRow, int firstColumn) throws FileNotFoundException, IOException
	{
		super(file, firstRow, firstColumn) ;
	}

	public TextFileRowReader(BufferedReader bufferedReader, int firstRow, int firstColumn) throws FileNotFoundException, IOException
	{
		super(bufferedReader, firstRow, firstColumn) ;
	}
}
