package colloectionOverriding_equals_HasCode;

public class Marksheet {
	private int rollno;
	private String name;
	private int physics;
	private int chaemitry;
	private int maths;
	
	public Marksheet() {
		System.out.println("ooho defaulter*");
		}
	
	public Marksheet(String name) {
		this.name=name;
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
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

}
