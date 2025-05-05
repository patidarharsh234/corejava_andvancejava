package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

public class SynchronizeCollection {
	public static void main(String[] args) {
		Collection c= new ArrayList();
		Collection C1=Collections.synchronizedCollection(c);
		c.add("one");
		c.add("two");
		c.add("three");
		
		List L=new LinkedList();
		List L1=Collections.synchronizedList(L);
		
		
		Set S=new TreeSet();
		Set S1=Collections.synchronizedSet(S);
		
		SortedSet So=new TreeSet();     //ThreeSet(sortedSet)
		SortedSet So1=Collections.synchronizedSortedSet(So);
		
		Map M=new HashMap();   
		Map M1=Collections.synchronizedMap(M);
		
		Map TM=new TreeMap();//TreeMap(sortedMap)
		TreeMap TM2= (TreeMap) Collections.synchronizedMap(TM);
	
		//historical =vector /HashTable
		
	}

}
