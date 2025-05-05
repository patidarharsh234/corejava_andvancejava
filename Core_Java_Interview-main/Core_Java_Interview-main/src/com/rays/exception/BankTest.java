package com.rays.exception;

public class BankTest {

	public static void main(String[] args) {

		BankAccount a = new BankAccount();
		a.setBalance(5000);
		a.deposite(500);
		System.out.println(a.getBalance());
		try {
			a.withdraw(5000);
			System.out.println(a.getBalance());
		} catch (BankException e) {
			// System.out.println("Amount is less than 2000");
			System.out.println(e.getMessage());
		}
		a.deposite(12500);
		System.out.println(a.getBalance());

	}

}