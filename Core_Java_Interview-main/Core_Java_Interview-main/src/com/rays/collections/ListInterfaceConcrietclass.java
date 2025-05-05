package com.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceConcrietclass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(500); 
		list.add(400);

		System.out.println(list);
		
		
		System.out.println(list.get(2));
		System.out.println(list.hashCode());
		System.out.println(list.indexOf(200));
		System.out.println(list.subList(0, 2));
		System.out.println(list.lastIndexOf(400));
		
		

		System.out.println("=====================================");

		
		
		
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(50);
		l.add(40);
		
		
		
		l.offer(20);
		l.offerFirst(120);
		l.offerLast(150);
		l.addFirst(112);
		l.addLast(113);
		System.out.println(l);
		
	
		System.out.println(l.element());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.peek() + "pekkkk");
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		l.pollFirst();
		l.pollLast();
		System.out.println(l);
	
		
		
		
		
		
		

		

		System.out.println(l);
	
	

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

		Stack s = new Stack();

		s.push(1);
		s.push(9);
		s.push(3);
		s.push(40);
		s.push(5);
		
		s.pop();
		System.out.println(s);
		System.out.println(s.peek()+"guggg");
		System.out.println("index of object="+s.search(40));
		System.out.println(s.empty());

		System.out.println(s + "endddddddddd");
		System.out.println("=========+++++++++++++++++++++=====================");
		
		 

		Vector v = new Vector();
		v.add(50);
		v.add(100);
		v.add(150);
		v.add(200);

		System.out.println(v.elementAt(2));
		System.out.println(v.subList(1, 3));
		System.out.println(v.hashCode());
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		
	}

}
