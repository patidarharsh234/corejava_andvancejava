package com.rays.thread;

import java.util.LinkedList;

public class B_Produser implements Runnable {

	private final B_ShreadResources_ThradCommunicateWithEachOther shreadResources;

	public B_Produser(B_ShreadResources_ThradCommunicateWithEachOther shreadResources) {
		this.shreadResources = shreadResources;
	}

	@Override
	public void run() {
		int value = 0;
		while (true) {
			System.out.println(Thread.currentThread().getName());
			shreadResources.produse(value++);

			try {
				Thread.sleep(500); // Simulate time for production
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("producer thread interrupted");
			}

		}

	}
}
