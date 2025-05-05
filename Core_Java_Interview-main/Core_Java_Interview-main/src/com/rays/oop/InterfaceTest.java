package com.rays.oop;

public class InterfaceTest implements Interfacee {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		InterfaceTest b = new InterfaceTest();

		System.out.println(b.sum(10, 20));

		 System.out.println(x);
	}
}