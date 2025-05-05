package com.rays.bankingLiveExPrecti;

public class BankAcount {
	
	private int balance=1000;
	
	
	public synchronized void withdroal(int ammount) {
		if(balance>=ammount) {
			
			System.out.println(Thread.currentThread().getName()+" is withdrall amount="+ammount);
			balance -=ammount;
			System.out.println(Thread.currentThread().getName()+" balance is="+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+" insuficieant balace");
		}
	}

}
