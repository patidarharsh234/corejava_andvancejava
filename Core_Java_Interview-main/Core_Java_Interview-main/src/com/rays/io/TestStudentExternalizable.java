package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StudentExternalizable s = new StudentExternalizable(10, "kapil");

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\Externalizable\\Externalizable.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\Externalizable\\Externalizable.txt"));

		s = (StudentExternalizable) in.readObject();
//
//		// System.out.println(s);
//		System.out.println(s.getId());
//		System.out.println(s.getName());

		out.close();
		in.close();

	}

}
