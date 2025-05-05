package javaBasics_1F_Date_Clander;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import string_StringBuffer_java.lang.String_class;

public class clander_instance {

	public static void main(String[] args) throws ParseException {
		/* Calendar cal=Calendar.getInstance();
		  for(int i=0;i<=12;i++) {
			   cal.add(Calendar.DATE, 30);
			Date nextEvent=cal.getTime();       //today date to start method
			System.out.println(nextEvent);
			}  */
		   
		   
		   
	//Calendar cal=Calendar.getInstance();	   
	//Calendar.getInstance();	         // aj ki date se dino ko badana
	//cal.add(Calendar.DATE,5);             // ya km krna
	//System.out.println(cal.getTime());
	//}
	
	
	
		Calendar cal=Calendar.getInstance();
		 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	//	 String source= "01/02/2023";
	//	  cal.setTime(sdf.parse(source));
		 for(int i=0;i<=12;i++) {
		   cal.add(Calendar.DATE, 30);
		   
		   
		Date d =cal.getTime();
		System.out.println(d);//java fotmate me time
		
		
	// SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyy");	
		String str = sdf.format(d);// time ko apne formate me chang krne ke liye
		System.out.println(str);  }
		     } 
		
		 
		 
		 
		 
		 
		 
}


