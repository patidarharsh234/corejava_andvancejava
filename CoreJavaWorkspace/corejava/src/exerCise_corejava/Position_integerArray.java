package exerCise_corejava;


public class Position_integerArray {
	public static void main(String[] args) {
		int  n=50;
		int []t={100,75,50,25,1};
		int i=t[0];
		
		for(int j=0;j<t.length;j++) {
			if (t[j]==n) {
				System.out.println(t[j]+"index position of"+j);
				i=t[j]-t[j];
				}
			if (t[j]<i) {
				            i=t[j];
			 if (i<n) {
					 System.out.println("-1");
					   i=i-i;
		                                           //i=t[j]-t[j];
	                                               //i=i-t[j];   // yha t[j] ki value i ki value ke barabr he
					}
			}
		}	
	}
}
		

	



