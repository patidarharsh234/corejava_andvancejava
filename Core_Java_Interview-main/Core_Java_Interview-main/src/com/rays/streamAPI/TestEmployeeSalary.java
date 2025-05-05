package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// salary >= 20000
public class TestEmployeeSalary {

	public static void main(String[] args) {

		
	
		
		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();

		list.add(new EmployeeSalary(20000, "Harsh"));
		list.add(new EmployeeSalary(25000, "Harsh"));
		list.add(new EmployeeSalary(22000, "Hritik"));
		list.add(new EmployeeSalary(522, "Rahul"));
		list.add(new EmployeeSalary(600, "subham"));
		
		

		
		list.stream()
		.distinct()
		.filter(c -> (c.getSalary() >= 20000))
		.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

	}

}
