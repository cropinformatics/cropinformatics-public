package org.cropinformatics.ui.components.impl;

import java.util.Date;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.cropinformatics.ui.configuration.ControlConfiguration;
import org.cropinformatics.ui.configuration.utils.RCPConfigurationUtils;
import org.eclipse.nebula.widgets.datechooser.DateChooserCombo;
import org.eclipse.nebula.widgets.formattedtext.DateFormatter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class DateEditComponentImpl extends AbstractDateEditComponent 
{
	private DateChooserCombo dateChooserCombo ;

	public DateEditComponentImpl(Composite parent)
	{
		super(parent) ;
	}

	public DateEditComponentImpl(Composite parent, Date value)
	{
		super(parent, value) ;
	}

	public DateEditComponentImpl(Composite parent, String labelValue, Date value)
	{
		super(parent, labelValue, value);
	}

	public DateEditComponentImpl(Composite parent, ContainerConfiguration containerConfiguration)
	{
		super(parent, containerConfiguration) ;
	}

	public DateEditComponentImpl(Composite parent, ContainerConfiguration containerConfiguration, Date value)
	{
		super(parent, containerConfiguration) ;
	}

	public DateEditComponentImpl(Composite parent, ContainerConfiguration containerConfiguration, String labelValue, Date value)
	{
		super(parent, containerConfiguration, labelValue, value);
	}
  
	@Override
  protected void updateInternalComponents()
  {
		if (dateChooserCombo != null)
			dateChooserCombo.setValue(getValue()) ;
  }

	@Override
	protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
			ComponentConfiguration configuration, String id)
	{
		Component<? extends ComponentConfiguration> component = super.initialiseChildComponent(parent, configuration, id) ;
		ControlConfiguration controlConfiguration = null ;

		if (configuration instanceof ControlConfiguration)
			controlConfiguration = (ControlConfiguration)configuration ;

		if (component == null && DATE_CHOOSER_COMPONENT_ID.equals(id))
		{
			dateChooserCombo = createDateChooserCombo(parent, controlConfiguration) ;

			dateChooserCombo.setVisible(isVisible()) ;

			dateChooserCombo.setEnabled(isEnabled()) ;

			dateChooserCombo.setEditable(getConfiguration().isEditable()) ;

			dateChooserCombo.setFormatter(new DateFormatter(Activator.getDefault().getString(DATE_FORMAT)));

			if (getValue() != null)
				dateChooserCombo.setValue(getValue()) ;

			dateChooserCombo.addModifyListener(new ModifyListener()
			{
				public void modifyText(ModifyEvent e)
				{
					setValueInternalWithEvent(dateChooserCombo.getValue()) ;
				}

			}) ;

			component = new SimpleControlComponent<Composite>(dateChooserCombo.getParent()) ;
		}

		return component ;
	}

	@Override
	public String getId()
	{
		return DateEditComponent.class.getName() ;
	}

	/**
	 * Create a new DateChooserCombo based on the configuration if not null. If the configuration defines that
	 * the spinner should not visible the method will return null 
	 * 
	 * @param configuration the configuration of the combo
	 * @param id the configuration identifier of the spinner 
	 * @return a new button or null if not visible
	 */
	protected final DateChooserCombo createDateChooserCombo(Composite parent, ControlConfiguration configuration)
	{
		return createDateChooserCombo(parent, configuration, SWT.NONE) ;
	}

	/**
	 * Create a new DateChooserCombo based on the configuration if not null. If the configuration defines that
	 * the spinner should not visible the method will return null 
	 * 
	 * @param configuration the configuration of the combo
	 * @param id the configuration identifier of the spinner 
	 * @return a new button or null if not visible
	 */
	protected final DateChooserCombo createDateChooserCombo(Composite parent, ControlConfiguration configuration, int defaultStyle)
	{
		return RCPConfigurationUtils.createDateChooserCombo(parent, configuration, new GridData(SWT.LEFT, SWT.CENTER, false, false), defaultStyle) ;
	}
}
