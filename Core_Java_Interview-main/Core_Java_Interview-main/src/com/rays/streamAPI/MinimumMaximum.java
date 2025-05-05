package com.rays.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MinimumMaximum {
	public static void main(String[] args) {
		int[] i = { 10, 12, 45, 25, 23 };
	
		Arrays.stream(i)
		.min()
		.ifPresent(e -> System.out.println("MiniMum=" + e));
		
	}

}
