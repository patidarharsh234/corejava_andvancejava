package in.co.rays.jdbc1A.PrepeardStatment.type2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.co.rays.jdbcDatasource.Class.fix.connectionmethods.JdbcDataSource;

public class PreparedStat{
	public static void main(String[] args) throws Exception {
	    //testAdd();
		//testParametrAdd(7,"nidhi",107,65,78,45);
		testSerch();
		
		
	}

	private static void testSerch() throws Exception {
		Connection conn=JdbcDataSource.getConnection();
		 System.out.println("connection established");
		PreparedStatement ps=conn.prepareCall("select * from marksheet");
		 ResultSet rs=  ps.executeQuery();
		 
		 
		 System.out.println("Id"+"\t"+"name "+"rollno"+"\t"+"phy"+"\t"+"che"+"\t"+"maths");
		 while(rs.next()) {
		 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6));
		 }
		 }
	
	

	private static void testParametrAdd(int Id,String name,int roll,int phy,int che,int mat) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","root");
		 PreparedStatement ps= conn.prepareCall("insert into marksheet values(?,?,?,?,?,?)");
		 
		  ps.setInt(1,Id);
		  ps.setString(2, name);
		  ps.setInt(3, roll);
		  ps.setInt(4, phy);
		  ps.setInt(5, che);
		  ps.setInt(6, mat);
		  
		  int i= ps.executeUpdate();
		  System.out.println("insert="+i);
		 
		
	}

	private static void testAdd() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation", "root", "root");
	       PreparedStatement ps=  conn.prepareCall("insert into marksheet values(?,?,?,?,?,?)");
	       
	       
	       ps.setInt(1, 6);
	       ps.setString(2,"harsh");
	       ps.setInt(3, 106);
	       ps.setInt(4, 96);
	       ps.setInt(5, 95);
	       ps.setInt(6, 86);
	       
	       int i=ps.executeUpdate();
	       System.out.println("insert="+i);
	         
		
		
	}
	

}
