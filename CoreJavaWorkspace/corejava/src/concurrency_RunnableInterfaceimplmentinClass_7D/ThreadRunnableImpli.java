package concurrency_RunnableInterfaceimplmentinClass_7D;

public class ThreadRunnableImpli implements Runnable{
	
	String name=null;
	public ThreadRunnableImpli(String n) {
		this.name=n;
	}
	
	public void run() {
	for(int i=0;i<=20;i++) {
	System.out.println(i+""+name);	
	}
	}
	

}
