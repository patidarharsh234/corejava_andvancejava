package oop_3H_callPartents_Overridden_Method;

public class Person {
	protected String firstName=null;
	protected String lastName=null;
	protected String address=null;
	
	public Person() {
		System.out.println("defaulter cons parent");
	}
	
	public void changeAddress() {
		System.out.println("person change Address");
	}
}
