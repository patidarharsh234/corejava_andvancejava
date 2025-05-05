package concurrency_extendsThreads_7B;

public class HelloThread extends Thread{
	
	String name=null;
	public HelloThread(String n) {
		this.name=n;
	}
	
	public void run() {
		for(int i=0;i<=20;i++) {
		System.out.println(i+""+name);	
		}
	}
	

}
