package concurrency_Threads_Block_Sleep_Daemon__7E;


public class ThreadRunnableDomeTest {
	public static void main(String[] args) throws Exception {
		Thread t=new Thread(new ThreadRunnableIDome("harsh"));
		
		t.setDaemon(true);
		t.start();
		
		for(int i=0;i<=50;i++) {
			Thread.sleep(1000);
			System.out.println(i+ "main");
		}
		
	}

}
