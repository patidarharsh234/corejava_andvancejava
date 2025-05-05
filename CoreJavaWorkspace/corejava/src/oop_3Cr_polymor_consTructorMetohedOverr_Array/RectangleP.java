package oop_3Cr_polymor_consTructorMetohedOverr_Array;

public class RectangleP extends ShapeP {
    private int length= 0;
    private int width=0;
    
   public RectangleP() {
	   
   }
    
   public RectangleP(int le,int wi) {
	   length = le;
	   width = wi;
   }
    public int getLength() {
   	 return length;
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
