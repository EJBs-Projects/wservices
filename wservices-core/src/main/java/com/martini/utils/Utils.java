package com.martini.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	public static String DateNowMMMddyyyyHHmmssSSS(){
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");

		// Get the date today using Calendar object.
		Date today = Calendar.getInstance().getTime();        
		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		String reportDate = df.format(today);

		// Print what date is today!
		return reportDate;
		
	}
	
}
