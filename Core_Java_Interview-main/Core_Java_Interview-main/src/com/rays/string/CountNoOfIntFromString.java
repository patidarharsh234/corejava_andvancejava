package com.rays.string;

public class CountNoOfIntFromString {

	public static void main(String[] args) {
		String name = "kpai254214";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				count++;
			}

		}
		System.out.println("No Of Int From String :" + count);
	}

}
