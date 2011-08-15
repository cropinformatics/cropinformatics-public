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

package org.cropinformatics.ui;

import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;
import java.util.MissingResourceException;

import org.cropinformatics.common.BundleUtils;
import org.cropinformatics.ui.utils.FileUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Utility class that provides general functionality for GenoMedium, including internationalisation
 * image descriptors and support for file dialogs
 * 
 * @author Guy Davenport (guy.davenport@cropinformatics.com)
 * @version $Id$
 *
 */
public class PluginUtils extends BundleUtils
{
  private static final String QUESTION_DIALOG_TITLE = PluginUtils.class.getName() + ".questionDialogTitle" ;
  private static final String FILE_CONFLICT_WARNING_MESSAGE = PluginUtils.class.getName() + ".fileConflictWarningMessage" ;
  private static final String NO_IMPLEMENTATION = PluginUtils.class.getName() + ".noImplementation" ;

  
  /**
   * Gets a string for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @return the required string
   */
  public static final String getString(String pluginId, String key)
  {
    try
    {
      return getString(Platform.getResourceBundle(Platform.getBundle(pluginId)), key) ;
    }
    catch (MissingResourceException e)
    {
      return '!' + key + '!';
    }
  }
 

	/**
   * Gets a integer for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific integers required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required integer
   * @param key the key of the integer in the resource bundle
   * @return the required integer
   */
  public static final Integer getInteger(String pluginId, String key)
  {
    try
    {
      return Integer.valueOf(getString(Platform.getResourceBundle(Platform.getBundle(pluginId)), key)) ;
    }
    catch (Exception e)
    {
      return null ;
    }
  }
  
  /**
   * Returns an image descriptor for the image file at the given plug-in
   * relative path.
   * 
   * @param path the path of the image relative to the given plugin
   * @return the image descriptor
   */
  public static final ImageDescriptor getImageDescriptor(String pluginID, String path)
  {
    return AbstractUIPlugin.imageDescriptorFromPlugin(
        pluginID, path);
  }



  /**
   * Creates a an image object using the image located at the given path relative to 
   * a specific plugin 
   * 
   * @param pluginID the ID of the plugin where the image file is located
   * @param device the device on which to create the image
   * @param path the relative path within the plugin for the image file
   * @return the loaded image file
   */
  public static final Image createImage(String pluginID, Device device, String path)
  {
    try
    {
      return AbstractUIPlugin.imageDescriptorFromPlugin(
          pluginID, path).createImage(device);
    }
    catch (RuntimeException e)
    {
      // e.printStackTrace(System.err);
    }

    return null;
  }

  /**
   * Opens dialog asking the user to decide if it OK to over write the 
   * given file 
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param fileName the path of file that is going to over written
   * @return <code>true</code> if the user has selected OK in response
   * to the request.
   */
  public static final boolean okToOverwriteFile(Shell parent, String fileName)
  {
    return okToOverwriteFile(parent, new File(fileName));
  }

  /**
   * Opens dialog asking the user to decide if it OK to over write the 
   * given file 
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param file the file that is going to over written
   * @return <code>true</code> if the user has selected OK in response
   * to the request.
   */
  public static final boolean okToOverwriteFile(Shell parent, File file)
  {
    if (file.exists())
    {
      return MessageDialog.openQuestion(parent,
          Activator.getDefault().getString(QUESTION_DIALOG_TITLE), //$NON-NLS-1$
          Activator.getDefault().getString(FILE_CONFLICT_WARNING_MESSAGE, //$NON-NLS-1$
              new String[] { file.toString() }));
    }
    else
    {
      return true;
    }
  }
  
  /**
   * Opens a file path dialog for the given shell with the given style and file extension filter
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title to be shown on the dialog
   * @param fileExtensionFilters filters which are used to filter the files shown in the dialog
   * @param directory the starting directory for the dialog
	 * @param openFile <code>true</code> if the dialog should be used to open a file or <code>false</code> if the dialog should used be to save a file 
   * @return the full path of the file chooser or <code>null</code> if the no path is chosen or the dialog is canceled
   * 
   * @see FileDialog
   */
  public static final String openFilePathDialog(Shell parent, String title,
      String[] fileExtensionFilters, String directory, boolean openFile)
  {
    return ((FileUtils)getImplementation(FileUtils.class)).openFilePathDialog(parent, title, fileExtensionFilters, directory, openFile);
  }
  
