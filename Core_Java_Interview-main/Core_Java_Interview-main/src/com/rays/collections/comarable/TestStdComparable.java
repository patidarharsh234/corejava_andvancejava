package com.rays.collections.comarable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStdComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Student(4, "kapil"));
		list.add(new Student(2, "c"));
		list.add(new Student(3, "e"));
		list.add(new Student(1, "d"));

		Collections.sort(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}