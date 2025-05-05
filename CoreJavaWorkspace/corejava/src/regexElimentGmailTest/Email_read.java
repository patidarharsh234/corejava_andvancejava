package regexElimentGmailTest;

import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_read {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh7Emailfile.txt");
		Scanner scanner = new Scanner(file);

		String Ema = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$";

//		String s = scanner.nextLine();
//		System.out.println(s);
		

		while (scanner.hasNextLine()) {
			
		String	s = scanner.nextLine();
			//System.out.println(s);
			
			if (s.matches(Ema)) {
				
				System.out.println(s);
			}
			
		}

		file.close();
	scanner.close();
	}

}


//Pattern patttern=Pattern.compile(Ema);
//
//	 Matcher matcher=patttern.matcher((CharSequence)s);
// System.out.println(s+" "+matcher.matches());

