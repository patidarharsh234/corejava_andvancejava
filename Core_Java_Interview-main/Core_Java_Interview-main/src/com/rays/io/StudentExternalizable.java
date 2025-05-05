package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StudentExternalizable implements Externalizable {

	transient int id;
	public String name;
     //When Java deserializes an object using the Externalizable interface:
	//It first creates an object using the no-arg (default) constructor.
    //Then it calls readExternal() to populate the object's fields.
	//If you don’t provide a public no-arg constructor, the JVM will throw an InvalidClassException(no valid constructor) during deserialization.
	public StudentExternalizable() {
		// TODO Auto-generated constructor stub
	}

	public StudentExternalizable(int id, String name) {

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
	public void writeExternal(ObjectOutput out) throws IOException {
             
		out.writeObject(name);
		out.writeInt(id);
		System.out.println("WriteExternal");

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		id = in.readInt();
		System.out.println("readExternal");

	}

}
