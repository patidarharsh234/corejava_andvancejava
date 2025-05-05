 package com.rays.thread;

public class JoinThread extends Thread {

	String name = null;

	public JoinThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		  System.out.println("Thread t1: " + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i + " = " + name);
		}
	}
}