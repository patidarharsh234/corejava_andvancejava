package concurrency_ThreadsPriority_7C;

public class ThreadPriorityTest {
	public static void main(String[] args) {
		ThreadPriority t=new ThreadPriority("harsh");
		ThreadPriority t1=new ThreadPriority("sourabh");
		
		t.start();
		t.setPriority(10);  // kam priority
		t1.start();
		t1.setPriority(1);  //jyada priority
		
		for(int i=0;i<=20;i++) {
			System.out.println(i+ "main");
		}
		
	}

}
