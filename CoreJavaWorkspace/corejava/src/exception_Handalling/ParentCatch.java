package exception_Handalling;


public class ParentCatch {
	public static void main(String[] args) {
		String name="harsh";
		
		try {
			System.out.println("length of name is 5=" +name.length());
			System.out.println("index of name=" +name.charAt(7));
		}
			
		// catch (StringIndexOutOfBoundsException e) {
		//	System.out.println("name ki Length kam he");}
			
			catch(RuntimeException e){
				System.out.println("sundar sa name nahi he");
			}
			finally {
				System.out.println("me pandit hu");
			}
				
				
			
		
	
	}
}
