package com.rays.oop.deepcloning;

public class TestDeep {
	public static void main(String[] args) throws CloneNotSupportedException  {

		Account no=new Account(10);
		Costumer c = new Costumer("Harsh",no);
		Costumer c1 = (Costumer) c.clone();
	
		c1.name = "rahul";
		c1.no.balance = 200;

		System.out.println(c.name);
		System.out.println(c.no.balance);

		System.out.println(c1.name);
		System.out.println(c1.no.balance);

	}

}
