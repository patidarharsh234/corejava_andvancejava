package com.rays.collections.Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmpId {
	public static void main(String[] args) {

		//Directly Implement-->comparator.
//	Comparator<Employee> c=new Comparator<Employee>(){
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			if(o1.getSalary()>o2.getSalary()) {
//				return 1;
//			}else {
//				return -1;
//			}
//		}
//	};
		
		List l = new ArrayList();

		l.add(new Employee("d", 3, 2000));
		l.add(new Employee("kapil", 1, 1000));
		l.add(new Employee("b", 2, 3000));
		l.add(new Employee("c", 1, 5000));
		l.add(new Employee("a", 5, 2000));
		
	

		EmployeeShortById eid = new EmployeeShortById();
		Collections.sort(l, eid);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
