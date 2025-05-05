package regexElimentGmailTest;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Email_Write {
	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh7Emailfile.txt");
		PrintWriter printWriter = new PrintWriter(writer);

		printWriter.println("harshp.23@gmail.com");
		printWriter.println("harsh1.234@gmai.com");
		printWriter.println("harsh2.234@gmail.com");
		printWriter.println("rahul.234@gmail.com");
		printWriter.println("ritik.234@gamil.com");
		printWriter.println("yash");
		printWriter.println("sanjay.@gamil.com");
		printWriter.println("hello.234@gmail.com");
		printWriter.println("anil@gmail.com");
		printWriter.println("ayay");
		printWriter.println("ovesh");
		printWriter.println("ovesh.234@gmail.com");

		/*
		 * i_o_StreamGemail g=new i_o_StreamGemail();
		 * 
		 * PrintWriter pWriter=new PrintWriter(g.gmail);{
		 * 
		 * pWriter.println(g.gmail);}
		 */

		// out.writeObject(g);
		/*
		 * out.writeObject(g); out.close(); file.close();
		 */
		System.out.println("DONE..!!!");
		writer.close();
		printWriter.close();
	}

}
