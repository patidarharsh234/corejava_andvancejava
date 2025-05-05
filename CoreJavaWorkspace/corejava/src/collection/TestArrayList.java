package collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add("two");
		Integer size=list.size();
		
		for(int j=0;j<size;j++) {
			System.out.println(list.get(j));
			Object o=list.get(j);
			System.out.println(o);
			System.out.println(o.toString());
		}
		
		
		
		
	for(int i=10;i<=20;i++) {
			list.add(i);
			//yha 10 se start he loop but index 10 ko 0 hi consider karega 
			System.out.println(i+"j ke index no pr value="+i);
		}
	
	
			System.out.println("list index of 5 value="+list.get(5));//index 5 per value=15
			
			
			
			for(Object object:list) {
				
				System.out.print(object+"\t"); // foreach loop
				
			}
			
		}
	}


