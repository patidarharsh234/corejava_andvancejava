package i_o_stream_6A_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData_LineByLine_6F {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh4.txt");
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		for(int i=0;i<5;i++) {
			printWriter.println(i+":line\n"); //purana format hata kr new formate add
			printWriter.println(i+"aa guru\n");
		}
		printWriter.close();
		fileWriter.close();
	
		
	}
	

}
