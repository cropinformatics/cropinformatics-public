package org.cropinformatics.common.io;

import java.beans.PropertyChangeSupport;
import java.io.File;

public class FileProperties
{
	public static final String FILE_PROPERTY = FileProperties.class.getName() + ".file";
	public static final String FILE_TYPE_PROPERTY = FileProperties.class.getName() + ".fileType";
	
	public static final int UNKNOWN = -1 ;
	public static final int EXCEL = 0 ;
	public static final int TAB_SEPARATED_TEXT = 1 ;
	public static final int COMMA_SEPARATED_TEXT = 2 ;

	private File file ;
	private PropertyChangeSupport propertyChangeSupport ;

	private int fileType = TAB_SEPARATED_TEXT;
	
	public FileProperties(File file)
  {
		this(file, TAB_SEPARATED_TEXT) ;
  }
	
	public FileProperties(File file, int fileType)
  {
	  super();
	  propertyChangeSupport = new PropertyChangeSupport(this) ;
	  this.file = file;
	  
	  if (fileType >= 0 || fileType <= 2)
	  	this.fileType = fileType ;
	  else
	  	this.fileType = TAB_SEPARATED_TEXT ;
  }

	public final File getFile()
  {
  	return file;
  }

	public final void setFile(File file)
  {
		if (this.file != file)
		{
			File oldValue = this.file ;
			this.file = file;
	  	
			propertyChangeSupport.firePropertyChange(FILE_PROPERTY, oldValue, this.file = file) ;
		}
  }
	
	public final int getFileType()
  {
  	return fileType ;
  }

	public final void setFileType(int fileType)
  {
		if (this.fileType != fileType)
		{
			int oldValue = this.fileType ;
			this.fileType = fileType;
			
			propertyChangeSupport.firePropertyChange(FILE_TYPE_PROPERTY, oldValue, this.fileType) ;
		}
  }


	protected final PropertyChangeSupport getPropertyChangeSupport()
  {
  	return propertyChangeSupport;
  }
	
}
