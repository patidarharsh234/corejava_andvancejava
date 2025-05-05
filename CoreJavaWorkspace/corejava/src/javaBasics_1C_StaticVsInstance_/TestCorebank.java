package javaBasics_1C_StaticVsInstance_;

import javaBasics_1D_Argument_method.PrintAll_Define_method;

public class TestCorebank {public static void main(String[] args) {
	
	CoreBank.max(10, 30);
	CoreBank.interest(20, 40);
	
	
	CoreBank bank=new CoreBank();
	bank.deposite(20);
	bank.Sum(30, 50);
	
	
	PrintAll_Define_method.printAll(args);//printAll method test

}
}