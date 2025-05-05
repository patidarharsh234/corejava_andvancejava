package com.rays.thread;

public class C_DiningPhilosophersProblem {
	
	  public static void main(String[] args) {
	        int numPhilosophers = 5;
	        C_DeadlockDiningPhilosophers diningPhilosophers = new C_DeadlockDiningPhilosophers(numPhilosophers);

	        Thread[] threads = new Thread[numPhilosophers];
	        for (int i = 0; i < numPhilosophers; i++) {
	            threads[i] = new Thread(new C_Philosopher(i, diningPhilosophers), "Philosopher-" + i);
	            threads[i].start();
	        }
	    }

	  
	  //1.  like one table and 5 person and 5 forks only 
	  //2.  5 person siting on the table and and get 5 forks but  each person need two fork left and right.
	  //3.   but its gives only one fork assume left fork and need to get right fork then all person waiting for right look .
	  //4 . now this waiting is called deadlock condition.
	  
	  
	  //Solve:-
	  
	  //Arrange 5 fork like left and write forks 
	  //now solve this problem only one person setting on the table and get two forks write and left
	  //How :- 
}
