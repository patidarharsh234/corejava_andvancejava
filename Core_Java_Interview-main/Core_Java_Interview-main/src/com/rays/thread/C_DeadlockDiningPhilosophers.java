package com.rays.thread;

import java.util.concurrent.Semaphore;

//write a program to solve the dining philosophers problem:-
public class C_DeadlockDiningPhilosophers {

    // Array of semaphores representing forks
    private final Semaphore[] forks;
    // Semaphore to limit philosophers to avoid deadlock
    private final Semaphore table;

    public C_DeadlockDiningPhilosophers(int numPhilosophers) {
        forks = new Semaphore[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Semaphore(1); // Each fork can be held by one philosopher
        }
        table = new Semaphore(numPhilosophers - 1); // Allow at most N-1 philosophers at the table
    }

    public void pickUpForks(int philosopher) throws InterruptedException {
        table.acquire(); // Limit number of philosophers at the table
        forks[philosopher].acquire(); // Pick up left fork
        forks[(philosopher + 1) % forks.length].acquire(); // Pick up right fork
    }

    public void putDownForks(int philosopher) {
        forks[philosopher].release(); // Put down left fork
        forks[(philosopher + 1) % forks.length].release(); // Put down right fork
        table.release(); // Philosopher leaves the table
    }

    public void eat(int philosopher) throws InterruptedException {
        System.out.println("Philosopher " + philosopher + " is eating.");
        Thread.sleep((int) (Math.random() * 1000)); // Simulate eating time
    }

    public void think(int philosopher) throws InterruptedException {
        System.out.println("Philosopher " + philosopher + " is thinking.");
        Thread.sleep((int) (Math.random() * 1000)); // Simulate thinking time
    }
}
