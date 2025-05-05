package javaBasics_1D_Argument_method;

public class PrintAll_Define_method {

	public static void main(String[] args) {
//		use this method for passing args in other class or package (printAll)
		printAll(args);
		}
	
	
	public static void printAll(String[]args) {
			for (int i=0;i<args.length;i++){
			System.out.println("hello"+args[i]);
				
		}
    
	}
	
	
}
