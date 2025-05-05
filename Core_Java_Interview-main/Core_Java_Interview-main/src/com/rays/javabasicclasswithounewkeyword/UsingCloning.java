package com.rays.javabasicclasswithounewkeyword;

public class UsingCloning implements Cloneable {
	
	String name="harsh";
	
	String city="Indore";
	
	
	public void display() {
		System.out.println("hello i am coming with the help of clonig");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
		//or
		//return new UsingCloning();
	}

	
	
	
	
}
