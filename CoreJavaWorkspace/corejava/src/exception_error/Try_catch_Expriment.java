package exception_error;

public class Try_catch_Expriment {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		System.out.println("before Exeption!!");
		
		try {
			int c=a/b;
			System.out.println("Division="  +c);
			System.out.println("bina error pr try run karega");
			
			//try {
			//     int d=a+b;
			//	System.out.println("try ke andar try nhi chlega");
		//	}
			
		} catch (Exception e) {
			System.out.println("bina catch ke tray nhi chalega");
			
			System.out.println("in catch block(error aane pr catch chlega");
		}
		finally {
			System.out.println("jo code run karvana ho error ke bad bhi");
			System.out.println("yha vo coding karo jo run karvana ho jismen error na ho");
		}
		 
		System.out.println("after Exception");
	}
	}


