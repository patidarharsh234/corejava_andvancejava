package in.co.rays.prepared1B.MarksheetDynamic;

public class MarksheetBean {
	private int Id;
	private String name;
	private int rollno;
    private int phy;
    private int che;
    private int math;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

}
