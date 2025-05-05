package com.in.log4j;


import org.apache.log4j.Logger;

public class Test_TestLog4j{
	public static void main(String[] args) {

		Logger log = Logger.getLogger(Test_TestLog4j.class);

		log.debug("This is Debug...!!");
		log.info("This is Info...!!");
		log.warn("This is Warn...!!");
		log.error("This is Error...!!");
		log.fatal("This is Fatal...!!");

		try {

			int i = 5/0;

			System.out.println("Division = " + i);

		} catch (RuntimeException e) {

			log.info("Arithmetic Error **=====", e);

		}
	}

}



