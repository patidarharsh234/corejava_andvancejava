package exception_error;

public class Try_CatchExeption {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		System.out.println("before Exeption!!");
		
		try {
			int c=a/b;
			System.out.println("Division="  +c);
			
		} catch (Exception e) {
			
			System.out.println("in catch block");
		}
		finally {
			System.out.println("jo code run karvana ho error ke bad");
		}
		 
		System.out.println("after Exception");
	}

}
