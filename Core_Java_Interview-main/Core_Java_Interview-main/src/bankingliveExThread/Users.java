package bankingliveExThread;

public class Users extends Thread {
   private BankAcount bankAccount;
   

   //Constructor Dependency injection through constructor:-mains taking object during the runtime of program
   public Users(BankAcount bankAccount) {
	this.bankAccount= bankAccount; 
   }
	
	public void run() {
		bankAccount.withdroal(250);
		
	}
	
}
