package com.rays.thread;

public class A_PrinterThread extends Thread {

	private A_StorageClass_MonitorObject storage;

	public A_PrinterThread(A_StorageClass_MonitorObject storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print the value=" + storage.getValue());
		}
	}

}
