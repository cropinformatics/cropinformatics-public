package org.cropinformatics.ui.components.impl;


import java.io.File;

import org.eclipse.jface.dialogs.IInputValidator;

public class DirectoryInputValidator implements IInputValidator
{

  public String isValid(String file)
  {
    if (new File(file).isDirectory())
      return file;
    else
      return null ;
  }

}
