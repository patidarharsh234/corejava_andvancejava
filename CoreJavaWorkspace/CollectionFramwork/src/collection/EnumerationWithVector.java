package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationWithVector {
	public static void main(String[] args) {
		
	

	
	Vector v= new Vector();
	v.add("one");
	v.add("two");
	v.add("three");
	
	 System.out.println(v);
	 
	 Enumeration v1=v.elements();
	 while (v1.hasMoreElements()) {
		Object obje = (Object) v1.nextElement();
		System.out.println(obje);
		
	}
	
	}
}
