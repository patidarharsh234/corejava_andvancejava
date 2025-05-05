package com.rays.io;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class EmailReadWrite {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(
				"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\EmailFolder\\RedarEmailFile.txt"));
		PrintWriter out = new PrintWriter(new FileWriter(
				"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\EmailFolder\\RightCurectEmailFile.txt"));

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String line = in.readLine();
		while (line != null) {
			if (line.matches(emailreg)) {
				out.println(line);
			}

			line = in.readLine();
		}

		out.close();
		in.close();
	}
	
	
	
}