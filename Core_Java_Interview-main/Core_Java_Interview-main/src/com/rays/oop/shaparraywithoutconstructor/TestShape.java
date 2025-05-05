package com.rays.oop.shaparraywithoutconstructor;

public class TestShape {

	public static void main(String[] args) {
		Shape[] s = new Shape[2];

		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		Rectangle r = (Rectangle) s[1];
		
		c.setRadius(10);
		
		r.setLength(10);
		r.setWidth(20);

		System.out.println(s[0].area());
		System.out.println(s[1].area());
		
		double a=Area(s);
		System.out.println(a);

	}

	private static  double Area(Shape[] s) {
		
     	double	totaleArea=0;
     	
     	for(int i=0;i<s.length;i++) {
     		totaleArea+=s[i].area();     	}
		return totaleArea;
	}

}
