package oop_3G_callParentConstructor;

public class Employee extends Person{
	private String designation=null;
	
	public Employee() {
		System.out.println("default constructor");
	}
   public Employee(String fn,String ln,String des) {
	   super(fn,ln);
	   designation=des;
	   System.out.println("3 param constructor child");
	   
	   
   }
}
