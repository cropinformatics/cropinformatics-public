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

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Spinner;

public class SpinnerCellEditor extends CellEditor
{
	private Spinner spinner;

	public SpinnerCellEditor()
  {
	  super();
  }

	public SpinnerCellEditor(Composite parent)
  {
	  super(parent);
  }

	public SpinnerCellEditor(Composite parent, int style)
  {
	  super(parent, style);
  }

	@Override
	protected Control createControl(Composite parent)
	{
		spinner = new Spinner(parent, getStyle());

		return spinner;
	}

	@Override
	protected Object doGetValue()
	{
		return spinner.getSelection() ;
	}

	@Override
	protected void doSetFocus()
	{
		if (spinner != null)
		{
			spinner.setFocus();
		}
	}

	@Override
	protected void doSetValue(Object value)
	{
		if (spinner != null)
		{
			if (value instanceof Integer)
			{
				spinner.setSelection((Integer)value) ;
			}
		}
	}
}
