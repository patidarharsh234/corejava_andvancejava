package com.rays.oop.shape_Array_Constructor;

public class TestShape {
	public static void main(String[] args) {
	//my	Shape[] s = {new Circle(10),new Rectangle(10, 5)};
		//OR
		Shape[] s =new Shape[2];
		s[0]=new Circle(10);
		s[1]=new  Rectangle(10, 5);
		

		System.out.println(s[0].area());
		System.out.println(s[1].area());

		//Runtime decide .
		 double a = Area(s);
		 System.out.println(a);
	}

	private static double Area(Shape[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea  +=  s[i].area();
		}

		
		return totalArea;

	}
}