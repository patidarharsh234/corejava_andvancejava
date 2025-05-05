package oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri;

public class CircleP extends ShapeP{
	private double radius;
	public static final double p= 3.141;
	
	public void setRedius(double R) {
		radius=R;
	}
	public double getRedius() {
		return radius;
	}
	
	public double Area() {
	double Area=p*(radius*radius);
	System.out.println(Area);
	return Area;
	}

}
