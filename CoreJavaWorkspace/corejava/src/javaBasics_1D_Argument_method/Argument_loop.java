package javaBasics_1D_Argument_method;

public class Argument_loop {

	public static void main(String[] args) {
		for(int i=0;i< args.length;i++) {
			
			System.out.println(args[i]);
			
		}
		System.out.println(args[0]+args[1]+args[2]);
		System.out.println("hello" +args[0]+args[1]+args[2]);	}

}
