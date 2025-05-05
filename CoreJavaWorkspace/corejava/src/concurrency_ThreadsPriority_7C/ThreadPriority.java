package concurrency_ThreadsPriority_7C;

public class ThreadPriority extends Thread{
	
	String name=null;
	public ThreadPriority(String n) {
		this.name=n;
	}
	
	public void run() {
		for(int i=0;i<=20;i++) {
		System.out.println(i+""+name);	
		}
	}
	

}
