package com.rays.oop;

public class ConstructorCallingTest extends ConstructorCalling {

	public ConstructorCallingTest(String fName, String lName, String Address) {
		super(fName, lName, Address);
	}

	public static void main(String[] args) {
		ConstructorCallingTest t = new ConstructorCallingTest("Harsh", "patidar", "Indore");
	}

}
