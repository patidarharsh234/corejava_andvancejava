package com.rays.streamAPI;

import java.util.Arrays;
import java.util.List;

public class OddEven {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 4, 5, 87, 9);
		l.stream()
		.distinct()
		.forEach(c -> {
			if (c % 2 == 0) {
				System.out.println(c + "even");
			} else {
				System.out.println(c + "odd");
			}
		});
	}

}
