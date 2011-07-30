package org.cropinformatics.ui.utils;


import org.cropinformatics.ui.components.impl.DirectoryInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileUtilsImpl extends FileUtils
{
  @Override
  public String openFilePathDialog(Shell parent, String title, String[] fileExtensions,
      String directory, boolean openFile)
  {    
  	FileDialog fileDialog = new FileDialog(parent, SWT.TITLE | SWT.MULTI);
    fileDialog.setText(title);
    fileDialog.setFilterExtensions(fileExtensions) ;
    //fileDialog.setAutoUpload(true); // This API will change!
    fileDialog.open();
    
    return fileDialog.getFileName();
  }
  
	@Override
  public String[] openFilesPathDialog(Shell parent, String title, 
  		String[] fileExtensions, String directory)
  {
  	FileDialog fileDialog = new FileDialog(parent, SWT.TITLE | SWT.MULTI);
    fileDialog.setText(title);
    fileDialog.setFilterExtensions(fileExtensions) ;
    //fileDialog.setAutoUpload(true); // This API will change!
    fileDialog.open();
    
    return fileDialog.getFileNames();
  }
  

  @Override
  public String openDirectoryPathDialog(Shell parent, String title, String directory, boolean openFile)
  {
    InputDialog inputDialog = new InputDialog(parent, 
        "Title",
        "Messge",
        directory,
        new DirectoryInputValidator());
 
  
    inputDialog.open();
    
    if (inputDialog.getReturnCode() == InputDialog.OK && inputDialog.getValue() != null
        && inputDialog.getValue().length() > 0)
    {
      return inputDialog.getValue() ;
    }
    else
    {
      return null;
    }
  }
}
