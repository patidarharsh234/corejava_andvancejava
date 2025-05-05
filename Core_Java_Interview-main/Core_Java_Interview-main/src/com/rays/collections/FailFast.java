package com.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(3);
		l.add(2);

	
	
	
		Iterator it = l.iterator();	 //Fail-Fast	
//		l.add(5);
		
		
//        l.add(4);    // Here we cannot add or remove elements when list object
//        l.clear();   // Here we clear
		while (it.hasNext()) {
			
		System.out.println(it.next());	
		//it.remove();  //remove list elements
		
		
		}
		
		
		
	//listIterator not given cuncurrencyException  but   its work only List(methods:-listIterator add(value),remove()) .
	//FailFast	 :-its failFast 
		
/*		ListIterator its = l.listIterator();
		while (its.hasNext()) {
		
			Object value=its.next();
			
			System.out.println(value);
			
			
			if(value.equals(1)) {
				its.remove();
			}
			
			if(value.equals(2)) {
				its.add("yesh");
			}
					
		}*/
		
		
		
		
		System.out.println(l);
	
		
	}
}
