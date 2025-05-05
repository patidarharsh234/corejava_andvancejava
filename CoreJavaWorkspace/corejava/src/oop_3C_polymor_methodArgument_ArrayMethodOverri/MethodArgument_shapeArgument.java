package oop_3C_polymor_methodArgument_ArrayMethodOverri;

import oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri.CircleP;
import oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri.RectangleP;
import oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri.ShapeP;
import oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri.TriangleP;

public class MethodArgument_shapeArgument {
	public static void main(String[] args) {
	    ShapeP [] s= new ShapeP[3];         //operate method
		s[0]= new RectangleP();
		s[1]=new CircleP();
		s[2]= new TriangleP();
		          
		                //values set 
		
		double totalArea=calcArea(s);  //class ki class me operate kar re method ko
		System.out.println(totalArea); //class ka name nahi laga
	}
	public static double calcArea(ShapeP[]s) {    //method
		double totalArea=0;
	  for(int i=0;i<s.length;i++) {
		  totalArea +=s[i].Area();
	  }
	  return totalArea;
	}

}
