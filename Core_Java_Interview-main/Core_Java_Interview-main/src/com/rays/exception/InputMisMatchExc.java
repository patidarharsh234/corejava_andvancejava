package com.rays.exception;

import java.util.InputMismatchException;

public class InputMisMatchExc {

	public static void main(String[] args) {

		String name = "jay ho";
		try {
			if (!name.matches("Harsh")) {
				throw new InputMismatchException("match nhi hua bro");
			}
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
	}

}
