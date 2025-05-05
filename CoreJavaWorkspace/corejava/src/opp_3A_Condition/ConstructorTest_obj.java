package opp_3A_Condition;

public class ConstructorTest_obj {
	public static void main(String[] args) {
		Constructor_parea_Overlo con= new Constructor_parea_Overlo("harsh",27,"thikri m.p","patidar","bholaram");//instance obj
		con.getAddress();	
		System.out.println(con.getAddress());
		con.getAVG_AGE();
		System.out.println(con.getAVG_AGE());
		con.getMobileno();
		System.out.println(con.getMobileno());
		con.getName();
		System.out.println(con.getName());
		
		Constructor_parea_Overlo con1= new Constructor_parea_Overlo("harsh",26,774796707,"addres"); 
		con1.getName();
		System.out.println(con1.getName());
		con1.getAVG_AGE();
		System.out.println(con1.getAVG_AGE());
		con1.getMobileno();
		System.out.println(con1.getMobileno());
		//con1.getAddress();
		//System.out.println(con1.getAddress());
		System.out.println(con1.address);
		
		
		Constructor_parea_Overlo con2= new Constructor_parea_Overlo("harsh");
		con2.getName();
		System.out.println(con2.getName());
		}
	
	
          

}
