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

import java.util.List;

import org.cropinformatics.ui.configuration.TwinViewerConfiguration;
import org.cropinformatics.ui.viewers.ConfigurableViewer;
import org.cropinformatics.ui.viewers.list.ListViewerFilter;

public interface TwinViewer<L extends Object, R extends Object> extends ConfigurableViewer<TwinViewerConfiguration>
{
  public abstract List<L> getLeftItems();

  public abstract boolean setLeftItems(List<L> leftItems);

  public abstract List<R> getRightItems();

  public abstract boolean setRightItems(List<R> rightItems);

  public abstract List<L> getLeftFilteredItems();

  public abstract List<R> getRightFilteredItems();

  public abstract boolean addLeftFilter(ListViewerFilter filter);

  public abstract boolean removeLeftFilter(ListViewerFilter filter);

  public abstract List<ListViewerFilter> getLeftFilters();

  public abstract boolean setLeftFilters(List<ListViewerFilter> filters);

  public abstract boolean addRightFilter(ListViewerFilter filter);

  public abstract boolean removeRightFilter(ListViewerFilter filter);

  public abstract List<ListViewerFilter> getRightFilters();

  public abstract boolean setRightFilters(List<ListViewerFilter> filters);
}