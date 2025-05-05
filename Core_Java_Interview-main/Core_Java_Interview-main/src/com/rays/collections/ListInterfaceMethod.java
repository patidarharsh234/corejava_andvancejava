package com.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethod {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(10);
		list.add(30);
		list.add(30);
		list.add(30);
		
		                   list.add(40);
		System.out.println(list.get(2));//o/p :- 30
		
		list.set(2, 50);       //30 replace to 50
		System.out.println(list);//o/p :- [10, 30, 100, 30, 40]
		
		System.out.println(list.indexOf(30));//o/p :- 1
		System.out.println(list.lastIndexOf(30));// o/p :- 3
		System.out.println(list.subList(1, 3)); //o/p :- [30, 100]
		
		System.out.println(list.remove(4));//o/p :-[10, 30, 100, 30]
	}

}
