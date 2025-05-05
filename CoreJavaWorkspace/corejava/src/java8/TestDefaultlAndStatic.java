package java8;

public class TestDefaultlAndStatic  {
	public static void main(String[] args) {
		//static methods
		DefaultAndStatic.multi();
		
		//default methods
		DefaultAndStatic defa=new DefaultAndStatic() {
			
		};
		defa.sum();
		
	
		 
		//override method
		DefaultChlid tChlid=new DefaultChlid(); 
		tChlid.sum();
	
		
	}

}
