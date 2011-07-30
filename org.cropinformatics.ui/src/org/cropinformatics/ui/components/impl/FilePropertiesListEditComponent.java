package org.cropinformatics.ui.components.impl;

import java.util.List;

import org.cropinformatics.common.io.FileProperties;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class FilePropertiesListEditComponent extends FilePropertiesComponent implements EditComponent<ContainerConfiguration, List<FileProperties>>
{

	private List<FileProperties> value;

	public FilePropertiesListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, openFile);
  }
  
  public FilePropertiesListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      boolean openFile, List<FileProperties> fileProperties)
  {
    super(parent, containerConfiguration, labelValue, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
       boolean openFile, List<FileProperties> fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FilePropertiesListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, List<FileProperties> fileProperties)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesListEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, List<FileProperties> fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }
  
  public List<FileProperties> getValue()
  {
    return value ;
  }

	@Override
  public void setValue(List<FileProperties> value)
  {
	  // TODO Auto-generated method stub
	  
  }
}
