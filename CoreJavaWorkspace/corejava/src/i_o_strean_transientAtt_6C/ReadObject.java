package i_o_strean_transientAtt_6C;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObject {
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream file= new FileInputStream("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh5Transient.txt");
		
		ObjectInputStream inputStream=new ObjectInputStream(file);
		
		Marksheet marksheet=(Marksheet) inputStream.readObject();
		
		
		System.out.println(marksheet.name);
		System.out.println(marksheet.Chemistry);
		System.out.println(marksheet.maths);
		System.out.println(marksheet.physics);
		System.out.println(marksheet.total);
		
		inputStream.close();
		file.close();
	}

}
