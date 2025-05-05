package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFromKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter(
				"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\ReadConsole\\WriteInFile.txt",
				true);

		System.out.println("Enter text here (type 'exit' to stop):");

		String str = br.readLine();
		
		while (str != null && !str.equalsIgnoreCase("exit")) {
			fw.write(str + System.lineSeparator()); // Add a newline after each line
			System.out.println("You entered: " + str);
			str = br.readLine();
		}

		// Close resources
		fw.flush(); // Ensure all buffered data is written to the file
		fw.close(); // Close FileWriter
		br.close(); // Close BufferedReader

		System.out.println("File writing completed successfully!");
	}
}
