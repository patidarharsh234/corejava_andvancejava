package com.rays.javabasicclasswithounewkeyword;

import java.lang.reflect.Constructor;

public class TestUsingConstructor {
	
	public static void main(String[] args) throws Exception {
		try {
			// Use the fully qualified name of ExampleClass if necessary
			Constructor<UsingConstructor> constructor = UsingConstructor.class.getConstructor();
			UsingConstructor getClass = constructor.newInstance();
			getClass.display();

		} catch (Exception e1) {
			// Use original exception as the cause
			Exception e = new Exception("Class not found...!!!", e1);
			throw e;

		}
	}

}
