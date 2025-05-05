package com.rays.exception;

public class TryWithFinally {

	public static void main(String[] args) {

		String s = "Kapil";
		try {
			s.charAt(10);
			System.out.println("try");
			//System.exit(0);
		} finally {
			System.out.println("end of program");
		}

	}
}