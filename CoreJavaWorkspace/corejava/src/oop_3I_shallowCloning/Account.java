package oop_3I_shallowCloning;

public class Account implements Cloneable {
	int balance=0;
	
	
	public void setBalance(int balance) {
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
