package oop_3B_Keyconcepts_inheritance;

public class Triangle extends Shape {
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
     public int Area() {
    	 int Area=(hight*base)/2;
    	 System.out.println(Area);
    	 return 0;
     }
}
