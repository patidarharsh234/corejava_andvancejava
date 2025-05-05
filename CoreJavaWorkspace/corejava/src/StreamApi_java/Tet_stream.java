package StreamApi_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tet_stream {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("one","Two","five","Three","Three","ajay");
		
		Stream<String> s= list.stream();
		System.out.println("1============");
		
		s.forEach(e->{
			System.out.println(e);
			});
		System.out.println("2=============");
		
		list.stream().sorted().forEach(e->{
			System.out.println(e);
		});
		
	System.out.println("3===============");
    	list.stream().sorted().map(e->
		e.toUpperCase()).forEach(e->
		{
			System.out.println(e);
		});
		
		System.out.println("4==============");
		
		list.stream().filter(e->
		e.startsWith("T")).distinct()
		
		.map(e->e.toUpperCase()).sorted()
		
		.forEach(e->{
			System.out.println(e);
		});
		
				
		
		
		
	}

}
