package oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri;

import oop_3C_polymor_methodArgument_ArrayMethodOverri.MethodArgument_shapeArgument;

public class Testclass {
	public static void main(String[] args) {
		
	
    ShapeP s[]= new ShapeP[3];
	s[0]= new RectangleP();              //Arrays
	s[1]=new CircleP();
	s[2]= new TriangleP();
	
	RectangleP R= (RectangleP) s[0];
	CircleP c=(CircleP)s[1];                  //type casting
	TriangleP t=(TriangleP)s[2];
    
	R.setLength(10);
	R.setWidth(20);
	                                           //set values
	c.setRedius(20);
	

	t.setBase(5);
	t.setHight(2);
	                                      
	                                      //operate method
	double totalArea=MethodArgument_shapeArgument.calcArea(s); //class ke bahr operate kar ra
	System.out.println(totalArea);                             //es liye class ka name likhna pada
		
	
	
	
	
	
	
	}

}

