package opp_3A_Condition;

public class ShapeTest_obj {

	public static void main(String[] args) {
		
	
	
	Shape_Test s= new Shape_Test();
	s.setColour("red");
	s.getColour();
	System.out.println(s.getColour());
    s.setBorderWidth(100);
    s.getBorderWidth();
    System.out.println(s.getBorderWidth());
    s.setColour("hyy");
    s.getColour();
    System.out.println(s.getColour());
	
}
}