package oop_3F_callConstructotToConstru;

public class TestClass {
	public static void main(String[] args) {
		//Person p= new Person("harsh","patidar");
		Person p1= new Person("harsh","patidar","bholaram");
		System.out.println(p1.getAddress());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		}

}
