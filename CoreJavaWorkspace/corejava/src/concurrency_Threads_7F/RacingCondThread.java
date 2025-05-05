package concurrency_Threads_7F;

public class RacingCondThread extends Thread {
	public static Account data = new Account();

	String names = null;
	  
	
	  //int balance=0;
     //public RacingCondThread(String name,int balance){  //two person given  amount
	
	
	 public RacingCondThread(String name) {
                           //this.balance=balance;
		this.names = name;
		}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			  data.Deposite(names+"bro", 1000);
			                 //data.Deposite(names+"bro",200);
			                 //data.Deposite(names+"bro",balance);
		}

	}
}
