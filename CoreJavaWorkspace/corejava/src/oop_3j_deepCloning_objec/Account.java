package oop_3j_deepCloning_objec;

public class Account implements Cloneable {
	int balance=0;
	
	
	public Account(int balance) {
		this.balance=balance;
	}
	
	
	public int getBalance() {
		return balance;
	}
	@Override
   protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
 
}
