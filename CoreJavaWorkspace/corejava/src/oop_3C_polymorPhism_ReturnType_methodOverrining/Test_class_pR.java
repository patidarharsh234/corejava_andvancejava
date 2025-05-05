package oop_3C_polymorPhism_ReturnType_methodOverrining;

public class Test_class_pR {
	
	public static void main(String[] args) {
	ShapeP s=new ShapeP();	
		
	ShapeP s1= (ShapeP)ShapeP.getShapeP(1);  //return type shape he method ka 
    RectangleP r = (RectangleP)s1;           //type-casting-shapeClass me
                                             //with the help of Static(ShapeP.getShapeP)
    
    r.setLength(10);
    r.setWidth(20);
    r.Area();
    
    CircleP c =(CircleP)s.getShapeP(2);          //object bana kr
   
    c.setRedius(10);
    c.Area();
    
    TriangleP t = (TriangleP) ShapeP.getShapeP(3);  //Static help se directly
                                                    //class ke name se method calling and type-casting
    t.setBase(18);
    t.setHight(10);
    t.Area();
    
    
    
    
	}
}
