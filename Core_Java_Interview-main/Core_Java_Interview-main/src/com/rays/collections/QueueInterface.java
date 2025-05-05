package com.rays.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new PriorityQueue();
		// Queue queue1 = new LinkedList();
		queue.add(1000);
		queue.offer(30);
		queue.offer(20);
		queue.offer(190);
		System.out.println(queue);

		System.out.println("queue.element() : " + queue.element());
		System.out.println("queue.peek() : " + queue.peek());
		System.out.println("queue.poll() : " + queue.poll());// provide first and remove it
		System.out.println("queue.remove() : " + queue.remove());// provide first and remove it
		System.out.println(queue);
		System.out.println("queue.remove(200) : " + queue.remove(200));
		System.out.println(queue);
		System.out.println(queue);
	}
}
