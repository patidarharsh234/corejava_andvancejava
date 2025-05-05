package com.rays.string;

public class Recurstion_Permotation {
 //Permotation like Factoriyal :-n=3  3!=3*2*1=6
	
	// Function to display all permutations of the string str
	static void printallPermutns(String str, String str2) {
		
		// check if string is empty or null
		if (str.length() == 0) {
			System.out.println(str2 + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
		
			// ith character of str
			char ch = str.charAt(i);
			// Rest of the string after excluding
			// the ith character

			String str3 = str.substring(0, i) + str.substring(i + 1);
			// System.out.println(str.substring(i + 1));

			// Recursive call
			printallPermutns(str3, str2 + ch);
		
		}
//		printallPermutns("CAT", "")                                     1.
//		├── printallPermutns("AT", "C")
//		│   ├── printallPermutns("T", "CA")
//		│   │   └── printallPermutns("", "CAT")   Base Case
//		│   └── printallPermutns("A", "CT")
//		│       └── printallPermutns("", "CTA")   Base Case
//		├── printallPermutns("CT", "A")                                  2.
//		│   ├── printallPermutns("T", "AC")
//		│   │   └── printallPermutns("", "ACT")    Base Case
//		│   └── printallPermutns("C", "AT")
//		│       └── printallPermutns("", "ATC")    Base Case
//		└── printallPermutns("CA", "T")                                  3.
//		    ├── printallPermutns("A", "TC")
//		    │   └── printallPermutns("", "TCA")    Base Case
//		    └── printallPermutns("C", "TA")
//		        └── printallPermutns("", "TAC")   Base Case
		
	}

	// Driver code
	public static void main(String[] args) {
		String s = "CAT";
		printallPermutns(s, "");
	}
}
