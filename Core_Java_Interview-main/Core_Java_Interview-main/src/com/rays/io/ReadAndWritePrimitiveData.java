package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {

	public static void main(String[] args) throws IOException {

		DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\DataOutPutStream\\WritePrimitemData.txt"));

		out.writeInt(10);
		out.writeFloat(2.2F);
		out.writeDouble(45.25);
		out.writeBoolean(true);
		out.writeChar('A');
		

		out.close();

		System.out.println("data added......");

		DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\DataOutPutStream\\WritePrimitemData.txt"));

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());
		System.out.println(in.readFloat());

		in.close();

	}

}
