package colloection_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import in.co.basics.For_Each_loop;

public class MarksheetComparatorTest {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(new Marksheet("harsh", "1"));
		list.add(new Marksheet("sanjay", "4"));
		list.add(new Marksheet("sourabh", "1"));
		list.add(new Marksheet("hritik", "1"));
		System.out.println(list);
		
		orderByname name=new orderByname();
		Collections.sort(list, name);


		for (Object obje : list) {
		System.out.println(obje);
		
		}
		
		ArrayList list2=new ArrayList();
		
		list2.add(new Marksheet("harsh", "1"));
		list2.add(new Marksheet("sanjay", "4"));
		list2.add(new Marksheet("sourabh", "1"));
		list2.add(new Marksheet("hritik", "1"));

	orderByrollno rollno=new orderByrollno();
		Collections.sort(list2, rollno);
	
	for (Object obje : list2) {
		System.out.println(obje);
		
		}
		
	
	}

}
