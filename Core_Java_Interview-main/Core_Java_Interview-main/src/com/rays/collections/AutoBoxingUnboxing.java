package com.rays.collections;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		// AutoBoxing
		// primitive data is converted into Object, it is called Auto-boxing
		int a = 1;
		Integer b = a;

		System.out.println("Wrapper Int :" + b);

		// Unboxing

		Integer c = new Integer(15);
		int d = c;
		System.out.println(d);

	}
}
