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

import java.util.List;

import org.cropinformatics.common.Mapping;
import org.cropinformatics.ui.configuration.MappingViewerConfiguration;
import org.cropinformatics.ui.viewers.ConfigurableViewer;

public interface MappingViewer<F extends Object, T extends Object> extends ConfigurableViewer<MappingViewerConfiguration>
{
  public static final String MAPPING_PROPERTY = "mapping";
  
  public abstract List<F> getFromItems();

  public abstract boolean setFromItems(List<F> fromItems);

  public abstract List<T> getToItems();

  public abstract boolean setToItems(List<T> toItems);

  public abstract List<Mapping<F, T>> getMappedItems();

  public abstract boolean setMappedItems(List<Mapping<F, T>> mappedItems);

  public abstract boolean map(F fromItem, T toItem);

  public abstract boolean unmap(Mapping<F, T> mapping);

  public abstract boolean unmapAll(List<Mapping<F, T>> items);

}