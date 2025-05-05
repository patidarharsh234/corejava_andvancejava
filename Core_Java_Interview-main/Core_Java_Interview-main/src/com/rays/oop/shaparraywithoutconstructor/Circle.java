package com.rays.oop.shaparraywithoutconstructor;

public class Circle extends Shape {
	
	private double  radius;
	private  final double PI=3.14;
	
	
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() {
		return PI*radius*radius;
	}

}
