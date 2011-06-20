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
package org.daveneti.ui.viewers.list;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

import org.apache.commons.collections.list.SetUniqueList;
import org.daveneti.ui.Activator;
import org.daveneti.ui.Images;
import org.daveneti.ui.components.Component;
import org.daveneti.ui.components.impl.ControlComponent;
import org.daveneti.ui.components.impl.SimpleControlComponent;
import org.daveneti.ui.components.impl.SimpleViewerComponent;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ControlConfiguration;
import org.daveneti.ui.configuration.DialogConfiguration;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.daveneti.ui.dialogs.AbstractEditDialog;
import org.daveneti.ui.utils.LabelUtils;
import org.daveneti.ui.viewers.IdentificationLabelProvider;
import org.daveneti.ui.viewers.SelectionChangedSupport;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

/**
 * Super-class for all viewers that use a StructuredViewer to display the list
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 * @see StructuredViewer
 * 
 * @param <T> the type of the elements in the list
 */
public abstract class AbstractSingleListStructuredViewer<T extends Object> extends AbstractListViewer<T> implements AdvancedListViewer<T>
{
  public static final String STRUCTURED_VIEWER_CONPONENT_ID = "structuredViewer";

	public static final String VIEWER_COMPONENT_ID = "viewerComponent" ;

	public static final String FILTER_COMPONENT_ID = "filterComponent" ;
	
	public static final String STRING_FILTER_COMPONENT_ID = "stringFilterComponent" ;
	
	public static final String REORDER_COMPONENT_ID = "reorderComponent" ;

	public static final String CLEAR_SELECTION_COMPONENT_ID = "clearSelectionComponent" ;
  
	public static final String CLEAR_CHECK_COMPONENT_ID = "clearCheckComponent" ;
	
	public static final String CHECK_ALL_COMPONENT_ID = "checkAllComponent" ;
	
	public static final String EDIT_ITEM_COMPONENT_ID = "editItemComponent" ;
	
	public static final String ADD_ITEM_COMPONENT_ID = "addItemComponent" ;
	
	public static final String REMOVE_ITEM_COMPONENT_ID = "removeItemComponent" ;
	
	public static final String ALL_SELECTED_COMPONENT_ID = "allSelectComponent" ;
	
	public static final String REGEX_COMPONENT_ID = "regexComponent" ;
	
	public static final String EDIT_DIALOG_ID = "editDialog";
  	
  private static final String WILDCARD = "*" ;
  
  private static final String RETRIEVE_ELEMENT_BEGIN_TASK_LABEL  = AbstractSingleListStructuredViewer.class.getName() + ".retrieveElementsBeginTaskLabel" ;
  
  private static final String RETRIEVE_ELEMENT_SUB_TASK_LABEL  = AbstractSingleListStructuredViewer.class.getName() + ".retrieveElementsSubTaskLabel" ;

  private static final String CLEAR_FILTERS_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".clearFiltersLabel" ;
  
  private static final String REGEX_FILTER_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".regex" ;
  
  private static final String NAME_FILTER  = AbstractSingleListStructuredViewer.class.getName() + ".nameFilter" ;

  private static final String FILTER_BY_LABEL  = AbstractSingleListStructuredViewer.class.getName() + ".filterByLabel" ;

  private static final String ADD_ITEM_BUTTON_LABEL  = AbstractSingleListStructuredViewer.class.getName() + ".addItemButtonLabel" ;

  private static final String REMOVE_ITEM_BUTTON_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".removeItemButtonLabel" ;
  
  private static final String EDIT_ITEM_BUTTON_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".editItemButtonLabel" ;
  
  private static final String ALL_SELECTED_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".allSelectedLabel" ;
  
  private static final String CLEAR_SELECTION_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".clearSelectionLabel" ;
  
  private static final String CLEAR_SELECTIONS_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".clearSelectionsLabel" ;
  
  private static final String CHECK_ALL_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".checkAllLabel" ;
  
  private static final String CLEAR_CHECK_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".clearCheckLabel" ;
  
  private static final String CLEAR_CHECKS_LABEL = AbstractSingleListStructuredViewer.class.getName() + ".clearChecksLabel" ;

  private static final int DEFAULT_WIDGET_STYLES = SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION ;

  public static final int MIN_STEP_SIZE = 1;
  public static final int MAX_STEP_SIZE = 1000;

  private StructuredViewer structuredViewer ;
  
  private ControlComponent<ControlConfiguration, Text> filterText ;
  
  private List<T> items ;
  
  private List<T> selectedItems ;
  
  private List<T> checkedItems ;
  
  private ViewerListenerAndFilter viewerListenerAndFilter ;
  
  private Button upButton;

  private Button downButton;
  
  private Button clearFiltersButton;
  
  private Button clearStringFilterButton;

  private ControlComponent<ControlConfiguration, Button> regexButton;
  
  private ControlComponent<ControlConfiguration, Button> addItemButton;

  private ControlComponent<ControlConfiguration, Button> removeItemButton;
  
  private ControlComponent<ControlConfiguration, Button> editItemButton;

  private List<ListViewerFilter> filters ;

  private ComboViewer filterComboViewer;

  private ListViewerFilter currentFilter ;

  private Label filterByLabel;
  
  private ControlComponent<ControlConfiguration, Button> clearSelectionButton;
  
  private ControlComponent<ControlConfiguration, Button> clearCheckButton;

  private ControlComponent<ControlConfiguration, Button> checkAllButton;
  
  private ControlComponent<ControlConfiguration, Button> allSelectedButton;

  private boolean allSelected ;

  private boolean canceled;
  
  private SelectionChangedSupport selectionChangedSupport ;
  
  public AbstractSingleListStructuredViewer(Composite parent, ListViewerConfiguration configuration)
  {
    this(parent, configuration, null, null) ;
  }
  
  public AbstractSingleListStructuredViewer(Composite parent, ListViewerConfiguration configuration, List<T> items)
  {
    this(parent, configuration, items, null) ;
  }
  
