package opp_3A_Condition;

import java.util.Date;


public class Person_ExpertClass {
	private String name;
	private Date dob;
	private String address;
	public static  int AVG_AGE=18;
//    public static final  int AVG_AGE=18;
	
	
	
	public void setName(String nm) {  // set-get me class variable ka first latter capital lete
		name=nm;
	}
	public String getName() {
		return name;
	}
	public void setDob(Date dob) {      //local variable and class variable seam ho (this.dob)this. lagate
		this.dob=dob;}
	    
	    
	public Date getDob() {
		return dob;
	}
	public void setAddress(String add) {
		this.address=add;}
	public String getAddress() {
		return address;
	}
	public  int getAVG_AGE() {
		return AVG_AGE;
	}
	
	
		
	}
	
	
	


