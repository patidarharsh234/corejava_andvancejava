package com.rays.oop;

public class ExplicitTest extends Explicit { // super.ki help se call na karoge to compile time error dega
	// kahega pleas implicit super constructor because Explicit default constructor
	// ke liye undefined he(yani hamari parent class default constructor ke liye nhi
	// bana. )

	

	public ExplicitTest(String name) {
		super(name);
	}

	public static void main(String[] args) {
		ExplicitTest e = new ExplicitTest("Harsh");
	}

}
