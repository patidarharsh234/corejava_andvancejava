package opp_3A_Condition;

public class AccountTest_obj {
	public static void main(String[] args) {
		Account_ExpertClass acEx= new Account_ExpertClass();
		
	/*	acEx.setaccountType("Sbi");
		acEx.getaccountType();
		System.out.println(acEx.getaccountType());
		
		acEx.setnumber("7747967076");
		acEx.getnumber();
		System.out.println(acEx.getnumber());*/
		
	
		//acEx.setBalance();
		//acEx.getBalance();
		//System.out.println(acEx.getBalance());
		
		
		acEx.WhithDrawal(1000);
		acEx.deposit(2000);
		acEx.getBalance();
		System.out.println(acEx.getBalance());
		
	}

}
