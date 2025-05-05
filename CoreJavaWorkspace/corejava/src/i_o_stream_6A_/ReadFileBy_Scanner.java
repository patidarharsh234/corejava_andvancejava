package i_o_stream_6A_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileBy_Scanner {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh2.txt");
		Scanner sc= new Scanner(fileReader);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		
	fileReader.close();
}

}
