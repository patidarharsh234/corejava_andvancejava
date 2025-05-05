package com.rays.thread;


public class B_TestConsuProd {

	public static void main(String[] args) {
		B_ShreadResources_ThradCommunicateWithEachOther shreadResources = new B_ShreadResources_ThradCommunicateWithEachOther();

		B_Produser producer = new B_Produser(shreadResources);
		B_Consumer consumer = new B_Consumer(shreadResources);

		Thread t1 = new Thread(producer, "Produser THread");
		Thread t2 = new Thread(consumer, "consumer THREAD");

		t1.start();
		t2.start();

		//Stables connection with the help of constructor injection
		//value attribute are work increment(producer Thread) and print(consumer Thread) same object.
		//when thread switch then it cannot contend old data of producer or consumer methods. 
		//Like producer method run inside thread and available = true; change ho gyi but it switch the thread at this point
		//and ages comes into producer  method then available = false; 
		//thread work continuously without switching then its hold the value.
	}

}
