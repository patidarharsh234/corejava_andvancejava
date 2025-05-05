package com.rays.javabasicclasswithounewkeyword;

public class TestConing {
	public static void main(String[] args) throws CloneNotSupportedException {
		UsingCloning u=new UsingCloning();
		
		UsingCloning u2=(UsingCloning)u.clone();
		u2.display();
		
	}

}
