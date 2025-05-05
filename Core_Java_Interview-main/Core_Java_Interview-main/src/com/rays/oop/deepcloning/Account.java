package com.rays.oop.deepcloning;

import java.util.LinkedHashSet;

public class Account implements Cloneable {

	public int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	//Exception based :-when you not implement closable Interface but even then not given cloneNoteSupportExce How Ex:-
//	@Override
//	protected Object clone() {
//		// TODO Auto-generated method stub
//		return new Account(this.balance);
//	}


}
