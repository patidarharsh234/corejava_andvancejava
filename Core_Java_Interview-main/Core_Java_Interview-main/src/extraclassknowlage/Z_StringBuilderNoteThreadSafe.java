package extraclassknowlage;

public class Z_StringBuilderNoteThreadSafe {
	public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");

        // Create two threads that modify the StringBuilder
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                builder.append("A");
                System.out.println("Thread 1: " + builder);
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                builder.append("B");
                System.out.println("Thread 2: " + builder);
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }

}
