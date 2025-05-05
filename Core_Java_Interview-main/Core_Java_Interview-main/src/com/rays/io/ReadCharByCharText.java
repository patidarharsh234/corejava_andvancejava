package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader(
				"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\ReadConsole\\WriteInFile.txt");

		int i = file.read();
		
		while (i != -1) {
			
			
			System.out.print((char) i);
			//System.out.print(" : "+i+",");
			
			i = file.read();

		}

		file.close();

	}

}
