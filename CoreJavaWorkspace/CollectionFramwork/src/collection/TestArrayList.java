package collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
	for(int i=10;i<=20;i++) {
			list.add("number" +i);
			System.out.println("number="+i);
		}
			System.out.println(list.get(5));
			for(Object object:list) {
				
				System.out.print(object); // foreach loop
				
			}
			
		}
	}


