package com.rays.exception;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		String[] a = { "Raj", "Kapil", "Sachin" };
		try {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[11]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println(e);

		}
	}

}
