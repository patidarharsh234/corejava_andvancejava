package com.rays.javabasic;

public class SwitchStatement {
	public static void main(String[] args) {

		int a = 10;
		int b = 2;

		char operator = ' ';

		switch (operator) {
		case '+':
			System.out.println("sum Result:" + (a + b));
			break;

		case '-':
			System.out.println("sub Result:" + (a - b));
			break;

		case '*':
			System.out.println("multi Result:" + (a * b));
			break;

		case '/':
			if (b != 0) {
				System.out.println("divison Result:" + (a / b));
			} else {
				System.out.println("Zero cannot be divisible");
			}
			break;
			
			default :
				System.out.println("invalid operator");

		}

	}
}
