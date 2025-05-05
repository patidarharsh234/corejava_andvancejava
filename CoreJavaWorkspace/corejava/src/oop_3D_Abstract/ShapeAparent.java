package oop_3D_Abstract;

public abstract class ShapeAparent {  //class abstract and usme 
	private String colour=null;  //method abrtract na ho to chalega
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
	
	public abstract double Area();  //abstract method ho to 
	}                               //class ko abstract krta must needed
	
