package exerCise_corejava;

public class Average_of_consecutive_evenodd {

	public static void main(String[] args) {
		int even=0; 
	    int odd=0;
	    
		for(int i=0;i<=10;i=i+2) {
		even=even+i;
		System.out.println(i);
			}
         System.out.println(even);
         int evendiv=even/10;
         System.out.println("even" +evendiv);
	
	    
         
         
         
         for(int j=1;j<=10;j=j+2) {
	        odd=odd+j;	
	        System.out.println(j);
	          
	           }
	     System.out.println(odd);
	     
	     int odddiv=odd/10;
	    
	     System.out.println("odd" +evendiv);
	     
}
}	
