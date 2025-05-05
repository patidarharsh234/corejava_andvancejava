package oop_3j_deepCloning_objec;

public class Customer implements Cloneable {
	public String name = null;
	public Account account = null;

	public Customer(String name) {
		this.name = name;
		this.account = new Account(10);

	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { //TODO
	 * Auto-generated method stub return super.clone(); }
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		                                       //super.clone se customer ki cloneing hogi 
		Customer c = (Customer) super.clone(); // super.clone extra power he java bhagwan ki jo ki dusri class ki
		c.account = (Account) account.clone(); //clone power ka use kr sakte ho or us clone se value hold 
		return c;                              //kara sakte ho dusri class ki
	}

}
