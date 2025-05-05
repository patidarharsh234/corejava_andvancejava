package oop_3Cr_polymor_consTructorMetohedOverr_Array;

public class TriangleP extends ShapeP {
    private int base=0;
    private int hight=0;
    
    public TriangleP() {
    	
    }
    
    public TriangleP(int bs,int hi) {
    	base = bs;
    	hight = hi;
    }
    public int getBase() {
   	 return base;
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
