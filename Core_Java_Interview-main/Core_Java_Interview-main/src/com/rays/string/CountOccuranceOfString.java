package com.rays.string;

public class CountOccuranceOfString {

	public static void main(String[] args) {
		String name = "kapil dudhe";
		StringBuffer sb=new StringBuffer("Harsh Patidar");
	    
		
		
		int count = 0;
		for (char a = 'a'; a <= 'z'; a++) {
			for (int i = 0; i < sb.length(); i++) {
				if (a == sb.charAt(i)) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(a +"="+count);
				count = 0;
			}
		}
	}

}
