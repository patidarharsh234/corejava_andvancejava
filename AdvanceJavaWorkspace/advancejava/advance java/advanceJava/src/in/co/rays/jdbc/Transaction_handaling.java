package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction_handaling {
	public static void main(String[] args) throws Exception {
		
		testTransaction();
		}

	public static void testTransaction() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","root");
	     conn.setAutoCommit(false); // ye es lie ki data ya to pura jaye ya jaye hi nhi
	     Statement st= conn.createStatement();
	     
	     try {
			
	     int i= st.executeUpdate("insert into marksheet values(18,'abc',115,15,34,56)");
	      i=st.executeUpdate("insert into marksheet values(19,'def',116,34,45,45)");
	      i=st.executeUpdate("insert into marksheet values(20,'def',117,34,45,56)");// duplicate 20 pr aara he to
	      i=st.executeUpdate("insert into marksheet values(20,'def',117,34,45,56)");//20 sirf enter nhi hota
	                           //but yha sari values add nhi ho Autocommit se
	      
	      System.out.println("insert="+i); 
	      conn.commit();
	      
	     }catch (SQLException e) {
				conn.rollback();
			}
		
	}

}
