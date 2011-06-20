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
package org.cropinformatics.ui.editors;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.EditorConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public abstract class AbstractEditor<T extends ControlConfiguration> extends EditorPart implements ConfigurableEditor
{
	private EditorHelper editorHelper ;
  
  private IContentOutlinePage outlinePage;
  
  private EditorConfiguration configuration ;

	private Component<T> component;
  
  protected AbstractEditor()
  {
    this(null);
  }
  
  protected AbstractEditor(EditorConfiguration configuration)
  {
    super();
    
    editorHelper = createEditorHelper() ;
    setConfiguration(configuration) ;
  }

  public final EditorConfiguration getConfiguration()
  {
    return configuration;
  }

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
  public final void createPartControl(Composite parent)
  {
  	T childConfiguration = getChildControlConfiguration(getConfiguration()) ;
  	
  	component = initialiseComponent(
  			createComponentCompositeIfNeeded(parent, childConfiguration), childConfiguration) ; 
  	
  	if (component instanceof ISelectionProvider)
  		getSite().setSelectionProvider((ISelectionProvider)component);
    
    editorHelper.createControls() ;
    
    editorHelper.setComponent(component) ;
  }

  protected Composite createComponentCompositeIfNeeded(Composite parent,
      ComponentConfiguration childConfiguration)
  {
    if (!ConfigurationUtils.isCreatingNewComposite(parent, childConfiguration))
    	return ConfigurationUtils.createComposite(parent, childConfiguration) ;
    else
    	return parent ;
  }

  @Override
  public final boolean isDirty()
  {
    return editorHelper.isDirty() ;
  }

  public final synchronized void setDirty(boolean dirty)
  {
    editorHelper.setDirty(dirty) ;
    
    firePropertyChange(IEditorPart.PROP_DIRTY);
  }
  
  public final String getStatusMessage()
  {
    return editorHelper.getStatusMessage() ;
  }

  public final void dispose()
  {  	
    super.dispose() ;
    
  	if (component != null)
  		component.dispose() ;
  	
  	editorHelper.dispose() ;

  }
  
  public void delete()
  {

  }
  
  @SuppressWarnings("rawtypes")
  @Override
  public Object getAdapter(Class adapter)
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
	  return component != null ? component.getControl() : null ;
  }

	@Override
  public final  void setFocus()
  {
		if (component != null && component.getControl() != null)
			component.getControl().setFocus() ;
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
  
  protected abstract T getChildControlConfiguration(EditorConfiguration configuration) ;

  protected abstract Component<T> initialiseComponent(Composite parent, T configuration) ;
  
  protected IContentOutlinePage createContentOutlinePage()
  {
    return null;
  }
  
  protected void updateTitle()
  {
    IEditorInput input = getEditorInput();
    setPartName(input.getName());
    setTitleToolTip(input.getToolTipText());
  }
  
  protected EditorHelper getEditorHelper()
  {
    return editorHelper;
  }
  
  protected EditorHelper createEditorHelper()
  {
    return new EditorHelper(this) ;
  }

  protected abstract void initialiseData() throws Exception ;
  
  protected abstract void updateViewer() throws Exception ;
  
  private final void setConfiguration(EditorConfiguration configuration)
  {  
    if (configuration != null)
    {
      this.configuration = configuration;
    }
    else 
    {
      this.configuration = createDefaultConfiguration();
    }
    
    Activator.saveConfiguration(this.configuration) ;
  }
}
