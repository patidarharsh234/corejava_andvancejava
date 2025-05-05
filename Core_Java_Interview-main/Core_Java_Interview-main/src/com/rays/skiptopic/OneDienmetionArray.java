package com.rays.skiptopic;

public class OneDienmetionArray {

	public static void main(String[] args) {
		// length oR size of table oR indexing of table

//part:-1		
		int[] table = new int[10];
		String[] str = new String[10];
		char[] ch = new char[10];

		// set value of particularly index in table.

		// First Type:-
		table[0] = 0;
		table[1] = 1;
		table[2] = 2;
		table[3] = 3;
		table[4] = 4;
		table[5] = 5;
		table[6] = 6;
		table[7] = 7;
		table[8] = 8;
		table[9] = 9;

		int a = table[2];
		int b = table[6];
		int c = table[8];

		int size = table.length;

		System.out.println("a value:-" + a);
		System.out.println("b value:-" + b);
		System.out.println("c value:-" + c);
		System.out.println("table size Or length:-" + size);

		// Second type:-
		for (int i = 0; i < table.length; i++) {
			table[i] = i * 10; // Example: Setting each element to its index multiplied by 10
		}

		for (int i = 0; i < str.length; i++) {
			str[i] = "String " + i; // Example: Setting each element to a string "String " followed by the index
		}

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A' + i); // Example: Setting each element to a character starting from 'A'
		}

		// get the value
		for (int d : table) {	
			System.out.println("part:-1/Secound Type/ table= "+d);
		}
		System.out.println("");

		for (String d : str) {
			System.out.println("part:-1/Secound Type/ str= "+d);
		}
		System.out.println("");

		for (char d : ch) {
			System.out.println("part:-1/Secound Type/ ch= "+d);
		}
		System.out.println("");
		
		
		// OR:-difference between part:-1 and part:-2 But the working functionality of
		// both is same.

// Another way to use Array to define values in an array attribute is by using an array.

		int[] table2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] stringValue = { "harsh", "yash", "sourabh", "Hritik" };
		char[] ch2 = { 'A', 'B', 'C', 'D', 'E' };

		int size2 = table2.length;
		int size3 = stringValue.length;
		int size4 = ch2.length;

		// OR get the value
		for (int arrayValue : table2) {
			System.out.println("table2 value is:-" + arrayValue);
		}

		for (String string : stringValue) {
			System.out.println("string Value  is:-" + string);
		}

		for (char d : ch2) {
			System.out.println("charater Value  is:-" + d);
		}

//part:-3  (set the value table2 Array se table Array me )This is two type to set the value:-

		// set :- the value in table seam as the table2 .

		// First Type:-
		for (int i = 0; i < table.length; i++) {
			table[i] = table2[i]; // Example: Setting each element to its index multiplied by 10
		}

		// Second type:-

		System.arraycopy(table2, 0, table, 0, table2.length);

		// get the value :-

	}
}
