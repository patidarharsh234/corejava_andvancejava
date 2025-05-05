package com.rays.javabasic;

public class LoopExample {
	public static void main(String[] args) {
		int count = 0;
		// Using a do-while loop to print numbers from 1 to 5
		do {
			System.out.println("Count 1: " + count);
			count++; // Increment the count
			System.out.println("Count 2: " + count);
		} while (count <= 5); // Continue looping while count is less than or equal to 5
	}
}
