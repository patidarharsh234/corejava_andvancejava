package com.rays.oop;

public class DogChildOfAnimal extends Animal {
	
	public DogChildOfAnimal(int a) {
		super(a);
		System.out.println("chiled constructor"+a);
	}

	
	public void sound() {
		System.out.println("this is dog");
	}

	
	
	public static void main(String[] args) {
		Animal a = new DogChildOfAnimal(20000);
		a.sound();
		
		Animal a1 = new Animal(10);
		a1.sound();
		
		DogChildOfAnimal a3=new DogChildOfAnimal(30);
		a3.sound();
	

	}
}
