package i_o_stream_6A_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File_LineByLine {
	public static void main(String[] args) throws IOException {
		FileReader fileReader= new FileReader("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh.txt");
		BufferedReader readline_in=new BufferedReader(fileReader);
		
		String line=readline_in.readLine();
		
		while (line!=null) {
			System.out.println(line);
			line=readline_in.readLine();
			
		}
		readline_in.close();
	}

}
