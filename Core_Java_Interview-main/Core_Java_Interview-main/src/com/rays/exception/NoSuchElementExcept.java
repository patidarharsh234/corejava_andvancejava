package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExcept {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("mango");
		list.add("Banana");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		// Attempt to access next element when none exists
		try {
			System.out.println(iterator.next());
		} catch (NoSuchElementException e) {
			System.out.println(e);
			// e.printStackTrace();
		}
	}
}
