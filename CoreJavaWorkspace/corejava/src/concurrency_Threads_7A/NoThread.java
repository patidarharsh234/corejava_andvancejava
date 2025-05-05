package concurrency_Threads_7A;

public class NoThread {
	String name=null;
	
	
	public NoThread(String n) {
		name=n;
	}
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i+ "  "+name);
		}
	}

}
