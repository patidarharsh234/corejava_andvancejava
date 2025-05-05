package oop_3B_methodOverriding_inheritance;

public class ShapeC {
	private String colour=null;
	private int borderwidth=0;
	
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	public double Area() {              //it is override method
		System.out.println("r Area");   //override method return type seam
		return  0;
	}
	public double Are() {                   //it can not  override method
		System.out.println("hello");
		return 0;
	}
	


}
