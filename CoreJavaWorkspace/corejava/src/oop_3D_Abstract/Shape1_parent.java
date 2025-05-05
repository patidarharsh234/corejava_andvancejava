package oop_3D_Abstract;

public abstract class Shape1_parent {
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
	
	public abstract double Area();
	}
	
