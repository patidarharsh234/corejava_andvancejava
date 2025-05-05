package oop_3B_Keyconcepts_inheritance;

public class Rectangale_chi extends Shape {
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
     public int Area() {
    	int Area=length*width;
    	System.out.println(Area);
    	return 0;
     }
}
