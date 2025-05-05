package com.rays.thread;

public class TestRacing {

	public static void main(String[] args) {

	
		Racing t1 = new Racing("Harsh");

		Racing t2 = new Racing("yash");

		t1.start();
		t2.start();
	}
}