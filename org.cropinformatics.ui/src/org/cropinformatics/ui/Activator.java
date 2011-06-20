/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy@daveneti.com) under contract by
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
package org.cropinformatics.ui;

import static org.cropinformatics.ui.Images.ADD_ALL_BUTTON_ICON;
import static org.cropinformatics.ui.Images.ADD_ALL_BUTTON_IMAGE_PATH;
import static org.cropinformatics.ui.Images.ADD_BUTTON_ICON;
import static org.cropinformatics.ui.Images.ADD_BUTTON_IMAGE_PATH;
import static org.cropinformatics.ui.Images.DOWN_BUTTON_ICON;
import static org.cropinformatics.ui.Images.DOWN_BUTTON_IMAGE_PATH;
import static org.cropinformatics.ui.Images.REMOVE_ALL_BUTTON_ICON;
import static org.cropinformatics.ui.Images.REMOVE_ALL_BUTTON_IMAGE_PATH;
import static org.cropinformatics.ui.Images.REMOVE_BUTTON_ICON;
import static org.cropinformatics.ui.Images.REMOVE_BUTTON_IMAGE_PATH;
import static org.cropinformatics.ui.Images.UP_BUTTON_ICON;
import static org.cropinformatics.ui.Images.UP_BUTTON_IMAGE_PATH;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;

