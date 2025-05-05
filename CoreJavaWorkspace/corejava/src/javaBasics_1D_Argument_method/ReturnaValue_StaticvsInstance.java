package javaBasics_1D_Argument_method;

public class ReturnaValue_StaticvsInstance {

//	public static void main(String[] args) {              // whith static
//	 ReturnaValue_StaticvsInstance.getDivision(10,20);
	
	public static void main(String[]args) {
		
		
		ReturnaValue_StaticvsInstance obj_add= new ReturnaValue_StaticvsInstance();   //whithout static then creat obj
		obj_add.getDivision(30, 10);
		
		     

	}
	public  double getDivision(int a,int b) {
                   double c=a/b;
                   System.out.println(c);
                   return c;}
}
