package com.rays.extraclassknolageMy;

public class Z_StringBufferThreadSafe {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
 
    
        // Create two threads that modify the StringBuffer
        Thread thread1 = new Thread(() -> {
            synchronized(buffer) {
                for (int i = 0; i < 5; i++) {
                    buffer.append("A");
                    System.out.println("Thread 1: " + buffer);
                    try {
                        Thread.sleep(100); // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
           synchronized(buffer) {
                for (int i = 0; i < 5; i++) {
                    buffer.append("B");
                    System.out.println("Thread 2: " + buffer);
                    try {
                        Thread.sleep(100); // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
           }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        
        
       
    }

	}
