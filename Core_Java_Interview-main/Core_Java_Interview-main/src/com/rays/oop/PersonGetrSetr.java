package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonGetrSetr {
	
	private String name;
	private int age;
	private Date dob;
	
	
	public void setName(String name) {
		this.name=name;
		
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	
	public void setDob(Date dob) {
		this.dob=dob;
		
	}
	
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public static void main(String[] args) throws ParseException {
		PersonGetrSetr basic=new PersonGetrSetr();
		basic.setName("harsh");
		basic.setAge(30);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		basic.setDob(sdf.parse("02/30/2000"));
		
		System.out.println(basic.getName());
		System.out.println(basic.getAge());
		System.out.println(basic.getDob());
	}
}


