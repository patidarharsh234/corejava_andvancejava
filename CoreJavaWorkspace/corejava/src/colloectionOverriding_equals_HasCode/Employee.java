package colloectionOverriding_equals_HasCode;

public class Employee {
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub   //ak se jyada equal method override kr sakte he
		return super.equals(obj);
	}


	private int id;
	private String name;
	private int Salary;
	 public Employee () {
		 System.out.println("defauter");
	 }
	 public Employee (int id,String name, int salary) {
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
	
	
	//All elements check
	public boolean equals(Employee obj) {
		if(!(obj instanceof Employee)) {
			return false;}
		if (this.name==obj.name&&this.id==obj.id&&this.Salary==obj.Salary) {
           return true;
			
		}
	return false;
	}
	
	
//Single name compare	
//	public boolean equals(Employee obj) {
//		if (this.name==obj.name) { 
//			return true;
//			
//		}
//	return false;
//	}
	
	
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}


}




//public boolean equals(Object obj) {
//if(obj==null) return false;
//if(!(obj instanceof Employee)) return false;
//Employee e = (Employee) obj;
//return this.getName().equals(e.getName());
//}
