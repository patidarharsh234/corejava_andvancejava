package javaBasics_1E_Array;

public class _3D_array {
	public static void main(String[] args) {
		int [][][] table=new int[2][3][4];
		table[0][1][1]=1;
		table[0][1][2]=2;
		table[0][1][3]=3;
	//	table[0][1][4]=4;
		
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				for(int k=0;k<table.length;k++) {
					table[i][j][k]=i*j*k;
					System.out.print(i*j*k+"\t");
				}
			}
		}
	}

}
