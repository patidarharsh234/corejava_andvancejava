package collection;

import java.util.SortedSet;
import java.util.TreeSet;


public class Sortedset_ChildofSet {
	public static void main(String[] args) {
		
	
	SortedSet s=new TreeSet(); //Element are automatically
                               //Sorted in ascending order	
	s.add(3);
	s.add(4);
	s.add(1);
	s.add(2);
	
	
	for(Object ele:s) {
		//System.out.println(ele);
	}
		
		System.out.println(s.first());
		
		System.out.println(s.last());
	}
	}

