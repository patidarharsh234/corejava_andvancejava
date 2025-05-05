package oop_3Cr_polymor_consTructorMetohedOverr_Array;

public class ShapeP {	
private String colour=null;
private int borderwidth=0;

public ShapeP() {
	
}

public ShapeP(String s,int bo) {
	colour = s;
	borderwidth = bo;
	
}
public String getColour() {
	return colour;
}

public int getBorderwidth() {
	return borderwidth;
}


public double Area() {
	System.out.println("r Area");
	return 0;
}

}

