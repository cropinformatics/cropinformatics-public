package org.cropinformatics.ui.dialogs;


import java.io.File;

import org.cropinformatics.ui.components.impl.FileSelectionComponent;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class FileSelectionDialog extends AbstractDialog<ContainerConfiguration>
{
	private FileSelectionComponent fileSelectionComponent ;

	public FileSelectionDialog(Shell parentShell, DialogConfiguration configuration, String title, String message)
	{
		super(parentShell, configuration, message, title);
	}
	
	public File getFile()
  {
		if (fileSelectionComponent != null)
			return fileSelectionComponent.getFile() ;
		else
			return null ;
  }

	@Override
	protected void initialiseControl(Composite parent,
	    ContainerConfiguration controlConfiguration)
	{
		fileSelectionComponent = new FileSelectionComponent(parent, controlConfiguration) ;

		fileSelectionComponent.initialise() ;
	}

	@Override
  protected ContainerConfiguration getChildControlConfiguration(
      DialogConfiguration configuration)
  {
	  return ConfigurationUtils.getChildContainerControl(configuration);
  }
}
