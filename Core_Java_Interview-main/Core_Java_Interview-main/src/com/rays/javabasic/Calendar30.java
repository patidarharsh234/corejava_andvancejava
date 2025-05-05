package com.rays.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar30 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = Calendar.getInstance();
		for (int i = 1; i <= 12; i++) {
			c.add(Calendar.DATE, 30);

			System.out.println("Current Date Incremant :"+sdf.format(c.getTime()));
		}

		System.out.println("--------------------------");
		
		
		
		
		// Counting from custom date
		String coustomDate = "02/03/2024";
		Date date1=sdf.parse(coustomDate);
		c.setTime(date1);
		
		for(int i=1; i<=12; i++) {
			c.add(Calendar.DATE, 30);
			
			
			
		  String convertString=sdf.format(c.getTime());
		  System.out.println("Custom Date Incremant :"+convertString);
		  
		  Date date2=c.getTime();
		  System.out.println("java.sql.date :"+new java.sql.Date(date2.getTime()));
		}

		
         		

	}

}
