package com.rays.thread;



public class A_CounterThread extends Thread {

	private A_StorageClass_MonitorObject storage;
	private int counter = 0;

	public A_CounterThread(A_StorageClass_MonitorObject storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			counter++;

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			storage.setValue(counter);
		}
	}
}
