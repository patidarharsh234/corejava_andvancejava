package com.rays.collections.comarable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("comareTo in comparable run");

		if (this.name.equals(o.name)) {

			return this.id - o.id; // runtime given :- (0,plush digit (1),subsctract digit(-1)

		} else {

			return this.name.compareTo(o.name); 

		}
		//Ascending order
		
//		if (this.salary == o.salary) {
//			return 0;
//		} else if (this.salary > o.salary) {
//			return 1;
//		} else {
//			return -1;
//		}
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

}
