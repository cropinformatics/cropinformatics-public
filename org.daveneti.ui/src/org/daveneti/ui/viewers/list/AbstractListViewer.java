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

import org.daveneti.ui.configuration.ListViewerConfiguration;
import org.daveneti.ui.configuration.utils.ConfigurationUtils;
import org.daveneti.ui.viewers.AbstractViewer;
import org.eclipse.swt.widgets.Composite;

/**
 * The super class for all viewer that show elements as a list using a underlying viewer
 * widget, such as a TableViewer or TreeViewer
 * 
 * @author Guy Davenport (guy@daveneti.com)
 * @version $Id$
 *
 * @param <T> the type of the elements in the list
 */
public abstract class AbstractListViewer<T extends Object> extends AbstractViewer<ListViewerConfiguration> implements ListViewer<T>
{
  public AbstractListViewer(Composite parent, ListViewerConfiguration configuration)
  {
    super(parent, configuration) ;
  }

  @Override
  protected ListViewerConfiguration getDefaultConfiguration()
  {
    return ConfigurationUtils.getListViewerConfiguration(this) ;
  }
}
