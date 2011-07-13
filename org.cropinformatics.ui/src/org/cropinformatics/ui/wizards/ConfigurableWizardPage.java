package org.cropinformatics.ui.wizards;

import org.cropinformatics.ui.components.Configurable;
import org.cropinformatics.ui.configuration.WizardPageConfiguration;
import org.eclipse.jface.wizard.IWizardPage;

public interface ConfigurableWizardPage extends IWizardPage, Configurable<WizardPageConfiguration>
{
  public boolean isEnabled() ;
  
  public void setEnabled(boolean enabled) ;
  
}
