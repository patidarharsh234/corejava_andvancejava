package com.rays.exception;

public class UncheckedException {

	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("Caught by dad, raised by son");
		}

	}

	private static void mom() {
		son();

	}

	private static void son() {

		throw new RuntimeException("I mad a mistak...");

	}

}
