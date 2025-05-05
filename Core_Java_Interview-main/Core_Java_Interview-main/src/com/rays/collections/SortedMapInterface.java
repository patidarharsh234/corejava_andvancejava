package com.rays.collections;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMapInterface {
	
	public static void main(String[] args) {
		SortedMap s=new TreeMap();
		s.put(1, "one");
		s.put(2, "two");
		s.put(5, "three");
		s.put(6, "one");
		s.put(4, "one");
		
		System.out.println(s);
		System.out.println(s.firstKey());
		System.out.println(s.lastKey());
		System.out.println(s.tailMap(4));
		System.out.println(s.headMap(5));
		System.out.println(s.entrySet());
		System.out.println(s.subMap(2, 5));
		
	}

}
