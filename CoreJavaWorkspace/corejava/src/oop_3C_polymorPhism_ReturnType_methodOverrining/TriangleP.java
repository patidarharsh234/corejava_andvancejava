package oop_3C_polymorPhism_ReturnType_methodOverrining;

public class TriangleP extends ShapeP {
    private int base=0;
    private int hight=0;
    
    public void setBase(int bas) {
   	 base=bas;
   	 }
    public int getBase() {
   	 return base;
    }
    public void setHight(int hig) {
   	 hight=hig;
    }
    public int getHight() {
   	 return hight;
    }
    public double Area() {
   	 int Area=(hight*base)/2;
   	 System.out.println(Area);
   	 return Area;
    }

}
