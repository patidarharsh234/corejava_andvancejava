package oop_3E_interface;

public class Businessman extends Person implements Richman,SocialWorker {
	
	/*private String name;
	private String address;*/

	@Override
	public void helpToOthers() {
		System.out.println("me har kisi ke fande me tang aadaunga");
		
	}

	@Override
	public void earnMony() {
	 System.out.println("i am earnmony more then more");
		
	}

	@Override
	public void donation() {
		System.out.println("i am donat my mony for oldaghome");
		
	}

	@Override
	public void party() {
	System.out.println("wow i am going to party");
		
	}
	
	public void name() {
		System.out.println("harsh");
	}
	
	public void address() {
		System.out.println("bholaram");
	}
	

}
