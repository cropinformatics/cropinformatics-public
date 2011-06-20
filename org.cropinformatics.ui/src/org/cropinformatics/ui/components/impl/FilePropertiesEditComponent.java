/*******************************************************************************
 * Copyright 2011 Guy Davenport
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

import static org.cropinformatics.common.io.FileProperties.COMMA_SEPARATED_TEXT;
import static org.cropinformatics.common.io.FileProperties.EXCEL;
import static org.cropinformatics.common.io.FileProperties.TAB_SEPARATED_TEXT;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.io.ExcelFileProperties;
import org.cropinformatics.common.io.FileProperties;
import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.EditComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.list.SingleListTableViewer;
import org.eclipse.swt.widgets.Composite;

public class FilePropertiesEditComponent extends FileComponent implements EditComponent<ContainerConfiguration, FileProperties>
{  
	public static final String FILE_TYPE_COMPONENT_ID = "fileTypeCombo";
	public static final String SHEET_SELECTION_VIEWER_ID = "sheetSelectionViewer";
	
	private static final String EXCEL_OPTION = "excel";
	private static final String TAB_SEPARATED_TEXT_OPTION = "tabSeparatedText";
	private static final String COMMA_SEPARATED_TEXT_OPTION = "commaSeparatedText";
	
	private static final String EXCEL_OPTION_LABEL = FilePropertiesEditComponent.class.getName() + ".excelOptionLabel";
	private static final String TAB_SEPARATED_TEXT_OPTION_LABEL = FilePropertiesEditComponent.class.getName() + ".tabSeparatedTextOptionLabel";
	private static final String COMMA_SEPARATED_TEXT_OPTION_LABEL = FilePropertiesEditComponent.class.getName() + ".commaSeparatedTextLOptionLabel";
  
	private static final String EXCEL_OPTION_DESCRIPTION = FilePropertiesEditComponent.class.getName() + ".excelOptionDescription";
	private static final String TAB_SEPARATED_TEXT_OPTION_DESCRIPTION = FilePropertiesEditComponent.class.getName() + ".tabSeparatedTextOptionDescription";
	private static final String COMMA_SEPARATED_TEXT_OPTION_DESCRIPTION = FilePropertiesEditComponent.class.getName() + ".commaSeparatedTextLOptionDescription";

	private Options options;
	private OptionsComponentWithCombo fileTypeComponent;
	
  private SingleListTableViewer<String> sheetSelectionViewer ;
	private FileProperties value;

	public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
  }
  
  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      String[] fileExtensions, boolean openFile, FileProperties fileProperties)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }

  public FilePropertiesEditComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
    
    setValue(fileProperties) ;
  }
  
  public FileProperties getValue()
  {
    return value ;
  }

  public void setValue(FileProperties value)
  {  
    if (value != null)
    {
    	this.value = value ;
    	
    	setFileText(value.getFile()) ;
    	
    	if (fileTypeComponent != null)
    		fileTypeComponent.setSelectedOptionIndex(value.getFileType()) ;
    }
    else
    {
    	if (fileTypeComponent != null)
    		fileTypeComponent.setSelectedOptionIndex(-1) ;
    }
  }

  public final boolean isValid()
  {
    if (ConfigurationUtils.isMandatory(getConfiguration()))
    {
    	return getFile() != null ;
    }
    else
    {
    	return true ;
    }
  }

  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;

    if (component == null)
    {
      if (FILE_TYPE_COMPONENT_ID.equals(id))
      {
      	ContainerConfiguration containerConfiguration = null ;

        if (configuration instanceof ContainerConfiguration)
        	containerConfiguration = (ContainerConfiguration)configuration ;
        
        List<Option> optionsList = new LinkedList<Option>() ;
        
        optionsList.add(new Option(EXCEL_OPTION, Activator.getDefault().getString(EXCEL_OPTION_LABEL), Activator.getDefault().getString(EXCEL_OPTION_DESCRIPTION), EXCEL)) ;
        optionsList.add(new Option(TAB_SEPARATED_TEXT_OPTION, Activator.getDefault().getString(TAB_SEPARATED_TEXT_OPTION_LABEL), Activator.getDefault().getString(TAB_SEPARATED_TEXT_OPTION_DESCRIPTION), TAB_SEPARATED_TEXT)) ;
        optionsList.add(new Option(COMMA_SEPARATED_TEXT_OPTION, Activator.getDefault().getString(COMMA_SEPARATED_TEXT_OPTION_LABEL), Activator.getDefault().getString(COMMA_SEPARATED_TEXT_OPTION_DESCRIPTION), COMMA_SEPARATED_TEXT)) ;
        
        options = new Options(true, optionsList);
        
        options.setDefaultOption(EXCEL_OPTION) ;
        
      	fileTypeComponent = new OptionsComponentWithCombo(parent, containerConfiguration, options) ; 
      	
      	handleFileTypeChanged() ;
      	
      	fileTypeComponent.addPropertyChangeListener(new PropertyChangeListener()
        {
          public void propertyChange(PropertyChangeEvent event)
          {
          	handleFileTypeChanged() ;
          }
        }) ;

        component = fileTypeComponent ;
      	
      }
      else
      {
        if (SHEET_SELECTION_VIEWER_ID.equals(id))
        {
        	ListViewerConfiguration listViewerConfiguration = null ;

          if (configuration instanceof ListViewerConfiguration)
          	listViewerConfiguration = (ListViewerConfiguration)configuration ;
          
          sheetSelectionViewer = new SingleListTableViewer<String>(parent, listViewerConfiguration) ;
 
        	fileTypeComponent.addPropertyChangeListener(new PropertyChangeListener()
          {
            public void propertyChange(PropertyChangeEvent event)
            {
            	handleSheetSelectionChanged() ;
            }
          }) ;
        	
          component = sheetSelectionViewer ;
        }
      }
    }
    
    return component ;
  }
  
  protected void handleFileTypeChanged()
  {
  	if (getValue() == null)
  		createNewValue(getFile(), fileTypeComponent.getSelectedOptionIndex()) ;
  	
  	if (sheetSelectionViewer != null)
  	{
		  if (fileTypeComponent != null && fileTypeComponent.getSelectedOptionIndex() == EXCEL)
		  {
		  	sheetSelectionViewer.setEnabled(true) ;
		  }
  	}
  }

	protected void handleSheetSelectionChanged()
  {
  	if (getValue() == null)
  		createNewValue(getFile(), fileTypeComponent != null ? fileTypeComponent.getSelectedOptionIndex() : -1) ;
  	
	  if (ConfigurationUtils.isCheckSelectionInUse(sheetSelectionViewer.getConfiguration()))
	  	((ExcelFileProperties)value).setSheets(sheetSelectionViewer.getCheckedItems()) ;
	  else
	  	((ExcelFileProperties)value).setSheets(sheetSelectionViewer.getSelectedItems()) ;
  }

	@Override
  protected void setFile(File value)
  {
		if (getValue() == null)
		{
		  if (fileTypeComponent.getSelectedOptionIndex() == EXCEL)
		  {
		  
		  }
		}
    File oldValue = getFile() ;
    
    super.setFile(value) ;
    
    getPropertyChangeSupport().firePropertyChange(VALUE_CHANGED, oldValue, getFile()) ;
  }
	
  private void createNewValue(File file, int fileType)
  {
	  if (fileType == EXCEL)
	  {
	  	value = new ExcelFileProperties(file) ;
	  }
	  else
	  {
	  	value = new FileProperties(file, fileType) ;
	  }
  }

}