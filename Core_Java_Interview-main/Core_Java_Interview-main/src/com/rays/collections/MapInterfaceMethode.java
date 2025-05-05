package com.rays.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceMethode {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "a");
		map.put("2", "b");
		map.put(5, "c");
		map.put(4, "d");
		
		
		Map map1 = new HashMap();
		map.put("1", "Harsh");
	System.out.println(map);
		
	
		
//Basic Operation
		
		System.out.println(map.get("2"));//o/p : b
		System.out.println(map.size());// 4
		System.out.println(map.isEmpty());//false
		System.out.println(map.containsKey(3));// true
		System.out.println(map.containsValue("d"));// true
		System.out.println(map.remove(1));// a (remove valu :- c)
		
		System.out.println(map);//o/p : {1=a, 1=Harsh, 2=b, 4=d}

//Method to get collection View.
		Set ent=map.entrySet();
		Set key=map.keySet();
		Collection value=map.values();
		
		System.out.println(ent);//o/p : [1=a, 1=Harsh, 2=b, 4=d]
		System.out.println(key);// o/p : [1, 1, 2, 4]		
		System.out.println(value);// o/p : [a, Harsh, b, d]
		
//Bulk Operations
		map.putAll(map1);
		System.out.println(map);// o/p : {1=a, 1=Harsh, 2=b, 4=d}
	
		map.clear();
		System.out.println(map);// o/p : {}
		System.out.println(map1); // o/p : {}
		
		
	}

}
