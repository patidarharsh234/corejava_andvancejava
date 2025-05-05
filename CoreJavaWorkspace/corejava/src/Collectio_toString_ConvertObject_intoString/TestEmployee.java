package Collectio_toString_ConvertObject_intoString;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		
		//set ki value with the help of seter Methode.
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("harsh2");
		e1.setSalary(2000);
		System.out.println(e1);//print directly object
		
		//set the value with the help of counstructore.
		Employee e2=new Employee(1,"harsh",20000);
		Employee e3=new Employee(3,"sourabh",3000);
		Employee e4=new Employee(4,"sanjay",4000);
		Employee e5=new Employee(5,"rahul",60000);
		
		ArrayList l=new ArrayList();
		l.add(e1);
		l.add(e2);     //directly object ko add kiya
		l.add(e3);     //or inki value print karane ke liye
		l.add(e4);     //tostring ka use kiya
		l.add(e5);
	//	System.out.println(l);
		
		
		
//itereator loop se value bhar nikali toString-override method ki help se
	   Iterator its=l.iterator();
		  while (its.hasNext()) {
			Object obj = its.next();
			System.out.println(obj);
			}
		  }
		
			
		
//bina toString override method se//type casting
	
//		Iterator its=l.iterator();
//		 while (its.hasNext()) {	
//	Employee e=(Employee)its.next();
//	
//	System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//		 }
//	}

}
