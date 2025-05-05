package i_o_stream_6A_;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToNewFile_directlysavenewfiletext_6E {
	public static void main(String[] args) throws IOException {
	FileWriter out=new FileWriter("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh2.txt");
	out.write('A');
	out.write('\n');
	out.write("hello how are you\n");
	out.write("chl aacha he ab\n"); // new text file bana kr 
	out.write("ab kya he\n");         // jo print  kar re vo save ho jayega 
	out.close();
	System.out.println("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh2.txt");
	
	}

}
