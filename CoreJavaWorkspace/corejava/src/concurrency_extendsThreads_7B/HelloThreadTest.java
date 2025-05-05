package concurrency_extendsThreads_7B;

public class HelloThreadTest {
	public static void main(String[] args) {
		HelloThread t=new HelloThread("harsh");
		HelloThread t1=new HelloThread("sourabh");
		
		t.start();
		t1.start();
		
		for(int i=0;i<=20;i++) {
			System.out.println(i+ "main");
		}
		
	}

}
