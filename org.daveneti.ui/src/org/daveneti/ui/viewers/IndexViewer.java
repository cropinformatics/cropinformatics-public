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
package org.daveneti.ui.viewers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.daveneti.ui.components.Component;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ConfigurationFactory;
import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.viewers.list.CheckableListViewer;
import org.daveneti.ui.viewers.list.ListViewer;
import org.daveneti.ui.viewers.list.MutableListViewer;
import org.daveneti.ui.viewers.list.SingleListTableViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;

public class IndexViewer extends AbstractViewer<ListViewerConfiguration> 
{
  public static final String INDICES_PROPERTY = "indices";

	private static final String LIST_VIEWER_COMPONENT_ID = "listViewer";

  private IndexedLabelViewer viewer ;
  
  private int[] indices ;
  private int[] oldIndices ;
  private List<IndexedLabel> indexedLabels ;

  /**
   * @param parent
   * @param configuration
   */
  public IndexViewer(Composite parent, ListViewerConfiguration configuration, List<String> labels, int[] indices)
  {
    super(parent, configuration);
    
    indexedLabels = new LinkedList<IndexedLabel>() ;
    
    if (labels != null)
    {
      Iterator<String> iterator = labels.iterator() ;
      
      while (iterator.hasNext())
        addLabel(iterator.next()) ;
    }

    setIndices(indices) ;
  }
   
  public final int[] getIndices()
  {
    if (viewer != null)
      return getIndicesInternal() ;
    else
      return indices ;
  }

  public final void setIndices(int[] indices)
  {
    if (viewer != null)
    {
      oldIndices = getIndicesInternal() ;
      setIndicesInternal(indices) ;
    }
    else
    {
      oldIndices = indices ;
      this.indices = indices ;
    }
  }

  public final void addLabel(String label)
  {
    addLabel(label, true);
  }
  
  public final void addLabel(String label, boolean checked)
  {
    if (label != null && label.length() > 0)
    {
      int index = getIndexedLabels().size() ;
      
      IndexedLabel indexedLabel = new IndexedLabel(index, label) ;
      
      if (viewer != null)
      {
        viewer.addItem(indexedLabel) ;
        
        if (checked)
        {
          List<IndexedLabel> checkedItems = new LinkedList<IndexedLabel>() ;
          checkedItems.addAll(viewer.getCheckedItems()) ;
          checkedItems.add(indexedLabel) ;
          
          viewer.setCheckedItems(checkedItems) ;
        }
      }
      else  
      {
        indexedLabels.add(indexedLabel) ;
        
        if (checked)
        {
          if (indices != null)
            indices = Arrays.copyOf(indices, indices.length + 1) ;
          else
            indices = new int[1] ;
  
          indices[indices.length - 1] = index ;
        }
      }
    }
  }
  
  public final void removeLabel(int index)
  {
    IndexedLabel label = getIndexedLabel(index) ;
    
    if (label != null)
    {    
      if (viewer != null)
      {
        viewer.removeItem(label) ;
      }
      else
      {
        indexedLabels.remove(label) ;  
        
        if (indices != null && indices.length > 0)
        {
          int[] indices = new int[this.indices.length - 1] ;
          
          int j = 0 ;
          
          for (int i = 0 ; i < this.indices.length ; ++i)
          {
            if (i != label.getIndex())
            {
              indices[j] = this.indices[i] ;
              ++j ;
            }
          }
          
          this.indices = indices ;
        }
      }
    }
  }
  
  protected final List<IndexedLabel> getIndexedLabels()
  {
    if (viewer != null)
      return viewer.getItems() ;
    else
      return indexedLabels;  
  }
  
  protected final IndexedLabel getIndexedLabel(int index)
  {
    IndexedLabel label = null ;
    Iterator<IndexedLabel> iterator = getIndexedLabels().iterator() ;
    
    while (iterator.hasNext() && label == null)
    {
      label = iterator.next() ;
      
      if (index != label.getIndex())
        label = null ;
    }
    
    return label ;
  }