  /**
   * Opens a file path dialog for the given shell with the given style and file extension filter
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title to be shown on the dialog
   * @param fileExtensionFilters filters which are used to filter the files shown in the dialog
   * @param directory the starting directory for the dialog
   * @return the full paths of the file chooser or <code>null</code> if no paths are chosen or the dialog is canceled
   * 
   * @see FileDialog
   */
  public static final String[] openFilesPathDialog(Shell parent, String title,
      String[] fileExtensionFilters, String directory, boolean openFile)
  {
    return ((FileUtils)getImplementation(FileUtils.class)).openFilesPathDialog(parent, title, fileExtensionFilters, directory);
  }

  /**
   * Opens a directory dialog for the given shell with the given style
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title to be shown on the dialog
   * @param directory the starting directory for the dialog
	 * @param openDirectory <code>true</code> if the dialog should be used to open a file or <code>false</code> if the dialog should be used to save to directory 
   * @return the full path of the file chooser or <code>null</code> if the no path is chosen or the dialog is canceled
   * 
   * @see DirectoryDialog
   */
  public static final String openDirectoryPathDialog(Shell parent, String title, String directory,
      boolean openDirectory)
  {
    return ((FileUtils)getImplementation(FileUtils.class)).openDirectoryPathDialog(parent, title, directory, openDirectory);
  }
  
  /**
   * Gets the implementation of specific class or interface
   * @param type
   * @return
   */
  @SuppressWarnings("rawtypes")
  public static Object getImplementation (final Class type)  
  { 
    String name = type.getName(); 
    Object  result  =  null ; 

    try 
    {
      result = type.getClassLoader().loadClass(name + "Impl").newInstance() ;
    }  
    catch  ( Throwable  throwable )  
    {
      throw  new  RuntimeException (Activator.getDefault().getString(NO_IMPLEMENTATION, name),  throwable ) ;
    }

    return  result ;
  }
  
  /**
   * Gets the implementation of specific class or interface
   * @param type
   * @return
   */
  @SuppressWarnings("rawtypes")
  public static Object getImplementation (final  Class  type, Object[] arguments)  
  { 
    Object result  =  null ; 

    if (arguments.length > 0)
    {
      Class<?>[] parameterTypes = new Class<?>[arguments.length];

      for (int i = 0 ; i < arguments.length ; ++i)
      {
        if (arguments[i] != null)
          parameterTypes[i] = arguments[i].getClass() ;
      }

      result = getImplementation(type, parameterTypes, arguments) ;
    }

    return  result ;
  }
  
  /**
   * Gets the implementation of specific class or interface
   * @param type
   * @return
   */
  @SuppressWarnings("rawtypes")
  public static Object getImplementation (final  Class  type, Class<?>[] parameterTypes, Object[] arguments)  
  { 
    Object result  =  null ; 
    
    if (arguments.length > 0)
    {
      String name = type.getName(); 

      try 
      {
        result = type.getClassLoader().loadClass(name + "Impl").getDeclaredConstructor(parameterTypes).newInstance(arguments) ;
      }  
      catch  ( Throwable  throwable )  
      {
        throw  new  RuntimeException (Activator.getDefault().getString(NO_IMPLEMENTATION, name),  throwable ) ;
      }
    }

    return  result ;
  }
  
  public static boolean savePreferenceStore(IPreferenceStore store)
  {
    if (store instanceof IPersistentPreferenceStore)
    {
      try
      {
        ((IPersistentPreferenceStore)store).save() ;
        
        return true ;
      }
      catch (IOException e)
      {
      }     
    }
    
    return false ;
    
  }
  
  public static void setHelp(String pluginId, Control control, String localContextId)
  {
    if (localContextId != null && control != null)
    {
      PlatformUI.getWorkbench().getHelpSystem().setHelp(control, pluginId + "." + localContextId);
    }
  }
}