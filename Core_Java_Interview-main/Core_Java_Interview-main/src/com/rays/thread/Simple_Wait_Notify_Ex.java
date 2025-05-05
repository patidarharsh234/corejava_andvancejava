package com.rays.thread;

public class Simple_Wait_Notify_Ex {

	public static void main(String[] args) {

		final Object lock = new Object();

		// Thread 1 - waits
		Thread t1 = new Thread(() -> {
			synchronized (lock) {
				try {
					System.out.println("Thread 1: Waiting...");
					lock.wait(); // Thread 1 waits here
					
					System.out.println("Thread 1: Resumed!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Thread 2 - notifies
		Thread t2 = new Thread(() -> {
			synchronized (lock) {
				try {
					Thread.sleep(1000); // Make sure t1 starts first
					System.out.println("Thread 2: Notifying...");
					lock.notify(); // Thread 2 notifies
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
	}
}
