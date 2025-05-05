package oop_3G_callParentConstructor;

public class Person {
	protected String firstName=null;
	protected String lastName=null;
	protected String address=null;
	
	public Person() {
		System.out.println("defaulter constructer parent");
		
	}
	public Person(String fir,String las) {
		this();
		firstName=fir;
		lastName=las;
		System.out.println("2 params constructor is called  parent");
	}
    public Person(String fir,String las, String add) {
    	this();
    	firstName=fir;
    	lastName=las;
    	address=add;
    	System.out.println("3 peram constructor called  parent");
    }
    public String getFirstName() {
    	//System.out.println(firstName);
    	return firstName;
    }
    public String getLastName() {
    	//System.out.println("lastName");
    	return lastName;
    }
    public String getAddress() {
    	//System.out.println("address");
    	return address;
    }
}

