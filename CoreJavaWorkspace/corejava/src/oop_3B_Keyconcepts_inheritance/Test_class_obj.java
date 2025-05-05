package oop_3B_Keyconcepts_inheritance;

public class Test_class_obj {
	public static void main(String[] args) {
		Shape s1= new Shape();
		s1.setBorderWidth(10);
		s1.setColour("red");
		s1.getBorderWidth();
		s1.getColour();
		System.out.println(s1.getBorderWidth());
		System.out.println(s1.getColour());
		
		
		
		Circle c= new Circle();
		c.setRedius(10);
		c.setBorderWidth(12);
		c.Area(); 
		
		
		c.setColour("blue"); // child called to parent methods
		c.Ar();        //form the child object(Shape Method)

		
		Rectangale_chi R= new Rectangale_chi();
		R.setLength(40);
		R.setWidth(15);
		R.Area();
		
		
		
		
	}

}
