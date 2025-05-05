package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class StatmentSt {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testsearch();
		//testmarge();
		testouter();
		
		
	}

	private static void testouter() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employ_department","root","root");
		Statement st= conn.createStatement();
		ResultSet rs= st.executeQuery("select * from empl");
		System.out.println("id"+"\t"+"name"+"\t"+"salary"+"\t"+"dep_id"+"\t");
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getInt(3));
			System.out.println("\t"+rs.getInt(4));
		}
		
		
	}

	private static void testmarge() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ_department", "root", "root");
	       Statement st= conn.createStatement();
	       ResultSet rs=st.executeQuery("select * from empl");
	       
	       System.out.println("id"+"\t"+"name"+"\t"+"salary"+"\t"+"dep_id"+"\t");
	       
	       while(rs.next()) {
	    	   System.out.print(rs.getInt(1));
	    	   System.out.print("\t"+rs.getString(2));
	    	   System.out.print("\t"+rs.getInt(3));
	    	   System.out.println("\t"+rs.getInt(4));
	       }
		
		
	}

	private static void testsearch() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","root");
		Statement st=conn.createStatement();
		
	      ResultSet rs=  st.executeQuery("select * from college");
		
		  System.out.println("Id"+"\t"+"name");
		  
		  while (rs.next()) {
			  System.out.println(rs.getInt(1));
		  System.out.print("\t" +rs.getString(2));
	}
	
	}
	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root", "root");
		Statement st=conn.createStatement();
		int i= st.executeUpdate("update college set id=5 where id=4");
		System.out.println(("insert="+i));
		
	}

	private static void testAdd()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","root");
      	Statement st=conn.createStatement();
      	int i=st.executeUpdate("insert into college values(4,'hollcear colleg')");
      	System.out.println("insert="+i);
	}


}
