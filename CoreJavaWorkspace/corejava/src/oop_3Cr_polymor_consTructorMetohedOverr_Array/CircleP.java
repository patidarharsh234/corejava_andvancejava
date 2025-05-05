package oop_3Cr_polymor_consTructorMetohedOverr_Array;

public class CircleP extends ShapeP{
	private double radius;
	public static final double p= 3.141;
	
	public CircleP() {
		
	}
	
	public CircleP(double ra) {
		radius = ra;
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
