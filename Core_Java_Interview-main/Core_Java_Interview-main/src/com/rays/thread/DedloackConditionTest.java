package com.rays.thread;

public class DedloackConditionTest {

	
	// Two locks (shared resources)
	static final Object lock1 = new Object();
	static final Object lock2 = new Object();

	public static void main(String[] args) { //main thread
		// Thread 1
		Thread t1 = new Thread(() -> { //current thread
			synchronized (lock1) {   //normal class ki method ko synchronized kar ke monitor dete the object ko
				                     //but yha directly monitor provide kar diya object ko.
				System.out.println("Thread 1: Holding lock1...");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				System.out.println("Thread 1: Waiting for lock2...");
				synchronized (lock2) {
					System.out.println("Thread 1: Acquired lock2!");
				}
			}
		});

		// Thread 2
		Thread t2 = new Thread(() -> { //current thread
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock2...");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				System.out.println("Thread 2: Waiting for lock1...");
				synchronized (lock1) {
					System.out.println("Thread 2: Acquired lock1!");
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();
	}
}
