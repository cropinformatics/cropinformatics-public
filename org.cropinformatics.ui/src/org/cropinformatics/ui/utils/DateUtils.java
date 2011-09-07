package org.cropinformatics.ui.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.cropinformatics.ui.Activator;

public class DateUtils
{
	public static final SimpleDateFormat ISO8601_FORMAT = new SimpleDateFormat("yyyy-MM-dd")  ;
	public static final SimpleDateFormat ISO8601_MONTH_FORMAT = new SimpleDateFormat("yyyy-MM")  ;
	public static final SimpleDateFormat ISO8601_YEAR_FORMAT = new SimpleDateFormat("yyyy")  ;
	
	private static final String DATE_FORMAT = DateUtils.class.getName() + ".localDateFormat";
	
	private static final SimpleDateFormat LOCALE_FORMAT = new SimpleDateFormat(Activator.getDefault().getString(DATE_FORMAT), Locale.getDefault()) ;

	public static String parseDateToISO8601(Date date)
	{
		if (date != null)
			return ISO8601_FORMAT.format(date);
		else
			return null ;
	}

  public static String parseDateToLocale(Date date)
	{
		if (date != null)
			return LOCALE_FORMAT.format(date);
		else
			return null ;
	}
}
