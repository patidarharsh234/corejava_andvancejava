package com.rays.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualHashCodeTesttt {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "FA", 120);
		EqualHashCode e2 = new EqualHashCode(1, "EA", 120);
		EqualHashCode e3 = new EqualHashCode(1, "EA", 120);
		EqualHashCode e4 = new EqualHashCode(10, "kapil", 120);

		Set s = new HashSet();
		System.out.println("add the data");
		s.add(e1);
		s.add(e2);
		//s.add(e2);
		System.out.println(s);
		s.remove(e3);
		//s.add(e4);
		System.out.println(s);
		
	
	}

}
