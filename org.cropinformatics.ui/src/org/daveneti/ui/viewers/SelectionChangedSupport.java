/*******************************************************************************
 * Copyright 2010 Guy Davenport
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

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;

public class SelectionChangedSupport
{
  private ListenerList listeners;
  private ISelectionProvider source;
  
  /**
   * @param source
   */
  public SelectionChangedSupport(ISelectionProvider source)
  {
    super();
    this.source = source;
  }

  public void addSelectionChangedListener(ISelectionChangedListener listener)
  {
    if (listeners == null)
      listeners = new ListenerList();
    listeners.add(listener);
  }
  
  public void removeSelectionChangedListener(ISelectionChangedListener listener)
  {
    if (listeners != null)
    {
      listeners.remove(listener);
      if (listeners.isEmpty())
        listeners = null;
    }
  }    
  
  public final void dispose()
  {
    listeners = null ;
  }

  public void fireSelectionChangedEvent(ISelection selection)
  {
  	fireSelectionChangedEvent(new SelectionChangedEvent(source, selection)) ;
  }

  protected final ISelectionProvider getSource()
  {
    return source;
  }

  protected final ListenerList getListeners()
  {
    return listeners;
  }
  
  private void fireSelectionChangedEvent(SelectionChangedEvent event)
  {
    if (listeners == null)
      return;
    Object[] listenerArray = listeners.getListeners();

    for (int i = 0; i < listenerArray.length; i++)
    {
    	ISelectionChangedListener listener = (ISelectionChangedListener) listenerArray[i];
      listener.selectionChanged(event);
    }
  }
}
