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
import static org.cropinformatics.common.io.FileProperties.UNKNOWN;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.io.ExcelFileProperties;
import org.cropinformatics.common.io.FileProperties;
import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.list.SingleListTableViewer;
import org.eclipse.swt.widgets.Composite;

public class FilePropertiesComponent extends FileComponent
{  
	public static final String FILE_TYPE_COMPONENT_ID = "fileTypeCombo";
	public static final String SHEET_SELECTION_VIEWER_ID = "sheetSelectionViewer";
	
	private static final String EXCEL_OPTION = "excel";
	private static final String TAB_SEPARATED_TEXT_OPTION = "tabSeparatedText";
	private static final String COMMA_SEPARATED_TEXT_OPTION = "commaSeparatedText";
	
	private static final String EXCEL_OPTION_LABEL = FilePropertiesComponent.class.getName() + ".excelOptionLabel";
	private static final String TAB_SEPARATED_TEXT_OPTION_LABEL = FilePropertiesComponent.class.getName() + ".tabSeparatedTextOptionLabel";
	private static final String COMMA_SEPARATED_TEXT_OPTION_LABEL = FilePropertiesComponent.class.getName() + ".commaSeparatedTextOptionLabel";
  
	private static final String EXCEL_OPTION_DESCRIPTION = FilePropertiesComponent.class.getName() + ".excelOptionDescription";
	private static final String TAB_SEPARATED_TEXT_OPTION_DESCRIPTION = FilePropertiesComponent.class.getName() + ".tabSeparatedTextOptionDescription";
	private static final String COMMA_SEPARATED_TEXT_OPTION_DESCRIPTION = FilePropertiesComponent.class.getName() + ".commaSeparatedTextOptionDescription";
	
	private static final String EXCEL_FILE_EXTENSIONS = FilePropertiesComponent.class.getName() + ".excelFileExtensions";
	private static final String TAB_SEPARATED_FILE_EXTENSIONS = FilePropertiesComponent.class.getName() + ".tabSeparatedTextFileExtensions";
	private static final String COMMA_SEPARATED_FILE_EXTENSIONS = FilePropertiesComponent.class.getName() + ".commaSeparatedTextFileExtensions";
	
	private Options options;
	private OptionsComponentWithCombo fileTypeComponent;
	
  private SingleListTableViewer<String> sheetSelectionViewer ;
  
	public FilePropertiesComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, Activator.getDefault().getStringArray(EXCEL_FILE_EXTENSIONS), openFile);
  }
  
  public FilePropertiesComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue,
      boolean openFile, FileProperties fileProperties)
  {
    super(parent, containerConfiguration, labelValue, Activator.getDefault().getStringArray(EXCEL_FILE_EXTENSIONS), openFile);
  }

  public FilePropertiesComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, 
       boolean openFile, FileProperties fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, Activator.getDefault().getStringArray(EXCEL_FILE_EXTENSIONS), openFile);
  }

  public FilePropertiesComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue,
      String[] fileExtensions, boolean openFile)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }
  
  public FilePropertiesComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
  }

  public FilePropertiesComponent(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, String browseButtonValue, String clearButtonValue, 
      String[] fileExtensions, boolean openFile, FileProperties fileProperties, boolean isDirectory)
  {
    super(parent, containerConfiguration, labelValue, browseButtonValue, clearButtonValue, fileExtensions, openFile);
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
 
          sheetSelectionViewer.addPropertyChangeListener(new PropertyChangeListener()
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

  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(FILE_TYPE_COMPONENT_ID) ;
    list.add(SHEET_SELECTION_VIEWER_ID) ;
    
    return list ;
  }

	protected void handleFileTypeChanged()
  {
  	setFileText(null) ;
  	
  	if (sheetSelectionViewer != null)
  	{
  		sheetSelectionViewer.setItems(null) ;
  		
  		sheetSelectionViewer.setEnabled(getFileType() == EXCEL) ;
  		
  		switch(getFileType())
  		{
  			default : 
  			case EXCEL : 
  				setFileExtensions(Activator.getDefault().getStringArray(EXCEL_FILE_EXTENSIONS)) ;
  				break ;
  			case TAB_SEPARATED_TEXT : 
  				setFileExtensions(Activator.getDefault().getStringArray(TAB_SEPARATED_FILE_EXTENSIONS)) ;
  				break ;
  			case COMMA_SEPARATED_TEXT : 
  				setFileExtensions(Activator.getDefault().getStringArray(COMMA_SEPARATED_FILE_EXTENSIONS)) ;
  				break ;
  		}
  	}
  }

	protected void handleSheetSelectionChanged()
  {

  }

	@Override
  protected void setFile(File file)
  {
    super.setFile(file) ;
    
		updateFile(file) ;
  }
	
	protected final int getFileType()
	{
  	if (fileTypeComponent != null)
  		return fileTypeComponent.getSelectedOptionIndex() ;
  	else
  		return UNKNOWN ;
	}
	
	protected final void setFileType(int fileType)
  {
  	if (fileTypeComponent != null)
  		fileTypeComponent.setSelectedOptionIndex(fileType) ;
  }
	
  protected void updateFile(File file)
  {
  	updateSheetList() ;
  }

	private void updateSheetList()
  {
  	if (sheetSelectionViewer != null)
  	{
  		if (getFileType() == EXCEL)
  		{
  			try
  			{
  				List<String> sheets = ExcelFileProperties.getSheets(getFile()) ;
  				sheetSelectionViewer.setItems(sheets) ;

  				if (ConfigurationUtils.isCheckSelectionInUse(sheetSelectionViewer.getConfiguration()))
  					sheetSelectionViewer.setCheckedItems(sheets) ;
  				else
  					sheetSelectionViewer.setSelectedItems(sheets) ;		

  				sheetSelectionViewer.setEnabled(true) ;
  			}
  			catch (Exception e)
  			{
  				sheetSelectionViewer.setItems(null) ;
  				sheetSelectionViewer.setEnabled(false) ;
  			}
  		}
  		else
  		{
				sheetSelectionViewer.setItems(null) ;
				sheetSelectionViewer.setEnabled(false) ;
  		}
  	}
  }
}