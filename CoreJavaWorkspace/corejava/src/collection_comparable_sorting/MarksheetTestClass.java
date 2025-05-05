package collection_comparable_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MarksheetTestClass {
	public static void main(String[] args) {
		
		
		
		ArrayList list=new ArrayList();
		list.add(new Marksheet("hritik", "1"));
		list.add(new Marksheet("shali", "2"));
		list.add(new Marksheet("rahul", "5"));
		System.out.println(list);
		
		Collections.sort(list);
		for (Object obj : list) {
			System.out.println(obj);
		
		}

//comparable me yhi dikt he ki kitne hi bar arraylist bana kr Marksheetobject ko sort karaoge to jo class me  method me diya usi attribute se sort karega.
		ArrayList list2=new ArrayList();
		
		list2.add(new Marksheet("harsh", "1"));
		list2.add(new Marksheet("sanjay", "4"));
		list2.add(new Marksheet("sourabh", "1"));

			Collections.sort(list2);
		for (Object obj : list2) {
			System.out.println(obj);
		
		}
		
	}

}
