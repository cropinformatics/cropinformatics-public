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

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * The activator class controls the plug-in life cycle
 */
public abstract class BaseUIPlugin extends AbstractUIPlugin
{
  private static final String FULL_STOP = ".";
	private static final String ERROR_DIALOG_TITLE = BaseUIPlugin.class.getName() + ".errorDialogTitle";;
	private static final String WARNING_DIALOG_TITLE = BaseUIPlugin.class.getName() + ".warningDialogTitle";;
  
  private IPreferenceStore instancePreferenceStore;
  
	/**
	 * The constructor
	 */
	public BaseUIPlugin()
	{
	}
	
  /**
   * Gets a string for the given key. Most commonly used for obtaining language 
   * specific text required in user interfaces.
   * 
   * @param key the key of the string in the resource bundle
   * @return the required string
   */
  public final String getString(String key)
  {
    return PluginUtils.getString(getResourceBundle(), key) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {0} will be replaced by the parameter argument
   * 
   * @param key the key of the string in the resource bundle
   * @param parameter to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, String parameter)
  {
  	if (parameter != null)
  		return PluginUtils.getString(getResourceBundle(), key, new String[] {parameter}) ;
  	else
  		return PluginUtils.getString(getResourceBundle(), key) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {0} will be replaced by the parameter argument
   * 
   * @param key the key of the string in the resource bundle
   * @param parameter to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, Object parameter)
  {
    return PluginUtils.getString(getResourceBundle(), key, new Object[] {parameter}) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {0} will be replaced by the parameter argument
   * 
   * @param key the key of the string in the resource bundle
   * @param parameter to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, int parameter)
  {
    return PluginUtils.getString(getResourceBundle(), key, new String[] {String.valueOf(parameter)}) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, String[] parameters)
  {
    return PluginUtils.getString(getResourceBundle(), key, parameters) ;
  }
  
  /**
   * Gets a parameterised string for the given key.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string
   */
  public final String getString(String key, int[] parameters)
  {
    return PluginUtils.getString(getResourceBundle(), key, parameters) ;
  }

	public final String getString(String key, double[] parameters)
  {
    return PluginUtils.getString(getResourceBundle(), key, parameters) ;
  }
	
	public final String getString(String key, Object[] parameters)
  {
    return PluginUtils.getString(getResourceBundle(), key, parameters) ;
  }

  /**
   * Gets a string array for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @return the required string array
   */
  public final String[] getStringArray(String key)
  {
    return PluginUtils.getStringArray(getResourceBundle(), key) ;
  }
  
  /**
   * Gets a parameterised string array for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific text required in user interfaces.  Occurrences of 
   * of {<code>i</code>} where n is an integer from 0 to n-1, and n is size of the parameters array, will be replaced 
   * by the <code>i</code>th element in the parameters array
   * 
   * @param resourceBundle the resource bundle containing the required string
   * @param key the key of the string in the resource bundle
   * @param parameters to be substituted into the returned string
   * @return the required string array
   */
  public final String[] getStringArray(String key, String[] parameters)
  {
    return PluginUtils.getStringArray(getResourceBundle(), key, parameters) ;
  }
  
	/**
   * Gets a integer for the given key from the given resource bundle or one of its parents.
   * Most commonly used for obtaining language specific integers required in user interfaces
   * 
   * @param resourceBundle the resource bundle containing the required integer
   * @param key the key of the integer in the resource bundle
   * @return the required integer
   */
  public final Integer getInteger(String key)
  {
    return PluginUtils.getInteger(getResourceBundle(),key) ;
  }


  public void setHelp(Control control, String localContextId)
  {
  	PluginUtils.setHelp(getPluginId(), control, localContextId) ;
  }
  
  /**
   * Returns an image descriptor for the image file relative to the GenoMedium plugin.
   * 
   * @param path
   *          the path
   * @return the image descriptor
   */
  public final ImageDescriptor getImageDescriptorByPath(String path)
  {
    return PluginUtils.getImageDescriptor(getPluginId(), path) ;
  }
  
