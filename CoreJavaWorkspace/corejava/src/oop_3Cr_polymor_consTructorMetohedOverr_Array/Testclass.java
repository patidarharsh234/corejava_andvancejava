package oop_3Cr_polymor_consTructorMetohedOverr_Array;

public class Testclass {
	public static void main(String[] args) {
		
		ShapeP[] s = new ShapeP[3];
		
		s[0] = new RectangleP(20,20);
		s[1] = new CircleP(10);
		s[2] = new TriangleP(15,40);
		
		
		
		for(int i = 0; i<s.length; i++) {
			s[i].Area();
		}
		
	}
}
