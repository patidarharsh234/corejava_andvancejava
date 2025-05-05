package com.rays.javabasic;

public class SecondHig {

	public static void main(String[] args) {
		int[] num = { 1, 5, 8, 6, 10,15,25,01,30 };

		int tempFirstLarg = 0;
		int countSecoundLarg = 0;
	//	int countThreed=0;
		

		for (int i = 0; i < num.length; i++) {
			
			if (num[i]>tempFirstLarg) {
			//	countThreed=countSecoundLarg;
				countSecoundLarg = tempFirstLarg;
				tempFirstLarg = num[i];

			}

			//tempFirstLarg > num[i] : use because 1. first if run ho to secound if na ho  2. ye hoga to tempFirstLarg largest or countSecoundLarg seam hoga .  
			if (num[i]>countSecoundLarg && num[i]<tempFirstLarg) {
				//countThreed=countSecoundLarg;
				countSecoundLarg = num[i];
                
			}
			
//			if(num[i]>countThreed && num[i]<countSecoundLarg) {
//				countThreed=num[i];
//			}
			
			
			
		}
        System.out.println(tempFirstLarg);
		System.out.println(countSecoundLarg);
	//	System.out.println(countThreed);
		
	}

}
