package com.rays.streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctElement {
	public static void main(String[] args) {
		
	
	
	Collection<String> c=Arrays.asList("a","b","c","d","a","b","c");
	
	List<String> l=c.stream().distinct().collect(Collectors.toList());
	System.out.println(l); //come only unique element.
	
	
      Stream l2=c.stream().distinct();
      System.out.println(l2);
	}
}
