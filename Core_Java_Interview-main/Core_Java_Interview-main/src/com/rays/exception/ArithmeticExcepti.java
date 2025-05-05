package com.rays.exception;

public class ArithmeticExcepti {
	public static void main(String[] args) {
		// int a = 10/0;
		try {
			int c = 10 / 0;
		//	System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			
		}
	}
}
