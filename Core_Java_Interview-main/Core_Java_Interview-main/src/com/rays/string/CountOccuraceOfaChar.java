package com.rays.string;

public class CountOccuraceOfaChar {

	public static void main(String[] args) {
		String name = "kapil dudhe";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			String m = String.valueOf(name.charAt(i));

			if (m.matches("d")) {
				count++;
			}

		}
		System.out.println("d:" + count);
	}

}
