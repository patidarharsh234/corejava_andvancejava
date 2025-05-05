package com.rays.oop;

public class ShellowClonigPrimitevTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		ShellowClonigPrimitev s = new ShellowClonigPrimitev();
		s.balance = 100;

		ShellowClonigPrimitev s2 =(ShellowClonigPrimitev) s.clone();
		s2.balance = 200;
		System.out.println(s.balance);
		System.out.println(s2.balance);
	}

}
