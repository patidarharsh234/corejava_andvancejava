package com.rays.thread;

public class B_ShreadResources_ThradCommunicateWithEachOther {

	private int value;
	private boolean available = false;

	public synchronized void produse(int value) {
		while (available) {
			try {
				System.out.println("wating for consumer to calling the notify...!!!");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("produser intrrupted..!!");
			}
		}

		this.value = value;
		System.out.println("produser :" + value);
		available = true; // Mark the value as available
		System.out.println("produser notify is called..!! ");
		notify(); // Notify the consumer
	}

	public synchronized int consumer() {
		while (!available) {
			try {
				System.out.println("Wating for produser to calling the notify..!!!");
				wait(); // Wait until the producer produces a value
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Consumer Intrrupted..!!");
			}

		}
		System.out.println("Consumed: " + value);
		available = false; // Mark the value as consumed'
		System.out.println("consumer notify is called...!!");
		notify(); // Notify the producer
		return value;
	}

}
