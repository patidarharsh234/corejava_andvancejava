package oop_3I_shallowCloning;

public class TestClass {public static void main(String[] args) throws CloneNotSupportedException {
	
	Account a1=new Account();
	
	a1.setBalance(10);
	
	/*Account a2=a1;
	a2.setBalance(20);
	a1.getBalance();
	a2.getBalance();
	System.out.println(a1.getBalance());
	System.out.println(a2.getBalance());*/
	
	// clone method ke bad
	Account a2=(Account)a1.clone();
	a2.setBalance(20);
	a2.getBalance();
	System.out.println(a1.getBalance());
	System.out.println(a2.getBalance());
	
	
	 Account a3=(Account)a2.clone();
	 a3.setBalance(30);
	 System.out.println(a3.getBalance());
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
	
	
}

}
