package com.rays.oop.shellowclonig_notcopyotherclassrefres;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		// implement na krne pr clonebale ko exception:
		// java.lang.CloneNotSupportedException

		ShelloClloningAddress addres1 = new ShelloClloningAddress("Indore", "India");

		ShelloCllowningPerson person1 = new ShelloCllowningPerson("harsh", addres1);

		ShelloCllowningPerson person2 = (ShelloCllowningPerson) person1.clone();
		person2.name = "patidar";
		person2.address.city = "bhopal";
		System.out.println(person1.name);
		System.out.println(person1.address.city);
		System.out.println(person2.name);
		System.out.println(person2.address.city);

	}
}