package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {

	public static void main(String[] args) {

		List<ContestWinner> l = new ArrayList<ContestWinner>();
		l.add(new ContestWinner("kapil", "8966012549"));
		l.add(new ContestWinner("raj", "124946655"));
		l.add(new ContestWinner("naman", "124965498"));
		l.add(new ContestWinner("vks", "65154488485"));

		l.stream().map(e -> e.getName() + " " + e.getPhoneNo()).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(2).forEach(c -> System.out.println(c));
	

	}

}
