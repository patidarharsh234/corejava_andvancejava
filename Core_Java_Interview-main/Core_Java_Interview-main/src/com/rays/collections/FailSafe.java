package com.rays.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(1);
		v.add('b');
		v.add('c');
		v.add('d');
		v.add('e');

		Enumeration e = v.elements();

		v.add(100);
		v.remove(2);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}
		

		//----------------------------------------------------------------------------------	
		

		ArrayBlockingQueue l = new ArrayBlockingQueue(7); // Exception Not raise
		l.add(1);
		l.add(3);
		l.add(2);

		Iterator it = l.iterator(); // Fail-safe
		l.add(5);
		l.add("abc");

		l.add(4); // Here we cannot add or remove elements when list object
	//	l.clear(); // Here we clear
		while (it.hasNext()) {

			System.out.println(it.next());
			 it.remove(); //remove list elements

		}

	}

}