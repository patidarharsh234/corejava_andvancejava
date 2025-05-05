package com.rays.bankingLiveExPrecti;

public class AtmMashin {

	public static void main(String[] args) {
		BankAcount bankNumber = new BankAcount();
		
		//user access to withdrawal from different atms at the same time.
		Users user1 = new Users(bankNumber);//user used check in the bank at the same time.
		
		Users user2 = new Users(bankNumber);//user used  check in the bank  at the same time.
	
		Users user3 = new Users(bankNumber);//user used  check in the bank  at the same time.
		
		Users user4 = new Users(bankNumber);//user used  cAtm at the same time.

		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
