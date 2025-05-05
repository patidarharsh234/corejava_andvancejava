package com.rays.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceConcriet {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(100);
		h.add(100);
		h.add(10);
		h.add(20);

		System.out.println(h.contains(100));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.remove(100));

		System.out.println(h);
		
	
		
		System.out.println("====================================");

		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(20);
		t.add(5);
		System.out.println(t);
		
		

		System.out.println(t.contains(10)); // true
		System.out.println(t.ceiling(10));//o/p : 20
		System.out.println(t.first());  // 5
		System.out.println(t.pollFirst()); // 5
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.size());
//		Iterator it = t.iterator();
//        while (it.hasNext()) {
//            System.out.println("========"+it.next());
//        }
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

		LinkedHashSet l = new LinkedHashSet();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(null);

		System.out.println(l.contains(2));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.remove(4));
		System.out.println(l);
		System.out.println(l.hashCode());
		System.out.println(l.toArray());
		
		System.out.println(l);
		
		 
	}
}
