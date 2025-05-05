package i_o_Stream_Exterlizable_6D;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Employee_objWrite {
	public static void main(String[] args) throws Exception {
		FileOutputStream file= new FileOutputStream("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh6Exterlizable.txt");
		ObjectOutputStream writ=new ObjectOutputStream(file);
		
		
		Employee e= new Employee();
		e.firstname="harsh";
		e.firstname="patidar";
		
		e.lastname="patidar";
		e.id="12harsh";
		e.Salary=2000;
		
		writ.writeObject(e);
		writ.close();
		file.close();
		
	}
}
