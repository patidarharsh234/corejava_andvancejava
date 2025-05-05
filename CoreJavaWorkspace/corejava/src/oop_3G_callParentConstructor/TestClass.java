package oop_3G_callParentConstructor;

public class TestClass {
	public static void main(String[] args) {
		
	
    Employee e= new Employee("bhole","baba","r");
    e.getFirstName();
    e.getLastName();
    System.out.println(e.getFirstName());
    System.out.println( e.getLastName());
    
}
}