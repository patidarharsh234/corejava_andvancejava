package com.rays.string;

public class StringMethodss {
	public static void main(String[] args) {
	String Value = "Harsh sing Patidar";

	
		int length = Value.length();
		char c = Value.charAt(6);
		int startIndex = Value.indexOf("P");
		int lastIndex = Value.lastIndexOf("a");
		String replace = Value.replace('a', 'A');
		String lowercase = Value.toLowerCase();
		String upercase = Value.toUpperCase();
		boolean startString = Value.startsWith("H");
		boolean endString=Value.endsWith("r");
		String substringBenginIndex = Value.substring(7);
		String concatString = " kadva";
		String trim = Value.trim();
		
		
		

		System.out.println("  String Length:- " + length);

		System.out.println("  the caracter of specified value is :- " + c);
		System.out.println("  Starting Index of given string:- " + startIndex);
		System.out.println("  Last position of ( a ) :- " + lastIndex);
		System.out.println("  ( a ) replaced by ( A ) :- " + replace);
		System.out.println("  Lower Name :- " + lowercase);
		System.out.println("  Upper Name :- " + upercase);
		System.out.println("  starting character :- " + startString);
		System.out.println(
				 "  string ki starting value se 7 character hata kr :- " + substringBenginIndex);
		
		System.out.println("  concat the string value :- " + Value.concat(concatString));
		System.out.println("  Write string to begning index to given end Endex-1 :-  " + "'"+Value.substring(11, 18)+"'" +"  ,diye gye ending index ko -1 se subctract kr finel ending index set krta he. ");
		System.out.println("  trim the value:-"+trim);

		String name = "Harsh patidar";
		String[] words = name.split(" ");
		for (String word : words) {
			System.out.print( word +" ");

		}
	}
}
