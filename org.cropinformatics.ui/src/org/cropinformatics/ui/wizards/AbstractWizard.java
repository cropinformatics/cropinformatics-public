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
package org.cropinformatics.ui.wizards;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Configurable;
import org.cropinformatics.ui.configuration.ConfigurationFactory;
import org.cropinformatics.ui.configuration.ControlPathElement;
import org.cropinformatics.ui.configuration.PagePathElement;
import org.cropinformatics.ui.configuration.PathElement;
import org.cropinformatics.ui.configuration.SubPath;
import org.cropinformatics.ui.configuration.WizardConfiguration;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.IPageChangingListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.dialogs.PageChangingEvent;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public abstract class AbstractWizard extends Wizard implements IWorkbenchWizard, Configurable<WizardConfiguration>
{
  protected static final int FORWARD_DIRECTION = 1;
  protected static final int BACKWARD_DIRECTION = -1;
  protected static final int UNKNOWN_DIRECTION = 0;

  private IWorkbench workbench ;
  private IStructuredSelection selection ;
  private IPageChangingListener pageChangingListener;
  private IPageChangedListener pageChangedListener;
  private WizardConfiguration configuration ;
  private PathNode rootPathNode ;
  private PageNode currentPageNode ;
  private HashMap<String, IWizardPage> pagesByName ;
  
  public AbstractWizard()
  {
    this(null);
  }
 
  public AbstractWizard(WizardConfiguration configuration)
  {
    super();
    
    pageChangingListener = new IPageChangingListener()
    {
      public void handlePageChanging(PageChangingEvent event)
      {
        if (event.getCurrentPage() instanceof IWizardPage && event.getTargetPage() instanceof IWizardPage)
          event.doit = AbstractWizard.this.handlePageChanging((IWizardPage)event.getCurrentPage(), (IWizardPage)event.getTargetPage()) ;
      }
    } ;
    
    pageChangedListener = new IPageChangedListener()
    {
      public void pageChanged(PageChangedEvent event)
      {
        if (event.getSelectedPage() instanceof IWizardPage)
          handlePageChanged((IWizardPage)event.getSelectedPage()) ;
      }
    } ;
    
    pagesByName = new HashMap<String, IWizardPage>() ;
    rootPathNode = null ;
    currentPageNode = null ;
    
    setConfiguration(configuration) ;
  }

  public final WizardConfiguration getConfiguration()
  {
    return configuration;
  }

  @Override
  public final void addPage(IWizardPage page)
  {
    if (page != null)
    {
      super.addPage(page);
      pagesByName.put(page.getName(), page) ;
    }
  }

  @Override
  public final IWizardPage getPage(String name)
  {
    if (name != null && pagesByName.containsKey(name))
      return pagesByName.get(name) ;
    else
      return super.getPage(name);
  }

  @Override
  public final String getId()
  {
    return this.getClass().getName() ;
  }

  @Override
  public final void addPages()
  {
    initialisePages() ;
    initialiseWorkflow() ;
    //printWorkFlow("", rootPathNode) ;
  }

  @SuppressWarnings("unused")
  private void printWorkFlow(String indent, PathNode pathNode)
  {
  	if (pathNode != null)
  	{
	  	if (pathNode instanceof ControlNode)
	  	{
	    	System.out.println(indent + "Control: " + ((ControlPathElement)((ControlNode)pathNode).pathElement).getConditionProperty()) ;
	  		for (int i = 0 ; i < ((ControlNode)pathNode).childStartNodes.length ; ++i) 
	  			printWorkFlow(indent + " " + i + " ", ((ControlNode)pathNode).childStartNodes[i]) ;
	  	}
	  	else
	  	{
	    	System.out.println(indent + ((PageNode)pathNode).getPage().getName()) ;
	  	}
	  	
	  	if (pathNode.nextPathNode != null)
	  		printWorkFlow(indent, pathNode.nextPathNode) ;
	  	else
	  		System.out.println(indent + "END") ;
  	}
  }

	@Override
  public final IWizardPage getStartingPage() 
  {
    if (rootPathNode != null)
    {
    	currentPageNode = rootPathNode.getPageNode() ;
      return rootPathNode.getPage() ;
    }
    else
    {
      return super.getStartingPage() ;
    }
  }
  
  @Override
  public final IWizardPage getNextPage(IWizardPage page)
  {
    if (currentPageNode != null)
    {
      return currentPageNode.getNextPage() ;
    }
    else
    {
      return super.getNextPage(page);
    }
  }

  @Override
  public final IWizardPage getPreviousPage(IWizardPage page)
  {
    if (currentPageNode != null)
    {
      return currentPageNode.getPreviousPage() ;
    }
    else
    {
      return super.getPreviousPage(page);
    }
  }
  
  @Override
  public final void init(IWorkbench workbench, IStructuredSelection selection)
  {
    setWorkbench(workbench) ;
    setSelection(selection) ;
    
    init() ;
  }

  @Override
  public boolean performCancel()
  {
    IWizardPage[] pages = this.getPages();
    
    if (pages != null)
      for (int i = 0 ; i < pages.length ; ++i)
        performPageCancel(pages[i]) ;
    
    return super.performCancel();
  }
  
  @Override
  public void setContainer(IWizardContainer wizardContainer)
  {
    if (wizardContainer != getContainer())
    {
      if (wizardContainer == null && getContainer() instanceof WizardDialog)
      {
        ((WizardDialog)getContainer()).removePageChangingListener(pageChangingListener) ;
        ((WizardDialog)getContainer()).removePageChangedListener(pageChangedListener) ;
      }
      
      super.setContainer(wizardContainer);
      
      if (getContainer() != null && getContainer() instanceof WizardDialog)
      {
        ((WizardDialog)getContainer()).addPageChangingListener(pageChangingListener) ;
        ((WizardDialog)getContainer()).addPageChangedListener(pageChangedListener) ;
      }
    }
    else
    {
      super.setContainer(wizardContainer);
    }
  }
  
  @Override
  public void dispose()
  {
    if (getContainer() != null && getContainer() instanceof WizardDialog)
    {
      ((WizardDialog)getContainer()).removePageChangingListener(pageChangingListener) ;
      ((WizardDialog)getContainer()).removePageChangedListener(pageChangedListener) ;
    }
    
    super.dispose();
  }

  protected void init()
  {
    
  }
  
  protected void execute(IRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException
  {
  	execute(false, true, runnable) ;
  }
  
  protected void execute(boolean cancelable, IRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException
  {
  	execute(true, cancelable, runnable) ;
  }
  
  protected void execute(boolean fork, boolean cancelable, IRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException
  {
  	// TODO consider using jobs here instead
		getContainer().run(fork, cancelable, runnable) ;
  }
  
  protected final IWorkbench getWorkbench()
  {
    return workbench;
  }

  protected final void setWorkbench(IWorkbench workbench)
  {
    this.workbench = workbench;
  }

  protected final IStructuredSelection getSelection()
  {
    return selection;
  }

  protected final void setSelection(IStructuredSelection selection)
  {
    this.selection = selection;
    
    handleSelectionChanged() ;
  }
  
  protected void handleSelectionChanged()
  {
  	if (getContainer() != null)
  		getContainer().updateButtons() ;
  }

	@SuppressWarnings("rawtypes")
  protected void performPageCancel(IWizardPage iWizardPage)
  {
    if (iWizardPage != null && iWizardPage instanceof AbstractWizardPage)
      ((AbstractWizardPage)iWizardPage).performCancel() ;
  }
  
  protected final boolean handlePageChanging(IWizardPage currentPage, IWizardPage targetPage)
  {
    return handlePageChanging(currentPage, targetPage, getDirection(currentPage, targetPage)) ;
  }

  protected boolean handlePageChanging(IWizardPage currentPage, IWizardPage targetPage, int direction)
  {
    if (currentPageNode != null)
    {
    	if (direction == FORWARD_DIRECTION && currentPageNode.getNextPathNode() != null)
    		currentPageNode = currentPageNode.getNextPageNode() ;
    	else
      	if (direction == BACKWARD_DIRECTION && currentPageNode.getPreviousPathNode() != null)
      		currentPageNode = currentPageNode.getPreviousPageNode() ;
    }
    
    return true ;
  }
  
  protected final int getDirection(IWizardPage currentPage, IWizardPage targetPage)
  {
    if (currentPage.getNextPage() == targetPage)
      return FORWARD_DIRECTION ;
    else
      if (currentPage.getPreviousPage() == targetPage)
        return BACKWARD_DIRECTION ;
      else
        return UNKNOWN_DIRECTION ;
  }
  
  @SuppressWarnings("rawtypes")
  protected final void handlePageChanged(IWizardPage selectedPage)
  {
    if (selectedPage instanceof AbstractWizardPage)
      ((AbstractWizardPage)selectedPage).performUpdate() ;
      
    handlePageChanged(selectedPage, currentPageNode) ;
  }
  
  protected final void handlePageChanged(IWizardPage selectedPage, PageNode selectedPageNode)
  {

  }
  
  protected final void initialisePages()
  {
    if (configuration != null)
    {
      Iterator<WizardPageConfiguration> iterator = configuration.getPages().iterator() ;
      
      WizardPageConfiguration wizardPageConfiguration ;
      
      while (iterator.hasNext())
      {
      	wizardPageConfiguration = iterator.next() ;
      	
      	if (wizardPageConfiguration != null && wizardPageConfiguration.isVisible())
      		addPage(createPage(wizardPageConfiguration)) ;
      }
    }
  }

  protected IWizardPage createPage(WizardPageConfiguration wizardPageConfiguration)
  {
    IWizardPage page = null ;

    if (wizardPageConfiguration != null)
    {
      try
      {
        Class<?> pageClass = Class.forName(wizardPageConfiguration.getClassName()) ;
        
        if (IWizardPage.class.isAssignableFrom(pageClass))
        {
          try
          {
            Constructor<?> constructor = pageClass.getConstructor(wizardPageConfiguration.getClass()) ;
            
            page = (IWizardPage)constructor.newInstance(wizardPageConfiguration) ;
          }
          catch (Exception e)
          {
            page = (IWizardPage)pageClass.newInstance() ;
          }
        }
      }
      catch (Exception e)
      {
        Activator.getDefault().error("Can not create wizard page : " + wizardPageConfiguration.getClassName()) ;
      }
    }
    
    return page;
  }

  protected final void initialiseWorkflow()
  {
    if (configuration != null && configuration.getPath() != null && configuration.getPath().size() > 0)
    {
    	rootPathNode = createPathNode(configuration.getPath(), 0, null) ;
    	
      if (configuration.getPath().size() > 1)
      	createNodePath(configuration.getPath(), 1, rootPathNode) ;
    } 
  }
  
  protected final PathNode createNodePath(EList<PathElement> pathElements, int position, PathNode previousNode)
  {
    if (position < pathElements.size())
    {
    	PathNode currentNode = previousNode ;

    	while (position < pathElements.size())
    	{
    		currentNode = createPathNode(pathElements, position, currentNode) ;
    		
    		if (currentNode == null) // skip unknown nodes
    			currentNode = previousNode ;
    		
    		++position ;
    	}
    	
    	return currentNode ;
    }
    else
    {
      return null ;
    }
  }
  
  protected final PathNode createPathNode(EList<PathElement> pathElements, int position, PathNode previousNode)
  {
    PathNode node = null ;
    PathElement pathElement = pathElements.get(position) ;
    EList<PathElement> childPathElements  ;
     
    if (pathElement instanceof ControlPathElement)
    {
    	ControlPathElement controlPathElement = (ControlPathElement)pathElement ;
    	ControlNode controlNode = new ControlNode(pathElement) ;

    	controlNode.childConditionValues = new Object[controlPathElement.getSubPaths().size()] ;
    	controlNode.childStartNodes = new PathNode[controlPathElement.getSubPaths().size()] ;
    	controlNode.childEndNodes = new PathNode[controlPathElement.getSubPaths().size()] ;
    	
    	SubPath subPath = null ;

    	Iterator<SubPath> iterator = controlPathElement.getSubPaths().iterator() ;

    	int i = 0 ;

    	while (iterator.hasNext())
    	{
    		subPath = iterator.next() ;

    		controlNode.childConditionValues[i] = subPath.getConditionValue() ;
    		childPathElements = subPath.getPath() ;
    		controlNode.childStartNodes[i] = createPathNode(childPathElements, 0, controlNode) ;
    		controlNode.childStartNodes[i].previousPathNode = controlNode ;

    		if (childPathElements.size() > 1)
    			controlNode.childEndNodes[i] = createNodePath(childPathElements, 1, controlNode.childStartNodes[i]) ;
    		else
    			controlNode.childEndNodes[i] = controlNode.childStartNodes[i] ;
    		++i ;
    	}

    	node = controlNode ;
    }
    else
    {
			WizardPageConfiguration wizardPageConfiguration = ConfigurationUtils.getWizardPageConfiguration(getConfiguration(), ((PagePathElement)pathElement).getPageId()) ;

    	if (wizardPageConfiguration != null && wizardPageConfiguration.isVisible())
    	{
    		IWizardPage page = getPage(((PagePathElement)pathElement).getPageId()) ;

    		if (page != null)
    		{
    			node = new PageNode(page, pathElement) ;
    		}
    		else
    		{
    			Activator.getDefault().warn("Unknown page :" + ((PagePathElement)pathElement).getPageId()) ;
    		}
    	}
    	else
    	{
    		Activator.getDefault().warn("Unknown page :" + ((PagePathElement)pathElement).getPageId()) ;
    	}
    }
    
    if (node != null)
    {
    	node.previousPathNode = previousNode ;
    	if (previousNode != null)
    		previousNode.nextPathNode = node ;
    }
		
    return node;
  }

  protected WizardConfiguration createDefaultConfiguration()
  {
    WizardConfiguration wizardConfiguration = ConfigurationUtils.getWizardConfiguration(this);
    
    if (wizardConfiguration == null)
    {
      wizardConfiguration = ConfigurationFactory.eINSTANCE.createWizardConfiguration() ;
      wizardConfiguration.setId(getId()) ;
    }
    
    return wizardConfiguration ;
  }
  
  private final void setConfiguration(WizardConfiguration configuration)
  {
    if (configuration != null)
    {
      this.configuration = configuration;
    }
    else 
    {
      this.configuration = createDefaultConfiguration() ;
    }
    
    Activator.saveConfiguration(this.configuration) ;
  }
  
	private boolean valueEquals(Object conditionProperty, Object object)
  {
		if (object != null && object instanceof String)
		{
			if (conditionProperty instanceof Boolean)
			{
				conditionProperty.equals(Boolean.valueOf((String)object)) ;
			}
			else
			{
				if (conditionProperty instanceof Number)
				{
					try
          {
	          if (conditionProperty instanceof Integer)
	          {
	          	return conditionProperty.equals(Integer.valueOf((String)object)) ;
	          }
	          else
	          {
	          	if (conditionProperty instanceof Double)
	          	{
	          		return conditionProperty.equals(Double.valueOf((String)object)) ;
	          	}
	          	else
	          	{
	          		if (conditionProperty instanceof Short)
	          		{
	          			return conditionProperty.equals(Short.valueOf((String)object)) ;
	          		}
	          		else
	          		{
	          			if (conditionProperty instanceof Long)
	          			{
	          				return conditionProperty.equals(Long.valueOf((String)object)) ;
	          			}
	          			else
	          			{
	          				if (conditionProperty instanceof Float)
	          				{
	          					return conditionProperty.equals(Float.valueOf((String)object)) ;
	          				}
	          			}
	          		}
	          	}
	          }
          }
          catch (NumberFormatException e)
          {
          	return false;
          }
				}
				else
				{
					if (conditionProperty instanceof String)
					{
						return conditionProperty.equals((String)object) ;
					}
				}
			}
		}

	  return false;
  }
  
  private abstract class PathNode
  {
    protected PathElement pathElement ;
    protected PathNode nextPathNode ;
    protected PathNode previousPathNode ;

    /**
     * @param page
     * @param pageId
     * @param pathElement
     */
    public PathNode(PathElement pathElement)
    {
      super();
      this.pathElement = pathElement;
    }

    public abstract PageNode getPageNode() ;

		public abstract IWizardPage getPage() ;

    public PathNode getPreviousPathNode()
    {
      return previousPathNode ;
    }
    
		public PathNode getNextPathNode()
    {
      return nextPathNode ;
    }
    
    public PageNode getPreviousPageNode()
    {
			PathNode pathNode = previousPathNode ;
			
			while (pathNode instanceof ControlNode || (pathNode != null && !pathNode.isVisible()))
			{
				pathNode = pathNode.getPreviousPathNode() ;
			}
			
			if (pathNode != null)
				return pathNode.getPageNode() ;
			else
				return null ;
    }

		public PageNode getNextPageNode()
    {
			PathNode pathNode = nextPathNode ;
			
			while (pathNode instanceof ControlNode || (pathNode != null && !pathNode.isVisible()))
			{
				pathNode = pathNode.getNextPathNode() ;
			}
			
			if (pathNode != null)
				return pathNode.getPageNode() ;
			else
				return null ;
    }

		private boolean isVisible()
    {
	    return getPage() instanceof ConfigurableWizardPage && ((ConfigurableWizardPage)getPage()).isEnabled() ;
    }

		public final IWizardPage getNextPage()
    {
      if (getNextPageNode() != null)
        return getNextPageNode().getPage() ;
      else
        return null ;
    }

    public final IWizardPage getPreviousPage()
    {
      if (getPreviousPageNode() != null)
        return getPreviousPageNode().getPage() ;
      else
        return null ;
    }
  }
  
  private class PageNode extends PathNode
  {
    private IWizardPage page ;
    
    /**
     * @param page
     * @param pageId
     * @param pathElement
     */
    public PageNode(IWizardPage page, PathElement pathElement)
    {
      super(pathElement);
      this.page = page;
    }
 
    public PageNode getPageNode()
    {
    	return this ;
    }

		public final IWizardPage getPage()
    {
      return page;
    }
  }
  
  private class ControlNode extends PathNode
  {
    private PathNode[] childStartNodes ;
    private PathNode[] childEndNodes ;
    private Object[] childConditionValues ;
    
    public ControlNode(PathElement pathElement)
    {
      super(pathElement);
    }
    
    public PageNode getPageNode()
    {
    	return getNextPageNode() ;
    }

    public IWizardPage getPage()
    {
	    return getNextPage() ;
    }
    
    @Override
    public PathNode getNextPathNode()
    {
      if (pathElement instanceof ControlPathElement)
      {
        PathNode nextChildNode = null ; 
        boolean found = false ;
        
        ControlPathElement controlPathElement = (ControlPathElement)pathElement ;

        try
        {
        	Object propertySource = AbstractWizard.this ;
        	
        	if (controlPathElement.getConditionPageId() != null)
        		propertySource = AbstractWizard.this.getPage(controlPathElement.getConditionPageId()) ;
        	
          Object conditionProperty = org.apache.commons.beanutils.BeanUtils.getProperty(propertySource, controlPathElement.getConditionProperty()) ;
          
          if (conditionProperty != null)
          {
            int i = 0 ;
      
            while (!found && i < childConditionValues.length)
            {
              if (valueEquals(conditionProperty, childConditionValues[i]))
              {
                found = true ;
                nextChildNode = childStartNodes[i] ;
              }
              ++i ;
            }
          }

        }
        catch (Exception e)
        {
          // TODO Auto-generated catch block
          e.printStackTrace(System.err);
        }
        
        if (found && nextChildNode != null)
          return nextChildNode ;
        else
        	return super.getNextPathNode() ;
      }

      return null ;
    }
  }
}
