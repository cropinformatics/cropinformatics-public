package org.daveneti.ui.components.impl;


import java.io.File;

import org.eclipse.jface.dialogs.IInputValidator;

public class FileInputValidator implements IInputValidator
{

  public String isValid(String file)
  {
    if (new File(file).isFile())
      return file;
    else
      return null ;
  }

}
