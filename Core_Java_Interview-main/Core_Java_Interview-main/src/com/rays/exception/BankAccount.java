package com.rays.exception;

public class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt) {
		balance +=amt;
		//System.out.println(balnc);
	}

	public double withdraw(double amt) throws BankException {
		
		if ((balance-amt) < 2000) {
			
			throw  new BankException("Amount is less than 2000.....");
		}else {
			balance-=amt;
			System.out.println(balance);
		}
		return balance;
	}
}
