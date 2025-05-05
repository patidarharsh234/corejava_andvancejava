package concurrency_Threads_7F;

public class Account {

	private int balance = 0;

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
		}

		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
		}
		this.balance = balance;
	}
	
   // public void Deposite(String mSg,int amu) {                 //racing condition
	public synchronized void Deposite(String mSg, int amu) {     //solution for racing condition

		int total = getBalance() + amu;
		setBalance(total);
		System.out.println(mSg+ " new balance " + getBalance());
	}

	public synchronized void Whithdrawal(String msg, int amu) {

		int total = getBalance() - amu;
		setBalance(total);
		System.out.println(msg + " " + getBalance());
	}

}
