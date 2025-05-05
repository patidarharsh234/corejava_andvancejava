package regexElimentGmailTest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class i_o_StreamGemail implements Serializable{
	
	//String Gmailreg="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String gmail = null;
	

	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(gmail);
		
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String Emailreg="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		gmail=(String) in.readObject();
		
		Pattern patttern=Pattern.compile(Emailreg);
		
			 Matcher matcher=patttern.matcher((CharSequence)gmail);
			 System.out.println(gmail+" "+matcher.matches());
		
		
		
	}
	
	
	

}
