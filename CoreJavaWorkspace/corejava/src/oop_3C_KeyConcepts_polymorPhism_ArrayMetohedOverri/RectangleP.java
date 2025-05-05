package oop_3C_KeyConcepts_polymorPhism_ArrayMetohedOverri;

public class RectangleP extends ShapeP {
    private int length= 0;
    private int width=0;
    
    public void setLength(int len) {
   	 length=len;
    }
    
    public int getLength() {
   	 return length;
    }
    
    public void setWidth(int wid) {
   	 width=wid;
    }
    public int getWidth() {
   	 return width;
    }
    public double Area() {
   	int Area=length*width;
   	System.out.println(Area);
   	return Area;
    }

}
