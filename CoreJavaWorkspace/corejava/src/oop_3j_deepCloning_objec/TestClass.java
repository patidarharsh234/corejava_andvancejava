package oop_3j_deepCloning_objec;

public class TestClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1=new Customer("harsh");
		Customer c2=(Customer)c1.clone();
		c2.name="patidar";
		System.out.println(c1.account);
		c2.account.balance=20;
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}


}
