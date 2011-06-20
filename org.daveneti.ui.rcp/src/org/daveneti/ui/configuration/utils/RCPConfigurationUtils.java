package org.daveneti.ui.configuration.utils;

import org.daveneti.ui.configuration.ControlConfiguration;
import org.eclipse.nebula.widgets.datechooser.DateChooserCombo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class RCPConfigurationUtils extends
    org.daveneti.ui.configuration.utils.ConfigurationUtils
{
	public static DateChooserCombo createDateChooserCombo(Composite parent,
			ControlConfiguration configuration,
      GridData defaultLayoutData, int defaultStyle)
  {
		DateChooserCombo combo = null ;
		
		if (configuration != null)
		{
			if (!configuration.isSetVisible() || configuration.isVisible())
			{
		  	if (configuration.isSetStyle())
		  		combo = new DateChooserCombo(parent, configuration.getStyle()) ;
		  	else
		  		combo = new DateChooserCombo(parent, defaultStyle) ;
  	
				updateLayoutData(combo, configuration.getLayoutData(), defaultLayoutData) ;
			}
  	}
  	else
  	{
  		combo = new DateChooserCombo(parent, defaultStyle) ;
  		combo.setLayoutData(defaultLayoutData) ;
  	}
		
		return combo ;
  }
}
