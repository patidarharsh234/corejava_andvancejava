package i_o_stream_6B_Serialization_Deserializatio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObject {
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream file= new FileInputStream("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh3.txt");
		
		ObjectInputStream inputStream=new ObjectInputStream(file);
		
		Marksheet marksheet=(Marksheet) inputStream.readObject();
		
		
		System.out.println(marksheet.name);
		System.out.println(marksheet.Chemistry);
		System.out.println(marksheet.maths);
		System.out.println(marksheet.physics);
		inputStream.close();
		file.close();
	}

}