  public AbstractSingleListStructuredViewer(Composite parent, ListViewerConfiguration configuration, List<T> items, List<T> selectedItems)
  {
    super(parent, configuration) ;

    viewerListenerAndFilter = new ViewerListenerAndFilter() ;

    selectionChangedSupport = new SelectionChangedSupport(this) ;
    
    filters = new LinkedList<ListViewerFilter>()  ;
    
    this.selectedItems = new LinkedList<T>() ;
    
    this.checkedItems = new LinkedList<T>() ;
    
    setItems(items) ;
    
    createInitialFilters() ;
    
    if (!ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()) && selectedItems != null && selectedItems.size() > 1)
    {
      Activator.getDefault().warn("Single selection in use only the first selected item will be used") ;
      setSelectedItem(selectedItems.get(0)) ;
    }
    else
    {
      setSelectedItems(selectedItems) ;
    }
  }
  
  public final boolean isEmpty()
  {
    if (items != null)
      return items.isEmpty() ;
    else
      return false ;
  }
  
  public final int getItemCount()
  {
    if (items != null)
      return items.size() ;
    else
      return 0 ;
  }

  public final List<T> getItems()
  {
    return items ;
  }
  
  public final List<T> getFilteredItems()
  {
    if (structuredViewer != null && structuredViewer.getFilters() != null && structuredViewer.getFilters().length > 0)
    {
      ArrayList<T> filtered = new ArrayList<T>(items.size());
      
      Iterator<T> iterator = items.iterator() ;
      
      T element ; 
      
      while (iterator.hasNext())
      {
        element = iterator.next() ;

        if (viewerListenerAndFilter.select(element) && (currentFilter == null || currentFilter.select(element)))
          filtered.add(element);
      }
      
      return filtered ;
    }
    else
    {
      return getItems() ; 
    }  
  }

  @SuppressWarnings("unchecked")
  public final boolean setItems(List<T> items)
  {    
    if (items != null && !items.isEmpty())
    {
      if (ConfigurationUtils.isCopyItemsInUse(getConfiguration()))
      {
        if (!getConfiguration().isDuplicateAllowed())
          this.items = SetUniqueList.decorate(new LinkedList<T>());
        else
          this.items = new LinkedList<T>() ;
        
        Iterator<T> iterator = items.iterator() ;
        
        while (iterator.hasNext())
          this.items.add(copyItem(iterator.next()));
      }
      else
      {
        //TODO not supported
        //if (!getListViewerProperties().isDuplicateAllowed())
        //  this.items = SetUniqueList.decorate(items);
        //else
      	setItemsInternal(items) ;
      }
    }
    else
    {
    //TODO not supported
      //if (!getListViewerProperties().isDuplicateAllowed())
      //  this.items = SetUniqueList.decorate(items);
      //else
        this.items = new LinkedList<T>() ;
    }
    
    // reset selected items
    if (ConfigurationUtils.isMantainingSelectionState(getConfiguration()))
    	initialiseSelection() ;
    else
    	setSelectedItems((List<T>)null) ;
    
    if (ConfigurationUtils.isMantainingCheckedState(getConfiguration()))
    	initialiseChecked() ;
    else
    	setCheckedItems((List<T>)null) ;
    
    updateButtons() ;
    updateItemList() ;
    
    return true ;
  }


	@SuppressWarnings("unchecked")
  public final boolean addItems(List<T> items)
  {
    boolean success = true ;
    
    if (items != null && !items.isEmpty())
    {    
      List<T> itemsToAdd ;
      if (getConfiguration() != null && !getConfiguration().isDuplicateAllowed())
        itemsToAdd = SetUniqueList.decorate(items);
      else
        itemsToAdd = items;
      
      if (getConfiguration() != null && getConfiguration().isCopyItemsInUse())
      {
        Iterator<T> iterator = itemsToAdd.iterator() ;
        
        while (success && iterator.hasNext())
          success = this.items.add(copyItem(iterator.next()));
      }
      else
      {
        success = this.items.addAll(itemsToAdd);
      }
      
      updateButtons() ;
      updateItemList() ;  
    }
    
    return success ;
  }

  public final boolean removeAllItems()
  {
    this.items = new LinkedList<T>() ;
    this.selectedItems = new LinkedList<T>() ;
    this.checkedItems = new LinkedList<T>() ;
    
    updateButtons() ;
    updateItemList() ;
    
    return true ;
  }

  public boolean removeItems(List<T> items)
  {
    if (items != null && !items.isEmpty())
    {
      if (this.items.removeAll(items))
      {
        this.selectedItems.removeAll(items) ;
        this.checkedItems.removeAll(items) ;
        updateButtons() ;
        updateItemList() ;
        
        return true ;
      }
    }
    
    return false ;
  }
  
  public final boolean isAllSelected()
  {
    return getConfiguration() != null && hasChildComponent(ALL_SELECTED_COMPONENT_ID) && allSelected ;
  }

  public final synchronized int getSelectedCount()
  {
    if (allSelected)
      if (items != null)
        return items.size() ;
      else
        return 0 ;
    else
      if (selectedItems != null)
        return selectedItems.size() ;
      else
        return 0 ;
  }
  
  public final T getSelectedItem()
  {
    if (allSelected)
    {
      if (getItems().size() > 0)
      {
        return getItems().get(0) ;
      }
      else
      {
        return null ;
      }
    }
    else
    {
      if (selectedItems != null && selectedItems.size() > 0)
      {
        return selectedItems.get(0) ;
      }
      else
      {
        return null ;
      }
    }
  }
  
  public final int getSelectedIndex()
  {
    if (items != null)
      return items.indexOf(getSelectedItem()) ;
    else
      return -1 ;
  }
  
  public abstract boolean setSelectedItem(T selectedItem) ;
  
  public boolean setSelectedItem(int index)
  {
    if (items != null)
      return setSelectedItem(items.get(index)) ;
    else
      return false ;
  }

  public final List<T> getSelectedItems()
  {
    if (allSelected)
    {
      return getItems() ;
    }
    else
    {
      return selectedItems ;
    }
  }
  
  public final int[] getSelectedIndices()
  {
    int [] indices ;
    
    if (items != null && selectedItems != null)
    {
      if (allSelected)
      {
        indices = new int[items.size()] ;
        
        for (int i = 0 ; i < indices.length ; ++i)
        {
          indices[i] = i ;
        }
      }
      else
      {
        indices = new int[selectedItems.size()] ;
        
        Iterator<T> iterator = selectedItems.iterator() ;
        int i = 0 ;
        
        while (iterator.hasNext())
        {
          indices[i] = items.indexOf(iterator.next()) ;
          ++i ;
        }
      }
    }
    else
    {
      indices = new int[0] ;
    }
    
    return indices ;
  }
  
  public abstract boolean setSelectedItems(List<T> selectedItems) ;
  
  public boolean setSelectedItems(int[] indices)
  {
    if (indices != null)
    {
      if (items != null && !items.isEmpty())
      {
        List<T> selectedItems = new LinkedList<T>() ;
        
        for (int i = 0 ; i < indices.length; ++i)
          if (indices[i] >=0 && indices[i] < items.size())
            selectedItems.add(items.get(indices[i])) ;
          
        return setSelectedItems(selectedItems) ;
      }
      else
      {
        return false ;
      }
    }
    else
    {
      return false ;
    }
  }
  
  public synchronized final int getCheckedCount()
  {
    if (checkedItems != null)
      return checkedItems.size() ;
    else
      return 0 ;
  }
  
  public final T getCheckedItem()
  {
    if (checkedItems != null && checkedItems.size() > 0)
    {
      return checkedItems.get(0) ;
    }
    else
    {
      return null ;
    }
  }
  
  public final int getCheckedIndex()
  {
    if (items != null)
      return items.indexOf(getCheckedItem()) ;
    else
      return -1 ;
  }
  
  public abstract boolean setCheckedItem(T checkedItem) ;
  
  public boolean setCheckedItem(int index)
  {
    if (items != null)
      return setCheckedItem(items.get(index)) ;
    else
      return false ;
  }

  public final List<T> getCheckedItems()
  {
    return checkedItems ;
  }
  
  public final int[] getCheckedIndices()
  {
    int [] indices ;
    
    if (items != null && !items.isEmpty() && checkedItems != null)
    {
      indices = new int[checkedItems.size()] ;

      Iterator<T> iterator = checkedItems.iterator() ;
      int i = 0 ;

      while (iterator.hasNext())
      {
        indices[i] = items.indexOf(iterator.next()) ;
        ++i ;
      }
    }
    else
    {
      indices = new int[0] ;
    }
    
    return indices ;
  }
  
  public abstract boolean setCheckedItems(List<T> checkedItems) ;
  
  public boolean setCheckedItems(int[] indices)
  {
    if (indices != null)
    {
      if (items != null && !items.isEmpty())
      {
        List<T> checkedItems = new LinkedList<T>() ;
        
        for (int i = 0 ; i < indices.length ; ++i)
          if (indices[i] >=0 && indices[i] < items.size())
            checkedItems.add(items.get(indices[i])) ;
          
        return setCheckedItems(checkedItems) ;
      }
      else
      {
        return false ;
      }
    }
    else
    {
      return true ;
    }
  }
  
  @Override
  public final void updateComponent()
  {
    updateButtons() ;
    updateItemList() ;
    
    super.updateComponent() ;
  }

  public final ISelection getSelection()
  {
    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()) && getCheckedItem() != null)
    	return new StructuredSelection(getCheckedItem()) ;
    else
    	if (getSelectedItem() != null)
    		return new StructuredSelection(getSelectedItem()) ;
    	else
    		return new StructuredSelection() ;
  }

  @SuppressWarnings("unchecked")
  public final void setSelection(ISelection selection)
  {
    if (!selection.isEmpty() && selection instanceof IStructuredSelection)
    {
	    if (ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()) || ConfigurationUtils.isMultipleCheckInUse(getConfiguration()))
	    {
	    	Object[] values = ((IStructuredSelection)selection).toArray() ;
	    	
	    	List<T> list = new LinkedList<T>() ;
	    	
	    	for (int i = 0 ; i < values.length ; ++i)
	    	{
	    		try
          {
	          list.add((T)values[i]) ;
          }
          catch (Exception e)
          {

          }
	    	}

		    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
		    	setCheckedItems(list) ;
		    else
		    	setSelectedItems(list) ;
	    }
	    else
	    {
    		try
        {
			    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
			    	setCheckedItem((T)((IStructuredSelection)selection).getFirstElement()) ;
			    else
			    	setSelectedItem((T)((IStructuredSelection)selection).getFirstElement()) ;
        }
        catch (Exception e)
        {

        }
	    }
    }
  }

  public final Object convertElement(T element)
  {
    return element ;
  }
  
  public final boolean addFilter(ListViewerFilter filter)
  {
    if (filters.add(filter))
    {
      updateFilters() ;
      return true ;
    }
    else
    {
      return false ;
    }
  }

  public final boolean removeFilter(ListViewerFilter filter)
  {
    boolean success = filters.remove(filter) ;
    
    if (success)
    {
      if (structuredViewer != null && currentFilter != null && currentFilter == filter)
      {
        currentFilter = null ;
        structuredViewer.removeFilter(filter) ;   
      }
      updateFilters() ;
    }
    
    return success ;
  }
  
  public final List<ListViewerFilter> getFilters()
  {
    return filters ;
  }

  public final boolean setFilters(List<ListViewerFilter> filters)
  {
    boolean success = true ;
    
    this.filters.clear() ;
    success = this.filters.addAll(filters) ;
    
    if (structuredViewer != null && success && currentFilter != null && this.filters.contains(currentFilter))
    {
      structuredViewer.removeFilter(currentFilter) ; 
      currentFilter = null ;
    }
    
    if (success)
      updateFilters() ;
    
    return success ;
  }

  public void performCancel()
  {
    canceled = true ; // TODO perhaps should wait until cancel occurs
  }
  
	@Override
  public void addSelectionChangedListener(ISelectionChangedListener listener)
  {
		selectionChangedSupport.addSelectionChangedListener(listener) ;
  }

	@Override
  public void removeSelectionChangedListener(ISelectionChangedListener listener)
  {
		selectionChangedSupport.removeSelectionChangedListener(listener) ;
  }

  @Override
  protected void hookContextMenus()
  {
  	if (structuredViewer != null)
  		hookContextMenu(structuredViewer.getControl(), structuredViewer) ;
  }
  
  protected void setItemsInternal(List<T> items)
  {
    this.items = new LinkedList<T>() ;
    this.items.addAll(items);
  }
  
  @Override
  protected void postInitialiseComponent()
  {
  	super.postInitialiseComponent() ;
  	
    //if (ConfigurationUtils.isThreadingInUse(getConfiguration()))
    //  createProgressBar(container, 1, 1) ;

    updateButtons() ;
    updateItemList() ;
    if (getStructuredViewer() != null)
    {
	    initialiseSelection() ;
	    initialiseChecked() ;
    }
  }
  
  protected abstract void initialiseSelection() ;
  
  protected abstract void initialiseChecked() ;
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
      ComponentConfiguration configuration, String id)
  {
  	ControlConfiguration controlConfiguration = null;
  	
  	if (configuration instanceof ControlConfiguration)
  		controlConfiguration = (ControlConfiguration)configuration ;
  	
  	if (VIEWER_COMPONENT_ID.equals(id))
      return createSelectionListComponent(parent, controlConfiguration) ;
  	else
    	if (FILTER_COMPONENT_ID.equals(id))
    		return createFiltersComponent(parent, controlConfiguration) ;
    	else
      	if (STRING_FILTER_COMPONENT_ID.equals(id))
      		return createStringFilterComponent(parent, controlConfiguration) ;
      	else
        	if (REORDER_COMPONENT_ID.equals(id))
        		return createReorderListComponent(parent, controlConfiguration) ;
        	else
          	if (CLEAR_SELECTION_COMPONENT_ID.equals(id))
          		return createClearAllSelectionComponent(parent, controlConfiguration) ;
          	else
            	if (CLEAR_CHECK_COMPONENT_ID.equals(id))
            		return createClearAllCheckedComponent(parent, controlConfiguration) ;
            	else
              	if (CHECK_ALL_COMPONENT_ID.equals(id))
              		return createCheckAllComponent(parent, controlConfiguration) ;
              	else
              		if (ADD_ITEM_COMPONENT_ID.equals(id))
              			return createAddItemComponent(parent, controlConfiguration) ;
              		else
              			if (REMOVE_ITEM_COMPONENT_ID.equals(id))
              				return createRemoveItemComponent(parent, controlConfiguration) ;
              			else
              				if (EDIT_ITEM_COMPONENT_ID.equals(id))
              					return createEditItemComponent(parent, controlConfiguration) ;
              				else
              					if (ALL_SELECTED_COMPONENT_ID.equals(id))
              						return createAllSelectedComponent(parent, controlConfiguration) ;
              					else
              						if (REGEX_COMPONENT_ID.equals(id))
              							return createRegexComponent(parent, controlConfiguration) ;
              						else
              							return null ;
  }
  

	@Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(VIEWER_COMPONENT_ID) ;
    list.add(FILTER_COMPONENT_ID) ;
    list.add(STRING_FILTER_COMPONENT_ID) ;
    list.add(REORDER_COMPONENT_ID) ;
    list.add(CLEAR_SELECTION_COMPONENT_ID) ;
    list.add(CLEAR_CHECK_COMPONENT_ID) ;
    list.add(CHECK_ALL_COMPONENT_ID) ;
    list.add(ADD_ITEM_COMPONENT_ID) ;
    list.add(REMOVE_ITEM_COMPONENT_ID) ;
    list.add(EDIT_ITEM_COMPONENT_ID) ;
    list.add(ALL_SELECTED_COMPONENT_ID) ;
    list.add(REGEX_COMPONENT_ID) ;
    
    return list ;
  }
  
  protected final Component<? extends ComponentConfiguration> createFiltersComponent(Composite parent, ControlConfiguration configuration)
  {
    Composite container = new Composite(parent, SWT.NULL);

    GridLayout layout = new GridLayout(3, false);
    layout.marginWidth = 5 ;
    layout.marginHeight = 5 ;
    container.setLayout(layout);
    
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    container.setLayoutData(gridData);
    
    filterByLabel = new Label(container, SWT.NONE) ;
    filterByLabel.setText(Activator.getDefault().getString(FILTER_BY_LABEL)) ;
    filterByLabel.setEnabled(isEnabled() && !isAllSelected()) ;
    
    filterComboViewer = new ComboViewer(container) ;
    filterComboViewer.getCombo().setEnabled(isEnabled() && !isAllSelected()) ;
    
    filterComboViewer.setContentProvider(new ArrayContentProvider());

    filterComboViewer.setLabelProvider(new IdentificationLabelProvider());
    
    filterComboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
    
    clearFiltersButton = new Button(container, SWT.NONE) ;
    
    clearFiltersButton.setText(Activator.getDefault().getString(CLEAR_FILTERS_LABEL)) ;
    clearFiltersButton.setEnabled(false) ;
    
    updateFilters() ;

    filterComboViewer.addSelectionChangedListener(new ISelectionChangedListener()
    {
      public void selectionChanged(SelectionChangedEvent e)
      {
        handleFilterComboSelection((StructuredSelection)e.getSelection());
      }
    });
    
    clearFiltersButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleClearFilters();
      }
    }); 
    
    return new SimpleControlComponent<Composite>(container, configuration) ;
  }

  protected Component<? extends ComponentConfiguration> createStringFilterComponent(Composite parent, ControlConfiguration configuration)
  {
  	filterText = createTextComponent(parent, configuration, SWT.BORDER | SWT.SINGLE | SWT.SEARCH | SWT.ICON_CANCEL) ;
  	
    filterText.setEnabled(isEnabled() && !isAllSelected()) ;
    filterText.getInternalControl().addModifyListener(viewerListenerAndFilter) ;
    
    return filterText ;
  }

  protected Component<? extends ComponentConfiguration> createRegexComponent(Composite parent, ControlConfiguration configuration)
  {
    regexButton = createButtonComponent(parent, configuration, SWT.CHECK) ;
    regexButton.getInternalControl().setText(Activator.getDefault().getString(REGEX_FILTER_LABEL)) ;
    regexButton.getInternalControl().setSelection(viewerListenerAndFilter.regexInUse) ;
    regexButton.getInternalControl().addSelectionListener(viewerListenerAndFilter) ;
    
    return regexButton ;
  }

  protected final Component<? extends ComponentConfiguration> createReorderListComponent(Composite parent, ControlConfiguration configuration)
  {
    Composite container = new Composite(parent, SWT.NULL);

    GridLayout layout = new GridLayout(1, false);
    layout.marginWidth = 5 ;
    layout.marginHeight = 5 ;
    container.setLayout(layout);
    
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, false, false);
    gridData.horizontalSpan = 1;
    gridData.verticalSpan = 1;
    gridData.verticalAlignment = SWT.CENTER ;
    container.setLayoutData(gridData);
    
    upButton = new Button(container, SWT.PUSH);
    upButton.setEnabled(isEnabled()) ;
    upButton.setImage(Activator.getDefault().getImage(Images.UP_BUTTON_ICON)) ;
    upButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleUp();
      }
    });

    downButton = new Button(container, SWT.PUSH);
    downButton.setEnabled(isEnabled()) ;
    downButton.setImage(Activator.getDefault().getImage(Images.DOWN_BUTTON_ICON)) ;
    downButton.addSelectionListener(new SelectionAdapter()
    {
      public void widgetSelected(SelectionEvent e)
      {
        handleDown();
      }
    });
    
    return new SimpleControlComponent<Composite>(container, configuration) ;
  }

  protected final Component<? extends ComponentConfiguration> createSelectionListComponent(
  		Composite parent, ControlConfiguration configuration)
  {
    structuredViewer = createStructuredViewer(parent) ;    
    
    structuredViewer.setContentProvider(createContentProvider());

    structuredViewer.setLabelProvider(createLabelProvider());
    
    initialiseStructuredViewer(structuredViewer) ;  
    
    return new SimpleViewerComponent<StructuredViewer>(structuredViewer, configuration) ;
  }
  
  @Override
  protected void addListeners()
  {
    super.addListeners();
    
    if (structuredViewer != null)
    {
	    structuredViewer.addDoubleClickListener(new IDoubleClickListener()
	    {
	      public void doubleClick(DoubleClickEvent e)
	      {
	        handleDoubleClick((StructuredSelection)e.getSelection());
	      }
	    });
	    
	    if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()) && structuredViewer instanceof ICheckable)
	    {
	      ((ICheckable)structuredViewer).addCheckStateListener(new ICheckStateListener()
	      {
	        public void checkStateChanged(CheckStateChangedEvent event)
	        {
	          handleCheckStateChanged(event);
	        }
	      }) ;
	    }
	
	    structuredViewer.addSelectionChangedListener(new ISelectionChangedListener()
	    {
	      public void selectionChanged(SelectionChangedEvent event)
	      {
	        handleStructuredSelection((StructuredSelection)event.getSelection());
	      }
	    });
    }
  }

  protected final Component<? extends ComponentConfiguration> createAllSelectedComponent(Composite parent, ControlConfiguration configuration)
  {
  	allSelectedButton = createButtonComponent(parent, configuration, SWT.CHECK) ;

    allSelectedButton.getInternalControl().setText(Activator.getDefault().getString(ALL_SELECTED_LABEL)) ;
    allSelectedButton.getInternalControl().addSelectionListener(new SelectionListener()
    {

      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        handleAllSelected() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
        handleAllSelected() ;
      }
      
    }) ;
    
    return allSelectedButton ;
  }
  
  protected final Component<? extends ComponentConfiguration> createClearAllSelectionComponent(Composite parent, ControlConfiguration configuration)
  {
    clearSelectionButton = createButtonComponent(parent, configuration, SWT.PUSH) ;
    
    if (ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()))
      clearSelectionButton.getInternalControl().setText(Activator.getDefault().getString(CLEAR_SELECTIONS_LABEL)) ;
    else
      clearSelectionButton.getInternalControl().setText(Activator.getDefault().getString(CLEAR_SELECTION_LABEL)) ;
    
    clearSelectionButton.getInternalControl().addSelectionListener(new SelectionListener()
    {
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        handleClearSelection() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
        handleClearSelection() ;
      }
    }) ;
    
    return clearSelectionButton ;
  }
  
  protected final Component<? extends ComponentConfiguration> createClearAllCheckedComponent(Composite parent, ControlConfiguration configuration)
  {
  	clearCheckButton = createButtonComponent(parent, configuration, SWT.PUSH) ;
    
    if (ConfigurationUtils.isMultipleCheckInUse(getConfiguration()))
      clearCheckButton.getInternalControl().setText(Activator.getDefault().getString(CLEAR_CHECKS_LABEL)) ;
    else
      clearCheckButton.getInternalControl().setText(Activator.getDefault().getString(CLEAR_CHECK_LABEL)) ;

    clearCheckButton.getInternalControl().addSelectionListener(new SelectionListener()
    {
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        handleClearChecked() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
        handleClearChecked() ;
      }
    }) ;
    
    return clearCheckButton ;
  }
  
  protected final Component<? extends ComponentConfiguration> createCheckAllComponent(Composite parent, ControlConfiguration configuration)
  {
  	checkAllButton = createButtonComponent(parent, configuration, SWT.PUSH) ;
    
    checkAllButton.getInternalControl().setText(Activator.getDefault().getString(CHECK_ALL_LABEL)) ;

    checkAllButton.getInternalControl().addSelectionListener(new SelectionListener()
    {
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        handleCheckAll() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
        handleCheckAll() ;
      }
    }) ;
    
    return checkAllButton ;
  }
 
  protected final Component<? extends ComponentConfiguration> createAddItemComponent(Composite parent, ControlConfiguration configuration)
  {
    addItemButton = createButtonComponent(parent, configuration, SWT.PUSH) ;
    
    addItemButton.getInternalControl().setText(Activator.getDefault().getString(ADD_ITEM_BUTTON_LABEL)) ;

    addItemButton.getInternalControl().addSelectionListener(new SelectionListener()
    {
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        handleAddItem() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
      	handleAddItem() ;
      }
    }) ;
    
    return addItemButton ;
  }
  
  protected final Component<? extends ComponentConfiguration> createRemoveItemComponent(Composite parent, ControlConfiguration configuration)
  {
    removeItemButton = createButtonComponent(parent, configuration, SWT.PUSH) ;
    
    removeItemButton.getInternalControl().setText(Activator.getDefault().getString(REMOVE_ITEM_BUTTON_LABEL)) ;

    removeItemButton.getInternalControl().addSelectionListener(new SelectionListener()
    {
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
      	handleRemoveItems() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
      	handleRemoveItems() ;
      }
    }) ;
    
    return removeItemButton ;
  }
  
  protected final Component<? extends ComponentConfiguration> createEditItemComponent(Composite parent, ControlConfiguration configuration)
  {
    editItemButton = createButtonComponent(parent, configuration, SWT.PUSH) ;
    
    editItemButton.getInternalControl().setText(Activator.getDefault().getString(EDIT_ITEM_BUTTON_LABEL)) ;

    editItemButton.getInternalControl().addSelectionListener(new SelectionListener()
    {
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        handleEditItem() ;
      }

      public void widgetSelected(SelectionEvent arg0)
      {
      	handleEditItem() ;
      }
    }) ;
    
    return editItemButton ;
  }

  protected final void createProgressBar(Composite parent, int horizontalSpan,
      int verticalSpan)
  {
    Composite container = new Composite(parent, SWT.NONE);
    
    GridLayout layout = new GridLayout(1, false);
    layout.marginWidth = 5 ;
    layout.marginHeight = 5 ;
    container.setLayout(layout);
    
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
    gridData.horizontalSpan = horizontalSpan;
    gridData.verticalSpan = verticalSpan;
    container.setLayoutData(gridData);
  }

  protected Point getInitialStructuredViewerSize()
  {
    return new Point(300, 200);
  }

  protected ICellModifier createCellModifier()
  {
    return new ViewerCellModifier() ;
  }
  
  protected final void createInitialFilters()
  {

  }
  
  protected abstract StructuredViewer createStructuredViewer(Composite parent) ;

  protected int createWidgetStyle()
  {
    int style = DEFAULT_WIDGET_STYLES ;
    
    if (ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()))
      style = style | SWT.MULTI ;
    else
      style = style | SWT.SINGLE ;
    
    if (ConfigurationUtils.isVirtualInUse(getConfiguration()))
      style = style | SWT.VIRTUAL ;
    
		if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
      style = style | SWT.CHECK ;
		
    // TODO not available in RCP
    //if (ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    //  style = style | SWT.HIDE_SELECTION ;
    
    return style ;
  }
  
  public final boolean addItem(T item)
  {
    boolean success = items.add(item) ;
    
    if (success)
    {
      updateButtons() ;
      updateItemList() ;
    }
    
    return success ;
  }
  
  public final boolean removeItem(T item)
  {
    boolean success = items.remove(item) ;
    
    if (success)
    { 
      selectedItems.remove(item) ;
      checkedItems.remove(item) ;
      updateButtons() ;
      updateItemList() ;
    }
    
    return success ;
  }
  
  public final boolean replaceItem(T oldItem, T newItem)
  {
    boolean success = false ;
    
    if (oldItem != null && newItem != null)
    {
      int index = items.indexOf(oldItem) ;
      
      success = index >=0 ;
      
      if (success)
      {
        int selected = selectedItems.indexOf(oldItem) ;
        int checked = checkedItems.indexOf(oldItem) ;

        if (selected >=0)
          success = selectedItems.set(selected, newItem) == oldItem;
        if (success && checked >=0)
          success = checkedItems.set(checked, newItem) == oldItem;

        success = items.set(index, newItem) == oldItem;

        if (!success) //roll back
        {
          items.set(index, oldItem);

          if (selected >=0)
            selectedItems.set(selected, oldItem) ;
          if (checked >=0)
            checkedItems.set(checked, oldItem) ;
        }
        else
        {
          updateButtons() ;
          updateItemList() ;
        }

      }
    }

    return success ;
  }
  
  protected void handleDoubleClick(StructuredSelection selection)
  {

    
  }

  @SuppressWarnings("unchecked")
  protected final void handleStructuredSelection(StructuredSelection structuredSelection)
  {
    if (ConfigurationUtils.isMultipleSelectionInUse(getConfiguration()))
    {
      // for large selections it may be necessary just to trap what is de-selected and what is selected
      List<T> oldValue = selectedItems; 
      
      selectedItems = new LinkedList<T>() ;
      
      if (!structuredSelection.isEmpty())
      {
        @SuppressWarnings("rawtypes")
        Iterator iterator = structuredSelection.iterator() ;

        while (iterator.hasNext())
          selectedItems.add((T)iterator.next()) ;
      }
      
      handleInternalPropertyChange(SELECTION_PROPERTY, oldValue, getSelectedItems()) ;
    }
    else
    {
      selectedItems.clear() ;
      
      T oldValue = getSelectedItem() ;
      
      if (!structuredSelection.isEmpty())
        selectedItems.add((T)structuredSelection.getFirstElement()) ;
      
      handleInternalPropertyChange(SELECTION_PROPERTY, oldValue, getSelectedItem()) ;
    }
   
    updateButtons() ;
  }

	@SuppressWarnings("unchecked")
  protected final void handleCheckStateChanged(CheckStateChangedEvent event)
  {
    if (ConfigurationUtils.isMultipleCheckInUse(getConfiguration()))
    {
      if (event.getChecked())
      {
        checkedItems.add((T)event.getElement()) ;
        handleInternalPropertyChange(CHECKED_ITEM_ADDED_PROPERTY, null, event.getElement()) ;
      }
      else
      {
        checkedItems.remove((T)event.getElement()) ;
        handleInternalPropertyChange(CHECKED_ITEM_REMOVED_PROPERTY, null, event.getElement()) ;
      }
    }
    else
    {
      T oldValue = getCheckedItem() ;
      
      if (getCheckedCount() > 0)
        event.getCheckable().setChecked(getCheckedItem(), false) ;
      checkedItems.clear() ;

      if (event.getChecked())
        checkedItems.add((T)event.getElement()) ;
      
      handleInternalPropertyChange(CHECKED_PROPERTY, oldValue, getCheckedItem()) ;
    }
   
    updateButtons() ;
  }
  
  protected final void handleAllSelected()
  {
    allSelected = allSelectedButton.getInternalControl().getSelection() ;
    
    if (filterText != null)
      filterText.setEnabled(isEnabled() && !allSelected) ;
    if (filterByLabel != null)
      filterByLabel.setEnabled(isEnabled() && !allSelected) ;
    if (filterComboViewer != null)
      filterComboViewer.getCombo().setEnabled(isEnabled() && !allSelected) ;
    if (getInternalViewer() != null)
      getInternalViewer().getControl().setEnabled(isEnabled() && !allSelected) ;
    updateButtons() ;
    updateItemList() ;
    
    if (allSelected)
    	handleInternalPropertyChange(SELECTION_PROPERTY, selectedItems, getSelectedItems()) ;
    else
    	handleInternalPropertyChange(SELECTION_PROPERTY, items, getSelectedItems()) ;
  }
  
  protected void handleClearSelection()
  {
    List<T> selectedItems = new LinkedList<T>() ;
    
    if (allSelected)
    {
      selectedItems.addAll(items) ;
    }
    else
    {
      selectedItems.addAll(this.selectedItems) ;
    }
      
    deselectAll() ;
    
    handleInternalPropertyChange(SELECTION_CLEARED_PROPERTY, selectedItems, this.selectedItems) ;
  }
  
  protected void handleClearChecked()
  {
    List<T> checkedItems = new LinkedList<T>() ;
    checkedItems.addAll(this.checkedItems) ;
    
    decheckAll() ;
    
    handleInternalPropertyChange(SELECTION_CLEARED_PROPERTY, checkedItems, this.checkedItems) ;
  }
 
  protected void handleCheckAll()
  {
    List<T> checkedItems = new LinkedList<T>() ;
    checkedItems.addAll(this.checkedItems) ;
    
    checkAll() ;
    
    handleInternalPropertyChange(SELECTION_CLEARED_PROPERTY, checkedItems, this.checkedItems) ;
  }
  
  protected void handleInternalPropertyChange(String selectionProperty,
      Object oldValue, Object newValue)
  {
  	getPropertyChangeSupport().firePropertyChange(selectionProperty, oldValue, newValue) ;
  	selectionChangedSupport.fireSelectionChangedEvent(getSelection()) ;
  }
  
  protected final void handleAddItem()
  {
  	DialogConfiguration dialogConfiguration = ConfigurationUtils.getChildDialogConfiguration(getConfiguration(), EDIT_DIALOG_ID) ;

  	AbstractEditDialog<? extends ComponentConfiguration, T> editDialog = createEditComponentDialog(getParent().getShell(), dialogConfiguration, getSelectedItem()) ;
  	
  	if (editDialog != null && editDialog.open() == Dialog.OK)
  	{
  		addItem(editDialog.getValue()) ;
  	}
  }

  protected boolean canAddItem()
  {
    return false ;
  }
 
  protected final void handleRemoveItems()
  {
    removeItems(getSelectedItems()) ;
  }
  
  protected boolean canRemoveItems()
  {
    return getSelectedCount() > 0 ;
  }

  protected final void handleEditItem()
  {
  	DialogConfiguration dialogConfiguration = ConfigurationUtils.getChildDialogConfiguration(getConfiguration(), EDIT_DIALOG_ID) ;
  	
  	T oldItem = getSelectedItem() ;
  	
  	AbstractEditDialog<? extends ComponentConfiguration, T> editDialog = createEditComponentDialog(getParent().getShell(), dialogConfiguration, getSelectedItem()) ;
  	
  	if (editDialog != null && editDialog.open() == Dialog.OK)
  	{
  		T newItem = getSelectedItem() ;
  		
  		if (oldItem != newItem)
  			copyDifferences(oldItem, newItem) ;
  	}
  }
  
	protected AbstractEditDialog<? extends ComponentConfiguration, T> createEditComponentDialog(Shell shell, DialogConfiguration dialogConfiguration, T value)
  {
	  return null;
  }

	protected boolean canEditItem()
  {
    return getSelectedCount() == 1 ;
  }
  
  protected final void handleFilterComboSelection(StructuredSelection selection)
  {
    if (structuredViewer != null && currentFilter != null)
      structuredViewer.removeFilter(currentFilter) ;
    currentFilter = (ListViewerFilter)selection.getFirstElement() ;
    clearFiltersButton.setEnabled(currentFilter != null) ;
    if (currentFilter != null)
      structuredViewer.addFilter(currentFilter) ;
  }
  
  protected final void handleClearFilters()
  {
    if (structuredViewer != null && currentFilter != null)
      structuredViewer.removeFilter(currentFilter) ;
    
    filterComboViewer.getCombo().deselectAll() ;
    
    currentFilter = null ;
    
    clearFiltersButton.setEnabled(false) ;
  }

  protected void updateButtons()
  {
    if (this.isEnabled())
    {
      if (structuredViewer != null)
      {
        if (upButton != null)
          upButton.setEnabled(getSelectedCount() == 1
            && getSelectedIndex() > 0);
        
        if (downButton != null)
           downButton
            .setEnabled(getSelectedCount() == 1 && getSelectedIndex() >=0 &&
               getSelectedIndex() < items.size() - 1);
        

      }
     
       if (removeItemButton != null)
         removeItemButton.setEnabled(canRemoveItems());
        
       if (editItemButton != null)
         editItemButton.setEnabled(canEditItem())  ;      
        
       if (addItemButton != null)
      	addItemButton.setEnabled(canAddItem()) ;
      
      if (clearStringFilterButton != null)
        clearStringFilterButton.setEnabled(!items.isEmpty() && filterText != null && filterText.getInternalControl().getText() != null && !"".equals(filterText.getInternalControl().getText())) ;
        
      if (regexButton != null)
        regexButton.setEnabled(!items.isEmpty() && filterText != null && filterText.getInternalControl().getText() != null && !"".equals(filterText.getInternalControl().getText())) ;
      
      if (clearSelectionButton != null)
        clearSelectionButton.setEnabled(getItems().size() > 0 && getSelectedCount() > 0 && !allSelected) ;
  
      if (clearCheckButton != null)
        clearCheckButton.setEnabled(getItems().size() > 0 && getCheckedCount() > 0) ;
      
      if (checkAllButton != null)
        checkAllButton.setEnabled(getItems().size() > 0) ;
      
      if (getClearStringFilterButton() != null)
        getClearStringFilterButton().setEnabled(getClearStringFilterButton().isEnabled() && !allSelected) ;
      
      if (getClearFiltersButton() != null)
        getClearFiltersButton().setEnabled(getClearFiltersButton().isEnabled() && !allSelected) ;
     
      if (getRegexComponent() != null)
        getRegexComponent().setEnabled(getRegexComponent().isEnabled() && !allSelected) ;
    }
    else
    {
      
      if (upButton != null)
        upButton.setEnabled(false) ;
      
      if (downButton != null)
        downButton.setEnabled(false) ;
      
      if (clearFiltersButton != null)
        clearFiltersButton.setEnabled(false) ;
      
      if (clearStringFilterButton != null)
        clearStringFilterButton.setEnabled(false) ;
      
      if (regexButton != null)
        regexButton.setEnabled(false) ;
      
      if (addItemButton != null)
        addItemButton.setEnabled(false) ;
      
      if (removeItemButton != null)
        removeItemButton.setEnabled(false) ;
      
      if (editItemButton != null)
      	editItemButton.setEnabled(false) ;

      if (filterComboViewer != null)
        filterComboViewer.getControl().setEnabled(false) ;

      if (filterByLabel != null)
        filterByLabel.setEnabled(false) ;
      
      if (clearSelectionButton != null)
        clearSelectionButton.setEnabled(false) ;
      
      if (clearCheckButton != null)
        clearCheckButton.setEnabled(false) ;
      
      if (checkAllButton != null)
        checkAllButton.setEnabled(false) ;
      
      if (allSelectedButton != null)
        allSelectedButton.setEnabled(false) ;
    }

  }

  protected boolean isFiltersInUse()
  {
    return structuredViewer != null && structuredViewer.getFilters() != null && structuredViewer.getFilters().length > 0 ;
  }
  
  protected void updateFilters()
  { 
    if (filterComboViewer != null)
    {
      filterByLabel.setEnabled(!filters.isEmpty()) ;
      filterComboViewer.getCombo().setEnabled(!filters.isEmpty()) ;
      clearFiltersButton.setEnabled(!filters.isEmpty() && currentFilter != null) ;
      filterComboViewer.setInput(filters) ;
    }
  }
  
  protected final ControlComponent<ControlConfiguration, Text> getFilterTextComponent()
  {
    return filterText;
  }
  
  protected final Button getClearStringFilterButton()
  {
    return clearStringFilterButton;
  }
  
  protected final ControlComponent<ControlConfiguration, Button> getRegexComponent()
  {
    return regexButton;
  }
  
  protected final Button getClearFiltersButton()
  {
    return clearFiltersButton;
  }

  protected final ComboViewer getFilterComboViewer()
  {
    return filterComboViewer;
  }

  protected final Label getFilterByLabel()
  {
    return filterByLabel;
  }

  /**
   * @return the addItemButton
   */
  protected final ControlComponent<ControlConfiguration, Button> getAddItemComponent()
  {
    return addItemButton;
  }

  /**
   * @return the removeItemButton
   */
  protected final ControlComponent<ControlConfiguration, Button> getRemoveItemComponent()
  {
    return removeItemButton;
  }
  
  /**
   * @return the editItemButton
   */
  protected final ControlComponent<ControlConfiguration, Button> getEditItemComponent()
  {
    return editItemButton;
  }
  
  protected IContentProvider createContentProvider()
  {
    return new ArrayContentProvider() ; 
  }
  
  protected String getFilterableLabel(T element)
  {
    return LabelUtils.getLabel(element) ;
  }
  
  protected final Viewer getInternalViewer()
  {
    return structuredViewer ;
  }
  
  protected final StructuredViewer getStructuredViewer()
  {
    return structuredViewer ;
  }
  
  protected T copyItem(T item)
  {
    return item ;
  }

  protected final void swapItems(T itemA, T itemB)
  {
    swapItems(itemA, itemB, items.indexOf(itemA), items.indexOf(itemB)) ;
  }
  
  protected final void swapItems(T itemA, T itemB, int indexA, int indexB)
  {
    items.set(indexB, itemA) ;
    items.set(indexA, itemB) ;

    updateItemList() ; // TODO perhaps over kill
    updateButtons();
  }

  protected void copyDifferences(T oldItem, T newItem)
  {

  }

  protected final List<T> getItemsInternal()
  {
    return items ;
  }
  
  protected final boolean setSelectedItemInternal(T selectedItem)
  {
  	boolean success = true ;
  	
    selectedItems.clear() ;
    
    if (selectedItem != null)
    	success = selectedItems.add(selectedItem) ;
    
    if (success && !ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    	selectionChangedSupport.fireSelectionChangedEvent(getSelection()) ;
    
    return success ;
  }
  
  protected final boolean setSelectedItemsInternal(List<T> selectedItems)
  {
  	boolean success = true ;
  	
    this.selectedItems.clear() ;
    
    if (selectedItems != null)
    	success = this.selectedItems.addAll(selectedItems) ;
    
    if (success && !ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    	selectionChangedSupport.fireSelectionChangedEvent(getSelection()) ;
    
    return success ;
  }
  
  protected final void deselectAllInternal()
  {
    selectedItems.clear() ;
  }
  
  protected final void decheckAllInternal()
  {
    checkedItems.clear() ;
  }
  
  protected final void checkAllInternal()
  {
    checkedItems.clear() ;
    checkedItems.addAll(items) ;
  }
  
  protected final boolean setCheckedItemInternal(T checkedItem)
  {
  	boolean success = true ;
  	
    checkedItems.clear() ;
    
    if (checkedItem != null)
    	success = checkedItems.add(checkedItem) ;
    
    if (success && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    	selectionChangedSupport.fireSelectionChangedEvent(getSelection()) ;
    
    return success ;
  }
  
  protected final boolean setCheckedItemsInternal(List<T> checkedItems)
  {
  	boolean success = true ;
  	
    // TODO check for null elements in list and exclude from addAll
    this.checkedItems.clear() ;
    
    if (checkedItems != null)
    	success = this.checkedItems.addAll(checkedItems) ;
    
    if (success && ConfigurationUtils.isCheckSelectionInUse(getConfiguration()))
    	selectionChangedSupport.fireSelectionChangedEvent(getSelection()) ;
    
    return success ;
  }
  
  protected final void decheckedAllInternal()
  {
  	checkedItems.clear() ;
  }
  
  protected abstract void initialiseStructuredViewer(
      StructuredViewer structuredViewer) ;
  
  protected ILabelProvider createLabelProvider()
  {
  	return new LabelProvider() ;
  }
  
  protected void updateItemList()
  {
    if (getStructuredViewer() != null)
    {    
      if (getItemsInternal() != null && !getItemsInternal().isEmpty() && !isAllSelected())
      {
        if (ConfigurationUtils.isThreadingInUse(getConfiguration()))
        {
          try
          {
            if (getRunnableContext() != null)
              getRunnableContext().run(true, true, new ListIterationProgress()) ;
            else
              PlatformUI.getWorkbench().getProgressService().busyCursorWhile(new ListIterationProgress()) ;
          }
          catch (Exception e)
          {
            Activator.getDefault().error(e) ;
          }
        }
        else
        {
          getStructuredViewer().setInput(getItemsInternal()) ;
        } 
      }
      else
      {
        getStructuredViewer().setInput(null) ;
      }

      getStructuredViewer().getControl().setEnabled(isEnabled() && !isAllSelected()) ;
     }
  }
  
  protected void handleDown()
  {
  	throw new UnsupportedOperationException("handleDown not supported") ;
  }

  protected void handleUp()
  {
  	throw new UnsupportedOperationException("handleUp not supported") ;
  }
  
  protected void deselectAll()
  {
  	throw new UnsupportedOperationException("deselectAll not supported") ;
  }
  
  protected void checkAll()
  {
  	throw new UnsupportedOperationException("checkAll not supported") ;
  }
  
  protected void decheckAll()
  {
  	throw new UnsupportedOperationException("decheckAll not supported") ;
  }
  
  protected class ViewerListenerAndFilter extends ListViewerFilter implements ModifyListener, SelectionListener
  {     
    private String stringPattern ;
    
    private Pattern pattern ;
    
    private boolean regexInUse ;
    
    public ViewerListenerAndFilter()
    {
      super(Activator.getDefault().getString(NAME_FILTER));
      
      regexInUse = hasChildComponent(REORDER_COMPONENT_ID) ;
    }
    
    public void modifyText(ModifyEvent e)
    {
      update() ;
    }

    public void widgetDefaultSelected(SelectionEvent e)
    {
      widgetSelected(e) ;
    }

    public void widgetSelected(SelectionEvent e)
    {
      if (regexButton != null && e.widget == regexButton.getInternalControl())
      {
        regexInUse = ((Button)e.widget).getSelection() ;
        update() ;
      }
      else
      {
        if (e.widget == clearStringFilterButton)
          clear() ;
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean select(Object element)
    {
      if (regexInUse)
      {
        if (pattern != null)
          return pattern.matcher(AbstractSingleListStructuredViewer.this.getFilterableLabel((T) element))
              .matches();
        else
          return true;
      }
      else
      {
        if (stringPattern != null && stringPattern.length() > 0)
          if (stringPattern.startsWith(WILDCARD))
            return AbstractSingleListStructuredViewer.this.getFilterableLabel((T) element).endsWith(
                stringPattern.substring(WILDCARD.length()));
          else
            return AbstractSingleListStructuredViewer.this.getFilterableLabel((T) element).startsWith(stringPattern);
        else
          return true;
      }
    }

    private void update()
    {
    	if (structuredViewer != null)
    	{
	      if (setPattern(filterText.getInternalControl().getText())) 
	      {
	        structuredViewer.addFilter(this) ;
	      }
	      else
	      {
	        structuredViewer.removeFilter(this) ;
	      }
    	}
      
      updateButtons() ;
    }
    
    private void clear()
    {
      filterText.getInternalControl().setText("") ;
    }
    
    private boolean setPattern(String textString)
    {
      stringPattern = textString ;
  
      if (stringPattern != null && stringPattern.length() > 0)
      {
        if (regexInUse)
        {
          try
          {
            pattern = Pattern.compile(filterText.getInternalControl().getText()) ;
          }
          catch (RuntimeException e)
          {
            pattern = null ;
          }
          
          return pattern != null ;
        }
        else
        {
          pattern = null ;
          return true ; 
        }
      }
      else
      {
        if (pattern != null)
          pattern = null ;

        return false ;   
      }
    }
  }
  
  protected class ViewerCellModifier implements ICellModifier
  {
    public boolean canModify(Object element, String property)
    {
      return false ;
    }

    public Object getValue(Object element, String property)
    {
      return null ;
    }

    public void modify(Object element, String property, Object value)
    {

    }
  }
  
  private class ListIterationProgress implements IRunnableWithProgress
  {
    private Object[] elements ;

    public ListIterationProgress()
    {
      super();
      elements = null ;
    }

    public void run(IProgressMonitor monitor) throws InvocationTargetException,
        InterruptedException
    {
      monitor.beginTask(Activator.getDefault().getString(RETRIEVE_ELEMENT_BEGIN_TASK_LABEL, items.size()), items.size()); 
      
      monitor.subTask(Activator.getDefault().getString(RETRIEVE_ELEMENT_SUB_TASK_LABEL, new int[] {0, items.size()})); 

      elements = new Object[items.size()] ;

      Iterator<T> iterator = items.iterator() ;

      int i = 0 ;

      int stepSize = items.size() / 100 ;
      
      if (stepSize < MIN_STEP_SIZE)
        stepSize = MIN_STEP_SIZE ;
      
      if (stepSize > MAX_STEP_SIZE)
        stepSize = MAX_STEP_SIZE ;
      
      canceled = false ;
      
      while (!canceled && !monitor.isCanceled() && i < elements.length && iterator.hasNext())
      {
        elements[i] = convertElement(iterator.next()) ;

        ++i ;

        if (i % stepSize == 0)
        {
          monitor.subTask(Activator.getDefault().getString(RETRIEVE_ELEMENT_SUB_TASK_LABEL, new int[] {i, items.size()})); 
          monitor.worked(stepSize) ;
        }  
      }

      monitor.done();

      if (!canceled && !monitor.isCanceled() && structuredViewer != null)
      {
        TimerTask task = new TimerTask()
        {

          public void run()
          {
            getParent().getDisplay().syncExec(new Runnable()
            {

              public void run()
              {
                structuredViewer.setInput(elements);
              }
            });
          }
        };

        Timer timer = new Timer(true);
        timer.schedule(task, 0);
      }
    }
    
  }
}
