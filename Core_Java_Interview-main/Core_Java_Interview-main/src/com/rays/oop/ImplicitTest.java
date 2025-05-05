package com.rays.oop;

public class ImplicitTest extends Implicit {

	public ImplicitTest() {
		System.out.println("child Implicit calling");
	}

	public static void main(String[] args) {
		ImplicitTest i = new ImplicitTest();
	}

}
