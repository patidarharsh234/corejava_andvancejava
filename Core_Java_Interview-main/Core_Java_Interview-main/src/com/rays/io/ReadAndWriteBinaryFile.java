package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\Om prakash Patidar\\Downloads\\_8dc68306-4c68-4b4e-bb8a-679af8a3e6e0.jpeg";
	//	String source = "C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\ImageReadWrite\\photo.txt";
		String target = "C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\ImageReadWrite\\PhotoWriteOtherFolder1.jpg";
	
 
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
          
         
	
 
		
		int i;
		
		while ((i=in.read())  != -1) {
			 
			out.write(i);

		}

		System.out.println("success");
	}

}
