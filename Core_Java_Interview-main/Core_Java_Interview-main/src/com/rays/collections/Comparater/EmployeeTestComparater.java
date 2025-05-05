package com.rays.collections.Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTestComparater {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new Employee("kapil", 3, 2000));
		l.add(new Employee("a", 1, 1000));
		l.add(new Employee("b", 2, 3000));
		l.add(new Employee("c", 1, 5000));
		l.add(new Employee("a", 5, 2000));

		EmployeeShortByName byName = new EmployeeShortByName();

		Collections.sort(l, byName);

		System.out.println("ShortByName>>>");

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("________________________");

		EmployeeShortBySalary bySalary = new EmployeeShortBySalary();

		Collections.sort(l, bySalary);

		System.out.println("ShortBySalary>>>");

		Iterator i = l.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("________________________");

		EmployeeShortById byId = new EmployeeShortById();

		Collections.sort(l, byId);

		System.out.println("ShortById>>>");

		Iterator itt = l.iterator();
		while (itt.hasNext()) {
			System.out.println(itt.next());
		}
		System.out.println("________________________");

		EmployeeShortByIdName byIdName = new EmployeeShortByIdName();
		Collections.sort(l, byIdName);
		System.out.println("ShortByIdOrName>>>");
		Iterator itl = l.iterator();
		while (itl.hasNext()) {
			System.out.println(itl.next());
		}

		System.out.println("________________________");

		EmployeeShortByIdNameSalary byIdNameSalary = new EmployeeShortByIdNameSalary();
		Collections.sort(l, byIdNameSalary);
		System.out.println("ShortByIdNameSalary>>>");
		Iterator iti = l.iterator();
		while (iti.hasNext()) {
			System.out.println(iti.next());
		}
	}
}
