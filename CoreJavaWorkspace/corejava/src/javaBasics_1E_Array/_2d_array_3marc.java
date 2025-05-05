package javaBasics_1E_Array;

public class _2d_array_3marc {

	public static void main(String[] args) {
		int [][] table= new int[11][11];
		for(int i=0;i<=10;i++) {  //row ki length mean length mani jati he
			for(int j=1;j<=10;j++) {   /*colum ke size ko define kar ra 
				                           jitni value rakhenge utni value
				                               rakhega [j] me*/
				table[i][j]=i*j;
				
			System.out.print(i*j +"\t");
				//System.out.println(j);
			}
		System.out.println();	
		}
		//System.out.println(table[2][10]);
	}

}
