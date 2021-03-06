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
package org.cropinformatics.ui.viewers;

import org.cropinformatics.common.Identification;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class IdentificationViewerSorter extends ViewerSorter
{
	@Override
  public int compare(Viewer viewer, Object e1, Object e2)
  {
		return (((Identification)e1).getName()).compareTo(((Identification)e2).getName())  ;
  }
}
