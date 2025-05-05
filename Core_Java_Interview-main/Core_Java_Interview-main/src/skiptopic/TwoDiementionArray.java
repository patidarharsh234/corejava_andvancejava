package skiptopic;

public class TwoDiementionArray {

	//R:-row
	//C:-column
	
	public static void main(String[] args) {
//		                      R  C
		int[][] table=new int[4][3];
		                                                //[4]
		table[0][0]=0; table[0][1]=1; table[0][2]=2;    // 1
		
		table[1][0]=10; table[1][1]=11; table[1][2]=12; // 2
		
		table[2][0]=20; table[2][1]=21; table[2][2]=22; // 3
		
		table[3][0]=30; table[3][1]=31; table[3][2]=32; // 4
//[3]		  // 1           //  2             // 3    

		int row1_length=table[0].length;
		int row2_length=table[1].length;
		System.out.println("size="+table.length);
		System.out.println("row1_length[0]="+row1_length);
		System.out.println("row2_length[1]="+row2_length);
		
		
	//Another way to store values in an array attribute is by using an array.	
		int[][] table2 = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9},
			    {10, 11, 12}
			};
		
		System.out.println("size="+table2.length);
		
		
		
		//define separate column for particularly row index
		int[][] table3=new int[3][];
		 table3[0]=new int[2];
		 table3[1]=new int[3];
		 table3[2]=new int[4];
		 
		 int row_1_lenth= table3[0].length;
		 int row_2_lenth= table3[1].length;
		 int row_3_lenth= table3[2].length;
		 
		 System.out.println("size="+table3.length);
		 System.out.println("row_1_lenth="+row_1_lenth);
		 System.out.println("row_2_lenth="+row_2_lenth);
		 System.out.println("row_3_lenth="+row_3_lenth);
		
	}

	
	

}