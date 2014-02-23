/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy.davenport@cropinformatics.com) under contract by
 * CIMMYT. Additional modifications by Guy Davenport after 21 November 2010
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
package org.cropinformatics.ui.components.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.PluginUtils;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public abstract class FileComponent extends LabelledComponent
{
  public static final String FILE_TEXT_COMPONENT_ID = "fileText";
  public static final String BROWSE_BUTTON_COMPONENT_ID = "browseButton";
  public static final String CLEAR_BUTTON_COMPONENT_ID = "clearButton";
 
  private static final boolean DEFAULT_IS_DIRECTORY = false ;
  
  private static final String FILE_DIALOG_TITLE = FileComponent.class.getName() + ".fileDialogTitle";
  private static final String BROWSE_BUTTON_LABEL = FileComponent.class.getName() + ".browseButtonLabel";
  private static final String CLEAR_BUTTON_LABEL = FileComponent.class.getName() + ".clearButtonLabel";
	private static final String FILE_NOT_READABLE_ERROR_MESSAGE = FileComponent.class.getName() + ".fileNotReadableErrorMessage" ;
	private static final String FILE_NOT_WRITABLE_ERROR_MESSAGE = FileComponent.class.getName() + ".fileNotWritableErrorMessage" ;
	private static final String FILE_NOT_PRESENT_ERROR_MESSAGE = FileComponent.class.getName() + ".fileNotDefinedErrorMessage" ;
	private static final String FILE_NOT_VALID_ERROR_MESSAGE = FileComponent.class.getName() + ".fileNotValidErrorMessage" ;
	private static final String DIRECTORY_NOT_READABLE_ERROR_MESSAGE = FileComponent.class.getName() + ".directoryNotReadableErrorMessage" ;
	private static final String DIRECTORY_NOT_WRITABLE_ERROR_MESSAGE = FileComponent.class.getName() + ".directoryNotWritableErrorMessage" ;
	private static final String DIRECTORY_NOT_PRESENT_ERROR_MESSAGE = FileComponent.class.getName() + ".directoryNotDefinedErrorMessage" ;
	private static final String DIRECTORY_NOT_VALID_ERROR_MESSAGE = FileComponent.class.getName() + ".directoryNotValidErrorMessage" ;
	private static final String NOT_DIRECTORY_ERROR_MESSAGE = FileComponent.class.getName() + ".notDirectoryErrorMessage" ;
  
  private Text fileText ;
  
  private String[] fileExtensions ;
  private boolean openFile ;
  private boolean isDirectory ;

  private Button browseButton;
  private Button clearButton;

  private String browseButtonValue;
  private String clearButtonValue;
  private File file;
  
  public FileComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile)
  {
    this(parent, containerConfiguration, labelValue, Activator.getDefault().getString(BROWSE_BUTTON_LABEL), Activator.getDefault().getString(CLEAR_BUTTON_LABEL), fileExtensions, openFile, DEFAULT_IS_DIRECTORY);
  }

  public FileComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
      String[] fileExtensions, boolean openFile, boolean isDirectory)
  {
    this(parent, containerConfiguration, labelValue, Activator.getDefault().getString(BROWSE_BUTTON_LABEL), Activator.getDefault().getString(CLEAR_BUTTON_LABEL), fileExtensions, openFile, DEFAULT_IS_DIRECTORY);
  }
  
  public FileComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile)
  {
    this(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile, DEFAULT_IS_DIRECTORY);
  }

  public FileComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue);
    
    this.browseButtonValue = browseButtonValue ;
    this.clearButtonValue = clearButtonValue ;
    this.fileExtensions = fileExtensions ;
    this.openFile = openFile ;
    this.isDirectory = isDirectory ;
  }
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
    ControlConfiguration controlConfiguration = null ;
    
    if (configuration instanceof ControlConfiguration)
      controlConfiguration = (ControlConfiguration)configuration ;
    
    if (component == null)
    {
      if (FILE_TEXT_COMPONENT_ID.equals(id))
      {
      	component = createTextComponent(parent, controlConfiguration) ;
      	
      	fileText = (Text)component.getControl() ;
        
        if (getFile() != null)
          fileText.setText(getFile().toString()) ;
  
        fileText.addModifyListener(new ModifyListener()
        {
          public void modifyText(ModifyEvent e)
          {
            fileTextChanged() ;
          }
    
        }) ;
      }
      else
      {
        if (BROWSE_BUTTON_COMPONENT_ID.equals(id) && browseButtonValue != null)
        {
        	component = createButtonComponent(parent, controlConfiguration, SWT.PUSH);
          
          browseButton = (Button)component.getControl() ;
  
          browseButton.setText(browseButtonValue);
          
          browseButton.addSelectionListener(new SelectionAdapter()
          {
            public void widgetSelected(SelectionEvent e)
            {
              if (isDirectory())
                handleDirectoryBrowse() ;
              else
                handleFileBrowse() ;
            }
          });
        }
        else
        {
          if (CLEAR_BUTTON_COMPONENT_ID.equals(id) && clearButtonValue != null)
          {
            component = createButtonComponent(parent, controlConfiguration, SWT.PUSH);
            
            clearButton = (Button)component.getControl() ;
            
            clearButton.setText(clearButtonValue);
  
            clearButton.addSelectionListener(new SelectionAdapter()
            {
              public void widgetSelected(SelectionEvent e)
              {
                handleClearButton() ;
              }
            });
          }
        }
      }
    }
    
    return component ;
  }
  
  public boolean isValid()
  {
    if (getFile() != null)
    {
	    if (openFile)
	      if (isDirectory)
	        return getFile().isDirectory() && getFile().canRead() ;
	      else
	        return getFile().isFile() && getFile().canRead() ;
	    else
	    	return true ;
    }
    else
    {
      return !ConfigurationUtils.isMandatory(getConfiguration()) ;
    }
  }
  
  public String[] getFileExtensions()
  {
    return fileExtensions;
  }

  public void setFileExtensions(String[] fileExtensions)
  {
    this.fileExtensions = fileExtensions;
  }

  public boolean isOpenFile()
  {
    return openFile;
  }

  protected void setOpenFile(boolean openFile)
  {
    this.openFile = openFile;
  }

  public boolean isDirectory()
  {
    return isDirectory;
  }
  
  protected File getFile()
  {
    return file;
  }

  protected void setFile(File file)
  {
    this.file = file ;
    
    updateErrorMessage() ;
  }
  
  protected void setFileText(File file)
  {
    if (fileText != null)
      if (file != null)
        fileText.setText(file.getAbsolutePath());
      else
        fileText.setText("");
  }
  
  protected void handleFileBrowse()
  {      
    String fileName = PluginUtils.openFilePathDialog(getParent().getShell(), Activator.getDefault().getString(FILE_DIALOG_TITLE), fileExtensions, Platform.getUserLocation().getURL().toString(), openFile);
    
    if (fileText != null)
    	if (fileName != null)
    		fileText.setText(fileName);
    	else
    		fileText.setText("");
  }
  
  protected void handleDirectoryBrowse()
  {
    String directory = PluginUtils.openDirectoryPathDialog(getParent().getShell(), Activator.getDefault().getString(FILE_DIALOG_TITLE), Platform.getUserLocation().getURL().toString(), openFile);

    if (fileText != null)
      fileText.setText(directory);
  }
  
  protected void handleClearButton()
  {
    if (fileText != null)
      fileText.setText("");
  }

  protected void fileTextChanged()
  {
    String fileName = null ;
    File oldFile = file ;
      
    if (fileText != null)
      fileName = fileText.getText();

    if (fileName != null && fileName.length() > 0)
    {
      File file = new File(fileName);
      
      if (!ObjectUtils.equals(oldFile, file))
      {
        setFile(file) ;
      }
    }
    else
    {
      if (oldFile != null)
      {
        setFile(null) ;
      }
    }
  }

  protected void setDirectory(boolean isDirectory)
  {
    this.isDirectory = isDirectory;
  }
  
	@Override
  protected void registerChildComponentIDs()
  {
		super.registerChildComponentIDs(); 
		
  	registerChildComponentID(FILE_TEXT_COMPONENT_ID) ;
  	registerChildComponentID(BROWSE_BUTTON_COMPONENT_ID) ;
  	registerChildComponentID(CLEAR_BUTTON_COMPONENT_ID) ;
  }
	
  private void updateErrorMessage()
  {
    if (getFile() != null)
    {
	    if (openFile)
	      if (isDirectory)
	        if (getFile().isDirectory())
	        	if (getFile().canRead())
	        		setErrorMessage(null) ;
	        	else
		        	if (getFile().exists())
		        		setErrorMessage(Activator.getDefault().getString(DIRECTORY_NOT_READABLE_ERROR_MESSAGE)) ;
		        	else
		        		setErrorMessage(Activator.getDefault().getString(DIRECTORY_NOT_PRESENT_ERROR_MESSAGE)) ;
        	else
        		setErrorMessage(Activator.getDefault().getString(NOT_DIRECTORY_ERROR_MESSAGE)) ;
	      else
	        if (getFile().isFile() && getFile().canRead())
	        	setErrorMessage(null) ;
	        else
	        	if (getFile().exists())
	        		setErrorMessage(Activator.getDefault().getString(FILE_NOT_READABLE_ERROR_MESSAGE)) ;
	        	else
	        		setErrorMessage(Activator.getDefault().getString(FILE_NOT_PRESENT_ERROR_MESSAGE)) ;
	    else
	    	if (getFile().getParentFile().isDirectory() && getFile().getParentFile().canWrite())
	    		setErrorMessage(null) ;
	      else
	      	if (getFile().exists())
		      	if (isDirectory)
		        	setErrorMessage(Activator.getDefault().getString(DIRECTORY_NOT_WRITABLE_ERROR_MESSAGE)) ;
		      	else
		      		setErrorMessage(Activator.getDefault().getString(FILE_NOT_WRITABLE_ERROR_MESSAGE)) ;
	      	else
	        	if (getFile().exists())
	        		setErrorMessage(Activator.getDefault().getString(DIRECTORY_NOT_PRESENT_ERROR_MESSAGE)) ;
	        	else
	        		setErrorMessage(Activator.getDefault().getString(FILE_NOT_PRESENT_ERROR_MESSAGE)) ;
    }
    else
    {
    	if (isDirectory)
      	setErrorMessage(Activator.getDefault().getString(DIRECTORY_NOT_VALID_ERROR_MESSAGE)) ;
    	else
    		setErrorMessage(Activator.getDefault().getString(FILE_NOT_VALID_ERROR_MESSAGE)) ;
    }
  }
}