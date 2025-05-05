package com.rays.oop;

public class ConstructorCalling {

	String fName;
	String lName;
	String Address;

	public ConstructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.print(fName +" ,"+lName+",");
		
	}

	public ConstructorCalling(String fName, String lName, String Address) {
		this(fName, lName);
		
		this.Address = Address;
		System.out.println(Address);
	}
}
