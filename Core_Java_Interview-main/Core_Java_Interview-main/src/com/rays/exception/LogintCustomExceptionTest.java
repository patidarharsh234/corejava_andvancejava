package com.rays.exception;

public class LogintCustomExceptionTest {
	public static void main(String[] args) {

		String name = "yas";
		String password = "1234";

		try {
			if (!(name.equals("yas") && password.equals("1234"))) {
				throw new CustomLoginException("User Note Valide");
			}
		} catch (CustomLoginException e) {
			System.out.println(e);
		}
	}

}
