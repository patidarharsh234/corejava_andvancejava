package javaBasics_1C_StaticVsInstance_;

public class CoreBank {
	public void fundTrancFer() {                          //1
		System.out.println("fundtransfer succsecfull");
	}
	
	public void deposite(int amount) {                    //2
	     System.out.println("deposite amount"+amount);
	}
	
	public static void interest(int amount,int byajj) {    //3
		int interest=amount+byajj;
		System.out.println("interest total=="+ interest);
	}
	
	public static void max(int a, int b) {                        //4
		if (a<b) {
			System.out.println("a is greater");
			
		}else {
			System.out.println("b is greater");
		}
	}
		public int Sum(int a,int b) {                     //5
			int sums=a+b;
			System.out.println(sums);
			return sums;
		}
	}

