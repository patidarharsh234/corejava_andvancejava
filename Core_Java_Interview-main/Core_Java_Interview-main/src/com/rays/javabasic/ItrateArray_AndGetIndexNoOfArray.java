package com.rays.javabasic;

public class ItrateArray_AndGetIndexNoOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 10, 8, 58 };
		int num = 8;
		int temp=-1;

		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i]) {
				temp = i;

			}

		}
		System.out.println(num+"  length="+temp);

	}

}