  @Override
  protected ListViewerConfiguration getDefaultConfiguration()
  {
    ListViewerConfiguration configuration = ConfigurationFactory.eINSTANCE.createListViewerConfiguration() ;
    
    configuration.setCheckSelectionInUse(true) ;
    configuration.setMultipleCheckInUse(true) ;
    
    return configuration;
  }
  
  
  @Override
  protected Component<? extends ComponentConfiguration> initialiseChildComponent(
      Composite parent, ComponentConfiguration configuration, String id)
  {
  	if (LIST_VIEWER_COMPONENT_ID.equals(id))
  	{
    	ListViewerConfiguration listViewerConfiguration = null;
    	
    	if (configuration instanceof ComponentConfiguration)
    		listViewerConfiguration = (ListViewerConfiguration)configuration ;
    	
  		viewer = new IndexedLabelViewer(parent, listViewerConfiguration, indexedLabels) ;
      
      setIndicesInternal(indices) ;
      viewer.setEnabled(isEnabled()) ;
      viewer.setVisible(isVisible()) ;
      viewer.initialise() ;
      
      viewer.addPropertyChangeListener(new PropertyChangeListener()
      {
        public void propertyChange(PropertyChangeEvent event)
        {
          handlePropertyChange(event) ;
          
          if (ListViewer.POSITION_PROPERTY.equals(event.getPropertyName()) || CheckableListViewer.CHECKED_ITEM_ADDED_PROPERTY.equals(event.getPropertyName()) ||
               CheckableListViewer.CHECKED_ITEM_REMOVED_PROPERTY.equals(event.getPropertyName()) || CheckableListViewer.CHECKED_PROPERTY.equals(event.getPropertyName()) ||
               MutableListViewer.ITEM_ADDED_PROPERTY.equals(event.getPropertyName()) || MutableListViewer.ITEM_REMOVED_PROPERTY.equals(event.getPropertyName()) ||
               MutableListViewer.ITEMS_ADDED_PROPERTY.equals(event.getPropertyName()) || MutableListViewer.ITEMS_REMOVED_PROPERTY.equals(event.getPropertyName()) ||
                   MutableListViewer.ITEMS_CLEARED_PROPERTY.equals(event.getPropertyName()))
            getPropertyChangeSupport().firePropertyChange(INDICES_PROPERTY, oldIndices, getIndices()) ;
        }
      }) ;
      
      return viewer ;
  	}

	  return null;
  }
  
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(LIST_VIEWER_COMPONENT_ID) ;
    
    return list ;
  }

  protected void handlePropertyChange(PropertyChangeEvent event)
  {

  }

  private int[] getIndicesInternal()
  {
    List<IndexedLabel> checkedItems = viewer.getCheckedItems() ;
    
    if (checkedItems != null)
    {  
      int[] indices  = new int[checkedItems.size()] ;
      
      Iterator<IndexedLabel> iterator = viewer.getItems().iterator() ;
      
      IndexedLabel label ;
      
      int i = 0 ;
      
      while (iterator.hasNext())
      {
        label = iterator.next() ;
        
        if (checkedItems.contains(label))
        {
          indices[i] = label.getIndex() ;
          
          ++i ;
        }
      }

      return indices ;
    }
    else
    {
      return new int[0] ;
    }
  }
  
  private void setIndicesInternal(int[] indices)
  {
    List<IndexedLabel> checkedItems = new LinkedList<IndexedLabel>() ;
    
    int size = viewer.getItemCount() ;
    
    if (indices != null)
      for (int i = 0 ;  i < indices.length ; ++i)
        if (indices[i] >=0 && indices[i] < size)
          checkedItems.add(getIndexedLabel(indices[i])) ;
  
    viewer.setCheckedItems(checkedItems) ;
  }

  private class IndexedLabel
  {
    private int index ;
    private String label ;
    
    /**
     * @param index
     * @param label
     */
    public IndexedLabel(int index, String label)
    {
      super();
      this.index = index;
      this.label = label;
    }
    
    public final int getIndex()
    {
      return index;
    }
    
    public final String getLabel()
    {
      return label;
    }
  }
  
  private class IndexedLabelViewer extends SingleListTableViewer<IndexedLabel>
  {
    public IndexedLabelViewer(Composite parent, ListViewerConfiguration configuration, List<IndexedLabel> items)
    {
      super(parent, configuration, items);
    }

    @Override
    protected ILabelProvider createLabelProvider()
    {
      return new IndexedLabelViewerProvider();
    }  
  }
  
  private class IndexedLabelViewerProvider extends LabelProvider
  {
    @Override
    public String getText(Object element)
    {
      if (element instanceof IndexedLabel)
        return super.getText(((IndexedLabel)element).getLabel());
      else
        return super.getText(element);
    }
  }
}
