package exerCise_corejava;

public class Arms_modulas_Preminder {

	public static void main(String[] args) {
		//modulas %= reminder//Armstrong no. ko nikalna ki vidhi
		int number=153;//Complete digit
		
		int r=0;//first quab 1 by one no. then
		int sum=0;// sum total no. krne pr 153 aa jayega
		int n=number;
		
		while(n>0) { r=n%10;
		             sum=sum+(r*r*r);
		             n=n/10;}
		         if(sum==number) {System.out.println("arm no.");}
		         else       {System.out.println("not arm");}
		        	 
		         
                     	
			        
		}
		
		

	}


