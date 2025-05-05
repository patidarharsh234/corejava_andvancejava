package java8;

public  interface DefaultAndStatic {
	public default  void sum() { 
		System.out.println("default method..!!");
	}
	
	public static void multi() {
		System.out.println("static method..!!");
	}
	public default  void from() { 
		System.out.println("from method..!!");
	}

}
