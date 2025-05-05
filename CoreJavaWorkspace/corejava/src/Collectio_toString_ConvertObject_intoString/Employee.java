package Collectio_toString_ConvertObject_intoString;


public class Employee {
	private int id;
	private String name;
	private int Salary;
	 public Employee() {
		 System.out.println("defauter");
	 }
	 public Employee(int id,String name, int salary) {
		 this.id=id;
		 this.name=name;
		 this.Salary=salary;
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	 @Override
	public String toString() {
		String str=id+"  "+name+"  "+Salary;
		return str;
	}
	
	

}
