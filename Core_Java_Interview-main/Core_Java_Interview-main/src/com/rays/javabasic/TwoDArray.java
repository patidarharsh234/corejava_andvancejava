package com.rays.javabasic;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] table = new int[9][10];

		for (int i = 2; i <= table.length+1; i++) {
			
			for (int j = 1; j <= table[i-2].length; j++) {
				table[i-2][j-1] = i  * j ;

				System.out.print(table[i-2][j-1] + "\t");
			}

			System.out.println();
		}
	}

}
