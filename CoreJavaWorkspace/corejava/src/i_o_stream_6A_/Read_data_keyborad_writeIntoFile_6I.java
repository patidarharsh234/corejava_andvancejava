package i_o_stream_6A_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Read_data_keyborad_writeIntoFile_6I {
	public static void main(String[] args) throws IOException {
		InputStreamReader isreadre = new InputStreamReader(System.in);
	
		BufferedReader in=new BufferedReader(isreadre);
		
		PrintWriter out=new PrintWriter(new FileWriter("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh4.txt",true));
		
		String line=in.readLine();
		
		while (!line.equals("quit")) {
			out.println(line);
			line=in.readLine();
			
		}
		out.close();
		in.close();
	}

}
