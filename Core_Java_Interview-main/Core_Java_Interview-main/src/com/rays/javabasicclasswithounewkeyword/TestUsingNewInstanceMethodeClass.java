package com.rays.javabasicclasswithounewkeyword;

public class TestUsingNewInstanceMethodeClass {
	public static void main(String[] args) throws Exception {
		try {
			// Use the fully qualified name of ExampleClass if necessary
			Class<?> loadClass = Class.forName("com.rays.javabasicclasswithounewkeyword.UsingNewInstanceMethodeClass");
			UsingNewInstanceMethodeClass getInstance = (UsingNewInstanceMethodeClass) loadClass.getDeclaredConstructor().newInstance();
			getInstance.display();

		} catch (Exception e1) {
			// Use original exception as the cause
			Exception e = new Exception("Class not found...!!!", e1);
			throw e;

		}
	}
}
