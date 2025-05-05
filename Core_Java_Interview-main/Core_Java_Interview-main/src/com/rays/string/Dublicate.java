package com.rays.string;

public class Dublicate {

	public static void main(String[] args) {
		String str = "harshpatidar";
		str = str.toLowerCase();
		
		
		char[] ch = str.toCharArray();

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]&& ch[i] != 0) {
					count++;
					ch[j] = 0;

				}

			}

			if (count > 1 ) {
				System.out.println(ch[i]+"="+count);
			}
		}
	}

}
