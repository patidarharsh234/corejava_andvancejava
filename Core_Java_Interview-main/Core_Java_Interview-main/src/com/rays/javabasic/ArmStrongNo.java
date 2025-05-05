package com.rays.javabasic;

public class ArmStrongNo {
	public static void main(String[] args) {
		int num = 370;
		int num2 = num;
		int r = 0;
		int temp = 0;

		while (num2 != 0) {
			r = num2 % 10;
			temp += r * r * r;

			num2 /= 10;
		}
		if (temp == num) {
			System.out.println("arm strong no.");
		} else {
			System.out.println("not arm strong no.");
		}
	}
}
