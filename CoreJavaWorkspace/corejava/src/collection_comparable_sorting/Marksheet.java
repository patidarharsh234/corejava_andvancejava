package collection_comparable_sorting;

public class Marksheet implements Comparable<Marksheet>{
		private String rollno;
		private String name;
		private int physics;
		private int chaemitry;
		private int maths;
		
		public Marksheet() {
			System.out.println("ooho defaulter*");
			}
		
		public Marksheet(String name ,String rollno) {
			this.name=name;
			this.rollno=rollno;
		}
		
		
		
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPhysics() {
			return physics;
		}
		public void setPhysics(int physics) {
			this.physics = physics;
		}
		public int getChaemitry() {
			return chaemitry;
		}
		public void setChaemitry(int chaemitry) {
			this.chaemitry = chaemitry;
		}
		public int getMaths() {
			return maths;
		}
		public void setMaths(int maths) {
			this.maths = maths;
		
	}

		@Override
		public String toString() {
			String str=name+" "+rollno;
			return str;
		}

		
		
		@Override
		public int compareTo(Marksheet obj) {
			if(this.rollno==obj.rollno) {
				return this.name.compareTo(obj.name);
			}else {
		
			return this.rollno.compareTo(obj.rollno);
		}
		
		
	
		
		
		
		
		


		}
}

