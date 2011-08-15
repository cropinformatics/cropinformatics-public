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
package org.cropinformatics.ui.editors;

import java.util.HashMap;
import java.util.Iterator;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.EditorConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public abstract class AbstractMultiplePartEditor<T extends ContainerConfiguration> extends MultiPageEditorPart implements ConfigurableEditor
{
  private static final String BLANK_COMPONENT_LABEL = AbstractMultiplePartEditor.class.getName() + ".blankComponentLabel" ;
  
	private int activePageIndex;
  private HashMap<String, Component<? extends ComponentConfiguration>> childComponents;
  
  protected EditorHelper editorHelper ;
  
  private IContentOutlinePage outlinePage;
  
  private EditorConfiguration configuration ;

  protected AbstractMultiplePartEditor()
  {
    childComponents = new HashMap<String, Component<? extends ComponentConfiguration>>() ;
  	
    editorHelper = createEditorHelper() ;
   
    activePageIndex = -1;
    
    initialiseConfiguration() ;
  }

	@Override
	public final EditorConfiguration getConfiguration()
  {
    return configuration;
  }

	@Override
  public String getId()
  {
    return getClass().getName() ;
  }

  @Override
  public final void init(IEditorSite site, IEditorInput editorInput)
      throws PartInitException
  {
    setSite(site);
    setInput(editorInput);
    updateTitle();
    
    editorHelper.initialise() ;
    
    try
    {
      initialiseData();
    }
    catch (PartInitException e)
    {
      throw e ;
    }
    catch (Exception e)
    {
      throw new PartInitException(e.getMessage(), e) ;
    }
  }
  
  @Override
  public void doSave(IProgressMonitor arg0)
  {
    
  }

  @Override
  public void doSaveAs()
  {
    
  }
  
  @Override
  public boolean isSaveAsAllowed()
  {
    return false;
  }

  @Override
  public final void createPages()
  {
  	T childConfiguration = getChildContainerConfiguration(getConfiguration()) ;
  	
  	Composite composite ; 
    
    Component<? extends ComponentConfiguration> component ;
    Component<? extends ComponentConfiguration> firstComponent = null ;
    
    if (childConfiguration != null && !childConfiguration.getComponents().isEmpty())
    {
      Iterator<ComponentConfiguration> iterator = childConfiguration.getComponents().iterator() ;
      
      ComponentConfiguration componentConfiguration ;
      
      int pageIndex = 0 ;
      while (iterator.hasNext())
      {
      	componentConfiguration = iterator.next() ;
      	
      	if (componentConfiguration != null && componentConfiguration.isVisible())
      	{
      		composite = createComponentCompositeIfNeeded(getContainer(), componentConfiguration) ; 
      		
	      	component = initialiseComponent(composite, componentConfiguration, componentConfiguration.getId()) ;

	      	if (component != null && !childComponents.containsKey(componentConfiguration.getId()))
	      	{
	      		childComponents.put(componentConfiguration.getId(), component) ;
	      		
		      	component.initialise() ;
		      	
	      		if (firstComponent == null)
	      			firstComponent = component ;
	
	      		addPage(component.getControl()) ;
	      		
	      		if (componentConfiguration.getLabel() != null)
	      			setPageText(pageIndex, ConfigurationUtils.getText(componentConfiguration.getLabel(), componentConfiguration));
	          
	          ++pageIndex ;
	      	}
      	}
      }
    }
    
    if (getPageCount() == 0)
    	addPage(createBlankControl(getContainer())) ;
    
    if (firstComponent == null)
    	editorHelper.setComponent(firstComponent) ;
    
    editorHelper.createControls() ;
    
    updateErrorMessage() ;
  }

	@Override
  public final boolean isDirty()
  {
    return editorHelper.isDirty() ;
  }

	@Override
  public final synchronized void setDirty(boolean dirty)
  {
    editorHelper.setDirty(dirty) ;
    
    firePropertyChange(IEditorPart.PROP_DIRTY);
  }
  
	@Override
  public final String getStatusMessage()
  {
    return editorHelper.getStatusMessage() ;
  }
  
	@Override
  public final void dispose()
  {
  	disposeData(); 
  	
    editorHelper.dispose() ;
    
    Iterator<Component<? extends ComponentConfiguration>> components = childComponents.values().iterator() ;
    
    while (components.hasNext())
    	disposeComponent(components.next()) ;
    
    childComponents.clear() ;
    
    super.dispose();
  }

	@Override
	public boolean isDeleteEnabled()
	{
		return false ;
	}
	
	@Override
  public void delete()
  {

  }
  
  @Override
  public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
  {
    if (IContentOutlinePage.class.equals(adapter))
    {
      if (outlinePage == null)
      {
        outlinePage = createContentOutlinePage();
      }

      if (outlinePage != null)
        return outlinePage;
    }

    return super.getAdapter(adapter);
  }
  
  @Override
  public final Control getControl()
  {
	  return getContainer() ;
  }

	@Override
  public final void setFocus()
  {
		if (getContainer() != null)
			getContainer().setFocus() ;
  }
  
	@Override
  public ISelectionProvider getSelectionProvider()
  {
	  // TODO return selection provider from active component
	  return null;
  }

	protected boolean closeEditor(boolean save)
	{
		return getEditorSite().getPage().closeEditor(this, save);
	}
	
  protected final int getActivePageIndex()
  {
    return activePageIndex;
  }
  
  protected final EditorHelper getEditorHelper()
  {
    return editorHelper;
  }

  protected final IContentOutlinePage getOutlinePage()
  {
    return outlinePage ;
  }
  
  protected void updateTitle()
  {
    IEditorInput input = getEditorInput();
    setPartName(input.getName());
    setTitleToolTip(input.getToolTipText());
  }
  
	protected void updateErrorMessage()
	{
		
	}
  
  @Override
  protected final void pageChange(int newPageIndex)
  {
    activePageIndex = newPageIndex ;
    
    super.pageChange(newPageIndex);
    
    updateActions() ;
  }
  
  protected void updateActions()
  {

  }
  
  protected EditorConfiguration createDefaultConfiguration()
  {
  	EditorConfiguration editorConfiguration = ConfigurationUtils.getEditorConfiguration(this);
    
    if (editorConfiguration == null)
    {
    	editorConfiguration = ConfigurationFactory.eINSTANCE.createEditorConfiguration() ;
    	editorConfiguration.setId(getId()) ;
    }
    
    return editorConfiguration ;
  }
  
  protected abstract T getChildContainerConfiguration(EditorConfiguration configuration) ;

  protected abstract void initialiseData() throws Exception ;
  
  protected void disposeData()
  {

  }

  protected abstract Component<? extends ComponentConfiguration> initialiseComponent(Composite parent, ComponentConfiguration componentConfiguration, String id) ;

  protected void disposeComponent(Component<? extends ComponentConfiguration> component)
  {
  	component.dispose() ;
  }
  
  protected IContentOutlinePage createContentOutlinePage()
  {
    return null;
  }
  
  protected EditorHelper createEditorHelper()
  {
    return new EditorHelper(this) ;
  }
  
  protected Composite createComponentCompositeIfNeeded(Composite parent,
      ComponentConfiguration childConfiguration)
  {
    if (!ConfigurationUtils.isCreatingNewComposite(parent, childConfiguration))
    	return ConfigurationUtils.createComposite(parent, childConfiguration) ;
    else
    	return parent ;
  }
  
  protected Control createBlankControl(Composite container)
  {
	  Label label = new Label(container, SWT.NONE) ;
	  
	  label.setText(Activator.getDefault().getString(BLANK_COMPONENT_LABEL)) ;
	  
	  return label;
  }
  
  private final void initialiseConfiguration()
  {  
    this.configuration = createDefaultConfiguration();
        
    Activator.saveConfiguration(this.configuration) ;
  }
}
