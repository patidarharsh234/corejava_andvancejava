package com.rays.exception;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		
		try {
			int j = 10 / 0;
		} catch (ArithmeticException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}