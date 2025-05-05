package oop_3B_methodOverriding_inheritance;

public class RectangleC extends ShapeC{
	private int length=0;
	private int width=0;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double Area() {
		int Area=length*width;
		System.out.println("Area=" +Area);
		return 0;
		
	}


}
