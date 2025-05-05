package com.rays.collections.Comparater;

import java.util.Comparator;

public class EmployeeShortById implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("comparatore interface run compare methoda ");
//		if (o1.getId() == o2.getId()) {
//			return 0;
//		} else if (o1.getId() > o2.getId()) {
//			return 1;
//		}else {
//			return -1;
//		}
		 return o2.getId() - o1.getId();//Desc order
	}
}
