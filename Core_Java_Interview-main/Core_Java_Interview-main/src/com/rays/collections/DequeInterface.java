package com.rays.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque dequ = new ArrayDeque();
		//Deque dequ1 = new LinkedList();
		
		dequ.offer(200);
		dequ.offer(200);
		dequ.offer(300);
		dequ.offer(20);
		dequ.offer(500);
		dequ.offer("harsh");
		dequ.push(300);
		
		System.out.println(dequ);
		
		dequ.addLast(400);
		System.out.println();
		
	
		
		
	//	System.out.println("dequ.offerFirst(1000) : "+dequ.offerFirst(1000));
		//System.out.println(dequ);
		System.out.println("dequ.getFirst() : "+dequ.getFirst());
		System.out.println("dequ.peek() : "+dequ.peek());
		System.out.println(dequ);

		System.out.println("dequ.poll() : "+dequ.poll());//provide first and remove it 
		System.out.println(dequ);
		System.out.println("dequ.pop() : "+dequ.pop());//provide first and remove it 
		System.out.println(dequ);
		System.out.println("dequ.pollFirst() : "+dequ.pollFirst());
		System.out.println(dequ);
	

		
	}

}