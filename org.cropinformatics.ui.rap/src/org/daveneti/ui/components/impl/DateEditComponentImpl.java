package org.daveneti.ui.components.impl;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.daveneti.ui.Activator;
import org.daveneti.ui.components.Component;
import org.daveneti.ui.configuration.ComponentConfiguration;
import org.daveneti.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class DateEditComponentImpl extends StringEditComponent<Date> implements DateEditComponent
{
	
	private SimpleDateFormat format;

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
	protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
			ComponentConfiguration configuration, String id)
	{
		Component<? extends ComponentConfiguration> component ;
		
		if (getText() != null && (DATE_CHOOSER_COMPONENT_ID.equals(id) || TEXT_COMPONENT_ID.equals(id)))
		{
			component = super.initialiseChildComponent(parent, configuration, TEXT_COMPONENT_ID) ;
		}
		else
		{
			component = super.initialiseChildComponent(parent, configuration, id) ;
		}

		return component ;
	}

	public boolean isValid()
	{
		try
    {
	    return getFormat().parse(getText().getText()) != null ;
    }
    catch (ParseException e)
    {
	    return false ;
    }
	}

	@Override
	public String getId()
	{
		return DateEditComponent.class.getName() ;
	}

	protected SimpleDateFormat getFormat()
	{
		if (format == null)
			format = new SimpleDateFormat(Activator.getDefault().getString(DateEditComponent.DATE_FORMAT)) ;
		
		return format ;
	}

	@Override
  protected String parseValue(Date value)
  {
	  return getFormat().format(value);
  }

	@Override
  protected Date parseString(String string)
  {
		try
    {
	    return getFormat().parse(getText().getText()) ;
    }
    catch (ParseException e)
    {
    	return null;
    }
  }
}
