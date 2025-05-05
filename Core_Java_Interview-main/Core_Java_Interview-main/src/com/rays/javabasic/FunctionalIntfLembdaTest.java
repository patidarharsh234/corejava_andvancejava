package com.rays.javabasic;

public class FunctionalIntfLembdaTest {

	public static void main(String[] args) {
		FunctionalInte f = (a, b) -> {
			return a + b;
			
		};
		int a = 10;
		int b = 20;
		System.out.println("Sum" + f.sum(a, b));

		f.sub(a, b);

		FunctionalInte.multi(a, b);
	}

}
