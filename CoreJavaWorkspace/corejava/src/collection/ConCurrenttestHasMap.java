package collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrenttestHasMap extends Thread{
	private static ConcurrentHashMap<String, Integer> hm=new ConcurrentHashMap<String,Integer>();
	
	public void run() {
		hm.put("four", 4);
		hm.put("five", 5);
	}
	
	public static void main(String[] args) {
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		
		ConCurrenttestHasMap t1=new ConCurrenttestHasMap();
		t1.start();
		for (Object obj : hm.entrySet()) {
			System.out.println(obj);
			System.out.println(hm);
		}
		
		System.out.println(hm);
	}
	

  }
