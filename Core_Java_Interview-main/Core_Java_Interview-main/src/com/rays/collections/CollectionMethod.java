package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionMethod {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(60);
		
		Collection c1=new ArrayList();
		c1.add(50);
		c1.add(60);
		c1.add(70);
		c1.add(30);
		
		
//		c1.add(c);
//		System.out.println(c1);//o/p->[50, 60, 70, [10, 20, 30, 40]]

		System.out.println(c);
	
		c.addAll(c1);
		System.out.println(c); //o/p->[10,20,30,40,50,60,70]
		
		System.out.println("Contains : "+c.contains(10)); //true
		System.out.println("contains all : "+c.containsAll(c1)); //true
		
		
		System.out.println(c.size());// 7 (c+c1)
		System.out.println(c.isEmpty());//false

		System.out.println(c.remove(20));//true
		System.out.println(c);//o/p->[10, 20, 30, 40, 50, 70]
		System.out.println(c.removeAll(c1));//true
	//	System.out.println(c.retainAll(c1));
		System.out.println(c);//o/p->[20, 30, 40]
		
		c.clear();//->[]
		System.out.println(c);
		System.out.println(c1);
		   
	}
}
