package com.rays.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(500);
		s.add(600);

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
