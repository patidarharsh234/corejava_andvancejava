package opp_3A_Condition;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest_obj {
public static void main(String[] args) {
	Person_ExpertClass per= new Person_ExpertClass();
	
	/*Date d=new Date();
	String s="30/06/1995";
	SimpleDateFormat sdf=new SimpleDateFormat();
	String a=sdf.format(d);
	per.setDob(d);
	per.getDob();
	System.out.println(per.getDob());*/
	
	
	
	per.setName("harsh patidar");
	per.getName();
	System.out.println(per.getName());
	
	per.setAddress("bholaram indore");
	per.getAddress();
	System.out.println(per.getAddress());
	
	
	Person_ExpertClass.AVG_AGE=10;
	System.out.println(Person_ExpertClass.AVG_AGE);
	
	
	System.out.println(per.getAVG_AGE());

		
	}
	

	
}

