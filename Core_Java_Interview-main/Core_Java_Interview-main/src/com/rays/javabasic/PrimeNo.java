package com.rays.javabasic;

public class PrimeNo {

	public static void main(String[] args) {
		int num = 9;
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 0) {

			System.out.println(num + ":  is prime no");
		} else {
			System.out.println(num + ":  is Notprime no");
		}
		
		
	}
	

}
