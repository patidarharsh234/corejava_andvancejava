package opp_3A_Condition;

public class Account_ExpertClass {
	private String number=null;
	private String accountType =null;
	private double balance=3000;
	
	public void setnumber(String num) {
		number=num;
	}
	public String getnumber() {
		return number;
	}
	public void setaccountType(String acco) {
		accountType=acco;
	}
	public String getaccountType() {
		return accountType;
	}
	
	
	
	public void setBalance(double bal) {
		balance=bal;
		if(bal>=2000) {
			System.out.println("balance sufficient");
		}
		else {
			System.out.println("your mony less then 2000 you can't withdrawal the mony" );
		}
		
	}
	
	
	
	public double getBalance() {
		return balance;
		
	}
	
	
	public void deposit(double depoamount) {
		double total=getBalance()+depoamount;
		setBalance(total);
		System.out.println("balance after deposit=" +total );
}
	
		public void WhithDrawal(double withDralamount) {
			double Subtractamount=getBalance()-withDralamount;
			setBalance(Subtractamount);
			System.out.println("balance after withdrawal=  " + Subtractamount);
}
  

		
}




