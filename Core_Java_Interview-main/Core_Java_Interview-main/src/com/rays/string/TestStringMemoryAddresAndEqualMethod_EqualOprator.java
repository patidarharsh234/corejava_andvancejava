package com.rays.string;

public class TestStringMemoryAddresAndEqualMethod_EqualOprator {
	public static void main(String[] args) {
		
	
	String s="harsh"; //store the value in string Literal poll memory.
	String s2="harsh";//its take memory references note the value so value are same then indicate same memory address.
	System.out.println(s.equals(s2));
	System.out.println(s==s2);//check the memory references note the character and see  they are equal or note
	
	
	String s3=new String("Harsh");//value store inside heap memory area. 
	String s4=new String("Harsh");
	String s5=new String("Yash");
	System.out.println(s3.equals(s4));//compares the character note the references only string note working our making class.
	System.out.println(s3==s4);//check the memory references note the character and see  they are equal or note
	System.out.println(s3.equals(s5));
			
	}

}
