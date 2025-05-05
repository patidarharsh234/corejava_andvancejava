package opp_3A_Condition;

import java.util.Date;

public class Constructor_parea_Overlo {
	
		private String name=null;     
		public Date dob=null;
		public String address=null;
		public int mobileno=0;
		public static int AVG_AGE=18;
		
		
		public Constructor_parea_Overlo() {
			System.out.println("defaoult constructer");
		}
		
		
		public Constructor_parea_Overlo(String nm) {      //constructor overloading
			name=nm;
		}
		
		public Constructor_parea_Overlo(String nam,int age,int mob,String add) {
			address=add;
			mobileno=mob;
			name=nam;
			AVG_AGE= age;
		}
		//public Constructor(String nam){}  seam constructor not aloud
		public Constructor_parea_Overlo(int mobile,String nam,String add) {
			name=nam;
			address=add;
			mobileno=mobile;
		}
		
		
		
		public Constructor_parea_Overlo(String nam,int ag,String add,String ad,String nm) {
			name=nam;
			AVG_AGE=ag;
			address=add;
			name=nm;
			address=ad; 
			}
			public Constructor_parea_Overlo(String nam,String add,String ad,int ag,String nm) {
			
			name=nam;
			address=add;
			address=ad;
			AVG_AGE=ag;
			name=nm;
		
		}
			public String getName() {
				return name;
			}
			public Date getDob() {
				return dob;
			}
			public String getAddress() {
				return address;
			}
			public  int getAVG_AGE() {
				return AVG_AGE;
			}
			public int getMobileno() {
				return mobileno;
			}
		
		
		
		
	/*	public void setName(String nm) {
			this.name=nm;
		}

		public void setDob(Date dob) {
			this.dob=dob;}
		    
		    

		public void setAddress(String add) {
			this.address=add;}

*/
		
		
			
		}
		
