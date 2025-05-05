package i_o_stream_6A_;

import java.io.FileReader;
import java.io.IOException;

public class Try_With_resources {
	public static void main(String[] args) throws IOException{
		try(FileReader readss=new FileReader("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh.txt")){
				
				readss.read();
				
				int i=readss.read();
				while (i!=-1) {
					System.out.print((char)i);
					System.out.println(i);
					i=readss.read();
				}
	}
	
	}
}
