                        package com.rays.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInterfaceConcrietClass {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");
		
		

		
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.get(5));
		System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("d"));
		
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
	 

		TreeMap t = new TreeMap();

		t.put(1, null);
		t.put(2, null);
		t.put(500, "prs");
		t.put(4, "dp");
		t.put(5, "e");
	
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
		

		System.out.println("==============================================");

		LinkedHashMap l = new LinkedHashMap();
		l.put(1, null);
		l.put(2, "jtn");
		l.put("harsh", "indore");
		l.put(3, "kpail");
		l.put(5, "raj");
		
		


		System.out.println(l.get(2));
		System.out.println(l.containsKey(3));
		System.out.println(l.containsValue("kgn"));
		System.out.println(l.entrySet());
		System.out.println(l.keySet());
		System.out.println(l.values());
	
	}

}
