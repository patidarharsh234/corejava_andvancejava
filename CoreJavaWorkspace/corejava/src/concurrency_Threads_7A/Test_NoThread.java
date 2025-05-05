package concurrency_Threads_7A;

public class Test_NoThread {
	public static void main(String[] args) {
		
		NoThread n1=new NoThread("harsh");
		NoThread n2=new NoThread("sourabh");
		n1.run();
		n2.run();
	}

}
