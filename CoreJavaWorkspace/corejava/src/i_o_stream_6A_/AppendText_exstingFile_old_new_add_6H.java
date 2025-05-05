package i_o_stream_6A_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class AppendText_exstingFile_old_new_add_6H {
	public static void main(String[] args) throws IOException {
		FileWriter input=new FileWriter("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh2.txt",true);
		FileOutputStream output=new FileOutputStream("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\img.jpg",true);
		
		
		input.write("i am fine and you\n");
		input.write("chla ja \n");       //new add krna purana  kare 
		
		input.close();
		
		System.out.println("asdfghjkkkkkkkkjhgf");

	}
	
	}


