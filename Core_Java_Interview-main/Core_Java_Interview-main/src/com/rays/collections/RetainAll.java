package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(30);
		c1.add(40);

		Collection c2 = new ArrayList();

		c2.add(40);
		c2.add(30);
		c2.add('c');
		c2.add('d');

		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

		c1.retainAll(c2);

		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

	}

}