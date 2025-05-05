package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Stored_Procedure_getListWithFuction {
	public static void main(String[] args) throws Exception {
		//USE ResultSet rs=call.getResultSet(); When Get Full list.

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceinterview", "root", "root");

		CallableStatement call = conn.prepareCall("{Call getstoredprocedurelistWithFunction() }");
		

		call.execute();

		ResultSet rs=call.getResultSet();
		
	
		
		while(rs.next()) {
			
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getInt("sallary"));
			System.out.print("\t"+rs.getString(4));//This is function use inside stored procedure.
			System.out.println("");
		}
		
	}

}
