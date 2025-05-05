package i_o_strean_transientAtt_6C;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh5Transient.txt");
		
		ObjectOutput out= new ObjectOutputStream(file);
		
		Marksheet m=new Marksheet();
		m.name="ram";
		m.physics=89;
		m.maths=88;
		m.Chemistry=67;
		m.total=m.Chemistry+m.physics+m.maths;
		
		out.writeObject(m);
		out.close();
		file.close();
	}

}
