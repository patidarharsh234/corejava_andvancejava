package com.rays.string;

public class Practice {
	public static void main(String[] args) {

		/*
		 * String str = "hello"; System.out.println(str.indexOf('t')); }
		 */

		/*
		 * Since String is immutable and can not be changed when you call
		 * name.toUpperCase() it will create a new String "VIJAY" but old string ‘name’
		 * will not be changed.
		 * 
		 * If you want to print name in the upper case then you have to store the
		 * reference of new String in a variable then print that. Code will be written
		 * like
		 */
		String name = "hello";

		name.toUpperCase();
		System.out.println(name);

		String newName = name.toUpperCase();
		System.out.println(newName);
	}
}