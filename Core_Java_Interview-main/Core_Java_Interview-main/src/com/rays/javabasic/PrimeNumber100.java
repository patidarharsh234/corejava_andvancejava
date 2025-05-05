package com.rays.javabasic;

public  class PrimeNumber100 {

	public static void main(String[] args) {

		for (int no = 1; no <= 100; no++) {
			int temp = 0;
                                                //   System.out.println("outerloo============="+no);
			for (int i = 2; i < no; i++) {
				                                //   System.out.println("inerloop="+i);
				if (no % i == 0) {
					temp ++;
				}
			}

			if (temp == 0)

				System.out.println("prime number : " + no);
		}
	}

}
