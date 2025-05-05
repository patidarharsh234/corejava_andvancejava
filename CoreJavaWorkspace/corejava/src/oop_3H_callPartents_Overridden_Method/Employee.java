package oop_3H_callPartents_Overridden_Method;

public class Employee extends Person{
	private String designation=null;
	
	public Employee() {
		System.out.println("default constructo employ");
	}
	public void changeAddress() {
		System.out.println("********");
		super.changeAddress();
		System.out.println("Employ Change Address");
	}
	   
	   
   
}
