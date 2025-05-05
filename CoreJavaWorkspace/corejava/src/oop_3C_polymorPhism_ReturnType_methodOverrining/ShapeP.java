package oop_3C_polymorPhism_ReturnType_methodOverrining;

public class ShapeP {	
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

public double Area() {
	System.out.println("r Area");
	return 0;
}


public static ShapeP getShapeP(int i) {
	if(i==1) {return new RectangleP();}
		
	
	if(i==2) {return new CircleP();}
		
	
	if(i==3) {return new TriangleP();}
		
	    return null;
}

}