import org.cropinformatics.ui.configuration.Configuration;
import org.cropinformatics.ui.configuration.utils.ConfigurationManager;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.configuration.utils.XMLConfigurationFactory;
import org.cropinformatics.ui.preferences.PreferenceConstants;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends BaseUIPlugin
{ 
	// The plug-in ID
	public static final String	PLUGIN_ID	= "org.daveneti.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator	 plugin;
	
  private static final String BUNDLE_NAME = "messages";                           //$NON-NLS-1$

  private static final ResourceBundle  RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  
	/**
	 * The constructor
	 */
	public Activator()
	{
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;
		
		initialiseConfigurationManager() ;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception
	{
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}
	
  public static IUndoContext getDefaultUndoContext()
  {
    return PlatformUI.getWorkbench().getOperationSupport().getUndoContext();
  }

  public static void saveConfiguration(Configuration configuration)
  {
    boolean save = false ;
    
    if (getDefault() != null)
      save = getDefault().getInstancePreferenceStore()
      .getBoolean(PreferenceConstants.SAVE_CONFIGURATIONS) ;
    
    if (save)
    {
      try
      {
        ConfigurationUtils.saveConfiguration(configuration) ;
      }
      catch (FileNotFoundException e)
      {
      	getDefault().warn(e) ;
      }
    }
  }
  
	@Override
  protected ResourceBundle getResourceBundle()
  {
	  return RESOURCE_BUNDLE;
  }

	@Override
  protected String getPluginId()
  {
	  return PLUGIN_ID;
  }
	
	@Override
	protected void initializeImageRegistry(ImageRegistry imageRegistry) 
	{
		imageRegistry.put(ADD_BUTTON_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, ADD_BUTTON_IMAGE_PATH));

		imageRegistry.put(ADD_ALL_BUTTON_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, ADD_ALL_BUTTON_IMAGE_PATH));

		imageRegistry.put(REMOVE_BUTTON_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, REMOVE_BUTTON_IMAGE_PATH));

		imageRegistry.put(REMOVE_ALL_BUTTON_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, REMOVE_ALL_BUTTON_IMAGE_PATH));

		imageRegistry.put(UP_BUTTON_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, UP_BUTTON_IMAGE_PATH));

		imageRegistry.put(DOWN_BUTTON_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, DOWN_BUTTON_IMAGE_PATH));


		/*imageRegistry.put(ADD_BUTTON_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, ADD_BUTTON_DISABLED_IMAGE_PATH));

		imageRegistry.put(ADD_ALL_BUTTON_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, ADD_ALL_BUTTON_DISABLED_IMAGE_PATH));

		imageRegistry.put(REMOVE_BUTTON_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, REMOVE_BUTTON_DISABLED_IMAGE_PATH));

		imageRegistry.put(REMOVE_ALL_BUTTON_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, REMOVE_ALL_BUTTON_DISABLED_IMAGE_PATH));

		imageRegistry.put(UP_BUTTON_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, UP_BUTTON_DISABLED_IMAGE_PATH));

		imageRegistry.put(DOWN_BUTTON_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, DOWN_BUTTON_DISABLED_IMAGE_PATH));


		imageRegistry.put(FIRST_HORIZONTAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, FIRST_HORIZONTAL_IMAGE_PATH));

		imageRegistry.put(PREVIOUS_HORIZONTAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, PREVIOUS_HORIZONTAL_IMAGE_PATH));

		imageRegistry.put(NEXT_HORIZONTAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, NEXT_HORIZONTAL_IMAGE_PATH));

		imageRegistry.put(LAST_HORIZONTAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, LAST_HORIZONTAL_IMAGE_PATH));


		imageRegistry.put(FIRST_HORIZONTAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, FIRST_HORIZONTAL_DISABLED_IMAGE_PATH));

		imageRegistry.put(PREVIOUS_HORIZONTAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, PREVIOUS_HORIZONTAL_DISABLED_IMAGE_PATH));

		imageRegistry.put(NEXT_HORIZONTAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, NEXT_HORIZONTAL_DISABLED_IMAGE_PATH));

		imageRegistry.put(LAST_HORIZONTAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, LAST_HORIZONTAL_DISABLED_IMAGE_PATH));


		imageRegistry.put(FIRST_VERTICAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, FIRST_VERTICAL_IMAGE_PATH));

		imageRegistry.put(PREVIOUS_VERTICAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, PREVIOUS_VERTICAL_IMAGE_PATH));

		imageRegistry.put(NEXT_VERTICAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, NEXT_VERTICAL_IMAGE_PATH));

		imageRegistry.put(LAST_VERTICAL_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, LAST_VERTICAL_IMAGE_PATH));


		imageRegistry.put(FIRST_VERTICAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, FIRST_VERTICAL_DISABLED_IMAGE_PATH));

		imageRegistry.put(PREVIOUS_VERTICAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, PREVIOUS_VERTICAL_DISABLED_IMAGE_PATH));

		imageRegistry.put(NEXT_VERTICAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, NEXT_VERTICAL_DISABLED_IMAGE_PATH));

		imageRegistry.put(LAST_VERTICAL_DISABLED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, LAST_VERTICAL_DISABLED_IMAGE_PATH));


		imageRegistry.put(VALID_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, VALID_IMAGE_PATH));

		imageRegistry.put(WARNING_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, WARNING_IMAGE_PATH));

		imageRegistry.put(ERROR_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, ERROR_IMAGE_PATH));


		imageRegistry.put(ASCENDING_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, ASCENDING_IMAGE_PATH));

		imageRegistry.put(DESCENDING_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, DESCENDING_IMAGE_PATH));

		imageRegistry.put(INSERT_ROW_BEFORE_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, INSERT_ROW_BEFORE_IMAGE_PATH));

		imageRegistry.put(INSERT_ROW_AFTER_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, INSERT_ROW_AFTER_IMAGE_PATH));

		imageRegistry.put(INSERT_COLUMN_BEFORE_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, INSERT_COLUMN_BEFORE_IMAGE_PATH));

		imageRegistry.put(INSERT_COLUMN_AFTER_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, INSERT_COLUMN_AFTER_IMAGE_PATH));


		imageRegistry.put(DELETE_ROWS_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, DELETE_ROWS_IMAGE_PATH));

		imageRegistry.put(DELETE_COLUMNS_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, DELETE_COLUMNS_IMAGE_PATH));

		imageRegistry.put(CHECKED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, CHECKED_IMAGE_PATH));

		imageRegistry.put(UNCHECKED_ICON, AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, UNCHECKED_IMAGE_PATH));*/
	}
	
  private static final void initialiseConfigurationManager() 
  {
    String userConfigurationDirectory = ConfigurationUtils.getUserConfigurationDirectory() ;

    if (userConfigurationDirectory != null && new File(userConfigurationDirectory).isDirectory())
    { 	
    	File[] files = new File(userConfigurationDirectory).listFiles(new ConfigurationFileFilter()) ;
    	
    	for (int i = 0 ; i < files.length ; ++i)
    	{
	      XMLConfigurationFactory configurationFactory = new XMLConfigurationFactory(files[i]) ;
	
	      Configuration[] configurations = configurationFactory.getConfigurations() ;
	
	      if (configurations != null)
	        for (int j = 0 ; j < configurations.length ; ++j)
	          ConfigurationManager.instance().updateConfiguration(configurations[j]) ;
    	}
    }  
  }
  
  private static class ConfigurationFileFilter implements FileFilter
  {
		public boolean accept(File pathname)
    {
	    return pathname.getName().endsWith(ConfigurationUtils.CONFIGURATION_FILE_EXTN);
    }
  }
}
