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
package org.cropinformatics.common;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtilities
{
	
	/**
	 * Create a new temporary file.
	 */
	public static File createTempFile(String prefix, String suffix) throws IOException
	{
		return File.createTempFile(prefix,  suffix) ;
	}
	
	/**
	 * Create a new temporary file.
	 * @param directory 

	 */
	public static File createTempFile(String prefix, String suffix, File directory) throws IOException
	{
		return File.createTempFile(prefix,  suffix, directory) ;
	}
	
	/**
	 * Create a new temporary directory. Use something like
	 * {@link #recursiveDelete(File)} to clean this directory up since it isn't
	 * deleted automatically
	 * 
	 * @return the new directory
	 * @throws IOException
	 *           if there is an error creating the temporary directory
	 */
	public static File createTempDir(String prefix) throws IOException
	{
		final File sysTempDir = new File(System.getProperty("java.io.tmpdir"));
		File newTempDir;
		final int maxAttempts = 9;
		int attemptCount = 0;
		do
		{
			attemptCount++;
			if (attemptCount > maxAttempts)
			{
				throw new IOException("The highly improbable has occurred! Failed to "
				    + "create a unique temporary directory after " + maxAttempts
				    + " attempts.");
			}
			String dirName = UUID.randomUUID().toString();
			newTempDir = new File(sysTempDir, prefix != null ? prefix + dirName : dirName);
		}
		while (newTempDir.exists());

		if (newTempDir.mkdirs())
		{
			return newTempDir;
		}
		else
		{
			throw new IOException("Failed to create temp dir named "
			    + newTempDir.getAbsolutePath());
		}
	}

	/**
	 * Recursively delete file or directory
	 * 
	 * @param fileOrDir
	 *          the file or dir to delete
	 * @return true iff all files are successfully deleted
	 */
	public static boolean recursiveDelete(File fileOrDir)
	{
		if (fileOrDir.isDirectory())
		{
			// recursively delete contents
			for (File innerFile : fileOrDir.listFiles())
			{
				if (!FileUtilities.recursiveDelete(innerFile))
				{
					return false;
				}
			}
		}

		return fileOrDir.delete();
	}

}
