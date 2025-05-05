package com.rays.collections;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {

	public static void main(String[] args) {
		
		Set h = new HashSet();
		
		h.add(10);
		h.add(30);
		h.add(40);
		h.add(50);
		
		Set h1 =new HashSet();
		h1.add(1);
		h1.add(2);
		h1.add(40);
		
		System.out.println(h.add(60));
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(10));
		System.out.println(h);
		System.out.println(h.containsAll(h1));
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.remove(30));
		System.out.println(h);
		
		System.out.println(h.retainAll(h1));
		System.out.println(h);
		System.out.println(h.removeAll(h1));
		System.out.println(h);
		
		//h.clear();
		System.out.println(h);
	}
}