  /**
   * Creates a an image object using the image located at the given path relative to 
   * the GenoMedium plugin
   * 
   * @param device the device on which to create the image
   * @param path the relative path within the plugin for the image file
   * @return the loaded image file
   */
  public final Image createImage(Display display, String path)
  {
    return PluginUtils.createImage(getPluginId(), display, path) ;
  }
  
  /**
   * Get an image descriptor from the image registry using the given key
   * 
   * @param imageKey the key for the descriptor in the image registry 
   * @return an image descriptor from the image registry using the given key
   */
  public final ImageDescriptor getImageDescriptor(String imageKey)
  {
    return getImageRegistry().getDescriptor(imageKey);
  }

  /**
   * Get an image from the image registry using the given key
   * 
   * @param imageKey the key for the image in the image registry 
   * @return an image from the image registry using the given key
   */
  public final Image getImage(String imageKey)
  {
    return getImageRegistry().get(imageKey);
  }
  
  /**
   * Creates a URL object from a String
   * @param url
   * @return
   */
  public static final URL createURL(String url)
  {
    try
    {
      return new URL(url);
    }
    catch (MalformedURLException e)
    {
      throw new RuntimeException("Malformed URL " + url, e);
    }
  }
  
  /**
   * Reports an error message to the log file
   * 
   * @param error the error message
   */
  public final void error(String error)
  {
  	log(new Status(Status.ERROR, getPluginId(), error));
  }
  
  /**
   * Reports an error
   * 
   * @param throwable the error
   */
  public final void error(Throwable throwable)
  {
    error(getLocalizedMessage(throwable), throwable) ;
  }
  
  /**
   * Reports an error
   * 
   * @param error the error message to the log file
   * @param throwable the error
   */
  public final void error(String error, Throwable throwable)
  {
    log(new Status(Status.ERROR, getPluginId(), error, throwable));
  }
  
  /**
   * Reports an error message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the dialog title
   * @param error the error message
   */
  public final void error(Shell parent, String error)
  {
    error(parent, getString(ERROR_DIALOG_TITLE), error) ;
  }
  
  /**
   * Reports an error message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param throwable the error
   */
  public final void error(Shell parent, Throwable throwable)
  {
    error(parent, getString(ERROR_DIALOG_TITLE), getLocalizedMessage(throwable), throwable) ;
  }

  /**
   * Reports an error message within a dialog for a given plugin id and to the log file
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the dialog title
   * @param error the error message
   */
  public final void error(Shell parent, String title, String error)
  {
    log(new Status(Status.ERROR, getPluginId(), error));
    openErrorDialog(parent, title, error);
  }

  /**
   * Reports an error message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the dialog title
   * @param message the error message
   * @param error the error message
   * @param throwable the error
   * @param pluginID the plugin ID
   */
  public final void error(Shell parent, String title, String message, Throwable throwable)
  {
  	if (throwable instanceof InvocationTargetException)
  		openErrorDialog(parent, title, message, new Status(IStatus.ERROR,
    		getPluginId(), 0, getLocalizedMessage(((InvocationTargetException)throwable).getTargetException()), 
    		((InvocationTargetException)throwable).getTargetException()));
  	else
  	  openErrorDialog(parent, title, message, new Status(IStatus.ERROR,
  	    getPluginId(), 0, getLocalizedMessage(throwable), throwable));
  }

  /**
   * Reports an warning error
   * 
   * @param throwable the warning error
   */
  public final void warn(Throwable throwable)
  {
    warn(getLocalizedMessage(throwable), throwable) ;
  }
  
  /**
   * Reports an warning message for a given plugin
   * 
   * @param message the warning message
   * @param pluginID the plugin ID
   */
  public final void warn(String message)
  {
    log(new Status(Status.WARNING, getPluginId(), message));
  }
  
  /**
   * Reports an warning message for a given plugin
   * 
   * @param message the warning message
   * @param throwable the warning error
   */
  public final void warn(String message, Throwable throwable)
  {
    log(new Status(Status.WARNING, getPluginId(), message, throwable));
  }
  
