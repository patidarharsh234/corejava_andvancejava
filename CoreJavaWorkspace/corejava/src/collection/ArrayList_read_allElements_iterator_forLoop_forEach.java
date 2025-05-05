package collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.source.tree.WhileLoopTree;

import in.co.basics.forloop;

public class ArrayList_read_allElements_iterator_forLoop_forEach {
	public static void main(String[] args) {
	
		
		
		ArrayList l= new ArrayList();
		l.add("one");
		l.add("two");
		l.add(3);
		l.add(4);
		l.add("oll"); 
		
		Integer i= new Integer(5);
		l.add(i);
		
		//typcasting
		Integer value= (Integer) l.get(3);
		System.out.println("index 5 value= " +value);
		
		
		
		for(int j=0;j<l.size();j++) {
			//System.out.println(j); // index value
			System.out.println(l.get(j)); // index
		}
		
		for (Object obj : l) {
			System.out.println(obj);
			
		}
		
	
		
		Iterator it= l.iterator();
		while(it.hasNext()) {
		
			Object obj=it.next();
			it.remove();            //remove all element but not given error
			System.out.println(obj);
		}
		

}
}