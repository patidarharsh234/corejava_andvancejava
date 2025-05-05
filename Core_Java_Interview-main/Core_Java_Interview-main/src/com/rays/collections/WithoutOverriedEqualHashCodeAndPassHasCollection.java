package com.rays.collections;

public class WithoutOverriedEqualHashCodeAndPassHasCollection {
	int id;
	String name;
	int salary;

	public WithoutOverriedEqualHashCodeAndPassHasCollection(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		String s = this.id + " " + this.name+" " + this.salary;
		return s;
	}
}
