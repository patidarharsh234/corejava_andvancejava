package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		HashMap map= new HashMap();
		map.put("0", "Zero");
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "six");
		map.put("1","five" );
		System.out.println(map);
		
		
		int Size =map.size();
		
		String val=(String)map.get("1");
		System.out.println(map.get("1"));
		
		map.remove("2");
		
		boolean flag=map.containsKey("1");
		flag=map.containsKey("3");
		System.out.println(map.containsKey("3"));
		
		Set keys= map.entrySet();
		for(Object k:keys) {
			System.out.println(k);
		}
		Collection values=map.values();
		System.out.println(values);
		Set keyValues=map.entrySet();
		System.out.println(keyValues);
		
	}

}
