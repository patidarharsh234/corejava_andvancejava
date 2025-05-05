package com.rays.oop.deepcloning;

import javax.management.RuntimeErrorException;

public class Costumer implements Cloneable {

	public String name;

	public Account no;

	public Costumer(String name, Account no) {
		this.name = name;
		this.no = no;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Costumer c = (Costumer) super.clone();
		c.no = (Account) no.clone();

		return c;
	}

}
