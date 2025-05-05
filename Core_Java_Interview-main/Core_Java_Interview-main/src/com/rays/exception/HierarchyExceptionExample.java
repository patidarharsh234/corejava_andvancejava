package com.rays.exception;

public class HierarchyExceptionExample {
	public static void main(String[] args) {
		String name = "Java";

		try {
			System.out.println(name.charAt(4));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException........");

		} catch (Exception e) {
			System.out.println("Exception........");
		}
	}
}
