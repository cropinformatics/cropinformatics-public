package org.cropinformatics.ui.components.impl;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.cropinformatics.ui.Activator;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
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

	public boolean isValid()
	{
		try
    {
	    return getText() != null && getFormat().parse(getText().getText()) != null ;
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

	@Override
	protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
			ComponentConfiguration configuration, String id)
	{
		Component<? extends ComponentConfiguration> component ;
		
		if (DATE_CHOOSER_COMPONENT_ID.equals(id) || TEXT_COMPONENT_ID.equals(id))
		{
			component = super.initialiseChildComponent(parent, configuration, TEXT_COMPONENT_ID) ;
		}
		else
		{
			component = super.initialiseChildComponent(parent, configuration, id) ;
		}

		return component ;
	}
	
  @Override
  protected List<String> getChildConpomentIds()
  {
    List<String> list = super.getChildConpomentIds() ;
    
    list.add(DATE_CHOOSER_COMPONENT_ID) ;
    
    return list ;
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
