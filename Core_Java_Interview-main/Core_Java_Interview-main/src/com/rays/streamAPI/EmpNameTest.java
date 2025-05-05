package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpNameTest {
	public static void main(String[] args) {
		List<Emp> l = new ArrayList();
		l.add(new Emp(1, "kapil"));
		l.add(new Emp(4, "raj"));
		l.add(new Emp(2, "paras"));
		l.add(new Emp(8, "jatin"));

		l.stream().sorted(Comparator.comparing(Emp::getName))
				.forEach(e -> System.out.println(e.getId() + " = " + e.getName()));

	}

}
