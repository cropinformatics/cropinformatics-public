package org.cropinformatics.ui.utils;


import org.cropinformatics.ui.components.impl.DirectoryInputValidator;
import org.cropinformatics.ui.dialogs.FileSelectionDialog;
import org.daveneti.ui.Activator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

public class FileUtilsImpl extends FileUtils
{
  private static final String DIALOG_TITLE = FileUtilsImpl.class.getName() + ".dialogTitle";
  private static final String DIALOG_DESCRIPTION = FileUtilsImpl.class.getName() + ".dialogDescription";
  
	@Override
  public String openFilePathDialog(Shell parent,
      String fileExtensionFilter, String directory, boolean openFile)
  {
    /*InputDialog inputDialog = new InputDialog(parent, 
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
    }*/
  	
  	FileSelectionDialog uploadDialog = new FileSelectionDialog(parent, null, Activator.getDefault().getString(DIALOG_TITLE), Activator.getDefault().getString(DIALOG_DESCRIPTION)) ;
  	
  	uploadDialog.open() ;
  	
  	return null ;
  }
  
  @Override
  public String openFilePathDialog(Shell parent, String[] fileExtensions,
      String directory, boolean openFile)
  {    
  	FileSelectionDialog fileSelectionDialog = new FileSelectionDialog(parent, null, Activator.getDefault().getString(DIALOG_TITLE), Activator.getDefault().getString(DIALOG_DESCRIPTION)) ;
  	
  	fileSelectionDialog.open() ;
  	
  	if (fileSelectionDialog.getReturnCode() == InputDialog.OK && fileSelectionDialog.getFile() != null)
    {
      return fileSelectionDialog.getFile().getAbsolutePath() ;
    }
    else
    {
      return null;
    }
  }

  @Override
  public String openDirectoryPathDialog(Shell parent, String directory, boolean openFile)
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
