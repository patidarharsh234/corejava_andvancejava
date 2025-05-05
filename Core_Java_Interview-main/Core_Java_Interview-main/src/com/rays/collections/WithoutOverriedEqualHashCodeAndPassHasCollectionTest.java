package com.rays.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WithoutOverriedEqualHashCodeAndPassHasCollectionTest {
public static void main(String[] args) {
	

	
	WithoutOverriedEqualHashCodeAndPassHasCollection d1=new WithoutOverriedEqualHashCodeAndPassHasCollection(1, "harsh", 2000);
	WithoutOverriedEqualHashCodeAndPassHasCollection d2=new WithoutOverriedEqualHashCodeAndPassHasCollection(1, "harsh", 2000);
	
	
	
	
	System.out.println(d1.equals(d2));
	System.out.println(d1.hashCode()==d2.hashCode());
	//default equal() method and hashCode() check references note the object.
	
	HashSet s=new HashSet();// hr object ki equal and hashcode method ka use kr duplicate check krne ke liye ak flow banaya hashcollection me.

	s.add(d1);
	s.add(d2);
	s.add(100);//100 is integer class object : integer class me equal and hashcode methdo implement he 
	s.add(100);
	
	System.out.println(s.equals(s));
	System.out.println(s.hashCode());
	System.out.println(s);
	
	
	HashMap m=new HashMap();
	m.put(d1, 1);
	m.put(d2, 2);
	m.put("FB", 3);
	m.put("FB", 3);
	m.put("Ea", 3);
	

	System.out.println(m.hashCode());
	System.out.println(m.equals(m));
	System.out.println(m);
	
	
	
	
	
	
	String s1=new String("harsh");
	String s2=new String("harsh");//its take memory references note the value so value are same then indicate same memory address.
	System.out.println(s1.equals(s2));//check character only in the string class.
	
	if(s1.hashCode()==s2.hashCode()) {
		if(s1.equals(s2)) {
			System.out.println("duplicate value (object)");
		}
	}
	
	
}
	
}
