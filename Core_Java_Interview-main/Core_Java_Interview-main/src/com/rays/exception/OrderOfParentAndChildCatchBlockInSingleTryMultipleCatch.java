package com.rays.exception;

public class OrderOfParentAndChildCatchBlockInSingleTryMultipleCatch {
	
	public static void main(String[] args) {
		try {
			int i=10/0;
			String s=null;
			System.out.println(s.length());
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(RuntimeException r) {
			System.out.println(r);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
