package javaBasics_1D_Argument_method;

public class HelloAllcom_if_elsefor {
	public static void main(String[] args) {
		int size=args.length;
		
		if (size==0) {
			System.out.println("java:useg hello all na n2 n3..is blank plz fill");
			
		}else {
			for(int i=0;i<size;i++) {
				System.out.println(i+""+args[i]);
			}
		}
	}

}
