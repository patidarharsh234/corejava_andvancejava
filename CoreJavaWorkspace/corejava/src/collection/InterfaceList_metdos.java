package collection;

import java.util.LinkedList;
import java.util.List;


public class InterfaceList_metdos {
	
	public static void main(String[] args) {
		List l=new LinkedList();
		l.add(11);
		l.add(12);
		l.add(15);
		l.add(13);
		l.add(15);
		System.out.println(l);
		
     //	l.add(3, 4);
	//	System.out.println(l);
		
	//	l.get(4);
	//	System.out.println(l.get(4));
		
	//	l.remove(3);
	//	System.out.println(l);
		
	//	l.set(2, 6);
	//	System.out.println(l);
		
	   // l.indexOf(3);
		System.out.println(l.indexOf(15)); // value kon se index pr he
		
		l.lastIndexOf(1);
		System.out.println(l.lastIndexOf(15));//last se 15 value kon se index pr he
		
		
		l.subList(0, 4);
		System.out.println(l.subList(0, 4));
		
		
	}

}
