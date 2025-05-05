package com.rays.io;

import java.io.Serializable;

public class StudentSerializable implements Serializable {

	transient int id;
	public String name;


	public StudentSerializable(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return ("id: " + id + " name: " + name + "");
	}

}
