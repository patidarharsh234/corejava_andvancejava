package com.rays.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteratoruGetCollectionView {

	public static void main(String[] args) {
		HashMap m = new HashMap();

		m.put(1, "one");
		m.put(null, "two");
		m.put(null, null);
		m.put(400, "fourh");
		m.put(4, null);
		m.put(4, "hello");

		Set keyValue = m.entrySet();
		for (Object obj : keyValue) {
			Map.Entry kv = (Map.Entry) obj;
			System.out.println(kv.getKey() + "=" + kv.getValue());
		}

		
		Collection val = m.values();
		for (Object o : val) {

			System.out.println("Value: "+o);
		}
		
		
		Set key=m.keySet();
		for (Object o :key) {
			System.out.println("Key: "+o);
		}

	}

}