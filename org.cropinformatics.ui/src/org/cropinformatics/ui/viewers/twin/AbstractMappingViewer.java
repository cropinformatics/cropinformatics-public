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
package org.cropinformatics.ui.viewers.twin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.Mapping;
import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.Images;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.impl.SimpleControlComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.ListViewerConfiguration;
import org.cropinformatics.ui.configuration.MappingViewerConfiguration;
import org.cropinformatics.ui.configuration.utils.ConfigurationUtils;
import org.cropinformatics.ui.viewers.AbstractViewer;
import org.cropinformatics.ui.viewers.list.SingleListTableViewer;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractMappingViewer<F extends Object, T extends Object> extends AbstractViewer<MappingViewerConfiguration> implements MappingViewer<F, T>
{
	public static final String FROM_VIEWER_COMPONENT_ID = "fromViewerComponent";
	public static final String TO_VIEWER_COMPONENT_ID = "toViewerComponent";
	public static final String MAPPING_BUTTONS_COMPONENT_ID = "mappingButtonsComponent";
	public static final String MAPPED_VIEWER_COMPONENT_ID = "mappedViewerComponent";
	
  private FromListViewer<F> fromListViewer ;
  private ToListViewer<T> toListViewer ;
  private MappedListViewer<F, T> mappedListViewer ;
  
  protected Button mapButton;

  protected Button mapAllButton;

  protected Button unmapButton;

  protected Button unmapAllButton;
  
  private Composite container;
  
  private List<F> fromItems ;
  private List<T> toItems ;
  private List<Mapping<F, T>> mappedItems ;
  
  public AbstractMappingViewer(Composite parent, MappingViewerConfiguration configuration)
  {
    this (parent, configuration, null, null, null) ;
  }
  
  public AbstractMappingViewer(Composite parent, MappingViewerConfiguration configuration, List<F> fromItems, List<T> toItems)
  {
    this (parent, configuration, fromItems, toItems, null) ;
  }
  
  public AbstractMappingViewer(Composite parent, MappingViewerConfiguration configuration, List<F> fromItems, List<T> toItems,  
      List<Mapping<F,T>> mappedItems)
  {

    super(parent, configuration);
     
    setFromItems(fromItems) ;
    setToItems(toItems) ;
    setMappedItems(mappedItems) ;
  }
  
  /* (non-Javadoc)
   * @see org.daveneti.ui.viewers.twin.TwinViewer#getLeftItems()
   */
  public final List<F> getFromItems()
  {
    if (fromListViewer != null)
      return fromListViewer.getItems() ;
    else
      return fromItems ;
  }
  
  public final boolean setFromItems(List<F> fromItems)
  {
    boolean success = false ;

    if (fromListViewer != null)
    {
      success = fromListViewer.setItems(fromItems) ;
    }
    else
    {
      if (this.fromItems != null)
        this.fromItems.clear() ;
      else
        this.fromItems = new LinkedList<F>() ;
      
      if (fromItems != null)
        success = this.fromItems.addAll(fromItems) ;
    }
    
    return success ;
  }

  public final List<T> getToItems()
  {
    if (toListViewer != null)
      return toListViewer.getItems() ;
    else
      return toItems ;
  }
  
  public final boolean setToItems(List<T> toItems)
  {
    boolean success = false ;
    
    if (toListViewer != null)
    {
      toListViewer.setItems(toItems) ;
    }
    else
    {
      if (this.toItems != null)
        this.toItems.clear() ;
      else
        this.toItems = new LinkedList<T>() ;
    
      if (toItems != null)
        success = this.toItems.addAll(toItems) ;
    }
    
    return success ;
  } 
  
  public final List<Mapping<F,T>> getMappedItems()
  {
    if (mappedListViewer != null)
      return mappedListViewer.getItems() ;
    else
      return mappedItems ;
  }
  
  public final boolean setMappedItems(List<Mapping<F,T>> mappedItems)
  {
    boolean success = false ;
    
    if (mappedListViewer != null)
    {
    	this.mappedItems = new LinkedList<Mapping<F,T>>() ;
    	
      mappedListViewer.setItems(mappedItems) ;
    }
    else
    {
      if (this.mappedItems != null)
        this.mappedItems.clear() ;
      else
        this.mappedItems = new LinkedList<Mapping<F,T>>() ;
    
      if (mappedItems != null)
        success = this.mappedItems.addAll(mappedItems) ;
    }
    
    return success ;
  }

  public ISelection getSelection()
  {
    return null ;
  }

  public void setSelection(ISelection selection)
  {

  }
  
  protected IRunnableContext createDefaultRunnableContext()
  {
    return null;
  }
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(
      Composite parent, ComponentConfiguration configuration, String id)
  {
  	if (FROM_VIEWER_COMPONENT_ID.equals(id))
  	{
  		ListViewerConfiguration listViewerConfiguration = null;
    	
    	if (configuration instanceof ListViewerConfiguration)
    		listViewerConfiguration = (ListViewerConfiguration)configuration ;
    	
      return createFromListComposite(parent, listViewerConfiguration) ;
  	}
  	else
  	{
    	if (TO_VIEWER_COMPONENT_ID.equals(id))
    	{
    		ListViewerConfiguration listViewerConfiguration = null;
      	
      	if (configuration instanceof ListViewerConfiguration)
      		listViewerConfiguration = (ListViewerConfiguration)configuration ;
      	
        return createToListComposite(parent, listViewerConfiguration) ;
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
        	if (MAPPED_VIEWER_COMPONENT_ID.equals(id))
        	{
        		ListViewerConfiguration listViewerConfiguration = null;
          	
          	if (configuration instanceof ListViewerConfiguration)
          		listViewerConfiguration = (ListViewerConfiguration)configuration ;
          	
            return createMappedListComposite(parent, listViewerConfiguration) ;
        	}
      	}
    	}
  	}

	  return null;
  }
  
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(FROM_VIEWER_COMPONENT_ID) ;
    list.add(TO_VIEWER_COMPONENT_ID) ;
    list.add(MAPPING_BUTTONS_COMPONENT_ID) ;
    list.add(MAPPED_VIEWER_COMPONENT_ID) ;
    
    return list ;
  }

  protected final Component<? extends ComponentConfiguration> createFromListComposite(Composite parent, ListViewerConfiguration configuration)
  {
    fromListViewer = createFromListViewer(parent, configuration, fromItems) ;
    fromListViewer.initialise() ;
    
    fromListViewer.setEnabled(isEnabled());
    
    if (configuration != null && configuration.getLayoutData() != null)
    {
      ConfigurationUtils.configureViewer(fromListViewer) ;
    }
    else
    {
      GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
      gridData.horizontalSpan = 1;
      gridData.verticalSpan = 1;
      fromListViewer.getControl().setLayoutData(gridData);
    }
    
    return fromListViewer ;
  }
  
  protected final Component<? extends ComponentConfiguration> createToListComposite(Composite parent, ListViewerConfiguration configuration)
  {
    toListViewer = createToListViewer(parent, configuration, toItems) ;
    toListViewer.initialise() ;
    
    toListViewer.setEnabled(isEnabled());
    
    if (configuration != null && configuration.getLayoutData() != null)
    {
      ConfigurationUtils.configureViewer(toListViewer) ;
    }
    else
    {
      GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
      gridData.horizontalSpan = 1;
      gridData.verticalSpan = 1;
      toListViewer.getControl().setLayoutData(gridData);
    }
    
    return toListViewer ;
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

    mapButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    mapButton.setLayoutData(gridData);
    mapButton.setEnabled(false);
    mapButton.setImage(Activator.getDefault().getImage(Images.ADD_BUTTON_ICON));
    mapButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleMap();
      }
    });

    mapAllButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    mapAllButton.setLayoutData(gridData);
    mapAllButton.setEnabled(false);
    mapAllButton.setImage(Activator.getDefault().getImage(Images.ADD_ALL_BUTTON_ICON));
    mapAllButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleMapAll();
      }
    });

    unmapButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    unmapButton.setLayoutData(gridData);
    unmapButton.setEnabled(false);
    unmapButton.setImage(Activator.getDefault().getImage(Images.REMOVE_BUTTON_ICON));
    unmapButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleUnmap();
      }
    });

    unmapAllButton = new Button(composite, SWT.PUSH);
    gridData = new GridData();
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    unmapAllButton.setLayoutData(gridData);
    unmapAllButton.setEnabled(false);
    unmapAllButton.setImage(Activator.getDefault().getImage(Images.REMOVE_ALL_BUTTON_ICON));
    unmapAllButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleUnmapAll();
      }
    });
    
    return new SimpleControlComponent<Composite>(composite, configuration) ;
  }

  protected final Component<? extends ComponentConfiguration> createMappedListComposite(Composite parent, ListViewerConfiguration configuration)
  {   
    mappedListViewer = createMappedListViewer(parent, configuration, mappedItems) ;
    mappedListViewer.initialise() ;
    
    mappedListViewer.setEnabled(isEnabled());
    
    if (configuration != null && configuration.getLayoutData() != null)
    {
      ConfigurationUtils.configureViewer(mappedListViewer) ;
    }
    else
    {
      GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
      gridData.horizontalSpan = 1;
      gridData.verticalSpan = 1;
      mappedListViewer.getControl().setLayoutData(gridData);
    }
    
    return mappedListViewer ;
  }

  protected final void clearMappedItems()
  {
    if (mappedListViewer != null)
      mappedListViewer.removeAllItems() ;
    else
      if (this.mappedItems != null)
        this.mappedItems.clear() ;
      else
        this.mappedItems = new LinkedList<Mapping<F,T>>() ;
  }
  
  protected final void clearUnmappedItems()
  {
    if (fromListViewer != null)
      fromListViewer.removeAllItems() ;
    else
      if (this.fromItems != null)
        this.fromItems.clear() ;
      else
        this.fromItems = new LinkedList<F>() ;
    
    if (toListViewer != null)
      toListViewer.removeAllItems() ;
    else
      if (this.toItems != null)
        this.toItems.clear() ;
      else
        this.toItems = new LinkedList<T>() ;
  }
  
  protected FromListViewer<F> createFromListViewer(
      Composite parent, ListViewerConfiguration configuration, List<F> fromItems)
  {
    return new FromListViewer<F>(parent, configuration, fromItems) ;
  }
  
  protected ToListViewer<T> createToListViewer(
      Composite parent, ListViewerConfiguration configuration, List<T> toItems)
  {
    return new ToListViewer<T>(parent, configuration, toItems) ;
  }
  
  protected MappedListViewer<F, T> createMappedListViewer(
      Composite parent, ListViewerConfiguration configuration, List<Mapping<F, T>> mappedItems)
  {
    return new MappedListViewer<F, T>(parent, configuration, mappedItems) ;
  }
  
  protected final void handleMap()
  {
    if (fromListViewer.getSelectedCount() > 0 && toListViewer.getSelectedCount() > 0)
    {
    	List<Mapping<F, T>> mappedItems = getMappedItems() ;
    	
    	List<Mapping<F, T>> oldValue = new ArrayList<Mapping<F, T>>(mappedItems.size()) ;
    	oldValue.addAll(mappedItems) ;
    	
      map(fromListViewer.getSelectedItem(), toListViewer.getSelectedItem()) ;
      
  		updateButtons() ;
  		
  		getPropertyChangeSupport().firePropertyChange(MAPPING_PROPERTY, oldValue, getMappedItems()) ;
    }
  }
  
  protected final void handleMapAll()
  {
  	List<Mapping<F, T>> mappedItems = getMappedItems() ;
  	
  	List<Mapping<F, T>> oldValue = new ArrayList<Mapping<F, T>>(mappedItems.size()) ;
  	oldValue.addAll(mappedItems) ;
  	
  	if (performMapAll())
  	{
  		updateButtons() ;
  		
  		getPropertyChangeSupport().firePropertyChange(MAPPING_PROPERTY, oldValue, getMappedItems()) ;
  	}
  }
  
  protected final void handleUnmap()
  {
    if (mappedListViewer.getSelectedCount() > 0)
    {
    	List<Mapping<F, T>> mappedItems = getMappedItems() ;
    	
    	List<Mapping<F, T>> oldValue = new ArrayList<Mapping<F, T>>(mappedItems.size()) ;
    	oldValue.addAll(mappedItems) ;

      unmapAll(mappedListViewer.getSelectedItems()) ;
      
  		updateButtons() ;
  		
  		getPropertyChangeSupport().firePropertyChange(MAPPING_PROPERTY, oldValue, getMappedItems()) ;
    }
  }
  
  protected final void handleUnmapAll()
  {
    if (mappedListViewer.getItems().size() > 0)
    {
    	List<Mapping<F, T>> mappedItems = getMappedItems() ;
    	
    	List<Mapping<F, T>> oldValue = new ArrayList<Mapping<F, T>>(mappedItems.size()) ;
    	oldValue.addAll(mappedItems) ;
    	
      unmapAll(mappedListViewer.getItems()) ;
      
  		updateButtons() ;
  		
  		getPropertyChangeSupport().firePropertyChange(MAPPING_PROPERTY, oldValue, getMappedItems()) ;
    }
  }

  protected boolean performMapAll()
  {
  	return false ;
  }
  
  public final boolean map(F fromItem, T toItem)
  {
    boolean success = true ;
    
    Mapping<F, T> mapping = createMapping(fromItem, toItem) ;
    
    if (mappedListViewer != null)
    {
	    success = mappedListViewer.addItem(mapping)  ;
	
	    if (success)
	    {
	      if (isFromItemRemovedWhenMapped())
	        success = fromListViewer.removeItem(fromItem) ; 
	      
	      if (success && isToItemRemovedWhenMapped())
	        success = toListViewer.removeItem(toItem)  ;
	
	      if (!success)
	        mappedListViewer.removeItem(mapping)  ;
	    }
    }
    else
    {
    	mappedItems.add(mapping) ;
    }
    
    return success ;
  }

	public final boolean map(Mapping<F, T> mapping)
  {
    return map(mapping.getFrom(), mapping.getTo()) ;
  }
  
  public final boolean mapAll(List<F> fromItems, List<T> toItems)
  {
    boolean success = true ;

    if (fromItems != null && toItems != null)
    {
    	if (fromItems.size() == toItems.size())
    	{
    		Iterator<F> fromIterator = fromItems.iterator() ;
    		Iterator<T> toIterator = toItems.iterator() ;
    		
    		while (success && fromIterator.hasNext() && toIterator.hasNext())
    		{
    			success = success && map(fromIterator.next(), toIterator.next()) ;
    		}
    		
        if (!success)
          ; // TODO undo work so far
    	}
    	else
    	{
    		success = false ;
    	}
    }
    
    return success ;
  }

  public final boolean mapAll(List<Mapping<F, T>> mappings)
  {
  	//TODO check if from and to are available
    boolean success = true ;

    if (mappings != null && mappings.size() > 0)
    {
    	Iterator<Mapping<F, T>> iterator = mappings.iterator() ;

    	while (success && iterator.hasNext())
    	{
    		success = success && map(iterator.next()) ;
    	}

    	if (!success)
    		; // TODO undo work so far
    }
    
    return success ;
  }
  
  public final boolean unmap(Mapping<F, T> mapping)
  {
    boolean success = true ;

    if (mappedListViewer != null)
    {
	    success = mappedListViewer.removeItem(mapping)  ;
	
	    if (success)
	    {
	      if (isFromItemAddedWhenUnmapped())
	        success = fromListViewer.addItem(mapping.getFrom()) ; 
	      
	      if (success && isToItemAddedWhenUnmapped())
	        toListViewer.addItem(mapping.getTo())  ;
	
	      if (!success)
	        mappedListViewer.addItem(mapping)  ;
	    }
    }
    else
    {
    	mappedItems.remove(mapping) ;
    }
    
    return success ;
  }

  public final boolean unmapAll(List<Mapping<F, T>> items)
  {
    boolean success = true ;
    
    List <Mapping<F, T>> itemsToUpMap = items ;
    
    if (itemsToUpMap == getMappedItems())
    {
    	itemsToUpMap = new LinkedList<Mapping<F, T>>() ;
    	
    	itemsToUpMap.addAll(items) ;
    }
    
    Iterator<Mapping<F, T>>  iterator = itemsToUpMap.iterator() ;
    
    Mapping<F, T> mapping ;
    List<F> fromItems = new LinkedList<F>() ;
    List<T> toItems = new LinkedList<T>() ;
    
    while (success && iterator.hasNext())
    {
    	mapping = iterator.next() ;
    	
    	success = fromItems.add(mapping.getFrom()) ;
    	success = success & toItems.add(mapping.getTo()) ;
    }
    
    iterator = null ;
    
    if (success)
    {
      if (mappedListViewer != null)
      {
	      mappedListViewer.removeItems(itemsToUpMap)  ;
	    	
	      if (isFromItemAddedWhenUnmapped())
	        success = fromListViewer.addItems(fromItems) ; 
	      
	      if (success && isToItemAddedWhenUnmapped())
	        toListViewer.addItems(toItems)  ;
      }
      else
      {
      	this.mappedItems.removeAll(mappedItems) ;
      	this.fromItems.addAll(fromItems) ;
      	this.toItems.addAll(toItems) ;
      }
    }
    else
    {
    	// TODO undo work so far
    }
      
    return success ;
  }
  
  public final boolean unmapAll()
  {
  	if (mappedListViewer != null)
  	{
	    boolean success = unmapAll(mappedListViewer.getItems()) ;
	    
	    if (!success)
	      ; // TODO undo work so far
	    
	    return success ;
  	}
  	else
  	{
    	mappedItems.clear() ;
	    return true ;
  	}
  }
  
  public final boolean mapAll()
  {
    boolean success = performMapAll() ;
    
    if (!success)
      ; // TODO undo work so far
    
    return success ;
  }
  
  protected boolean canMapAll()
  {
  	return false ;
  }
  
  protected final boolean removeAllItems()
  {
    fromItems.clear() ;
    toItems.clear() ;
    updateLeftItemList() ;
    updateRightItemList() ;
    
    return true ;
  }
  
  protected Mapping<F, T> createMapping(F fromItem, T toItem)
  {
	  return new Mapping<F, T>(fromItem, toItem) ;
  }
  
  protected final void updateLeftItemList()
  {
    if (fromListViewer != null)
      fromListViewer.setItems(fromItems) ;
  }
  
  protected final void updateRightItemList()
  {
    if (toListViewer != null)
      toListViewer.setItems(toItems) ;
  }
  
  protected final void updateMappedItemList()
  {
    if (mappedListViewer != null)
      mappedListViewer.setItems(mappedItems) ;
  }
  
  protected void updateButtons()
  {
    if (isEnabled())
    {
      if (fromListViewer != null && toListViewer != null)
      {
        if (mapButton != null) 
          mapButton.setEnabled(!fromListViewer.isAllSelected() && 
              canConvertLeftToRight() && fromListViewer.getSelectedCount() == 1 &&
              !toListViewer.isAllSelected() && 
              canConvertLeftToRight() && toListViewer.getSelectedCount() == 1);
        if (mapAllButton != null) 
          mapAllButton.setEnabled(!fromListViewer.isAllSelected() &&
            !toListViewer.isAllSelected() && canMapAll()) ; 
      }
      
      if (mappedListViewer != null)
      {
        if (unmapButton != null) 
          unmapButton.setEnabled(!mappedListViewer.isAllSelected() && 
              canConvertRightToLeft() && mappedListViewer.getSelectedCount() > 0);
        if (unmapAllButton != null) 
          unmapAllButton.setEnabled(!mappedListViewer.isAllSelected() && 
              canConvertRightToLeft() && mappedListViewer.getItems().size() > 0);
      }
    }
    else
    {
      if (mapButton != null)
        mapButton.setEnabled(false) ;
      
      if (mapAllButton != null)
        mapAllButton.setEnabled(false) ;
      
      if (unmapButton != null)
        unmapButton.setEnabled(false) ;
      
      if (unmapAllButton != null)
        unmapAllButton.setEnabled(false) ;
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

  protected Point getInitialStructuredViewerSize()
  {
    return new Point(200, 150);
  }
  
  protected final List<F> getLeftList()
  {
    return fromItems ;
  }
  
  protected final List<T> getRightList()
  {
    return toItems ;
  }
  
  protected abstract ILabelProvider createFromLabelProvider() ;
  
  protected abstract ILabelProvider createToLabelProvider() ;
  
  protected abstract ILabelProvider createMappingLabelProvider() ;

  protected final Composite getInternalContainer()
  {
    return container;
  }

  protected final void setInternalContainer(Composite container)
  {
    this.container = container;
  }
  
  protected final List<F> getToSelectedItems()
  {
    return fromListViewer.getSelectedItems() ;
  }
  
  protected final List<T> getFromSelectedItems()
  {
    return toListViewer.getSelectedItems() ;
  }

  protected final FromListViewer<F> getFromListViewer()
  {
    return fromListViewer;
  }

  protected final ToListViewer<T> getToListViewer()
  {
    return toListViewer;
  }
  
  protected boolean isToItemRemovedWhenMapped()
  {
    return ConfigurationUtils.isToItemRemovedWhenMapped(getConfiguration()) ;
  }
  
  protected boolean isFromItemRemovedWhenMapped()
  {
    return ConfigurationUtils.isFromItemRemovedWhenMapped(getConfiguration());
  }

  protected boolean isToItemAddedWhenUnmapped()
  {
    return ConfigurationUtils.isToItemAddedWhenUnmapped(getConfiguration());
  }

  protected boolean isFromItemAddedWhenUnmapped()
  {
    return ConfigurationUtils.isFromItemAddedWhenUnmapped(getConfiguration());
  }
  
  @Override
  protected final MappingViewerConfiguration getDefaultConfiguration()
  {
    return ConfigurationUtils.getMappingViewerConfiguration(this) ;
  }

  protected class FromListViewer<F2> extends SingleListTableViewer<F>
  {
    public FromListViewer(Composite parent, ListViewerConfiguration configuration, List<F> items)
    {
      super(parent, configuration, items);
    }

    @Override
    protected ILabelProvider createLabelProvider()
    {
      return AbstractMappingViewer.this.createFromLabelProvider();
    }

    @Override
    protected Point getInitialStructuredViewerSize()
    {
      return AbstractMappingViewer.this.getInitialStructuredViewerSize();
    }
    
    @Override
    protected void updateButtons()
    {
      super.updateButtons() ;
      
      AbstractMappingViewer.this.updateButtons();
    }
  }
  
  protected class ToListViewer<T2> extends SingleListTableViewer<T>
  {
    public ToListViewer(Composite parent, ListViewerConfiguration configuration, List<T> items)
    {
      super(parent, configuration, items);
    }
    
    @Override
    protected ILabelProvider createLabelProvider()
    {
      return AbstractMappingViewer.this.createToLabelProvider();
    }

    @Override
    protected Point getInitialStructuredViewerSize()
    {
      return AbstractMappingViewer.this.getInitialStructuredViewerSize();
    }

    @Override
    protected void updateButtons()
    {
      super.updateButtons() ;
      
      AbstractMappingViewer.this.updateButtons();
    }
  }
  
  protected class MappedListViewer<F2, T2> extends SingleListTableViewer<Mapping<F,T>>
  {
    public MappedListViewer(Composite parent, ListViewerConfiguration configuration, List<Mapping<F,T>> items)
    {
      super(parent, configuration, items);
    }

    @Override
    protected ILabelProvider createLabelProvider()
    {
      return AbstractMappingViewer.this.createMappingLabelProvider();
    }

    @Override
    protected Point getInitialStructuredViewerSize()
    {
      return AbstractMappingViewer.this.getInitialStructuredViewerSize();
    }

    @Override
    protected void updateButtons()
    {
      super.updateButtons() ;
      
      AbstractMappingViewer.this.updateButtons();
    }
  }

}
