package javaBasics_1F_Date_Clander;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class date_formate_stringToDate {

	public static void main(String[] args) throws ParseException {
		
		String s="24/05/2022";
		SimpleDateFormat sDF= new SimpleDateFormat("dd/MM/yy");
		Date d=sDF.parse(s);
		System.out.println(d);//java time format
		String str=sDF.format(d);
		System.out.println(str);
	}

}
