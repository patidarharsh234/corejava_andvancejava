package com.rays.javabasic;

public class FirstHigh {
	public static void main(String[] args) {
		int[] num = { 12, 54, 564, 45, 465, };
		int b = 0;

	for(int i=0;i<num.length;i++) {
		if(num[i]>b) {
			b=num[i];
		}
		
	}
	System.out.println(b);
	}

}
