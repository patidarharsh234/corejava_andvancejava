package com.rays.collections;

import java.util.*;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e = new EqualHashCode(100, "FB", 500);
		EqualHashCode e1 = new EqualHashCode(100, "Ea", 500);
		EqualHashCode e2 = new EqualHashCode(100, "Harsh", 500);
		EqualHashCode e3 = new EqualHashCode(100, "Harsh", 500);

		// Remove me sab me equal method run hoti he..
		System.out.println("---------LIST----------------");

		List l = new ArrayList();
		System.out.println("befour add in list");
		l.add(e2);//hashcode 
		l.add(e);//hashcode
		l.add(e1);//hashcode & equal
		
		l.add(e3); //Es point pr equal method false hoti to hascode and equal show hoti but yha dono  ni chli
		System.out.println("after adding in List  :" + l);

		System.out.println("befour removing List...");
		l.remove(e3);// hascode run because object are already available in hash set.
	 // l.remove(e1);//hascode & equal bouth because object diffrent but hashcode and vale are same.
		System.out.println("after removing in List :" + l);

		System.out.println("---------SET----------------");
		Set s = new HashSet();
		System.out.println("before add the data in set..");
		s.add(e);
		s.add(e1);
		s.add(e2);
		System.out.println("after add in set :" + s);

		System.out.println("before remove the data in set...");
		s.remove(e2);// add nhi kiya he ye object but eska hash code and equal method seam he e and
						// e1 se.
		System.out.println("after remove in set" + s);

		System.out.println("--------------MAP------------");
		Map m = new HashMap();
		System.out.println("befour add the data in MAP...");
		m.put(e, 1);
		m.put(e1, 2);
		m.put(e2, 3);
		System.out.println("after add In map.." + m);

		System.out.println("before removing data in MAP...");
		m.remove(e3);
		System.out.println("Remove in map" + m);
	}
}
