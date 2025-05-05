package com.rays.thread;

public class C_Philosopher implements Runnable {
	private final int id;
    private final C_DeadlockDiningPhilosophers diningPhilosophers;

    public C_Philosopher(int id, C_DeadlockDiningPhilosophers diningPhilosophers) {
        this.id = id;
        this.diningPhilosophers = diningPhilosophers;
    }

    @Override
    public void run() {
        try {
            while (true) {
                diningPhilosophers.think(id); // Philosopher is thinking
                diningPhilosophers.pickUpForks(id); // Philosopher tries to pick up forks
                diningPhilosophers.eat(id); // Philosopher eats
                diningPhilosophers.putDownForks(id); // Philosopher puts down forks
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Philosopher " + id + " was interrupted.");
        }
    }
}