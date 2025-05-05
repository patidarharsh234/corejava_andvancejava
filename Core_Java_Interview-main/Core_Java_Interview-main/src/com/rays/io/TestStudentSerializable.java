package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(20, " Harsh");

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\serializable\\serializable.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\serializable\\serializable.txt"));

		s = (StudentSerializable) in.readObject();

		System.out.println(s.getId());
		System.out.println(s.getName());

	}

}
