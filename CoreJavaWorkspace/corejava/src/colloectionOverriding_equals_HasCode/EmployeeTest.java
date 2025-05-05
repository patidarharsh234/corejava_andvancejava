package colloectionOverriding_equals_HasCode;


public class EmployeeTest {
	public static void main(String[] args) {
		Employee e=new Employee(2,"harsh",2000);
		Employee e2=new Employee(1,"harsh",2000);
		Employee e3=new Employee(3,"sanjay",2000);
		Employee e4=new Employee(3,"sourav",2000);
		  
  Marksheet M=new Marksheet();
		
		System.out.println(e2.equals(M));
		System.out.println(e2.equals(e4));
//		
//		System.out.println(e2.equals(e));
//		
		System.out.println(e.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(e3.hashCode());
//		System.out.println(e4.hashCode());
		
		
		
	}

}
