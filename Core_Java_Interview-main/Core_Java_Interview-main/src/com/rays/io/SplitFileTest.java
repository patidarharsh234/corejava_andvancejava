package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileTest {

	public static void main(String[] args) throws IOException {

		// 1. To count no of line of file
		String s = "C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\SplitFile\\RedarFile.txt";
		int tNol = 0;
		int nol = 2;
		
		//count total number of line.
		File file = new File(s);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			sc.nextLine();
			tNol++;

		}

		System.out.println("No of line  " + tNol);

		
		// 2. To create no of file
		int tNof = tNol / nol;
		int rem = tNol % nol;

		if (rem != 0) {
			tNof++;
		}
		System.out.println("No of files... " + tNof);

		// 3. here we read file data
		BufferedReader br = new BufferedReader(new FileReader(s));

		String str;

		// 4. here we create files nof
		for (int i = 1; i <= tNof; i++) {
			System.out.println("file No:" + i);
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\SplitFile\\SplitAndWriteFiles"
							+ i + ".txt"));

			// 5. here we write nol in files
			for (int j = 1; j <= nol; j++) {
				
				str = br.readLine();
				
				if (str != null) {
					
					bw.write(str);
					//bw.write("_____hello :"+j);

					// str = br.readLine();

					// 6. here we check if j not = nol then we write data to new line
					if (j != nol) {
						System.out.println("print new line");
						bw.newLine();

					}
				}
			}
			bw.close();

		}
		br.close();
	}

}
