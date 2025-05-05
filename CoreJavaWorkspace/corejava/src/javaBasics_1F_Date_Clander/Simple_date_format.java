package javaBasics_1F_Date_Clander;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Simple_date_format {

	public static void main(String[] args) {
		Date today= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String s= sdf.format(today);
		System.out.println(s);

	}

}
