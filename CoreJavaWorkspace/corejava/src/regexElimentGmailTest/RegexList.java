package regexElimentGmailTest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;





public class RegexList {
	public static void main(String[] args) {
		List email=new ArrayList();
		
		email.add("0harspatidar.234edgf@gmail.com");
		
		
		email.add("harshpatidar");
		
		String regex= "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern patttern=Pattern.compile(regex);
		
		for (Object emails : email) {
		
			 Matcher matcher=patttern.matcher((CharSequence) emails);
			 System.out.println(emails +" "+matcher.matches());
			
		}
	}

}
