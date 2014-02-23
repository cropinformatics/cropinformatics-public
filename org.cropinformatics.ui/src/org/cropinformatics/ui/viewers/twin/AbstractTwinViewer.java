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
package org.cropinformatics.ui.viewers.twin;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.Images;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.impl.SimpleControlComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.AbstractViewer;
import org.cropinformatics.ui.viewers.list.AdvancedListViewer;
import org.cropinformatics.ui.viewers.list.ListViewerFilter;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractTwinViewer<L extends Object, R extends Object> extends AbstractViewer<TwinViewerConfiguration> implements TwinViewer<L, R>
{
	public static final String LEFT_VIEWER_COMPONENT_ID = "leftViewerComponent";
	public static final String MAPPING_BUTTONS_COMPONENT_ID = "mappingButtonsComponent";
	public static final String RIGHT_VIEWER_COMPONENT_ID = "rightViewerComponent";
	
	private AdvancedListViewer<L> leftListViewer ;
  private AdvancedListViewer<R> rightListViewer ;
  
  protected Button toRightButton;

  protected Button toRightAllButton;

  protected Button toLeftButton;

  protected Button toLeftAllButton;
  
  private Composite container;
  
  // only used prior to initialise, ignored otherwise
  private List<L> leftItems ;
  private List<R> rightItems ;

  private PropertyChangeListener leftListViewerPropertyChangeListener;
  private PropertyChangeListener rightListViewerPropertyChangeListener;

  public AbstractTwinViewer(Composite parent, TwinViewerConfiguration configuration)
  {
    this(parent, configuration, null, null) ;
  }
 

  
  public AbstractTwinViewer(Composite parent, TwinViewerConfiguration configuration, List<L> leftItems)
  {
    this (parent, configuration, leftItems, null) ;
  }
  
  public AbstractTwinViewer(Composite parent, TwinViewerConfiguration configuration, List<L> leftItems, List<R> rightItems)
  {
    super(parent, configuration);
    
    // create the runnable context if needed and threading is in use.
    if (ConfigurationUtils.isLeftThreadingInUse(getConfiguration()) || ConfigurationUtils.isRightThreadingInUse(getConfiguration()))
      setRunnableContext(createDefaultRunnableContext()) ;
    
    setLeftItems(leftItems) ;
    setRightItems(rightItems) ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#getLeftItems()
   */
  public final List<L> getLeftItems()
  {
    if (leftListViewer != null)
      return leftListViewer.getItems() ;
    else
      return leftItems ;
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#setLeftItems(java.util.List)
   */
  public boolean setLeftItems(List<L> leftItems)
  {
    boolean success = true ;

    if (isInitialised())
    {
      if (leftItems != null && !leftItems.isEmpty())
      {
        List<L> newItems = null ;

        if (ConfigurationUtils.isLeftCopyItemsInUse(getConfiguration()))
        {
          newItems = new LinkedList<L>() ;

          Iterator<L> iterator = leftItems.iterator() ;

          while (success & iterator.hasNext())
            success = newItems.add(copyLeftItem(iterator.next()));
        }
        else
        {
          newItems = leftItems ;
        }

        if (success)
          success = leftListViewer.setItems(newItems) ;
        
        if (success && ConfigurationUtils.isItemRemovedLeftToRight(getConfiguration()) && rightListViewer != null && rightListViewer.getItems().size() > 0) 
          success = leftListViewer.removeItems(convertRightItems(rightListViewer.getItems())) ;

        if (success)
        {
          updateButtons() ;
        }
        else
        {
          // TODO need to replace items removed from right viewer if necessary

        }
      }
      else
      {
        success = leftListViewer.removeAllItems() ;
      }
    }
    else
    {
      if (leftItems != null && !leftItems.isEmpty())
      {
        if (ConfigurationUtils.isLeftCopyItemsInUse(getConfiguration()))
        {
          this.leftItems = new LinkedList<L>() ;

          Iterator<L> iterator = leftItems.iterator() ;

          while (success & iterator.hasNext())
            success = this.leftItems.add(copyLeftItem(iterator.next()));
        }
        else
        {
          this.leftItems = leftItems ;
        }
        
        if (ConfigurationUtils.isItemRemovedLeftToRight(getConfiguration()) && rightItems != null && rightItems.size() > 0) 
          removeRightItemsFromLeft(rightItems) ;
      }
      else
      {
        this.leftItems = new LinkedList<L>() ;
      }
    }

    
    return success ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#getRightItems()
   */
  public final List<R> getRightItems()
  {
    if (rightListViewer != null)
      return rightListViewer.getItems() ;
    else
      return rightItems ;
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#setRightItems(java.util.List)
   */
  public boolean setRightItems(List<R> rightItems)
  {
    boolean success = true ;

    if (isInitialised())
    {
      if (rightItems != null && !rightItems.isEmpty())
      {
        List<R> newItems = null ;

        if (ConfigurationUtils.isRightCopyItemsInUse(getConfiguration()))
        {
          newItems = new LinkedList<R>() ;

          Iterator<R> iterator = rightItems.iterator() ;

          while (success & iterator.hasNext())
            success = newItems.add(copyRightItem(iterator.next()));
        }
        else
        {
          newItems = rightItems ;
        }

        if (success)
          success = rightListViewer.setItems(newItems) ;
        
        if (success && ConfigurationUtils.isItemRemovedRightToLeft(getConfiguration()) && leftListViewer != null && leftListViewer.getItems().size() > 0) 
          success = rightListViewer.removeItems(convertLeftItems(leftListViewer.getItems())) ;

        if (success)
        {
          updateButtons() ;
        }
        else
        {
          // TODO need to replace items removed from left viewer if necessary

        }
      }
      else
      {
        success = rightListViewer.removeAllItems() ;
      }
    }
    else
    {
      if (rightItems != null && !rightItems.isEmpty())
      {
        if (ConfigurationUtils.isRightCopyItemsInUse(getConfiguration()))
        {
          this.rightItems = new LinkedList<R>() ;
          
          Iterator<R> iterator = rightItems.iterator() ;
          
          while (success & iterator.hasNext())
            success = this.rightItems.add(copyRightItem(iterator.next()));
        }
        else
        {
          this.rightItems = rightItems ;
        }
        
        if (ConfigurationUtils.isItemRemovedRightToLeft(getConfiguration()) && leftItems != null && leftItems.size() > 0) 
          removeLeftItemsFromRight(leftItems) ;
        
      }
      else
      {
        this.rightItems = new LinkedList<R>() ;
      }
    }
    
    return success ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#getLeftFilteredItems()
   */
  public final List<L> getLeftFilteredItems()
  {
    if (leftListViewer != null)
    {
      return leftListViewer.getFilteredItems() ;
    }
    else
    {
      return getLeftItems() ; 
    }  
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#getRightFilteredItems()
   */
  public final List<R> getRightFilteredItems()
  {
    if (rightListViewer != null)
    {
      return rightListViewer.getFilteredItems() ;
    }
    else
    {
      return getRightItems() ; 
    }  
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#addLeftFilter(org.cropinformatics.ui.viewers.list.ListViewerFilter)
   */
  public final boolean addLeftFilter(ListViewerFilter filter)
  {
    return leftListViewer.addFilter(filter) ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#removeLeftFilter(org.cropinformatics.ui.viewers.list.ListViewerFilter)
   */
  public final boolean removeLeftFilter(ListViewerFilter filter)
  {
    return leftListViewer.removeFilter(filter) ;
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#getLeftFilters()
   */
  public final List<ListViewerFilter> getLeftFilters()
  {
    return leftListViewer.getFilters() ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#setLeftFilters(java.util.List)
   */
  public final boolean setLeftFilters(List<ListViewerFilter> filters)
  {
    return leftListViewer.setFilters(filters) ;
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#addRightFilter(org.cropinformatics.ui.viewers.list.ListViewerFilter)
   */
  public final boolean addRightFilter(ListViewerFilter filter)
  {
    return rightListViewer.addFilter(filter) ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#removeRightFilter(org.cropinformatics.ui.viewers.list.ListViewerFilter)
   */
  public final boolean removeRightFilter(ListViewerFilter filter)
  {
    return rightListViewer.removeFilter(filter) ;
  }
  
  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#getRightFilters()
   */
  public final List<ListViewerFilter> getRightFilters()
  {
    return rightListViewer.getFilters() ;
  }

  /* (non-Javadoc)
   * @see org.cropinformatics.ui.viewers.twin.TwinViewer#setRightFilters(java.util.List)
   */
  public final boolean setRightFilters(List<ListViewerFilter> filters)
  {
    return rightListViewer.setFilters(filters) ;
  }
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(
      Composite parent, ComponentConfiguration configuration, String id)
  {
  	if (LEFT_VIEWER_COMPONENT_ID.equals(id))
  	{
  		ListViewerConfiguration listViewerConfiguration = null;
    	
    	if (configuration instanceof ListViewerConfiguration)
    		listViewerConfiguration = (ListViewerConfiguration)configuration ;
    	
      return createLeftListComposite(parent, listViewerConfiguration) ;
  	}
  	else
  	{
    	if (MAPPING_BUTTONS_COMPONENT_ID.equals(id))
    	{
      	ControlConfiguration controlConfiguration = null;
      	
      	if (configuration instanceof ComponentConfiguration)
      		controlConfiguration = (ControlConfiguration)configuration ;
      	
    		return createMappingButtonsComposite(parent, controlConfiguration) ;
    	}
    	else
    	{
      	if (RIGHT_VIEWER_COMPONENT_ID.equals(id))
      	{
      		ListViewerConfiguration listViewerConfiguration = null;
        	
        	if (configuration instanceof ListViewerConfiguration)
        		listViewerConfiguration = (ListViewerConfiguration)configuration ;
        	
      		return createRightListComposite(parent, listViewerConfiguration) ;
      	}
    	}
  	}

	  return null;
  }
  
	@Override
  protected void registerChildComponentIDs()
  {
		super.registerChildComponentIDs(); 
		
  	registerChildComponentID(LEFT_VIEWER_COMPONENT_ID) ;
  	registerChildComponentID(MAPPING_BUTTONS_COMPONENT_ID) ;
  	registerChildComponentID(MAPPING_BUTTONS_COMPONENT_ID) ;
  }

	@Override
  protected void createListeners()
  {
    super.createListeners();
    
    leftListViewerPropertyChangeListener = new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        handleLeftListViewerPropertyChange(event) ;
      }
      
    } ;
    
    rightListViewerPropertyChangeListener = new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        handleRightListViewerPropertyChange(event) ;
      }
      
    } ;
  }

  protected void handleLeftListViewerPropertyChange(PropertyChangeEvent event)
  {
    updateButtons() ;
  }

  protected void handleRightListViewerPropertyChange(PropertyChangeEvent event)
  {
    updateButtons() ;
  }

  @Override
  protected void addListeners()
  {
    super.addListeners();
    
    if (leftListViewer != null)
    {
      leftListViewer.addPropertyChangeListener(leftListViewerPropertyChangeListener) ;
    }
    
    if (rightListViewer != null)
    {
      rightListViewer.addPropertyChangeListener(rightListViewerPropertyChangeListener) ;
    }
  }
  
  @Override
  protected void removeListeners()
  {
    if (leftListViewer != null)
    {
      leftListViewer.removePropertyChangeListener(leftListViewerPropertyChangeListener) ;
    }
    
    if (rightListViewer != null)
    {
      rightListViewer.removePropertyChangeListener(rightListViewerPropertyChangeListener) ;
    }
    
    super.removeListeners();
  }
 

  @Override
  protected void disposeListeners()
  {
    leftListViewerPropertyChangeListener = null ;
    rightListViewerPropertyChangeListener = null ;

    super.disposeListeners();
  }

  protected final boolean addLeftItem(L item)
  {
    if (leftListViewer != null)
    {
      return leftListViewer.addItem(item) ;
    }
    else
    {
      return leftItems.add(item) ;
    }
  }
  
  protected final boolean addRightItem(R item)
  {
    if (rightListViewer != null)
    {
      return rightListViewer.addItem(item) ;
    }
    else
    {
      return rightItems.add(item) ;
    }
  }
  
  protected final boolean addLeftItems(List<L> items)
  {
    if (leftListViewer != null)
    {
      return leftListViewer.addItems(items) ;
    }
    else
    {
      return leftItems.addAll(items) ;
    }
  }
  
  protected final boolean addRightItems(List<R> items)
  {
    if (rightListViewer != null)
    {
      return rightListViewer.addItems(items) ;
    }
    else
    {
      return rightItems.addAll(items) ;
    }
  }
  
  protected final boolean removeLeftItem(L item)
  {
    if (leftListViewer != null)
    {
      return leftListViewer.removeItem(item) ;
    }
    else
    {
      return leftItems.remove(item) ;
    }
  }
  
  protected final boolean removeRightItem(R item)
  {
    if (rightListViewer != null)
    {
      return rightListViewer.removeItem(item) ;
    }
    else
    {
      return rightItems.remove(item) ;
    }
  }
  
  protected final boolean removeLeftItems(List<L> items)
  {
    if (leftListViewer != null)
    {
      return leftListViewer.removeItems(items) ;
    }
    else
    {
      return leftItems.removeAll(items) ;
    }
  }
  
  protected final boolean removeRightItems(List<R> items)
  {
    if (rightListViewer != null)
    {
      return rightListViewer.removeItems(items) ;
    }
    else
    {
      return rightItems.removeAll(items) ;
    }
  }
 
  protected IRunnableContext createDefaultRunnableContext()
  {
    return null;
  }
  
  @SuppressWarnings("rawtypes")
  protected final Component<? extends ComponentConfiguration> createLeftListComposite(Composite parent, ListViewerConfiguration configuration)
  {
    leftListViewer = createLeftListViewer(parent, configuration, leftItems) ;
    
    if (rightListViewer instanceof AbstractViewer)
    	((AbstractViewer)rightListViewer).setRunnableContext(getRunnableContext()) ;
    
    if (rightListViewer instanceof AbstractViewer)
    	((AbstractViewer)rightListViewer).setUndoContext(getUndoContext()) ;
    
    leftListViewer.initialise() ;
    
    leftListViewer.setEnabled(isEnabled());
    
    if (configuration != null && configuration.getLayoutData() != null)
    {
      ConfigurationUtils.configureViewer(leftListViewer) ;
    }
    else
    {
      GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
      gridData.horizontalSpan = 1;
      gridData.verticalSpan = 1;
      leftListViewer.getControl().setLayoutData(gridData);
    }
    
    return leftListViewer ;
  }

  protected final Component<? extends ComponentConfiguration> createMappingButtonsComposite(Composite parent, ControlConfiguration configuration)
  {
    // unmapped sections panel
    Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(1, false));
    
    GridData gridData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    gridData.horizontalAlignment = SWT.CENTER ;
    gridData.verticalAlignment = SWT.CENTER ;
    composite.setLayoutData(gridData);

    toRightButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    toRightButton.setLayoutData(gridData);
    toRightButton.setEnabled(false);
    toRightButton.setImage(Activator.getDefault().getImage(Images.ADD_BUTTON_ICON));

    toRightButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleToRight();
      }
    });

    toRightAllButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    toRightAllButton.setLayoutData(gridData);
    toRightAllButton.setEnabled(false);
    toRightAllButton.setImage(Activator.getDefault().getImage(Images.ADD_ALL_BUTTON_ICON));
    toRightAllButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleToRightAll();
      }
    });

    toLeftButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    toLeftButton.setLayoutData(gridData);
    toLeftButton.setEnabled(false);
    toLeftButton.setImage(Activator.getDefault().getImage(Images.REMOVE_BUTTON_ICON));
    toLeftButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleToLeft();
      }
    });

    toLeftAllButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    toLeftAllButton.setLayoutData(gridData);
    toLeftAllButton.setEnabled(false);
    toLeftAllButton.setImage(Activator.getDefault().getImage(Images.REMOVE_ALL_BUTTON_ICON));
    toLeftAllButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleToLeftAll();
      }
    });
    
    return new SimpleControlComponent<Composite>(composite, configuration) ;
  }

  @SuppressWarnings("rawtypes")
  protected final Component<? extends ComponentConfiguration> createRightListComposite(Composite parent, ListViewerConfiguration configuration)
  {
    rightListViewer = createRightListViewer(parent, configuration, rightItems) ;

    if (rightListViewer instanceof AbstractViewer)
    	((AbstractViewer)rightListViewer).setRunnableContext(getRunnableContext()) ;
    
    if (rightListViewer instanceof AbstractViewer)
    	((AbstractViewer)rightListViewer).setUndoContext(getUndoContext()) ;
    
    rightListViewer.initialise() ;
    
    rightListViewer.setEnabled(isEnabled());
    
    if (configuration != null && configuration.getLayoutData() != null)
    {
      ConfigurationUtils.configureViewer(rightListViewer) ;
    }
    else
    {
      GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
      gridData.horizontalSpan = 1;
      gridData.verticalSpan = 1;
      rightListViewer.getControl().setLayoutData(gridData);
    }
		return rightListViewer;
  }
  
  protected abstract AdvancedListViewer<L> createLeftListViewer(
      Composite parent, ListViewerConfiguration configuration, List<L> leftItems) ;
  
  protected abstract AdvancedListViewer<R> createRightListViewer(
      Composite parent, ListViewerConfiguration configuration, List<R> leftItems) ;

  protected void handleToRight()
  {
    if (leftListViewer.getSelectedCount() > 0)
    {
      if (leftListViewer.getSelectedCount() == 1)
      {
        if (!moveToRight(leftListViewer.getSelectedItem())) 
        	Activator.getDefault().warn("Unable to move item(s) left to right!") ;
  
      }
      else
      {
        if (!moveToRight(leftListViewer.getSelectedItems())) 
        	Activator.getDefault().warn("Unable to move item(s) left to right!") ;
      }
    }
  }

  protected void handleToRightAll()
  {
    moveAllToRight() ;
  }

  protected void handleToLeft()
  {
    if (rightListViewer.getSelectedCount() > 0)
    {
      if (rightListViewer.getSelectedCount() == 1)
      {
        if (!moveToLeft(rightListViewer.getSelectedItem()))
        	Activator.getDefault().warn("Unable to move item(s) right to left!") ;
  
      }
      else
      {
        if (!moveToLeft(rightListViewer.getSelectedItems()))
        	Activator.getDefault().warn("Unable to move item(s) right to left!") ;
      }
    }
  }
  
  protected void handleToLeftAll()
  {
    moveAllToLeft() ;
  }
  
  protected boolean moveToRight(L item)
  {
    boolean success = true ;
    
    if (item != null)
    {
      R convertedItem = null ;
      if (ConfigurationUtils.isItemAddedLeftToRight(getConfiguration()))
      {
        convertedItem = convertLeftItem(item) ;
        success = rightListViewer.addItem(convertedItem)  ;  // try to add to right
      }
      
      if (success && ConfigurationUtils.isItemRemovedLeftToRight(getConfiguration())) // remove item from left if necessary
      {
        success = leftListViewer.removeItem(item) ;
      
        if (!success && ConfigurationUtils.isItemAddedLeftToRight(getConfiguration()))
          rightListViewer.removeItem(convertedItem)  ; // undo if not successful
      }
    }
    
    return success ;
  }
  
  protected boolean moveToRight(List<L> items)
  {
    boolean success = true ;
    
    if (items != null && !items.isEmpty())
    {
      List<R> convertedItems = null ;
      if (ConfigurationUtils.isItemAddedLeftToRight(getConfiguration()))
      {
        convertedItems = convertLeftItems(items) ;
        success = rightListViewer.addItems(convertedItems)  ; // try to add to right
      }
      
      if (success && ConfigurationUtils.isItemRemovedLeftToRight(getConfiguration())) // remove items from left if necessary
      {
        success = leftListViewer.removeItems(items) ; 
      
        if (!success && ConfigurationUtils.isItemAddedLeftToRight(getConfiguration()))
          rightListViewer.removeItems(convertedItems)  ; // undo if not successful
      }
    }
    
    return success ;
  }
  
  protected boolean moveAllToRight()
  {
    boolean success = true ;
    
    List<R> convertedItems = null ;
    
    if (ConfigurationUtils.isItemAddedLeftToRight(getConfiguration()))
    {
      convertedItems = convertLeftItems(leftListViewer.getItems()) ;
      if (convertedItems != null)
        success = rightListViewer.addItems(convertedItems)  ;  // try to add to right
    }
    
    if (success && ConfigurationUtils.isItemRemovedLeftToRight(getConfiguration()))
    {
      success = leftListViewer.removeAllItems()  ; // remove items from left if necessary
   
      if (!success && ConfigurationUtils.isItemAddedLeftToRight(getConfiguration()))
      {
        rightListViewer.addItems(convertedItems)  ; // undo if not successful
        Activator.getDefault().warn("Unable to move all items to left!") ;
      }
    }
    
    return success ;
  }

  protected boolean moveToLeft(R item)
  {
    boolean success = true ;
    
    if (item != null)
    {
      L convertedItem = null ;
      if (ConfigurationUtils.isItemAddedRightToLeft(getConfiguration()))
      {
        convertedItem = convertRightItem(item) ;
        if (convertedItem != null)
          success = leftListViewer.addItem(convertedItem)  ; // try to removed from left
      }
      
      if (success && ConfigurationUtils.isItemRemovedRightToLeft(getConfiguration()))
      {
        success = rightListViewer.removeItem(item) ; // if success full try to add to right 
        if (!success && ConfigurationUtils.isItemAddedRightToLeft(getConfiguration()))
          leftListViewer.removeItem(convertedItem) ; // if that fails, go back to what was before
      }
    }
    
    return success ;
  }
  
  protected boolean moveToLeft(List<R> items)
  {
    boolean success = true ;
    
    if (items != null && items.size() > 0)
    {
      List<L> convertedItems = null ;
      if (ConfigurationUtils.isItemAddedRightToLeft(getConfiguration()))
      {
        convertedItems = convertRightItems(items) ;
        if (convertedItems != null)
          success = leftListViewer.addItems(convertedItems)  ; // try to removed from left
      }
      
      if (success && ConfigurationUtils.isItemRemovedRightToLeft(getConfiguration()))
      {
        success = rightListViewer.removeItems(items) ; // if success full try to add to right 
        if (!success && ConfigurationUtils.isItemAddedRightToLeft(getConfiguration()))
          leftListViewer.removeItems(convertedItems)  ; // if that fails, go back to what was before
      }
    }
    
    return success ;
  }
  
  protected boolean moveAllToLeft()
  {
    boolean success = true ;

    List<L> convertedItems = null ;
    
    if (ConfigurationUtils.isItemAddedRightToLeft(getConfiguration()))
    {
      convertedItems = convertRightItems(rightListViewer.getItems()) ;
      if (convertedItems != null)
        success = leftListViewer.addItems(convertedItems)  ; // if full try to add to right 
    }
    
    if (success && ConfigurationUtils.isItemRemovedRightToLeft(getConfiguration()))
    {
      success = rightListViewer.removeAllItems() ;  // try to removed from left

      if (!success && ConfigurationUtils.isItemAddedRightToLeft(getConfiguration()))
      {
        leftListViewer.setItems(convertedItems) ; // undo if not successful
        Activator.getDefault().warn("Unable to move all items to left!") ;
      }
    }
    
    return success ;
  }
  
  protected boolean isLeftEquivalentToRight(L leftItem, R rightItem)
  {
    return leftItem.equals(rightItem);
  }
  
  protected boolean isRightEquivalentToLeft(R rightItem, L leftItem)
  {
    return rightItem.equals(leftItem);
  }
  
  protected void updateLeftItemList1()
  {
    if (leftListViewer != null)
      leftListViewer.setItems(leftItems) ;
  }
  
  protected void updateRightItemList1()
  {
    if (rightListViewer != null)
      rightListViewer.setItems(rightItems) ;
  }
  
  protected L copyLeftItem(L item)
  {
    return item ;
  }
  
  protected R copyRightItem(R item)
  {
    return item ;
  }
  
  protected void updateButtons()
  {
    if (isEnabled())
    {
      if (leftListViewer != null)
      {
        if (toRightButton != null) 
          toRightButton.setEnabled(!leftListViewer.isAllSelected() && 
              canConvertLeftToRight() && leftListViewer.getSelectedCount() > 0);
        if (toRightAllButton != null) 
          toRightAllButton.setEnabled(!leftListViewer.isAllSelected()&& 
              canConvertLeftToRight() && leftListViewer.getItems().size() > 0);
      }
      
      if (rightListViewer != null)
      {
        if (toLeftButton != null) 
          toLeftButton.setEnabled(!rightListViewer.isAllSelected() && 
              canConvertRightToLeft() && rightListViewer.getSelectedCount() > 0);
        if (toLeftAllButton != null) 
          toLeftAllButton.setEnabled(!rightListViewer.isAllSelected() && 
              canConvertRightToLeft() && rightListViewer.getItems().size() > 0);
      }
    }
    else
    {
      if (toRightButton != null)
        toRightButton.setEnabled(false) ;
      
      if (toRightAllButton != null)
        toRightAllButton.setEnabled(false) ;
      
      if (toLeftButton != null)
        toLeftButton.setEnabled(false) ;
      
      if (toLeftAllButton != null)
        toLeftAllButton.setEnabled(false) ;
    }
  }
  
  protected boolean canConvertLeftToRight()
  {
    return true ;
  }
  
  protected boolean canConvertRightToLeft()
  {
    return true ;
  }

  protected abstract R convertLeftItem(L item) ;
  
  protected abstract List<R> convertLeftItems(List<L> items) ;
  
  protected abstract L convertRightItem(R item) ;
  
  protected abstract List<L> convertRightItems(List<R> items) ;

  protected final Composite getInternalContainer()
  {
    return container;
  }

  protected final void setInternalContainer(Composite container)
  {
    this.container = container;
  }
  
  protected final List<L> getLeftSelectedItems()
  {
    if (leftListViewer != null)
      return leftListViewer.getSelectedItems() ;
    else
      return new LinkedList<L>() ; 
  }
  
  protected final List<R> getRightSelectedItems()
  {
    if (leftListViewer != null)
      return rightListViewer.getSelectedItems() ;
    else
      return new LinkedList<R>() ; 
  }

  protected final AdvancedListViewer<L> getLeftListViewer()
  {
    return leftListViewer;
  }

  protected final AdvancedListViewer<R> getRightListViewer()
  {
    return rightListViewer;
  }

  @Override
  protected final TwinViewerConfiguration getDefaultConfiguration()
  {
    return ConfigurationUtils.getTwinViewerConfiguration(this) ;
  }
  
  // only used before initialise
  private final void removeRightItemsFromLeft(List<R> rightItems)
  {
    Iterator<R> rightIterator = rightItems.iterator() ;
    ListIterator<L> leftIterator ;
    
    R rightItem ;
    
    while (rightIterator.hasNext())
    {
      leftIterator = leftItems.listIterator() ;
      rightItem = rightIterator.next() ;
      
      while (leftIterator.hasNext())
      {
        if (isRightEquivalentToLeft(rightItem, leftIterator.next()))
          leftIterator.remove() ;
      }
    }
  } 

  // only used before initialise
  private final void removeLeftItemsFromRight(List<L> leftItems)
  {
    Iterator<L> leftIterator = leftItems.iterator() ;
    ListIterator<R> rightIterator ;
    
    L leftItem ;
    
    while (leftIterator.hasNext())
    {
      rightIterator = rightItems.listIterator() ;
      leftItem = leftIterator.next() ;
      
      while (rightIterator.hasNext())
      {
        if (isLeftEquivalentToRight(leftItem, rightIterator.next()))
          rightIterator.remove() ;
      }
    }
  }

  protected boolean removeAllItems()
  {
    if (isInitialised())
    {
      leftListViewer.removeAllItems() ;
      rightListViewer.removeAllItems() ;
    }
    else
    {
      leftItems.clear() ;
      rightItems.clear() ;
    }
    
    return true ;
  }
}
