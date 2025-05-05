package com.rays.thread;

import java.util.LinkedList;

public class B_Consumer implements Runnable {
	private final B_ShreadResources_ThradCommunicateWithEachOther shreadResources;

	public B_Consumer(B_ShreadResources_ThradCommunicateWithEachOther shreadResources) {
		this.shreadResources = shreadResources;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			shreadResources.consumer();

			try {
				Thread.sleep(1000); // Simulate time for consumption
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Consumer thread interrupted");
			}
	
		}
	}

}
