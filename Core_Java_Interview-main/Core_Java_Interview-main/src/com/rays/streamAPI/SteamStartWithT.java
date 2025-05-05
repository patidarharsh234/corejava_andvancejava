package com.rays.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SteamStartWithT {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("raj", "raj", "kb", "Kapil","Kcpil");

		list.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("K")).distinct().sorted()
				.forEach(System.out::println);
		
		
		
//		map(): Pehle sabhi elements ko uppercase mein convert karo.
//		filter(): Sirf un elements ko raho jo "T" se shuru hote hain.
//		distinct(): Duplicates ko hata do.
//		sorted(): Jo bache hue elements hain, unko alphabetically sort karo.
//		forEach(): Har sorted aur filtered element ko print karo.

	}

}
