package concurrency_RunnableInterfaceimplmentinClass_7D;


public class ThreadRunnableTest {
	public static void main(String[] args) {
		Thread t=new Thread(new ThreadRunnableImpli("harsh"));  //eski help se thread ki methods
		Thread t1=new Thread (new ThreadRunnableImpli("sourbh")); //ka use kiya 
		
		
		t.start();
		t1.start();
		
		for(int i=0;i<=20;i++) {
			System.out.println(i+ "main");
		}
		
	}

}
