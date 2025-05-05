package exception_programerDefineExc;

public class TestClass {
	public static void main(String[] args) throws Loginexception {
	
	
	String loginId="admin";
	
	
	if(loginId.equals("admins")){
		System.out.println("user is valid");
	}
	else {// throw new Loginexception(); // (directly jvm me error ko dega
		
		
		try {
			throw new Loginexception();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//or
			System.out.println(e);
			//or
			e.printStackTrace(); //jvm type error format
			//or
			System.out.println("oh no its rong");
			//or
			
		}
		
	}
}

}
