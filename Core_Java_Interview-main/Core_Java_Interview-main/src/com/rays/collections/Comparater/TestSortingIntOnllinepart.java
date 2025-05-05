package com.rays.collections.Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSortingIntOnllinepart {
	public static void main(String[] args) {
		
		Comparator<String> c=new Comparator<String>() {

			@Override
			public int compare(String i, String j) {
				if(i.length()%10>j.length()%10) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		
		
		ArrayList list=new ArrayList();
		list.add("har");
		list.add("harsh");
		list.add("h");
		list.add("yash");
		list.add("patidatr");
		
		Collections.sort(list,c);
		
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
