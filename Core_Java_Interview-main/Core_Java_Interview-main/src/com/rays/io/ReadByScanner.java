package com.rays.io;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader(
				"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\ReadConsole\\WriteInFile.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}

		file.close();
		sc.close();

	}

}