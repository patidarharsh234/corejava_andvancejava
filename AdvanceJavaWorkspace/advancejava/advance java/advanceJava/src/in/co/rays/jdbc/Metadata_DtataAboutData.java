package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class Metadata_DtataAboutData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root", "root");
	Statement st= conn.createStatement();
	ResultSet rs= st.executeQuery("select * from marksheet");
	
	
	ResultSetMetaData rsmt=rs.getMetaData();
	
	System.out.println("catelog Name:" +rsmt.getCatalogName(1));//database name 
	System.out.println("table Name:" +rsmt.getTableName(1)); //table name
	
	int columncount = rsmt.getColumnCount();
	System.out.println("total columns:" +columncount); //Columns no
	
	for(int i=1; i<=columncount;i++){
		System.out.println("column:"+(i));
		System.out.println("Label:"+ rsmt.getColumnLabel(i));
		System.out.println("Name:" +rsmt.getColumnName(i));
		System.out.println("Type:" +rsmt.getColumnTypeName(i));
		System.out.println("Size:" +rsmt.getColumnDisplaySize(i));
		System.out.println();
		
	}
	
		
	}

}
