package com.rays.thread;

public class TestJoinWithThread {

	public static void main(String[] args) {

		JoinThread t1 = new JoinThread("Harsh");

		JoinThread t2 = new JoinThread("Yash");

		System.out.println("Main/current thread: " + Thread.currentThread().getName());
		
		t1.start(); // Start t1 first
        
   

		try {
			t1.join(); //main thread waits here for t1 to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main/current thread : again gets the same monitor and starts execution ");

		t2.start(); // Start t2 after t1 completes

	}

}