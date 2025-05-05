package com.rays.skiptopic;

public class ThreeDiementionArray {
	//D:-depth
	//R:-Row
	//C:-column
	
	
	public static void main(String[] args) {
		
	
//	                        D   R  C           
	int[][][] table=new int[2] [3] [4];
	
	System.out.println("table length:-"+table.length);              //index:-0,1
	
	System.out.println("table row_ 1 length:-"+table[0].length);    //index:-0,1,2
	
	System.out.println("table colum 1 length:-"+table[0][0].length);//index::-0,1,2,3
	System.out.println("_______________________________");
	System.out.println(" ");
	
//Part 1:-value assign manually.
	
	// Depth 0  // Row:-3    //Column:-4
	table[0][0][0] = 1; table[0][0][1] = 2; table[0][0][2] = 3; table[0][0][3] = 4;  // R:-1
	table[0][1][0] = 5; table[0][1][1] = 6; table[0][1][2] = 7; table[0][1][3] = 8;   // R:-2
    table[0][2][0] = 9; table[0][2][1] = 10; table[0][2][2] = 11; table[0][2][3] = 12;// R:-3
//       C:-1                C:-2                  C:-3                C:-4
	
	
	// Depth 1
	table[1][0][0] = 13; table[1][0][1] = 14; table[1][0][2] = 15; table[1][0][3] = 16;
	table[1][1][0] = 17; table[1][1][1] = 18; table[1][1][2] = 19; table[1][1][3] = 20;
	table[1][2][0] = 21; table[1][2][1] = 22; table[1][2][2] = 23; table[1][2][3] = 24;
	
	
	
	
	
//part 2:-assign the value with help of loop	
	int value = 1;

	for (int i = 0; i < table.length; i++) {        // Depth
		System.out.println("Depth_Index="+i + "  (DepthLength=="+table.length+")");
		 System.out.println(" ");
		
	    for (int j = 0; j < table[i].length; j++) { // Row
	    	System.out.println("Row_Index="+j+"   (ROWLength__table["+i+"].length=="+table[i].length+")");
	    	
	    	
	    	
	        for (int k = 0; k < table[i][j].length; k++) { // Column
	        	    if(k==0) {
	        	    	System.out.println("CoulmLength__table["+i+"]"+"["+j+"]=="+table[i][j].length);
	        	    }
	              
	        	    
	            table[i][j][k] = value;
	            value++;
	            System.out.print("Colum_Index="+k+"   ");
	            System.out.println("table["+i+"]"+"["+j+"]"+"["+k+"]=="+value);
	       
	        }
	        System.out.println(" ");
	    }
	    
	    System.out.println(" ");
	   
	}
     
	
	
	
//part 3:-assign the value with help of { } curly brackets.
//    D   R  C           
int[][][] table2= {
		
		{
			
		 {1,2,3,4},
		 {5,6,7,8},
		 {9,10,11,12}
		 
		 },
		
		
		{
		  {13,14,15,16},
		  {17,18,19,20},
		  {21,22,23,24}
		  
	     }
		 
    };


	
	
	}

}
