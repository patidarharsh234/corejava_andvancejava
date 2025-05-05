package oop_3B_methodOverriding_inheritance;

public class Test_Class {
	public static void main(String[] args) {
		
		ShapeC s= new ShapeC();
		s.Area();
		
		
		//RectangleC r1=new RectangleC();
		
		
		
      ShapeC s1= new RectangleC();//yaha parent(method)aa ri he but call child method  ho ri.
	    s1.setBorderwidth(2);
		s1.setColour("red");
		s1.Area();            //run child method
		
		
		ShapeC s2= new RectangleC();      //type casting
		RectangleC r=  (RectangleC)s2;   //type casting
		r.setBorderwidth(30);
		r.setColour("red");
		r.setLength(20);
		r.setWidth(20);
		r.Area();                      //abhi puri trh se chid ki method call ho ri
		
		ShapeC s3=new CircleC();
		CircleC C=(CircleC)s3;
		C.setRadius(30);
		C.Area();
		
		CircleC s4=new CircleC();//es object sirf child ki area                       //Area method aa ri
		                         //parent ki nhi aa ri only for override method
	
		
		
		
		
		
		
		
		
		
	}

}
