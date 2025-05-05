package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {

	public static void main(String[] args) throws IOException  {

		FileWriter file = new FileWriter("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\ExitFileWriteLineByLine\\WriteLineByLine.txt", true);

		PrintWriter out = new PrintWriter(file);
        
		out.println("hello bhai");

		out.println("kkrh?? g* no bhai no");
 
		out.close();

		
		file.close();

		System.out.println("data write successfully...!!!");

	}

}
