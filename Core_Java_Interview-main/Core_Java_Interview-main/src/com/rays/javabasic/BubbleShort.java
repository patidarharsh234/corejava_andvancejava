package com.rays.javabasic;

public class BubbleShort {

	public static void main(String[] args) {

		// Output Write but This is not actual bubble sorting.
//		int[] num = { 10, 24, 89, 1, 0, 58 };
//
//		int temp = 0;
//
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[i] > num[j]) {
//
//					temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//
//			System.out.println(num[i]);
//		}

		// actual bubble sorting:-
		int[] num = { 10, 24, 89, 1, 0, 58 };

		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) { // -i : reduce number of running loop , -1: because j+1 count
															// last index if you don't give this then comes
															// outOfBoundIndex Exception. j+1 yha index ko 1 se chalu kara or for loop jo chl ra he uska index 0 se length se ak kam tak chal ra but j+1 hamne us for loop ke implemention ke ander kiya to   
				if (num[j] > num[j + 1]) {                  //j+1 =indexing se bhar chla jayega lenght ke barabr ho jayega or indexouofbound de dega.
					// Swap num[j] and num[j+1]
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}

		}

		// Print the sorted array
		System.out.println("Sorted Array:");
		for (int n : num) {
			System.out.print(n + ",");
		}

	}

}
