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
package org.daveneti.ui.viewers.twin;

import java.util.List;

import org.daveneti.common.Mapping;
import org.daveneti.ui.configuration.MappingViewerConfiguration;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;

public class BaseMappingViewer<F, T> extends AbstractMappingViewer<F, T>
{

	public BaseMappingViewer(Composite parent,
      MappingViewerConfiguration configuration)
  {
	  super(parent, configuration);
  }

	public BaseMappingViewer(Composite parent,
      MappingViewerConfiguration configuration, List<F> fromItems,
      List<T> toItems)
  {
	  super(parent, configuration, fromItems, toItems);
  }

	public BaseMappingViewer(Composite parent,
      MappingViewerConfiguration configuration, List<F> fromItems,
      List<T> toItems, List<Mapping<F, T>> mappedItems)
  {
	  super(parent, configuration, fromItems, toItems, mappedItems);
  }

	@Override
  protected ILabelProvider createFromLabelProvider()
  {
	  return new LabelProvider() ;
  }

	@Override
  protected ILabelProvider createToLabelProvider()
  {
	  return new LabelProvider() ;
  }

	@Override
  protected ILabelProvider createMappingLabelProvider()
  {
	  return new LabelProvider() ;
  }
}
