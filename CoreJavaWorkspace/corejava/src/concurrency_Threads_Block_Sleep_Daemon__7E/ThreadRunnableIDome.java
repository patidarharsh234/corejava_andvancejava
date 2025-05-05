package concurrency_Threads_Block_Sleep_Daemon__7E;

public class ThreadRunnableIDome implements Runnable{
	
	String name=null;
	public ThreadRunnableIDome(String n) {
		this.name=n;
	}
	
	public void run() {
		try {
			
			for(int i=0;i<=20;i++) {
				Thread.sleep(400);
				System.out.println(i+""+name);	
				}
		} catch (InterruptedException e) {
	
			e.printStackTrace();
			}
		}
	}