  /**
   * Reports an error message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the dialog title
   * @param error the error message
   */
  public final void warn(Shell parent, String error)
  {
  	warn(parent, getString(WARNING_DIALOG_TITLE), error) ;
  }
  
  /**
   * Reports an error message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param throwable the error
   */
  public final void warn(Shell parent, Throwable throwable)
  {
  	warn(parent, getString(WARNING_DIALOG_TITLE), getLocalizedMessage(throwable), throwable) ;
  }

  /**
   * Reports an warning message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title of the dialog
   * @param warning the warning message
   */
  public final void warn(Shell parent, String title, String warning)
  {
    log(new Status(Status.WARNING, getPluginId(), warning));
    openWarningDialog(parent, title, warning);
  }
  
  /**
   * Reports an warning message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the dialog title
   * @param message the error message
   * @param error the error message
   * @param throwable the error
   */
  public final void warn(Shell parent, String title, String message, Throwable throwable)
  {
    openErrorDialog(parent, title, message, new Status(IStatus.ERROR,
    		getPluginId(), 0, getLocalizedMessage(throwable), throwable));
  }

  /**
   * Reports an warning message within a dialog for a given plugin id
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title of the dialog
   * @param warning the warning message
   * @param throwable the warning error
   */
  public final void warn(Shell parent, String title, String message, String warning, Throwable throwable)
  {
    openErrorDialog(parent, title, message, new Status(IStatus.WARNING,
    		getPluginId(), 0, message, throwable));
  }
  
  /**
   * Reports an information message for a given plugin
   * 
   * @param message the information message
 
   */
  public final void info(String message)
  {
    log(new Status(Status.INFO, getPluginId(), message));
  }

  /**
   * Reports an information message within a dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title of the dialog
   * @param warning the warning message
   */
  public final void info(Shell parent, String title, String message)
  {
    log(new Status(Status.INFO, getPluginId(), message));
    openInformationDialog(parent, title, message);
  }
  
	public void log(IStatus status)
	{
		getLog().log(status) ;
	}
	
	protected abstract ResourceBundle getResourceBundle() ;
	
	protected abstract String getPluginId() ;

  /**
   * Opens an information dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param status the status of the error or warning
   */
  private final void openInformationDialog(Shell parent, String title, String message)
  {
    MessageDialog.openInformation(parent, title, message) ;
  }
  
  /**
   * Opens a warning dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param status the status of the error or warning
   */
  private final void openWarningDialog(Shell parent, String title, String message)
  {
    MessageDialog.openWarning(parent, title, message) ;
  }
  
  /**
   * Opens a warning dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param status the status of the error or warning
   */
  private final void openErrorDialog(Shell parent, String title, String message)
  {
    MessageDialog.openError(parent, title, message) ;
  }
  
  /**
   * Opens a Error or warning dialog
   * 
   * @param parent a shell which will be the parent of the dialog
   * @param title the title of the dialog
   * @param status the status of the error or warning
   */
  private final void openErrorDialog(Shell parent, String title, String message, IStatus status)
  {
    log(status);
    ErrorDialog.openError(parent, title, message, status);
  }

  private final String getLocalizedMessage(Throwable throwable)
  {
    String message = throwable.getLocalizedMessage() ;
    
    if (message != null && message.contains(FULL_STOP))
      message = message.substring(0, message.indexOf(FULL_STOP, 0) + 1) ;
    
    return message ;
  }

  
	// TODO ensure RAP compatibility
  public IPreferenceStore getInstancePreferenceStore() 
  {
  	if (instancePreferenceStore == null)
  	{
  		instancePreferenceStore = getPreferenceStore() ;
  		
    	if (instancePreferenceStore == null)
    		instancePreferenceStore = new ScopedPreferenceStore(new InstanceScope(), getBundle().getSymbolicName()) ;
  	}

  	return instancePreferenceStore ;
  }
  
  
}
