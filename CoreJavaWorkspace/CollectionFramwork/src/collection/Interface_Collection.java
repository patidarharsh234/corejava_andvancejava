package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Interface_Collection {
public static void main(String[] args) {
	Collection list= new ArrayList();
	list.add("one");
	list.add("two");
	list.add("three");
//	System.out.println(list);
	
	
	Collection c=new ArrayList();
	/*c.add("one");
	c.add("two");     //c.retainAll(list) jo value list me at is 
	c.add("three");*/   //C me bhi ho- na ak km na ak jada =true dega
	
	c.add(4);
	c.add(5);
	c.add(6);
	//System.out.println(c);
	
//list.addAll(c);
//System.out.println(list);
	
	
//list.clear();
//System.out.println(list);
	
	/*list.contains("one");                      // contains value bata ra  he to true
	c.contains(2);
	System.out.println(list.contains("one"));
	System.out.println(c.contains(2));*/
	
	
//System.out.println(list.containsAll(c));           // list me c value he ki nhi
	
//list.clear();
	
//list.isEmpty();                                //true and false aayega
//System.out.println(list.isEmpty());
	
	
//list.remove("two");                     //kisi ak value ko remove
//System.out.println(list);
	
//	System.out.println(list);  
//	list.removeAll(c);                   //list me se c ko remove kr diya
//	System.out.println(list);
	
//c.removeAll(c);
//System.out.println(c);
	
	
System.out.println(c.retainAll(list));// list or c dono me sem value ho to tru otherwise false
	
//list.size();
//System.out.println(list.size());
	
	
	
	
	
}

}
