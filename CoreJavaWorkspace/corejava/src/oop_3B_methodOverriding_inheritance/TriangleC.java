package oop_3B_methodOverriding_inheritance;

public class TriangleC extends ShapeC{
	private int base=0;
	private int hight=0;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public double Area(){
		int Area=base*hight/2;
		System.out.println("Area=" +Area);
		return 0;
	}

}
