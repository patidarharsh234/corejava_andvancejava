package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class CalanderGetAge {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate givenDate=LocalDate.of(2000,01,01);
		
		Period getAge=Period.between(today, givenDate);
		System.out.println(getAge.getYears());
	}

}
