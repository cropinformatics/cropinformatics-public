package org.daveneti.ui.components.impl;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.daveneti.ui.Activator;
import org.daveneti.ui.components.Component;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.daveneti.ui.viewers.list.AdvancedListViewer;
import org.daveneti.ui.viewers.list.FileListTreeViewer;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rwt.widgets.Upload;
import org.eclipse.rwt.widgets.UploadAdapter;
import org.eclipse.rwt.widgets.UploadEvent;
import org.eclipse.rwt.widgets.UploadItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class FileSelectionComponent extends AbstractConfigurableContainer<ContainerConfiguration>
{
	private static final String BROWSE_BUTTON_LABEL = FileSelectionComponent.class.getName() + ".browseButtonLabel" ;
	private static final String UPLOAD_BUTTON_LABEL = FileSelectionComponent.class.getName() + ".uploadButtonLabel" ;
	
	public static final String FILE_SELECTION_COMPONENT = "fileSelectionComponent" ;
	public static final String UPLOAD_COMPONENT = "uploadComponent" ;
	
	private Upload upload;
	private AdvancedListViewer<File> advancedViewer ;
	 
	public FileSelectionComponent(Composite parent, ContainerConfiguration configuration)
  {
	  super(parent, configuration);
  }
	
	public File getFile()
  {
		if (advancedViewer != null)
			if (advancedViewer.getCheckedItem() != null)
				return advancedViewer.getCheckedItem() ;
			else
				return advancedViewer.getSelectedItem();
		else
			return null;
  }
	
	@Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
		Component<? extends ComponentConfiguration> component = null ;
		
		if (UPLOAD_COMPONENT.equals(id))
		{
			upload = new Upload(parent, configuration != null ? configuration.getStyle() : SWT.NONE, getUploadFlags(configuration));
			upload.setBrowseButtonText(Activator.getDefault().getString(BROWSE_BUTTON_LABEL)); 
			upload.setUploadButtonText(Activator.getDefault().getString(UPLOAD_BUTTON_LABEL)); 
			
			upload.addUploadListener(new UploadAdapter()
			{

				public void uploadFinished(UploadEvent uploadEvent)
				{
					handleUploadFinished();
				}

				public void uploadInProgress(UploadEvent uploadEvent)
				{
					System.out.println("## partial: " + uploadEvent.getUploadedParcial());
					System.out.println("## total: " + uploadEvent.getUploadedTotal());
				}

				public void uploadException(UploadEvent uploadEvent)
				{
					Exception exception = uploadEvent.getUploadException();
					if (exception != null)
					{
						Activator.getDefault().error(Display.getCurrent().getActiveShell(), exception.getMessage()) ;
					}
				}
			});
			
			component = new SimpleControlComponent<Upload>(upload) ; ;
		}
		else
		{
			if (FILE_SELECTION_COMPONENT.equals(id))
			{
				if (configuration instanceof ListViewerConfiguration)
					advancedViewer = createListViewer(parent, (ListViewerConfiguration)configuration) ;
				else
					advancedViewer = createListViewer(parent, null) ;
				
				advancedViewer.initialise() ;
				
				component = advancedViewer ;
			}
		}
		
	  return component;
  }

	@Override
  protected ContainerConfiguration getDefaultConfiguration()
  {
	  return ConfigurationUtils.getContainerConfiguration(this);
  }

	@Override
  protected List<String> getChildConpomentIds()
  {
		List<String> childConpomentIds = super.getChildConpomentIds();
		
		childConpomentIds.add(FILE_SELECTION_COMPONENT) ;
		childConpomentIds.add(UPLOAD_COMPONENT) ;
		
		return childConpomentIds ;
  }
	
	protected AdvancedListViewer<File> createListViewer(Composite parent,
      ListViewerConfiguration configuration)
  {
	  return new FileListTreeViewer(parent, configuration, getUploadFilees()) ;
  }

	// TODO move to some util class
	private File getUploadDirectory()
  {
		return new File(Platform.getUserLocation().getURL().getFile())  ;
  }
	
	// TODO move to some util class
	private List<File> getUploadFilees()
  {
		File uploadDirectory = getUploadDirectory() ;
		
		if (!uploadDirectory.exists())
			uploadDirectory.mkdir() ;
		
		List<File> uploadDirectories = new LinkedList<File>() ;
		 
		File[] files = uploadDirectory.listFiles() ;
		
		for (int i = 0 ; i < files.length ; ++i)
			uploadDirectories.add(files[i]) ;

	  return uploadDirectories;
  }

	protected int getUploadFlags(ComponentConfiguration configuration)
  {
		// TODO configurability
	  return Upload.SHOW_PROGRESS | Upload.SHOW_UPLOAD_BUTTON | Upload.FIRE_PROGRESS_EVENTS;
  }
	
	protected void handleUploadFinished()
	{
		String lastFileUploaded = upload.getLastFileUploaded();
		
		UploadItem uploadItem = upload.getUploadItem();
		lastFileUploaded = uploadItem.getFilePath();
		
		System.out.println("filename     : " + uploadItem.getFileName());
		System.out.println("path         : " + uploadItem.getFilePath());
		System.out.println("content-type : " + uploadItem.getContentType());
		System.out.println("stream       : " + uploadItem.getFileInputStream());
			
		try
		{
			IOUtils.copy(uploadItem.getFileInputStream(), new FileOutputStream(new File(getUploadDirectory(), uploadItem.getFileName()))) ;
			
			if (uploadItem.getFileInputStream() != null)
			{
				uploadItem.getFileInputStream().close();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace(System.err);
		}
		
		Activator.getDefault().info(upload.getShell(), "File uploaded", lastFileUploaded);
		
		advancedViewer.setItems(getUploadFilees()) ;
	}
}
