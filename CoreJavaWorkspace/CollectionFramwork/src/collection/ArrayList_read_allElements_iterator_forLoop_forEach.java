package collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.source.tree.WhileLoopTree;

public class ArrayList_read_allElements_iterator_forLoop_forEach {
	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add("oll");             
		
		
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
			
			System.out.println(obj);
		}
		

}
}