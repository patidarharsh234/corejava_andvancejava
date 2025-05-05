package exception_error;

public class BalanceException extends Exception{
	
	private double balance;
	
	
	
	public BalanceException() {
		super("insuffisent Balance");
		
	}
	
	public void setWhithDrawal(int amount) {
		double total=balance-amount;
		
		if(total>2000) {
		
			System.out.println("balance sufficent");
		}else {
			//throw new BalanceException ();
			try {
				throw new BalanceException ();
				
			} catch (BalanceException e) {
				
				e.printStackTrace();}
			}
		balance=total;
		
			}
	
	public void setDeposite(double deposite) {
		double add =balance+deposite;
		if(add>2000) {
			
			System.out.println("balance sufficent");
			
		}else {
			//throw new BalanceException ();
			try {
				throw new BalanceException ();
				
			} catch (BalanceException e) {
				
				e.printStackTrace();}
			}
			balance=add;
			if(add>2000) {
				System.out.println(getBalance());
			}
			
			}
	
	public double getBalance() {
		System.out.println("Balance is =" +balance);
		return balance;
	}

}
