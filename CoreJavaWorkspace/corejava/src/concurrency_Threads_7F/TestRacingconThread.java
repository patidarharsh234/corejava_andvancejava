package concurrency_Threads_7F;

public class TestRacingconThread {
	public static void main(String[] args) {
		RacingCondThread t=new RacingCondThread("harsh");
		RacingCondThread t1=new RacingCondThread("sanjay");
		
		//RacingCondThread t = new RacingCondThread("Harsh",200);
		//RacingCondThread t1 = new RacingCondThread("sanjay",300);
		t.start();
		t1.start();

	}

}
