package com.rays.skiptopic;

import java.util.Arrays;

public class CovertingDirectlyTypes {

	
	public static void main(String[] args) {
		
		int g = 5000;
		String gString = Integer.toString(g);

		
		String[] gStringArray = Integer.toString(g).split("");

		String[] strArray = {"1", "2", "3", "4"};
		int[] intArray = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();

		
		int[] intArray1 = {1, 2, 3, 4};
		String[] strArray2 = Arrays.stream(intArray1).mapToObj(Integer::toString).toArray(String[]::new);

		
		String gString1 = "5000";
		int[] intArray3 = gString1.chars().map(Character::getNumericValue).toArray();

		
	}
}
