package exception_Handalling;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		
	   String name="vijay";
	 // String name=null;
	try { 
		System.out.println("length of name is=" +name.length());
		System.out.println("character is= "+ name.charAt(6));
		
		
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("String abhi choti he");
	}catch (NullPointerException e) {
		System.out.println("sundar sa name nahi he");
		//e.printStackTrace();
	}
		
	finally {
			System.out.println("le bho***");
		}
		

	}
	
	

	}
