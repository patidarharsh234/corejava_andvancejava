package oop_3D_Abstract;

public abstract class Shape2_Child extends ShapeAparent {
    private int base=0;
    private int hight=0;
    
    public Shape2_Child() {
    	
    }
    
    public Shape2_Child(int bs,int hi) {
    	base = bs;
    	hight = hi;
    }
    public int getBase() {
   	 return base;
    }
   
    public int getHight() {
   	 return hight;
    }

}
