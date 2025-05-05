package oop_3B_methodOverriding_inheritance;

public class CircleC extends ShapeC {
	private int radius=0;
	public final double p=3.141;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getRedius() {
		return radius;
	}
	public double Area() {
		double Area=p*(radius*radius);
		System.out.println(Area);
		return 0;
	}

}
