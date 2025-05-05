package i_o_Stream_Exterlizable_6D;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeObj_Read {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh6Exterlizable.txt");

		ObjectInputStream read = new ObjectInputStream(file);

		Employee e = (Employee) read.readObject();

		System.out.println(e.firstname);
		System.out.println(e.lastname);
		System.out.println(e.id);
		System.out.println(e.Salary);

		read.close();
		file.close();
	}

}
