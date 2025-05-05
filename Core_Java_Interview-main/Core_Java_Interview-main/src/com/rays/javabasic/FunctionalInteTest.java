package com.rays.javabasic;

public class FunctionalInteTest {
	
	public static void main(String[] args) {
		FunctionalInte f=new FunctionalInte() {
			
			@Override
			public int sum(int a, int b) {
				
				return a+b;
			}
		};
		int a=10;
		int b=20;
		System.out.println(f.sum(a, b));
		
		f.sub(a, b);
		
		FunctionalInte.multi(a, b);
	}
	

}
