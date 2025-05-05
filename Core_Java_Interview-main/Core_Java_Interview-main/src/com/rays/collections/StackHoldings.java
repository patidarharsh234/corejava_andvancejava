package com.rays.collections;

import java.util.Stack;

public class StackHoldings {

	public static void main(String[] args) {

		Stack s1 = new Stack();
	

		for (char i = 'a'; i <= 'z'; i++) {

			System.out.print(s1.push(i) + " ");
		}
		System.out.println();

		Stack s2 = new Stack();
		while (!s1.isEmpty()) {
			System.out.print(s2.push(s1.pop()) + " ");
//		}
//		System.out.println(); 
//		while (!s2.isEmpty()) {
//			System.out.print(s1.push(s2.pop()) + " ");
//		}
		}

	}
}