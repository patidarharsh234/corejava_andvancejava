package com.rays.thread;

public class TestThread extends Thread {

	private String name;

	public TestThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		TestThread t1 = new TestThread("Harsh");
		TestThread t2 = new TestThread("YASH");

		t1.start();
		t2.start();

	}

}