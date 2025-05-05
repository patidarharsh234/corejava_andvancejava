package oop_3B_Keyconcepts_inheritance;

public class Circle extends Shape{
	private double radius;
	public static final double p= 3.141;
	
	public void setRedius(double R) {
		radius=R;
	}
	public double getRedius() {
		return radius;
	}
	
	public void Area() {
	double Area=p*(radius*radius);
	System.out.println(Area);
	}

}
